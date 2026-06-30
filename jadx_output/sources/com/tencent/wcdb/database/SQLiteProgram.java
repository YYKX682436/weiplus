package com.tencent.wcdb.database;

/* loaded from: classes12.dex */
public abstract class SQLiteProgram extends com.tencent.wcdb.database.SQLiteClosable {
    private static final java.lang.String[] EMPTY_STRING_ARRAY = new java.lang.String[0];
    private static final java.lang.String TAG = "WCDB.SQLiteProgram";
    private final java.lang.Object[] mBindArgs;
    private com.tencent.wcdb.database.SQLiteSession mBoundSession;
    private final java.lang.String[] mColumnNames;
    private final com.tencent.wcdb.database.SQLiteDatabase mDatabase;
    private final int mNumParameters;
    protected com.tencent.wcdb.database.SQLiteConnection.PreparedStatement mPreparedStatement;
    private final boolean mReadOnly;
    private final java.lang.String mSql;

    public SQLiteProgram(com.tencent.wcdb.database.SQLiteDatabase sQLiteDatabase, java.lang.String str, java.lang.Object[] objArr, com.tencent.wcdb.support.CancellationSignal cancellationSignal) {
        this.mDatabase = sQLiteDatabase;
        java.lang.String trim = str.trim();
        this.mSql = trim;
        int sqlStatementType = com.tencent.wcdb.DatabaseUtils.getSqlStatementType(trim);
        if (sqlStatementType == 4 || sqlStatementType == 5 || sqlStatementType == 6) {
            this.mReadOnly = false;
            this.mColumnNames = EMPTY_STRING_ARRAY;
            this.mNumParameters = 0;
        } else {
            boolean z17 = sqlStatementType == 1;
            com.tencent.wcdb.database.SQLiteStatementInfo sQLiteStatementInfo = new com.tencent.wcdb.database.SQLiteStatementInfo();
            sQLiteDatabase.getThreadSession().prepare(trim, sQLiteDatabase.getThreadDefaultConnectionFlags(z17), cancellationSignal, sQLiteStatementInfo);
            this.mReadOnly = sqlStatementType != 8 && sQLiteStatementInfo.readOnly;
            this.mColumnNames = sQLiteStatementInfo.columnNames;
            this.mNumParameters = sQLiteStatementInfo.numParameters;
        }
        if (objArr != null && objArr.length > this.mNumParameters) {
            throw new java.lang.IllegalArgumentException("Too many bind arguments.  " + objArr.length + " arguments were provided but the statement needs " + this.mNumParameters + " arguments.");
        }
        int i17 = this.mNumParameters;
        if (i17 != 0) {
            java.lang.Object[] objArr2 = new java.lang.Object[i17];
            this.mBindArgs = objArr2;
            if (objArr != null) {
                java.lang.System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
            }
        } else {
            this.mBindArgs = null;
        }
        this.mPreparedStatement = null;
        this.mBoundSession = null;
    }

    private void bind(int i17, java.lang.Object obj) {
        if (i17 >= 1 && i17 <= this.mNumParameters) {
            this.mBindArgs[i17 - 1] = obj;
            return;
        }
        throw new java.lang.IllegalArgumentException("Cannot bind argument at index " + i17 + " because the index is out of range.  The statement has " + this.mNumParameters + " parameters.");
    }

    public synchronized boolean acquirePreparedStatement(boolean z17) {
        com.tencent.wcdb.database.SQLiteSession threadSession = this.mDatabase.getThreadSession();
        com.tencent.wcdb.database.SQLiteSession sQLiteSession = this.mBoundSession;
        if (threadSession == sQLiteSession) {
            return false;
        }
        if (sQLiteSession != null) {
            throw new java.lang.IllegalStateException("SQLiteProgram has bound to another thread.");
        }
        com.tencent.wcdb.database.SQLiteConnection.PreparedStatement acquirePreparedStatement = threadSession.acquirePreparedStatement(this.mSql, this.mDatabase.getThreadDefaultConnectionFlags(this.mReadOnly), z17);
        this.mPreparedStatement = acquirePreparedStatement;
        acquirePreparedStatement.bindArguments(this.mBindArgs);
        this.mBoundSession = threadSession;
        return true;
    }

    public void bindAllArgs(java.lang.Object[] objArr) {
        for (int length = objArr.length; length != 0; length--) {
            bind(length, objArr[length - 1]);
        }
    }

    public void bindAllArgsAsStrings(java.lang.String[] strArr) {
        if (strArr != null) {
            for (int length = strArr.length; length != 0; length--) {
                bindString(length, strArr[length - 1]);
            }
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

    public final void checkCorruption(com.tencent.wcdb.database.SQLiteException sQLiteException) {
        boolean z17 = true;
        if (!(sQLiteException instanceof com.tencent.wcdb.database.SQLiteDatabaseCorruptException) && (!(sQLiteException instanceof com.tencent.wcdb.database.SQLiteFullException) || !this.mReadOnly)) {
            z17 = false;
        }
        if (z17) {
            com.tencent.wcdb.database.SQLiteDebug.collectLastIOTraceStats(this.mDatabase);
            com.tencent.wcdb.database.SQLiteDebug.setLastCorruptionException(sQLiteException);
            this.mDatabase.onCorruption();
        }
    }

    public void clearBindings() {
        java.lang.Object[] objArr = this.mBindArgs;
        if (objArr != null) {
            java.util.Arrays.fill(objArr, (java.lang.Object) null);
        }
    }

    public void finalize() {
        synchronized (this) {
            if (this.mBoundSession != null || this.mPreparedStatement != null) {
                throw new com.tencent.wcdb.database.SQLiteMisuseException("Acquired prepared statement is not released.");
            }
        }
        super.finalize();
    }

    public final java.lang.Object[] getBindArgs() {
        return this.mBindArgs;
    }

    public final java.lang.String[] getColumnNames() {
        return this.mColumnNames;
    }

    public final int getConnectionFlags() {
        return this.mDatabase.getThreadDefaultConnectionFlags(this.mReadOnly);
    }

    public final com.tencent.wcdb.database.SQLiteDatabase getDatabase() {
        return this.mDatabase;
    }

    public final com.tencent.wcdb.database.SQLiteSession getSession() {
        return this.mDatabase.getThreadSession();
    }

    public final java.lang.String getSql() {
        return this.mSql;
    }

    @java.lang.Deprecated
    public final int getUniqueId() {
        return -1;
    }

    @Override // com.tencent.wcdb.database.SQLiteClosable
    public void onAllReferencesReleased() {
        releasePreparedStatement();
        clearBindings();
    }

    public synchronized void releasePreparedStatement() {
        com.tencent.wcdb.database.SQLiteSession sQLiteSession = this.mBoundSession;
        if (sQLiteSession == null && this.mPreparedStatement == null) {
            return;
        }
        if (sQLiteSession == null || this.mPreparedStatement == null) {
            throw new java.lang.IllegalStateException("Internal state error.");
        }
        if (sQLiteSession != this.mDatabase.getThreadSession()) {
            throw new java.lang.IllegalStateException("SQLiteProgram has bound to another thread.");
        }
        this.mBoundSession.releasePreparedStatement(this.mPreparedStatement);
        this.mPreparedStatement = null;
        this.mBoundSession = null;
    }
}
