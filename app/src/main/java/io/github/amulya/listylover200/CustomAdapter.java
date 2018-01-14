package io.github.amulya.listylover200;
import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;


class CustomAdapter extends ArrayAdapter<String> {
    private final int[] imgs;

     CustomAdapter(Context context, String[] languages, int[] imgs) {
        super(context,R.layout.custom_row,languages);
        this.imgs=imgs;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater myInflator = LayoutInflater.from(getContext());
        View customView = myInflator.inflate(R.layout.custom_row,parent,false);

        String singleItem = getItem(position);
        TextView myText = (TextView) customView.findViewById(R.id.myText);
        ImageView myImageView = (ImageView) customView.findViewById(R.id.myImageView);

        myText.setText(singleItem);
        myImageView.setImageResource(imgs[position]);

        return customView;
    }
}
