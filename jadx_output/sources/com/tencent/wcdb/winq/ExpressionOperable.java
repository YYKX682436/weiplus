package com.tencent.wcdb.winq;

/* loaded from: classes12.dex */
public abstract class ExpressionOperable extends com.tencent.wcdb.winq.Identifier implements com.tencent.wcdb.winq.ExpressionConvertible {

    /* renamed from: com.tencent.wcdb.winq.ExpressionOperable$1, reason: invalid class name */
    /* loaded from: classes12.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$tencent$wcdb$winq$ColumnType;

        static {
            int[] iArr = new int[com.tencent.wcdb.winq.ColumnType.values().length];
            $SwitchMap$com$tencent$wcdb$winq$ColumnType = iArr;
            try {
                iArr[com.tencent.wcdb.winq.ColumnType.Integer.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$tencent$wcdb$winq$ColumnType[com.tencent.wcdb.winq.ColumnType.Float.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$tencent$wcdb$winq$ColumnType[com.tencent.wcdb.winq.ColumnType.Text.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
        }
    }

    /* loaded from: classes12.dex */
    public static class BinaryOperatorType {
        static final int And = 18;
        static final int BitwiseAnd = 9;
        static final int BitwiseOr = 10;
        static final int Concatenate = 1;
        static final int Divide = 3;
        static final int Equal = 15;
        static final int GLOB = 21;
        static final int Greater = 13;
        static final int GreaterOrEqual = 14;
        static final int Is = 17;
        static final int LeftShift = 7;
        static final int Less = 11;
        static final int LessOrEqual = 12;
        static final int Like = 20;
        static final int Match = 23;
        static final int Minus = 6;
        static final int Modulo = 4;
        static final int Multiply = 2;
        static final int NotEqual = 16;
        static final int Or = 19;
        static final int Plus = 5;
        static final int RegExp = 22;
        static final int RightShift = 8;

        private BinaryOperatorType() {
        }
    }

    private static native long betweenOperate(int i17, long j17, int i18, long j18, double d17, java.lang.String str, int i19, long j19, double d18, java.lang.String str2, boolean z17);

    private static native long binaryOperate(int i17, long j17, int i18, long j18, double d17, java.lang.String str, int i19, boolean z17);

    private com.tencent.wcdb.winq.Expression binaryOperate(com.tencent.wcdb.winq.ExpressionConvertible expressionConvertible, int i17, boolean z17) {
        return createExpression(binaryOperate(com.tencent.wcdb.winq.Identifier.getCppType((com.tencent.wcdb.winq.Identifier) this), com.tencent.wcdb.base.CppObject.get((com.tencent.wcdb.base.CppObject) this), com.tencent.wcdb.winq.Identifier.getCppType(expressionConvertible), com.tencent.wcdb.base.CppObject.get(expressionConvertible), 0.0d, null, i17, z17));
    }

    private static native long collate(int i17, long j17, java.lang.String str);

    public static com.tencent.wcdb.winq.Expression createExpression(long j17) {
        com.tencent.wcdb.winq.Expression expression = new com.tencent.wcdb.winq.Expression();
        expression.cppObj = j17;
        return expression;
    }

    private static native long in(int i17, long j17, int i18, long[] jArr, double[] dArr, java.lang.String[] strArr, boolean z17);

    private static native long inFunction(int i17, long j17, java.lang.String str, boolean z17);

    private static native long inSelect(int i17, long j17, long j18, boolean z17);

    private static native long inTable(int i17, long j17, java.lang.String str, boolean z17);

    private static native long nullOperate(int i17, long j17, boolean z17);

    private com.tencent.wcdb.winq.Expression nullOperate(boolean z17) {
        com.tencent.wcdb.winq.Expression expression = new com.tencent.wcdb.winq.Expression();
        expression.cppObj = nullOperate(com.tencent.wcdb.winq.Identifier.getCppType((com.tencent.wcdb.winq.Identifier) this), com.tencent.wcdb.base.CppObject.get((com.tencent.wcdb.base.CppObject) this), z17);
        return expression;
    }

    public com.tencent.wcdb.winq.Expression abs() {
        return com.tencent.wcdb.winq.Expression.function("ABS").argument(this);
    }

    public com.tencent.wcdb.winq.Expression add(com.tencent.wcdb.winq.ExpressionConvertible expressionConvertible) {
        return binaryOperate(expressionConvertible, 5, false);
    }

    public com.tencent.wcdb.winq.Expression and(com.tencent.wcdb.winq.ExpressionConvertible expressionConvertible) {
        return binaryOperate(expressionConvertible, 18, false);
    }

    public com.tencent.wcdb.winq.Expression avg() {
        return com.tencent.wcdb.winq.Expression.function("AVG").argument(this);
    }

    public com.tencent.wcdb.winq.Expression between(com.tencent.wcdb.winq.ExpressionConvertible expressionConvertible, com.tencent.wcdb.winq.ExpressionConvertible expressionConvertible2) {
        return createExpression(betweenOperate(com.tencent.wcdb.winq.Identifier.getCppType((com.tencent.wcdb.winq.Identifier) this), com.tencent.wcdb.base.CppObject.get((com.tencent.wcdb.base.CppObject) this), com.tencent.wcdb.winq.Identifier.getCppType(expressionConvertible), com.tencent.wcdb.base.CppObject.get(expressionConvertible), 0.0d, null, com.tencent.wcdb.winq.Identifier.getCppType(expressionConvertible2), com.tencent.wcdb.base.CppObject.get(expressionConvertible2), 0.0d, null, false));
    }

    public com.tencent.wcdb.winq.Expression bitAnd(com.tencent.wcdb.winq.ExpressionConvertible expressionConvertible) {
        return binaryOperate(expressionConvertible, 9, false);
    }

    public com.tencent.wcdb.winq.Expression bitOr(com.tencent.wcdb.winq.ExpressionConvertible expressionConvertible) {
        return binaryOperate(expressionConvertible, 10, false);
    }

    public com.tencent.wcdb.winq.Expression bm25() {
        return com.tencent.wcdb.winq.Expression.function("bm25").argument(this);
    }

    public com.tencent.wcdb.winq.Expression collate(java.lang.String str) {
        return createExpression(collate(com.tencent.wcdb.winq.Identifier.getCppType((com.tencent.wcdb.winq.Identifier) this), com.tencent.wcdb.base.CppObject.get((com.tencent.wcdb.base.CppObject) this), str));
    }

    public com.tencent.wcdb.winq.Expression concat(byte b17) {
        return binaryOperate(b17, 1, false);
    }

    public com.tencent.wcdb.winq.Expression count() {
        return com.tencent.wcdb.winq.Expression.function("COUNT").argument(this);
    }

    public com.tencent.wcdb.winq.Expression divide(com.tencent.wcdb.winq.ExpressionConvertible expressionConvertible) {
        return binaryOperate(expressionConvertible, 3, false);
    }

    public com.tencent.wcdb.winq.Expression eq(com.tencent.wcdb.winq.ExpressionConvertible expressionConvertible) {
        return binaryOperate(expressionConvertible, 15, false);
    }

    public com.tencent.wcdb.winq.Expression ge(com.tencent.wcdb.winq.ExpressionConvertible expressionConvertible) {
        return binaryOperate(expressionConvertible, 14, false);
    }

    public com.tencent.wcdb.winq.Expression glob(java.lang.String str) {
        return binaryOperate(str, 21, false);
    }

    public com.tencent.wcdb.winq.Expression groupConcat() {
        return com.tencent.wcdb.winq.Expression.function("GROUP_CONCAT").argument(this);
    }

    public com.tencent.wcdb.winq.Expression gt(com.tencent.wcdb.winq.ExpressionConvertible expressionConvertible) {
        return binaryOperate(expressionConvertible, 13, false);
    }

    public com.tencent.wcdb.winq.Expression hex() {
        return com.tencent.wcdb.winq.Expression.function("HEX").argument(this);
    }

    public com.tencent.wcdb.winq.Expression highlight() {
        return com.tencent.wcdb.winq.Expression.function("highlight").argument(this);
    }

    public com.tencent.wcdb.winq.Expression in(short... sArr) {
        long[] jArr = new long[sArr.length];
        for (int i17 = 0; i17 < sArr.length; i17++) {
            jArr[i17] = sArr[i17];
        }
        return in(jArr, false);
    }

    public com.tencent.wcdb.winq.Expression inFunction(java.lang.String str) {
        return inFunction(str, false);
    }

    public com.tencent.wcdb.winq.Expression inTable(java.lang.String str) {
        return inTable(str, false);
    }

    public com.tencent.wcdb.winq.Expression is(boolean z17) {
        return binaryOperate(z17, 17, false);
    }

    public com.tencent.wcdb.winq.Expression isNot(boolean z17) {
        return binaryOperate(z17, 17, true);
    }

    public com.tencent.wcdb.winq.Expression isNull() {
        return nullOperate(false);
    }

    public com.tencent.wcdb.winq.Expression le(com.tencent.wcdb.winq.ExpressionConvertible expressionConvertible) {
        return binaryOperate(expressionConvertible, 12, false);
    }

    public com.tencent.wcdb.winq.Expression leftShift(com.tencent.wcdb.winq.ExpressionConvertible expressionConvertible) {
        return binaryOperate(expressionConvertible, 7, false);
    }

    public com.tencent.wcdb.winq.Expression length() {
        return com.tencent.wcdb.winq.Expression.function("LENGTH").argument(this);
    }

    public com.tencent.wcdb.winq.Expression like(java.lang.String str) {
        return binaryOperate(str, 20, false);
    }

    public com.tencent.wcdb.winq.Expression lower() {
        return com.tencent.wcdb.winq.Expression.function("LOWER").argument(this);
    }

    public com.tencent.wcdb.winq.Expression lt(com.tencent.wcdb.winq.ExpressionConvertible expressionConvertible) {
        return binaryOperate(expressionConvertible, 11, false);
    }

    public com.tencent.wcdb.winq.Expression match(java.lang.String str) {
        return binaryOperate(str, 23, false);
    }

    public com.tencent.wcdb.winq.Expression matchInfo() {
        return com.tencent.wcdb.winq.Expression.function("matchInfo").argument(this);
    }

    public com.tencent.wcdb.winq.Expression max() {
        return com.tencent.wcdb.winq.Expression.function("MAX").argument(this);
    }

    public com.tencent.wcdb.winq.Expression min() {
        return com.tencent.wcdb.winq.Expression.function("MIN").argument(this);
    }

    public com.tencent.wcdb.winq.Expression minus(com.tencent.wcdb.winq.ExpressionConvertible expressionConvertible) {
        return binaryOperate(expressionConvertible, 6, false);
    }

    public com.tencent.wcdb.winq.Expression mod(com.tencent.wcdb.winq.ExpressionConvertible expressionConvertible) {
        return binaryOperate(expressionConvertible, 4, false);
    }

    public com.tencent.wcdb.winq.Expression multiply(com.tencent.wcdb.winq.ExpressionConvertible expressionConvertible) {
        return binaryOperate(expressionConvertible, 2, false);
    }

    public com.tencent.wcdb.winq.Expression notBetween(com.tencent.wcdb.winq.ExpressionConvertible expressionConvertible, com.tencent.wcdb.winq.ExpressionConvertible expressionConvertible2) {
        return createExpression(betweenOperate(com.tencent.wcdb.winq.Identifier.getCppType((com.tencent.wcdb.winq.Identifier) this), com.tencent.wcdb.base.CppObject.get((com.tencent.wcdb.base.CppObject) this), com.tencent.wcdb.winq.Identifier.getCppType(expressionConvertible), com.tencent.wcdb.base.CppObject.get(expressionConvertible), 0.0d, null, com.tencent.wcdb.winq.Identifier.getCppType(expressionConvertible2), com.tencent.wcdb.base.CppObject.get(expressionConvertible2), 0.0d, null, true));
    }

    public com.tencent.wcdb.winq.Expression notEq(com.tencent.wcdb.winq.ExpressionConvertible expressionConvertible) {
        return binaryOperate(expressionConvertible, 16, false);
    }

    public com.tencent.wcdb.winq.Expression notGlob(java.lang.String str) {
        return binaryOperate(str, 21, true);
    }

    public com.tencent.wcdb.winq.Expression notIn(short... sArr) {
        long[] jArr = new long[sArr.length];
        for (int i17 = 0; i17 < sArr.length; i17++) {
            jArr[i17] = sArr[i17];
        }
        return in(jArr, true);
    }

    public com.tencent.wcdb.winq.Expression notInFunction(java.lang.String str) {
        return inFunction(str, true);
    }

    public com.tencent.wcdb.winq.Expression notInTable(java.lang.String str) {
        return inTable(str, true);
    }

    public com.tencent.wcdb.winq.Expression notLike(java.lang.String str) {
        return binaryOperate(str, 20, true);
    }

    public com.tencent.wcdb.winq.Expression notMatch(java.lang.String str) {
        return binaryOperate(str, 23, true);
    }

    public com.tencent.wcdb.winq.Expression notNull() {
        return nullOperate(true);
    }

    public com.tencent.wcdb.winq.Expression notRegexp(java.lang.String str) {
        return binaryOperate(str, 22, true);
    }

    public com.tencent.wcdb.winq.Expression offsets() {
        return com.tencent.wcdb.winq.Expression.function("offsets").argument(this);
    }

    public com.tencent.wcdb.winq.Expression or(com.tencent.wcdb.winq.ExpressionConvertible expressionConvertible) {
        return binaryOperate(expressionConvertible, 19, false);
    }

    public com.tencent.wcdb.winq.Expression regexp(java.lang.String str) {
        return binaryOperate(str, 22, false);
    }

    public com.tencent.wcdb.winq.Expression rightShift(com.tencent.wcdb.winq.ExpressionConvertible expressionConvertible) {
        return binaryOperate(expressionConvertible, 8, false);
    }

    public com.tencent.wcdb.winq.Expression round() {
        return com.tencent.wcdb.winq.Expression.function("ROUND").argument(this);
    }

    public com.tencent.wcdb.winq.Expression snippet() {
        return com.tencent.wcdb.winq.Expression.function("snippet").argument(this);
    }

    public com.tencent.wcdb.winq.Expression substr(short s17, short s18) {
        return com.tencent.wcdb.winq.Expression.function("SUBSTR").argument(this).argument(s17).argument(s18);
    }

    public com.tencent.wcdb.winq.Expression substringMatchInfo() {
        return com.tencent.wcdb.winq.Expression.function(com.tencent.wcdb.fts.BuiltinFTSAuxiliaryFunction.SubstringMatchInfo).argument(this);
    }

    public com.tencent.wcdb.winq.Expression sum() {
        return com.tencent.wcdb.winq.Expression.function("SUM").argument(this);
    }

    public com.tencent.wcdb.winq.Expression total() {
        return com.tencent.wcdb.winq.Expression.function("TOTAL").argument(this);
    }

    public com.tencent.wcdb.winq.Expression upper() {
        return com.tencent.wcdb.winq.Expression.function("UPPER").argument(this);
    }

    private com.tencent.wcdb.winq.Expression inFunction(java.lang.String str, boolean z17) {
        return createExpression(inFunction(com.tencent.wcdb.winq.Identifier.getCppType((com.tencent.wcdb.winq.Identifier) this), com.tencent.wcdb.base.CppObject.get((com.tencent.wcdb.base.CppObject) this), str, z17));
    }

    private com.tencent.wcdb.winq.Expression inTable(java.lang.String str, boolean z17) {
        return createExpression(inTable(com.tencent.wcdb.winq.Identifier.getCppType((com.tencent.wcdb.winq.Identifier) this), com.tencent.wcdb.base.CppObject.get((com.tencent.wcdb.base.CppObject) this), str, z17));
    }

    public com.tencent.wcdb.winq.Expression add(byte b17) {
        return binaryOperate(b17, 5, false);
    }

    public com.tencent.wcdb.winq.Expression bitAnd(byte b17) {
        return binaryOperate(b17, 9, false);
    }

    public com.tencent.wcdb.winq.Expression bitOr(byte b17) {
        return binaryOperate(b17, 10, false);
    }

    public com.tencent.wcdb.winq.Expression concat(short s17) {
        return binaryOperate(s17, 1, false);
    }

    public com.tencent.wcdb.winq.Expression divide(byte b17) {
        return binaryOperate(b17, 3, false);
    }

    public com.tencent.wcdb.winq.Expression eq(boolean z17) {
        return binaryOperate(z17, 15, false);
    }

    public com.tencent.wcdb.winq.Expression ge(byte b17) {
        return binaryOperate(b17, 14, false);
    }

    public com.tencent.wcdb.winq.Expression groupConcat(java.lang.String str) {
        return com.tencent.wcdb.winq.Expression.function("GROUP_CONCAT").argument(this).argument(str);
    }

    public com.tencent.wcdb.winq.Expression gt(byte b17) {
        return binaryOperate(b17, 13, false);
    }

    public com.tencent.wcdb.winq.Expression is(byte b17) {
        return binaryOperate(b17, 17, false);
    }

    public com.tencent.wcdb.winq.Expression isNot(byte b17) {
        return binaryOperate(b17, 17, true);
    }

    public com.tencent.wcdb.winq.Expression le(byte b17) {
        return binaryOperate(b17, 12, false);
    }

    public com.tencent.wcdb.winq.Expression leftShift(byte b17) {
        return binaryOperate(b17, 7, false);
    }

    public com.tencent.wcdb.winq.Expression lt(byte b17) {
        return binaryOperate(b17, 11, false);
    }

    public com.tencent.wcdb.winq.Expression minus(byte b17) {
        return binaryOperate(b17, 6, false);
    }

    public com.tencent.wcdb.winq.Expression mod(byte b17) {
        return binaryOperate(b17, 4, false);
    }

    public com.tencent.wcdb.winq.Expression multiply(byte b17) {
        return binaryOperate(b17, 2, false);
    }

    public com.tencent.wcdb.winq.Expression notEq(boolean z17) {
        return binaryOperate(z17, 16, false);
    }

    public com.tencent.wcdb.winq.Expression rightShift(byte b17) {
        return binaryOperate(b17, 8, false);
    }

    public com.tencent.wcdb.winq.Expression add(short s17) {
        return binaryOperate(s17, 5, false);
    }

    public com.tencent.wcdb.winq.Expression bitAnd(short s17) {
        return binaryOperate(s17, 9, false);
    }

    public com.tencent.wcdb.winq.Expression bitOr(short s17) {
        return binaryOperate(s17, 10, false);
    }

    public com.tencent.wcdb.winq.Expression concat(int i17) {
        return binaryOperate(i17, 1, false);
    }

    public com.tencent.wcdb.winq.Expression divide(short s17) {
        return binaryOperate(s17, 3, false);
    }

    public com.tencent.wcdb.winq.Expression eq(byte b17) {
        return binaryOperate(b17, 15, false);
    }

    public com.tencent.wcdb.winq.Expression ge(short s17) {
        return binaryOperate(s17, 14, false);
    }

    public com.tencent.wcdb.winq.Expression gt(short s17) {
        return binaryOperate(s17, 13, false);
    }

    public com.tencent.wcdb.winq.Expression is(short s17) {
        return binaryOperate(s17, 17, false);
    }

    public com.tencent.wcdb.winq.Expression isNot(short s17) {
        return binaryOperate(s17, 17, true);
    }

    public com.tencent.wcdb.winq.Expression le(short s17) {
        return binaryOperate(s17, 12, false);
    }

    public com.tencent.wcdb.winq.Expression leftShift(short s17) {
        return binaryOperate(s17, 7, false);
    }

    public com.tencent.wcdb.winq.Expression lt(short s17) {
        return binaryOperate(s17, 11, false);
    }

    public com.tencent.wcdb.winq.Expression minus(short s17) {
        return binaryOperate(s17, 6, false);
    }

    public com.tencent.wcdb.winq.Expression mod(short s17) {
        return binaryOperate(s17, 4, false);
    }

    public com.tencent.wcdb.winq.Expression multiply(short s17) {
        return binaryOperate(s17, 2, false);
    }

    public com.tencent.wcdb.winq.Expression notEq(byte b17) {
        return binaryOperate(b17, 16, false);
    }

    public com.tencent.wcdb.winq.Expression rightShift(short s17) {
        return binaryOperate(s17, 8, false);
    }

    public com.tencent.wcdb.winq.Expression add(int i17) {
        return binaryOperate(i17, 5, false);
    }

    public com.tencent.wcdb.winq.Expression bitAnd(int i17) {
        return binaryOperate(i17, 9, false);
    }

    public com.tencent.wcdb.winq.Expression bitOr(int i17) {
        return binaryOperate(i17, 10, false);
    }

    public com.tencent.wcdb.winq.Expression concat(long j17) {
        return binaryOperate(j17, 1, false);
    }

    public com.tencent.wcdb.winq.Expression divide(int i17) {
        return binaryOperate(i17, 3, false);
    }

    public com.tencent.wcdb.winq.Expression eq(short s17) {
        return binaryOperate(s17, 15, false);
    }

    public com.tencent.wcdb.winq.Expression ge(int i17) {
        return binaryOperate(i17, 14, false);
    }

    public com.tencent.wcdb.winq.Expression gt(int i17) {
        return binaryOperate(i17, 13, false);
    }

    public com.tencent.wcdb.winq.Expression is(int i17) {
        return binaryOperate(i17, 17, false);
    }

    public com.tencent.wcdb.winq.Expression isNot(int i17) {
        return binaryOperate(i17, 17, true);
    }

    public com.tencent.wcdb.winq.Expression le(int i17) {
        return binaryOperate(i17, 12, false);
    }

    public com.tencent.wcdb.winq.Expression leftShift(int i17) {
        return binaryOperate(i17, 7, false);
    }

    public com.tencent.wcdb.winq.Expression lt(int i17) {
        return binaryOperate(i17, 11, false);
    }

    public com.tencent.wcdb.winq.Expression minus(int i17) {
        return binaryOperate(i17, 6, false);
    }

    public com.tencent.wcdb.winq.Expression mod(int i17) {
        return binaryOperate(i17, 4, false);
    }

    public com.tencent.wcdb.winq.Expression multiply(int i17) {
        return binaryOperate(i17, 2, false);
    }

    public com.tencent.wcdb.winq.Expression notEq(short s17) {
        return binaryOperate(s17, 16, false);
    }

    public com.tencent.wcdb.winq.Expression rightShift(int i17) {
        return binaryOperate(i17, 8, false);
    }

    public com.tencent.wcdb.winq.Expression add(long j17) {
        return binaryOperate(j17, 5, false);
    }

    public com.tencent.wcdb.winq.Expression between(com.tencent.wcdb.winq.ExpressionConvertible expressionConvertible, long j17) {
        return createExpression(betweenOperate(com.tencent.wcdb.winq.Identifier.getCppType((com.tencent.wcdb.winq.Identifier) this), com.tencent.wcdb.base.CppObject.get((com.tencent.wcdb.base.CppObject) this), com.tencent.wcdb.winq.Identifier.getCppType(expressionConvertible), com.tencent.wcdb.base.CppObject.get(expressionConvertible), 0.0d, null, 3, j17, 0.0d, null, false));
    }

    public com.tencent.wcdb.winq.Expression bitAnd(long j17) {
        return binaryOperate(j17, 9, false);
    }

    public com.tencent.wcdb.winq.Expression bitOr(long j17) {
        return binaryOperate(j17, 10, false);
    }

    public com.tencent.wcdb.winq.Expression concat(float f17) {
        return binaryOperate(f17, 1, false);
    }

    public com.tencent.wcdb.winq.Expression divide(long j17) {
        return binaryOperate(j17, 3, false);
    }

    public com.tencent.wcdb.winq.Expression eq(int i17) {
        return binaryOperate(i17, 15, false);
    }

    public com.tencent.wcdb.winq.Expression ge(long j17) {
        return binaryOperate(j17, 14, false);
    }

    public com.tencent.wcdb.winq.Expression gt(long j17) {
        return binaryOperate(j17, 13, false);
    }

    public com.tencent.wcdb.winq.Expression in(java.lang.Short[] shArr) {
        long[] jArr = new long[shArr.length];
        for (int i17 = 0; i17 < shArr.length; i17++) {
            jArr[i17] = shArr[i17].shortValue();
        }
        return in(jArr, false);
    }

    public com.tencent.wcdb.winq.Expression is(long j17) {
        return binaryOperate(j17, 17, false);
    }

    public com.tencent.wcdb.winq.Expression isNot(long j17) {
        return binaryOperate(j17, 17, true);
    }

    public com.tencent.wcdb.winq.Expression le(long j17) {
        return binaryOperate(j17, 12, false);
    }

    public com.tencent.wcdb.winq.Expression leftShift(long j17) {
        return binaryOperate(j17, 7, false);
    }

    public com.tencent.wcdb.winq.Expression lt(long j17) {
        return binaryOperate(j17, 11, false);
    }

    public com.tencent.wcdb.winq.Expression minus(long j17) {
        return binaryOperate(j17, 6, false);
    }

    public com.tencent.wcdb.winq.Expression mod(long j17) {
        return binaryOperate(j17, 4, false);
    }

    public com.tencent.wcdb.winq.Expression multiply(long j17) {
        return binaryOperate(j17, 2, false);
    }

    public com.tencent.wcdb.winq.Expression notBetween(com.tencent.wcdb.winq.ExpressionConvertible expressionConvertible, long j17) {
        return createExpression(betweenOperate(com.tencent.wcdb.winq.Identifier.getCppType((com.tencent.wcdb.winq.Identifier) this), com.tencent.wcdb.base.CppObject.get((com.tencent.wcdb.base.CppObject) this), com.tencent.wcdb.winq.Identifier.getCppType(expressionConvertible), com.tencent.wcdb.base.CppObject.get(expressionConvertible), 0.0d, null, 3, j17, 0.0d, null, true));
    }

    public com.tencent.wcdb.winq.Expression notEq(int i17) {
        return binaryOperate(i17, 16, false);
    }

    public com.tencent.wcdb.winq.Expression notIn(java.lang.Short[] shArr) {
        long[] jArr = new long[shArr.length];
        for (int i17 = 0; i17 < shArr.length; i17++) {
            jArr[i17] = shArr[i17].shortValue();
        }
        return in(jArr, true);
    }

    public com.tencent.wcdb.winq.Expression rightShift(long j17) {
        return binaryOperate(j17, 8, false);
    }

    public com.tencent.wcdb.winq.Expression substr(int i17, int i18) {
        return com.tencent.wcdb.winq.Expression.function("SUBSTR").argument(this).argument(i17).argument(i18);
    }

    private com.tencent.wcdb.winq.Expression binaryOperate(boolean z17, int i17, boolean z18) {
        return createExpression(binaryOperate(com.tencent.wcdb.winq.Identifier.getCppType((com.tencent.wcdb.winq.Identifier) this), com.tencent.wcdb.base.CppObject.get((com.tencent.wcdb.base.CppObject) this), 2, z17 ? 1L : 0L, 0.0d, null, i17, z18));
    }

    public com.tencent.wcdb.winq.Expression add(float f17) {
        return binaryOperate(f17, 5, false);
    }

    public com.tencent.wcdb.winq.Expression concat(double d17) {
        return binaryOperate(d17, 1, false);
    }

    public com.tencent.wcdb.winq.Expression divide(float f17) {
        return binaryOperate(f17, 3, false);
    }

    public com.tencent.wcdb.winq.Expression eq(long j17) {
        return binaryOperate(j17, 15, false);
    }

    public com.tencent.wcdb.winq.Expression ge(float f17) {
        return binaryOperate(f17, 14, false);
    }

    public com.tencent.wcdb.winq.Expression gt(float f17) {
        return binaryOperate(f17, 13, false);
    }

    public com.tencent.wcdb.winq.Expression is(float f17) {
        return binaryOperate(f17, 17, false);
    }

    public com.tencent.wcdb.winq.Expression isNot(float f17) {
        return binaryOperate(f17, 17, true);
    }

    public com.tencent.wcdb.winq.Expression le(float f17) {
        return binaryOperate(f17, 12, false);
    }

    public com.tencent.wcdb.winq.Expression lt(double d17) {
        return binaryOperate(d17, 11, false);
    }

    public com.tencent.wcdb.winq.Expression minus(float f17) {
        return binaryOperate(f17, 6, false);
    }

    public com.tencent.wcdb.winq.Expression mod(float f17) {
        return binaryOperate(f17, 4, false);
    }

    public com.tencent.wcdb.winq.Expression multiply(float f17) {
        return binaryOperate(f17, 2, false);
    }

    public com.tencent.wcdb.winq.Expression notEq(long j17) {
        return binaryOperate(j17, 16, false);
    }

    public com.tencent.wcdb.winq.Expression add(double d17) {
        return binaryOperate(d17, 5, false);
    }

    public com.tencent.wcdb.winq.Expression concat(java.lang.String str) {
        return binaryOperate(str, 1, false);
    }

    public com.tencent.wcdb.winq.Expression divide(double d17) {
        return binaryOperate(d17, 3, false);
    }

    public com.tencent.wcdb.winq.Expression eq(float f17) {
        return binaryOperate(f17, 15, false);
    }

    public com.tencent.wcdb.winq.Expression ge(double d17) {
        return binaryOperate(d17, 14, false);
    }

    public com.tencent.wcdb.winq.Expression gt(double d17) {
        return binaryOperate(d17, 13, false);
    }

    public com.tencent.wcdb.winq.Expression is(double d17) {
        return binaryOperate(d17, 17, false);
    }

    public com.tencent.wcdb.winq.Expression isNot(double d17) {
        return binaryOperate(d17, 17, true);
    }

    public com.tencent.wcdb.winq.Expression le(double d17) {
        return binaryOperate(d17, 12, false);
    }

    public com.tencent.wcdb.winq.Expression lt(java.lang.String str) {
        return binaryOperate(str, 11, false);
    }

    public com.tencent.wcdb.winq.Expression minus(double d17) {
        return binaryOperate(d17, 6, false);
    }

    public com.tencent.wcdb.winq.Expression mod(double d17) {
        return binaryOperate(d17, 4, false);
    }

    public com.tencent.wcdb.winq.Expression multiply(double d17) {
        return binaryOperate(d17, 2, false);
    }

    public com.tencent.wcdb.winq.Expression notEq(float f17) {
        return binaryOperate(f17, 16, false);
    }

    public com.tencent.wcdb.winq.Expression between(com.tencent.wcdb.winq.ExpressionConvertible expressionConvertible, double d17) {
        return createExpression(betweenOperate(com.tencent.wcdb.winq.Identifier.getCppType((com.tencent.wcdb.winq.Identifier) this), com.tencent.wcdb.base.CppObject.get((com.tencent.wcdb.base.CppObject) this), com.tencent.wcdb.winq.Identifier.getCppType(expressionConvertible), com.tencent.wcdb.base.CppObject.get(expressionConvertible), 0.0d, null, 5, 0L, d17, null, false));
    }

    public com.tencent.wcdb.winq.Expression concat(com.tencent.wcdb.winq.ExpressionConvertible expressionConvertible) {
        return binaryOperate(expressionConvertible, 1, false);
    }

    public com.tencent.wcdb.winq.Expression eq(double d17) {
        return binaryOperate(d17, 15, false);
    }

    public com.tencent.wcdb.winq.Expression ge(java.lang.String str) {
        return binaryOperate(str, 14, false);
    }

    public com.tencent.wcdb.winq.Expression gt(java.lang.String str) {
        return binaryOperate(str, 13, false);
    }

    public com.tencent.wcdb.winq.Expression is(java.lang.String str) {
        return binaryOperate(str, 17, false);
    }

    public com.tencent.wcdb.winq.Expression isNot(java.lang.String str) {
        return binaryOperate(str, 17, true);
    }

    public com.tencent.wcdb.winq.Expression le(java.lang.String str) {
        return binaryOperate(str, 12, false);
    }

    public com.tencent.wcdb.winq.Expression notBetween(com.tencent.wcdb.winq.ExpressionConvertible expressionConvertible, double d17) {
        return createExpression(betweenOperate(com.tencent.wcdb.winq.Identifier.getCppType((com.tencent.wcdb.winq.Identifier) this), com.tencent.wcdb.base.CppObject.get((com.tencent.wcdb.base.CppObject) this), com.tencent.wcdb.winq.Identifier.getCppType(expressionConvertible), com.tencent.wcdb.base.CppObject.get(expressionConvertible), 0.0d, null, 5, 0L, d17, null, true));
    }

    public com.tencent.wcdb.winq.Expression notEq(double d17) {
        return binaryOperate(d17, 16, false);
    }

    private com.tencent.wcdb.winq.Expression binaryOperate(long j17, int i17, boolean z17) {
        return createExpression(binaryOperate(com.tencent.wcdb.winq.Identifier.getCppType((com.tencent.wcdb.winq.Identifier) this), com.tencent.wcdb.base.CppObject.get((com.tencent.wcdb.base.CppObject) this), 3, j17, 0.0d, null, i17, z17));
    }

    public com.tencent.wcdb.winq.Expression eq(java.lang.String str) {
        return binaryOperate(str, 15, false);
    }

    public com.tencent.wcdb.winq.Expression in(int... iArr) {
        long[] jArr = new long[iArr.length];
        for (int i17 = 0; i17 < iArr.length; i17++) {
            jArr[i17] = iArr[i17];
        }
        return in(jArr, false);
    }

    public com.tencent.wcdb.winq.Expression is(com.tencent.wcdb.winq.ExpressionConvertible expressionConvertible) {
        return binaryOperate(expressionConvertible, 17, false);
    }

    public com.tencent.wcdb.winq.Expression isNot(com.tencent.wcdb.winq.ExpressionConvertible expressionConvertible) {
        return binaryOperate(expressionConvertible, 17, true);
    }

    public com.tencent.wcdb.winq.Expression notEq(java.lang.String str) {
        return binaryOperate(str, 16, false);
    }

    public com.tencent.wcdb.winq.Expression notIn(int... iArr) {
        long[] jArr = new long[iArr.length];
        for (int i17 = 0; i17 < iArr.length; i17++) {
            jArr[i17] = iArr[i17];
        }
        return in(jArr, true);
    }

    public com.tencent.wcdb.winq.Expression substr(long j17, long j18) {
        return com.tencent.wcdb.winq.Expression.function("SUBSTR").argument(this).argument(j17).argument(j18);
    }

    public com.tencent.wcdb.winq.Expression between(com.tencent.wcdb.winq.ExpressionConvertible expressionConvertible, java.lang.String str) {
        return createExpression(betweenOperate(com.tencent.wcdb.winq.Identifier.getCppType((com.tencent.wcdb.winq.Identifier) this), com.tencent.wcdb.base.CppObject.get((com.tencent.wcdb.base.CppObject) this), com.tencent.wcdb.winq.Identifier.getCppType(expressionConvertible), com.tencent.wcdb.base.CppObject.get(expressionConvertible), 0.0d, null, 6, 0L, 0.0d, str, false));
    }

    public com.tencent.wcdb.winq.Expression notBetween(com.tencent.wcdb.winq.ExpressionConvertible expressionConvertible, java.lang.String str) {
        return createExpression(betweenOperate(com.tencent.wcdb.winq.Identifier.getCppType((com.tencent.wcdb.winq.Identifier) this), com.tencent.wcdb.base.CppObject.get((com.tencent.wcdb.base.CppObject) this), com.tencent.wcdb.winq.Identifier.getCppType(expressionConvertible), com.tencent.wcdb.base.CppObject.get(expressionConvertible), 0.0d, null, 6, 0L, 0.0d, str, true));
    }

    private com.tencent.wcdb.winq.Expression binaryOperate(double d17, int i17, boolean z17) {
        return createExpression(binaryOperate(com.tencent.wcdb.winq.Identifier.getCppType((com.tencent.wcdb.winq.Identifier) this), com.tencent.wcdb.base.CppObject.get((com.tencent.wcdb.base.CppObject) this), 5, 0L, d17, null, i17, z17));
    }

    public com.tencent.wcdb.winq.Expression in(java.lang.Integer[] numArr) {
        long[] jArr = new long[numArr.length];
        for (int i17 = 0; i17 < numArr.length; i17++) {
            jArr[i17] = numArr[i17].intValue();
        }
        return in(jArr, false);
    }

    public com.tencent.wcdb.winq.Expression notIn(java.lang.Integer[] numArr) {
        long[] jArr = new long[numArr.length];
        for (int i17 = 0; i17 < numArr.length; i17++) {
            jArr[i17] = numArr[i17].intValue();
        }
        return in(jArr, true);
    }

    public com.tencent.wcdb.winq.Expression between(long j17, com.tencent.wcdb.winq.ExpressionConvertible expressionConvertible) {
        return createExpression(betweenOperate(com.tencent.wcdb.winq.Identifier.getCppType((com.tencent.wcdb.winq.Identifier) this), com.tencent.wcdb.base.CppObject.get((com.tencent.wcdb.base.CppObject) this), 3, j17, 0.0d, null, com.tencent.wcdb.winq.Identifier.getCppType(expressionConvertible), com.tencent.wcdb.base.CppObject.get(expressionConvertible), 0.0d, null, false));
    }

    public com.tencent.wcdb.winq.Expression notBetween(long j17, com.tencent.wcdb.winq.ExpressionConvertible expressionConvertible) {
        return createExpression(betweenOperate(com.tencent.wcdb.winq.Identifier.getCppType((com.tencent.wcdb.winq.Identifier) this), com.tencent.wcdb.base.CppObject.get((com.tencent.wcdb.base.CppObject) this), 3, j17, 0.0d, null, com.tencent.wcdb.winq.Identifier.getCppType(expressionConvertible), com.tencent.wcdb.base.CppObject.get(expressionConvertible), 0.0d, null, true));
    }

    private com.tencent.wcdb.winq.Expression binaryOperate(java.lang.String str, int i17, boolean z17) {
        return createExpression(binaryOperate(com.tencent.wcdb.winq.Identifier.getCppType((com.tencent.wcdb.winq.Identifier) this), com.tencent.wcdb.base.CppObject.get((com.tencent.wcdb.base.CppObject) this), 6, 0L, 0.0d, str, i17, z17));
    }

    public com.tencent.wcdb.winq.Expression between(long j17, long j18) {
        return createExpression(betweenOperate(com.tencent.wcdb.winq.Identifier.getCppType((com.tencent.wcdb.winq.Identifier) this), com.tencent.wcdb.base.CppObject.get((com.tencent.wcdb.base.CppObject) this), 3, j17, 0.0d, null, 3, j18, 0.0d, null, false));
    }

    public com.tencent.wcdb.winq.Expression in(long... jArr) {
        return in(jArr, false);
    }

    public com.tencent.wcdb.winq.Expression notBetween(long j17, long j18) {
        return createExpression(betweenOperate(com.tencent.wcdb.winq.Identifier.getCppType((com.tencent.wcdb.winq.Identifier) this), com.tencent.wcdb.base.CppObject.get((com.tencent.wcdb.base.CppObject) this), 3, j17, 0.0d, null, 3, j18, 0.0d, null, true));
    }

    public com.tencent.wcdb.winq.Expression notIn(long... jArr) {
        return in(jArr, true);
    }

    public com.tencent.wcdb.winq.Expression between(long j17, double d17) {
        return createExpression(betweenOperate(com.tencent.wcdb.winq.Identifier.getCppType((com.tencent.wcdb.winq.Identifier) this), com.tencent.wcdb.base.CppObject.get((com.tencent.wcdb.base.CppObject) this), 3, j17, 0.0d, null, 5, 0L, d17, null, false));
    }

    public com.tencent.wcdb.winq.Expression in(java.lang.Long[] lArr) {
        return in((java.lang.Object[]) lArr, false);
    }

    public com.tencent.wcdb.winq.Expression notBetween(long j17, double d17) {
        return createExpression(betweenOperate(com.tencent.wcdb.winq.Identifier.getCppType((com.tencent.wcdb.winq.Identifier) this), com.tencent.wcdb.base.CppObject.get((com.tencent.wcdb.base.CppObject) this), 3, j17, 0.0d, null, 5, 0L, d17, null, true));
    }

    public com.tencent.wcdb.winq.Expression notIn(java.lang.Long[] lArr) {
        return in((java.lang.Object[]) lArr, true);
    }

    public com.tencent.wcdb.winq.Expression between(long j17, java.lang.String str) {
        return createExpression(betweenOperate(com.tencent.wcdb.winq.Identifier.getCppType((com.tencent.wcdb.winq.Identifier) this), com.tencent.wcdb.base.CppObject.get((com.tencent.wcdb.base.CppObject) this), 3, j17, 0.0d, null, 6, 0L, 0.0d, str, false));
    }

    public com.tencent.wcdb.winq.Expression in(float... fArr) {
        double[] dArr = new double[fArr.length];
        for (int i17 = 0; i17 < fArr.length; i17++) {
            dArr[i17] = fArr[i17];
        }
        return in(dArr, false);
    }

    public com.tencent.wcdb.winq.Expression notBetween(long j17, java.lang.String str) {
        return createExpression(betweenOperate(com.tencent.wcdb.winq.Identifier.getCppType((com.tencent.wcdb.winq.Identifier) this), com.tencent.wcdb.base.CppObject.get((com.tencent.wcdb.base.CppObject) this), 3, j17, 0.0d, null, 6, 0L, 0.0d, str, true));
    }

    public com.tencent.wcdb.winq.Expression notIn(float... fArr) {
        double[] dArr = new double[fArr.length];
        for (int i17 = 0; i17 < fArr.length; i17++) {
            dArr[i17] = fArr[i17];
        }
        return in(dArr, true);
    }

    public com.tencent.wcdb.winq.Expression between(double d17, com.tencent.wcdb.winq.ExpressionConvertible expressionConvertible) {
        return createExpression(betweenOperate(com.tencent.wcdb.winq.Identifier.getCppType((com.tencent.wcdb.winq.Identifier) this), com.tencent.wcdb.base.CppObject.get((com.tencent.wcdb.base.CppObject) this), 5, 0L, d17, null, com.tencent.wcdb.winq.Identifier.getCppType(expressionConvertible), com.tencent.wcdb.base.CppObject.get(expressionConvertible), 0.0d, null, false));
    }

    public com.tencent.wcdb.winq.Expression notBetween(double d17, com.tencent.wcdb.winq.ExpressionConvertible expressionConvertible) {
        return createExpression(betweenOperate(com.tencent.wcdb.winq.Identifier.getCppType((com.tencent.wcdb.winq.Identifier) this), com.tencent.wcdb.base.CppObject.get((com.tencent.wcdb.base.CppObject) this), 5, 0L, d17, null, com.tencent.wcdb.winq.Identifier.getCppType(expressionConvertible), com.tencent.wcdb.base.CppObject.get(expressionConvertible), 0.0d, null, true));
    }

    public com.tencent.wcdb.winq.Expression between(double d17, long j17) {
        return createExpression(betweenOperate(com.tencent.wcdb.winq.Identifier.getCppType((com.tencent.wcdb.winq.Identifier) this), com.tencent.wcdb.base.CppObject.get((com.tencent.wcdb.base.CppObject) this), 5, 0L, d17, null, 3, j17, 0.0d, null, false));
    }

    public com.tencent.wcdb.winq.Expression in(java.lang.Float[] fArr) {
        double[] dArr = new double[fArr.length];
        for (int i17 = 0; i17 < fArr.length; i17++) {
            dArr[i17] = fArr[i17].floatValue();
        }
        return in(dArr, false);
    }

    public com.tencent.wcdb.winq.Expression notBetween(double d17, long j17) {
        return createExpression(betweenOperate(com.tencent.wcdb.winq.Identifier.getCppType((com.tencent.wcdb.winq.Identifier) this), com.tencent.wcdb.base.CppObject.get((com.tencent.wcdb.base.CppObject) this), 5, 0L, d17, null, 3, j17, 0.0d, null, true));
    }

    public com.tencent.wcdb.winq.Expression notIn(java.lang.Float[] fArr) {
        double[] dArr = new double[fArr.length];
        for (int i17 = 0; i17 < fArr.length; i17++) {
            dArr[i17] = fArr[i17].floatValue();
        }
        return in(dArr, true);
    }

    public com.tencent.wcdb.winq.Expression between(double d17, double d18) {
        return createExpression(betweenOperate(com.tencent.wcdb.winq.Identifier.getCppType((com.tencent.wcdb.winq.Identifier) this), com.tencent.wcdb.base.CppObject.get((com.tencent.wcdb.base.CppObject) this), 5, 0L, d17, null, 5, 0L, d18, null, false));
    }

    public com.tencent.wcdb.winq.Expression notBetween(double d17, double d18) {
        return createExpression(betweenOperate(com.tencent.wcdb.winq.Identifier.getCppType((com.tencent.wcdb.winq.Identifier) this), com.tencent.wcdb.base.CppObject.get((com.tencent.wcdb.base.CppObject) this), 5, 0L, d17, null, 5, 0L, d18, null, true));
    }

    public com.tencent.wcdb.winq.Expression between(double d17, java.lang.String str) {
        return createExpression(betweenOperate(com.tencent.wcdb.winq.Identifier.getCppType((com.tencent.wcdb.winq.Identifier) this), com.tencent.wcdb.base.CppObject.get((com.tencent.wcdb.base.CppObject) this), 5, 0L, d17, null, 6, 0L, 0.0d, str, false));
    }

    public com.tencent.wcdb.winq.Expression notBetween(double d17, java.lang.String str) {
        return createExpression(betweenOperate(com.tencent.wcdb.winq.Identifier.getCppType((com.tencent.wcdb.winq.Identifier) this), com.tencent.wcdb.base.CppObject.get((com.tencent.wcdb.base.CppObject) this), 5, 0L, d17, null, 6, 0L, 0.0d, str, true));
    }

    public com.tencent.wcdb.winq.Expression between(java.lang.String str, com.tencent.wcdb.winq.ExpressionConvertible expressionConvertible) {
        return createExpression(betweenOperate(com.tencent.wcdb.winq.Identifier.getCppType((com.tencent.wcdb.winq.Identifier) this), com.tencent.wcdb.base.CppObject.get((com.tencent.wcdb.base.CppObject) this), 6, 0L, 0.0d, str, com.tencent.wcdb.winq.Identifier.getCppType(expressionConvertible), com.tencent.wcdb.base.CppObject.get(expressionConvertible), 0.0d, null, false));
    }

    public com.tencent.wcdb.winq.Expression notBetween(java.lang.String str, com.tencent.wcdb.winq.ExpressionConvertible expressionConvertible) {
        return createExpression(betweenOperate(com.tencent.wcdb.winq.Identifier.getCppType((com.tencent.wcdb.winq.Identifier) this), com.tencent.wcdb.base.CppObject.get((com.tencent.wcdb.base.CppObject) this), 6, 0L, 0.0d, str, com.tencent.wcdb.winq.Identifier.getCppType(expressionConvertible), com.tencent.wcdb.base.CppObject.get(expressionConvertible), 0.0d, null, true));
    }

    public com.tencent.wcdb.winq.Expression in(double... dArr) {
        return in(dArr, false);
    }

    public com.tencent.wcdb.winq.Expression notIn(double... dArr) {
        return in(dArr, true);
    }

    public com.tencent.wcdb.winq.Expression in(java.lang.Double[] dArr) {
        return in((java.lang.Object[]) dArr, false);
    }

    public com.tencent.wcdb.winq.Expression notIn(java.lang.Double[] dArr) {
        return in((java.lang.Object[]) dArr, true);
    }

    public com.tencent.wcdb.winq.Expression between(java.lang.String str, long j17) {
        return createExpression(betweenOperate(com.tencent.wcdb.winq.Identifier.getCppType((com.tencent.wcdb.winq.Identifier) this), com.tencent.wcdb.base.CppObject.get((com.tencent.wcdb.base.CppObject) this), 6, 0L, 0.0d, str, 3, j17, 0.0d, null, false));
    }

    public com.tencent.wcdb.winq.Expression in(java.lang.String... strArr) {
        return in(strArr, false);
    }

    public com.tencent.wcdb.winq.Expression notBetween(java.lang.String str, long j17) {
        return createExpression(betweenOperate(com.tencent.wcdb.winq.Identifier.getCppType((com.tencent.wcdb.winq.Identifier) this), com.tencent.wcdb.base.CppObject.get((com.tencent.wcdb.base.CppObject) this), 6, 0L, 0.0d, str, 3, j17, 0.0d, null, true));
    }

    public com.tencent.wcdb.winq.Expression notIn(java.lang.String... strArr) {
        return in(strArr, true);
    }

    public com.tencent.wcdb.winq.Expression between(java.lang.String str, double d17) {
        return createExpression(betweenOperate(com.tencent.wcdb.winq.Identifier.getCppType((com.tencent.wcdb.winq.Identifier) this), com.tencent.wcdb.base.CppObject.get((com.tencent.wcdb.base.CppObject) this), 6, 0L, 0.0d, str, 5, 0L, d17, null, false));
    }

    public com.tencent.wcdb.winq.Expression in(com.tencent.wcdb.base.Value... valueArr) {
        return in((java.lang.Object[]) valueArr, false);
    }

    public com.tencent.wcdb.winq.Expression notBetween(java.lang.String str, double d17) {
        return createExpression(betweenOperate(com.tencent.wcdb.winq.Identifier.getCppType((com.tencent.wcdb.winq.Identifier) this), com.tencent.wcdb.base.CppObject.get((com.tencent.wcdb.base.CppObject) this), 6, 0L, 0.0d, str, 5, 0L, d17, null, true));
    }

    public com.tencent.wcdb.winq.Expression notIn(com.tencent.wcdb.base.Value... valueArr) {
        return in((java.lang.Object[]) valueArr, true);
    }

    public com.tencent.wcdb.winq.Expression between(java.lang.String str, java.lang.String str2) {
        return createExpression(betweenOperate(com.tencent.wcdb.winq.Identifier.getCppType((com.tencent.wcdb.winq.Identifier) this), com.tencent.wcdb.base.CppObject.get((com.tencent.wcdb.base.CppObject) this), 6, 0L, 0.0d, str, 6, 0L, 0.0d, str2, false));
    }

    public <T> com.tencent.wcdb.winq.Expression in(java.util.Set<T> set) {
        return in(set.toArray(), false);
    }

    public com.tencent.wcdb.winq.Expression notBetween(java.lang.String str, java.lang.String str2) {
        return createExpression(betweenOperate(com.tencent.wcdb.winq.Identifier.getCppType((com.tencent.wcdb.winq.Identifier) this), com.tencent.wcdb.base.CppObject.get((com.tencent.wcdb.base.CppObject) this), 6, 0L, 0.0d, str, 6, 0L, 0.0d, str2, true));
    }

    public <T> com.tencent.wcdb.winq.Expression notIn(java.util.Set<T> set) {
        return in(set.toArray(), true);
    }

    public <T> com.tencent.wcdb.winq.Expression in(java.util.List<T> list) {
        return in(list.toArray(), false);
    }

    public <T> com.tencent.wcdb.winq.Expression notIn(java.util.List<T> list) {
        return in(list.toArray(), true);
    }

    public com.tencent.wcdb.winq.Expression in(com.tencent.wcdb.winq.StatementSelect statementSelect) {
        return in(statementSelect, false);
    }

    public com.tencent.wcdb.winq.Expression notIn(com.tencent.wcdb.winq.StatementSelect statementSelect) {
        return in(statementSelect, true);
    }

    private com.tencent.wcdb.winq.Expression in(long[] jArr, boolean z17) {
        return createExpression(in(com.tencent.wcdb.winq.Identifier.getCppType((com.tencent.wcdb.winq.Identifier) this), com.tencent.wcdb.base.CppObject.get((com.tencent.wcdb.base.CppObject) this), 3, jArr, null, null, z17));
    }

    private com.tencent.wcdb.winq.Expression in(int i17, long[] jArr, boolean z17) {
        return createExpression(in(com.tencent.wcdb.winq.Identifier.getCppType((com.tencent.wcdb.winq.Identifier) this), com.tencent.wcdb.base.CppObject.get((com.tencent.wcdb.base.CppObject) this), i17, jArr, null, null, z17));
    }

    private com.tencent.wcdb.winq.Expression in(double[] dArr, boolean z17) {
        return createExpression(in(com.tencent.wcdb.winq.Identifier.getCppType((com.tencent.wcdb.winq.Identifier) this), com.tencent.wcdb.base.CppObject.get((com.tencent.wcdb.base.CppObject) this), 5, null, dArr, null, z17));
    }

    private com.tencent.wcdb.winq.Expression in(java.lang.String[] strArr, boolean z17) {
        return createExpression(in(com.tencent.wcdb.winq.Identifier.getCppType((com.tencent.wcdb.winq.Identifier) this), com.tencent.wcdb.base.CppObject.get((com.tencent.wcdb.base.CppObject) this), 6, null, null, strArr, z17));
    }

    private com.tencent.wcdb.winq.Expression in(java.lang.Object[] objArr, boolean z17) {
        if (objArr != null && objArr.length != 0) {
            int i17 = 0;
            int objectType = com.tencent.wcdb.winq.MultiTypeArray.getObjectType(objArr[0]);
            if (objectType == 10) {
                long[] jArr = new long[objArr.length];
                for (int i18 = 0; i18 < objArr.length; i18++) {
                    jArr[i18] = com.tencent.wcdb.base.CppObject.get((com.tencent.wcdb.base.CppObject) objArr[i18]);
                }
                return in(com.tencent.wcdb.winq.Identifier.getCppType((com.tencent.wcdb.winq.Identifier) objArr[0]), jArr, z17);
            }
            if (objectType == 11) {
                int i19 = com.tencent.wcdb.winq.ExpressionOperable.AnonymousClass1.$SwitchMap$com$tencent$wcdb$winq$ColumnType[((com.tencent.wcdb.base.Value) objArr[0]).getType().ordinal()];
                if (i19 == 1) {
                    long[] jArr2 = new long[objArr.length];
                    while (i17 < objArr.length) {
                        jArr2[i17] = ((com.tencent.wcdb.base.Value) objArr[i17]).getLong();
                        i17++;
                    }
                    return in(jArr2, z17);
                }
                if (i19 == 2) {
                    double[] dArr = new double[objArr.length];
                    while (i17 < objArr.length) {
                        dArr[i17] = ((com.tencent.wcdb.base.Value) objArr[i17]).getDouble();
                        i17++;
                    }
                    return in(dArr, z17);
                }
                if (i19 != 3) {
                    if (objArr instanceof java.lang.String[]) {
                        return in((java.lang.String[]) objArr, z17);
                    }
                    int length = objArr.length;
                    java.lang.String[] strArr = new java.lang.String[length];
                    while (i17 < length) {
                        strArr[i17] = (java.lang.String) objArr[i17];
                        i17++;
                    }
                    return in(strArr, z17);
                }
                java.lang.String[] strArr2 = new java.lang.String[objArr.length];
                while (i17 < objArr.length) {
                    strArr2[i17] = ((com.tencent.wcdb.base.Value) objArr[i17]).getText();
                    i17++;
                }
                return in(strArr2, z17);
            }
            if (objectType == 9) {
                if (objArr instanceof java.lang.String[]) {
                    return in((java.lang.String[]) objArr, z17);
                }
                int length2 = objArr.length;
                java.lang.String[] strArr3 = new java.lang.String[length2];
                while (i17 < length2) {
                    strArr3[i17] = (java.lang.String) objArr[i17];
                    i17++;
                }
                return in(strArr3, z17);
            }
            if (objectType >= 7) {
                if (objectType != 12) {
                    double[] dArr2 = new double[objArr.length];
                    while (i17 < objArr.length) {
                        if (objectType == 7) {
                            dArr2[i17] = ((java.lang.Float) objArr[i17]).floatValue();
                        } else {
                            dArr2[i17] = ((java.lang.Double) objArr[i17]).doubleValue();
                        }
                        i17++;
                    }
                    return in(dArr2, z17);
                }
                return in((long[]) null);
            }
            long[] jArr3 = new long[objArr.length];
            while (i17 < objArr.length) {
                if (objectType == 0) {
                    jArr3[i17] = 0;
                } else if (objectType == 1) {
                    jArr3[i17] = ((java.lang.Boolean) objArr[i17]).booleanValue() ? 1L : 0L;
                } else if (objectType == 2) {
                    jArr3[i17] = ((java.lang.Character) objArr[i17]).charValue();
                } else if (objectType == 4) {
                    jArr3[i17] = ((java.lang.Short) objArr[i17]).shortValue();
                } else if (objectType == 5) {
                    jArr3[i17] = ((java.lang.Integer) objArr[i17]).intValue();
                } else if (objectType == 6) {
                    jArr3[i17] = ((java.lang.Long) objArr[i17]).longValue();
                }
                i17++;
            }
            return in(jArr3, z17);
        }
        return in((long[]) null, z17);
    }

    private com.tencent.wcdb.winq.Expression in(com.tencent.wcdb.winq.StatementSelect statementSelect, boolean z17) {
        return createExpression(inSelect(com.tencent.wcdb.winq.Identifier.getCppType((com.tencent.wcdb.winq.Identifier) this), com.tencent.wcdb.base.CppObject.get((com.tencent.wcdb.base.CppObject) this), com.tencent.wcdb.base.CppObject.get((com.tencent.wcdb.base.CppObject) statementSelect), z17));
    }
}
