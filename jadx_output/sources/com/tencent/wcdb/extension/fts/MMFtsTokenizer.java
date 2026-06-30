package com.tencent.wcdb.extension.fts;

/* loaded from: classes12.dex */
public final class MMFtsTokenizer implements com.tencent.wcdb.extension.SQLiteExtension {
    public static final com.tencent.wcdb.extension.SQLiteExtension EXTENSION = new com.tencent.wcdb.extension.fts.MMFtsTokenizer();

    private MMFtsTokenizer() {
    }

    private static native void nativeInitialize(long j17, long j18);

    @Override // com.tencent.wcdb.extension.SQLiteExtension
    public void initialize(long j17, long j18) {
        nativeInitialize(j17, j18);
    }
}
