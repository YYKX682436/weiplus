package com.tencent.wcdb.winq;

/* loaded from: classes12.dex */
public class Column extends com.tencent.wcdb.winq.ExpressionOperable implements com.tencent.wcdb.winq.IndexedColumnConvertible, com.tencent.wcdb.winq.ResultColumnConvertible {
    public Column(java.lang.String str) {
        this.cppObj = createCppObj(str, 0L);
    }

    public static com.tencent.wcdb.winq.Column all() {
        com.tencent.wcdb.winq.Column column = new com.tencent.wcdb.winq.Column();
        column.cppObj = allColumn();
        return column;
    }

    private static native long allColumn();

    private static native long configAlias(long j17, java.lang.String str);

    private static native long createCppObj(java.lang.String str, long j17);

    public static com.tencent.wcdb.winq.Column rowId() {
        com.tencent.wcdb.winq.Column column = new com.tencent.wcdb.winq.Column();
        column.cppObj = rowidColumn();
        return column;
    }

    private static native long rowidColumn();

    public com.tencent.wcdb.winq.ResultColumn as(java.lang.String str) {
        return new com.tencent.wcdb.winq.ResultColumn(configAlias(this.cppObj, str));
    }

    public com.tencent.wcdb.winq.ColumnDef asDef(com.tencent.wcdb.winq.ColumnType columnType) {
        return new com.tencent.wcdb.winq.ColumnDef(this, columnType);
    }

    public native long copy(long j17);

    @Override // com.tencent.wcdb.winq.Identifier
    public int getType() {
        return 7;
    }

    public native void inTable(long j17, java.lang.String str);

    public com.tencent.wcdb.winq.Column of(com.tencent.wcdb.winq.Schema schema) {
        ofSchema(this.cppObj, com.tencent.wcdb.winq.Identifier.getCppType((com.tencent.wcdb.winq.Identifier) schema), com.tencent.wcdb.base.CppObject.get((com.tencent.wcdb.base.CppObject) schema), null);
        return this;
    }

    public native void ofSchema(long j17, int i17, long j18, java.lang.String str);

    public void ofSchema(com.tencent.wcdb.winq.Schema schema) {
        ofSchema(this.cppObj, com.tencent.wcdb.winq.Identifier.getCppType((com.tencent.wcdb.winq.Identifier) schema), com.tencent.wcdb.base.CppObject.get((com.tencent.wcdb.base.CppObject) schema), null);
    }

    public com.tencent.wcdb.winq.OrderingTerm order(com.tencent.wcdb.winq.Order order) {
        return new com.tencent.wcdb.winq.OrderingTerm(this).order(order);
    }

    public com.tencent.wcdb.winq.Column table(java.lang.String str) {
        inTable(this.cppObj, str);
        return this;
    }

    public com.tencent.wcdb.winq.Column of(java.lang.String str) {
        ofSchema(this.cppObj, 6, 0L, str);
        return this;
    }

    public void ofSchema(java.lang.String str) {
        ofSchema(this.cppObj, 6, 0L, str);
    }

    public Column(java.lang.String str, long j17) {
        this.cppObj = createCppObj(str, j17);
    }

    public Column() {
    }
}
