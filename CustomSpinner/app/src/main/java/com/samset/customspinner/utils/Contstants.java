package com.samset.customspinner.utils;

import java.util.List;

/**
 * Created by weesync on 11/03/16.
 */
public class Contstants {
    public static String _ID="";
    public static String intrestData[] = { "Android Cupcake",
            "Android Donut",
            "Android Ecleir",
            "Android Frayo",
            "Android Gingerbread",
            "Android Honycomb",
            "Android Icecreame",
            "Android Jellybean",
            "Android Kitkat",
            "Android Lollypop",
            "Android Marsmolo"};



    public static String intrestValue(List<Integer> list) {
        String data = "";
        StringBuilder sb = new StringBuilder();
        if (list.size() > 0 && !(list.size() == 0)) {
            for (Integer in : list) {
                if (in != -1) {
                    sb.append(in);
                }

            }
            data = sb.toString();
        }
        return data;
    }

}
