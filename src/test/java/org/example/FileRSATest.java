package org.example;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class FileRSATest {
    RSA rsa=new RSA(11,13,7,223);
    @Test
    void encryptTxt() throws IOException {
        FileRSA.encrypt(rsa,"test.txt");
    }

    @Test
    void decryptTxt() throws IOException {
        FileRSA.decrypt(rsa,"test-encrypted.txt");
    }
    @Test
    void encryptBin() throws IOException {
        FileRSA.encrypt(rsa,"test.bin");
    }

    @Test
    void decryptBin() throws IOException {
        FileRSA.decrypt(rsa,"test-encrypted.bin");
    }
}