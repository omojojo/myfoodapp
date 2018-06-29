package com.example.ayanbadejo.quizapp;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.util.Objects;

public class QuizQuestions extends AppCompatActivity {
    /*
    param 24 -34
    Create different variables with different dataTypes such as Boolean(true/false), integers etc
    create variables for views such as radioButtons,buttons, EditButtons and checkBoxes
     */
    boolean checked = true;
    int addition = 0;
    RadioGroup rg, rg1, rg2, rg3, rg4;
    RadioButton rb, rb1, rb2, rb3, rb4;
    RadioButton rb5, rb6, rb7, rb8, rb9;
    boolean clicker = true;
    Button pressB;
    Button summary;
    CheckBox box1, box2, box3, box4;
    EditText Qn, Qn1, username;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_quiz_questions);
        /*
        param 45 - 62
        assign variables to the id of each elements/Views to inherit various attributes and properties
         */
        rg = findViewById (R.id.group1);
        rg1 = findViewById (R.id.group2);
        rg2 = findViewById (R.id.group3);
        rg3 = findViewById (R.id.group4);
        rg4 = findViewById (R.id.group5);
        rb = findViewById (R.id.radioButton3);
        rb1 = findViewById (R.id.radioButton7);
        rb2 = findViewById (R.id.radioButton8);
        rb3 = findViewById (R.id.radioButton14);
        rb4 = findViewById (R.id.radioButton18);
        pressB = findViewById (R.id.button);
        summary = findViewById (R.id.button1);
        box1 = findViewById (R.id.boxOne);
        box2 = findViewById (R.id.boxTwo);
        box3 = findViewById (R.id.boxThree);
        box4 = findViewById (R.id.boxFour);
        Qn = findViewById (R.id.editText);
        Qn1 = findViewById (R.id.editText1);
        username = findViewById (R.id.Username);
    }

    public void submitQuestions(View view) {
        /*
        condition to check if the right answers are checked
         */
        if (!rb.isChecked () && !rb1.isChecked () && !rb2.isChecked () && !rb3.isChecked () && !rb4.isChecked ()) {
            Objects.requireNonNull (Toast.makeText (QuizQuestions.this, "ATTEMPT ALL QUESTIONS ", Toast.LENGTH_LONG)).show ();
            return;
        }
        /*
        param 69 myName of variable to input text on an editField by calling the getText method and convert it to a string using toString()
         */
        String myName = username.getText ().toString ();

        /*
        RadioGroup One
        param 76 - 87
        conditional statement to make it possible for rb5 radioButton to relate with whatever rb radio button checked in the rg radioGroup
        */
        int radioId = rg.getCheckedRadioButtonId ();
        rb5 = findViewById (radioId);
        if (radioId == R.id.radioButton || radioId == R.id.radioButton1 || radioId == R.id.radioButton2) {
            rb.setTextColor (Color.GREEN);
            rb5.setTextColor (Color.RED);
            rb.setBackgroundColor (Color.BLACK);
            rg.setBackgroundColor (Color.DKGRAY);
        } else if (rb.isChecked ()) {
            addition += 1;
            rb.setTextColor (Color.GREEN);
        }

        /*
         create a string value variable that call on the ans variable whenever the edit field of the value variable is edited or input
         */
        String value = Qn.getText ().toString ();
        String ans = "Calcium";
        if (value.trim ().equalsIgnoreCase (ans)) {
            addition += 1;
        } else if (value.matches ("")) {
            Objects.requireNonNull (Toast.makeText (this, "INPUT ANSWER IN QUESTION 2", Toast.LENGTH_SHORT)).show ();
            return;

        } else {
            Qn.setTextColor (Color.GREEN);
            Qn.setText (getString (R.string.correctAnswer));
        }

         /*
        RadioGroup two
        param 76 - 87
        conditional statement to make it possible for rb6 radioButton to relate with whatever rb1 radio button checked in the rg1 radioGroup
        */
        int gId = rg1.getCheckedRadioButtonId ();
        rb6 = findViewById (gId);
        if (gId == R.id.radioButton4 || gId == R.id.radioButton5 || gId == R.id.radioButton6) {
            rb1.setTextColor (Color.GREEN);
            rb6.setTextColor (Color.RED);
            rb1.setBackgroundColor (Color.BLACK);
            rg1.setBackgroundColor (Color.DKGRAY);
        } else if (rb1.isChecked ()) {
            addition += 1;
            rb1.setTextColor (Color.GREEN);
        }

         /*
         create a string value1 variable that call on the ans1 variable whenever the edit field of the value variable is edited or input
         */
        String value1 = Qn1.getText ().toString ();
        String ans1 = "Vitamin c";
        if (value1.trim ().equalsIgnoreCase (ans1)) {
            addition += 1;
        } else if (value1.matches ("")) {
            Objects.requireNonNull (Toast.makeText (this, "INPUT ANSWER IN QUESTION 4", Toast.LENGTH_SHORT)).show ();
            return;

        } else {
            Qn1.setTextColor (Color.GREEN);
            Qn1.setText (getString (R.string.correctAnswer1));
        }

         /*
        RadioGroup One
        param 76 - 87
        conditional statement to make it possible for rb7 radioButton to relate with whatever rb2 radio button checked in the rg2 radioGroup
        */
        int rId = rg2.getCheckedRadioButtonId ();
        rb7 = findViewById (rId);
        if (rId == R.id.radioButton9 || rId == R.id.radioButton10 || rId == R.id.radioButton11) {
            rb2.setTextColor (Color.GREEN);
            rb7.setTextColor (Color.RED);
            rb2.setBackgroundColor (Color.BLACK);
            rg2.setBackgroundColor (Color.DKGRAY);
        } else if (rb2.isChecked ()) {
            addition += 1;
            rb2.setTextColor (Color.GREEN);
        }

         /*
        RadioGroup One
        param 76 - 87
        conditional statement to make it possible for rb5 radioButton to relate with whatever rb radio button checked in the rg radioGroup
        */
        boolean answerOne = box1.isChecked ();
        boolean answerTwo = box2.isChecked ();
        boolean wrong1 = box3.isChecked ();
        boolean wrong2 = box4.isChecked ();
        if (answerOne && answerTwo) {
            addition += 1;
            box1.setTextColor (Color.GREEN);
            box2.setTextColor (Color.GREEN);
        } else if (answerOne || wrong1 || wrong2) {
            box3.setTextColor (Color.RED);
            box4.setTextColor (Color.RED);
            box1.setTextColor (Color.GREEN);
            box2.setTextColor (Color.GREEN);
            box2.setBackgroundColor (Color.BLACK);
        } else if (!box1.isChecked () && !box2.isChecked () && !box3.isChecked () && !box4.isChecked ()) {
            Objects.requireNonNull (Toast.makeText (QuizQuestions.this, "ATTEMPT QUESTION 6", Toast.LENGTH_LONG)).show ();
            return;

        } else {
            box1.setTextColor (Color.GREEN);
            box2.setTextColor (Color.GREEN);
            box3.setTextColor (Color.RED);
            box4.setTextColor (Color.RED);
        }

        /*
        RadioGroup One
        param 76 - 87
        conditional statement to make it possible for rb8 radioButton to relate with whatever rb3 radio button checked in the rg3 radioGroup
        */
        int cId = rg3.getCheckedRadioButtonId ();
        rb8 = findViewById (cId);
        if (cId == R.id.radioButton12 || cId == R.id.radioButton13 || cId == R.id.radioButton15) {
            rb3.setTextColor (Color.GREEN);
            rb8.setTextColor (Color.RED);
            rb3.setBackgroundColor (Color.BLACK);
            rg3.setBackgroundColor (Color.DKGRAY);
        } else if (rb3.isChecked ()) {
            addition += 1;
            rb3.setTextColor (Color.GREEN);
        }

         /*
        RadioGroup One
        param 76 - 87
        conditional statement to make it possible for rb9 radioButton to relate with whatever rb4 radio button checked in the rg4 radioGroup
        */
        int aId = rg4.getCheckedRadioButtonId ();
        rb9 = findViewById (aId);
        if (aId == R.id.radioButton16 || aId == R.id.radioButton17 || aId == R.id.radioButton19) {
            rb4.setTextColor (Color.GREEN);
            rb9.setTextColor (Color.RED);
            rb4.setBackgroundColor (Color.BLACK);
            rg4.setBackgroundColor (Color.DKGRAY);
        } else if (rb4.isChecked ()) {
            addition += 1;
            rb4.setTextColor (Color.GREEN);
        }

        /*
         Conditions for visibility of the summary and summit Button
         pressB to get the scores, make the button invisible and summary Button visible
         and to make toast to get the result of the quiz
         */
        if (clicker) {
            pressB.setVisibility (View.INVISIBLE);
            summary.setVisibility (View.VISIBLE);
            clicker = false;
            Objects.requireNonNull (Toast.makeText
                    (QuizQuestions.this, "     Hi, " + myName + "   \n TOTAL SCORES: " + addition + "/8 \n" + "Scroll up for Answers", Toast.LENGTH_LONG)).show ();
        }
    }
    public void next(View view) {
        /*
        use Bundle to pass data between Activities through Intent
        passing the scores addition using the string score
         */
        Intent HomeIntent = new Intent (QuizQuestions.this, QuizSummary.class);
        Bundle bundle = new Bundle ();
        bundle.putInt ("score", addition);
        HomeIntent.putExtra ("score", addition);
        startActivity (HomeIntent);
        finish ();
    }
}

