package ceng.anadolu.bim492.Crypto;

import ceng.anadolu.bim492.Crypto.Algorithm.Algorithm;

abstract class CryptoFactory {
    //I created the factory abstract class called CryptoFactory,
    // which exposes the contract required to create object of the individual algorithm.
    abstract Algorithm createAlgorithm(String type);
}
