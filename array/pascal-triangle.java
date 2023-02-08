class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();

        for(int i = 0; i < numRows; i++){
            List<Integer> al = new ArrayList<>();
            for(int j = 0; j <= i; j++){
                if(j == 0) {
                    al.add(1);
                } 
                if(j == i){
                    if(j != 0){
                        al.add(1);
                    }
                    list.add(al);
                    // System.out.println(list);
                    continue;
                }
                // System.out.println(i +" "+ j);
                if(j != 0 && i != 0){
                    al.add(list.get(i-1).get(j-1) + list.get(i-1).get(j));
                }
            }
        }
        return list;
    }
}