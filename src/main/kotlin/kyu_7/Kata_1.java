package kyu_7;

public class Kata_1 {
    public static int consonantCount(String str) {

        int count = 0;

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) != 'a' ||
                    str.charAt(i) != 'e' ||
                    str.charAt(i) != 'i' ||
                    str.charAt(i) != 'o' ||
                    str.charAt(i) != 'u'
            ) {
//                count += 1;
                System.out.println("consonant");
            } else {
                System.out.println("vowel");
            }
        }

        return count;
    }

    public static void main(String[] args) {

        System.out.println("Consonants " + consonantCount("aeiouuu"));
    }
}
















