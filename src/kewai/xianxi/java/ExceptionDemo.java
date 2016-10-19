package kewai.xianxi.java;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * Created by Administrator on 2016/10/19 0019.
 */
public class ExceptionDemo {
    //public static void method1() throws NullPointerException{
    //    try {
    //        method2();
    //        System.out.println("南无地藏菩萨摩诃萨");
    //    } catch (FileNotFoundException e) {
    //        //e.printStackTrace();
    //        System.out.println("南无阿弥陀佛");
    //    }
    //    System.out.println("南无本师释迦牟尼佛");
    //    throw new NullPointerException();
//
    //}
    public static  void method2(){
        try (RandomAccessFile randomAccessFile = new RandomAccessFile("", "rw")) {
            System.out.println("nan");
        } catch (IOException e) {
            //e.printStackTrace();
        }


    }

    public static void main(String[] args) {
        //try {
//
        //    System.out.println("南无观世音菩萨摩诃萨");
        //    method1();
        //    System.out.println("南无大势至菩萨摩诃萨");
        //}catch (Exception E){
        //    System.out.println("南无药师琉璃光如来");
        //}finally {
        //    System.out.println("南无日光遍照菩萨");
        //}
        //System.out.println("南无月光遍照菩萨");
        new ExceptionDemo().method2();

    }
}
