class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        // pep..
        int n = nums2.length;
        Stack<Integer> st = new Stack<>();
        Map<Integer,Integer> mp = new HashMap<>();
        int[] ans = new int[nums1.length];
        mp.put(nums2[n-1],-1);
        st.push(nums2[n-1]);
        for(int i=n-2;i>=0;i--){
            while(st.size()>0 && st.peek()<nums2[i]){
                st.pop();
            }
            if(st.size()==0){
                mp.put(nums2[i],-1);
            }
            else{
                mp.put(nums2[i],st.peek());
            }
            st.push(nums2[i]);
        }
        for(int i=0;i<nums1.length;i++){
            ans[i] = mp.get(nums1[i]);
        }
        return ans;
    }
}