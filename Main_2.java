class ArraysExample {
    void demoArrays() {
        int[] ages = new int[5];
        float weight[] = new float[3];
        String[] names = {"rahul", "arradhya", "deepak"}; //this is the process of literals of denoting arrays

        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);

        ages[0] = 34;
        ages[1] = 35;
        ages[2] = 40;
        ages[3] = 50;
        ages[4] = 65;


        weight[0] = 12;
        weight[1] = 19;
        weight[2] = 122;


        names[0] = "Ashish";

        System.out.println(ages[0]);
        System.out.println(ages[1]);
        System.out.println(ages[2]);
        System.out.println(ages[3]);
        System.out.println(ages[4]);


        System.out.println(weight[0]);
        System.out.println(weight[1]);
        System.out.println(weight[2]);

        System.out.println(names[0]);


    }

    void MultiArrays() {
        int[][] arr = {{56, 32, 42}, {32, 45, 67}, {46, 78, 98}};
        //to print index wise
        System.out.print(arr[0][0]);
        System.out.print(arr[0][1]);
        System.out.println(arr[0][2]);
        System.out.println(arr[1][0]);
        System.out.println(arr[1][1]);
        System.out.println(arr[1][2]);
        System.out.println(arr[2][0]);
        System.out.println(arr[2][1]);
        System.out.println(arr[2][2]);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.println(arr[i][j]);
            }
        }
    }


// the program of sum of arrays....

    void SumOfArrays() {
        int[] arr = {1, 4, 5, 2, 3};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("sum of arrays:" + sum);
    }


    // greatest in arrays;

    void MaxmOfArrays() {
        int arr[] = {5, 6, 9, 7, 3, 8, 1};

        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];

            }
        }
        System.out.println("maxmium no. is:" + max);
    }


    void SearchInArrays() {
        int[] arr = {18, 15, 9, 8, 66, 6, 0, 4, 3};
        int x = 6;
        int ans = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                ans = i;
            }

        }
        System.out.println("found" + x + "at index" + ans);

    }
}


    public class Main_2 {
        public static void main(String[] args) {
            ArraysExample obj = new ArraysExample();
//obj.MultiArrays();
//        obj.SumOfArrays();
            obj.MaxmOfArrays();

        }
    }
