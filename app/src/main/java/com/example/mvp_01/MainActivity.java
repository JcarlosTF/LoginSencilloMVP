package com.example.mvp_01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements LoginEvents{
    private ProgressBar progressBar;
    private EditText nombre,password;
    private LoginConector presenter;
    private Button btnEntrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        progressBar=(ProgressBar)findViewById(R.id.progressBar);
        nombre=(EditText) findViewById(R.id.Nombre);
        password=(EditText)findViewById(R.id.Password);
        btnEntrar=(Button) findViewById(R.id.btnEntrar);

        presenter=new LoginPresenter(this);
        progressBar.setVisibility(View.INVISIBLE);

        btnEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.login(nombre.getText().toString(),password.getText().toString());
            }
        });
    }

    @Override
    public void showMessage(String message) {
        Toast.makeText(this,message, Toast.LENGTH_LONG).show();

    }

    @Override
    public void showProgress() {
        progressBar.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideProgress() {
        progressBar.setVisibility(View.GONE);

    }
}
