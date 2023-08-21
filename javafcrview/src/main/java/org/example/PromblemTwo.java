package org.example;

import java.util.HashMap;
import java.util.Map;

public class PromblemTwo {
    public static void main(String[] args) {
        Map<Integer,Integer> map = new HashMap<>();
        int data[] ={1,2,3,4,5,8,7,9,6,4};
        int x =6;
        //==========O(n^2)
//        for(int i=0 ; i<data.length;i++){
//            int check = data[i];
//            for (int v=0 ; v< data.length;v++){
//                if(check+data[v] == x) {
//                    System.out.println(i +" , " + v);
//                }
//            }
//        }
        for (int i = 0; i < data.length; i++) {
            int v = data[i];
            int require = x-v;//บวกกันได้ 6 6-4 =2
            if (map.get(require) == null){
                map.put(v,i);//สร้าง valueและkey [1,0]
            }else{
                System.out.println("("+i+","+map.get(require)+")");
                map.put(v,i);
            }
        }
//        System.out.println("testForEach=============");
//        for(int v : data){
//
//            System.out.println(v);
//        }
    }

}
