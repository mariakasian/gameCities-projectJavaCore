package citiesgame;

import static citiesgame.GameWindow.messageArea;

public class IsComputerInvalidLastChar {
    public static char isComputerInvalidLastChar(String lastComputerWord) {
        char lastComputerWordChar = Character.toLowerCase(lastComputerWord.charAt(lastComputerWord.length() - 1));
        if (lastComputerWordChar == 'ь' || lastComputerWordChar == 'и' || lastComputerWordChar == 'й'
                || lastComputerWordChar == 'ї') {
            messageArea.setText("Так як немає міста на літеру '" + lastComputerWordChar
                    + "', то введіть місто на літеру 'і'.");
            lastComputerWordChar = 'І';
        }
        return lastComputerWordChar;
    }
}