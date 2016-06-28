package com.likou.dxf4j.io;

import java.io.FileReader;
import java.io.IOException;

/**
 * Created by jiangli on 16/6/23.
 */
public class DXFFileInputStream {
    public static void main(String[] args) throws IOException
    {
        method("/Users/jiangli/Downloads/金港国际2013.dxf");//传入要读取的文件，字符串型。
    }
    public static void method(String s) throws IOException
    {
        FileReader f=new FileReader(s);
        char[] b=new char[1024];
        int num=0;
        while((num=f.read(b))!=-1)
        {
            System.out.println(new String(b,0,num));
        }
        f.close();
    }
}
