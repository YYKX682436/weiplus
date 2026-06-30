package com.tencent.wcdb.chaincall;

/* loaded from: classes12.dex */
public class Select<T> extends com.tencent.wcdb.chaincall.ChainCall<com.tencent.wcdb.winq.StatementSelect> {
    private com.tencent.wcdb.orm.Field<T>[] fields;

    public Select(com.tencent.wcdb.core.Handle handle, boolean z17, boolean z18) {
        super(handle, z17, z18);
        this.fields = null;
        this.statement = new com.tencent.wcdb.winq.StatementSelect();
    }

    private com.tencent.wcdb.core.PreparedStatement prepareStatement() {
        return this.handle.preparedWithMainStatement(this.statement);
    }

    public java.util.List<T> allObjects() {
        return (java.util.List<T>) allObjects(com.tencent.wcdb.orm.Field.getBindClass(this.fields));
    }

    public T firstObject() {
        return (T) firstObject(com.tencent.wcdb.orm.Field.getBindClass(this.fields));
    }

    public com.tencent.wcdb.chaincall.Select<T> from(java.lang.String str) {
        ((com.tencent.wcdb.winq.StatementSelect) this.statement).from(str);
        return this;
    }

    public com.tencent.wcdb.chaincall.Select<T> limit(long j17) {
        ((com.tencent.wcdb.winq.StatementSelect) this.statement).limit(j17);
        return this;
    }

    public com.tencent.wcdb.chaincall.Select<T> offset(long j17) {
        ((com.tencent.wcdb.winq.StatementSelect) this.statement).offset(j17);
        return this;
    }

    public com.tencent.wcdb.chaincall.Select<T> orderBy(com.tencent.wcdb.winq.OrderingTerm orderingTerm) {
        ((com.tencent.wcdb.winq.StatementSelect) this.statement).orderBy(orderingTerm);
        return this;
    }

    @java.lang.SafeVarargs
    public final com.tencent.wcdb.chaincall.Select<T> select(com.tencent.wcdb.orm.Field<T>... fieldArr) {
        this.fields = fieldArr;
        ((com.tencent.wcdb.winq.StatementSelect) this.statement).select((com.tencent.wcdb.winq.ResultColumnConvertible[]) fieldArr);
        return this;
    }

    public com.tencent.wcdb.chaincall.Select<T> where(com.tencent.wcdb.winq.Expression expression) {
        ((com.tencent.wcdb.winq.StatementSelect) this.statement).where(expression);
        return this;
    }

    public <R extends T> java.util.List<R> allObjects(java.lang.Class<R> cls) {
        com.tencent.wcdb.core.PreparedStatement preparedStatement;
        try {
            preparedStatement = prepareStatement();
            try {
                java.util.List<R> allObjects = preparedStatement.getAllObjects(this.fields, cls);
                preparedStatement.finalizeStatement();
                invalidateHandle();
                return allObjects;
            } catch (java.lang.Throwable th6) {
                th = th6;
                if (preparedStatement != null) {
                    preparedStatement.finalizeStatement();
                }
                invalidateHandle();
                throw th;
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
            preparedStatement = null;
        }
    }

    public <R extends T> R firstObject(java.lang.Class<R> cls) {
        com.tencent.wcdb.core.PreparedStatement preparedStatement = (R) null;
        try {
            com.tencent.wcdb.core.PreparedStatement prepareStatement = prepareStatement();
            try {
                prepareStatement.step();
                java.lang.Object obj = preparedStatement;
                if (!prepareStatement.isDone()) {
                    obj = (R) prepareStatement.getOneObject(this.fields, cls);
                }
                prepareStatement.finalizeStatement();
                invalidateHandle();
                return (R) obj;
            } catch (java.lang.Throwable th6) {
                th = th6;
                preparedStatement = (R) prepareStatement;
                if (preparedStatement != null) {
                    preparedStatement.finalizeStatement();
                }
                invalidateHandle();
                throw th;
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
        }
    }

    public com.tencent.wcdb.chaincall.Select<T> limit(com.tencent.wcdb.winq.ExpressionConvertible expressionConvertible) {
        ((com.tencent.wcdb.winq.StatementSelect) this.statement).limit(expressionConvertible);
        return this;
    }

    public com.tencent.wcdb.chaincall.Select<T> offset(com.tencent.wcdb.winq.ExpressionConvertible expressionConvertible) {
        ((com.tencent.wcdb.winq.StatementSelect) this.statement).offset(expressionConvertible);
        return this;
    }

    public com.tencent.wcdb.chaincall.Select<T> orderBy(com.tencent.wcdb.winq.OrderingTerm... orderingTermArr) {
        ((com.tencent.wcdb.winq.StatementSelect) this.statement).orderBy(orderingTermArr);
        return this;
    }
}
