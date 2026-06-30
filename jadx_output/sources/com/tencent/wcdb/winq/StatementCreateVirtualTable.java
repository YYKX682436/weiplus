package com.tencent.wcdb.winq;

/* loaded from: classes12.dex */
public class StatementCreateVirtualTable extends com.tencent.wcdb.winq.Statement {
    public StatementCreateVirtualTable() {
        this.cppObj = createCppObj();
    }

    private static native void configArguments(long j17, java.lang.String[] strArr);

    private static native void configIfNotExist(long j17);

    private static native void configModule(long j17, java.lang.String str);

    private static native void configSchema(long j17, int i17, long j18, java.lang.String str);

    private static native void configTable(long j17, java.lang.String str);

    private static native long createCppObj();

    public com.tencent.wcdb.winq.StatementCreateVirtualTable arguments(java.lang.String... strArr) {
        configArguments(this.cppObj, strArr);
        return this;
    }

    public com.tencent.wcdb.winq.StatementCreateVirtualTable createVirtualTable(java.lang.String str) {
        configTable(this.cppObj, str);
        return this;
    }

    @Override // com.tencent.wcdb.winq.Identifier
    public int getType() {
        return 47;
    }

    public com.tencent.wcdb.winq.StatementCreateVirtualTable ifNotExist() {
        configIfNotExist(this.cppObj);
        return this;
    }

    public com.tencent.wcdb.winq.StatementCreateVirtualTable of(java.lang.String str) {
        configSchema(this.cppObj, 6, 0L, str);
        return this;
    }

    public com.tencent.wcdb.winq.StatementCreateVirtualTable usingModule(java.lang.String str) {
        configModule(this.cppObj, str);
        return this;
    }

    public com.tencent.wcdb.winq.StatementCreateVirtualTable of(com.tencent.wcdb.winq.Schema schema) {
        configSchema(this.cppObj, com.tencent.wcdb.winq.Identifier.getCppType((com.tencent.wcdb.winq.Identifier) schema), com.tencent.wcdb.base.CppObject.get((com.tencent.wcdb.base.CppObject) schema), null);
        return this;
    }
}
