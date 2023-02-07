package ca.qc.bdeb.travail01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Ex1Activity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex1);
        //initialiser l'attribut
        textView = findViewById(R.id.ex1_text_view) ;
    }

    public void changeText(View view) {
        textView.setText("Nouveau message");
    }
}