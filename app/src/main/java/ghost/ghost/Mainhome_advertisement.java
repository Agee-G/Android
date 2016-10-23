package ghost.ghost;

import android.app.Activity;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;

/**
 * Created by G__Agee on 2016/10/2.
 */
public class Mainhome_advertisement extends Fragment {
    private Activity activity;
    private ListView mainhome_ad;
    private Button btn;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.mainhome_advertisement, container, false);
        //btn = (Button)view.findViewById(R.id.data_mod);
        //getActivity();
        ImageView im1= (ImageView) view.findViewById(R.id.first_image1);
        im1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),Advertisement_details.class);
                startActivity(intent);
            }

        });
        ImageView im2= (ImageView) view.findViewById(R.id.second_image2);
        im2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),Advertisement_details2.class);
                startActivity(intent);
            }

        });
        ImageView im3= (ImageView) view.findViewById(R.id.third_image3);
        im3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),Advertisement_details3.class);
                startActivity(intent);
            }

        });
        ImageView im4= (ImageView) view.findViewById(R.id.fouth_image4);
        im4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),Advertisement_details4.class);
                startActivity(intent);
            }

        });



        return view;



    }




}
