package com.tencent.wcdb.database;

/* loaded from: classes12.dex */
public final class SQLiteSession {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final int TRANSACTION_MODE_DEFERRED = 0;
    public static final int TRANSACTION_MODE_EXCLUSIVE = 2;
    public static final int TRANSACTION_MODE_IMMEDIATE = 1;
    private com.tencent.wcdb.database.SQLiteConnection mConnection;
    private int mConnectionFlags;
    private final com.tencent.wcdb.database.SQLiteConnectionPool mConnectionPool;
    private int mConnectionUseCount;
    private com.tencent.wcdb.database.SQLiteSession.Transaction mTransactionPool;
    private com.tencent.wcdb.database.SQLiteSession.Transaction mTransactionStack;

    /* loaded from: classes12.dex */
    public static final class Transaction {
        public boolean mChildFailed;
        public android.database.sqlite.SQLiteTransactionListener mListener;
        public boolean mMarkedSuccessful;
        public int mMode;
        public com.tencent.wcdb.database.SQLiteSession.Transaction mParent;

        private Transaction() {
        }
    }

    public SQLiteSession(com.tencent.wcdb.database.SQLiteConnectionPool sQLiteConnectionPool) {
        if (sQLiteConnectionPool == null) {
            throw new java.lang.IllegalArgumentException("connectionPool must not be null");
        }
        this.mConnectionPool = sQLiteConnectionPool;
    }

    private void acquireConnection(java.lang.String str, int i17, boolean z17, com.tencent.wcdb.support.CancellationSignal cancellationSignal) {
        if (this.mConnection == null) {
            com.tencent.wcdb.database.SQLiteConnection acquireConnection = this.mConnectionPool.acquireConnection(str, i17, cancellationSignal);
            this.mConnection = acquireConnection;
            this.mConnectionFlags = i17;
            acquireConnection.setAcquisitionState(true, z17);
        }
        this.mConnectionUseCount++;
    }

    /* JADX WARN: Finally extract failed */
    private void beginTransactionUnchecked(int i17, android.database.sqlite.SQLiteTransactionListener sQLiteTransactionListener, int i18, com.tencent.wcdb.support.CancellationSignal cancellationSignal) {
        if (cancellationSignal != null) {
            cancellationSignal.throwIfCanceled();
        }
        if (this.mTransactionStack == null) {
            acquireConnection(null, i18, true, cancellationSignal);
        }
        try {
            if (this.mTransactionStack == null) {
                if (i17 == 1) {
                    this.mConnection.execute("BEGIN IMMEDIATE;", null, cancellationSignal);
                } else if (i17 != 2) {
                    this.mConnection.execute("BEGIN;", null, cancellationSignal);
                } else {
                    this.mConnection.execute("BEGIN EXCLUSIVE;", null, cancellationSignal);
                }
            }
            if (sQLiteTransactionListener != null) {
                try {
                    sQLiteTransactionListener.onBegin();
                } catch (java.lang.RuntimeException e17) {
                    if (this.mTransactionStack == null) {
                        this.mConnection.execute("ROLLBACK;", null, cancellationSignal);
                    }
                    throw e17;
                }
            }
            com.tencent.wcdb.database.SQLiteSession.Transaction obtainTransaction = obtainTransaction(i17, sQLiteTransactionListener);
            obtainTransaction.mParent = this.mTransactionStack;
            this.mTransactionStack = obtainTransaction;
        } catch (java.lang.Throwable th6) {
            if (this.mTransactionStack == null) {
                releaseConnection();
            }
            throw th6;
        }
    }

    private void endTransactionUnchecked(com.tencent.wcdb.support.CancellationSignal cancellationSignal, boolean z17) {
        if (cancellationSignal != null) {
            cancellationSignal.throwIfCanceled();
        }
        com.tencent.wcdb.database.SQLiteSession.Transaction transaction = this.mTransactionStack;
        boolean z18 = false;
        boolean z19 = (transaction.mMarkedSuccessful || z17) && !transaction.mChildFailed;
        android.database.sqlite.SQLiteTransactionListener sQLiteTransactionListener = transaction.mListener;
        if (sQLiteTransactionListener != null) {
            try {
                if (z19) {
                    sQLiteTransactionListener.onCommit();
                } else {
                    sQLiteTransactionListener.onRollback();
                }
            } catch (java.lang.RuntimeException e17) {
                e = e17;
            }
        }
        z18 = z19;
        e = null;
        this.mTransactionStack = transaction.mParent;
        recycleTransaction(transaction);
        com.tencent.wcdb.database.SQLiteSession.Transaction transaction2 = this.mTransactionStack;
        if (transaction2 == null) {
            try {
                if (z18) {
                    this.mConnection.execute("COMMIT;", null, cancellationSignal);
                } else {
                    this.mConnection.execute("ROLLBACK;", null, cancellationSignal);
                }
            } finally {
                releaseConnection();
            }
        } else if (!z18) {
            transaction2.mChildFailed = true;
        }
        if (e != null) {
            throw e;
        }
    }

    private boolean executeSpecial(java.lang.String str, java.lang.Object[] objArr, int i17, com.tencent.wcdb.support.CancellationSignal cancellationSignal) {
        if (cancellationSignal != null) {
            cancellationSignal.throwIfCanceled();
        }
        int sqlStatementType = com.tencent.wcdb.DatabaseUtils.getSqlStatementType(str);
        if (sqlStatementType == 4) {
            beginTransaction(2, null, i17, cancellationSignal);
            return true;
        }
        if (sqlStatementType == 5) {
            setTransactionSuccessful();
            endTransaction(cancellationSignal);
            return true;
        }
        if (sqlStatementType != 6) {
            return false;
        }
        endTransaction(cancellationSignal);
        return true;
    }

    private com.tencent.wcdb.database.SQLiteSession.Transaction obtainTransaction(int i17, android.database.sqlite.SQLiteTransactionListener sQLiteTransactionListener) {
        com.tencent.wcdb.database.SQLiteSession.Transaction transaction = this.mTransactionPool;
        if (transaction != null) {
            this.mTransactionPool = transaction.mParent;
            transaction.mParent = null;
            transaction.mMarkedSuccessful = false;
            transaction.mChildFailed = false;
        } else {
            transaction = new com.tencent.wcdb.database.SQLiteSession.Transaction();
        }
        transaction.mMode = i17;
        transaction.mListener = sQLiteTransactionListener;
        return transaction;
    }

    private void recycleTransaction(com.tencent.wcdb.database.SQLiteSession.Transaction transaction) {
        transaction.mParent = this.mTransactionPool;
        transaction.mListener = null;
        this.mTransactionPool = transaction;
    }

    private void releaseConnection() {
        int i17 = this.mConnectionUseCount - 1;
        this.mConnectionUseCount = i17;
        if (i17 == 0) {
            try {
                this.mConnection.setAcquisitionState(false, false);
                this.mConnectionPool.releaseConnection(this.mConnection);
            } finally {
                this.mConnection = null;
            }
        }
    }

    private void throwIfNestedTransaction() {
        if (hasNestedTransaction()) {
            throw new java.lang.IllegalStateException("Cannot perform this operation because a nested transaction is in progress.");
        }
    }

    private void throwIfNoTransaction() {
        if (this.mTransactionStack == null) {
            throw new java.lang.IllegalStateException("Cannot perform this operation because there is no current transaction.");
        }
    }

    private void throwIfTransactionMarkedSuccessful() {
        com.tencent.wcdb.database.SQLiteSession.Transaction transaction = this.mTransactionStack;
        if (transaction != null && transaction.mMarkedSuccessful) {
            throw new java.lang.IllegalStateException("Cannot perform this operation because the transaction has already been marked successful.  The only thing you can do now is call endTransaction().");
        }
    }

    private boolean yieldTransactionUnchecked(long j17, com.tencent.wcdb.support.CancellationSignal cancellationSignal) {
        if (cancellationSignal != null) {
            cancellationSignal.throwIfCanceled();
        }
        if (!this.mConnectionPool.shouldYieldConnection(this.mConnection, this.mConnectionFlags)) {
            return false;
        }
        com.tencent.wcdb.database.SQLiteSession.Transaction transaction = this.mTransactionStack;
        int i17 = transaction.mMode;
        android.database.sqlite.SQLiteTransactionListener sQLiteTransactionListener = transaction.mListener;
        int i18 = this.mConnectionFlags;
        endTransactionUnchecked(cancellationSignal, true);
        if (j17 > 0) {
            try {
                java.lang.Thread.sleep(j17);
            } catch (java.lang.InterruptedException unused) {
            }
        }
        beginTransactionUnchecked(i17, sQLiteTransactionListener, i18, cancellationSignal);
        return true;
    }

    public com.tencent.wcdb.database.SQLiteConnection acquireConnectionForNativeHandle(int i17) {
        acquireConnection(null, i17, true, null);
        return this.mConnection;
    }

    public com.tencent.wcdb.database.SQLiteConnection.PreparedStatement acquirePreparedStatement(java.lang.String str, int i17, boolean z17) {
        acquireConnection(str, i17, z17, null);
        return this.mConnection.acquirePreparedStatement(str);
    }

    public void beginTransaction(int i17, android.database.sqlite.SQLiteTransactionListener sQLiteTransactionListener, int i18, com.tencent.wcdb.support.CancellationSignal cancellationSignal) {
        throwIfTransactionMarkedSuccessful();
        beginTransactionUnchecked(i17, sQLiteTransactionListener, i18, cancellationSignal);
    }

    public void endTransaction(com.tencent.wcdb.support.CancellationSignal cancellationSignal) {
        throwIfNoTransaction();
        endTransactionUnchecked(cancellationSignal, false);
    }

    public void execute(java.lang.String str, java.lang.Object[] objArr, int i17, com.tencent.wcdb.support.CancellationSignal cancellationSignal) {
        if (str == null) {
            throw new java.lang.IllegalArgumentException("sql must not be null.");
        }
        if (executeSpecial(str, objArr, i17, cancellationSignal)) {
            return;
        }
        acquireConnection(str, i17, false, cancellationSignal);
        try {
            this.mConnection.execute(str, objArr, cancellationSignal);
        } finally {
            releaseConnection();
        }
    }

    public int executeForChangedRowCount(java.lang.String str, java.lang.Object[] objArr, int i17, com.tencent.wcdb.support.CancellationSignal cancellationSignal) {
        if (str == null) {
            throw new java.lang.IllegalArgumentException("sql must not be null.");
        }
        if (executeSpecial(str, objArr, i17, cancellationSignal)) {
            return 0;
        }
        acquireConnection(str, i17, false, cancellationSignal);
        try {
            return this.mConnection.executeForChangedRowCount(str, objArr, cancellationSignal);
        } finally {
            releaseConnection();
        }
    }

    public int executeForCursorWindow(java.lang.String str, java.lang.Object[] objArr, com.tencent.wcdb.CursorWindow cursorWindow, int i17, int i18, boolean z17, int i19, com.tencent.wcdb.support.CancellationSignal cancellationSignal) {
        if (str == null) {
            throw new java.lang.IllegalArgumentException("sql must not be null.");
        }
        if (cursorWindow == null) {
            throw new java.lang.IllegalArgumentException("window must not be null.");
        }
        if (executeSpecial(str, objArr, i19, cancellationSignal)) {
            cursorWindow.clear();
            return 0;
        }
        acquireConnection(str, i19, false, cancellationSignal);
        try {
            return this.mConnection.executeForCursorWindow(str, objArr, cursorWindow, i17, i18, z17, cancellationSignal);
        } finally {
            releaseConnection();
        }
    }

    public long executeForLastInsertedRowId(java.lang.String str, java.lang.Object[] objArr, int i17, com.tencent.wcdb.support.CancellationSignal cancellationSignal) {
        if (str == null) {
            throw new java.lang.IllegalArgumentException("sql must not be null.");
        }
        if (executeSpecial(str, objArr, i17, cancellationSignal)) {
            return 0L;
        }
        acquireConnection(str, i17, false, cancellationSignal);
        try {
            return this.mConnection.executeForLastInsertedRowId(str, objArr, cancellationSignal);
        } finally {
            releaseConnection();
        }
    }

    public long executeForLong(java.lang.String str, java.lang.Object[] objArr, int i17, com.tencent.wcdb.support.CancellationSignal cancellationSignal) {
        if (str == null) {
            throw new java.lang.IllegalArgumentException("sql must not be null.");
        }
        if (executeSpecial(str, objArr, i17, cancellationSignal)) {
            return 0L;
        }
        acquireConnection(str, i17, false, cancellationSignal);
        try {
            return this.mConnection.executeForLong(str, objArr, cancellationSignal);
        } finally {
            releaseConnection();
        }
    }

    public java.lang.String executeForString(java.lang.String str, java.lang.Object[] objArr, int i17, com.tencent.wcdb.support.CancellationSignal cancellationSignal) {
        if (str == null) {
            throw new java.lang.IllegalArgumentException("sql must not be null.");
        }
        if (executeSpecial(str, objArr, i17, cancellationSignal)) {
            return null;
        }
        acquireConnection(str, i17, false, cancellationSignal);
        try {
            return this.mConnection.executeForString(str, objArr, cancellationSignal);
        } finally {
            releaseConnection();
        }
    }

    public boolean hasConnection() {
        return this.mConnection != null;
    }

    public boolean hasNestedTransaction() {
        com.tencent.wcdb.database.SQLiteSession.Transaction transaction = this.mTransactionStack;
        return (transaction == null || transaction.mParent == null) ? false : true;
    }

    public boolean hasTransaction() {
        return this.mTransactionStack != null;
    }

    public void prepare(java.lang.String str, int i17, com.tencent.wcdb.support.CancellationSignal cancellationSignal, com.tencent.wcdb.database.SQLiteStatementInfo sQLiteStatementInfo) {
        if (str == null) {
            throw new java.lang.IllegalArgumentException("sql must not be null.");
        }
        if (cancellationSignal != null) {
            cancellationSignal.throwIfCanceled();
        }
        acquireConnection(str, i17, false, cancellationSignal);
        try {
            this.mConnection.prepare(str, sQLiteStatementInfo);
        } finally {
            releaseConnection();
        }
    }

    public void releaseConnectionForNativeHandle(java.lang.Exception exc) {
        try {
            com.tencent.wcdb.database.SQLiteConnection sQLiteConnection = this.mConnection;
            if (sQLiteConnection != null) {
                sQLiteConnection.endNativeHandle(exc);
            }
        } finally {
            releaseConnection();
        }
    }

    public void releasePreparedStatement(com.tencent.wcdb.database.SQLiteConnection.PreparedStatement preparedStatement) {
        com.tencent.wcdb.database.SQLiteConnection sQLiteConnection = this.mConnection;
        if (sQLiteConnection != null) {
            sQLiteConnection.releasePreparedStatement(preparedStatement);
            releaseConnection();
        }
    }

    public void setTransactionSuccessful() {
        throwIfNoTransaction();
        throwIfTransactionMarkedSuccessful();
        this.mTransactionStack.mMarkedSuccessful = true;
    }

    public android.util.Pair<java.lang.Integer, java.lang.Integer> walCheckpoint(java.lang.String str, int i17, int i18) {
        acquireConnection(null, i18, false, null);
        try {
            return this.mConnection.walCheckpoint(str, i17);
        } finally {
            releaseConnection();
        }
    }

    public boolean yieldTransaction(long j17, boolean z17, com.tencent.wcdb.support.CancellationSignal cancellationSignal) {
        if (z17) {
            throwIfNoTransaction();
            throwIfTransactionMarkedSuccessful();
            throwIfNestedTransaction();
        } else {
            com.tencent.wcdb.database.SQLiteSession.Transaction transaction = this.mTransactionStack;
            if (transaction == null || transaction.mMarkedSuccessful || transaction.mParent != null) {
                return false;
            }
        }
        if (this.mTransactionStack.mChildFailed) {
            return false;
        }
        return yieldTransactionUnchecked(j17, cancellationSignal);
    }
}
