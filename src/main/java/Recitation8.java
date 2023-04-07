public class Recitation8 {
    /*
     * You may add any private helper method you see necessary,
     * but you may NOT change the signatures of the methods below.
     */

    private int findMin(int[] arr, int startIndex, int endIndex){
        int min = arr[startIndex];
        for (int i = startIndex + 1; i <= endIndex; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
    public static boolean lastItemReachable(int[] hopList){
        int currentIndex = 0;
        int lastIndex = hopList.length - 1;

        while (currentIndex < lastIndex) {
            int hops = hopList[currentIndex];

            if (hops == 0) {
                return false;
            }

            currentIndex += hops;

            if (currentIndex > lastIndex) {
                return false;
            }
        }

        return true;
    }

    public static int[] slidingWindowMin(int[] numberList, int windowSize){
        if (windowSize <= 0 || windowSize > numberList.length) {
            return new int[0];
        }

        int[] result = new int[numberList.length - windowSize + 1];

        for (int i = 0; i <= numberList.length - windowSize; i++) {
            int min = numberList[i];

            for (int j = i + 1; j < i + windowSize; j++) {
                if (numberList[j] < min) {
                    min = numberList[j];
                }
            }

            result[i] = min;
        }

        return result;
    }
}
