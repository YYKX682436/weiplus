package com.tencent.wcdb.compat;

/* loaded from: classes12.dex */
public final class SQLiteStatement extends android.database.sqlite.SQLiteClosable {
    private final java.util.ArrayList<java.lang.Object> mBindArgs;
    private final com.tencent.wcdb.core.Database mDB;
    private final java.lang.String mSql;

    public SQLiteStatement(com.tencent.wcdb.core.Database database, java.lang.String str, java.lang.Object[] objArr) {
        java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
        this.mBindArgs = arrayList;
        this.mDB = database;
        this.mSql = str;
        if (objArr != null) {
            arrayList.addAll(java.util.Arrays.asList(objArr));
        }
    }

    private void bind(int i17, java.lang.Object obj) {
        if (i17 < 1) {
            throw new java.lang.IllegalArgumentException("Cannot bind argument at index " + i17 + " because the index is out of range.");
        }
        if (this.mBindArgs.size() < i17) {
            this.mBindArgs.ensureCapacity(i17);
            do {
                this.mBindArgs.add(null);
            } while (this.mBindArgs.size() < i17);
        }
        this.mBindArgs.set(i17 - 1, obj);
    }

    private void execute(com.tencent.wcdb.core.Handle handle, android.os.CancellationSignal cancellationSignal) {
        com.tencent.wcdb.compat.DatabaseUtils.bindCancellationSignal(handle, cancellationSignal);
        com.tencent.wcdb.core.PreparedStatement preparedStatement = null;
        try {
            preparedStatement = handle.preparedWithMainStatement(this.mSql);
            java.util.Iterator<java.lang.Object> it = this.mBindArgs.iterator();
            int i17 = 1;
            while (it.hasNext()) {
                preparedStatement.bindValue(new com.tencent.wcdb.base.Value(it.next()), i17);
                i17++;
            }
            do {
                preparedStatement.step();
            } while (!preparedStatement.isDone());
            preparedStatement.finalizeStatement();
        } catch (java.lang.Throwable th6) {
            if (preparedStatement != null) {
                preparedStatement.finalizeStatement();
            }
            throw th6;
        }
    }

    private com.tencent.wcdb.base.Value executeForValue(com.tencent.wcdb.core.Handle handle, android.os.CancellationSignal cancellationSignal) {
        com.tencent.wcdb.compat.DatabaseUtils.bindCancellationSignal(handle, cancellationSignal);
        com.tencent.wcdb.core.PreparedStatement preparedStatement = null;
        try {
            com.tencent.wcdb.core.PreparedStatement preparedWithMainStatement = handle.preparedWithMainStatement(this.mSql);
            java.util.Iterator<java.lang.Object> it = this.mBindArgs.iterator();
            int i17 = 1;
            while (it.hasNext()) {
                preparedWithMainStatement.bindValue(new com.tencent.wcdb.base.Value(it.next()), i17);
                i17++;
            }
            preparedWithMainStatement.step();
            if (preparedWithMainStatement.isDone()) {
                throw new android.database.sqlite.SQLiteDoneException();
            }
            com.tencent.wcdb.base.Value value = preparedWithMainStatement.getValue(0);
            preparedWithMainStatement.finalizeStatement();
            return value;
        } catch (java.lang.Throwable th6) {
            if (0 != 0) {
                preparedStatement.finalizeStatement();
            }
            throw th6;
        }
    }

    public void bindAllArgs(java.lang.Object[] objArr) {
        if (objArr == null) {
            return;
        }
        int length = objArr.length;
        if (this.mBindArgs.size() < length) {
            this.mBindArgs.ensureCapacity(length);
            do {
                this.mBindArgs.add(null);
            } while (this.mBindArgs.size() < length);
        }
        for (int i17 = 0; i17 < length; i17++) {
            this.mBindArgs.set(i17, objArr[i17]);
        }
    }

    public void bindBlob(int i17, byte[] bArr) {
        if (bArr != null) {
            bind(i17, bArr);
            return;
        }
        throw new java.lang.IllegalArgumentException("the bind value at index " + i17 + " is null");
    }

    public void bindDouble(int i17, double d17) {
        bind(i17, java.lang.Double.valueOf(d17));
    }

    public void bindLong(int i17, long j17) {
        bind(i17, java.lang.Long.valueOf(j17));
    }

    public void bindNull(int i17) {
        bind(i17, null);
    }

    public void bindString(int i17, java.lang.String str) {
        if (str != null) {
            bind(i17, str);
            return;
        }
        throw new java.lang.IllegalArgumentException("the bind value at index " + i17 + " is null");
    }

    public void clearBindings() {
        this.mBindArgs.clear();
    }

    public long executeInsert() {
        return executeInsert(null);
    }

    public int executeUpdateDelete() {
        return executeUpdateDelete(null);
    }

    @Override // android.database.sqlite.SQLiteClosable
    public void onAllReferencesReleased() {
        clearBindings();
    }

    public long simpleQueryForLong() {
        return simpleQueryForLong(null);
    }

    public java.lang.String simpleQueryForString() {
        return simpleQueryForString(null);
    }

    public java.lang.String toString() {
        return "SQLiteProgram: " + this.mSql;
    }

    public long executeInsert(android.os.CancellationSignal cancellationSignal) {
        com.tencent.wcdb.core.Handle handle = this.mDB.getHandle(true);
        try {
            execute(handle, cancellationSignal);
            long lastInsertedRowId = handle.getLastInsertedRowId();
            handle.close();
            return lastInsertedRowId;
        } catch (java.lang.Throwable th6) {
            if (handle != null) {
                try {
                    handle.close();
                } catch (java.lang.Throwable th7) {
                    th6.addSuppressed(th7);
                }
            }
            throw th6;
        }
    }

    public int executeUpdateDelete(android.os.CancellationSignal cancellationSignal) {
        com.tencent.wcdb.core.Handle handle = this.mDB.getHandle(true);
        try {
            execute(handle, cancellationSignal);
            int changes = handle.getChanges();
            handle.close();
            return changes;
        } catch (java.lang.Throwable th6) {
            if (handle != null) {
                try {
                    handle.close();
                } catch (java.lang.Throwable th7) {
                    th6.addSuppressed(th7);
                }
            }
            throw th6;
        }
    }

    public long simpleQueryForLong(android.os.CancellationSignal cancellationSignal) {
        com.tencent.wcdb.core.Handle handle = this.mDB.getHandle(false);
        try {
            long j17 = executeForValue(handle, cancellationSignal).getLong();
            if (handle != null) {
                handle.close();
            }
            return j17;
        } catch (java.lang.Throwable th6) {
            if (handle != null) {
                try {
                    handle.close();
                } catch (java.lang.Throwable th7) {
                    th6.addSuppressed(th7);
                }
            }
            throw th6;
        }
    }

    public java.lang.String simpleQueryForString(android.os.CancellationSignal cancellationSignal) {
        com.tencent.wcdb.core.Handle handle = this.mDB.getHandle(false);
        try {
            java.lang.String text = executeForValue(handle, cancellationSignal).getText();
            if (handle != null) {
                handle.close();
            }
            return text;
        } catch (java.lang.Throwable th6) {
            if (handle != null) {
                try {
                    handle.close();
                } catch (java.lang.Throwable th7) {
                    th6.addSuppressed(th7);
                }
            }
            throw th6;
        }
    }

    public int execute() {
        return execute(null);
    }

    public int execute(android.os.CancellationSignal cancellationSignal) {
        com.tencent.wcdb.core.Handle handle = this.mDB.getHandle((android.text.TextUtils.isEmpty(this.mSql) || this.mSql.toLowerCase().startsWith("select")) ? false : true);
        try {
            execute(handle, cancellationSignal);
            int changes = handle.getChanges();
            handle.close();
            return changes;
        } catch (java.lang.Throwable th6) {
            if (handle != null) {
                try {
                    handle.close();
                } catch (java.lang.Throwable th7) {
                    th6.addSuppressed(th7);
                }
            }
            throw th6;
        }
    }
}
