class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> map = new HashMap<>();

        for (String word : strs) {

            int[] counts = new int[26];

            for (char c : word.toCharArray()) {
                counts[c - 'a']++;
            }

            StringBuilder sb = new StringBuilder();

            for (int n : counts) {
                sb.append(n).append('#');
            }

            map.computeIfAbsent(sb.toString(),
                k -> new ArrayList<>()).add(word);
        }

        return new ArrayList<>(map.values());
    }
}