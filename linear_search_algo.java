class Arrays {
    void SearchInArrays() {
        int[] arr = {18, 15, 9, 8, 66, 6, 0, 4, 3,6};
        int x = 6;
        int ans = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                ans = i;
                break;
            }

        }
        System.out.println("found " + x + " at index "  +ans);


    }
    }


    public class linear_search_algo {
        public static void main(String[] args) {
            Arrays obj = new Arrays();
            obj.SearchInArrays();

        }
    }
