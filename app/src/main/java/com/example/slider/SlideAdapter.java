package com.example.slider;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

public class SlideAdapter extends PagerAdapter {

    Context context;
    LayoutInflater layoutInflater;


    public int[] lst_images = {
            R.drawable.group_10,
            R.drawable.group_11,
            R.drawable.group_12
    };

    public String[] title = {
            "Food",
            "Sleep",
            "Code"
    };
    public String[] descriptions = {
            "Lorem Ipsum is simply dummy text of the printing and typesetting industry",
            "Lorem Ipsum is simply dummy text of the printing and typesetting industry",
            "Lorem Ipsum is simply dummy text of the printing and typesetting industry"
    };

    public SlideAdapter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return title.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return (view == object);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.slide, container, false);
        ImageView imageView = view.findViewById(R.id.imageView);
        TextView title1 = view.findViewById(R.id.title);
        TextView description = view.findViewById(R.id.txtdescription);
        imageView.setImageResource(lst_images[position]);
        title1.setText(title[position]);
        description.setText(descriptions[position]);
        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View) object);
    }
}
