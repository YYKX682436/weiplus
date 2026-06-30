package com.tencent.wcdb.winq;

/* loaded from: classes12.dex */
public class WindowDef extends com.tencent.wcdb.winq.Identifier {
    public WindowDef() {
        this.cppObj = createCppObj();
    }

    private static native void configFrameSpec(long j17, long j18);

    private static native void configOrders(long j17, long[] jArr);

    private static native void configPartitions(long j17, int[] iArr, long[] jArr, double[] dArr, java.lang.String[] strArr);

    private static native long createCppObj();

    public com.tencent.wcdb.winq.WindowDef frameSpec(com.tencent.wcdb.winq.FrameSpec frameSpec) {
        configFrameSpec(this.cppObj, com.tencent.wcdb.base.CppObject.get((com.tencent.wcdb.base.CppObject) frameSpec));
        return this;
    }

    @Override // com.tencent.wcdb.winq.Identifier
    public int getType() {
        return 16;
    }

    public com.tencent.wcdb.winq.WindowDef orderBy(com.tencent.wcdb.winq.OrderingTerm... orderingTermArr) {
        if (orderingTermArr != null && orderingTermArr.length != 0) {
            long[] jArr = new long[orderingTermArr.length];
            for (int i17 = 0; i17 < orderingTermArr.length; i17++) {
                jArr[i17] = com.tencent.wcdb.base.CppObject.get((com.tencent.wcdb.base.CppObject) orderingTermArr[i17]);
            }
            configOrders(this.cppObj, jArr);
        }
        return this;
    }

    public com.tencent.wcdb.winq.WindowDef partitionBy(java.lang.String... strArr) {
        if (strArr != null && strArr.length != 0) {
            int[] iArr = new int[strArr.length];
            java.util.Arrays.fill(iArr, 6);
            configPartitions(this.cppObj, iArr, null, null, strArr);
        }
        return this;
    }

    public com.tencent.wcdb.winq.WindowDef partitionBy(com.tencent.wcdb.winq.ExpressionConvertible... expressionConvertibleArr) {
        if (expressionConvertibleArr != null && expressionConvertibleArr.length != 0) {
            int[] iArr = new int[expressionConvertibleArr.length];
            long[] jArr = new long[expressionConvertibleArr.length];
            for (int i17 = 0; i17 < expressionConvertibleArr.length; i17++) {
                iArr[i17] = com.tencent.wcdb.winq.Identifier.getCppType(expressionConvertibleArr[i17]);
                jArr[i17] = com.tencent.wcdb.base.CppObject.get(expressionConvertibleArr[i17]);
            }
            configPartitions(this.cppObj, iArr, jArr, null, null);
        }
        return this;
    }
}
