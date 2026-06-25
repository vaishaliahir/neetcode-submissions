class Solution {
    public int longestConsecutive(int[] nums) 
    {
        int longestlength=0;
        HashMap<Integer,Boolean> mp=new HashMap<>();
        for(int num:nums)
        {
            mp.put(num,Boolean.FALSE);
        }
        for(int num:nums)
        {
            int currentlength=1;
            int nextnum=num+1;

            while(mp.containsKey(nextnum)&&mp.get(nextnum)==false)
            {
                currentlength++;
                mp.put(nextnum,Boolean.TRUE);
                nextnum++;
            }
            int prevnum=num-1;
            while(mp.containsKey(prevnum)&& !mp.get(prevnum))
            {
                currentlength++;
                mp.put(prevnum,Boolean.TRUE);
                prevnum--;
            }
            longestlength=Math.max(longestlength,currentlength);

        }
        return longestlength;
    }
}
