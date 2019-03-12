public class CaesarCipher extends Cipher {

    CaesarCipher() {
        setShift(4);
        setDecryptShift(22);
    }

    public String encrypt(String text) {
        return crypt(text, getShift());
    }

    public String decrypt(String text) {
        return crypt(text, getDecryptShift());
    }

}

