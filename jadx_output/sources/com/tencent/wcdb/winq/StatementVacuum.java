package com.tencent.wcdb.winq;

/* loaded from: classes12.dex */
public class StatementVacuum extends com.tencent.wcdb.winq.Statement {
    public StatementVacuum() {
        this.cppObj = createCppObj();
    }

    private static native void configSchema(long j17, int i17, long j18, java.lang.String str);

    private static native long createCppObj();

    @Override // com.tencent.wcdb.winq.Identifier
    public int getType() {
        return 55;
    }

    public com.tencent.wcdb.winq.StatementVacuum vacuum(java.lang.String str) {
        configSchema(this.cppObj, 6, 0L, str);
        return this;
    }

    public com.tencent.wcdb.winq.StatementVacuum vacuum(com.tencent.wcdb.winq.Schema schema) {
        configSchema(this.cppObj, com.tencent.wcdb.winq.Identifier.getCppType((com.tencent.wcdb.winq.Identifier) schema), com.tencent.wcdb.base.CppObject.get((com.tencent.wcdb.base.CppObject) schema), null);
        return this;
    }
}
