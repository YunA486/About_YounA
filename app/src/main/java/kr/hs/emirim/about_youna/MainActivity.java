package kr.hs.emirim.about_youna;

import android.app.TabActivity;
import android.os.Bundle;
import android.widget.TabHost;

public class MainActivity extends TabActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TabHost tabHost = getTabHost();

        TabHost.TabSpec t1 = tabHost.newTabSpec("one").setIndicator("", getResources().getDrawable(R.drawable.web));
        t1.setContent(R.id.layout01);
        tabHost.addTab(t1);

        TabHost.TabSpec t2 = tabHost.newTabSpec("two").setIndicator("", getResources().getDrawable(R.drawable.android));
        t2.setContent(R.id.layout02);
        tabHost.addTab(t2);

        TabHost.TabSpec t3 = tabHost.newTabSpec("three").setIndicator("", getResources().getDrawable(R.drawable.home));
        t3.setContent(R.id.layout03);
        tabHost.addTab(t3);

        TabHost.TabSpec t4 = tabHost.newTabSpec("four").setIndicator("", getResources().getDrawable(R.drawable.game));
        t4.setContent(R.id.layout04);
        tabHost.addTab(t4);

        TabHost.TabSpec t5 = tabHost.newTabSpec("five").setIndicator("", getResources().getDrawable(R.drawable.consol));
        t5.setContent(R.id.layout05);
        tabHost.addTab(t5);

        tabHost.setCurrentTab(1);
    }
}