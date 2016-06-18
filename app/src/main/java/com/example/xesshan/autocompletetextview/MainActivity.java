package com.example.xesshan.autocompletetextview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {

    AutoCompleteTextView actttTextVew;
    String[] countries={"Afghanistan",
            "Albania","Andorra","Algeria","Argentia","Armenia","Australia","Austria","Azerbaijan"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        actttTextVew =(AutoCompleteTextView)findViewById(R.id.autoCompleteTextView);
        ArrayAdapter adopter=new ArrayAdapter(this,android.R.layout.select_dialog_item,countries);
        actttTextVew.setThreshold(1);
        actttTextVew.setAdapter(adopter);
    }


}
