package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RSATest {

    @Test
    void gcd() {
        assertEquals(1,RSA.gcd(3,5));
        assertEquals(1,RSA.gcd(5,3));
    }

    @Test
    void phi() {
        assertEquals(1152,RSA.phi(1241));
    }

    @Test
    void encrypt_letter() {
        RSA rsa=new RSA(11,13,7,223);
        int t=rsa.encrypt_letter('e');
        System.out.println(t);
        System.out.println((char) t);
    }

    @Test
    void decrypt_letter() {
        RSA rsa=new RSA(11,13,7,223);
        int t=rsa.decrypt_letter(62);
        System.out.println(t);
        System.out.println((char) t);
    }
}