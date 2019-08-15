package com.example.mvp_01;

public class LoginPresenter implements  LoginConector {
    private LoginEvents view;
    private LoginActions interactor;

    public LoginPresenter(LoginEvents view){
        this.view = view;
        interactor = new LoginIntereactor(this);
    }

    @Override
    public void login(String userName, String Password) {
        interactor.login(userName,Password);
    }

    @Override
    public void showProgress() {
        if(view != null){
            view.showProgress();
        }
    }

    @Override
    public void hideProgress() {
        if(view != null){
            view.hideProgress();
        }
    }

    @Override
    public void showMessage(String message) {
        if(view != null){
            view.showMessage(message);
        }
    }

    }

