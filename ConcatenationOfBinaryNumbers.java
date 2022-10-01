class Solution {
    public int concatenatedBinary(int n) {
        long conc=1;
        int size=1;
        
        for(int i=2;i<=n;i++) {
            if((i & (i-1))==0)
                ++size;
            conc = (conc<<size) | i;
            conc = conc%1000000007;
        }
        return (int)conc;
    }
}
