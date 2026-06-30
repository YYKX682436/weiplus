package com.tencent.wcdb.winq;

/* loaded from: classes12.dex */
public class ColumnDef extends com.tencent.wcdb.winq.Identifier {
    public ColumnDef(java.lang.String str) {
        this.cppObj = createCppObj(6, 0L, str, 0);
    }

    private static native void constraint(long j17, long j18);

    private static native long createCppObj(int i17, long j17, java.lang.String str, int i18);

    public com.tencent.wcdb.winq.ColumnDef constraint(com.tencent.wcdb.winq.ColumnConstraint columnConstraint) {
        constraint(this.cppObj, com.tencent.wcdb.base.CppObject.get((com.tencent.wcdb.base.CppObject) columnConstraint));
        return this;
    }

    @Override // com.tencent.wcdb.winq.Identifier
    public int getType() {
        return 9;
    }

    public com.tencent.wcdb.winq.ColumnDef makeDefaultTo(boolean z17) {
        return constraint(new com.tencent.wcdb.winq.ColumnConstraint().defaultTo(z17));
    }

    public com.tencent.wcdb.winq.ColumnDef makeForeignKey(com.tencent.wcdb.winq.ForeignKey foreignKey) {
        return constraint(new com.tencent.wcdb.winq.ColumnConstraint().foreignKey(foreignKey));
    }

    public com.tencent.wcdb.winq.ColumnDef makeNotIndexed() {
        return constraint(new com.tencent.wcdb.winq.ColumnConstraint().unIndex());
    }

    public com.tencent.wcdb.winq.ColumnDef makeNotNull() {
        return constraint(new com.tencent.wcdb.winq.ColumnConstraint().notNull());
    }

    public com.tencent.wcdb.winq.ColumnDef makePrimary() {
        return constraint(new com.tencent.wcdb.winq.ColumnConstraint().primaryKey());
    }

    public com.tencent.wcdb.winq.ColumnDef makeUnique() {
        return constraint(new com.tencent.wcdb.winq.ColumnConstraint().unique());
    }

    public com.tencent.wcdb.winq.ColumnDef makeDefaultTo(byte b17) {
        return constraint(new com.tencent.wcdb.winq.ColumnConstraint().defaultTo(b17));
    }

    public com.tencent.wcdb.winq.ColumnDef makePrimary(boolean z17) {
        return constraint(new com.tencent.wcdb.winq.ColumnConstraint().primaryKey().autoIncrement());
    }

    public ColumnDef(com.tencent.wcdb.winq.Column column) {
        this.cppObj = createCppObj(com.tencent.wcdb.winq.Identifier.getCppType((com.tencent.wcdb.winq.Identifier) column), com.tencent.wcdb.base.CppObject.get((com.tencent.wcdb.base.CppObject) column), null, 0);
    }

    public com.tencent.wcdb.winq.ColumnDef makeDefaultTo(short s17) {
        return constraint(new com.tencent.wcdb.winq.ColumnConstraint().defaultTo(s17));
    }

    public com.tencent.wcdb.winq.ColumnDef makeDefaultTo(int i17) {
        return constraint(new com.tencent.wcdb.winq.ColumnConstraint().defaultTo(i17));
    }

    public ColumnDef(java.lang.String str, com.tencent.wcdb.winq.ColumnType columnType) {
        this.cppObj = createCppObj(6, 0L, str, columnType.ordinal());
    }

    public com.tencent.wcdb.winq.ColumnDef makeDefaultTo(long j17) {
        return constraint(new com.tencent.wcdb.winq.ColumnConstraint().defaultTo(j17));
    }

    public com.tencent.wcdb.winq.ColumnDef makeDefaultTo(float f17) {
        return constraint(new com.tencent.wcdb.winq.ColumnConstraint().defaultTo(f17));
    }

    public ColumnDef(com.tencent.wcdb.winq.Column column, com.tencent.wcdb.winq.ColumnType columnType) {
        this.cppObj = createCppObj(com.tencent.wcdb.winq.Identifier.getCppType((com.tencent.wcdb.winq.Identifier) column), com.tencent.wcdb.base.CppObject.get((com.tencent.wcdb.base.CppObject) column), null, columnType.ordinal());
    }

    public com.tencent.wcdb.winq.ColumnDef makeDefaultTo(double d17) {
        return constraint(new com.tencent.wcdb.winq.ColumnConstraint().defaultTo(d17));
    }

    public com.tencent.wcdb.winq.ColumnDef makeDefaultTo(java.lang.String str) {
        return constraint(new com.tencent.wcdb.winq.ColumnConstraint().defaultTo(str));
    }

    public com.tencent.wcdb.winq.ColumnDef makeDefaultTo(com.tencent.wcdb.winq.ExpressionConvertible expressionConvertible) {
        return constraint(new com.tencent.wcdb.winq.ColumnConstraint().defaultTo(expressionConvertible));
    }
}
