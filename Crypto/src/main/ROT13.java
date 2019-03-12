

public class ROT13 extends Cipher{


    ROT13(Character cs, Character cf) {
        super(cs, cf);
        setShift(13);
        setDecryptShift(13);
    }

    ROT13() {
        setShift(13);
        setDecryptShift(13);
    }

    public String crypt(String string) {
        return crypt(string, getShift());
    }

    public String encrypt(String text) {
        return crypt(text, getShift());
    }

    public String decrypt(String text) {
        return crypt(text, getShift());
    }

    public static String rotate(String s, Character c) {
        String rotatedString = s;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == c){
                rotatedString = s.substring(i) + s.substring(0, i);
            }
        }
        return rotatedString;
    }
}
