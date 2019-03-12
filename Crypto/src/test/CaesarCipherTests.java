import org.junit.Assert;
import org.junit.Test;

public class CaesarCipherTests {


    @Test
    public void encryptTest1(){
        // Given
        CaesarCipher caesarCipher = new CaesarCipher();
        String string = "~w0w~cRyPt";
        String expected = "~a0a~gVcTx";

        // When
        String actual = caesarCipher.encrypt(string);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void decryptTest1(){
        // Given
        CaesarCipher caesarCipher = new CaesarCipher();
        String string = "~a0a~gVcTx";
        String expected = "~w0w~cRyPt";


        // When
        String actual = caesarCipher.decrypt(string);

        // Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void encryptTest2(){
        // Given
        CaesarCipher caesarCipher = new CaesarCipher();
        String string = "enCryPt!";
        String expected = "irGvcTx!";

        // When
        String actual = caesarCipher.encrypt(string);

        // Then
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void decryptTest2(){
        // Given
        CaesarCipher caesarCipher = new CaesarCipher();
        String string = "irGvcTx!";
        String expected = "enCryPt!";

        // When
        String actual = caesarCipher.decrypt(string);

        // Then
        Assert.assertEquals(expected, actual);
    }
}
