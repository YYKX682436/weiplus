package com.tencent.wcdb.winq;

/* loaded from: classes12.dex */
public class Schema extends com.tencent.wcdb.winq.Identifier {
    public static final com.tencent.wcdb.winq.Schema main = new com.tencent.wcdb.winq.Schema(createMainCppObj());
    public static final com.tencent.wcdb.winq.Schema temp = new com.tencent.wcdb.winq.Schema(createTempCppObj());

    public Schema(java.lang.String str) {
        this.cppObj = createCppObj(str);
    }

    private static native long createCppObj(java.lang.String str);

    private static native long createMainCppObj();

    private static native long createTempCppObj();

    @Override // com.tencent.wcdb.winq.Identifier
    public int getType() {
        return 8;
    }

    public Schema(long j17) {
        this.cppObj = j17;
    }
}
