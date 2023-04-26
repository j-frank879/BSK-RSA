package org.example;

import java.util.Random;

public class RSA {
    int p,q,n,e,d;

    RSA(){
        //table with prime numbers from 2 to 97
        int []prime_numbers={2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97};
        //random prime numbers
        p=prime_numbers[ new Random().nextInt(prime_numbers.length)];
         q= prime_numbers[new Random().nextInt(prime_numbers.length)];
        while (q==p)
        {q= prime_numbers[new Random().nextInt(prime_numbers.length)];}
        n=q*p;
        //generating public and private key
        e=new Random().nextInt(phi(n))+2;
        d=((new Random().nextInt(98)+2)*phi(n-1)+1)/e;


    }
    RSA(int p,int q,int e,int d){
        this.p=p;
        this.q=q;
        this.n=p*q;
        this.e=e;
        this.d=d;
    }
    public int encrypt_letter(int l){
        int encrypted_text=1;
        int public_key=e;
        while (public_key>0) {
            public_key--;
            encrypted_text *= l;
            encrypted_text %= n;
        }
        return encrypted_text;
    };
    public int decrypt_letter(int l){
        int private_key=d;
        int decrypted = 1;
        while (private_key>0) {
            private_key--;
            decrypted *= l;
            decrypted %= n;
        }
        return decrypted;
    };
    //greatest common divider
  static  int gcd(int a, int h)
    {
        int temp;
        while (true) {
            temp = a % h;
            if (temp == 0)
                return h;
            a = h;
            h = temp;
        }
    }
    //eulers totient function
  static  int phi(int n)
    {
         int result = 1;
        for (int i = 2; i < n; i++)
            if (gcd(i, n) == 1)
                result++;
        return result;
    }


}
