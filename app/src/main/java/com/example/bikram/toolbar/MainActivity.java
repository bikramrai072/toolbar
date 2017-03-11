package com.example.bikram.toolbar;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

/*import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.ActionBar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM | ActionBar.DISPLAY_SHOW_HOME);
        getSupportActionBar().setCustomView(R.layout.tool_bar);
   }
}*/
public class MainActivity extends AppCompatActivity {
    private Toolbar toolbar;
    private ImageView back_button, appicon, icon;
    private TextView title;
    private ImageView iv_toggle;
    private LinearLayout back;
    FragmentManager fragmentManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        back_button = (ImageView) findViewById(R.id.back_button);
        appicon = (ImageView) findViewById(R.id.appicon);
        setSupportActionBar(toolbar);
        title = (TextView) findViewById(R.id.toolbar_title);
        icon = (ImageView) findViewById(R.id.icon);
        back_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "hello", Toast.LENGTH_SHORT).show();
            }
        });
       /* title.setText(" ");
        back_button.setVisibility(View.INVISIBLE);
//        back_button.setImageResource(back);
        appicon.setVisibility(View.VISIBLE);
        title.setVisibility(View.INVISIBLE);
        fragmentManager = getSupportFragmentManager();
       // String uri = "@drawable/download";  // where myresource (without the extension) is the file

      //  int imageResource = getResources().getIdentifier(uri, null, getPackageName());

       // appicon.setImageResource(imageResource);

        if (savedInstanceState == null) {

            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
        }*/
    }
}

