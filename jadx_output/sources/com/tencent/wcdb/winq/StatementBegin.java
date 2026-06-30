package com.tencent.wcdb.winq;

/* loaded from: classes12.dex */
public class StatementBegin extends com.tencent.wcdb.winq.Statement {

    /* loaded from: classes3.dex */
    public static class TransactionType {
        static final int Deferred = 0;
        static final int Exclusive = 2;
        static final int Immediate = 1;
    }

    public StatementBegin() {
        this.cppObj = createCppObj(0);
    }

    public static com.tencent.wcdb.winq.StatementBegin beginDeferred() {
        return new com.tencent.wcdb.winq.StatementBegin(0);
    }

    public static com.tencent.wcdb.winq.StatementBegin beginExclusive() {
        return new com.tencent.wcdb.winq.StatementBegin(2);
    }

    public static com.tencent.wcdb.winq.StatementBegin beginImmediate() {
        return new com.tencent.wcdb.winq.StatementBegin(1);
    }

    private static native long createCppObj(int i17);

    @Override // com.tencent.wcdb.winq.Identifier
    public int getType() {
        return 35;
    }

    public StatementBegin(int i17) {
        this.cppObj = createCppObj(i17);
    }
}
