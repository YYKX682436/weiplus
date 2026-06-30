package com.tencent.wcdb.core;

/* loaded from: classes12.dex */
public class Handle extends com.tencent.wcdb.core.HandleORMOperation implements java.lang.AutoCloseable {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private final com.tencent.wcdb.core.Database database;
    private com.tencent.wcdb.core.PreparedStatement mainStatement;
    private boolean writeHint;

    /* loaded from: classes12.dex */
    public static class CancellationSignal extends com.tencent.wcdb.base.CppObject {
        public CancellationSignal() {
            this.cppObj = com.tencent.wcdb.core.Handle.access$000();
        }

        public void cancel() {
            com.tencent.wcdb.core.Handle.cancelSignal(this.cppObj);
        }
    }

    public Handle(com.tencent.wcdb.core.Database database, boolean z17) {
        this.mainStatement = null;
        this.database = database;
        this.writeHint = z17;
    }

    public static /* synthetic */ long access$000() {
        return createCancellationSignal();
    }

    private static native void attachCancellationSignal(long j17, long j18);

    public static native boolean beginTransaction(long j17);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void cancelSignal(long j17);

    public static native boolean commitTransaction(long j17);

    private static native long createCancellationSignal();

    private static native void detachCancellationSignal(long j17);

    public static native boolean execute(long j17, long j18);

    public static native boolean executeSQL(long j17, java.lang.String str);

    public static native void finalizeAllStatements(long j17);

    public static native void finalizeAndReturnPreparedStatement(long j17, long j18);

    public static native int getChanges(long j17);

    public static native long getError(long j17);

    public static native long getLastInsertedRowId(long j17);

    public static native long getMainStatement(long j17);

    private static native long getNativeConnectionHandle(long j17);

    public static native long getOrCreatePreparedStatement(long j17, long j18);

    public static native long getOrCreatePreparedStatementWithSQL(long j17, java.lang.String str);

    public static native int getTotalChanges(long j17);

    public static native boolean isInTransaction(long j17);

    private int onPausableTransaction(long j17, com.tencent.wcdb.core.PausableTransaction pausableTransaction, boolean z17) {
        try {
            return pausableTransaction.insideTransaction(new com.tencent.wcdb.core.Handle(j17, this.database), z17) ? 1 : 0;
        } catch (com.tencent.wcdb.base.WCDBException unused) {
            return 2;
        }
    }

    private boolean onTransaction(long j17, com.tencent.wcdb.core.Transaction transaction) {
        try {
            return transaction.insideTransaction(new com.tencent.wcdb.core.Handle(j17, this.database));
        } catch (com.tencent.wcdb.base.WCDBException unused) {
            return false;
        }
    }

    public static native long prepareNewStatement(long j17, long j18);

    public static native long prepareNewStatementWithSQL(long j17, java.lang.String str);

    public static native void rollbackTransaction(long j17);

    public static native int tableExist(long j17, java.lang.String str);

    public long acquireNativeConnectionHandle() {
        long nativeConnectionHandle = getNativeConnectionHandle(getCppHandle());
        if (nativeConnectionHandle != 0) {
            return nativeConnectionHandle;
        }
        throw this.database.createException();
    }

    public void attachCancellationSignal(com.tencent.wcdb.core.Handle.CancellationSignal cancellationSignal) {
        attachCancellationSignal(getCppHandle(), com.tencent.wcdb.base.CppObject.get((com.tencent.wcdb.base.CppObject) cancellationSignal));
    }

    @Override // com.tencent.wcdb.core.HandleOperation
    public boolean autoInvalidateHandle() {
        return false;
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        invalidate();
    }

    public com.tencent.wcdb.base.WCDBException createException() {
        return com.tencent.wcdb.base.WCDBException.createException(getError(this.cppObj));
    }

    public void detachCancellationSignal() {
        long j17 = this.cppObj;
        if (j17 != 0) {
            detachCancellationSignal(j17);
        }
    }

    public void finalizeAllStatements() {
        long j17 = this.cppObj;
        if (j17 != 0) {
            finalizeAllStatements(j17);
        }
    }

    public void finalizeAndReturnPreparedStatement(com.tencent.wcdb.core.PreparedStatement preparedStatement) {
        long j17 = com.tencent.wcdb.base.CppObject.get((com.tencent.wcdb.base.CppObject) preparedStatement);
        long j18 = this.cppObj;
        if (j18 == 0 || j17 == 0) {
            return;
        }
        finalizeAndReturnPreparedStatement(j18, j17);
    }

    public int getChanges() {
        return getChanges(getCppHandle());
    }

    public long getCppHandle() {
        if (this.cppObj == 0) {
            long handle = com.tencent.wcdb.core.Database.getHandle(com.tencent.wcdb.base.CppObject.get((com.tencent.wcdb.base.CppObject) this.database), this.writeHint);
            this.cppObj = handle;
            if (handle == 0) {
                throw this.database.createException();
            }
        }
        return this.cppObj;
    }

    @Override // com.tencent.wcdb.core.HandleORMOperation
    public com.tencent.wcdb.core.Database getDatabase() {
        return this.database;
    }

    @Override // com.tencent.wcdb.core.HandleOperation
    public com.tencent.wcdb.core.Handle getHandle(boolean z17) {
        return this;
    }

    public long getLastInsertedRowId() {
        return getLastInsertedRowId(getCppHandle());
    }

    public com.tencent.wcdb.core.PreparedStatement getOrCreatePreparedStatement(com.tencent.wcdb.winq.Statement statement) {
        long orCreatePreparedStatement = getOrCreatePreparedStatement(getCppHandle(), com.tencent.wcdb.base.CppObject.get((com.tencent.wcdb.base.CppObject) statement));
        if (orCreatePreparedStatement != 0) {
            return new com.tencent.wcdb.core.PreparedStatement(orCreatePreparedStatement);
        }
        throw createException();
    }

    public int getTotalChanges() {
        return getTotalChanges(getCppHandle());
    }

    public void invalidate() {
        this.mainStatement = null;
        long j17 = this.cppObj;
        if (j17 != 0) {
            com.tencent.wcdb.base.CppObject.releaseCPPObject(j17);
            this.cppObj = 0L;
            this.writeHint = false;
        }
    }

    public com.tencent.wcdb.core.PreparedStatement prepareNewStatement(com.tencent.wcdb.winq.Statement statement) {
        long prepareNewStatement = prepareNewStatement(getCppHandle(), com.tencent.wcdb.base.CppObject.get((com.tencent.wcdb.base.CppObject) statement));
        if (prepareNewStatement != 0) {
            return new com.tencent.wcdb.core.PreparedStatement(prepareNewStatement);
        }
        throw createException();
    }

    public com.tencent.wcdb.core.PreparedStatement preparedWithMainStatement(com.tencent.wcdb.winq.Statement statement) {
        if (this.mainStatement == null) {
            com.tencent.wcdb.core.PreparedStatement preparedStatement = new com.tencent.wcdb.core.PreparedStatement(getMainStatement(getCppHandle()));
            this.mainStatement = preparedStatement;
            preparedStatement.autoFinalize = true;
        }
        this.mainStatement.prepare(statement);
        return this.mainStatement;
    }

    public void releaseNativeConnectionHandle(long j17) {
    }

    public native boolean runPausableTransaction(long j17, com.tencent.wcdb.core.PausableTransaction pausableTransaction);

    public native boolean runTransaction(long j17, com.tencent.wcdb.core.Transaction transaction);

    public com.tencent.wcdb.core.PreparedStatement getOrCreatePreparedStatement(java.lang.String str) {
        long orCreatePreparedStatementWithSQL = getOrCreatePreparedStatementWithSQL(getCppHandle(), str);
        if (orCreatePreparedStatementWithSQL != 0) {
            return new com.tencent.wcdb.core.PreparedStatement(orCreatePreparedStatementWithSQL);
        }
        throw createException();
    }

    public com.tencent.wcdb.core.PreparedStatement prepareNewStatement(java.lang.String str) {
        long prepareNewStatementWithSQL = prepareNewStatementWithSQL(getCppHandle(), str);
        if (prepareNewStatementWithSQL != 0) {
            return new com.tencent.wcdb.core.PreparedStatement(prepareNewStatementWithSQL);
        }
        throw createException();
    }

    public Handle(long j17, com.tencent.wcdb.core.Database database) {
        this.mainStatement = null;
        this.writeHint = false;
        this.cppObj = j17;
        this.database = database;
    }

    public com.tencent.wcdb.core.PreparedStatement preparedWithMainStatement(java.lang.String str) {
        if (this.mainStatement == null) {
            com.tencent.wcdb.core.PreparedStatement preparedStatement = new com.tencent.wcdb.core.PreparedStatement(getMainStatement(getCppHandle()));
            this.mainStatement = preparedStatement;
            preparedStatement.autoFinalize = true;
        }
        this.mainStatement.prepare(str);
        return this.mainStatement;
    }
}
