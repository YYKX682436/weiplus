package com.tencent.wcdb.chaincall;

/* loaded from: classes12.dex */
public class Update<T> extends com.tencent.wcdb.chaincall.ChainCall<com.tencent.wcdb.winq.StatementUpdate> {
    private com.tencent.wcdb.orm.Field<T>[] fields;
    private T object;
    private com.tencent.wcdb.base.Value[] row;

    public Update(com.tencent.wcdb.core.Handle handle, boolean z17, boolean z18) {
        super(handle, z17, z18);
        this.fields = null;
        this.object = null;
        this.row = null;
        this.statement = new com.tencent.wcdb.winq.StatementUpdate();
    }

    public com.tencent.wcdb.chaincall.Update<T> execute() {
        com.tencent.wcdb.orm.Field.getBinding(this.fields);
        com.tencent.wcdb.core.PreparedStatement preparedStatement = null;
        try {
            preparedStatement = this.handle.preparedWithMainStatement(this.statement);
            T t17 = this.object;
            if (t17 != null) {
                preparedStatement.bindObject((com.tencent.wcdb.core.PreparedStatement) t17, (com.tencent.wcdb.orm.Field<com.tencent.wcdb.core.PreparedStatement>[]) this.fields);
            } else {
                com.tencent.wcdb.base.Value[] valueArr = this.row;
                if (valueArr != null) {
                    preparedStatement.bindRow(valueArr);
                }
            }
            preparedStatement.step();
            updateChanges();
            preparedStatement.finalizeStatement();
            invalidateHandle();
            return this;
        } catch (java.lang.Throwable th6) {
            if (preparedStatement != null) {
                preparedStatement.finalizeStatement();
            }
            invalidateHandle();
            throw th6;
        }
    }

    public com.tencent.wcdb.chaincall.Update<T> limit(short s17) {
        ((com.tencent.wcdb.winq.StatementUpdate) this.statement).limit(s17);
        return this;
    }

    public com.tencent.wcdb.chaincall.Update<T> offset(short s17) {
        ((com.tencent.wcdb.winq.StatementUpdate) this.statement).offset(s17);
        return this;
    }

    public com.tencent.wcdb.chaincall.Update<T> orderBy(com.tencent.wcdb.winq.OrderingTerm orderingTerm) {
        ((com.tencent.wcdb.winq.StatementUpdate) this.statement).orderBy(orderingTerm);
        return this;
    }

    @java.lang.SafeVarargs
    public final com.tencent.wcdb.chaincall.Update<T> set(com.tencent.wcdb.orm.Field<T>... fieldArr) {
        this.fields = fieldArr;
        ((com.tencent.wcdb.winq.StatementUpdate) this.statement).setColumnsToBindParameters(fieldArr);
        return this;
    }

    public com.tencent.wcdb.chaincall.Update<T> table(java.lang.String str) {
        ((com.tencent.wcdb.winq.StatementUpdate) this.statement).update(str);
        return this;
    }

    public com.tencent.wcdb.chaincall.Update<T> toObject(T t17) {
        this.object = t17;
        return this;
    }

    public com.tencent.wcdb.chaincall.Update<T> toRow(com.tencent.wcdb.base.Value... valueArr) {
        this.row = valueArr;
        return this;
    }

    public com.tencent.wcdb.chaincall.Update<T> toValue(com.tencent.wcdb.base.Value value) {
        return toRow(value);
    }

    public com.tencent.wcdb.chaincall.Update<T> where(com.tencent.wcdb.winq.Expression expression) {
        ((com.tencent.wcdb.winq.StatementUpdate) this.statement).where(expression);
        return this;
    }

    public com.tencent.wcdb.chaincall.Update<T> limit(int i17) {
        ((com.tencent.wcdb.winq.StatementUpdate) this.statement).limit(i17);
        return this;
    }

    public com.tencent.wcdb.chaincall.Update<T> offset(int i17) {
        ((com.tencent.wcdb.winq.StatementUpdate) this.statement).offset(i17);
        return this;
    }

    public com.tencent.wcdb.chaincall.Update<T> orderBy(com.tencent.wcdb.winq.OrderingTerm... orderingTermArr) {
        ((com.tencent.wcdb.winq.StatementUpdate) this.statement).orderBy(orderingTermArr);
        return this;
    }

    public com.tencent.wcdb.chaincall.Update<T> toValue(byte b17) {
        return toRow(new com.tencent.wcdb.base.Value(b17));
    }

    public com.tencent.wcdb.chaincall.Update<T> limit(long j17) {
        ((com.tencent.wcdb.winq.StatementUpdate) this.statement).limit(j17);
        return this;
    }

    public com.tencent.wcdb.chaincall.Update<T> offset(long j17) {
        ((com.tencent.wcdb.winq.StatementUpdate) this.statement).offset(j17);
        return this;
    }

    public com.tencent.wcdb.chaincall.Update<T> toValue(short s17) {
        return toRow(new com.tencent.wcdb.base.Value((int) s17));
    }

    public com.tencent.wcdb.chaincall.Update<T> limit(com.tencent.wcdb.winq.ExpressionConvertible expressionConvertible) {
        ((com.tencent.wcdb.winq.StatementUpdate) this.statement).limit(expressionConvertible);
        return this;
    }

    public com.tencent.wcdb.chaincall.Update<T> offset(com.tencent.wcdb.winq.ExpressionConvertible expressionConvertible) {
        ((com.tencent.wcdb.winq.StatementUpdate) this.statement).offset(expressionConvertible);
        return this;
    }

    public com.tencent.wcdb.chaincall.Update<T> toValue(int i17) {
        return toRow(new com.tencent.wcdb.base.Value(i17));
    }

    public com.tencent.wcdb.chaincall.Update<T> toValue(long j17) {
        return toRow(new com.tencent.wcdb.base.Value(j17));
    }

    public com.tencent.wcdb.chaincall.Update<T> toValue(java.lang.String str) {
        return toRow(new com.tencent.wcdb.base.Value(str));
    }

    public com.tencent.wcdb.chaincall.Update<T> toValue(byte[] bArr) {
        return toRow(new com.tencent.wcdb.base.Value(bArr));
    }

    public com.tencent.wcdb.chaincall.Update<T> toValue(float f17) {
        return toRow(new com.tencent.wcdb.base.Value(f17));
    }

    public com.tencent.wcdb.chaincall.Update<T> toValue(double d17) {
        return toRow(new com.tencent.wcdb.base.Value(d17));
    }
}
