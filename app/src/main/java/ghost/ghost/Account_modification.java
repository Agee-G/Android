package ghost.ghost;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by G__Agee on 2016/10/2.
 */
public class Account_modification extends Activity {

    public int namecon;
    public int passescon;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.account_modification);
        Button button1=(Button) findViewById(R.id.bp_back) ;
        Button button2=(Button) findViewById(R.id.account_next) ;
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Account_modification.this,Login_main.class);
                startActivity(intent);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText name = (EditText) findViewById(R.id.username);
                EditText passwd = (EditText) findViewById(R.id.password);

                namecon = name.length();
                passescon = passwd.length();
                String login_name = name.getText().toString();
                String login_passwd = passwd.getText().toString();

                if (namecon == 0) {
                    Toast.makeText(Account_modification.this, "手机号为空，请输入手机号", Toast.LENGTH_SHORT).show();

                } else {
                    if (passescon == 0) {
                        Toast.makeText(Account_modification.this, "密码为空,请输入密码", Toast.LENGTH_SHORT).show();
                    } else {
                        Intent intent = new Intent(Account_modification.this, Account_modification2.class);
                        startActivity(intent);
                    }
                }
            }
        });
    }
}
