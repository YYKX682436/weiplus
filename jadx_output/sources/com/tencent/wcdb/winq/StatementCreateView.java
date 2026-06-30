package com.tencent.wcdb.winq;

/* loaded from: classes12.dex */
public class StatementCreateView extends com.tencent.wcdb.winq.Statement {
    public StatementCreateView() {
        this.cppObj = createCppObj();
    }

    private static native void configAs(long j17, long j18);

    private static native void configColumns(long j17, int i17, long[] jArr, java.lang.String[] strArr);

    private static native void configIfNotExist(long j17);

    private static native void configSchema(long j17, int i17, long j18, java.lang.String str);

    private static native void configTemp(long j17);

    private static native void configView(long j17, java.lang.String str);

    private static native long createCppObj();

    public com.tencent.wcdb.winq.StatementCreateView as(com.tencent.wcdb.winq.StatementSelect statementSelect) {
        configAs(this.cppObj, com.tencent.wcdb.base.CppObject.get((com.tencent.wcdb.base.CppObject) statementSelect));
        return this;
    }

    public com.tencent.wcdb.winq.StatementCreateView createTempView(java.lang.String str) {
        configView(this.cppObj, str);
        configTemp(this.cppObj);
        return this;
    }

    public com.tencent.wcdb.winq.StatementCreateView createView(java.lang.String str) {
        configView(this.cppObj, str);
        return this;
    }

    @Override // com.tencent.wcdb.winq.Identifier
    public int getType() {
        return 46;
    }

    public com.tencent.wcdb.winq.StatementCreateView ifNotExist() {
        configIfNotExist(this.cppObj);
        return this;
    }

    public com.tencent.wcdb.winq.StatementCreateView of(java.lang.String str) {
        configSchema(this.cppObj, 6, 0L, str);
        return this;
    }

    public com.tencent.wcdb.winq.StatementCreateView withColumns(com.tencent.wcdb.winq.Column... columnArr) {
        if (columnArr.length == 0) {
            return this;
        }
        long[] jArr = new long[columnArr.length];
        for (int i17 = 0; i17 < columnArr.length; i17++) {
            jArr[i17] = com.tencent.wcdb.base.CppObject.get((com.tencent.wcdb.base.CppObject) columnArr[i17]);
        }
        configColumns(this.cppObj, 7, jArr, null);
        return this;
    }

    public com.tencent.wcdb.winq.StatementCreateView of(com.tencent.wcdb.winq.Schema schema) {
        configSchema(this.cppObj, com.tencent.wcdb.winq.Identifier.getCppType((com.tencent.wcdb.winq.Identifier) schema), com.tencent.wcdb.base.CppObject.get((com.tencent.wcdb.base.CppObject) schema), null);
        return this;
    }

    public com.tencent.wcdb.winq.StatementCreateView withColumns(java.lang.String... strArr) {
        if (strArr.length == 0) {
            return this;
        }
        configColumns(this.cppObj, 6, null, strArr);
        return this;
    }
}
