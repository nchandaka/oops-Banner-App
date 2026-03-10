public class OOPSBannerAppUC7 {

    // Static Inner Class to store character and pattern
    static class CharacterPatternMap {

        private char character;
        private String[] pattern;

        // Constructor
        CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        // Getter
        public String[] getPattern() {
            return pattern;
        }
    }

    public static void main(String[] args) {

        // Create pattern objects
        CharacterPatternMap O = new CharacterPatternMap('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        CharacterPatternMap P = new CharacterPatternMap('P', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                " ***** ",
                "*      ",
                "*      ",
                "*      "
        });

        CharacterPatternMap S = new CharacterPatternMap('S', new String[]{
                " ***** ",
                "*      ",
                "*      ",
                " ***** ",
                "      *",
                "      *",
                " ***** "
        });

        String[] OPattern = O.getPattern();
        String[] PPattern = P.getPattern();
        String[] SPattern = S.getPattern();

        // Print banner
        for (int i = 0; i < 7; i++) {
            System.out.println(OPattern[i] + "   " + OPattern[i] + "   " + PPattern[i] + "   " + SPattern[i]);
        }
    }
}