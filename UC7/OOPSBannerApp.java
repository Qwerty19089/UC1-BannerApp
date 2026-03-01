public class OOPSBannerApp {

    /**
     * Inner static class to map a character to its ASCII banner pattern
     */
    static class CharacterPatternMap {
        private final char character;
        private final String[] pattern;

        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    /**
     * Creates character-pattern mappings for O, P, S and space
     */
    public static CharacterPatternMap[] createCharacterPatternMaps() {
        return new CharacterPatternMap[] {
            new CharacterPatternMap('O', new String[] {
                "   ***   ",
                " **   ** ",
                "**     **",
                "**     **",
                "**     **",
                " **   ** ",
                "   ***   "
            }),
            new CharacterPatternMap('P', new String[] {
                "******   ",
                "**    ** ",
                "**     **",
                "**    ** ",
                "******   ",
                "**       ",
                "**       "
            }),
            new CharacterPatternMap('S', new String[] {
                "   ***** ",
                " **      ",
                "**       ",
                "  *****  ",
                "      ** ",
                " **   ** ",
                "  *****  "
            }),
            new CharacterPatternMap(' ', new String[] {
                "         ",
                "         ",
                "         ",
                "         ",
                "         ",
                "         ",
                "         "
            })
        };
    }

    /**
     * Returns the pattern for a given character
     */
    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] maps) {
        for (CharacterPatternMap map : maps) {
            if (map.getCharacter() == ch) {
                return map.getPattern();
            }
        }
        return null;
    }

    /**
     * Prints the banner message using single space between characters
     */
    public static void printMessage(String message, CharacterPatternMap[] maps) {
        int rows = 7;

        for (int i = 0; i < rows; i++) {
            StringBuilder line = new StringBuilder();

            for (int j = 0; j < message.length(); j++) {
                String[] pattern = getCharacterPattern(message.charAt(j), maps);
                line.append(pattern[i]);

                if (j < message.length() - 1) {
                    line.append(" "); // single space between letters
                }
            }
            System.out.println(line);
        }
    }

    /**
     * Main method
     */
    public static void main(String[] args) {
        CharacterPatternMap[] charMaps = createCharacterPatternMaps();
        printMessage("OOPS", charMaps);
    }
}