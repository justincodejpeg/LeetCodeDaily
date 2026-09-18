class Solution {
    public String mergeAlternately(String word1, String word2) {
        int counter = 0;
        StringBuilder buildingString = new StringBuilder(word1.length() + word2.length());

        while (counter < word1.length() || counter < word2.length()){
            if (counter < word1.length()){
                buildingString.append(word1.charAt(counter));
            }
            if (counter < word2.length()){
                buildingString.append(word2.charAt(counter));
            }
            counter++;
        }

        return buildingString.toString();
    }
}