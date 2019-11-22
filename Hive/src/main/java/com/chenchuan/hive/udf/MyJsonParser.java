package com.chenchuan.hive.udf;

import org.apache.hadoop.hive.ql.exec.UDF;

public class MyJsonParser extends UDF {
    // 重载父类中方法evaluate()
    public String evaluate(String json, int index) {

        // {"movie":"1193","rate":"5","timeStamp":"978300760","uid":"1"}
        String[] fields = json.split("\"");

        //1
        String movie = fields[3];
        //2
        String rate = fields[7];
        //3
        String ts = fields[11];
        //4
        String uid = fields[15];

        return fields[4 * index - 1];

    }

}
