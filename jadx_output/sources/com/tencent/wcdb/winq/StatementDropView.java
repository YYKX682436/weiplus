package com.tencent.wcdb.winq;

/* loaded from: classes12.dex */
public class StatementDropView extends com.tencent.wcdb.winq.Statement {
    public StatementDropView() {
        this.cppObj = createCppObj();
    }

    private static native void configIfExist(long j17);

    private static native void configSchema(long j17, int i17, long j18, java.lang.String str);

    private static native void configView(long j17, java.lang.String str);

    private static native long createCppObj();

    public com.tencent.wcdb.winq.StatementDropView dropView(java.lang.String str) {
        configView(this.cppObj, str);
        return this;
    }

    @Override // com.tencent.wcdb.winq.Identifier
    public int getType() {
        return 52;
    }

    public com.tencent.wcdb.winq.StatementDropView ifExist() {
        configIfExist(this.cppObj);
        return this;
    }

    public com.tencent.wcdb.winq.StatementDropView of(java.lang.String str) {
        configSchema(this.cppObj, 6, 0L, str);
        return this;
    }

    public com.tencent.wcdb.winq.StatementDropView of(com.tencent.wcdb.winq.Schema schema) {
        configSchema(this.cppObj, com.tencent.wcdb.winq.Identifier.getCppType((com.tencent.wcdb.winq.Identifier) schema), com.tencent.wcdb.base.CppObject.get((com.tencent.wcdb.base.CppObject) schema), null);
        return this;
    }
}
