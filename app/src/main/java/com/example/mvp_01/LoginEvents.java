package com.example.mvp_01;

public interface LoginEvents {
    //metodos que no devuelven nada
    void showMessage(String message);
    void showProgress();
    void hideProgress();
}
