package com.tencent.wcdb.winq;

/* loaded from: classes12.dex */
public class StatementDropIndex extends com.tencent.wcdb.winq.Statement {
    public StatementDropIndex() {
        this.cppObj = createCppObj();
    }

    private static native void configIfExist(long j17);

    private static native void configIndex(long j17, java.lang.String str);

    private static native void configSchema(long j17, int i17, long j18, java.lang.String str);

    private static native long createCppObj();

    public com.tencent.wcdb.winq.StatementDropIndex dropIndex(java.lang.String str) {
        configIndex(this.cppObj, str);
        return this;
    }

    @Override // com.tencent.wcdb.winq.Identifier
    public int getType() {
        return 49;
    }

    public com.tencent.wcdb.winq.StatementDropIndex ifExist() {
        configIfExist(this.cppObj);
        return this;
    }

    public com.tencent.wcdb.winq.StatementDropIndex of(java.lang.String str) {
        configSchema(this.cppObj, 6, 0L, str);
        return this;
    }

    public com.tencent.wcdb.winq.StatementDropIndex of(com.tencent.wcdb.winq.Schema schema) {
        configSchema(this.cppObj, com.tencent.wcdb.winq.Identifier.getCppType((com.tencent.wcdb.winq.Identifier) schema), com.tencent.wcdb.base.CppObject.get((com.tencent.wcdb.base.CppObject) schema), null);
        return this;
    }
}
