import java.util.HashMap;

public class OOPSBannerApp {

    // Create and return character pattern map
    public static HashMap<Character, String[]> createCharacterMap() {
        HashMap<Character, String[]> map = new HashMap<>();

        map.put('O', new String[]{
                "   ***   ",
                " **   ** ",
                "**     **",
                "**     **",
                "**     **",
                " **   ** ",
                "   ***   "
        });

        map.put('P', new String[]{
                "******  ",
                "**    **",
                "**    **",
                "******  ",
                "**      ",
                "**      ",
                "**      "
        });

        map.put('S', new String[]{
                "  ***** ",
                " **      ",
                "**       ",
                "  *****  ",
                "       **",
                " **   ** ",
                "  *****  "
        });

        return map;
    }

    // Display banner for given message
    public static void displayBanner(String message, HashMap<Character, String[]> map) {
        int height = map.get('O').length; // 7 lines

        for (int line = 0; line < height; line++) {
            StringBuilder sb = new StringBuilder();

            for (char ch : message.toCharArray()) {
                sb.append(map.get(ch)[line]).append(" "); // SINGLE space
            }

            System.out.println(sb.toString());
        }
    }

    public static void main(String[] args) {
        HashMap<Character, String[]> charMap = createCharacterMap();
        displayBanner("OOPS", charMap);
    }
}