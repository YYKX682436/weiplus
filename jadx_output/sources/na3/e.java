package na3;

/* loaded from: classes7.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final na3.e f335986a = new na3.e();

    public final byte[] a(java.lang.String keyId, byte[] encrypted, java.lang.String algorithm) {
        kotlin.jvm.internal.o.g(keyId, "keyId");
        kotlin.jvm.internal.o.g(encrypted, "encrypted");
        kotlin.jvm.internal.o.g(algorithm, "algorithm");
        na3.b a17 = na3.b.f335980f.a(algorithm);
        if (a17 == null) {
            throw new java.lang.IllegalArgumentException("Unsupported algorithm: ".concat(algorithm));
        }
        int ordinal = a17.ordinal();
        java.lang.String str = a17.f335983d;
        if (ordinal != 0 && ordinal != 1) {
            if (ordinal != 4) {
                throw new java.lang.IllegalArgumentException("Unsupported algorithm: ".concat(algorithm));
            }
            if (encrypted.length <= 12) {
                throw new java.lang.IllegalArgumentException("Invalid encrypted data: too short");
            }
            java.security.KeyStore keyStore = java.security.KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            java.security.Key key = keyStore.getKey(keyId, null);
            kotlin.jvm.internal.o.e(key, "null cannot be cast to non-null type javax.crypto.SecretKey");
            byte[] bArr = new byte[12];
            java.lang.System.arraycopy(encrypted, 0, bArr, 0, 12);
            int length = encrypted.length - 12;
            byte[] bArr2 = new byte[length];
            java.lang.System.arraycopy(encrypted, 12, bArr2, 0, length);
            javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance(str);
            cipher.init(2, (javax.crypto.SecretKey) key, new javax.crypto.spec.GCMParameterSpec(128, bArr));
            byte[] doFinal = cipher.doFinal(bArr2);
            kotlin.jvm.internal.o.d(doFinal);
            return doFinal;
        }
        try {
            java.security.KeyStore keyStore2 = java.security.KeyStore.getInstance("AndroidKeyStore");
            keyStore2.load(null);
            c(keyStore2, keyId);
            java.security.Key key2 = keyStore2.getKey(keyId, null);
            java.security.PrivateKey privateKey = key2 instanceof java.security.PrivateKey ? (java.security.PrivateKey) key2 : null;
            if (privateKey == null) {
                throw new java.lang.IllegalStateException("Private key not found for keyId: ".concat(keyId));
            }
            javax.crypto.Cipher cipher2 = kotlin.jvm.internal.o.b(str, "RSA/ECB/OAEPWithSHA-256AndMGF1Padding") ? javax.crypto.Cipher.getInstance("RSA/ECB/OAEPWithSHA-256AndMGF1Padding") : javax.crypto.Cipher.getInstance("RSA/ECB/PKCS1Padding");
            if (kotlin.jvm.internal.o.b(str, "RSA/ECB/OAEPWithSHA-256AndMGF1Padding")) {
                cipher2.init(2, privateKey, new javax.crypto.spec.OAEPParameterSpec("SHA-256", "MGF1", new java.security.spec.MGF1ParameterSpec("SHA-1"), javax.crypto.spec.PSource.PSpecified.DEFAULT));
            } else {
                cipher2.init(2, privateKey);
            }
            if (encrypted.length == 256) {
                byte[] doFinal2 = cipher2.doFinal(encrypted);
                kotlin.jvm.internal.o.f(doFinal2, "doFinal(...)");
                return doFinal2;
            }
            throw new java.lang.IllegalArgumentException("Invalid encrypted data size: " + encrypted.length + " bytes. Expected: 256 bytes");
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("LiteAppSecureUtil", "rsaDecrypt error: " + e17.getClass().getSimpleName() + ": " + e17.getMessage());
            throw e17;
        }
    }

    public final byte[] b(java.lang.String keyId, byte[] data, java.lang.String algorithm) {
        kotlin.jvm.internal.o.g(keyId, "keyId");
        kotlin.jvm.internal.o.g(data, "data");
        kotlin.jvm.internal.o.g(algorithm, "algorithm");
        na3.b a17 = na3.b.f335980f.a(algorithm);
        if (a17 == null) {
            throw new java.lang.IllegalArgumentException("Unsupported algorithm: ".concat(algorithm));
        }
        int ordinal = a17.ordinal();
        java.lang.String str = a17.f335983d;
        if (ordinal != 0 && ordinal != 1) {
            if (ordinal != 4) {
                throw new java.lang.IllegalArgumentException("Unsupported algorithm: ".concat(algorithm));
            }
            java.security.KeyStore keyStore = java.security.KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            java.security.Key key = keyStore.getKey(keyId, null);
            kotlin.jvm.internal.o.e(key, "null cannot be cast to non-null type javax.crypto.SecretKey");
            javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance(str);
            cipher.init(1, (javax.crypto.SecretKey) key);
            byte[] iv6 = cipher.getIV();
            byte[] doFinal = cipher.doFinal(data);
            byte[] bArr = new byte[iv6.length + doFinal.length];
            java.lang.System.arraycopy(iv6, 0, bArr, 0, iv6.length);
            java.lang.System.arraycopy(doFinal, 0, bArr, iv6.length, doFinal.length);
            return bArr;
        }
        try {
            java.security.KeyStore keyStore2 = java.security.KeyStore.getInstance("AndroidKeyStore");
            keyStore2.load(null);
            c(keyStore2, keyId);
            java.security.PublicKey publicKey = keyStore2.getCertificate(keyId).getPublicKey();
            javax.crypto.Cipher cipher2 = javax.crypto.Cipher.getInstance(str);
            if (kotlin.jvm.internal.o.b(str, "RSA/ECB/OAEPWithSHA-256AndMGF1Padding")) {
                cipher2.init(1, publicKey, new javax.crypto.spec.OAEPParameterSpec("SHA-256", "MGF1", new java.security.spec.MGF1ParameterSpec("SHA-1"), javax.crypto.spec.PSource.PSpecified.DEFAULT));
            } else {
                cipher2.init(1, publicKey);
            }
            int i17 = kotlin.jvm.internal.o.b(str, "RSA/ECB/OAEPWithSHA-256AndMGF1Padding") ? 190 : 245;
            if (data.length <= i17) {
                byte[] doFinal2 = cipher2.doFinal(data);
                kotlin.jvm.internal.o.f(doFinal2, "doFinal(...)");
                return doFinal2;
            }
            throw new java.lang.IllegalArgumentException("Input data too long: " + data.length + " bytes. Maximum allowed: " + i17 + " bytes");
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("LiteAppSecureUtil", "rsaEncrypt error: ", e17);
            throw e17;
        }
    }

    public final void c(java.security.KeyStore keyStore, java.lang.String str) {
        if (keyStore.containsAlias(str)) {
            return;
        }
        com.tencent.mars.xlog.Log.e("LiteAppSecureUtil", "the KeyId is not exist: " + str);
        throw new java.lang.Exception("the KeyId is not exist: " + str);
    }

    public final java.lang.String d(java.lang.String algorithm, int i17) {
        kotlin.jvm.internal.o.g(algorithm, "algorithm");
        java.lang.String e17 = e(algorithm);
        na3.a aVar = na3.b.f335980f;
        if (kotlin.jvm.internal.o.b(algorithm, "AES-GCM")) {
            javax.crypto.KeyGenerator keyGenerator = javax.crypto.KeyGenerator.getInstance("AES", "AndroidKeyStore");
            android.security.keystore.KeyGenParameterSpec.Builder randomizedEncryptionRequired = new android.security.keystore.KeyGenParameterSpec.Builder(e17, 3).setBlockModes("GCM").setEncryptionPaddings("NoPadding").setKeySize(i17).setRandomizedEncryptionRequired(true);
            kotlin.jvm.internal.o.f(randomizedEncryptionRequired, "setRandomizedEncryptionRequired(...)");
            keyGenerator.init(randomizedEncryptionRequired.build());
            keyGenerator.generateKey();
            return e17;
        }
        java.security.KeyPairGenerator keyPairGenerator = java.security.KeyPairGenerator.getInstance("RSA", "AndroidKeyStore");
        android.security.keystore.KeyGenParameterSpec.Builder digests = new android.security.keystore.KeyGenParameterSpec.Builder(e17, 15).setKeySize(i17).setDigests("SHA-256", "SHA-512");
        kotlin.jvm.internal.o.f(digests, "setDigests(...)");
        na3.b a17 = na3.b.f335980f.a(algorithm);
        int i18 = a17 == null ? -1 : na3.d.f335985a[a17.ordinal()];
        if (i18 == -1) {
            digests.setEncryptionPaddings("PKCS1Padding");
            digests.setSignaturePaddings("PKCS1");
        } else if (i18 == 1) {
            digests.setEncryptionPaddings("PKCS1Padding");
        } else if (i18 == 2) {
            digests.setEncryptionPaddings("OAEPPadding");
        } else if (i18 == 3) {
            digests.setEncryptionPaddings("NoPadding");
            digests.setBlockModes("GCM");
        } else if (i18 == 4) {
            digests.setSignaturePaddings("PKCS1");
        } else if (i18 == 5) {
            digests.setSignaturePaddings("PSS");
        }
        android.security.keystore.KeyGenParameterSpec build = digests.build();
        kotlin.jvm.internal.o.f(build, "build(...)");
        keyPairGenerator.initialize(build);
        keyPairGenerator.generateKeyPair();
        return e17;
    }

    public final java.lang.String e(java.lang.String str) {
        return "key_" + str + '_' + java.lang.System.currentTimeMillis() + '_' + r26.n0.R(java.lang.String.valueOf(e06.p.j(new e06.k(0, 999999), c06.e.f37716d)), 6, '0');
    }

    public final byte[] f(java.lang.String keyId, java.lang.String algorithm) {
        kotlin.jvm.internal.o.g(keyId, "keyId");
        kotlin.jvm.internal.o.g(algorithm, "algorithm");
        na3.b a17 = na3.b.f335980f.a(algorithm);
        if (a17 == null) {
            throw new java.lang.IllegalArgumentException("Unsupported algorithm: ".concat(algorithm));
        }
        int ordinal = a17.ordinal();
        if (ordinal != 0 && ordinal != 1) {
            throw new java.lang.IllegalArgumentException("Unsupported algorithm: ".concat(algorithm));
        }
        try {
            java.security.KeyStore keyStore = java.security.KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            c(keyStore, keyId);
            byte[] encoded = keyStore.getCertificate(keyId).getPublicKey().getEncoded();
            kotlin.jvm.internal.o.f(encoded, "getEncoded(...)");
            return encoded;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("LiteAppSecureUtil", "rsaGetPublicKey error, error=" + e17.getMessage());
            throw e17;
        }
    }

    public final java.lang.String g(byte[] publicKeyBytes, byte[] privateKeyBytes, byte[] certificateBytes, java.lang.String algorithm) {
        kotlin.jvm.internal.o.g(publicKeyBytes, "publicKeyBytes");
        kotlin.jvm.internal.o.g(privateKeyBytes, "privateKeyBytes");
        kotlin.jvm.internal.o.g(certificateBytes, "certificateBytes");
        kotlin.jvm.internal.o.g(algorithm, "algorithm");
        try {
            java.security.KeyFactory keyFactory = java.security.KeyFactory.getInstance(algorithm);
            java.security.spec.PKCS8EncodedKeySpec pKCS8EncodedKeySpec = new java.security.spec.PKCS8EncodedKeySpec(privateKeyBytes);
            java.security.PublicKey generatePublic = keyFactory.generatePublic(new java.security.spec.X509EncodedKeySpec(publicKeyBytes));
            java.security.cert.Certificate generateCertificate = java.security.cert.CertificateFactory.getInstance("X.509").generateCertificate(new java.io.ByteArrayInputStream(certificateBytes));
            kotlin.jvm.internal.o.e(generateCertificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            java.security.cert.X509Certificate x509Certificate = (java.security.cert.X509Certificate) generateCertificate;
            if (!java.util.Arrays.equals(x509Certificate.getPublicKey().getEncoded(), generatePublic.getEncoded())) {
                throw new java.lang.RuntimeException("Certificate's public key does not match the provided public key");
            }
            java.security.KeyStore keyStore = java.security.KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            java.lang.String e17 = e(algorithm);
            keyStore.setKeyEntry(e17, keyFactory.generatePrivate(pKCS8EncodedKeySpec), null, new java.security.cert.X509Certificate[]{x509Certificate});
            return e17;
        } catch (java.lang.Exception e18) {
            throw new java.lang.RuntimeException("Invalid key format: " + e18.getMessage());
        }
    }

    public final byte[] h(java.lang.String keyId, byte[] data, java.lang.String algorithm) {
        kotlin.jvm.internal.o.g(keyId, "keyId");
        kotlin.jvm.internal.o.g(data, "data");
        kotlin.jvm.internal.o.g(algorithm, "algorithm");
        na3.b a17 = na3.b.f335980f.a(algorithm);
        if (a17 == null) {
            throw new java.lang.IllegalArgumentException("Unsupported algorithm: ".concat(algorithm));
        }
        int ordinal = a17.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            throw new java.lang.IllegalArgumentException("Unsupported algorithm: ".concat(algorithm));
        }
        if (ordinal != 2 && ordinal != 3) {
            if (ordinal != 4) {
                throw new jz5.j();
            }
            throw new java.lang.IllegalArgumentException("Unsupported algorithm: ".concat(algorithm));
        }
        java.lang.String str = a17.f335983d;
        try {
            java.security.KeyStore keyStore = java.security.KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            c(keyStore, keyId);
            java.security.Key key = keyStore.getKey(keyId, null);
            kotlin.jvm.internal.o.e(key, "null cannot be cast to non-null type java.security.PrivateKey");
            java.security.Signature signature = java.security.Signature.getInstance(str);
            signature.initSign((java.security.PrivateKey) key);
            signature.update(data);
            byte[] sign = signature.sign();
            kotlin.jvm.internal.o.f(sign, "sign(...)");
            return sign;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("LiteAppSecureUtil", "rsaSign error: ", e17);
            throw e17;
        }
    }

    public final boolean i(java.lang.String keyId, byte[] data, byte[] signature, java.lang.String algorithm) {
        kotlin.jvm.internal.o.g(keyId, "keyId");
        kotlin.jvm.internal.o.g(data, "data");
        kotlin.jvm.internal.o.g(signature, "signature");
        kotlin.jvm.internal.o.g(algorithm, "algorithm");
        na3.b a17 = na3.b.f335980f.a(algorithm);
        if (a17 == null) {
            throw new java.lang.IllegalArgumentException("Unsupported algorithm: ".concat(algorithm));
        }
        int ordinal = a17.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            throw new java.lang.IllegalArgumentException("Unsupported algorithm: ".concat(algorithm));
        }
        if (ordinal != 2 && ordinal != 3) {
            if (ordinal != 4) {
                throw new jz5.j();
            }
            throw new java.lang.IllegalArgumentException("Unsupported algorithm: ".concat(algorithm));
        }
        java.lang.String str = a17.f335983d;
        try {
            java.security.KeyStore keyStore = java.security.KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            c(keyStore, keyId);
            java.security.PublicKey publicKey = keyStore.getCertificate(keyId).getPublicKey();
            java.security.Signature signature2 = java.security.Signature.getInstance(str);
            signature2.initVerify(publicKey);
            signature2.update(data);
            return signature2.verify(signature);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("LiteAppSecureUtil", "rsaVerify error: ", e17);
            throw e17;
        }
    }
}
