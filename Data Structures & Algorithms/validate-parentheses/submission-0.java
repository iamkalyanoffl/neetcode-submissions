class Solution {
    public boolean isValid(String s) {
        HashMap <Character,Character> map=new HashMap<>();
        map.put('(',')');
        map.put('[',']');
        map.put('{','}');
        Stack <Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char curr=s.charAt(i);
            if(map.keySet().contains(curr)){
                st.push(curr);
            }
            if(map.values().contains(curr)){
                if(!st.empty() && map.get(st.peek())==curr){
                    st.pop();
                }
                else
                    return false;
            }
        }
        return st.empty();
    }
}

