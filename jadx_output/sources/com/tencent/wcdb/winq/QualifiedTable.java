package com.tencent.wcdb.winq;

/* loaded from: classes12.dex */
public class QualifiedTable extends com.tencent.wcdb.winq.Identifier {
    public QualifiedTable(java.lang.String str) {
        this.cppObj = createCppObj(str);
    }

    private static native void alias(long j17, java.lang.String str);

    private static native long createCppObj(java.lang.String str);

    private static native void indexed(long j17, java.lang.String str);

    private static native void notIndexed(long j17);

    private static native void schema(long j17, int i17, long j18, java.lang.String str);

    public com.tencent.wcdb.winq.QualifiedTable as(java.lang.String str) {
        alias(this.cppObj, str);
        return this;
    }

    @Override // com.tencent.wcdb.winq.Identifier
    public int getType() {
        return 21;
    }

    public com.tencent.wcdb.winq.QualifiedTable indexed(java.lang.String str) {
        indexed(this.cppObj, str);
        return this;
    }

    public com.tencent.wcdb.winq.QualifiedTable notIndexed() {
        notIndexed(this.cppObj);
        return this;
    }

    public com.tencent.wcdb.winq.QualifiedTable of(java.lang.String str) {
        schema(this.cppObj, 6, 0L, str);
        return this;
    }

    public com.tencent.wcdb.winq.QualifiedTable of(com.tencent.wcdb.winq.Schema schema) {
        schema(this.cppObj, com.tencent.wcdb.winq.Identifier.getCppType((com.tencent.wcdb.winq.Identifier) schema), com.tencent.wcdb.base.CppObject.get((com.tencent.wcdb.base.CppObject) schema), null);
        return this;
    }
}
