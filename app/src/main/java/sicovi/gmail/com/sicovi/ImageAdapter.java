package sicovi.gmail.com.sicovi;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;


public class ImageAdapter extends BaseAdapter {

    private Context context;


    public Integer[] images = {
            R.drawable.vaksin,
            R.drawable.donatver_02,
            R.drawable.eclair_03,
            R.drawable.froyo_04,
            R.drawable.gingerbread_05,
            R.drawable.honeycomb_06,
            R.drawable.icecreamsandwitch_07,
            R.drawable.jelly_08,
            R.drawable.kitkatv_09,
            R.drawable.lolipopver_10,
            R.drawable.marshmallowver_11,
            R.drawable.naughetver_12,
            R.drawable.oreover_13,
    };
    public ImageAdapter(Context c){
        context = c;
    }

    @Override
    public int getCount(){
        return images.length;

    }
    public Object getItem(int position) {
        return images[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(images[position]);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setLayoutParams(new GridView.LayoutParams(240,240));
        return imageView;
    }
}
