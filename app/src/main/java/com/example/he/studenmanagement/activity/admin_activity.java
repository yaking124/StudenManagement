package com.example.he.studenmanagement.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

import com.example.he.studenmanagement.R;


public class admin_activity extends Activity {
    private Button select;
    private Button add;
    private Button order;
    private TextView forceOffline;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.admin_layout);

        select = (Button) findViewById(R.id.admin_activity_select);
        add = (Button) findViewById(R.id.admin_activity_add);
        order = (Button) findViewById(R.id.admin_activity_order);
        forceOffline = (TextView) findViewById(R.id.admin_activity_forceOffline);

        select.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(admin_activity.this, studentInfo_activity.class);
                startActivity(intent);
            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(admin_activity.this, addStudent_info_activity.class);
                intent.putExtra("haveData","false");
                startActivity(intent);
            }
        });
        order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(admin_activity.this,student_total_score.class);
                startActivity(intent);
            }
        });
        forceOffline.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction("com.he.example.OfflineBradcast");
                sendBroadcast(intent);
            }
        });
    }
}
