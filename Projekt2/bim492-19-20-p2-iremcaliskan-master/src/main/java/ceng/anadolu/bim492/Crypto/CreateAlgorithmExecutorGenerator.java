package ceng.anadolu.bim492.Crypto;

import ceng.anadolu.bim492.Crypto.Algorithm.Algorithm;
import ceng.anadolu.bim492.Crypto.Algorithm.GHash;
import ceng.anadolu.bim492.Crypto.Algorithm.KHash;

public class CreateAlgorithmExecutorGenerator extends CryptoFactory {
    //I extended the contract (abstract class) defined in CryptoFactory class in
    //CreateAlgorithmExecutorGenerator class to implement the createAlgorithm() function
    // to generate object for the crypto algorithm as per the type passed as params.
    public Algorithm createAlgorithm(String type) {
        switch (type) {
            case "KHASH":
                return new KHash();
            case "GHASH":
                return new GHash();
            default:
                return new GHash();
        }
    }
}
