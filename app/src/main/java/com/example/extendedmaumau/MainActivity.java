package com.example.extendedmaumau;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
//Here the magic happens... you push a button and you get something new on your display
//author: ToWoe
public class MainActivity extends AppCompatActivity {
    //what happens if you press reset... it reset the string...
    String resetString[] = {"7", "8", "9", "10", "Bube", "Dame", "König", "Ass"};
    public String displayString[] = resetString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //if you push next you get the next... in string form everything is moved one index above
    public void spin(View view) {
        displayString = new String[]{displayString[7], displayString[0], displayString[1], displayString[2], displayString[3], displayString[4], displayString[5], displayString[6]};
        display(displayString);
    }
    //if you push reset... it resets...
    public void reset(View view) {
        displayString = resetString;
        display(displayString);
    }
    //what should happen if a specific position is called
    public void display(String[] displayString) {
        TextView position1 = (TextView) findViewById(R.id.text_7_id);
        position1.setText(displayString[0]);
        TextView position2 = (TextView) findViewById(R.id.text_8_id);
        position2.setText(displayString[1]);
        TextView position3 = (TextView) findViewById(R.id.text_9_id);
        position3.setText(displayString[2]);
        TextView position4 = (TextView) findViewById(R.id.text_10_id);
        position4.setText(displayString[3]);
        TextView position5 = (TextView) findViewById(R.id.text_11_id);
        position5.setText(displayString[4]);
        TextView position6 = (TextView) findViewById(R.id.text_12_id);
        position6.setText(displayString[5]);
        TextView position7 = (TextView) findViewById(R.id.text_13_id);
        position7.setText(displayString[6]);
        TextView position8 = (TextView) findViewById(R.id.text_14_id);
        position8.setText(displayString[7]);
    }
}
