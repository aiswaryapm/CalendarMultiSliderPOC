package com.example.aiswaryapm.calendarweekviewdemo;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.icu.text.DateFormatSymbols;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CalendarView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;



import java.util.Calendar;

import io.apptik.widget.MultiSlider;

public class MainActivity extends AppCompatActivity {

    int SMALLEST_HOUR_FRACTION = 4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView sunday = (TextView)findViewById(R.id.sunday);
        TextView monday = (TextView)findViewById(R.id.monday);
        TextView tuesday = (TextView)findViewById(R.id.tuesday);
        TextView wednesday = (TextView)findViewById(R.id.wednesday);
        TextView thursday = (TextView)findViewById(R.id.thursday);
        TextView friday = (TextView)findViewById(R.id.friday);
        TextView saturday = (TextView)findViewById(R.id.saturday);

        friday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });


        final  MultiSlider multiSlider5 = (MultiSlider)findViewById(R.id.range_slider5);


        multiSlider5.getThumb(1).setRange( getResources().getDrawable(R.drawable.icon1));
        multiSlider5.getThumb(3).setRange( getResources().getDrawable(R.drawable.icon1));

       /*multiSlider5.setOnTrackingChangeListener(new MultiSlider.OnTrackingChangeListener() {
            @Override
            public void onStartTrackingTouch(MultiSlider multiSlider, MultiSlider.Thumb thumb, int value) {
                multiSlider.getThumb(1).setRange( new ColorDrawable(0xFF000000));
                multiSlider.getThumb(3).setRange( new ColorDrawable(0xFFFF0000));
                System.out.println("val "+value);
            }

            @Override
            public void onStopTrackingTouch(MultiSlider multiSlider, MultiSlider.Thumb thumb, int value) {
                multiSlider.getThumb(1).setRange( new ColorDrawable(0xFF000000));
                multiSlider.getThumb(3).setRange( new ColorDrawable(0xFFFF0000));
                System.out.println("val "+value);

            }
        });*/
        multiSlider5.setOnThumbValueChangeListener(new MultiSlider.OnThumbValueChangeListener() {
            @Override
            public void onValueChanged(MultiSlider multiSlider,
                                       MultiSlider.Thumb thumb,
                                       int thumbIndex,
                                       int value)
            {
            }
        });

        Calendar calender = Calendar.getInstance();
        int su= calender.SUNDAY;
        int mo = calender.MONDAY;
        int tu= calender.TUESDAY;
        int we = calender.WEDNESDAY;
        int th= calender.THURSDAY;
        int fr = calender.FRIDAY;
        int sa= calender.SATURDAY;

        if(su == 1){
            sunday.setText("SU");
        }if(mo == 2){
            monday.setText("MO");
        }if(tu == 3){
            tuesday.setText("TU");
        }if(we == 4){
            wednesday.setText("WE");
        }if(th == 5){
            thursday.setText("TH");
        }if(fr == 6){
            friday.setText("FR");
        }if(sa == 7){
            saturday.setText("SA");
        }
    }
}
