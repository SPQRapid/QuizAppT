package com.example.android.quizappt;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void quizTotal(int score) {
        TextView textView = (TextView) findViewById(R.id.totalScore);
        textView.setText(String.valueOf(score));
    }

    public void quizGrade(View view) {

        EditText editText = (EditText) findViewById(R.id.edit_text);
        String name = editText.getText().toString();

        RadioButton dailyBible = (RadioButton) findViewById(R.id.dayilyBible);
        boolean isDailyBible = dailyBible.isChecked();

        RadioButton weeklyBible = (RadioButton) findViewById(R.id.weeklyBible);
        boolean isWeeklyBilbe = weeklyBible.isChecked();

        RadioButton monthlyBible = (RadioButton) findViewById(R.id.monthlyBible);
        boolean isMonthlyBible = monthlyBible.isChecked();

        RadioButton dailyPray = (RadioButton) findViewById(R.id.dayilyPray);
        boolean isDailyPray = dailyPray.isChecked();

        RadioButton weeklyPray = (RadioButton) findViewById(R.id.weeklyPray);
        boolean isWeeklyPray = weeklyPray.isChecked();

        RadioButton monthlyPray = (RadioButton) findViewById(R.id.monthlyPray);
        boolean isMonthlyPray = monthlyPray.isChecked();

        RadioButton dailyChurch = (RadioButton) findViewById(R.id.dailyChurch);
        boolean isDailyChurch = dailyChurch.isChecked();

        RadioButton weeklyChurch = (RadioButton) findViewById(R.id.weekleyChurch);
        boolean isWeeklyChurch = weeklyChurch.isChecked();

        RadioButton monthlyChurch = (RadioButton) findViewById(R.id.monthlyChurch);
        boolean isMonthlyChurch = monthlyChurch.isChecked();

        CheckBox yesCheckBox = (CheckBox) findViewById(R.id.yesWorship);
        boolean isYesCheckBox = yesCheckBox.isChecked();

        CheckBox noCheckBox = (CheckBox) findViewById(R.id.noWorship);
        boolean isNoCheckBox = noCheckBox.isChecked();

        int totalTest = totalQuestions(name, isDailyBible, isWeeklyBilbe, isMonthlyBible, isDailyPray, isWeeklyPray, isMonthlyPray, isDailyChurch, isWeeklyChurch, isMonthlyChurch, isYesCheckBox, isNoCheckBox);
        quizTotal(totalTest);

    }

    private int totalQuestions(String name, boolean isDailyBible, boolean isWeeklyBilbe, boolean isMonthlyBible, boolean isDailyPray, boolean isWeeklyPray, boolean isMonthlyPray, boolean isDailyChurch, boolean isWeeklyChurch, boolean isMonthlyChurch, boolean isYesCheckBox, boolean isNoCheckBox) {

        int score = 0;

        if (isDailyBible) {
            score = score + 3;
        }
        if (isWeeklyBilbe) {
            score = score + 2;
        }
        if (isMonthlyBible) {
            score = score + 1;
        }
        if (isDailyPray) {
            score = score + 3;
        }
        if (isWeeklyPray) {
            score = score + 2;
        }
        if (isMonthlyPray) {
            score = score + 1;
        }
        if (isDailyChurch) {
            score = score + 3;
        }
        if (isWeeklyChurch) {
            score = score + 2;
        }
        if (isMonthlyChurch) {
            score = score + 1;
        }
        if (isYesCheckBox) {
            score = score + 3;
        }
        if (isNoCheckBox) {
            score = score + 0;
        }
        if (score >= 9) {
            Toast.makeText(this, name + " you are on the narrow road ! \n But small is the gate and narrow the road that leads to life, and only a few find it.", Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(this, name + " you still have time God LOVES you NEVER FORGET THAT ! \n \"Enter through the narrow gate. For wide is the gate and broad is the road that leads to destruction, and many enter through it.", Toast.LENGTH_LONG).show();
        }

        return score;
    }
}
