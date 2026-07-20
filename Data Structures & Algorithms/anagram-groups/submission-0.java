class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> m=new HashMap<>();
        for(String s:strs){
            int[] count=new int[26]; //int arr
            for(char i:s.toCharArray()){
                count[i-'a']++;
            }
            String ca=Arrays.toString(count);
            m.putIfAbsent(ca,new ArrayList<>());
            m.get(ca).add(s);
        }
        return new ArrayList<>(m.values());
    }
}
