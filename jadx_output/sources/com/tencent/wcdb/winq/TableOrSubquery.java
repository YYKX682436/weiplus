package com.tencent.wcdb.winq;

/* loaded from: classes12.dex */
public class TableOrSubquery extends com.tencent.wcdb.winq.Identifier implements com.tencent.wcdb.winq.TableOrSubqueryConvertible {
    private TableOrSubquery() {
    }

    private static native void argument(long j17, int i17, long j18, double d17, java.lang.String str);

    private static native void as(long j17, java.lang.String str);

    private static native long createCppObj(int i17, long j17, java.lang.String str);

    private static native long createCppObj(int i17, long[] jArr, java.lang.String[] strArr);

    public static native long createWithFunction(java.lang.String str);

    public static com.tencent.wcdb.winq.TableOrSubquery function(java.lang.String str) {
        com.tencent.wcdb.winq.TableOrSubquery tableOrSubquery = new com.tencent.wcdb.winq.TableOrSubquery();
        tableOrSubquery.cppObj = createWithFunction(str);
        return tableOrSubquery;
    }

    private static native void indexedBy(long j17, java.lang.String str);

    private static native void notIndexed(long j17);

    private static native void schema(long j17, int i17, long j18, java.lang.String str);

    public com.tencent.wcdb.winq.TableOrSubquery argument(boolean z17) {
        argument(this.cppObj, 2, z17 ? 1L : 0L, 0.0d, null);
        return this;
    }

    public com.tencent.wcdb.winq.TableOrSubquery as(java.lang.String str) {
        as(this.cppObj, str);
        return this;
    }

    @Override // com.tencent.wcdb.winq.Identifier
    public int getType() {
        return 26;
    }

    public com.tencent.wcdb.winq.TableOrSubquery indexedBy(java.lang.String str) {
        indexedBy(this.cppObj, str);
        return this;
    }

    public com.tencent.wcdb.winq.TableOrSubquery notIndexd() {
        notIndexed(this.cppObj);
        return this;
    }

    public com.tencent.wcdb.winq.TableOrSubquery schema(java.lang.String str) {
        schema(this.cppObj, 6, 0L, str);
        return this;
    }

    public TableOrSubquery(com.tencent.wcdb.winq.TableOrSubqueryConvertible tableOrSubqueryConvertible) {
        this.cppObj = createCppObj(com.tencent.wcdb.winq.Identifier.getCppType(tableOrSubqueryConvertible), com.tencent.wcdb.base.CppObject.get(tableOrSubqueryConvertible), (java.lang.String) null);
    }

    public com.tencent.wcdb.winq.TableOrSubquery argument(byte b17) {
        argument(this.cppObj, 3, b17, 0.0d, null);
        return this;
    }

    public com.tencent.wcdb.winq.TableOrSubquery schema(com.tencent.wcdb.winq.Schema schema) {
        schema(this.cppObj, com.tencent.wcdb.winq.Identifier.getCppType((com.tencent.wcdb.winq.Identifier) schema), com.tencent.wcdb.base.CppObject.get((com.tencent.wcdb.base.CppObject) schema), null);
        return this;
    }

    public com.tencent.wcdb.winq.TableOrSubquery argument(short s17) {
        argument(this.cppObj, 3, s17, 0.0d, null);
        return this;
    }

    public TableOrSubquery(java.lang.String str) {
        this.cppObj = createCppObj(6, 0L, str);
    }

    public com.tencent.wcdb.winq.TableOrSubquery argument(int i17) {
        argument(this.cppObj, 3, i17, 0.0d, null);
        return this;
    }

    public com.tencent.wcdb.winq.TableOrSubquery argument(long j17) {
        argument(this.cppObj, 3, j17, 0.0d, null);
        return this;
    }

    public TableOrSubquery(com.tencent.wcdb.winq.TableOrSubqueryConvertible... tableOrSubqueryConvertibleArr) {
        if (tableOrSubqueryConvertibleArr.length == 0) {
            this.cppObj = createCppObj(6, new long[0], (java.lang.String[]) null);
            return;
        }
        long[] jArr = new long[tableOrSubqueryConvertibleArr.length];
        for (int i17 = 0; i17 < tableOrSubqueryConvertibleArr.length; i17++) {
            jArr[i17] = com.tencent.wcdb.base.CppObject.get(tableOrSubqueryConvertibleArr[i17]);
        }
        this.cppObj = createCppObj(com.tencent.wcdb.winq.Identifier.getCppType(tableOrSubqueryConvertibleArr[0]), jArr, (java.lang.String[]) null);
    }

    public com.tencent.wcdb.winq.TableOrSubquery argument(float f17) {
        argument(this.cppObj, 5, 0L, f17, null);
        return this;
    }

    public com.tencent.wcdb.winq.TableOrSubquery argument(double d17) {
        argument(this.cppObj, 5, 0L, d17, null);
        return this;
    }

    public com.tencent.wcdb.winq.TableOrSubquery argument(java.lang.String str) {
        if (str != null) {
            argument(this.cppObj, 6, 0L, 0.0d, str);
        } else {
            argument(this.cppObj, 1, 0L, 0.0d, null);
        }
        return this;
    }

    public com.tencent.wcdb.winq.TableOrSubquery argument(com.tencent.wcdb.winq.ExpressionConvertible expressionConvertible) {
        argument(this.cppObj, com.tencent.wcdb.winq.Identifier.getCppType(expressionConvertible), com.tencent.wcdb.base.CppObject.get(expressionConvertible), 0.0d, null);
        return this;
    }

    public TableOrSubquery(java.lang.String... strArr) {
        this.cppObj = createCppObj(6, (long[]) null, strArr);
    }
}
