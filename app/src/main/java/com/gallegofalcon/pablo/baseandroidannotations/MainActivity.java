package com.gallegofalcon.pablo.baseandroidannotations;

import android.app.Activity;
import android.widget.TextView;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

@EActivity(R.layout.activity_main)
public class MainActivity extends Activity {
    @ViewById(R.id.helloTextView)
    TextView helloTextView;

    @AfterViews
    public void doSomething() {
        helloTextView.setText("Goodbye!!!");
    }
}
