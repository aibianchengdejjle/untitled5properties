package com.company;

import java.io.*;
import java.util.HashMap;
import java.util.Properties;

public class Main {

    public static void main(String[] args) throws IOException {
        //method();
        //method2();
        method3();
        return;

    }

    private static void method3() throws IOException {
        Properties p=new Properties();
        //添加映射关系
        p.put("1","2");
        p.put("3","4");
        FileWriter fw=new FileWriter("b.txt");
        p.store(fw,"hello");
        fw.close();
    }

    private static void method2() throws IOException {
        Properties p=new Properties();
        FileReader fr=new FileReader("a.txt");
        p.load(fr);
        fr.close();
        System.out.println(p);
    }

    private static void method() throws FileNotFoundException {
        Properties p=new Properties();
        //添加映射关系  list只能接受打印流而store可以接受任何流
        p.put("1","2");
        p.put("3","4");
        PrintWriter pw=new PrintWriter("a.txt");
        p.list(pw);
        pw.close();
    }
}
