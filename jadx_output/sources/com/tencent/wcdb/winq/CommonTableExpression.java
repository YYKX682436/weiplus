package com.tencent.wcdb.winq;

/* loaded from: classes12.dex */
public class CommonTableExpression extends com.tencent.wcdb.winq.Identifier {
    public CommonTableExpression(java.lang.String str) {
        this.cppObj = createCPPObject(str);
    }

    private static native void configColumn(long j17, long j18);

    private static native void configSelect(long j17, long j18);

    private static native long createCPPObject(java.lang.String str);

    public com.tencent.wcdb.winq.CommonTableExpression as(com.tencent.wcdb.winq.StatementSelect statementSelect) {
        configSelect(this.cppObj, com.tencent.wcdb.base.CppObject.get((com.tencent.wcdb.base.CppObject) statementSelect));
        return this;
    }

    public com.tencent.wcdb.winq.CommonTableExpression column(com.tencent.wcdb.winq.Column column) {
        configColumn(this.cppObj, com.tencent.wcdb.base.CppObject.get((com.tencent.wcdb.base.CppObject) column));
        return this;
    }

    @Override // com.tencent.wcdb.winq.Identifier
    public int getType() {
        return 20;
    }
}
