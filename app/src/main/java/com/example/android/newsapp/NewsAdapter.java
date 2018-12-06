package com.example.android.newsapp;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class NewsAdapter extends ArrayAdapter<News> {
    public NewsAdapter(Context context, List<News> articles) {
        super(context, 0, articles);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.news_list, parent, false);
        }
        News currentNews = getItem(position);

        String originalCategory = currentNews.getCategory();
        TextView categoryView = (TextView) listItemView.findViewById(R.id.category);
        categoryView.setText(originalCategory);

        String originalHeadline = currentNews.getHeadline();
        TextView headlineView = (TextView) listItemView.findViewById(R.id.headline);
        headlineView.setText(originalHeadline);

        String dateObject = currentNews.getTime();
        TextView dateView = (TextView) listItemView.findViewById(R.id.date);
        dateView.setText(dateObject);

        String author = currentNews.getAuthor();
        TextView authortv = (TextView) listItemView.findViewById(R.id.author);
        authortv.setText(author);

        return listItemView;
    }

}