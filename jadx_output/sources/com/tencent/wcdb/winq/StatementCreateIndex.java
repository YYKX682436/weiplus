package com.tencent.wcdb.winq;

/* loaded from: classes12.dex */
public class StatementCreateIndex extends com.tencent.wcdb.winq.Statement {
    public StatementCreateIndex() {
        this.cppObj = createCppObj();
    }

    private static native void configCondition(long j17, long j18);

    private static native void configIfNotExist(long j17);

    private static native void configIndexedColumns(long j17, int i17, long[] jArr, java.lang.String[] strArr);

    private static native void configSchema(long j17, int i17, long j18, java.lang.String str);

    private static native void configTableName(long j17, java.lang.String str);

    private static native void configUnique(long j17);

    private static native long createCppObj();

    private static native void createIndex(long j17, java.lang.String str);

    public com.tencent.wcdb.winq.StatementCreateIndex createIndex(java.lang.String str) {
        createIndex(this.cppObj, str);
        return this;
    }

    @Override // com.tencent.wcdb.winq.Identifier
    public int getType() {
        return 39;
    }

    public com.tencent.wcdb.winq.StatementCreateIndex ifNotExist() {
        configIfNotExist(this.cppObj);
        return this;
    }

    public com.tencent.wcdb.winq.StatementCreateIndex indexedBy(com.tencent.wcdb.winq.IndexedColumnConvertible... indexedColumnConvertibleArr) {
        if (indexedColumnConvertibleArr.length == 0) {
            return this;
        }
        long[] jArr = new long[indexedColumnConvertibleArr.length];
        for (int i17 = 0; i17 < indexedColumnConvertibleArr.length; i17++) {
            jArr[i17] = com.tencent.wcdb.base.CppObject.get(indexedColumnConvertibleArr[i17]);
        }
        configIndexedColumns(this.cppObj, com.tencent.wcdb.winq.Identifier.getCppType(indexedColumnConvertibleArr[0]), jArr, null);
        return this;
    }

    public com.tencent.wcdb.winq.StatementCreateIndex of(java.lang.String str) {
        configSchema(this.cppObj, 6, 0L, str);
        return this;
    }

    public com.tencent.wcdb.winq.StatementCreateIndex on(java.lang.String str) {
        configTableName(this.cppObj, str);
        return this;
    }

    public com.tencent.wcdb.winq.StatementCreateIndex unique() {
        configUnique(this.cppObj);
        return this;
    }

    public com.tencent.wcdb.winq.StatementCreateIndex where(com.tencent.wcdb.winq.Expression expression) {
        configCondition(this.cppObj, com.tencent.wcdb.base.CppObject.get((com.tencent.wcdb.base.CppObject) expression));
        return this;
    }

    public com.tencent.wcdb.winq.StatementCreateIndex of(com.tencent.wcdb.winq.Schema schema) {
        configSchema(this.cppObj, com.tencent.wcdb.winq.Identifier.getCppType((com.tencent.wcdb.winq.Identifier) schema), com.tencent.wcdb.base.CppObject.get((com.tencent.wcdb.base.CppObject) schema), null);
        return this;
    }

    public com.tencent.wcdb.winq.StatementCreateIndex indexedBy(java.lang.String... strArr) {
        configIndexedColumns(this.cppObj, 6, null, strArr);
        return this;
    }
}
