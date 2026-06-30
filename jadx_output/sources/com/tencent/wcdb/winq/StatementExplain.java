package com.tencent.wcdb.winq;

/* loaded from: classes12.dex */
public class StatementExplain extends com.tencent.wcdb.winq.Statement {
    public StatementExplain() {
        this.cppObj = createCppObj();
    }

    private static native long createCppObj();

    private static native void explain(long j17, long j18, boolean z17);

    public com.tencent.wcdb.winq.StatementExplain explain(com.tencent.wcdb.winq.Statement statement) {
        explain(this.cppObj, com.tencent.wcdb.base.CppObject.get((com.tencent.wcdb.base.CppObject) statement), false);
        return this;
    }

    public com.tencent.wcdb.winq.StatementExplain explainQueryPlan(com.tencent.wcdb.winq.Statement statement) {
        explain(this.cppObj, com.tencent.wcdb.base.CppObject.get((com.tencent.wcdb.base.CppObject) statement), true);
        return this;
    }

    @Override // com.tencent.wcdb.winq.Identifier
    public int getType() {
        return 56;
    }
}
