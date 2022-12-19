public class dz_1 {
    public static void main(String[] args) throws Exception {
        int[] a = new int[]{1, 5, 21, 45, 56};
        int[] b = new int[]{4, 5, 21, 34, 78};
        int[] result = check(a, b);

        try {
            for(int i = 0; i < result.length; ++i) {
                System.out.print(result[i] + " ");
            }
        } catch (Exception var5) {
            var5.getMessage();
        }

    }

    public static int[] check(int[] arr, int[] arr2) throws Exception {
        if (arr.length != arr2.length) {
            throw new Exception("Массивы не равны");
        } else {
            int[] result = new int[arr.length];

            for(int i = 0; i < result.length; ++i) {
                if (arr[i] < arr2[i]) {
                    result[i] = arr2[i] - arr[i];
                } else {
                    result[i] = arr[i] - arr2[i];
                }
            }

            return result;
        }
    }
}
