package com.moussif.tawfi.histoires;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView=(ListView)findViewById(R.id.lv);
        String[] tab=getResources().getStringArray(R.array.index);
        ArrayAdapter arrayAdapter=new ArrayAdapter<String>(this,R.layout.histoire,R.id.title,tab);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent=new Intent(MainActivity.this,WebActivity.class);
                intent.putExtra("page",position);
                startActivity(intent);

            }
        });
    }
}
