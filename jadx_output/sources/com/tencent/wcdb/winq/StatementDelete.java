package com.tencent.wcdb.winq;

/* loaded from: classes12.dex */
public class StatementDelete extends com.tencent.wcdb.winq.Statement {
    public StatementDelete() {
        this.cppObj = createCppObj();
    }

    private static native void configCondition(long j17, long j18);

    private static native void configLimitCount(long j17, int i17, long j18);

    private static native void configLimitRange(long j17, int i17, long j18, int i18, long j19);

    private static native void configOffset(long j17, int i17, long j18);

    private static native void configOrders(long j17, long[] jArr);

    private static native void configRecursive(long j17);

    private static native void configTable(long j17, int i17, long j18, java.lang.String str);

    private static native void configWith(long j17, long[] jArr);

    private static native long createCppObj();

    public com.tencent.wcdb.winq.StatementDelete deleteFrom(java.lang.String str) {
        configTable(this.cppObj, 6, 0L, str);
        return this;
    }

    @Override // com.tencent.wcdb.winq.Identifier
    public int getType() {
        return 44;
    }

    public com.tencent.wcdb.winq.StatementDelete limit(long j17, long j18) {
        configLimitRange(this.cppObj, 3, j17, 3, j18);
        return this;
    }

    public com.tencent.wcdb.winq.StatementDelete offset(long j17) {
        configOffset(this.cppObj, 3, j17);
        return this;
    }

    public com.tencent.wcdb.winq.StatementDelete orderBy(com.tencent.wcdb.winq.OrderingTerm... orderingTermArr) {
        if (orderingTermArr != null && orderingTermArr.length != 0) {
            long[] jArr = new long[orderingTermArr.length];
            for (int i17 = 0; i17 < orderingTermArr.length; i17++) {
                jArr[i17] = com.tencent.wcdb.base.CppObject.get((com.tencent.wcdb.base.CppObject) orderingTermArr[i17]);
            }
            configOrders(this.cppObj, jArr);
        }
        return this;
    }

    public com.tencent.wcdb.winq.StatementDelete where(com.tencent.wcdb.winq.Expression expression) {
        configCondition(this.cppObj, com.tencent.wcdb.base.CppObject.get((com.tencent.wcdb.base.CppObject) expression));
        return this;
    }

    public com.tencent.wcdb.winq.StatementDelete with(com.tencent.wcdb.winq.CommonTableExpression... commonTableExpressionArr) {
        if (commonTableExpressionArr != null && commonTableExpressionArr.length != 0) {
            long[] jArr = new long[commonTableExpressionArr.length];
            for (int i17 = 0; i17 < commonTableExpressionArr.length; i17++) {
                jArr[i17] = com.tencent.wcdb.base.CppObject.get((com.tencent.wcdb.base.CppObject) commonTableExpressionArr[i17]);
            }
            configWith(this.cppObj, jArr);
        }
        return this;
    }

    public com.tencent.wcdb.winq.StatementDelete withRecursive(com.tencent.wcdb.winq.CommonTableExpression... commonTableExpressionArr) {
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

    public com.tencent.wcdb.winq.StatementDelete deleteFrom(com.tencent.wcdb.winq.QualifiedTable qualifiedTable) {
        configTable(this.cppObj, com.tencent.wcdb.winq.Identifier.getCppType((com.tencent.wcdb.winq.Identifier) qualifiedTable), com.tencent.wcdb.base.CppObject.get((com.tencent.wcdb.base.CppObject) qualifiedTable), null);
        return this;
    }

    public com.tencent.wcdb.winq.StatementDelete limit(long j17, com.tencent.wcdb.winq.ExpressionConvertible expressionConvertible) {
        configLimitRange(this.cppObj, 3, j17, com.tencent.wcdb.winq.Identifier.getCppType(expressionConvertible), com.tencent.wcdb.base.CppObject.get(expressionConvertible));
        return this;
    }

    public com.tencent.wcdb.winq.StatementDelete offset(com.tencent.wcdb.winq.ExpressionConvertible expressionConvertible) {
        configOffset(this.cppObj, com.tencent.wcdb.winq.Identifier.getCppType(expressionConvertible), com.tencent.wcdb.base.CppObject.get(expressionConvertible));
        return this;
    }

    public com.tencent.wcdb.winq.StatementDelete limit(com.tencent.wcdb.winq.ExpressionConvertible expressionConvertible, com.tencent.wcdb.winq.ExpressionConvertible expressionConvertible2) {
        configLimitRange(this.cppObj, com.tencent.wcdb.winq.Identifier.getCppType(expressionConvertible), com.tencent.wcdb.base.CppObject.get(expressionConvertible), com.tencent.wcdb.winq.Identifier.getCppType(expressionConvertible2), com.tencent.wcdb.base.CppObject.get(expressionConvertible2));
        return this;
    }

    public com.tencent.wcdb.winq.StatementDelete limit(com.tencent.wcdb.winq.ExpressionConvertible expressionConvertible, long j17) {
        configLimitRange(this.cppObj, com.tencent.wcdb.winq.Identifier.getCppType(expressionConvertible), com.tencent.wcdb.base.CppObject.get(expressionConvertible), 3, j17);
        return this;
    }

    public com.tencent.wcdb.winq.StatementDelete limit(long j17) {
        configLimitCount(this.cppObj, 3, j17);
        return this;
    }

    public com.tencent.wcdb.winq.StatementDelete limit(com.tencent.wcdb.winq.ExpressionConvertible expressionConvertible) {
        configLimitCount(this.cppObj, com.tencent.wcdb.winq.Identifier.getCppType(expressionConvertible), com.tencent.wcdb.base.CppObject.get(expressionConvertible));
        return this;
    }
}
