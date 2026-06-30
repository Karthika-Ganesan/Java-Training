import java.util.*;

class Valid {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;

        int count[] = new int[26];

        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        for (int i = 0; i < 26; i++) {
            if (count[i] != 0)
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String s = sc.next();

        System.out.print("Enter second string: ");
        String t = sc.next();

        Solution obj = new Solution();

        if (obj.isAnagram(s, t))
            System.out.println("Anagram");
        else
            System.out.println("Not an Anagram");

        sc.close();
    }
}