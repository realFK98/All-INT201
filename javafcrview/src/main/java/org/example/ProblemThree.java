package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;



public class ProblemThree {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("data.txt");

        Scanner sc = new Scanner(file);
        Map<String, List<Integer>> map = new HashMap<>(125);
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
//            System.out.println(line);
            int wordIndex = 0;
            StringTokenizer stk = new StringTokenizer(line," .,?():"); //ตัวไว้แยกคำ (ตัวตรวจ,เงื่อนไข)
            while (stk.hasMoreElements()){
                String word = stk.nextToken();
                if(map.get(word) == null) {
                    map.put(word,new LinkedList<Integer>());
                }
                map.get(word).add(++wordIndex);
                }
            }
        sc.close();
//        System.out.println(map);
        for(Map.Entry<String,List<Integer>> entry : map.entrySet()){
            System.out.print(entry.getKey()+"("+entry.getValue().size()+"): ");
            for(Integer position : entry.getValue()){
                System.out.print("@"+ position+"  ");
            }
            System.out.println();
        }
        System.out.println("========================");
        System.out.println((map.entrySet()));
        System.out.println(map);
        }


    }

