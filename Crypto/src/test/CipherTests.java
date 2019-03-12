import org.junit.Assert;
import org.junit.Test;

public class CipherTests {

    @Test
    public void CipherConstructorTest() {
        // Given
        Character cs = 'b';
        Character cf = 'h';
        int expectedShift = 6;

        // When
        Cipher cipher = new Cipher(cs, cf);
        int actualShift = cipher.getShift();

        // Then
        Assert.assertEquals(expectedShift, actualShift);
    }

    @Test
    public void shiftCharacterNonAlphabeticTest(){
        // Given
        Cipher cipher = new Cipher();
        char c = '4';
        char expected = c;

        // When
        char actual = cipher.shiftCharacter(c, 3);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shiftCharacterUpperCaseTest(){
        // Given
        Cipher cipher = new Cipher();
        char c = 'G';
        char expected = 'B';

        // When
        char actual = cipher.shiftCharacter(c, 21);

        // Then
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void shiftCharacterLowerCaseTest(){
        // Given
        Cipher cipher = new Cipher();
        char c = 'j';
        char expected = 'x';

        // When
        char actual = cipher.shiftCharacter(c, 14);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void cryptTest(){
        // Given
        Cipher cipher = new Cipher('b', 'c');
        String string = "$cAra$";
        String expected = "$dBsb$";

        // When
        String actual = cipher.crypt(string, cipher.getShift());

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void encryptTest(){
        // Given
        Cipher cipher = new Cipher('e', 'j');
        String string = "Cipher%";
        String expected = "Hnumjw%";

        // When
        String actual = cipher.encrypt(string, cipher.getShift());

        // Then
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void decryptTest(){
        // Given
        Cipher cipher = new Cipher('e', 'j');
        String string = "Hnumjw%";
        String expected = "Cipher%";

        // When
        String actual = cipher.decrypt(string, cipher.getDecryptShift());

        // Then
        Assert.assertEquals(expected, actual);
    }
}
