package com.example.yoush.mvp;

/**
 * Created by yoush on 2017/4/6.
 */

public class Presenter {

    private MVPView mView;

    public Presenter(MVPView view) {
        mView = view;
    }

    public void buttonClick(){
        mView.setText();
    }

    public void onResume() {
//        mView.setText();
    }
}
