package com.example.madlibsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void createMadLib (View v){
        EditText nounEditText = (EditText) findViewById(R.id.nounEditText);
        EditText nounEditText2 = (EditText) findViewById(R.id.nounEditText2);
        EditText adjEditText = (EditText) findViewById(R.id.adjEditText);
        EditText adjEditText2 = (EditText) findViewById(R.id.adjEditText2);
        EditText advEditText = (EditText) findViewById(R.id.advEditText);
        EditText verbEditText = (EditText) findViewById(R.id.verbEditText);

        String noun = nounEditText.getText().toString();
        String noun2 = nounEditText2.getText().toString();
        String adj = adjEditText.getText().toString();
        String adj2 = adjEditText2.getText().toString();
        String adv = advEditText.getText().toString();
        String verb = verbEditText.getText().toString();

        if (noun.equals("") || noun2.equals("")|| adj.equals("") || adj2.equals("") || adv.equals("") || verb.equals("")){
            Toast.makeText(MainActivity.this, "You forgot an input", Toast.LENGTH_LONG);
        }
        else {
            String finalMadLib = "Once upon a time, I was walking through the market when i saw the " + noun + "" +
                    " " + verb + ". I was completely " + adj + ". Shortly after, the only " + noun2 + " in town strolled past carrying a very "
                    + adj2 + " baby. The baby looked " + adv + " at me, then started crying. I decided to go home.";


            Intent intent = new Intent(this, MadLibActivity.class);
            intent.putExtra(MadLibActivity.FINAL_MAD_LIB, finalMadLib);
            startActivity(intent);
        }
    }


}
