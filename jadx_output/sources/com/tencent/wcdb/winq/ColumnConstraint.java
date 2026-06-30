package com.tencent.wcdb.winq;

/* loaded from: classes12.dex */
public class ColumnConstraint extends com.tencent.wcdb.winq.Identifier {
    public ColumnConstraint() {
        this.cppObj = createCppObject(null);
    }

    private static native void configAutoIncrement(long j17);

    private static native void configCheck(long j17, long j18);

    private static native void configCollate(long j17, java.lang.String str);

    private static native void configConflictAction(long j17, int i17);

    private static native void configForeignKey(long j17, long j18);

    private static native void configNotNull(long j17);

    private static native void configOrder(long j17, int i17);

    private static native void configPrimaryKey(long j17);

    private static native void configUnIndex(long j17);

    private static native void configUnique(long j17);

    private static native long createCppObject(java.lang.String str);

    private static native void defaultTo(long j17, int i17, long j18, double d17, java.lang.String str);

    public com.tencent.wcdb.winq.ColumnConstraint autoIncrement() {
        configAutoIncrement(this.cppObj);
        return this;
    }

    public com.tencent.wcdb.winq.ColumnConstraint check(com.tencent.wcdb.winq.Expression expression) {
        configCheck(this.cppObj, com.tencent.wcdb.base.CppObject.get((com.tencent.wcdb.base.CppObject) expression));
        return this;
    }

    public com.tencent.wcdb.winq.ColumnConstraint collate(java.lang.String str) {
        configCollate(this.cppObj, str);
        return this;
    }

    public com.tencent.wcdb.winq.ColumnConstraint conflict(com.tencent.wcdb.winq.ConflictAction conflictAction) {
        configConflictAction(this.cppObj, conflictAction.ordinal());
        return this;
    }

    public com.tencent.wcdb.winq.ColumnConstraint defaultTo(boolean z17) {
        defaultTo(this.cppObj, 2, z17 ? 1L : 0L, 0.0d, null);
        return this;
    }

    public com.tencent.wcdb.winq.ColumnConstraint foreignKey(com.tencent.wcdb.winq.ForeignKey foreignKey) {
        configForeignKey(this.cppObj, com.tencent.wcdb.base.CppObject.get((com.tencent.wcdb.base.CppObject) foreignKey));
        return this;
    }

    @Override // com.tencent.wcdb.winq.Identifier
    public int getType() {
        return 10;
    }

    public com.tencent.wcdb.winq.ColumnConstraint notNull() {
        configNotNull(this.cppObj);
        return this;
    }

    public com.tencent.wcdb.winq.ColumnConstraint order(com.tencent.wcdb.winq.Order order) {
        configOrder(this.cppObj, order.ordinal() + 1);
        return this;
    }

    public com.tencent.wcdb.winq.ColumnConstraint primaryKey() {
        configPrimaryKey(this.cppObj);
        return this;
    }

    public com.tencent.wcdb.winq.ColumnConstraint unIndex() {
        configUnIndex(this.cppObj);
        return this;
    }

    public com.tencent.wcdb.winq.ColumnConstraint unique() {
        configUnique(this.cppObj);
        return this;
    }

    public com.tencent.wcdb.winq.ColumnConstraint defaultTo(byte b17) {
        defaultTo(this.cppObj, 3, b17, 0.0d, null);
        return this;
    }

    public ColumnConstraint(java.lang.String str) {
        this.cppObj = createCppObject(str);
    }

    public com.tencent.wcdb.winq.ColumnConstraint defaultTo(short s17) {
        defaultTo(this.cppObj, 3, s17, 0.0d, null);
        return this;
    }

    public com.tencent.wcdb.winq.ColumnConstraint defaultTo(int i17) {
        defaultTo(this.cppObj, 3, i17, 0.0d, null);
        return this;
    }

    public com.tencent.wcdb.winq.ColumnConstraint defaultTo(long j17) {
        defaultTo(this.cppObj, 3, j17, 0.0d, null);
        return this;
    }

    public com.tencent.wcdb.winq.ColumnConstraint defaultTo(float f17) {
        defaultTo(this.cppObj, 5, 0L, f17, null);
        return this;
    }

    public com.tencent.wcdb.winq.ColumnConstraint defaultTo(double d17) {
        defaultTo(this.cppObj, 5, 0L, d17, null);
        return this;
    }

    public com.tencent.wcdb.winq.ColumnConstraint defaultTo(java.lang.String str) {
        if (str != null) {
            defaultTo(this.cppObj, 6, 0L, 0.0d, str);
        } else {
            defaultTo(this.cppObj, 1, 0L, 0.0d, null);
        }
        return this;
    }

    public com.tencent.wcdb.winq.ColumnConstraint defaultTo(com.tencent.wcdb.winq.ExpressionConvertible expressionConvertible) {
        defaultTo(this.cppObj, com.tencent.wcdb.winq.Identifier.getCppType(expressionConvertible), com.tencent.wcdb.base.CppObject.get(expressionConvertible), 0.0d, null);
        return this;
    }
}
