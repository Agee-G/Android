package ghost.ghost;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by G__Agee on 2016/10/2.
 */
public class Account_modification2 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.account_modification2);
        Button button1=(Button) findViewById(R.id.bp_back) ;
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Account_modification2.this,Account_modification.class);
                startActivity(intent);
            }
        });
    }
}
