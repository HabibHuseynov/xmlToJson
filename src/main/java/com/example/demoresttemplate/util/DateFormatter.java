package com.example.demoresttemplate.util;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;

public class DateFormatter {

    public static String dateFormat(Date date){

        SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
        return formatter.format(date);

    }
}
