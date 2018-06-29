package com.example.ayanbadejo.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import java.text.MessageFormat;
import java.util.Objects;

public class QuizSummary extends AppCompatActivity {
    TextView mark;
    TextView grader;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_quiz_summary);

        mark = findViewById (R.id.mark);
        grader = findViewById (R.id.grade);

        Bundle bundle = getIntent ().getExtras ();
        int score = bundle != null ? bundle.getInt ("score") : 0;
        mark.setText (MessageFormat.format ("{0}/8", score, QuizQuestions.class.toString ().length ()));

        if (score == 8) grader.setText (getString(R.string.firstClass));
        else if (score >= 5) grader.setText (getString(R.string.secondClass));
        else if (score == 4) grader.setText (getString(R.string.thirdClass));
        else { Objects.requireNonNull (Toast.makeText (QuizSummary.this, "BELOW AVERAGE TRY AGAIN", Toast.LENGTH_LONG)).show ();
            Intent i = new Intent (QuizSummary.this, QuizQuestions.class);
            startActivity (i);
        }
    }
}
