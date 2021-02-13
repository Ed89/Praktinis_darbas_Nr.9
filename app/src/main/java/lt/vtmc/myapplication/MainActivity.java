package lt.vtmc.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private LinearLayout linearLayout1;
    private Button buttonRed;
    private Button buttonGreen;
    private Button buttonBlue;
    private Button buttonYellow;
    private TextView textViewRed;
    private TextView textViewGreen;
    private TextView textViewBlue;
    private TextView textViewYellow;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        linearLayout1 = findViewById(R.id.linearlayout1);

        textViewBlue = findViewById(R.id.textViewBlue);
        textViewRed = findViewById(R.id.textViewRed);
        textViewYellow = findViewById(R.id.textViewYellow);
        textViewGreen = findViewById(R.id.textViewGreen);

        buttonBlue = findViewById(R.id.Blue);
        buttonGreen = findViewById(R.id.Green);
        buttonYellow = findViewById(R.id.Yellow);
        buttonRed = findViewById(R.id.Red);

        buttonRed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewRed.setBackgroundColor(Color.RED);
                textViewGreen.setBackgroundColor(Color.WHITE);
                textViewBlue.setBackgroundColor(Color.WHITE);
                textViewYellow.setBackgroundColor(Color.WHITE);
            }
        });
        buttonGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewGreen.setBackgroundColor(Color.GREEN);
                textViewBlue.setBackgroundColor(Color.WHITE);
                textViewYellow.setBackgroundColor(Color.WHITE);
                textViewRed.setBackgroundColor(Color.WHITE);
            }
        });
        buttonYellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewYellow.setBackgroundColor(Color.YELLOW);
                textViewRed.setBackgroundColor(Color.WHITE);
                textViewGreen.setBackgroundColor(Color.WHITE);
                textViewBlue.setBackgroundColor(Color.WHITE);
            }
        });
        buttonBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewBlue.setBackgroundColor(Color.BLUE);
                textViewYellow.setBackgroundColor(Color.WHITE);
                textViewRed.setBackgroundColor(Color.WHITE);
                textViewGreen.setBackgroundColor(Color.WHITE);
            }
        });
    }
}