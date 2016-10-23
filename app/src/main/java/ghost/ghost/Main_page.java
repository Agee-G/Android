package ghost.ghost;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Message;
import android.os.Parcelable;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/**
 * Created by G__Agee on 2016/10/2.
 */
public class Main_page extends Fragment  {
    private View view;
    private ViewPager mViewPager;
    private int[] mImgIds=new int[]{R.drawable.main_top1,R.drawable.main_fouth,R.drawable.main_top4,R.drawable.main_top3};
    private List<ImageView> mImages=new ArrayList<ImageView>();


   /* public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState != null) {
            mParam = savedInstanceState.getString(ARTICLE_LATEST_PARAM);
        }
    }
*/


    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.main_page, container, false);
        ViewPager mViewPager = (ViewPager) view.findViewById(R.id.id_viewpager);

        mViewPager.setAdapter(new PagerAdapter() {
            @Override
            public Object instantiateItem(ViewGroup container,int position){
                ImageView imageview=new ImageView(getActivity());//这有点问题注意一下
                imageview.setImageResource(mImgIds[position]);
                imageview.setScaleType(ImageView.ScaleType.CENTER_CROP);
                container.addView(imageview);
                mImages.add(imageview);
                return imageview;
            }

            @Override
            public void destroyItem(ViewGroup container, int position, Object object) {
               // super.destroyItem(container, position, object);
                container.removeView(mImages.get(position));
            }

            public int getCount() {
                return mImgIds.length;
            }

            @Override
            public boolean isViewFromObject(View view, Object object) {
                return view==object;
            }
        });
        ImageView im1 = (ImageView) view.findViewById(R.id.first_mainvideo1);
        im1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://www.bilibili.com/video/av4420019/"));
                startActivity(intent);
            }

        });
        ImageView im2 = (ImageView) view.findViewById(R.id.first_mainvideo2);
        im2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://www.bilibili.com/video/av6464349/"));
                startActivity(intent);
            }

        });
        ImageView im3 = (ImageView) view.findViewById(R.id.main_adver1);
        im3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://www.bilibili.com/video/av3621945/"));
                startActivity(intent);
            }

        });
        ImageView im4 = (ImageView) view.findViewById(R.id.main_adver2);
        im4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://www.bilibili.com/video/av6122198/"));
                startActivity(intent);
            }

        });
        Button bu1 = (Button) view.findViewById(R.id.bt_more1);
        bu1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
              /*  Intent intent=new Intent(getActivity(),Mainhome_video.class);
                startActivity(intent);*/
                getFragmentManager()
                        .beginTransaction()
                        .addToBackStack(null)  //将当前fragment加入到返回栈中
                        .replace(R.id.container, new Mainhome_video()).commit();

            }

        });
        Button bu2 = (Button) view.findViewById(R.id.bt_more2);
        bu2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
              /*  Intent intent=new Intent(getActivity(),Mainhome_video.class);
                startActivity(intent);*/
                getFragmentManager()
                        .beginTransaction()
                        .addToBackStack(null)  //将当前fragment加入到返回栈中
                        .replace(R.id.container, new Mainhome_advertisement()).commit();

            }

        });
        return view;


    }





}


