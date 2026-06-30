package com.tencent.wcdb.winq;

/* loaded from: classes12.dex */
public class Join extends com.tencent.wcdb.winq.Identifier implements com.tencent.wcdb.winq.TableOrSubqueryConvertible {
    public Join(java.lang.String str) {
        this.cppObj = createCppObj(6, 0L, str);
    }

    private static native void configJoin(long j17, int i17, long j18, java.lang.String str);

    private static native void configOn(long j17, long j18);

    private static native void configUsingColumn(long j17, int i17, long[] jArr, java.lang.String[] strArr);

    private static native void configWith(long j17, int i17, long j18, java.lang.String str);

    private static native void configWithCrossJoin(long j17, int i17, long j18, java.lang.String str);

    private static native void configWithInnerJoin(long j17, int i17, long j18, java.lang.String str);

    private static native void configWithLeftJoin(long j17, int i17, long j18, java.lang.String str);

    private static native void configWithLeftOuterJoin(long j17, int i17, long j18, java.lang.String str);

    private static native void configWithNaturalCrossJoin(long j17, int i17, long j18, java.lang.String str);

    private static native void configWithNaturalInnerJoin(long j17, int i17, long j18, java.lang.String str);

    private static native void configWithNaturalJoin(long j17, int i17, long j18, java.lang.String str);

    private static native void configWithNaturalLeftJoin(long j17, int i17, long j18, java.lang.String str);

    private static native void configWithNaturalLeftOuterJoin(long j17, int i17, long j18, java.lang.String str);

    private static native long createCppObj(int i17, long j17, java.lang.String str);

    public com.tencent.wcdb.winq.Join crossJoin(java.lang.String str) {
        configWithCrossJoin(this.cppObj, 6, 0L, str);
        return this;
    }

    @Override // com.tencent.wcdb.winq.Identifier
    public int getType() {
        return 25;
    }

    public com.tencent.wcdb.winq.Join innerJoin(java.lang.String str) {
        configWithInnerJoin(this.cppObj, 6, 0L, str);
        return this;
    }

    public com.tencent.wcdb.winq.Join join(java.lang.String str) {
        configJoin(this.cppObj, 6, 0L, str);
        return this;
    }

    public com.tencent.wcdb.winq.Join leftJoin(java.lang.String str) {
        configWithLeftJoin(this.cppObj, 6, 0L, str);
        return this;
    }

    public com.tencent.wcdb.winq.Join leftOuterJoin(java.lang.String str) {
        configWithLeftOuterJoin(this.cppObj, 6, 0L, str);
        return this;
    }

    public com.tencent.wcdb.winq.Join naturalCrossJoin(java.lang.String str) {
        configWithNaturalCrossJoin(this.cppObj, 6, 0L, str);
        return this;
    }

    public com.tencent.wcdb.winq.Join naturalInnerJoin(java.lang.String str) {
        configWithNaturalInnerJoin(this.cppObj, 6, 0L, str);
        return this;
    }

    public com.tencent.wcdb.winq.Join naturalJoin(java.lang.String str) {
        configWithNaturalJoin(this.cppObj, 6, 0L, str);
        return this;
    }

    public com.tencent.wcdb.winq.Join naturalLeftJoin(java.lang.String str) {
        configWithNaturalLeftJoin(this.cppObj, 6, 0L, str);
        return this;
    }

    public com.tencent.wcdb.winq.Join naturalLeftOuterJoin(java.lang.String str) {
        configWithNaturalLeftOuterJoin(this.cppObj, 6, 0L, str);
        return this;
    }

    public com.tencent.wcdb.winq.Join on(com.tencent.wcdb.winq.Expression expression) {
        configOn(this.cppObj, com.tencent.wcdb.base.CppObject.get((com.tencent.wcdb.base.CppObject) expression));
        return this;
    }

    public com.tencent.wcdb.winq.Join using(java.lang.String str) {
        configUsingColumn(this.cppObj, 6, null, new java.lang.String[]{str});
        return this;
    }

    public com.tencent.wcdb.winq.Join with(java.lang.String str) {
        configWith(this.cppObj, 6, 0L, str);
        return this;
    }

    public com.tencent.wcdb.winq.Join crossJoin(com.tencent.wcdb.winq.TableOrSubqueryConvertible tableOrSubqueryConvertible) {
        configWithCrossJoin(this.cppObj, com.tencent.wcdb.winq.Identifier.getCppType(tableOrSubqueryConvertible), com.tencent.wcdb.base.CppObject.get(tableOrSubqueryConvertible), null);
        return this;
    }

    public com.tencent.wcdb.winq.Join innerJoin(com.tencent.wcdb.winq.TableOrSubqueryConvertible tableOrSubqueryConvertible) {
        configWithInnerJoin(this.cppObj, com.tencent.wcdb.winq.Identifier.getCppType(tableOrSubqueryConvertible), com.tencent.wcdb.base.CppObject.get(tableOrSubqueryConvertible), null);
        return this;
    }

    public com.tencent.wcdb.winq.Join join(com.tencent.wcdb.winq.TableOrSubqueryConvertible tableOrSubqueryConvertible) {
        configJoin(this.cppObj, com.tencent.wcdb.winq.Identifier.getCppType(tableOrSubqueryConvertible), com.tencent.wcdb.base.CppObject.get(tableOrSubqueryConvertible), null);
        return this;
    }

    public com.tencent.wcdb.winq.Join leftJoin(com.tencent.wcdb.winq.TableOrSubqueryConvertible tableOrSubqueryConvertible) {
        configWithLeftJoin(this.cppObj, com.tencent.wcdb.winq.Identifier.getCppType(tableOrSubqueryConvertible), com.tencent.wcdb.base.CppObject.get(tableOrSubqueryConvertible), null);
        return this;
    }

    public com.tencent.wcdb.winq.Join leftOuterJoin(com.tencent.wcdb.winq.TableOrSubqueryConvertible tableOrSubqueryConvertible) {
        configWithLeftOuterJoin(this.cppObj, com.tencent.wcdb.winq.Identifier.getCppType(tableOrSubqueryConvertible), com.tencent.wcdb.base.CppObject.get(tableOrSubqueryConvertible), null);
        return this;
    }

    public com.tencent.wcdb.winq.Join naturalCrossJoin(com.tencent.wcdb.winq.TableOrSubqueryConvertible tableOrSubqueryConvertible) {
        configWithNaturalCrossJoin(this.cppObj, com.tencent.wcdb.winq.Identifier.getCppType(tableOrSubqueryConvertible), com.tencent.wcdb.base.CppObject.get(tableOrSubqueryConvertible), null);
        return this;
    }

    public com.tencent.wcdb.winq.Join naturalInnerJoin(com.tencent.wcdb.winq.TableOrSubqueryConvertible tableOrSubqueryConvertible) {
        configWithNaturalInnerJoin(this.cppObj, com.tencent.wcdb.winq.Identifier.getCppType(tableOrSubqueryConvertible), com.tencent.wcdb.base.CppObject.get(tableOrSubqueryConvertible), null);
        return this;
    }

    public com.tencent.wcdb.winq.Join naturalJoin(com.tencent.wcdb.winq.TableOrSubqueryConvertible tableOrSubqueryConvertible) {
        configWithNaturalJoin(this.cppObj, com.tencent.wcdb.winq.Identifier.getCppType(tableOrSubqueryConvertible), com.tencent.wcdb.base.CppObject.get(tableOrSubqueryConvertible), null);
        return this;
    }

    public com.tencent.wcdb.winq.Join naturalLeftJoin(com.tencent.wcdb.winq.TableOrSubqueryConvertible tableOrSubqueryConvertible) {
        configWithNaturalLeftJoin(this.cppObj, com.tencent.wcdb.winq.Identifier.getCppType(tableOrSubqueryConvertible), com.tencent.wcdb.base.CppObject.get(tableOrSubqueryConvertible), null);
        return this;
    }

    public com.tencent.wcdb.winq.Join naturalLeftOuterJoin(com.tencent.wcdb.winq.TableOrSubqueryConvertible tableOrSubqueryConvertible) {
        configWithNaturalLeftOuterJoin(this.cppObj, com.tencent.wcdb.winq.Identifier.getCppType(tableOrSubqueryConvertible), com.tencent.wcdb.base.CppObject.get(tableOrSubqueryConvertible), null);
        return this;
    }

    public com.tencent.wcdb.winq.Join using(com.tencent.wcdb.winq.Column column) {
        configUsingColumn(this.cppObj, com.tencent.wcdb.winq.Identifier.getCppType((com.tencent.wcdb.winq.Identifier) column), new long[]{com.tencent.wcdb.base.CppObject.get((com.tencent.wcdb.base.CppObject) column)}, null);
        return this;
    }

    public com.tencent.wcdb.winq.Join with(com.tencent.wcdb.winq.TableOrSubqueryConvertible tableOrSubqueryConvertible) {
        configWith(this.cppObj, com.tencent.wcdb.winq.Identifier.getCppType(tableOrSubqueryConvertible), com.tencent.wcdb.base.CppObject.get(tableOrSubqueryConvertible), null);
        return this;
    }

    public Join(com.tencent.wcdb.winq.TableOrSubqueryConvertible tableOrSubqueryConvertible) {
        this.cppObj = createCppObj(com.tencent.wcdb.winq.Identifier.getCppType(tableOrSubqueryConvertible), com.tencent.wcdb.base.CppObject.get(tableOrSubqueryConvertible), null);
    }

    public com.tencent.wcdb.winq.Join using(java.lang.String... strArr) {
        configUsingColumn(this.cppObj, 6, null, strArr);
        return this;
    }

    public com.tencent.wcdb.winq.Join using(com.tencent.wcdb.winq.Column... columnArr) {
        if (columnArr != null && columnArr.length != 0) {
            long[] jArr = new long[columnArr.length];
            for (int i17 = 0; i17 < columnArr.length; i17++) {
                jArr[i17] = com.tencent.wcdb.base.CppObject.get((com.tencent.wcdb.base.CppObject) columnArr[i17]);
            }
            configUsingColumn(this.cppObj, 7, jArr, null);
        }
        return this;
    }
}
