import java.io.*;

public class FileEncryptor {

    private BufferedReader fileReader;
    private BufferedWriter fileWriter;
    private Cipher cipher;

    public FileEncryptor(Cipher cipher) {
        this.cipher = cipher;
    }

    public void readFile(String file) {
        try {
            fileReader = new BufferedReader(new FileReader(file));
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }
    }


    public void crypt(String fileToWrite, int shift) {
        String fileLine;
        try {
            fileWriter = new BufferedWriter(new FileWriter(fileToWrite));
            while ((fileLine = fileReader.readLine()) != null) {
                fileLine = cipher.encrypt(fileLine, shift) + "\n";
                fileWriter.write(fileLine);
            }
            fileWriter.close();
        } catch (IOException e){
            System.out.println("Invalid file.");
        }
    }

    public void encryptFile(String fileToWrite){
        crypt(fileToWrite, cipher.getShift());
    }

    public void decryptFile(String fileToWrite){
        crypt(fileToWrite, 26 - cipher.getShift());

    }
}
