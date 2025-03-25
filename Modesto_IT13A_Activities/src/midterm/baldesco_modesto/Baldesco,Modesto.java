package baldesco.modesto;


public class baldesco.modesto {

    public static void main(String[] args) {

        int[][] array = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };

        for (int i = 0; i < array.length; i++) {
            System.out.print("The elements in Row " + (i + 1) + " : ");
            for (int num : array[i]) {
                System.out.print(num + "");
            }
            System.out.println();

        }
    }
}
