package com.mark.simpletaptimerecorder;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

/**
 *
 */

public class StampAdapter extends ArrayAdapter<Stamp> {
    Context mContext;

    // Constructor
    public StampAdapter(Context context, int resource) {
        super(context, resource);
        // Sets variable with Activity.
        this.mContext = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View rowView = convertView;

        if (rowView == null) {
            LayoutInflater inflater = ((Activity) mContext).getLayoutInflater();
            rowView = inflater.inflate(R.layout.stamp_item, parent, false);
        }

        // Get the correct Stamp object.
        Stamp item = getItem(position);

        // Declares widget.
        TextView stampItem = (TextView) rowView.findViewById(R.id.list_item);

        // Sets the widget's text value.
        stampItem.setText(item.getStamp_string().toString());

        // Returns view to be viewed in ListView.
        return rowView;
    }
}
