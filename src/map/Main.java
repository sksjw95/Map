package map;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        // HashMap 생성
        HashMap<String, Integer> map = new HashMap<>();

        // Entry 객체 저장
        map.put("피카츄", 85);
        map.put("꼬부기", 95);
        map.put("야도란", 75);
        map.put("파이리", 65);
        map.put("피존투", 15);

        //저장된 총 Entry 수 얻기
        System.out.println("총 entry 수: " + map.size());

        //객체 찾기
        System.out.println("파이리 : " + map.get("파이리"));

        // key를 요소로 가지는 set을 생성 -> 아래에서 순회하기 위해 필요하다.
        Set<String> keySet = map.keySet();

        // KeySet을 순화하면서 value를 읽는다.
        Iterator<String> keyIterator = keySet.iterator();
        while (keyIterator.hasNext()){
            String key = keyIterator.next();
            Integer value = map.get(key);
            System.out.println(key + ":" + value);
        }
        // 객체 삭제
        System.out.println(map.remove("피존투"));
        System.out.println(map);
        System.out.println("총 entry 수 : " + map.size());

        // Entry 객체를 요소로 가지는 set을 생성 -> 아래에서 순회하기 위해 필요합니다.
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();

        // entrySet을 순회하면서 value를 읽어옵니다.
        Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
        while (entryIterator.hasNext()){
            Map.Entry<String, Integer> entry = entryIterator.next();
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key+ ":" + value);
        }



    }
}