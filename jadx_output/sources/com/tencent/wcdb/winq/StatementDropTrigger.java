package com.tencent.wcdb.winq;

/* loaded from: classes12.dex */
public class StatementDropTrigger extends com.tencent.wcdb.winq.Statement {
    public StatementDropTrigger() {
        this.cppObj = createCppObj();
    }

    private static native void configIfExist(long j17);

    private static native void configSchema(long j17, int i17, long j18, java.lang.String str);

    private static native void configTrigger(long j17, java.lang.String str);

    private static native long createCppObj();

    public com.tencent.wcdb.winq.StatementDropTrigger dropTrigger(java.lang.String str) {
        configTrigger(this.cppObj, str);
        return this;
    }

    @Override // com.tencent.wcdb.winq.Identifier
    public int getType() {
        return 51;
    }

    public com.tencent.wcdb.winq.StatementDropTrigger ifExist() {
        configIfExist(this.cppObj);
        return this;
    }

    public com.tencent.wcdb.winq.StatementDropTrigger of(java.lang.String str) {
        configSchema(this.cppObj, 6, 0L, str);
        return this;
    }

    public com.tencent.wcdb.winq.StatementDropTrigger of(com.tencent.wcdb.winq.Schema schema) {
        configSchema(this.cppObj, com.tencent.wcdb.winq.Identifier.getCppType((com.tencent.wcdb.winq.Identifier) schema), com.tencent.wcdb.base.CppObject.get((com.tencent.wcdb.base.CppObject) schema), null);
        return this;
    }
}
