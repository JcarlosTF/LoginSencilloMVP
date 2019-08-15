package com.example.mvp_01;

import android.os.Handler;

public class LoginIntereactor implements LoginActions{

    private LoginConector presenter;

    public LoginIntereactor(LoginConector presenter){
        this.presenter=presenter;
    }
    @Override
    public void login(String userName, String password) {
        if(!userName.equals("")){
            if(!password.equals("")){
                if(userName.equals("jc") && password.equals("123456")){
                    presenter.showProgress();
                    final Handler handler=new Handler();
                    final Runnable r=new Runnable() {
                        @Override
                        public void run() {
                            handler.postDelayed(this,2000);
                            presenter.hideProgress();
                        }
                    };
                    handler.postDelayed(r,1000);
                }else{
                    presenter.showMessage("usuario no encontrado");
                }
            }else{
                presenter.showMessage("Password no valida");
            }

        }else{
            presenter.showMessage("Usuario no valido");
        }
    }
    //modelo

}
