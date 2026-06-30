package com.tencent.wcdb.winq;

/* loaded from: classes12.dex */
public class Expression extends com.tencent.wcdb.winq.ExpressionOperable implements com.tencent.wcdb.winq.IndexedColumnConvertible, com.tencent.wcdb.winq.ResultColumnConvertible {
    public Expression() {
    }

    private static native void argument(long j17, int i17, long j18, double d17, java.lang.String str);

    private static native long as(long j17, java.lang.String str);

    private static native void as(long j17, int i17);

    private static native long caseWithExp(int i17, long j17, java.lang.String str);

    public static com.tencent.wcdb.winq.Expression case_() {
        com.tencent.wcdb.winq.Expression expression = new com.tencent.wcdb.winq.Expression();
        expression.cppObj = caseWithExp(0, 0L, null);
        return expression;
    }

    private static native long cast(int i17, long j17, java.lang.String str);

    public static com.tencent.wcdb.winq.Expression cast(java.lang.String str) {
        com.tencent.wcdb.winq.Expression expression = new com.tencent.wcdb.winq.Expression();
        expression.cppObj = cast(6, 0L, str);
        return expression;
    }

    private static native long createCppObj(int i17, long j17);

    private static native long createWithExistStatement(long j17);

    private static native long createWithFunction(java.lang.String str);

    private static native long createWithNotExistStatement(long j17);

    private static native long createWithWindowFunction(java.lang.String str);

    private static native void distinct(long j17);

    private static native void escape(long j17, java.lang.String str);

    public static com.tencent.wcdb.winq.Expression exists(com.tencent.wcdb.winq.StatementSelect statementSelect) {
        com.tencent.wcdb.winq.Expression expression = new com.tencent.wcdb.winq.Expression();
        expression.cppObj = createWithExistStatement(com.tencent.wcdb.base.CppObject.get((com.tencent.wcdb.base.CppObject) statementSelect));
        return expression;
    }

    private static native void filter(long j17, long j18);

    public static com.tencent.wcdb.winq.Expression function(java.lang.String str) {
        return com.tencent.wcdb.winq.ExpressionOperable.createExpression(createWithFunction(str));
    }

    private static native void invoke(long j17);

    private static native void invokeAll(long j17);

    public static com.tencent.wcdb.winq.Expression notExists(com.tencent.wcdb.winq.StatementSelect statementSelect) {
        com.tencent.wcdb.winq.Expression expression = new com.tencent.wcdb.winq.Expression();
        expression.cppObj = createWithNotExistStatement(com.tencent.wcdb.base.CppObject.get((com.tencent.wcdb.base.CppObject) statementSelect));
        return expression;
    }

    private static native void overWindow(long j17, java.lang.String str);

    private static native void overWindowDef(long j17, long j18);

    private static native void schema(long j17, int i17, long j18, java.lang.String str);

    private static native void setWithElseExp(long j17, int i17, long j18, double d17, java.lang.String str);

    private static native void setWithThenExp(long j17, int i17, long j18, double d17, java.lang.String str);

    private static native void setWithWhenExp(long j17, int i17, long j18, double d17, java.lang.String str);

    public static com.tencent.wcdb.winq.Expression windowFunction(java.lang.String str) {
        com.tencent.wcdb.winq.Expression expression = new com.tencent.wcdb.winq.Expression();
        expression.cppObj = createWithWindowFunction(str);
        return expression;
    }

    public com.tencent.wcdb.winq.Expression argument(boolean z17) {
        argument(this.cppObj, 2, z17 ? 1L : 0L, 0.0d, null);
        return this;
    }

    public com.tencent.wcdb.winq.Expression as(com.tencent.wcdb.winq.ColumnType columnType) {
        as(this.cppObj, columnType.ordinal());
        return this;
    }

    public com.tencent.wcdb.winq.Expression distinct() {
        distinct(this.cppObj);
        return this;
    }

    public com.tencent.wcdb.winq.Expression else_(boolean z17) {
        setWithElseExp(this.cppObj, 2, z17 ? 1L : 0L, 0.0d, null);
        return this;
    }

    public com.tencent.wcdb.winq.Expression escape(java.lang.String str) {
        escape(this.cppObj, str);
        return this;
    }

    public com.tencent.wcdb.winq.Expression filter(com.tencent.wcdb.winq.Expression expression) {
        filter(this.cppObj, expression.cppObj);
        return this;
    }

    @Override // com.tencent.wcdb.winq.Identifier
    public int getType() {
        return 11;
    }

    public com.tencent.wcdb.winq.Expression invoke() {
        invoke(this.cppObj);
        return this;
    }

    public com.tencent.wcdb.winq.Expression invokeAll() {
        invokeAll(this.cppObj);
        return this;
    }

    public com.tencent.wcdb.winq.Expression over(com.tencent.wcdb.winq.WindowDef windowDef) {
        overWindowDef(this.cppObj, com.tencent.wcdb.base.CppObject.get((com.tencent.wcdb.base.CppObject) windowDef));
        return this;
    }

    public com.tencent.wcdb.winq.Expression schema(java.lang.String str) {
        schema(this.cppObj, 6, 0L, str);
        return this;
    }

    public com.tencent.wcdb.winq.Expression then(boolean z17) {
        setWithThenExp(this.cppObj, 2, z17 ? 1L : 0L, 0.0d, null);
        return this;
    }

    public com.tencent.wcdb.winq.Expression when(boolean z17) {
        setWithWhenExp(this.cppObj, 2, z17 ? 1L : 0L, 0.0d, null);
        return this;
    }

    public Expression(com.tencent.wcdb.winq.LiteralValue literalValue) {
        this.cppObj = createCppObj(com.tencent.wcdb.winq.Identifier.getCppType((com.tencent.wcdb.winq.Identifier) literalValue), com.tencent.wcdb.base.CppObject.get((com.tencent.wcdb.base.CppObject) literalValue));
    }

    public com.tencent.wcdb.winq.Expression argument(byte b17) {
        argument(this.cppObj, 3, b17, 0.0d, null);
        return this;
    }

    public com.tencent.wcdb.winq.ResultColumn as(java.lang.String str) {
        return new com.tencent.wcdb.winq.ResultColumn(as(this.cppObj, str));
    }

    public com.tencent.wcdb.winq.Expression else_(byte b17) {
        setWithElseExp(this.cppObj, 3, b17, 0.0d, null);
        return this;
    }

    public com.tencent.wcdb.winq.Expression over(java.lang.String str) {
        overWindow(this.cppObj, str);
        return this;
    }

    public com.tencent.wcdb.winq.Expression schema(com.tencent.wcdb.winq.Schema schema) {
        schema(this.cppObj, com.tencent.wcdb.winq.Identifier.getCppType((com.tencent.wcdb.winq.Identifier) schema), com.tencent.wcdb.base.CppObject.get((com.tencent.wcdb.base.CppObject) schema), null);
        return this;
    }

    public com.tencent.wcdb.winq.Expression then(byte b17) {
        setWithThenExp(this.cppObj, 3, b17, 0.0d, null);
        return this;
    }

    public com.tencent.wcdb.winq.Expression when(byte b17) {
        setWithWhenExp(this.cppObj, 3, b17, 0.0d, null);
        return this;
    }

    public static com.tencent.wcdb.winq.Expression case_(java.lang.String str) {
        if (str == null) {
            return case_();
        }
        com.tencent.wcdb.winq.Expression expression = new com.tencent.wcdb.winq.Expression();
        expression.cppObj = caseWithExp(6, 0L, str);
        return expression;
    }

    public static com.tencent.wcdb.winq.Expression cast(com.tencent.wcdb.winq.ExpressionConvertible expressionConvertible) {
        com.tencent.wcdb.winq.Expression expression = new com.tencent.wcdb.winq.Expression();
        expression.cppObj = cast(com.tencent.wcdb.winq.Identifier.getCppType(expressionConvertible), com.tencent.wcdb.base.CppObject.get(expressionConvertible), null);
        return expression;
    }

    public com.tencent.wcdb.winq.Expression argument(short s17) {
        argument(this.cppObj, 3, s17, 0.0d, null);
        return this;
    }

    public com.tencent.wcdb.winq.Expression else_(short s17) {
        setWithElseExp(this.cppObj, 3, s17, 0.0d, null);
        return this;
    }

    public com.tencent.wcdb.winq.Expression then(short s17) {
        setWithThenExp(this.cppObj, 3, s17, 0.0d, null);
        return this;
    }

    public com.tencent.wcdb.winq.Expression when(short s17) {
        setWithWhenExp(this.cppObj, 3, s17, 0.0d, null);
        return this;
    }

    public Expression(com.tencent.wcdb.winq.BindParameter bindParameter) {
        this.cppObj = createCppObj(com.tencent.wcdb.winq.Identifier.getCppType((com.tencent.wcdb.winq.Identifier) bindParameter), com.tencent.wcdb.base.CppObject.get((com.tencent.wcdb.base.CppObject) bindParameter));
    }

    public com.tencent.wcdb.winq.Expression argument(int i17) {
        argument(this.cppObj, 3, i17, 0.0d, null);
        return this;
    }

    public com.tencent.wcdb.winq.Expression else_(int i17) {
        setWithElseExp(this.cppObj, 3, i17, 0.0d, null);
        return this;
    }

    public com.tencent.wcdb.winq.Expression then(int i17) {
        setWithThenExp(this.cppObj, 3, i17, 0.0d, null);
        return this;
    }

    public com.tencent.wcdb.winq.Expression when(int i17) {
        setWithWhenExp(this.cppObj, 3, i17, 0.0d, null);
        return this;
    }

    public com.tencent.wcdb.winq.Expression argument(long j17) {
        argument(this.cppObj, 3, j17, 0.0d, null);
        return this;
    }

    public com.tencent.wcdb.winq.Expression else_(long j17) {
        setWithElseExp(this.cppObj, 3, j17, 0.0d, null);
        return this;
    }

    public com.tencent.wcdb.winq.Expression then(long j17) {
        setWithThenExp(this.cppObj, 3, j17, 0.0d, null);
        return this;
    }

    public com.tencent.wcdb.winq.Expression when(long j17) {
        setWithWhenExp(this.cppObj, 3, j17, 0.0d, null);
        return this;
    }

    public Expression(com.tencent.wcdb.winq.Column column) {
        this.cppObj = createCppObj(com.tencent.wcdb.winq.Identifier.getCppType((com.tencent.wcdb.winq.Identifier) column), com.tencent.wcdb.base.CppObject.get((com.tencent.wcdb.base.CppObject) column));
    }

    public static com.tencent.wcdb.winq.Expression case_(com.tencent.wcdb.winq.ExpressionConvertible expressionConvertible) {
        com.tencent.wcdb.winq.Expression expression = new com.tencent.wcdb.winq.Expression();
        expression.cppObj = caseWithExp(com.tencent.wcdb.winq.Identifier.getCppType(expressionConvertible), com.tencent.wcdb.base.CppObject.get(expressionConvertible), null);
        return expression;
    }

    public com.tencent.wcdb.winq.Expression argument(float f17) {
        argument(this.cppObj, 5, 0L, f17, null);
        return this;
    }

    public com.tencent.wcdb.winq.Expression else_(float f17) {
        setWithElseExp(this.cppObj, 5, 0L, f17, null);
        return this;
    }

    public com.tencent.wcdb.winq.Expression then(float f17) {
        setWithThenExp(this.cppObj, 5, 0L, f17, null);
        return this;
    }

    public com.tencent.wcdb.winq.Expression when(float f17) {
        setWithWhenExp(this.cppObj, 5, 0L, f17, null);
        return this;
    }

    public com.tencent.wcdb.winq.Expression argument(double d17) {
        argument(this.cppObj, 5, 0L, d17, null);
        return this;
    }

    public com.tencent.wcdb.winq.Expression else_(double d17) {
        setWithElseExp(this.cppObj, 5, 0L, d17, null);
        return this;
    }

    public com.tencent.wcdb.winq.Expression then(double d17) {
        setWithThenExp(this.cppObj, 5, 0L, d17, null);
        return this;
    }

    public com.tencent.wcdb.winq.Expression when(double d17) {
        setWithWhenExp(this.cppObj, 5, 0L, d17, null);
        return this;
    }

    public Expression(com.tencent.wcdb.winq.StatementSelect statementSelect) {
        this.cppObj = createCppObj(com.tencent.wcdb.winq.Identifier.getCppType((com.tencent.wcdb.winq.Identifier) statementSelect), com.tencent.wcdb.base.CppObject.get((com.tencent.wcdb.base.CppObject) statementSelect));
    }

    public com.tencent.wcdb.winq.Expression argument(java.lang.String str) {
        if (str != null) {
            argument(this.cppObj, 6, 0L, 0.0d, str);
        } else {
            argument(this.cppObj, 1, 0L, 0.0d, null);
        }
        return this;
    }

    public com.tencent.wcdb.winq.Expression else_(java.lang.String str) {
        if (str != null) {
            setWithElseExp(this.cppObj, 6, 0L, 0.0d, str);
        } else {
            setWithElseExp(this.cppObj, 1, 0L, 0.0d, null);
        }
        return this;
    }

    public com.tencent.wcdb.winq.Expression then(java.lang.String str) {
        if (str != null) {
            setWithThenExp(this.cppObj, 6, 0L, 0.0d, str);
        } else {
            setWithThenExp(this.cppObj, 1, 0L, 0.0d, null);
        }
        return this;
    }

    public com.tencent.wcdb.winq.Expression when(java.lang.String str) {
        if (str != null) {
            setWithWhenExp(this.cppObj, 6, 0L, 0.0d, str);
        } else {
            setWithWhenExp(this.cppObj, 1, 0L, 0.0d, null);
        }
        return this;
    }

    public com.tencent.wcdb.winq.Expression argument(com.tencent.wcdb.winq.ExpressionConvertible expressionConvertible) {
        argument(this.cppObj, com.tencent.wcdb.winq.Identifier.getCppType(expressionConvertible), com.tencent.wcdb.base.CppObject.get(expressionConvertible), 0.0d, null);
        return this;
    }

    public com.tencent.wcdb.winq.Expression else_(com.tencent.wcdb.winq.ExpressionConvertible expressionConvertible) {
        setWithElseExp(this.cppObj, com.tencent.wcdb.winq.Identifier.getCppType(expressionConvertible), com.tencent.wcdb.base.CppObject.get(expressionConvertible), 0.0d, null);
        return this;
    }

    public com.tencent.wcdb.winq.Expression then(com.tencent.wcdb.winq.ExpressionConvertible expressionConvertible) {
        setWithThenExp(this.cppObj, com.tencent.wcdb.winq.Identifier.getCppType(expressionConvertible), com.tencent.wcdb.base.CppObject.get(expressionConvertible), 0.0d, null);
        return this;
    }

    public com.tencent.wcdb.winq.Expression when(com.tencent.wcdb.winq.ExpressionConvertible expressionConvertible) {
        setWithWhenExp(this.cppObj, com.tencent.wcdb.winq.Identifier.getCppType(expressionConvertible), com.tencent.wcdb.base.CppObject.get(expressionConvertible), 0.0d, null);
        return this;
    }
}
