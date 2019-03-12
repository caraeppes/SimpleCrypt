public class Cipher {

    private int shift;
    private int decryptShift;

    public Cipher(){}

    public Cipher(Character cs, Character cf) {
        shift = cf - cs;
        decryptShift = 26 - shift;
    }

    public String crypt(String string, int shift) {
        String result = "";
        for (int i = 0; i < string.length(); i++) {
            result += shiftCharacter(string.charAt(i), shift);
        }
        return result;
    }

    public String encrypt(String string, int shift) {
        return crypt(string, shift);
    }

    public String decrypt(String string, int shift) {
        return crypt(string, shift);
    }

    public char shiftCharacter(char c, int shift) {
        if (!Character.isAlphabetic(c)) {
            return c;
        } else {
            if (Character.isUpperCase(c)) {
                return (char) (((c + shift - 65) % 26) + 65);
            } else {
                return (char) (((c + shift - 97) % 26) + 97);
            }
        }
    }

    public int getShift() {
        return shift;
    }

    public void setShift(int shift) {
        this.shift = shift;
    }

    public int getDecryptShift() {
        return decryptShift;
    }

    public void setDecryptShift(int decryptShift) {
        this.decryptShift = decryptShift;
    }
}


