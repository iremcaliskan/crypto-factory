package ceng.anadolu.bim492.Crypto.Algorithm;

public abstract class Algorithm {
    //First I defined the contract for each of the cryptography algorithm
    public abstract String encrypt(String str);

    public abstract String decrypt(String str);
}
