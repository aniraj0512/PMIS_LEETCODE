class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int a=image.length;
        for(int i=0;i<a;i++){
           int left=0;
           int right=image[i].length-1;
           while(right>left){
            int temp=image[i][left];
            image[i][left]=image[i][right];
            image[i][right]=temp;
            left++;
            right--;
            }
        }
        for(int i=0;i<a;i++){
            for(int j=0;j<a;j++){
                if(image[i][j]==0){
                    image[i][j]=1;
                }
                else image[i][j]=0;
            }
        }
        return image;
    }
}