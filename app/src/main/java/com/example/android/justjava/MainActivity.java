package com.example.android.justjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int numberOfCoffees = 1;
    private int price = 0;
    private TextView quantityText;
    private TextView priceText;

    private final int ITEM_PRICE = 5;
    private final int PACKAGE_COST = 2;
    private final String PREFIX = "$";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState != null)
            numberOfCoffees = savedInstanceState.getInt("quantity");

        quantityText = (TextView) findViewById(R.id.tv_quantity_num);
        priceText = (TextView) findViewById(R.id.tv_price);

        quantityText.setText(String.valueOf(numberOfCoffees));
        setPrice(numberOfCoffees);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("quantity", numberOfCoffees);
    }

    public void changeQuantity(View view) {
        switch (view.getId()) {
            case R.id.bt_increment:
                quantityText.setText(String.valueOf(++numberOfCoffees));
                break;
            case R.id.bt_decrement:
                if (numberOfCoffees == 1)
                    Toast.makeText(this, getResources().getString(R.string.minimal_order), Toast.LENGTH_SHORT).show();
                else
                    quantityText.setText(String.valueOf(--numberOfCoffees));
                break;
        }
        setPrice(numberOfCoffees);
    }

    private void setPrice(int num) {
        price = num * ITEM_PRICE;
        String priceMessage = PREFIX + price;
        priceText.setText(priceMessage);
    }
}
