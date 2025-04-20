public class EnigmaGUI {

    public static void main(String[] args) {
        EnigmaFrame enigmaFrame = new EnigmaFrame();

        enigmaFrame.getEncryptButton().addActionListener(e -> {
            String[] inputArgs = {
                enigmaFrame.getInner(),
                enigmaFrame.getMiddle(),
                enigmaFrame.getOuter(),
                enigmaFrame.getInitialPosition(),
                "encrypt",
                enigmaFrame.getInputText().toUpperCase()
            };

            enigmaFrame.setOutputText(Comms.run(inputArgs));
        });

        enigmaFrame.getDecryptButton().addActionListener(e -> {
            String[] inputArgs = {
                enigmaFrame.getInner(),
                enigmaFrame.getMiddle(),
                enigmaFrame.getOuter(),
                enigmaFrame.getInitialPosition(),
                "decrypt",
                enigmaFrame.getInputText().toUpperCase()
            };

            enigmaFrame.setOutputText(Comms.run(inputArgs));
        });

    }
}