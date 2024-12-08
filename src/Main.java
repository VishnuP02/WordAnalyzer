public class Main {
    public static void main(String[] args) {
        // Testing the WordAnalyzer functionality
        System.out.println("Testing WordAnalyzer:");

        // Example strings to analyze
        String[] testWords = {"aardvark", "roommate", "mate", "mississippi", ""};

        // Loop through test words
        for (String word : testWords) {
            WordAnalyzer analyzer = new WordAnalyzer(word);
            char firstRepeated = analyzer.firstRepeatedCharacter();
            char firstMultiple = analyzer.firstMultipleCharacter();
            int repeatedGroups = analyzer.countRepeatedCharacters();

            // Display results
            System.out.println("Word: \"" + word + "\"");
            System.out.println("  First Repeated Character: " + (firstRepeated == 0 ? "None" : firstRepeated));
            System.out.println("  First Multiple Character: " + (firstMultiple == 0 ? "None" : firstMultiple));
            System.out.println("  Count of Repeated Character Groups: " + repeatedGroups);
            System.out.println();
        }
    }
}