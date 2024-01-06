package com.example.seekbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private SeekBar seekBar;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        seekBar = findViewById(R.id.seekBar_Id);
        textView = findViewById(R.id.textView_Id);


        textView.setText("Volume : "+seekBar.getProgress()+"/"+seekBar.getMax());


        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

                textView.setText("Volume : "+progress+"/"+seekBar.getMax());

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

                Toast.makeText(MainActivity.this,"Start Tracking Touch.",Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                Toast.makeText(MainActivity.this,"Stop Tracking Touch.",Toast.LENGTH_SHORT).show();
            }
        });

    }
}