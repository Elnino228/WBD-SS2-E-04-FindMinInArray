public class FindMinInArray {
    public static void main(String[] args) {
        int[] arr={1,2,5,3,-3,7,-5,9};
        int min=arr[0];
        int index=0;
        for (int i=1;i<arr.length;i++){
            if (arr[i]<min){
                min=arr[i];
                index=i;
            }
        }
        System.out.println("The smallest value in array: "+min);
    }
}
