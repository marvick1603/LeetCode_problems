// Given two strings s and t, return true if t is an anagram of s, and false otherwise.
// An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
class Solution {
    public boolean isAnagram(String s, String t) {
        int[] s1= new int[s.length()];
for(int i=0;i<s.length();i++){
s1[i]=(int)s.charAt(i);
}
 int[] s2= new int[t.length()];
for(int i=0;i<t.length();i++){
s2[i]=(int)t.charAt(i);
}
 int n = s.length();
 int n1=t.length();

        quickSort(s1, 0, n - 1);
          quickSort(s2, 0, n1 - 1);
           if (s1.length != s2.length) {
            return false;
        }
  for (int i = 0; i < s1.length; i++) {
            if (s1[i] != s2[i]) {
                return false;
            }
        }

        return true;

    }
       public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);

            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
        
    }
  
}
