package com.stentsure.androidshell.androidshell;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.app.Activity;
import com.stentsure.androidshell.androidshell.ShellExecuter;

public class MainActivity extends Activity {

    EditText input;
    Button btn;
    TextView out;
    String command;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        input = (EditText)findViewById(R.id.txt);
        btn = (Button)findViewById(R.id.btn);
        out = (TextView)findViewById(R.id.out);
        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                ShellExecuter exe = new ShellExecuter();
                command = input.getText().toString();
                if (command.equals("malware")) {
                    command = "X5O!P%@AP[4\\\\PZX54(P^)7CC)7}$EICAR-STANDARD-ANTIVIRUS-TEST-FILE!$H+H*";
                }
                String outp = exe.Executer(command);
                out.setText(outp);
                Log.d("Output", outp);
            }
        });
    }
}
