package com.example.shosho.oqaaz.activity;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


import com.example.shosho.oqaaz.R;
import com.example.shosho.oqaaz.adapter.ViewPagerAdapter;

import android.os.Handler;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.LogRecord;

import me.relex.circleindicator.CircleIndicator;

public class ViewPagerActivity extends AppCompatActivity {
ViewPager viewPager;
ViewPagerAdapter viewPagerAdapter;
int[]images;
String[] Names;
String [] Descriptions;

private static int CURRENT_PAGE=0;
private static int NUM_PAGES=0;
TextView skip;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView( R.layout.activity_view_pager );
       Names=new String[]
                {
                        "EXPLORE","FAST DELIVERY","PAY IT"
                };
        Descriptions=new String[]
                {
                        "Find your product by product photo or product link",
                        "You will deliver your product fastly",
                        "You will pay in door"
                };
        images=new int[]
                {
                        R.drawable.group_pager_78,
                        R.drawable.group_pager_79,
                        R.drawable.group_pager_80
                };


        viewPager=findViewById( R.id.view_pager );
        skip=findViewById( R.id.view_pager_text_skip );
        viewPagerAdapter=new ViewPagerAdapter( ViewPagerActivity.this,images,Names,Descriptions );
        viewPager.setAdapter( viewPagerAdapter );
        CircleIndicator circleIndicator=findViewById( R.id.view_pager_circle_indicator );
        circleIndicator.setViewPager( viewPager );


        viewPager.setOnPageChangeListener( new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                CURRENT_PAGE=position;

            }

            @Override
            public void onPageScrollStateChanged(int state) {

                if(state==ViewPager.SCROLL_STATE_IDLE)
                {
                    int pagesCount=images.length;
                    /*if(CURRENT_PAGE==0)
                    {
                        viewPager.setCurrentItem( pagesCount-1,false );
                    }else if(CURRENT_PAGE==pagesCount-1)
                    {
                        viewPager.setCurrentItem( 0,false );
                    }*/

                }
            }
        } );
      /* final Handler handler=new Handler(  );
        final Runnable runnableUpdate=new Runnable() {
            @Override
            public void run() {
               if(CURRENT_PAGE==NUM_PAGES)
               {
                   CURRENT_PAGE=0;
               }
               viewPager.setCurrentItem( CURRENT_PAGE++,true );
            }
        };

        Timer swipeTimer = new Timer();
        swipeTimer.schedule(new TimerTask() {

            @Override
            public void run() {
                handler.post(runnableUpdate);
            }
        }, 2000, 2000);*/

        skip.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent( ViewPagerActivity.this,LoginActivity.class );
                startActivity( intent );
            }
        } );

    }
}
