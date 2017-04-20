package example.com.internsystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {



    public Button but1;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText loginText = (EditText) findViewById(R.id.teachID);
        final EditText loginPassword = (EditText) findViewById(R.id.teachPW);
        final Button button = (Button) findViewById(R.id.bLogin);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = null;
                if(loginText.getText().equals("user") &&
                        loginPassword.getText().equals("pass")) {
                    System.out.println("Entering");
                    myIntent = new Intent(view.getContext(), Page1.class);
                } else {

                }
                startActivity(myIntent);
            }
        });
    }
