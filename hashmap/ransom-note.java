// Ransom Note

public boolean canConstruct(String ransomNote, String magazine) {
    HashMap<Character, Integer> map1 = new HashMap<>();
    HashMap<Character, Integer> map2 = new HashMap<>();
    char ch;
    for(int i = 0; i < ransomNote.length(); i++){
         ch = ransomNote.charAt(i);
        if(map1.containsKey(ch)){
            map1.put(ch, map1.get(ch) + 1);
        }else{
            map1.put(ch, 1);
        }
    }

    for(int i = 0; i < magazine.length(); i++){
        ch = magazine.charAt(i);
        if(map2.containsKey(ch)){
            map2.put(ch, map2.get(ch) + 1);
        }else{
            map2.put(ch, 1);
        }
    }

    for (Map.Entry<Character,Integer> mapElement : map1.entrySet()) {
        char key = mapElement.getKey();

        // Adding some bonus marks to all the students
        int value = mapElement.getValue();

        if(map2.containsKey(key)){
            if(map2.get(key) < value){
                return false;
            }
        }else{
            return false;
        }
    }

    return true;
}