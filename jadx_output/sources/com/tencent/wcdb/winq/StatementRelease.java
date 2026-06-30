package com.tencent.wcdb.winq;

/* loaded from: classes12.dex */
public class StatementRelease extends com.tencent.wcdb.winq.Statement {
    public StatementRelease() {
        this.cppObj = createCppObj();
    }

    private static native void configSavepoint(long j17, java.lang.String str);

    private static native long createCppObj();

    @Override // com.tencent.wcdb.winq.Identifier
    public int getType() {
        return 38;
    }

    public com.tencent.wcdb.winq.StatementRelease release(java.lang.String str) {
        configSavepoint(this.cppObj, str);
        return this;
    }
}
