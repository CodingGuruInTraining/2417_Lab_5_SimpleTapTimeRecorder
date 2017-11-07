package com.mark.simpletaptimerecorder;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 */

public class Stamp {
    private Date stamp_date;
    private String stamp_string;
    // Static formatter for the date.
    private static final SimpleDateFormat dateFormatter = new SimpleDateFormat("M-dd-yyyy hh:mm:ss");

    // Constructor
    public Stamp() {
        // Gets current date and then formats it to a string.
        this.stamp_date = new Date();
        this.stamp_string = dateFormatter.format(this.stamp_date);
    }

    public Date getStamp_date() {
        return stamp_date;
    }

    public String getStamp_string() {
        return stamp_string;
    }
}
