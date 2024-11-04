public class l4{
    public static void main (String[]args){
      
      //Swapping two arrays:
      
    Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the arrays: ");
        int size = scanner.nextInt();

        int[] arr1 = new int[size];
        int[] arr2 = new int[size];

        System.out.println("Enter elements for the first array:");
        for (int i = 0; i < size; i++) {
            arr1[i] = scanner.nextInt();
        }
        System.out.println("Enter elements for the second array:");
        for (int i = 0; i < size; i++) {
            arr2[i] = scanner.nextInt();
        }
        for (int i = 0; i < size; i++) {
            int temp = arr1[i];
            arr1[i] = arr2[i];
            arr2[i] = temp;
        }
        System.out.println("After swapping:");
        System.out.println("First array: " + Arrays.toString(arr1));
        System.out.println("Second array: " + Arrays.toString(arr2));

        scanner.close();            
    }
}
