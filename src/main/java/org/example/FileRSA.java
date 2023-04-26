package org.example;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileRSA {
    static void encrypt(RSA rsa,String file) throws IOException {

        String file_type=file.substring(file.length()-4);
        String out= file.substring(0,file.length()-4);
        out+="-encrypted"+file_type;
        //opening files to read and to write
        FileReader fr=new FileReader(file);
        FileWriter fw=new FileWriter(out);
        int i;

        //reading int from file
        while ((i = fr.read()) != -1) {

            //encrypting chars from file
            int result = rsa.encrypt_letter(i);
            fw.write((char) ( result ));
        }


        fw.close();
        fr.close();
    }
    static void decrypt(RSA rsa,String file) throws IOException {

        String file_type=file.substring(file.length()-4);
        String out= file.substring(0,file.length()-14);
        out+="-decrypted"+file_type;
        //opening files to read and to write
        FileReader fr=new FileReader(file);
        FileWriter fw=new FileWriter(out);
        int i;

        //reading int from file
        while ((i = fr.read()) != -1) {

            //decrypting chars from file
            int result = rsa.decrypt_letter(i);
            fw.write((char) ( result ));
        }


        fw.close();
        fr.close();
    }
}
