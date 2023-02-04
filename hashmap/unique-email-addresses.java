class Solution {
    public int numUniqueEmails(String[] emails) {
        HashMap<String, Integer> map = new HashMap<>();

        for(int i = 0; i < emails.length; i++){
            String st = emails[i];
            int at = st.indexOf("@");
            String str = st.substring(0,at);
            str = st.replace(".", "");
            st = str + st.substring(at);
            // String st = emails[i];
            // int at = st.indexOf("@");

            // if(st.indexOf('.') < at){
            //     st.replace(".", "");
            // }

            at = st.indexOf("@");
            int plusi = st.indexOf("+");
            if(plusi != -1 && plusi < at){
                st = st.substring(0, plusi) + st.substring(at);
            }

            map.put(st, i);
            // System.out.println(st);
        }
        int size = map.size();
        return size;
    }
}