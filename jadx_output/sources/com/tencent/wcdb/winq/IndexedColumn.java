package com.tencent.wcdb.winq;

/* loaded from: classes12.dex */
public class IndexedColumn extends com.tencent.wcdb.winq.Identifier implements com.tencent.wcdb.winq.IndexedColumnConvertible {
    public IndexedColumn(com.tencent.wcdb.winq.IndexedColumnConvertible indexedColumnConvertible) {
        this.cppObj = createCppObj(com.tencent.wcdb.winq.Identifier.getCppType(indexedColumnConvertible), com.tencent.wcdb.base.CppObject.get(indexedColumnConvertible), null);
    }

    private static native void collate(long j17, java.lang.String str);

    private static native long createCppObj(int i17, long j17, java.lang.String str);

    private static native void order(long j17, int i17);

    public com.tencent.wcdb.winq.IndexedColumn collate(java.lang.String str) {
        collate(this.cppObj, str);
        return this;
    }

    @Override // com.tencent.wcdb.winq.Identifier
    public int getType() {
        return 18;
    }

    public com.tencent.wcdb.winq.IndexedColumn order(com.tencent.wcdb.winq.Order order) {
        order(this.cppObj, order.ordinal() + 1);
        return this;
    }

    public IndexedColumn(java.lang.String str) {
        this.cppObj = createCppObj(6, 0L, str);
    }
}
