package com.tencent.wcdb.chaincall;

/* loaded from: classes12.dex */
public class Delete extends com.tencent.wcdb.chaincall.ChainCall<com.tencent.wcdb.winq.StatementDelete> {
    public Delete(com.tencent.wcdb.core.Handle handle, boolean z17, boolean z18) {
        super(handle, z17, z18);
        this.statement = new com.tencent.wcdb.winq.StatementDelete();
    }

    public com.tencent.wcdb.chaincall.Delete execute() {
        try {
            this.handle.execute(this.statement);
            return this;
        } finally {
            updateChanges();
            invalidateHandle();
        }
    }

    public com.tencent.wcdb.chaincall.Delete fromTable(java.lang.String str) {
        ((com.tencent.wcdb.winq.StatementDelete) this.statement).deleteFrom(str);
        return this;
    }

    public com.tencent.wcdb.chaincall.Delete limit(long j17) {
        ((com.tencent.wcdb.winq.StatementDelete) this.statement).limit(j17);
        return this;
    }

    public com.tencent.wcdb.chaincall.Delete offset(long j17) {
        ((com.tencent.wcdb.winq.StatementDelete) this.statement).offset(j17);
        return this;
    }

    public com.tencent.wcdb.chaincall.Delete orderBy(com.tencent.wcdb.winq.OrderingTerm... orderingTermArr) {
        ((com.tencent.wcdb.winq.StatementDelete) this.statement).orderBy(orderingTermArr);
        return this;
    }

    public com.tencent.wcdb.chaincall.Delete where(com.tencent.wcdb.winq.Expression expression) {
        ((com.tencent.wcdb.winq.StatementDelete) this.statement).where(expression);
        return this;
    }

    public com.tencent.wcdb.chaincall.Delete limit(com.tencent.wcdb.winq.ExpressionConvertible expressionConvertible) {
        ((com.tencent.wcdb.winq.StatementDelete) this.statement).limit(expressionConvertible);
        return this;
    }

    public com.tencent.wcdb.chaincall.Delete offset(com.tencent.wcdb.winq.ExpressionConvertible expressionConvertible) {
        ((com.tencent.wcdb.winq.StatementDelete) this.statement).offset(expressionConvertible);
        return this;
    }
}
