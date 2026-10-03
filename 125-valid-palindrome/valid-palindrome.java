class Solution {
    public boolean isPalindrome(String s) {
        int leftPointer = 0;
        int rightPointer = s.length()-1;
        String lowercaseString = s.toLowerCase();

        while (leftPointer < rightPointer){
            
            while (leftPointer < rightPointer && !Character.isLetterOrDigit(lowercaseString.charAt(leftPointer))){
                leftPointer++;
            }
            
            while (leftPointer < rightPointer && !Character.isLetterOrDigit(lowercaseString.charAt(rightPointer))){
                rightPointer--;
            }

            if (lowercaseString.charAt(leftPointer) != lowercaseString.charAt(rightPointer)){
                return false;
            }
            leftPointer++;
            rightPointer--;
        }

        return true;
    }
}