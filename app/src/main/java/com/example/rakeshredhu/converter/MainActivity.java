package com.example.rakeshredhu.converter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private EditText text;

    private TextView mresult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = (EditText) findViewById(R.id.editText);
    }
    public void calculate(View view){

        RadioButton fahrenheit= (RadioButton)findViewById(R.id.fahrenheit);
        RadioButton kelvin= (RadioButton)findViewById(R.id.kelvin);
        mresult=findViewById(R.id.result);
         if (text.getText().length()==0){
             Toast.makeText(this,"Enter a valid tempreature",Toast.LENGTH_LONG).show();

         }
         else {
              double inputValue = Double.parseDouble(text.getText().toString());
              if (fahrenheit.isChecked()){
                  mresult.setText(String.valueOf(convertToFahreheit(inputValue)));
                  fahrenheit.setChecked(true);
                  kelvin.setChecked(false);

              }
              else {
                  mresult.setText(String.valueOf(convertToKelvin(inputValue)));
                  kelvin.setChecked(true);
                  fahrenheit.setChecked(false);


              }

         }

    }
    private double convertToFahreheit(double inputValue){

        return (inputValue*1.8)+32;
    }
    private double convertToKelvin(double inputValue){
        return (inputValue+273.15);
    }

}
