package com.ubelhj.randomnumbergenerator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button mainButton = findViewById(R.id.button);
        final EditText minimum = findViewById(R.id.minimum);
        final EditText maximum = findViewById(R.id.maximum);
        final TextView result = findViewById(R.id.resultTextView);

        mainButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random rand = new Random();
                String minInput = minimum.getText().toString();
                String maxInput = maximum.getText().toString();

//                System.out.println(minInput);
//                System.out.println(maxInput);

                int minInt = Integer.parseInt(minInput);
                int maxInt = Integer.parseInt(maxInput);

//                System.out.println(minInt);
//                System.out.println(maxInt);

                if (minInt < 0) {
                    return;
                }

                if (maxInt < minInt) {
                    return;
                }

                Integer value = rand.nextInt(maxInt - minInt) + minInt;

                System.out.println(value);

                //String valueString = "" + value;

                //System.out.println(valueString);

                result.setText(value.toString());

            }
        });
    }
}
