package com.example.test_question4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    public final static String NAME="name";
    public final static String SEX="sex";
    public final static String CLASS="class";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        String[] names={"Tom  ","Jerry  ","Ann  "};
        String[] sexs={"man  ","woman  ","woman  "};
        String[] classs={"class1","class2","class3"};

        List<Map<String,Object>> items=new ArrayList<Map<String,Object>>();


        for(int i=0;i<names.length;i++){
            Map<String,Object> item=new HashMap<String,Object>();
            item.put(NAME,names[i]);
            item.put(SEX,sexs[i]);
            item.put(CLASS,classs[i]);
            items.add(item);
        }

        SimpleAdapter adapter=new SimpleAdapter
                (this,items,R.layout.item,
                        new String[]{NAME,SEX,CLASS,},
                        new int[]{R.id.txtName,R.id.txtSex,R.id.txtClass});
        ListView list=(ListView)findViewById(R.id.listView);

        list.setAdapter(adapter);

    }
}
