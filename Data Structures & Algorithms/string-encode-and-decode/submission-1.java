class Solution {

    public String encode(List<String> strs) {

        StringBuilder sb=new StringBuilder();
        for(String str:strs)
        {
            sb.append(str.length());
            sb.append("#");
            sb.append(str);
            
        }
        return sb.toString();

    }

    public List<String> decode(String str) {
        List<String> result=new ArrayList();

        int i=0;
        //int j=i;
        while(i<str.length())
        {
            int j=i;
            while(str.charAt(j)!='#')
            {
                j++;
            }
            int length = Integer.parseInt(str.substring(i,j));

            String s = str.substring(j+1,j+1+length);
            result.add(s);

            i=j+1+length;
        }
        return result;

    }
}
