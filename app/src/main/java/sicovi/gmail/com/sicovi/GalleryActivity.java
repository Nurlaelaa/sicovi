package sicovi.gmail.com.sicovi;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.GridView;

public class GalleryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);
        GridView gridView =(GridView) findViewById(R.id.gridview);

        gridView.setAdapter(new ImageAdapter(this));



    };
};
