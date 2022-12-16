package vas.tsv.simplelistviewapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView listView;

    String[] worldcup2022 ={"Germany", "Spain", "Brazil", "England", "USA", "SaudiArabia", "Qatar"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.list_view);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                this,
                //android.R.layout.simple_list_item_1,
                R.layout.my_list_item,
                R.id.txt_view,
                worldcup2022);
        listView.setAdapter(adapter);

    }
}