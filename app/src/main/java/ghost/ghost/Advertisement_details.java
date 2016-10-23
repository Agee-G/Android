package ghost.ghost;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

/**
 * Created by G__Agee on 2016/10/17.
 */
public class Advertisement_details extends Activity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.advertisement_details);
        //Button bu1 = (Button) findViewById(R.id.bp_back);
        //bu1.setOnClickListener(this);
    }

    }
  /*public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bp_back:
                //Mainhome_advertisement mad=new Mainhome_advertisement();
                FragmentManager fragmentManager = getFragmentManager();
                //Mainhome_advertisement ma=getFragmentManager();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.container, new Mainhome_advertisement());
                transaction.commit();
                break;
            default:
                break;


        }
    }*/

