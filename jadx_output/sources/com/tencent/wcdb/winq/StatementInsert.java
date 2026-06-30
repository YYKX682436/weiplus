package com.tencent.wcdb.winq;

/* loaded from: classes12.dex */
public class StatementInsert extends com.tencent.wcdb.winq.Statement {
    public StatementInsert() {
        this.cppObj = createCppObj();
    }

    private static native void configAlias(long j17, java.lang.String str);

    private static native void configColumns(long j17, int i17, long[] jArr, java.lang.String[] strArr);

    private static native void configConflictAction(long j17, int i17);

    private static native void configDefaultValues(long j17);

    private static native void configRecursive(long j17);

    private static native void configSchema(long j17, int i17, long j18, java.lang.String str);

    private static native void configTableName(long j17, java.lang.String str);

    private static native void configUpsert(long j17, long j18);

    private static native void configValues(long j17, long j18);

    private static native void configValues(long j17, int[] iArr, long[] jArr, double[] dArr, java.lang.String[] strArr);

    private static native void configValuesWithBindParameters(long j17, int i17);

    private static native void configWith(long j17, long[] jArr);

    private static native long createCppObj();

    public com.tencent.wcdb.winq.StatementInsert as(java.lang.String str) {
        configAlias(this.cppObj, str);
        return this;
    }

    public com.tencent.wcdb.winq.StatementInsert columns(com.tencent.wcdb.winq.Column... columnArr) {
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

    public com.tencent.wcdb.winq.StatementInsert defaultValues() {
        configDefaultValues(this.cppObj);
        return this;
    }

    @Override // com.tencent.wcdb.winq.Identifier
    public int getType() {
        return 43;
    }

    public com.tencent.wcdb.winq.StatementInsert insertInto(java.lang.String str) {
        configTableName(this.cppObj, str);
        return this;
    }

    public com.tencent.wcdb.winq.StatementInsert of(java.lang.String str) {
        configSchema(this.cppObj, 6, 0L, str);
        return this;
    }

    public com.tencent.wcdb.winq.StatementInsert orAbort() {
        configConflictAction(this.cppObj, com.tencent.wcdb.winq.ConflictAction.Abort.ordinal());
        return this;
    }

    public com.tencent.wcdb.winq.StatementInsert orFail() {
        configConflictAction(this.cppObj, com.tencent.wcdb.winq.ConflictAction.Fail.ordinal());
        return this;
    }

    public com.tencent.wcdb.winq.StatementInsert orIgnore() {
        configConflictAction(this.cppObj, com.tencent.wcdb.winq.ConflictAction.Ignore.ordinal());
        return this;
    }

    public com.tencent.wcdb.winq.StatementInsert orReplace() {
        configConflictAction(this.cppObj, com.tencent.wcdb.winq.ConflictAction.Replace.ordinal());
        return this;
    }

    public com.tencent.wcdb.winq.StatementInsert orRollback() {
        configConflictAction(this.cppObj, com.tencent.wcdb.winq.ConflictAction.Rollback.ordinal());
        return this;
    }

    public com.tencent.wcdb.winq.StatementInsert upsert(com.tencent.wcdb.winq.Upsert upsert) {
        configUpsert(this.cppObj, com.tencent.wcdb.base.CppObject.get((com.tencent.wcdb.base.CppObject) upsert));
        return this;
    }

    public com.tencent.wcdb.winq.StatementInsert values(java.lang.Object... objArr) {
        if (objArr != null && objArr.length != 0) {
            com.tencent.wcdb.winq.MultiTypeArray multiTypeArray = new com.tencent.wcdb.winq.MultiTypeArray(objArr);
            configValues(this.cppObj, multiTypeArray.types, multiTypeArray.longValues, multiTypeArray.doubleValues, multiTypeArray.stringValues);
        }
        return this;
    }

    public com.tencent.wcdb.winq.StatementInsert valuesWithBindParameters(int i17) {
        configValuesWithBindParameters(this.cppObj, i17);
        return this;
    }

    public com.tencent.wcdb.winq.StatementInsert with(com.tencent.wcdb.winq.CommonTableExpression... commonTableExpressionArr) {
        if (commonTableExpressionArr != null && commonTableExpressionArr.length != 0) {
            long[] jArr = new long[commonTableExpressionArr.length];
            for (int i17 = 0; i17 < commonTableExpressionArr.length; i17++) {
                jArr[i17] = com.tencent.wcdb.base.CppObject.get((com.tencent.wcdb.base.CppObject) commonTableExpressionArr[i17]);
            }
            configWith(this.cppObj, jArr);
        }
        return this;
    }

    public com.tencent.wcdb.winq.StatementInsert withRecursive(com.tencent.wcdb.winq.CommonTableExpression... commonTableExpressionArr) {
        if (commonTableExpressionArr != null && commonTableExpressionArr.length != 0) {
            long[] jArr = new long[commonTableExpressionArr.length];
            for (int i17 = 0; i17 < commonTableExpressionArr.length; i17++) {
                jArr[i17] = com.tencent.wcdb.base.CppObject.get((com.tencent.wcdb.base.CppObject) commonTableExpressionArr[i17]);
            }
            configWith(this.cppObj, jArr);
            configRecursive(this.cppObj);
        }
        return this;
    }

    public com.tencent.wcdb.winq.StatementInsert of(com.tencent.wcdb.winq.Schema schema) {
        configSchema(this.cppObj, com.tencent.wcdb.winq.Identifier.getCppType((com.tencent.wcdb.winq.Identifier) schema), com.tencent.wcdb.base.CppObject.get((com.tencent.wcdb.base.CppObject) schema), null);
        return this;
    }

    public com.tencent.wcdb.winq.StatementInsert values(com.tencent.wcdb.winq.StatementSelect statementSelect) {
        configValues(this.cppObj, com.tencent.wcdb.base.CppObject.get((com.tencent.wcdb.base.CppObject) statementSelect));
        return this;
    }

    public com.tencent.wcdb.winq.StatementInsert columns(java.lang.String... strArr) {
        if (strArr.length == 0) {
            return this;
        }
        configColumns(this.cppObj, 6, null, strArr);
        return this;
    }
}
