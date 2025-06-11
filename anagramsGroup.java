class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> result = new HashMap<>();

        for (int i = 0; i < strs.length; ++i){
            char[] charArray = strs[i].toCharArray();
            Arrays.sort(charArray);
            String sortedWord = String.valueOf(charArray);
            result.computeIfAbsent(sortedWord, key -> new ArrayList<>()).add(strs[i]);

        }

        return new ArrayList<>(result.values());
    }
}
