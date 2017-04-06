package com.example.yoush.mvp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements MVPView, View.OnClickListener {

    private Presenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mPresenter = new Presenter(this);
        ((Button)findViewById(R.id.button2)).setOnClickListener(this);
    }

    @Override
    protected void onResume() {
        super.onResume();
        mPresenter.onResume();
    }

    @Override
    public void setText() {
        ((TextView)findViewById(R.id.id_mvp)).setText("MVPTest");
    }

    @Override
    public void onClick(View v) {
        mPresenter.buttonClick();
    }
}
