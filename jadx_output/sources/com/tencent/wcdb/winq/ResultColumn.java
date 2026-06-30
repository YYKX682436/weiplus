package com.tencent.wcdb.winq;

/* loaded from: classes12.dex */
public class ResultColumn extends com.tencent.wcdb.winq.Identifier implements com.tencent.wcdb.winq.ResultColumnConvertible {
    public ResultColumn(long j17) {
        this.cppObj = j17;
    }

    private static native void configAlias(long j17, java.lang.String str);

    private static native long createCppObj(int i17, long j17, java.lang.String str);

    public com.tencent.wcdb.winq.ResultColumn as(java.lang.String str) {
        configAlias(this.cppObj, str);
        return this;
    }

    @Override // com.tencent.wcdb.winq.Identifier
    public int getType() {
        return 29;
    }

    public ResultColumn(com.tencent.wcdb.winq.ResultColumnConvertible resultColumnConvertible) {
        this.cppObj = createCppObj(com.tencent.wcdb.winq.Identifier.getCppType(resultColumnConvertible), com.tencent.wcdb.base.CppObject.get(resultColumnConvertible), null);
    }

    public ResultColumn(java.lang.String str) {
        this.cppObj = createCppObj(6, 0L, str);
    }
}
