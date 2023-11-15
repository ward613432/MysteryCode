public class Main {
    static String lastPhrase = "programming is easy";
    static String currentPhrase = "";
    static String currentCharacter;

    public static void main(String[] args) {
        // First edit
        RemoveSpaces();
        ResetStrings();

        // Second edit (even chars become uppercase, odd chars become lowercase)
        for (int i = 1; i <= lastPhrase.length(); i++) {
            currentCharacter = lastPhrase.substring(i - 1, i);
            if (i % 2 == 0) {
                currentCharacter = currentCharacter.toUpperCase();
            } else {
                currentCharacter = currentCharacter.toLowerCase();
            }
            currentPhrase += currentCharacter + " ";
        }
        ResetStrings();
        System.out.println(lastPhrase);

        // Third edit
        RemoveSpaces();
        ResetStrings();
        System.out.println(lastPhrase);

        // Fourth+ edit (keeps trimming down the characters
        while (lastPhrase.length() > 1) {
            for (int j = 0; j < lastPhrase.length(); j+=2) {
                currentPhrase += lastPhrase.substring(j, j + 1);
            }
            ResetStrings();
            System.out.println(lastPhrase);
        }
    }

    static void RemoveSpaces() {
        for(int i = 0; i < lastPhrase.length(); i++){
            if(!lastPhrase.substring(i, i+1).equals(" ")){
                currentPhrase += lastPhrase.substring(i, i + 1);
            }
        }
    }

    static void ResetStrings(){
        lastPhrase = currentPhrase;
        currentPhrase = "";
    }
}
