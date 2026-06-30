package com.tencent.wcdb.winq;

/* loaded from: classes12.dex */
public class ForeignKey extends com.tencent.wcdb.winq.Identifier {

    /* loaded from: classes3.dex */
    public enum Action {
        SetNull,
        SetDefault,
        Cascade,
        Restrict,
        NoAction
    }

    /* loaded from: classes3.dex */
    public enum Initially {
        Default,
        Deferred,
        Immediate
    }

    /* loaded from: classes3.dex */
    public enum Match {
        Simple,
        Full,
        Partial
    }

    public ForeignKey() {
        this.cppObj = createCPPObj();
    }

    private static native void configColumns(long j17, int i17, long[] jArr, java.lang.String[] strArr);

    private static native void configDeferrable(long j17, int i17);

    private static native void configMatch(long j17, int i17);

    private static native void configNotDeferrable(long j17, int i17);

    private static native void configOnDeleteAction(long j17, int i17);

    private static native void configOnUpdateAction(long j17, int i17);

    private static native void configReference(long j17, java.lang.String str);

    private static native long createCPPObj();

    public com.tencent.wcdb.winq.ForeignKey column(com.tencent.wcdb.winq.Column column) {
        configColumns(this.cppObj, com.tencent.wcdb.winq.Identifier.getCppType((com.tencent.wcdb.winq.Identifier) column), new long[]{com.tencent.wcdb.base.CppObject.get((com.tencent.wcdb.base.CppObject) column)}, null);
        return this;
    }

    public com.tencent.wcdb.winq.ForeignKey columns(com.tencent.wcdb.winq.Column... columnArr) {
        if (columnArr != null && columnArr.length != 0) {
            long[] jArr = new long[columnArr.length];
            for (int i17 = 0; i17 < columnArr.length; i17++) {
                jArr[i17] = com.tencent.wcdb.base.CppObject.get((com.tencent.wcdb.base.CppObject) columnArr[i17]);
            }
            configColumns(this.cppObj, 7, jArr, null);
        }
        return this;
    }

    public com.tencent.wcdb.winq.ForeignKey deferrable(com.tencent.wcdb.winq.ForeignKey.Initially initially) {
        configDeferrable(this.cppObj, initially.ordinal());
        return this;
    }

    @Override // com.tencent.wcdb.winq.Identifier
    public int getType() {
        return 13;
    }

    public com.tencent.wcdb.winq.ForeignKey match(com.tencent.wcdb.winq.ForeignKey.Match match) {
        configMatch(this.cppObj, match.ordinal() + 1);
        return this;
    }

    public com.tencent.wcdb.winq.ForeignKey notDeferrable(com.tencent.wcdb.winq.ForeignKey.Initially initially) {
        configNotDeferrable(this.cppObj, initially.ordinal());
        return this;
    }

    public com.tencent.wcdb.winq.ForeignKey onDelete(com.tencent.wcdb.winq.ForeignKey.Action action) {
        configOnDeleteAction(this.cppObj, action.ordinal());
        return this;
    }

    public com.tencent.wcdb.winq.ForeignKey onUpdate(com.tencent.wcdb.winq.ForeignKey.Action action) {
        configOnUpdateAction(this.cppObj, action.ordinal());
        return this;
    }

    public com.tencent.wcdb.winq.ForeignKey references(java.lang.String str) {
        configReference(this.cppObj, str);
        return this;
    }

    public com.tencent.wcdb.winq.ForeignKey column(java.lang.String str) {
        configColumns(this.cppObj, 6, null, new java.lang.String[]{str});
        return this;
    }

    public com.tencent.wcdb.winq.ForeignKey columns(java.lang.String... strArr) {
        if (strArr != null && strArr.length != 0) {
            configColumns(this.cppObj, 6, null, strArr);
        }
        return this;
    }
}
