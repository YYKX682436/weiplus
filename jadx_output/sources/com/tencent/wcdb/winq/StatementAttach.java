package com.tencent.wcdb.winq;

/* loaded from: classes12.dex */
public class StatementAttach extends com.tencent.wcdb.winq.Statement {
    public StatementAttach() {
        this.cppObj = createCppObj();
    }

    private static native void configKey(long j17, int i17, long j18, java.lang.String str);

    private static native void configPath(long j17, int i17, long j18, java.lang.String str);

    private static native void configSchema(long j17, int i17, long j18, java.lang.String str);

    private static native long createCppObj();

    public com.tencent.wcdb.winq.StatementAttach as(java.lang.String str) {
        configSchema(this.cppObj, 6, 0L, str);
        return this;
    }

    public com.tencent.wcdb.winq.StatementAttach attach(java.lang.String str) {
        configPath(this.cppObj, 6, 0L, str);
        return this;
    }

    @Override // com.tencent.wcdb.winq.Identifier
    public int getType() {
        return 33;
    }

    public com.tencent.wcdb.winq.StatementAttach key(java.lang.String str) {
        configKey(this.cppObj, 6, 0L, str);
        return this;
    }

    public com.tencent.wcdb.winq.StatementAttach as(com.tencent.wcdb.winq.Schema schema) {
        configSchema(this.cppObj, com.tencent.wcdb.winq.Identifier.getCppType((com.tencent.wcdb.winq.Identifier) schema), com.tencent.wcdb.base.CppObject.get((com.tencent.wcdb.base.CppObject) schema), null);
        return this;
    }

    public com.tencent.wcdb.winq.StatementAttach attach(com.tencent.wcdb.winq.BindParameter bindParameter) {
        configPath(this.cppObj, com.tencent.wcdb.winq.Identifier.getCppType((com.tencent.wcdb.winq.Identifier) bindParameter), com.tencent.wcdb.base.CppObject.get((com.tencent.wcdb.base.CppObject) bindParameter), null);
        return this;
    }

    public com.tencent.wcdb.winq.StatementAttach key(com.tencent.wcdb.winq.BindParameter bindParameter) {
        configKey(this.cppObj, com.tencent.wcdb.winq.Identifier.getCppType((com.tencent.wcdb.winq.Identifier) bindParameter), com.tencent.wcdb.base.CppObject.get((com.tencent.wcdb.base.CppObject) bindParameter), null);
        return this;
    }
}
