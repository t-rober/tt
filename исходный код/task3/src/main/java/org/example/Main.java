package org.example;

import com.google.gson.*;

import java.io.*;
import java.io.FileWriter;

public class Main {

    public static void main(String[] args) throws Exception {
        FileReader fr1 = new FileReader(args[0]);
        FileReader fr2 = new FileReader(args[1]);
        Gson gson = new Gson();
        Result result1 = gson.fromJson(fr1, Result.class);
        Values result2 = gson.fromJson(fr2, Values.class);
        result1.merdge(result2);
        System.out.println(args[0]);
        System.out.println(args[0].substring(0, args[0].lastIndexOf("\\")) + "\\report.json");
        FileWriter writer = new FileWriter(args[0].substring(0, args[0].lastIndexOf("\\")) + "\\report.json");
        gson.toJson(result1, writer);
        fr1.close();
        fr2.close();
        writer.close();
    }
}