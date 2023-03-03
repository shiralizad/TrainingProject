import java.util.Arrays;
public class Solution {
    public int gapSolution(int N) {
        int inputNumber = N;
        int maxGap = 0;
        String binaryString = Integer.toBinaryString(inputNumber);
        int gap = 0;
        for (int i = 0 ; i <=binaryString.length()-1; i++)
        {
            if (binaryString.charAt(i) == '1' && gap != 0)
            {
                if(maxGap<gap)
                    maxGap=gap;
                gap = 0;
                //continue;
            }
            else if (binaryString.charAt(i) == '1' && gap == 0)
            {
                //continue;
            }
            else
            {
                gap += 1;
            }
        }
        return maxGap;
    }
    public int OddOccurrencesInArraysolution(int[] A) {
        // Implement your solution here
        Arrays.sort(A);
        int i;
        for(i=0; i< A.length-1; i+=2)
            if(A[i] != A[i+1])
                break;
        return A[i];
    }
}
