public class WordAnalyzerTesterBum {
    public static void main(String[] args) {
        test("aardvark"); // expect: a
        test("roommate"); // expect: o (not m)
        test("mate"); // expect: 0 (no duplicate letters)
        test("mississippi"); // expect: i (multiple letters)
        test(""); // expect: 0 (empty string)
    }

    public static void test(String s) {
        WordAnalyzer wa = new WordAnalyzer(s);
        char result = wa.firstRepeatedCharacter();
        if (result == 0) {
            System.out.println("No repeated character in \"" + s + "\".");
        } else {
            System.out.println("First repeated character in \"" + s + "\" = " + result);
        }
    }
}