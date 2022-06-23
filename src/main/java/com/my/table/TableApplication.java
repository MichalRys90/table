package com.my.table;

import java.util.*;

public class TableApplication {
    public static void main(String[] args) throws Exception {
        Random random = new Random();
        int[] array = new int[20];
        for(int i=0; i < array.length; i++){
            array[i] = random.nextInt(11);
        }
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        Map<Integer, Integer> repetitions = new HashMap<Integer, Integer>();

        for (int i=0; i<array.length; i++) {
            int key = array[i];
            if (repetitions.containsKey(key)) {
                repetitions.put(key, repetitions.get(key) + 1);
            } else {
                repetitions.put(key, 1);
            }
        }

        StringBuilder sb = new StringBuilder();

        int overAllCount = 0;

        for (Map.Entry<Integer, Integer> e : repetitions.entrySet()) {
            if (e.getValue() > 0) {
                overAllCount ++;

                sb.append("\n");
                sb.append(e.getKey());
                sb.append(": ");
                sb.append(e.getValue());
                sb.append(" times");
            }
        }

        if (overAllCount > 0) {
            sb.insert(0, " repeated numbers:");
            sb.insert(0, overAllCount);
            sb.insert(0, "There are ");
        }

        System.out.print(sb.toString());

        Set<Integer>hashSet = new HashSet<Integer>();

        for(int i=0; i < array.length; i++){
            for (int j=0; j < array.length-1; j++){
                if(array[i]==array[j]){
                    hashSet.add(array[j]);
                }
            }

        }
        System.out.println("\n" + hashSet);


    }
}
