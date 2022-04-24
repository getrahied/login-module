package com.example.devsufy;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity{
    EditText username,password;
    TextView res;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void click(View view){
        username=(EditText)findViewById(R.id.username);
        password=(EditText)findViewById(R.id.password);
        res=(TextView)findViewById(R.id.res);
        if(username.getText().toString().equals("Sufiyaan") &&
                password.getText().toString().equals("1987")){
            res.setText("Login Successful");
        } else{ res.setText("Login Unsuccessful");
        }
    }
}
