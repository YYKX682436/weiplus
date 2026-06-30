package com.tencent.wcdb.winq;

/* loaded from: classes12.dex */
public class StatementSelect extends com.tencent.wcdb.winq.Statement implements com.tencent.wcdb.winq.TableOrSubqueryConvertible {
    public StatementSelect() {
        this.cppObj = createCppObj();
    }

    private static native void configCondition(long j17, long j18);

    private static native void configDistinct(long j17);

    private static native void configExcept(long j17);

    private static native void configGroups(long j17, int[] iArr, long[] jArr, double[] dArr, java.lang.String[] strArr);

    private static native void configHaving(long j17, long j18);

    private static native void configIntersect(long j17);

    private static native void configLimitCount(long j17, int i17, long j18);

    private static native void configLimitRange(long j17, int i17, long j18, int i18, long j19);

    private static native void configOffset(long j17, int i17, long j18);

    private static native void configOrders(long j17, long[] jArr);

    private static native void configRecursive(long j17);

    private static native void configResultColumns(long j17, int[] iArr, long[] jArr, double[] dArr, java.lang.String[] strArr);

    private static native void configTableOrSubqueries(long j17, int[] iArr, long[] jArr, double[] dArr, java.lang.String[] strArr);

    private static native void configUnion(long j17);

    private static native void configUnionAll(long j17);

    private static native void configWith(long j17, long[] jArr);

    private static native long createCppObj();

    public com.tencent.wcdb.winq.StatementSelect distinct() {
        configDistinct(this.cppObj);
        return this;
    }

    public com.tencent.wcdb.winq.StatementSelect except() {
        configExcept(this.cppObj);
        return this;
    }

    public com.tencent.wcdb.winq.StatementSelect from(com.tencent.wcdb.winq.TableOrSubqueryConvertible... tableOrSubqueryConvertibleArr) {
        if (tableOrSubqueryConvertibleArr.length == 0) {
            return this;
        }
        int length = tableOrSubqueryConvertibleArr.length;
        int[] iArr = new int[length];
        long[] jArr = new long[length];
        for (int i17 = 0; i17 < length; i17++) {
            iArr[i17] = com.tencent.wcdb.winq.Identifier.getCppType(tableOrSubqueryConvertibleArr[i17]);
            jArr[i17] = com.tencent.wcdb.base.CppObject.get(tableOrSubqueryConvertibleArr[i17]);
        }
        configTableOrSubqueries(this.cppObj, iArr, jArr, null, null);
        return this;
    }

    @Override // com.tencent.wcdb.winq.Identifier
    public int getType() {
        return 42;
    }

    public com.tencent.wcdb.winq.StatementSelect groupBy(com.tencent.wcdb.winq.ExpressionConvertible... expressionConvertibleArr) {
        if (expressionConvertibleArr != null && expressionConvertibleArr.length != 0) {
            int length = expressionConvertibleArr.length;
            int[] iArr = new int[length];
            long[] jArr = new long[length];
            for (int i17 = 0; i17 < length; i17++) {
                iArr[i17] = com.tencent.wcdb.winq.Identifier.getCppType(expressionConvertibleArr[i17]);
                jArr[i17] = com.tencent.wcdb.base.CppObject.get(expressionConvertibleArr[i17]);
            }
            configGroups(this.cppObj, iArr, jArr, null, null);
        }
        return this;
    }

    public com.tencent.wcdb.winq.StatementSelect having(com.tencent.wcdb.winq.Expression expression) {
        configHaving(this.cppObj, com.tencent.wcdb.base.CppObject.get((com.tencent.wcdb.base.CppObject) expression));
        return this;
    }

    public com.tencent.wcdb.winq.StatementSelect intersect() {
        configIntersect(this.cppObj);
        return this;
    }

    public com.tencent.wcdb.winq.StatementSelect limit(long j17, long j18) {
        configLimitRange(this.cppObj, 3, j17, 3, j18);
        return this;
    }

    public com.tencent.wcdb.winq.StatementSelect offset(long j17) {
        configOffset(this.cppObj, 3, j17);
        return this;
    }

    public com.tencent.wcdb.winq.StatementSelect orderBy(com.tencent.wcdb.winq.OrderingTerm... orderingTermArr) {
        if (orderingTermArr != null && orderingTermArr.length != 0) {
            long[] jArr = new long[orderingTermArr.length];
            for (int i17 = 0; i17 < orderingTermArr.length; i17++) {
                jArr[i17] = com.tencent.wcdb.base.CppObject.get((com.tencent.wcdb.base.CppObject) orderingTermArr[i17]);
            }
            configOrders(this.cppObj, jArr);
        }
        return this;
    }

    public com.tencent.wcdb.winq.StatementSelect select(com.tencent.wcdb.winq.ResultColumnConvertible... resultColumnConvertibleArr) {
        if (resultColumnConvertibleArr.length == 0) {
            return this;
        }
        int length = resultColumnConvertibleArr.length;
        int[] iArr = new int[length];
        long[] jArr = new long[length];
        for (int i17 = 0; i17 < length; i17++) {
            iArr[i17] = com.tencent.wcdb.winq.Identifier.getCppType(resultColumnConvertibleArr[i17]);
            jArr[i17] = com.tencent.wcdb.base.CppObject.get(resultColumnConvertibleArr[i17]);
        }
        configResultColumns(this.cppObj, iArr, jArr, null, null);
        return this;
    }

    public com.tencent.wcdb.winq.StatementSelect union() {
        configUnion(this.cppObj);
        return this;
    }

    public com.tencent.wcdb.winq.StatementSelect unionAll() {
        configUnionAll(this.cppObj);
        return this;
    }

    public com.tencent.wcdb.winq.StatementSelect where(com.tencent.wcdb.winq.Expression expression) {
        configCondition(this.cppObj, com.tencent.wcdb.base.CppObject.get((com.tencent.wcdb.base.CppObject) expression));
        return this;
    }

    public com.tencent.wcdb.winq.StatementSelect with(com.tencent.wcdb.winq.CommonTableExpression... commonTableExpressionArr) {
        if (commonTableExpressionArr != null && commonTableExpressionArr.length != 0) {
            long[] jArr = new long[commonTableExpressionArr.length];
            for (int i17 = 0; i17 < commonTableExpressionArr.length; i17++) {
                jArr[i17] = com.tencent.wcdb.base.CppObject.get((com.tencent.wcdb.base.CppObject) commonTableExpressionArr[i17]);
            }
            configWith(this.cppObj, jArr);
        }
        return this;
    }

    public com.tencent.wcdb.winq.StatementSelect withRecursive(com.tencent.wcdb.winq.CommonTableExpression... commonTableExpressionArr) {
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

    public com.tencent.wcdb.winq.StatementSelect limit(long j17, com.tencent.wcdb.winq.ExpressionConvertible expressionConvertible) {
        configLimitRange(this.cppObj, 3, j17, com.tencent.wcdb.winq.Identifier.getCppType(expressionConvertible), com.tencent.wcdb.base.CppObject.get(expressionConvertible));
        return this;
    }

    public com.tencent.wcdb.winq.StatementSelect offset(com.tencent.wcdb.winq.ExpressionConvertible expressionConvertible) {
        configOffset(this.cppObj, com.tencent.wcdb.winq.Identifier.getCppType(expressionConvertible), com.tencent.wcdb.base.CppObject.get(expressionConvertible));
        return this;
    }

    public com.tencent.wcdb.winq.StatementSelect limit(com.tencent.wcdb.winq.ExpressionConvertible expressionConvertible, com.tencent.wcdb.winq.ExpressionConvertible expressionConvertible2) {
        configLimitRange(this.cppObj, com.tencent.wcdb.winq.Identifier.getCppType(expressionConvertible), com.tencent.wcdb.base.CppObject.get(expressionConvertible), com.tencent.wcdb.winq.Identifier.getCppType(expressionConvertible2), com.tencent.wcdb.base.CppObject.get(expressionConvertible2));
        return this;
    }

    public com.tencent.wcdb.winq.StatementSelect limit(com.tencent.wcdb.winq.ExpressionConvertible expressionConvertible, long j17) {
        configLimitRange(this.cppObj, com.tencent.wcdb.winq.Identifier.getCppType(expressionConvertible), com.tencent.wcdb.base.CppObject.get(expressionConvertible), 3, j17);
        return this;
    }

    public com.tencent.wcdb.winq.StatementSelect limit(long j17) {
        configLimitCount(this.cppObj, 3, j17);
        return this;
    }

    public com.tencent.wcdb.winq.StatementSelect limit(com.tencent.wcdb.winq.ExpressionConvertible expressionConvertible) {
        configLimitCount(this.cppObj, com.tencent.wcdb.winq.Identifier.getCppType(expressionConvertible), com.tencent.wcdb.base.CppObject.get(expressionConvertible));
        return this;
    }

    public com.tencent.wcdb.winq.StatementSelect from(java.lang.String... strArr) {
        if (strArr.length == 0) {
            return this;
        }
        int[] iArr = new int[strArr.length];
        java.util.Arrays.fill(iArr, 6);
        configTableOrSubqueries(this.cppObj, iArr, null, null, strArr);
        return this;
    }

    public com.tencent.wcdb.winq.StatementSelect groupBy(java.lang.String... strArr) {
        if (strArr != null && strArr.length != 0) {
            int[] iArr = new int[strArr.length];
            java.util.Arrays.fill(iArr, 6);
            configGroups(this.cppObj, iArr, null, null, strArr);
        }
        return this;
    }

    public com.tencent.wcdb.winq.StatementSelect select(java.lang.String... strArr) {
        if (strArr.length == 0) {
            return this;
        }
        int[] iArr = new int[strArr.length];
        java.util.Arrays.fill(iArr, 6);
        configResultColumns(this.cppObj, iArr, null, null, strArr);
        return this;
    }

    public com.tencent.wcdb.winq.StatementSelect from(java.lang.Object... objArr) {
        java.lang.String[] strArr;
        if (objArr.length == 0) {
            return this;
        }
        int length = objArr.length;
        int[] iArr = new int[length];
        long[] jArr = new long[length];
        java.lang.String[] strArr2 = new java.lang.String[length];
        int i17 = 0;
        int i18 = 0;
        for (int i19 = 0; i19 < length; i19++) {
            java.lang.Object obj = objArr[i19];
            if (obj instanceof java.lang.String) {
                iArr[i19] = 6;
                strArr2[i17] = (java.lang.String) obj;
                i17++;
            } else if (obj instanceof com.tencent.wcdb.winq.TableOrSubqueryConvertible) {
                com.tencent.wcdb.winq.TableOrSubqueryConvertible tableOrSubqueryConvertible = (com.tencent.wcdb.winq.TableOrSubqueryConvertible) obj;
                iArr[i19] = com.tencent.wcdb.winq.Identifier.getCppType(tableOrSubqueryConvertible);
                jArr[i18] = com.tencent.wcdb.base.CppObject.get(tableOrSubqueryConvertible);
                i18++;
            }
        }
        if (length * 0.75d > i17) {
            strArr = i17 == 0 ? null : (java.lang.String[]) java.util.Arrays.copyOf(strArr2, i17);
        } else {
            strArr = strArr2;
        }
        configTableOrSubqueries(this.cppObj, iArr, jArr, null, strArr);
        return this;
    }

    public com.tencent.wcdb.winq.StatementSelect groupBy(java.lang.Object... objArr) {
        java.lang.String[] strArr;
        if (objArr != null && objArr.length != 0) {
            int length = objArr.length;
            int[] iArr = new int[length];
            long[] jArr = new long[length];
            java.lang.String[] strArr2 = new java.lang.String[length];
            int i17 = 0;
            int i18 = 0;
            for (int i19 = 0; i19 < length; i19++) {
                java.lang.Object obj = objArr[i19];
                if (obj instanceof java.lang.String) {
                    iArr[i19] = 6;
                    strArr2[i17] = (java.lang.String) obj;
                    i17++;
                } else if (obj instanceof com.tencent.wcdb.winq.ExpressionConvertible) {
                    com.tencent.wcdb.winq.ExpressionConvertible expressionConvertible = (com.tencent.wcdb.winq.ExpressionConvertible) obj;
                    iArr[i19] = com.tencent.wcdb.winq.Identifier.getCppType(expressionConvertible);
                    jArr[i18] = com.tencent.wcdb.base.CppObject.get(expressionConvertible);
                    i18++;
                }
            }
            if (length * 0.75d > i17) {
                strArr = i17 == 0 ? null : (java.lang.String[]) java.util.Arrays.copyOf(strArr2, i17);
            } else {
                strArr = strArr2;
            }
            configGroups(this.cppObj, iArr, jArr, null, strArr);
        }
        return this;
    }

    public com.tencent.wcdb.winq.StatementSelect select(java.lang.Object... objArr) {
        java.lang.String[] strArr;
        if (objArr.length == 0) {
            return this;
        }
        int length = objArr.length;
        int[] iArr = new int[length];
        long[] jArr = new long[length];
        java.lang.String[] strArr2 = new java.lang.String[length];
        int i17 = 0;
        int i18 = 0;
        for (int i19 = 0; i19 < length; i19++) {
            java.lang.Object obj = objArr[i19];
            if (obj instanceof java.lang.String) {
                iArr[i19] = 6;
                strArr2[i17] = (java.lang.String) obj;
                i17++;
            } else if (obj instanceof com.tencent.wcdb.winq.ResultColumnConvertible) {
                com.tencent.wcdb.winq.ResultColumnConvertible resultColumnConvertible = (com.tencent.wcdb.winq.ResultColumnConvertible) obj;
                iArr[i19] = com.tencent.wcdb.winq.Identifier.getCppType(resultColumnConvertible);
                jArr[i18] = com.tencent.wcdb.base.CppObject.get(resultColumnConvertible);
                i18++;
            }
        }
        if (length * 0.75d > i17) {
            strArr = i17 == 0 ? null : (java.lang.String[]) java.util.Arrays.copyOf(strArr2, i17);
        } else {
            strArr = strArr2;
        }
        configResultColumns(this.cppObj, iArr, jArr, null, strArr);
        return this;
    }
}
