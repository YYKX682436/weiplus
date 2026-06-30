package com.tencent.wcdb.winq;

/* loaded from: classes12.dex */
public class OrderingTerm extends com.tencent.wcdb.winq.Identifier {
    public OrderingTerm(com.tencent.wcdb.winq.ExpressionConvertible expressionConvertible) {
        this.cppObj = createCppObj(com.tencent.wcdb.winq.Identifier.getCppType(expressionConvertible), com.tencent.wcdb.base.CppObject.get(expressionConvertible));
    }

    public static com.tencent.wcdb.winq.OrderingTerm ascendingRowid() {
        return com.tencent.wcdb.winq.Column.rowId().order(com.tencent.wcdb.winq.Order.Asc);
    }

    private static native void collate(long j17, java.lang.String str);

    private static native long createCppObj(int i17, long j17);

    public static com.tencent.wcdb.winq.OrderingTerm descendingRowid() {
        return com.tencent.wcdb.winq.Column.rowId().order(com.tencent.wcdb.winq.Order.Desc);
    }

    private static native void order(long j17, int i17);

    public com.tencent.wcdb.winq.OrderingTerm collate(java.lang.String str) {
        collate(this.cppObj, str);
        return this;
    }

    @Override // com.tencent.wcdb.winq.Identifier
    public int getType() {
        return 22;
    }

    public com.tencent.wcdb.winq.OrderingTerm order(com.tencent.wcdb.winq.Order order) {
        order(this.cppObj, order.ordinal() + 1);
        return this;
    }
}
