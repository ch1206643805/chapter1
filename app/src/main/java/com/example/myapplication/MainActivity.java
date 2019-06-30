package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private Button button;
    private CheckBox checkBox;
    private RadioGroup radioGroup;
    private RadioButton radioButton1;
    private RadioButton radioButton2;
    private ToggleButton toggleButton;
    private Switch aSwitch;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        button = findViewById(R.id.button);
        checkBox = findViewById(R.id.checkBox);
        radioButton1 = findViewById(R.id.radiobutton1);
        radioButton2 = findViewById(R.id.radiobutton2);
        toggleButton = findViewById(R.id.toggleButton);
        aSwitch = findViewById(R.id.switch1);
        imageView = findViewById(R.id.imageView);


        radioGroup = findViewById(R.id.radioGroup);
        radioGroup.setOnCheckedChangeListener(new RadioButtonListener());

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.setImageResource(R.mipmap.picture);
         //       imageView.setImageDrawable(getResources().getDrawable(R.mipmap.picture));
                textView.setText("button click");
                Log.d("1", "button click");
            }
        });

        checkBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(checkBox.isChecked()){
                    textView.setText("checkBox click on");
                    Log.d("2", "checkBox click on");
                }
                else{
                    textView.setText("checkBox click off");
                    Log.d("2", "checkBox click off");
                }
            }
        });


        toggleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("toggleButton click");
                Log.d("4", "toggleButton click");
            }
        });

        aSwitch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(aSwitch.isChecked()){
                    textView.setText("swtich click on");
                    Log.d("5", "switch click on");
                }
                else{
                    textView.setText("swtich click off");
                    Log.d("5", "switch click off");
                }
            }
        });

    }

    class RadioButtonListener implements RadioGroup.OnCheckedChangeListener {
        @Override
        public void onCheckedChanged(RadioGroup group, int checkedId) {
            switch (checkedId) {
                case R.id.radiobutton1:
                    textView.setText("radiobutton1 click");
                    Log.d("3", "radiobutton1 click");
                    break;
                case R.id.radiobutton2:
                    textView.setText("radiobutton2 click");
                    Log.d("3", "radiobutton2 click");
                    break;
            }
        }
    }
}