package com.example.mvp_01;

public interface LoginConector {
    void login(String userName,String Password);
    void showProgress();
    void hideProgress();
    void showMessage(String message);
}
