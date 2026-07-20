class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> c=new HashMap<>();
        for(int n:nums){
            c.put(n,c.getOrDefault(n,0)+1);
        }    
        List<int[]>arr=new ArrayList<>();
        for(Map.Entry<Integer,Integer> ent:c.entrySet() ){
            arr.add(new int[]{ent.getValue(),ent.getKey()});
        }
        arr.sort((a,b)->b[0]-a[0]);
        int[] res=new int[k];
        for(int i=0;i<k;i++){
            res[i]=arr.get(i)[1];
        }
        return res;
    }
}
