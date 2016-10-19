package kewai.xianxi.java;

import java.awt.datatransfer.StringSelection;
import java.util.ArrayList;

/**
 * Created by Administrator on 2016/10/18 0018.
 */
public class ClassCastExceptionTest {
    public static void main(String[] args) {

    ArrayList arrayList=new ArrayList();
        arrayList.add(1);
        System.out.println(arrayList);
        String s=(String) arrayList.get(0);
    }




}
