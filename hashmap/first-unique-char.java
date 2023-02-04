//First unique character in a string

class Solution {
    public int firstUniqChar(String s) {
        TreeMap<Character, Integer> map = new TreeMap<>();
        int flag = 0;
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(!map.containsKey(ch)){
                map.put(ch, 1);
            }else{
                map.put(ch, map.get(ch) + 1);
            }
        }
        int min = 1111111;
         for (Map.Entry<Character, Integer> mapElement : map.entrySet()){
             if(mapElement.getValue() == 1){
                int i = s.indexOf(mapElement.getKey());
                if(i < min){
                    min = i;
                    flag = 1;
                }
            }
        }
        if(flag == 1){
            return min;
        }
        return -1;
    }
}
