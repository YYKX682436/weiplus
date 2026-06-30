package com.tencent.wcdb.database;

/* loaded from: classes12.dex */
public class SQLiteCipherSpec {
    public static final int HMAC_DEFAULT = -1;
    public static final int HMAC_SHA1 = 0;
    public static final int HMAC_SHA256 = 1;
    public static final int HMAC_SHA512 = 2;
    public int hmacAlgorithm;
    public boolean hmacEnabled;
    public int kdfAlgorithm;
    public int kdfIteration;
    public int pageSize;

    public SQLiteCipherSpec() {
        this.kdfIteration = 64000;
        this.hmacEnabled = true;
        this.hmacAlgorithm = 0;
        this.kdfAlgorithm = 0;
        this.pageSize = 4096;
    }

    public com.tencent.wcdb.database.SQLiteCipherSpec setHmacAlgorithm(int i17) {
        this.hmacAlgorithm = i17;
        return this;
    }

    public com.tencent.wcdb.database.SQLiteCipherSpec setKDFIteration(int i17) {
        this.kdfIteration = i17;
        return this;
    }

    public com.tencent.wcdb.database.SQLiteCipherSpec setKdfAlgorithm(int i17) {
        this.kdfAlgorithm = i17;
        return this;
    }

    public com.tencent.wcdb.database.SQLiteCipherSpec setPageSize(int i17) {
        this.pageSize = i17;
        return this;
    }

    public com.tencent.wcdb.database.SQLiteCipherSpec setSQLCipherVersion(int i17) {
        if (i17 == 1) {
            this.hmacEnabled = false;
            this.kdfIteration = 4000;
            this.hmacAlgorithm = 0;
            this.kdfAlgorithm = 0;
        } else if (i17 == 2) {
            this.hmacEnabled = true;
            this.kdfIteration = 4000;
            this.hmacAlgorithm = 0;
            this.kdfAlgorithm = 0;
        } else if (i17 == 3) {
            this.hmacEnabled = true;
            this.kdfIteration = 64000;
            this.hmacAlgorithm = 0;
            this.kdfAlgorithm = 0;
        } else {
            if (i17 != 4) {
                throw new java.lang.IllegalArgumentException("Unsupported SQLCipher version: " + i17);
            }
            this.hmacEnabled = true;
            this.kdfIteration = 256000;
            this.hmacAlgorithm = 2;
            this.kdfAlgorithm = 2;
        }
        return this;
    }

    public com.tencent.wcdb.database.SQLiteCipherSpec withHMACEnabled(boolean z17) {
        this.hmacEnabled = z17;
        return this;
    }

    public SQLiteCipherSpec(com.tencent.wcdb.database.SQLiteCipherSpec sQLiteCipherSpec) {
        this.kdfIteration = 64000;
        this.hmacEnabled = true;
        this.hmacAlgorithm = 0;
        this.kdfAlgorithm = 0;
        this.pageSize = 4096;
        this.kdfIteration = sQLiteCipherSpec.kdfIteration;
        this.hmacEnabled = sQLiteCipherSpec.hmacEnabled;
        this.pageSize = sQLiteCipherSpec.pageSize;
        this.hmacAlgorithm = sQLiteCipherSpec.hmacAlgorithm;
        this.kdfAlgorithm = sQLiteCipherSpec.kdfAlgorithm;
    }
}
