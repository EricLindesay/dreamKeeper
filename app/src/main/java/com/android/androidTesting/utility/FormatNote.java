package com.android.androidTesting.utility;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.IllegalFormatWidthException;

public class FormatNote {
    public static String formatDescription(String description) throws IllegalFormatWidthException {
        return description.trim();
    }

    public static long formatDate(String date_to_format) {
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date date;
        try {
            date = format.parse(date_to_format);
        } catch (ParseException e) {
            e.printStackTrace();
            date = new Date();
        }
        return date.getTime();
    }

    public static String formatDate(Long date_to_format) {
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        return format.format(new Date(date_to_format));
    }
}