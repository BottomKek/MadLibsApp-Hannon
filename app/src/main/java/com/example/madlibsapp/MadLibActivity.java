package com.example.madlibsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MadLibActivity extends AppCompatActivity {
    public static final String FINAL_MAD_LIB = "madlib";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mad_lib);

        Intent intent = getIntent();
        String madLib = intent.getStringExtra(FINAL_MAD_LIB);
        TextView str = (TextView) findViewById(R.id.finalTextView);


        str.setText(madLib);
    }

    public void shareMadLib(View v){
        TextView textView = (TextView) findViewById(R.id.finalTextView);
        String madLib = textView.getText().toString();

        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, madLib);
        String chooserTitle = "Choose an app to send your message";
        Intent chosenIntent = Intent.createChooser(intent, chooserTitle);
        startActivity(chosenIntent);
    }
}
