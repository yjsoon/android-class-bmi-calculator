package com.tinkercademy.bmicalculator;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText weightField = (EditText) findViewById(R.id.weight_field);
        final EditText heightField = (EditText) findViewById(R.id.height_field);
        TextView resultsText = (TextView) findViewById(R.id.results_text);
        Button calculateButton = (Button) findViewById(R.id.calculate_button);

        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String weightString = weightField.getText().toString();
                String heightString = heightField.getText().toString();

                double weight = Double.parseDouble(weightString);
                double height = Double.parseDouble(heightString);

                Log.d("BMICALC", "Weight is " + weight + ", height is " + height);

                // Can you fill in the rest, and set resultsText to show the result?

            }
        });

    }

}
