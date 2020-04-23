package com.example.uitutorials;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;

public class SimpleAdapterTutorial extends Activity {

    ListView simpleListView;
    String[] animalName={"Lion","Tiger","Monkey","Dog","Cat","Elephant"};
    int[] animalImages={R.drawable.lion,R.drawable.tiger,R.drawable.monkey,R.drawable.dog,R.drawable.cat,R.drawable.elephant};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simpleadapter_tutorial);
        simpleListView=(ListView)findViewById(R.id.simpleListView);

        ArrayList<HashMap<String,String>> arrayList=new ArrayList<>();
        for (int i=0;i<animalName.length;i++)
        {
            HashMap<String,String> hashMap=new HashMap<>();
            hashMap.put("name",animalName[i]);
            hashMap.put("image",animalImages[i]+"");
            arrayList.add(hashMap);
        }
        String[] from={"name","image"};
        int[] to={R.id.textView,R.id.imageView};
        SimpleAdapter simpleAdapter=new SimpleAdapter(this,arrayList,R.layout.activity_listview,from,to);//创建对象并设置simpleAdapter的参数
        simpleListView.setAdapter(simpleAdapter);

        //执行列表查看项目单击事件。
        simpleListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(),animalName[i],Toast.LENGTH_LONG).show();//显示选中的列表项信息
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}