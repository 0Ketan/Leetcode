class Solution {
    public int waysToMakeFair(int[] nums) {
        int i,j,n=0,l=nums.length,es=0,os=0,c=0;
        for(i=0;i<l;i++){
            c=0;os=0;es=0;
            for(j=0;j<l;j++){
                
                if(j!=i){
                    if(c%2==0){
                        es+=nums[j];
                        c++;
                    }
                    else{
                        os+=nums[j];
                        c++;
                    }
                }
                
            }
            if(os==es)
                {
                    n++;
                }
        }
        return n;
    }
}