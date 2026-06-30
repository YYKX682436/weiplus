package com.tencent.wcdb.winq;

/* loaded from: classes12.dex */
public class StatementCommit extends com.tencent.wcdb.winq.Statement {
    public StatementCommit() {
        this.cppObj = createCppObj();
    }

    private static native long createCppObj();

    @Override // com.tencent.wcdb.winq.Identifier
    public int getType() {
        return 35;
    }
}
