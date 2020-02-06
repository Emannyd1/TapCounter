package edu.miracosta.cs134.edominguez;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private Button tapMeButton;
    private TextView countTextView;
    private int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        // Manny was HERE!!
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //wire it up

        tapMeButton = findViewById(R.id.tapMeButton);
        countTextView = findViewById(R.id.countTextView);




    }

    public void addCount(View v)
    {
        countTextView.setText(Integer.toString(++count));
    }
}
