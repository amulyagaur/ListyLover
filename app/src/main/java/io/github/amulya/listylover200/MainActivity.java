package io.github.amulya.listylover200;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class MainActivity extends AppCompatActivity {

    final int[] imgs = {
            R.mipmap.j,R.mipmap.k,R.mipmap.c,R.mipmap.cpp,R.mipmap.python,R.mipmap.p
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Creating a list of TEXT
        String[] languages = {"Java","Kotlin","C","C++","Python","Perl"};
        // We need an adapter to convert a Java code into a list item

        ListAdapter myAdapter = new CustomAdapter(this,languages,imgs);

        ListView myList = (ListView) findViewById(R.id.myListView);
        myList.setAdapter(myAdapter);

        myList.setOnItemClickListener(
                new AdapterView.OnItemClickListener(){
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        String mat = String.valueOf(parent.getItemAtPosition(position));
                        Toast.makeText(MainActivity.this,mat + " is a wondeful Lnaguage",Toast.LENGTH_LONG).show();
                    }
                }
        );
    }
}
