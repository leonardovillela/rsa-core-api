package br.com.villela.rsacoreapi.key;

import java.math.BigInteger;

public class PublicKey {

    private BigInteger exponent;
    private BigInteger productPrimesOfKeys;

    public PublicKey(BigInteger exponent, BigInteger productPrimesOfKeys) {
        this.exponent = exponent;
        this.productPrimesOfKeys = productPrimesOfKeys;
    }

    public BigInteger getExponent() {
        return exponent;
    }

    public BigInteger getProductPrimesOfKeys() {
        return productPrimesOfKeys;
    }

    @Override
    public String toString() {
        return exponent.toString() + "|" + productPrimesOfKeys.toString();
    }
}
