package ghost.ghost;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import cn.bmob.sms.BmobSMS;
import cn.bmob.sms.listener.RequestSMSCodeListener;
import cn.bmob.v3.Bmob;
import cn.bmob.v3.BmobUser;
import cn.bmob.v3.exception.BmobException;
import cn.bmob.v3.listener.SaveListener;

/**
 * Created by G__Agee on 2016/10/2.
 */
public class Account_register extends Activity {
    public int namecon;
    public int passescon;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acoount_register);
        Bmob.initialize(this,"65fb2208e4f8ed66aa49c227a0b8ca2e");
        //BmobSMS.initialize(this,"65fb2208e4f8ed66aa49c227a0b8ca2e");
        Button button1=(Button) findViewById(R.id.bp_back);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Account_register.this,Login_main.class);
                startActivity(intent);
            }
        });
        //点击返回按钮监听事件
        Button button2=(Button) findViewById(R.id.login);
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
                    Toast.makeText(Account_register.this, "手机号为空，请输入手机号", Toast.LENGTH_SHORT).show();

                } else {
                    if (passescon == 0) {
                        Toast.makeText(Account_register.this, "密码为空,请输入密码", Toast.LENGTH_SHORT).show();
                    } else {
                        BmobUser bu = new BmobUser();
                        bu.setUsername(login_name);
                        bu.setPassword(login_passwd);
                        bu.signUp(new SaveListener<MyUser>() {
                            @Override
                            public void done(MyUser objectId,BmobException e) {
                                if(e==null){
                                    //toast("添加数据成功，返回objectId为："+objectId);
                                    Toast.makeText(Account_register.this, "注册成功", Toast.LENGTH_LONG).show();
                                    Intent intent=new Intent(Account_register.this,Mainhome_page.class);
                                    startActivity(intent);
                                }else{
                                    // toast("创建数据失败：" + e.getMessage());
                                    Toast.makeText(Account_register.this, "注册失败", Toast.LENGTH_LONG).show();
                                }
                            }
                        });
                    }


                    }



            }
        });
        //点击下一步按钮监听事件


    }
}
