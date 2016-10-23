package ghost.ghost;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

/**
 * Created by G__Agee on 2016/10/2.
 */
public class Mainhome_video extends Fragment{
    private View view;
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.mainhome_video, container, false);
        ImageView im1= (ImageView) view.findViewById(R.id.first_video1);
        im1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://www.bilibili.com/video/av6470859/"));
                startActivity(intent);
            }

        });
        ImageView im2= (ImageView) view.findViewById(R.id.second_video2);
        im2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://www.bilibili.com/video/av6164071/"));
                startActivity(intent);
            }

        });
        ImageView im3= (ImageView) view.findViewById(R.id.third_video3);
        im3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://www.bilibili.com/video/av5403543/index_2.html"));
                startActivity(intent);
            }

        });
        ImageView im4= (ImageView) view.findViewById(R.id.fouth_video4);
        im4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://www.bilibili.com/video/av6521763/"));
                startActivity(intent);
            }

        });
        ImageView im5= (ImageView) view.findViewById(R.id.five_video5);
        im5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://www.bilibili.com/video/av5096344/"));
                startActivity(intent);
            }

        });
        ImageView im6= (ImageView) view.findViewById(R.id.sixe_video6);
        im6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://www.bilibili.com/video/av6754434/"));
                startActivity(intent);
            }

        });

        return view;
    }


}
