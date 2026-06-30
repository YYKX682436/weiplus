package com.tencent.wcdb.database;

/* loaded from: classes12.dex */
public final class SQLiteStatement extends com.tencent.wcdb.database.SQLiteProgram {
    public SQLiteStatement(com.tencent.wcdb.database.SQLiteDatabase sQLiteDatabase, java.lang.String str, java.lang.Object[] objArr) {
        super(sQLiteDatabase, str, objArr, null);
    }

    public void execute() {
        execute(null);
    }

    public long executeInsert() {
        return executeInsert(null);
    }

    public int executeUpdateDelete() {
        return executeUpdateDelete(null);
    }

    public long simpleQueryForLong() {
        return simpleQueryForLong(null);
    }

    public java.lang.String simpleQueryForString() {
        return simpleQueryForString(null);
    }

    public java.lang.String toString() {
        return "SQLiteProgram: " + getSql();
    }

    public void execute(com.tencent.wcdb.support.CancellationSignal cancellationSignal) {
        acquireReference();
        try {
            try {
                getSession().execute(getSql(), getBindArgs(), getConnectionFlags(), cancellationSignal);
            } catch (com.tencent.wcdb.database.SQLiteException e17) {
                checkCorruption(e17);
                throw e17;
            }
        } finally {
            releaseReference();
        }
    }

    public long executeInsert(com.tencent.wcdb.support.CancellationSignal cancellationSignal) {
        acquireReference();
        try {
            try {
                return getSession().executeForLastInsertedRowId(getSql(), getBindArgs(), getConnectionFlags(), cancellationSignal);
            } catch (com.tencent.wcdb.database.SQLiteDatabaseCorruptException e17) {
                checkCorruption(e17);
                throw e17;
            }
        } finally {
            releaseReference();
        }
    }

    public int executeUpdateDelete(com.tencent.wcdb.support.CancellationSignal cancellationSignal) {
        acquireReference();
        try {
            try {
                return getSession().executeForChangedRowCount(getSql(), getBindArgs(), getConnectionFlags(), cancellationSignal);
            } catch (com.tencent.wcdb.database.SQLiteDatabaseCorruptException e17) {
                checkCorruption(e17);
                throw e17;
            }
        } finally {
            releaseReference();
        }
    }

    public long simpleQueryForLong(com.tencent.wcdb.support.CancellationSignal cancellationSignal) {
        acquireReference();
        try {
            try {
                return getSession().executeForLong(getSql(), getBindArgs(), getConnectionFlags(), cancellationSignal);
            } catch (com.tencent.wcdb.database.SQLiteDatabaseCorruptException e17) {
                checkCorruption(e17);
                throw e17;
            }
        } finally {
            releaseReference();
        }
    }

    public java.lang.String simpleQueryForString(com.tencent.wcdb.support.CancellationSignal cancellationSignal) {
        acquireReference();
        try {
            try {
                return getSession().executeForString(getSql(), getBindArgs(), getConnectionFlags(), cancellationSignal);
            } catch (com.tencent.wcdb.database.SQLiteDatabaseCorruptException e17) {
                checkCorruption(e17);
                throw e17;
            }
        } finally {
            releaseReference();
        }
    }
}
