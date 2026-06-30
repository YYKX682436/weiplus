package com.tencent.wcdb.chaincall;

/* loaded from: classes12.dex */
public class Insert<T> extends com.tencent.wcdb.chaincall.ChainCall<com.tencent.wcdb.winq.StatementInsert> {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private com.tencent.wcdb.orm.Field<T>[] fields;
    private boolean hasConflictAction;
    private long lastInsertRowId;
    private java.util.Collection<T> values;

    public Insert(com.tencent.wcdb.core.Handle handle, boolean z17, boolean z18) {
        super(handle, z17, z18);
        this.hasConflictAction = false;
        this.fields = null;
        this.values = null;
        this.lastInsertRowId = 0L;
        this.statement = new com.tencent.wcdb.winq.StatementInsert();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void realExecute() {
        com.tencent.wcdb.orm.TableBinding binding = com.tencent.wcdb.orm.Field.getBinding(this.fields);
        com.tencent.wcdb.core.PreparedStatement preparedWithMainStatement = this.handle.preparedWithMainStatement(this.statement);
        this.lastInsertRowId = 0L;
        for (T t17 : this.values) {
            preparedWithMainStatement.reset();
            int i17 = 1;
            boolean z17 = !this.hasConflictAction && binding.isAutoIncrement(t17);
            for (com.tencent.wcdb.orm.Field<T> field : this.fields) {
                if (z17 && field.isAutoIncrement()) {
                    preparedWithMainStatement.bindNull(i17);
                } else {
                    binding.bindField(t17, field, i17, preparedWithMainStatement);
                }
                i17++;
            }
            preparedWithMainStatement.step();
            if (z17) {
                binding.setLastInsertRowId(t17, this.handle.getLastInsertedRowId());
            }
        }
        if (this.values.size() > 0) {
            this.lastInsertRowId = this.handle.getLastInsertedRowId();
        }
        updateChanges();
        preparedWithMainStatement.finalizeStatement();
    }

    public com.tencent.wcdb.chaincall.Insert<T> execute() {
        if (this.values.size() == 0) {
            return this;
        }
        try {
            if (this.values.size() > 1) {
                this.handle.runTransaction(new com.tencent.wcdb.core.Transaction() { // from class: com.tencent.wcdb.chaincall.Insert.1
                    @Override // com.tencent.wcdb.core.Transaction
                    public boolean insideTransaction(com.tencent.wcdb.core.Handle handle) {
                        com.tencent.wcdb.chaincall.Insert.this.realExecute();
                        return true;
                    }
                });
            } else {
                realExecute();
            }
            return this;
        } finally {
            invalidateHandle();
        }
    }

    public long getLastInsertRowId() {
        return this.lastInsertRowId;
    }

    public com.tencent.wcdb.chaincall.Insert<T> intoTable(java.lang.String str) {
        ((com.tencent.wcdb.winq.StatementInsert) this.statement).insertInto(str);
        return this;
    }

    @java.lang.SafeVarargs
    public final com.tencent.wcdb.chaincall.Insert<T> onFields(com.tencent.wcdb.orm.Field<T>... fieldArr) {
        this.fields = fieldArr;
        ((com.tencent.wcdb.winq.StatementInsert) this.statement).columns(fieldArr).valuesWithBindParameters(fieldArr.length);
        return this;
    }

    public com.tencent.wcdb.chaincall.Insert<T> orIgnore() {
        this.hasConflictAction = true;
        ((com.tencent.wcdb.winq.StatementInsert) this.statement).orIgnore();
        return this;
    }

    public com.tencent.wcdb.chaincall.Insert<T> orReplace() {
        this.hasConflictAction = true;
        ((com.tencent.wcdb.winq.StatementInsert) this.statement).orReplace();
        return this;
    }

    public com.tencent.wcdb.chaincall.Insert<T> value(T t17) {
        this.values = java.util.Collections.singleton(t17);
        return this;
    }

    public com.tencent.wcdb.chaincall.Insert<T> values(java.util.Collection<T> collection) {
        this.values = collection;
        return this;
    }
}
