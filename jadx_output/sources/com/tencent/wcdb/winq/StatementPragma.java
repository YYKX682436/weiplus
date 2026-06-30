package com.tencent.wcdb.winq;

/* loaded from: classes12.dex */
public class StatementPragma extends com.tencent.wcdb.winq.Statement {
    public StatementPragma() {
        this.cppObj = createCppObj();
    }

    private static native void configPragma(long j17, long j18);

    private static native void configSchema(long j17, int i17, long j18, java.lang.String str);

    private static native void configToValue(long j17, int i17, long j18, double d17, java.lang.String str);

    private static native void configWithValue(long j17, int i17, long j18, double d17, java.lang.String str);

    private static native long createCppObj();

    @Override // com.tencent.wcdb.winq.Identifier
    public int getType() {
        return 53;
    }

    public com.tencent.wcdb.winq.StatementPragma of(java.lang.String str) {
        configSchema(this.cppObj, 6, 0L, str);
        return this;
    }

    public com.tencent.wcdb.winq.StatementPragma pragma(com.tencent.wcdb.winq.Pragma pragma) {
        configPragma(this.cppObj, com.tencent.wcdb.base.CppObject.get((com.tencent.wcdb.base.CppObject) pragma));
        return this;
    }

    public com.tencent.wcdb.winq.StatementPragma toValue(boolean z17) {
        configToValue(this.cppObj, 2, z17 ? 1L : 0L, 0.0d, null);
        return this;
    }

    public com.tencent.wcdb.winq.StatementPragma withValue(boolean z17) {
        configWithValue(this.cppObj, 2, z17 ? 1L : 0L, 0.0d, null);
        return this;
    }

    public com.tencent.wcdb.winq.StatementPragma of(com.tencent.wcdb.winq.Schema schema) {
        configSchema(this.cppObj, com.tencent.wcdb.winq.Identifier.getCppType((com.tencent.wcdb.winq.Identifier) schema), com.tencent.wcdb.base.CppObject.get((com.tencent.wcdb.base.CppObject) schema), null);
        return this;
    }

    public com.tencent.wcdb.winq.StatementPragma toValue(byte b17) {
        configToValue(this.cppObj, 3, b17, 0.0d, null);
        return this;
    }

    public com.tencent.wcdb.winq.StatementPragma withValue(byte b17) {
        configWithValue(this.cppObj, 3, b17, 0.0d, null);
        return this;
    }

    public com.tencent.wcdb.winq.StatementPragma toValue(short s17) {
        configToValue(this.cppObj, 3, s17, 0.0d, null);
        return this;
    }

    public com.tencent.wcdb.winq.StatementPragma withValue(short s17) {
        configWithValue(this.cppObj, 3, s17, 0.0d, null);
        return this;
    }

    public com.tencent.wcdb.winq.StatementPragma toValue(int i17) {
        configToValue(this.cppObj, 3, i17, 0.0d, null);
        return this;
    }

    public com.tencent.wcdb.winq.StatementPragma withValue(int i17) {
        configWithValue(this.cppObj, 3, i17, 0.0d, null);
        return this;
    }

    public com.tencent.wcdb.winq.StatementPragma toValue(long j17) {
        configToValue(this.cppObj, 3, j17, 0.0d, null);
        return this;
    }

    public com.tencent.wcdb.winq.StatementPragma withValue(long j17) {
        configWithValue(this.cppObj, 3, j17, 0.0d, null);
        return this;
    }

    public com.tencent.wcdb.winq.StatementPragma toValue(float f17) {
        configToValue(this.cppObj, 5, 0L, f17, null);
        return this;
    }

    public com.tencent.wcdb.winq.StatementPragma withValue(float f17) {
        configWithValue(this.cppObj, 5, 0L, f17, null);
        return this;
    }

    public com.tencent.wcdb.winq.StatementPragma toValue(double d17) {
        configToValue(this.cppObj, 5, 0L, d17, null);
        return this;
    }

    public com.tencent.wcdb.winq.StatementPragma withValue(double d17) {
        configWithValue(this.cppObj, 5, 0L, d17, null);
        return this;
    }

    public com.tencent.wcdb.winq.StatementPragma toValue(java.lang.String str) {
        if (str != null) {
            configToValue(this.cppObj, 6, 0L, 0.0d, str);
        } else {
            configToValue(this.cppObj, 1, 0L, 0.0d, null);
        }
        return this;
    }

    public com.tencent.wcdb.winq.StatementPragma withValue(java.lang.String str) {
        if (str != null) {
            configWithValue(this.cppObj, 6, 0L, 0.0d, str);
        } else {
            configWithValue(this.cppObj, 1, 0L, 0.0d, null);
        }
        return this;
    }
}
