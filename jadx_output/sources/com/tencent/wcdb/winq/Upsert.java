package com.tencent.wcdb.winq;

/* loaded from: classes12.dex */
public class Upsert extends com.tencent.wcdb.winq.Identifier {
    public Upsert() {
        this.cppObj = createCppObj();
    }

    private static native void configDoNothing(long j17);

    private static native void configDoUpdate(long j17);

    private static native void configIndexedColumn(long j17, int i17, long[] jArr, java.lang.String[] strArr);

    private static native void configSetColumns(long j17, int i17, long[] jArr, java.lang.String[] strArr);

    private static native void configToValue(long j17, int i17, long j18, double d17, java.lang.String str);

    private static native void configWhere(long j17, long j18);

    private static native long createCppObj();

    public com.tencent.wcdb.winq.Upsert doNoThing() {
        configDoNothing(this.cppObj);
        return this;
    }

    public com.tencent.wcdb.winq.Upsert doUpdate() {
        configDoUpdate(this.cppObj);
        return this;
    }

    @Override // com.tencent.wcdb.winq.Identifier
    public int getType() {
        return 23;
    }

    public com.tencent.wcdb.winq.Upsert indexedBy(java.lang.String... strArr) {
        configIndexedColumn(this.cppObj, 6, null, strArr);
        return this;
    }

    public com.tencent.wcdb.winq.Upsert onConflict() {
        return this;
    }

    public com.tencent.wcdb.winq.Upsert set(java.lang.String... strArr) {
        configSetColumns(this.cppObj, 6, null, strArr);
        return this;
    }

    public com.tencent.wcdb.winq.Upsert to(boolean z17) {
        configToValue(this.cppObj, 2, z17 ? 1L : 0L, 0.0d, null);
        return this;
    }

    public com.tencent.wcdb.winq.Upsert where(com.tencent.wcdb.winq.Expression expression) {
        configWhere(this.cppObj, com.tencent.wcdb.base.CppObject.get((com.tencent.wcdb.base.CppObject) expression));
        return this;
    }

    public com.tencent.wcdb.winq.Upsert indexedBy(com.tencent.wcdb.winq.IndexedColumnConvertible... indexedColumnConvertibleArr) {
        if (indexedColumnConvertibleArr.length == 0) {
            return this;
        }
        long[] jArr = new long[indexedColumnConvertibleArr.length];
        for (int i17 = 0; i17 < indexedColumnConvertibleArr.length; i17++) {
            jArr[i17] = com.tencent.wcdb.base.CppObject.get(indexedColumnConvertibleArr[i17]);
        }
        configIndexedColumn(this.cppObj, com.tencent.wcdb.winq.Identifier.getCppType(indexedColumnConvertibleArr[0]), jArr, null);
        return this;
    }

    public com.tencent.wcdb.winq.Upsert set(com.tencent.wcdb.winq.Column... columnArr) {
        if (columnArr.length == 0) {
            return this;
        }
        long[] jArr = new long[columnArr.length];
        for (int i17 = 0; i17 < columnArr.length; i17++) {
            jArr[i17] = com.tencent.wcdb.base.CppObject.get((com.tencent.wcdb.base.CppObject) columnArr[i17]);
        }
        configSetColumns(this.cppObj, com.tencent.wcdb.winq.Identifier.getCppType((com.tencent.wcdb.winq.Identifier) columnArr[0]), jArr, null);
        return this;
    }

    public com.tencent.wcdb.winq.Upsert to(byte b17) {
        configToValue(this.cppObj, 3, b17, 0.0d, null);
        return this;
    }

    public com.tencent.wcdb.winq.Upsert to(short s17) {
        configToValue(this.cppObj, 3, s17, 0.0d, null);
        return this;
    }

    public com.tencent.wcdb.winq.Upsert to(int i17) {
        configToValue(this.cppObj, 3, i17, 0.0d, null);
        return this;
    }

    public com.tencent.wcdb.winq.Upsert to(long j17) {
        configToValue(this.cppObj, 3, j17, 0.0d, null);
        return this;
    }

    public com.tencent.wcdb.winq.Upsert to(float f17) {
        configToValue(this.cppObj, 5, 0L, f17, null);
        return this;
    }

    public com.tencent.wcdb.winq.Upsert to(double d17) {
        configToValue(this.cppObj, 5, 0L, d17, null);
        return this;
    }

    public com.tencent.wcdb.winq.Upsert to(java.lang.String str) {
        if (str != null) {
            configToValue(this.cppObj, 6, 0L, 0.0d, str);
        } else {
            configToValue(this.cppObj, 1, 0L, 0.0d, null);
        }
        return this;
    }

    public com.tencent.wcdb.winq.Upsert to(com.tencent.wcdb.winq.ExpressionConvertible expressionConvertible) {
        configToValue(this.cppObj, com.tencent.wcdb.winq.Identifier.getCppType(expressionConvertible), com.tencent.wcdb.base.CppObject.get(expressionConvertible), 0.0d, null);
        return this;
    }
}
