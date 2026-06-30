package com.tencent.wcdb.winq;

/* loaded from: classes12.dex */
public class RaiseFunction extends com.tencent.wcdb.winq.Identifier implements com.tencent.wcdb.winq.ExpressionConvertible, com.tencent.wcdb.winq.ResultColumnConvertible {
    public RaiseFunction() {
        this.cppObj = createCppObj();
    }

    private static native long createCppObj();

    private static native void setAction(long j17, int i17, java.lang.String str);

    public com.tencent.wcdb.winq.RaiseFunction abort(java.lang.String str) {
        setAction(this.cppObj, 2, str);
        return this;
    }

    public com.tencent.wcdb.winq.RaiseFunction fail(java.lang.String str) {
        setAction(this.cppObj, 3, str);
        return this;
    }

    @Override // com.tencent.wcdb.winq.Identifier
    public int getType() {
        return 15;
    }

    public com.tencent.wcdb.winq.RaiseFunction ignore() {
        setAction(this.cppObj, 0, null);
        return this;
    }

    public com.tencent.wcdb.winq.RaiseFunction rollback(java.lang.String str) {
        setAction(this.cppObj, 1, str);
        return this;
    }
}
