class Solution {

    public String encode(List<String> strs) {
        StringBuilder s=new StringBuilder();
        for(String st:strs){
            s.append(st.length()).append('#').append(st); //len(word)#word
        }
        return s.toString();
    }

    public List<String> decode(String str) {
        List<String> st=new ArrayList<>();
        int i=0;
        while(i<str.length()){
            int j=i;
            while(str.charAt(j)!='#'){ //check if the pointer reaches #
                j++;
            }
            int len=Integer.parseInt(str.substring(i,j)); //length of the substring
            i=j+1;
            j=i+len;
            st.add(str.substring(i,j));
            i=j;
        }
        return st;
    }
}
