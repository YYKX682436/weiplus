package com.tencent.wcdb.winq;

/* loaded from: classes12.dex */
public class StatementUpdate extends com.tencent.wcdb.winq.Statement {
    public StatementUpdate() {
        this.cppObj = createCppObj();
    }

    private static native void configColumns(long j17, int i17, long[] jArr, java.lang.String[] strArr);

    private static native void configColumnsToBindParameters(long j17, int i17, long[] jArr, java.lang.String[] strArr);

    private static native void configColumnsToValues(long j17, int i17, long[] jArr, java.lang.String[] strArr, int[] iArr, long[] jArr2, double[] dArr, java.lang.String[] strArr2);

    private static native void configCondition(long j17, long j18);

    private static native void configConflictAction(long j17, int i17);

    private static native void configLimitCount(long j17, int i17, long j18);

    private static native void configLimitRange(long j17, int i17, long j18, int i18, long j19);

    private static native void configOffset(long j17, int i17, long j18);

    private static native void configOrders(long j17, long[] jArr);

    private static native void configRecursive(long j17);

    private static native void configTable(long j17, int i17, long j18, java.lang.String str);

    private static native void configToValue(long j17, int i17, long j18, double d17, java.lang.String str);

    private static native void configWith(long j17, long[] jArr);

    private static native long createCppObj();

    @Override // com.tencent.wcdb.winq.Identifier
    public int getType() {
        return 45;
    }

    public com.tencent.wcdb.winq.StatementUpdate limit(long j17, long j18) {
        configLimitRange(this.cppObj, 3, j17, 3, j18);
        return this;
    }

    public com.tencent.wcdb.winq.StatementUpdate offset(long j17) {
        configOffset(this.cppObj, 3, j17);
        return this;
    }

    public com.tencent.wcdb.winq.StatementUpdate orAbort() {
        configConflictAction(this.cppObj, com.tencent.wcdb.winq.ConflictAction.Abort.ordinal());
        return this;
    }

    public com.tencent.wcdb.winq.StatementUpdate orFail() {
        configConflictAction(this.cppObj, com.tencent.wcdb.winq.ConflictAction.Fail.ordinal());
        return this;
    }

    public com.tencent.wcdb.winq.StatementUpdate orIgnore() {
        configConflictAction(this.cppObj, com.tencent.wcdb.winq.ConflictAction.Ignore.ordinal());
        return this;
    }

    public com.tencent.wcdb.winq.StatementUpdate orReplace() {
        configConflictAction(this.cppObj, com.tencent.wcdb.winq.ConflictAction.Replace.ordinal());
        return this;
    }

    public com.tencent.wcdb.winq.StatementUpdate orRollback() {
        configConflictAction(this.cppObj, com.tencent.wcdb.winq.ConflictAction.Rollback.ordinal());
        return this;
    }

    public com.tencent.wcdb.winq.StatementUpdate orderBy(com.tencent.wcdb.winq.OrderingTerm... orderingTermArr) {
        if (orderingTermArr != null && orderingTermArr.length != 0) {
            long[] jArr = new long[orderingTermArr.length];
            for (int i17 = 0; i17 < orderingTermArr.length; i17++) {
                jArr[i17] = com.tencent.wcdb.base.CppObject.get((com.tencent.wcdb.base.CppObject) orderingTermArr[i17]);
            }
            configOrders(this.cppObj, jArr);
        }
        return this;
    }

    public com.tencent.wcdb.winq.StatementUpdate set(com.tencent.wcdb.winq.Column... columnArr) {
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

    public com.tencent.wcdb.winq.StatementUpdate setColumnsToBindParameters(com.tencent.wcdb.winq.Column... columnArr) {
        if (columnArr.length == 0) {
            return this;
        }
        long[] jArr = new long[columnArr.length];
        for (int i17 = 0; i17 < columnArr.length; i17++) {
            jArr[i17] = com.tencent.wcdb.base.CppObject.get((com.tencent.wcdb.base.CppObject) columnArr[i17]);
        }
        configColumnsToBindParameters(this.cppObj, 7, jArr, null);
        return this;
    }

    public com.tencent.wcdb.winq.StatementUpdate setColumnsToValues(com.tencent.wcdb.winq.Column[] columnArr, java.lang.Object[] objArr) {
        if (columnArr.length != 0 && objArr.length != 0) {
            long[] jArr = new long[columnArr.length];
            for (int i17 = 0; i17 < columnArr.length; i17++) {
                jArr[i17] = com.tencent.wcdb.base.CppObject.get((com.tencent.wcdb.base.CppObject) columnArr[i17]);
            }
            com.tencent.wcdb.winq.MultiTypeArray multiTypeArray = new com.tencent.wcdb.winq.MultiTypeArray(objArr);
            configColumnsToValues(this.cppObj, 7, jArr, null, multiTypeArray.types, multiTypeArray.longValues, multiTypeArray.doubleValues, multiTypeArray.stringValues);
        }
        return this;
    }

    public com.tencent.wcdb.winq.StatementUpdate to(boolean z17) {
        configToValue(this.cppObj, 2, z17 ? 1L : 0L, 0.0d, null);
        return this;
    }

    public com.tencent.wcdb.winq.StatementUpdate update(java.lang.String str) {
        configTable(this.cppObj, 6, 0L, str);
        return this;
    }

    public com.tencent.wcdb.winq.StatementUpdate where(com.tencent.wcdb.winq.Expression expression) {
        configCondition(this.cppObj, com.tencent.wcdb.base.CppObject.get((com.tencent.wcdb.base.CppObject) expression));
        return this;
    }

    public com.tencent.wcdb.winq.StatementUpdate with(com.tencent.wcdb.winq.CommonTableExpression... commonTableExpressionArr) {
        if (commonTableExpressionArr != null && commonTableExpressionArr.length != 0) {
            long[] jArr = new long[commonTableExpressionArr.length];
            for (int i17 = 0; i17 < commonTableExpressionArr.length; i17++) {
                jArr[i17] = com.tencent.wcdb.base.CppObject.get((com.tencent.wcdb.base.CppObject) commonTableExpressionArr[i17]);
            }
            configWith(this.cppObj, jArr);
        }
        return this;
    }

    public com.tencent.wcdb.winq.StatementUpdate withRecursive(com.tencent.wcdb.winq.CommonTableExpression... commonTableExpressionArr) {
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

    public com.tencent.wcdb.winq.StatementUpdate limit(long j17, com.tencent.wcdb.winq.ExpressionConvertible expressionConvertible) {
        configLimitRange(this.cppObj, 3, j17, com.tencent.wcdb.winq.Identifier.getCppType(expressionConvertible), com.tencent.wcdb.base.CppObject.get(expressionConvertible));
        return this;
    }

    public com.tencent.wcdb.winq.StatementUpdate offset(com.tencent.wcdb.winq.ExpressionConvertible expressionConvertible) {
        configOffset(this.cppObj, com.tencent.wcdb.winq.Identifier.getCppType(expressionConvertible), com.tencent.wcdb.base.CppObject.get(expressionConvertible));
        return this;
    }

    public com.tencent.wcdb.winq.StatementUpdate to(byte b17) {
        configToValue(this.cppObj, 3, b17, 0.0d, null);
        return this;
    }

    public com.tencent.wcdb.winq.StatementUpdate update(com.tencent.wcdb.winq.QualifiedTable qualifiedTable) {
        configTable(this.cppObj, com.tencent.wcdb.winq.Identifier.getCppType((com.tencent.wcdb.winq.Identifier) qualifiedTable), com.tencent.wcdb.base.CppObject.get((com.tencent.wcdb.base.CppObject) qualifiedTable), null);
        return this;
    }

    public com.tencent.wcdb.winq.StatementUpdate limit(com.tencent.wcdb.winq.ExpressionConvertible expressionConvertible, com.tencent.wcdb.winq.ExpressionConvertible expressionConvertible2) {
        configLimitRange(this.cppObj, com.tencent.wcdb.winq.Identifier.getCppType(expressionConvertible), com.tencent.wcdb.base.CppObject.get(expressionConvertible), com.tencent.wcdb.winq.Identifier.getCppType(expressionConvertible2), com.tencent.wcdb.base.CppObject.get(expressionConvertible2));
        return this;
    }

    public com.tencent.wcdb.winq.StatementUpdate to(short s17) {
        configToValue(this.cppObj, 3, s17, 0.0d, null);
        return this;
    }

    public com.tencent.wcdb.winq.StatementUpdate limit(com.tencent.wcdb.winq.ExpressionConvertible expressionConvertible, long j17) {
        configLimitRange(this.cppObj, com.tencent.wcdb.winq.Identifier.getCppType(expressionConvertible), com.tencent.wcdb.base.CppObject.get(expressionConvertible), 3, j17);
        return this;
    }

    public com.tencent.wcdb.winq.StatementUpdate to(int i17) {
        configToValue(this.cppObj, 3, i17, 0.0d, null);
        return this;
    }

    public com.tencent.wcdb.winq.StatementUpdate limit(long j17) {
        configLimitCount(this.cppObj, 3, j17);
        return this;
    }

    public com.tencent.wcdb.winq.StatementUpdate to(long j17) {
        configToValue(this.cppObj, 3, j17, 0.0d, null);
        return this;
    }

    public com.tencent.wcdb.winq.StatementUpdate limit(com.tencent.wcdb.winq.ExpressionConvertible expressionConvertible) {
        configLimitCount(this.cppObj, com.tencent.wcdb.winq.Identifier.getCppType(expressionConvertible), com.tencent.wcdb.base.CppObject.get(expressionConvertible));
        return this;
    }

    public com.tencent.wcdb.winq.StatementUpdate set(java.lang.String... strArr) {
        if (strArr.length == 0) {
            return this;
        }
        configColumns(this.cppObj, 6, null, strArr);
        return this;
    }

    public com.tencent.wcdb.winq.StatementUpdate setColumnsToBindParameters(java.lang.String... strArr) {
        if (strArr.length == 0) {
            return this;
        }
        configColumnsToBindParameters(this.cppObj, 6, null, strArr);
        return this;
    }

    public com.tencent.wcdb.winq.StatementUpdate to(float f17) {
        configToValue(this.cppObj, 5, 0L, f17, null);
        return this;
    }

    public com.tencent.wcdb.winq.StatementUpdate setColumnsToValues(java.lang.String[] strArr, java.lang.Object[] objArr) {
        if (strArr.length != 0 && objArr.length != 0) {
            com.tencent.wcdb.winq.MultiTypeArray multiTypeArray = new com.tencent.wcdb.winq.MultiTypeArray(objArr);
            configColumnsToValues(this.cppObj, 6, null, strArr, multiTypeArray.types, multiTypeArray.longValues, multiTypeArray.doubleValues, multiTypeArray.stringValues);
        }
        return this;
    }

    public com.tencent.wcdb.winq.StatementUpdate to(double d17) {
        configToValue(this.cppObj, 5, 0L, d17, null);
        return this;
    }

    public com.tencent.wcdb.winq.StatementUpdate to(java.lang.String str) {
        if (str != null) {
            configToValue(this.cppObj, 6, 0L, 0.0d, str);
        } else {
            configToValue(this.cppObj, 1, 0L, 0.0d, null);
        }
        return this;
    }

    public com.tencent.wcdb.winq.StatementUpdate to(com.tencent.wcdb.winq.ExpressionConvertible expressionConvertible) {
        configToValue(this.cppObj, com.tencent.wcdb.winq.Identifier.getCppType(expressionConvertible), com.tencent.wcdb.base.CppObject.get(expressionConvertible), 0.0d, null);
        return this;
    }
}
