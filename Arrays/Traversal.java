package Arrays;

public class Traversal {
    public static void traversal(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        traversal(arr);
    }
}
