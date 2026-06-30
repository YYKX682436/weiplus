package com.tencent.wcdb.winq;

/* loaded from: classes12.dex */
public class TableConstraint extends com.tencent.wcdb.winq.Identifier {
    public TableConstraint() {
        this.cppObj = createCppObj(null);
    }

    private static native void configCheckExpression(long j17, long j18);

    private static native void configConfliction(long j17, int i17);

    private static native void configForeignKey(long j17, int i17, long[] jArr, java.lang.String[] strArr, long j18);

    private static native void configIndexedColumn(long j17, int i17, long[] jArr, java.lang.String[] strArr);

    private static native void configPrimaryKey(long j17);

    private static native void configUnique(long j17);

    private static native long createCppObj(java.lang.String str);

    public com.tencent.wcdb.winq.TableConstraint check(com.tencent.wcdb.winq.Expression expression) {
        configCheckExpression(this.cppObj, com.tencent.wcdb.base.CppObject.get((com.tencent.wcdb.base.CppObject) expression));
        return this;
    }

    public com.tencent.wcdb.winq.TableConstraint foreignKey(com.tencent.wcdb.winq.ForeignKey foreignKey, java.lang.String... strArr) {
        configForeignKey(this.cppObj, 6, null, strArr, com.tencent.wcdb.base.CppObject.get((com.tencent.wcdb.base.CppObject) foreignKey));
        return this;
    }

    @Override // com.tencent.wcdb.winq.Identifier
    public int getType() {
        return 19;
    }

    public com.tencent.wcdb.winq.TableConstraint indexedBy(com.tencent.wcdb.winq.IndexedColumnConvertible... indexedColumnConvertibleArr) {
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

    public com.tencent.wcdb.winq.TableConstraint onConflict(com.tencent.wcdb.winq.ConflictAction conflictAction) {
        configConfliction(this.cppObj, conflictAction.ordinal());
        return this;
    }

    public com.tencent.wcdb.winq.TableConstraint primaryKey() {
        configPrimaryKey(this.cppObj);
        return this;
    }

    public com.tencent.wcdb.winq.TableConstraint unique() {
        configUnique(this.cppObj);
        return this;
    }

    public TableConstraint(java.lang.String str) {
        this.cppObj = createCppObj(str);
    }

    public com.tencent.wcdb.winq.TableConstraint foreignKey(com.tencent.wcdb.winq.ForeignKey foreignKey, com.tencent.wcdb.winq.Column... columnArr) {
        long[] jArr = new long[columnArr.length];
        for (int i17 = 0; i17 < columnArr.length; i17++) {
            jArr[i17] = com.tencent.wcdb.base.CppObject.get((com.tencent.wcdb.base.CppObject) columnArr[i17]);
        }
        configForeignKey(this.cppObj, 7, jArr, null, com.tencent.wcdb.base.CppObject.get((com.tencent.wcdb.base.CppObject) foreignKey));
        return this;
    }

    public com.tencent.wcdb.winq.TableConstraint indexedBy(java.lang.String... strArr) {
        configIndexedColumn(this.cppObj, 6, null, strArr);
        return this;
    }
}
