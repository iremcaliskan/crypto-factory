package ceng.anadolu.bim492;

import ceng.anadolu.bim492.Crypto.Algorithm.Algorithm;
import ceng.anadolu.bim492.Crypto.CreateAlgorithmExecutorGenerator;

public class App {
    public static void main(String[] args) {
        System.out.println("Test project");
        //I showed the driver class which shows the encrypt/decrypt algorithms for each of the existing cryptography algorithm in action.

        CreateAlgorithmExecutorGenerator cl = new CreateAlgorithmExecutorGenerator();
        System.out.println("Encrypting using GHash");
        Algorithm gHashAlgo = cl.createAlgorithm("GHASH");
        String SampleStringForGHash = "Irem";
        System.out.println("Sample String before Encryption :: " + SampleStringForGHash);
        String encryptedGHash = gHashAlgo.encrypt(SampleStringForGHash);
        System.out.println("Encrypted String after encryption with GHash :: " + encryptedGHash);
        String decryptedGHash = gHashAlgo.decrypt(encryptedGHash);
        System.out.println("Decrypted String after encryption with GHash :: " + decryptedGHash);

        System.out.println("Encrypting using KHash");
        Algorithm kHashAlgo = cl.createAlgorithm("KHASH");
        String SampleStringForKHash = "Caliskan";
        System.out.println("Sample String before Encryption :: " + SampleStringForKHash);
        String encryptedKHash = kHashAlgo.encrypt(SampleStringForKHash);
        System.out.println("Encrypted String after encryption with KHash :: " + encryptedKHash);
        String decryptedKHash = kHashAlgo.decrypt(encryptedKHash);
        System.out.println("Decrypted String after encryption with KHash :: " + decryptedKHash);
    }
}
