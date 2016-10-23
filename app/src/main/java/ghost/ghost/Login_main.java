package ghost.ghost;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import cn.bmob.v3.Bmob;
import cn.bmob.v3.BmobUser;
import cn.bmob.v3.exception.BmobException;
import cn.bmob.v3.listener.SaveListener;

/**
 * Created by G__Agee on 2016/10/2.
 */
public class Login_main extends Activity {
    public int namecon;
    public int passescon;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        Bmob.initialize(this,"65fb2208e4f8ed66aa49c227a0b8ca2e");
        setContentView(R.layout.login_main);

        Button button2=(Button) findViewById(R.id.register);
        Button button3=(Button) findViewById(R.id.login_error);

        Button button1=(Button) findViewById(R.id.login) ;

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText name = (EditText) findViewById(R.id.username);
                EditText passwd = (EditText) findViewById(R.id.password);

                namecon = name.length();
                passescon = passwd.length();
                String login_name = name.getText().toString();
                String login_passwd = passwd.getText().toString();
                if (namecon == 0) {
                    Toast.makeText(Login_main.this, "手机号为空，请输入手机号", Toast.LENGTH_SHORT).show();

                } else {
                    if (passescon == 0) {
                        Toast.makeText(Login_main.this, "密码为空,请输入密码", Toast.LENGTH_SHORT).show();
                    } else {
                        BmobUser bu2 = new BmobUser();
                        bu2.setUsername(login_name);
                        bu2.setPassword(login_passwd);
                        bu2.login(new SaveListener<BmobUser>() {
                            @Override
                            public void done(BmobUser bmobUser,BmobException e) {
                                if(e==null){
                                    //toast("添加数据成功，返回objectId为："+objectId);
                                    Toast.makeText(Login_main.this, "登陆成功", Toast.LENGTH_SHORT).show();
                                    Intent intent=new Intent(Login_main.this,Mainhome_page.class);
                                    startActivity(intent);
                                }else{
                                    // toast("创建数据失败：" + e.getMessage());
                                    Toast.makeText(Login_main.this, "不好意思密码错误", Toast.LENGTH_LONG).show();

                                }
                            }
                        });
                    }
                }


            }
        });


        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Login_main.this,Account_register.class);
                startActivity(intent);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Login_main.this,Account_modification.class);
                startActivity(intent);
            }
        });






    }

}
