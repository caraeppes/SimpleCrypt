import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.IOException;


@SuppressWarnings("deprecation")
public class FileEncryptorTests {

    @Test
    public void encryptFileCipherBZTest() throws IOException {
        // Given
        Cipher cipher = new Cipher('b', 'z');
        FileEncryptor fileEncryptor = new FileEncryptor(cipher);
        fileEncryptor.readFile("sonnet18.txt");
        String expected = "Qfyjj G amknypc rfcc rm y qskkcp’q byw?\n" +
                "Rfms ypr kmpc jmtcjw ylb kmpc rckncpyrc:\n" +
                "Pmsef uglbq bm qfyic rfc bypjgle zsbq md Kyw,\n" +
                "Ylb qskkcp’q jcyqc fyrf yjj rmm qfmpr y byrc;\n" +
                "Qmkcrgkc rmm fmr rfc cwc md fcytcl qfglcq,\n" +
                "Ylb mdrcl gq fgq emjb amknjcvgml bgkk'b;\n" +
                "Ylb ctcpw dygp dpmk dygp qmkcrgkc bcajglcq,\n" +
                "Zw afylac mp lyrspc’q afylegle amspqc slrpgkk'b;\n" +
                "Zsr rfw crcplyj qskkcp qfyjj lmr dybc,\n" +
                "Lmp jmqc nmqqcqqgml md rfyr dygp rfms mu’qr;\n" +
                "Lmp qfyjj bcyrf zpye rfms uylbcp’qr gl fgq qfybc,\n" +
                "Ufcl gl crcplyj jglcq rm rgkc rfms epmu’qr:\n" +
                "   Qm jmle yq kcl ayl zpcyrfc mp cwcq ayl qcc,\n" +
                "   Qm jmle jgtcq rfgq, ylb rfgq egtcq jgdc rm rfcc.\n";

        // When
        fileEncryptor.encryptFile("cipherEncryptedBZ.enc");
        String actual = FileUtils.readFileToString(new File("cipherEncryptedBZ.enc"));

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void decryptFileCipherBZTest() throws IOException {
        // Given
        Cipher cipher = new Cipher('b', 'z');
        FileEncryptor fileEncryptor = new FileEncryptor(cipher);
        fileEncryptor.readFile("cipherEncryptedBZ.enc");
        String expected = FileUtils.readFileToString(new File("sonnet18.txt"));

        // When
        fileEncryptor.decryptFile("cipherDecryptedBZ.txt");
        String actual = FileUtils.readFileToString(new File("cipherDecryptedBZ.txt"));

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void encryptFileCipherANTest() throws IOException {
        // Given
        Cipher cipher = new Cipher('a', 'n');
        FileEncryptor fileEncryptor = new FileEncryptor(cipher);
        fileEncryptor.readFile("sonnet18.txt");
        String expected =
                "Funyy V pbzcner gurr gb n fhzzre’f qnl?\n" +
                        "Gubh neg zber ybiryl naq zber grzcrengr:\n" +
                        "Ebhtu jvaqf qb funxr gur qneyvat ohqf bs Znl,\n" +
                        "Naq fhzzre’f yrnfr ungu nyy gbb fubeg n qngr;\n" +
                        "Fbzrgvzr gbb ubg gur rlr bs urnira fuvarf,\n" +
                        "Naq bsgra vf uvf tbyq pbzcyrkvba qvzz'q;\n" +
                        "Naq rirel snve sebz snve fbzrgvzr qrpyvarf,\n" +
                        "Ol punapr be angher’f punatvat pbhefr hagevzz'q;\n" +
                        "Ohg gul rgreany fhzzre funyy abg snqr,\n" +
                        "Abe ybfr cbffrffvba bs gung snve gubh bj’fg;\n" +
                        "Abe funyy qrngu oent gubh jnaqre’fg va uvf funqr,\n" +
                        "Jura va rgreany yvarf gb gvzr gubh tebj’fg:\n" +
                        "   Fb ybat nf zra pna oerngur be rlrf pna frr,\n" +
                        "   Fb ybat yvirf guvf, naq guvf tvirf yvsr gb gurr.\n";

        // When
        fileEncryptor.encryptFile("cipherEncryptedAN.enc");
        String actual = FileUtils.readFileToString(new File("cipherEncryptedAN.enc"));

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void decryptFileCipherANTest() throws IOException {
        // Given
        Cipher cipher = new Cipher('a', 'n');
        FileEncryptor fileEncryptor = new FileEncryptor(cipher);
        fileEncryptor.readFile("cipherEncryptedAN.enc");
        String expected = FileUtils.readFileToString(new File("sonnet18.txt"));

        // When
        fileEncryptor.decryptFile("cipherDecryptedAN.txt");
        String actual = FileUtils.readFileToString(new File("cipherDecryptedAN.txt"));

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void encryptFileCipherQUTest() throws IOException {
        // Given
        Cipher cipher = new Cipher('Q', 'U');
        FileEncryptor fileEncryptor = new FileEncryptor(cipher);
        fileEncryptor.readFile("sonnet18.txt");
        String expected =
                "Wlepp M gsqtevi xlii xs e wyqqiv’w hec?\n" +
                "Xlsy evx qsvi pszipc erh qsvi xiqtivexi:\n" +
                "Vsykl amrhw hs wleoi xli hevpmrk fyhw sj Qec,\n" +
                "Erh wyqqiv’w piewi lexl epp xss wlsvx e hexi;\n" +
                "Wsqixmqi xss lsx xli ici sj liezir wlmriw,\n" +
                "Erh sjxir mw lmw ksph gsqtpibmsr hmqq'h;\n" +
                "Erh izivc jemv jvsq jemv wsqixmqi higpmriw,\n" +
                "Fc glergi sv rexyvi’w glerkmrk gsyvwi yrxvmqq'h;\n" +
                "Fyx xlc ixivrep wyqqiv wlepp rsx jehi,\n" +
                "Rsv pswi tswwiwwmsr sj xlex jemv xlsy sa’wx;\n" +
                "Rsv wlepp hiexl fvek xlsy aerhiv’wx mr lmw wlehi,\n" +
                "Alir mr ixivrep pmriw xs xmqi xlsy kvsa’wx:\n" +
                "   Ws psrk ew qir ger fviexli sv iciw ger wii,\n" +
                "   Ws psrk pmziw xlmw, erh xlmw kmziw pmji xs xlii.\n";

        // When
        fileEncryptor.encryptFile("cipherEncryptedQU.enc");
        String actual = FileUtils.readFileToString(new File("cipherEncryptedQU.enc"));

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void decryptFileCipherQUTest() throws IOException {
        // Given
        Cipher cipher = new Cipher('Q', 'U');
        FileEncryptor fileEncryptor = new FileEncryptor(cipher);
        fileEncryptor.readFile("cipherEncryptedQU.enc");
        String expected = FileUtils.readFileToString(new File("sonnet18.txt"));

        // When
        fileEncryptor.decryptFile("cipherDecryptedQU.txt");
        String actual = FileUtils.readFileToString(new File("cipherDecryptedQU.txt"));

        // Then
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void encryptFileROT13Test() throws IOException {
        // Given
        ROT13 rot13 = new ROT13();
        FileEncryptor fileEncryptor = new FileEncryptor(rot13);
        fileEncryptor.readFile("sonnet18.txt");
        String expected = FileUtils.readFileToString(new File("cipherEncryptedAN.enc"));

        // When
        fileEncryptor.encryptFile("ROT13encrypted.enc");
        String actual = FileUtils.readFileToString(new File("ROT13encrypted.enc"));

        // Then
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void decryptFileROT13Test() throws IOException {
        // Given
        ROT13 rot13 = new ROT13();
        FileEncryptor fileEncryptor = new FileEncryptor(rot13);
        fileEncryptor.readFile("ROT13encrypted.enc");
        String expected = FileUtils.readFileToString(new File("sonnet18.txt"));

        // When
        fileEncryptor.decryptFile("ROT13decrypted.txt");
        String actual = FileUtils.readFileToString(new File("ROT13decrypted.txt"));

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void encryptFileCaesarCipherTest() throws IOException {
        // Given
        CaesarCipher caesarCipher = new CaesarCipher();
        FileEncryptor fileEncryptor = new FileEncryptor(caesarCipher);
        fileEncryptor.readFile("sonnet18.txt");
        String expected =
                "Wlepp M gsqtevi xlii xs e wyqqiv’w hec?\n" +
                        "Xlsy evx qsvi pszipc erh qsvi xiqtivexi:\n" +
                        "Vsykl amrhw hs wleoi xli hevpmrk fyhw sj Qec,\n" +
                        "Erh wyqqiv’w piewi lexl epp xss wlsvx e hexi;\n" +
                        "Wsqixmqi xss lsx xli ici sj liezir wlmriw,\n" +
                        "Erh sjxir mw lmw ksph gsqtpibmsr hmqq'h;\n" +
                        "Erh izivc jemv jvsq jemv wsqixmqi higpmriw,\n" +
                        "Fc glergi sv rexyvi’w glerkmrk gsyvwi yrxvmqq'h;\n" +
                        "Fyx xlc ixivrep wyqqiv wlepp rsx jehi,\n" +
                        "Rsv pswi tswwiwwmsr sj xlex jemv xlsy sa’wx;\n" +
                        "Rsv wlepp hiexl fvek xlsy aerhiv’wx mr lmw wlehi,\n" +
                        "Alir mr ixivrep pmriw xs xmqi xlsy kvsa’wx:\n" +
                        "   Ws psrk ew qir ger fviexli sv iciw ger wii,\n" +
                        "   Ws psrk pmziw xlmw, erh xlmw kmziw pmji xs xlii.\n";

        // When
        fileEncryptor.encryptFile("caesarEncrypted.enc");
        String actual = FileUtils.readFileToString(new File("caesarEncrypted.enc"));

        // Then
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void decryptFileCaesarCipherTest() throws IOException {
        // Given
        CaesarCipher caesarCipher = new CaesarCipher();
        FileEncryptor fileEncryptor = new FileEncryptor(caesarCipher);
        fileEncryptor.readFile("caesarEncrypted.enc");
        String exptected = FileUtils.readFileToString(new File("sonnet18.txt"));

        // When
        fileEncryptor.decryptFile("caesarDecrypted.txt");
        String actual = FileUtils.readFileToString(new File("caesarDecrypted.txt"));

        // Then
        Assert.assertEquals(exptected, actual);
    }
}
