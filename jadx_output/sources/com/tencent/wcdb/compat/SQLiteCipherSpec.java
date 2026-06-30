package com.tencent.wcdb.compat;

/* loaded from: classes12.dex */
public class SQLiteCipherSpec {
    public static final int HMAC_DEFAULT = -1;
    public static final int HMAC_SHA1 = 0;
    public static final int HMAC_SHA256 = 1;
    public static final int HMAC_SHA512 = 2;
    int cipherVersion;
    public int hmacAlgorithm;
    public boolean hmacEnabled;
    public int kdfAlgorithm;
    public int kdfIteration;
    public int pageSize;
    static final java.lang.String[] HMAC_ALGO_MAPPING = {"HMAC_SHA1", "HMAC_SHA256", "HMAC_SHA512"};
    static final java.lang.String[] PBKDF2_ALGO_MAPPING = {"PBKDF2_HMAC_SHA1", "PBKDF2_HMAC_SHA256", "PBKDF2_HMAC_SHA512"};

    public SQLiteCipherSpec() {
        this.hmacEnabled = true;
        this.hmacAlgorithm = -1;
        this.kdfAlgorithm = -1;
        this.pageSize = 4096;
        this.cipherVersion = 0;
    }

    public com.tencent.wcdb.compat.SQLiteCipherSpec setHmacAlgorithm(int i17) {
        if (this.hmacAlgorithm != i17) {
            this.hmacAlgorithm = i17;
            this.cipherVersion = -1;
        }
        return this;
    }

    public com.tencent.wcdb.compat.SQLiteCipherSpec setKDFIteration(int i17) {
        if (this.kdfIteration != i17) {
            this.kdfIteration = i17;
            this.cipherVersion = -1;
        }
        return this;
    }

    public com.tencent.wcdb.compat.SQLiteCipherSpec setKdfAlgorithm(int i17) {
        if (this.kdfAlgorithm != i17) {
            this.kdfAlgorithm = i17;
            this.cipherVersion = -1;
        }
        return this;
    }

    public com.tencent.wcdb.compat.SQLiteCipherSpec setPageSize(int i17) {
        this.pageSize = i17;
        return this;
    }

    public com.tencent.wcdb.compat.SQLiteCipherSpec setSQLCipherVersion(int i17) {
        if (i17 == 1) {
            this.cipherVersion = 1;
            this.hmacEnabled = false;
            this.kdfIteration = 4000;
            this.hmacAlgorithm = 0;
            this.kdfAlgorithm = 0;
        } else if (i17 == 2) {
            this.cipherVersion = 2;
            this.hmacEnabled = true;
            this.kdfIteration = 4000;
            this.hmacAlgorithm = 0;
            this.kdfAlgorithm = 0;
        } else if (i17 == 3) {
            this.cipherVersion = 3;
            this.hmacEnabled = true;
            this.kdfIteration = 64000;
            this.hmacAlgorithm = 0;
            this.kdfAlgorithm = 0;
        } else {
            if (i17 != 4) {
                throw new java.lang.IllegalArgumentException("Unsupported SQLCipher version: " + i17);
            }
            this.cipherVersion = 4;
            this.hmacEnabled = true;
            this.kdfIteration = 256000;
            this.hmacAlgorithm = 2;
            this.kdfAlgorithm = 2;
        }
        return this;
    }

    public com.tencent.wcdb.compat.SQLiteCipherSpec withHMACEnabled(boolean z17) {
        if (this.hmacEnabled != z17) {
            this.hmacEnabled = z17;
            this.cipherVersion = -1;
        }
        return this;
    }

    public SQLiteCipherSpec(com.tencent.wcdb.compat.SQLiteCipherSpec sQLiteCipherSpec) {
        this.hmacEnabled = true;
        this.hmacAlgorithm = -1;
        this.kdfAlgorithm = -1;
        this.pageSize = 4096;
        this.cipherVersion = 0;
        this.kdfIteration = sQLiteCipherSpec.kdfIteration;
        this.hmacEnabled = sQLiteCipherSpec.hmacEnabled;
        this.hmacAlgorithm = sQLiteCipherSpec.hmacAlgorithm;
        this.kdfAlgorithm = sQLiteCipherSpec.kdfAlgorithm;
        this.cipherVersion = sQLiteCipherSpec.cipherVersion;
        this.pageSize = sQLiteCipherSpec.pageSize;
    }
}
