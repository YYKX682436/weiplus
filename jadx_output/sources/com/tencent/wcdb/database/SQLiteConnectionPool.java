package com.tencent.wcdb.database;

/* loaded from: classes12.dex */
public final class SQLiteConnectionPool implements java.io.Closeable {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final int CONNECTION_FLAG_INTERACTIVE = 4;
    public static final int CONNECTION_FLAG_PRIMARY_CONNECTION_AFFINITY = 2;
    public static final int CONNECTION_FLAG_READ_ONLY = 1;
    private static final long CONNECTION_POOL_BUSY_MILLIS = 3000;
    private static final int OPEN_FLAG_REOPEN_MASK = 268435473;
    private static final java.lang.String TAG = "WCDB.SQLiteConnectionPool";
    private com.tencent.wcdb.database.SQLiteConnection mAvailablePrimaryConnection;
    private volatile com.tencent.wcdb.database.SQLiteChangeListener mChangeListener;
    private volatile com.tencent.wcdb.database.SQLiteCheckpointListener mCheckpointListener;
    private com.tencent.wcdb.database.SQLiteCipherSpec mCipher;
    private final com.tencent.wcdb.database.SQLiteDatabaseConfiguration mConfiguration;
    private com.tencent.wcdb.database.SQLiteConnectionPool.ConnectionWaiter mConnectionWaiterPool;
    private com.tencent.wcdb.database.SQLiteConnectionPool.ConnectionWaiter mConnectionWaiterQueue;
    private final java.lang.ref.WeakReference<com.tencent.wcdb.database.SQLiteDatabase> mDB;
    private boolean mIsOpen;
    private int mMaxConnectionPoolSize;
    private int mNextConnectionId;
    private byte[] mPassword;
    private volatile com.tencent.wcdb.database.SQLiteTrace mTraceCallback;
    private final java.lang.Object mLock = new java.lang.Object();
    private final java.util.concurrent.atomic.AtomicBoolean mConnectionLeaked = new java.util.concurrent.atomic.AtomicBoolean();
    private final java.util.ArrayList<com.tencent.wcdb.database.SQLiteConnection> mAvailableNonPrimaryConnections = new java.util.ArrayList<>();
    private final java.util.WeakHashMap<com.tencent.wcdb.database.SQLiteConnection, com.tencent.wcdb.database.SQLiteConnectionPool.AcquiredConnectionStatus> mAcquiredConnections = new java.util.WeakHashMap<>();

    /* loaded from: classes6.dex */
    public enum AcquiredConnectionStatus {
        NORMAL,
        RECONFIGURE,
        DISCARD
    }

    /* loaded from: classes12.dex */
    public static class ConnectionPoolBusyInfo {
        int activeConnections;
        java.util.ArrayList<java.lang.String> activeOperationDescriptions;
        java.util.ArrayList<com.tencent.wcdb.database.SQLiteTrace.TraceInfo<java.lang.String>> activeSql;
        java.util.ArrayList<com.tencent.wcdb.database.SQLiteTrace.TraceInfo<java.lang.StackTraceElement[]>> activeTransactions;
        int availableConnections;
        int idleConnections;
        java.lang.String label;

        private ConnectionPoolBusyInfo() {
            this.activeOperationDescriptions = new java.util.ArrayList<>();
            this.activeSql = new java.util.ArrayList<>();
            this.activeTransactions = new java.util.ArrayList<>();
        }
    }

    /* loaded from: classes12.dex */
    public static final class ConnectionWaiter {
        public com.tencent.wcdb.database.SQLiteConnection mAssignedConnection;
        public int mConnectionFlags;
        public java.lang.RuntimeException mException;
        public com.tencent.wcdb.database.SQLiteConnectionPool.ConnectionWaiter mNext;
        public int mNonce;
        public int mPriority;
        public java.lang.String mSql;
        public long mStartTime;
        public java.lang.Thread mThread;
        public boolean mWantPrimaryConnection;

        private ConnectionWaiter() {
        }
    }

    private SQLiteConnectionPool(com.tencent.wcdb.database.SQLiteDatabase sQLiteDatabase, com.tencent.wcdb.database.SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration, int i17) {
        this.mDB = new java.lang.ref.WeakReference<>(sQLiteDatabase);
        this.mConfiguration = new com.tencent.wcdb.database.SQLiteDatabaseConfiguration(sQLiteDatabaseConfiguration);
        setMaxConnectionPoolSizeLocked(i17);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cancelConnectionWaiterLocked(com.tencent.wcdb.database.SQLiteConnectionPool.ConnectionWaiter connectionWaiter) {
        if (connectionWaiter.mAssignedConnection == null && connectionWaiter.mException == null) {
            com.tencent.wcdb.database.SQLiteConnectionPool.ConnectionWaiter connectionWaiter2 = null;
            for (com.tencent.wcdb.database.SQLiteConnectionPool.ConnectionWaiter connectionWaiter3 = this.mConnectionWaiterQueue; connectionWaiter3 != connectionWaiter; connectionWaiter3 = connectionWaiter3.mNext) {
                connectionWaiter2 = connectionWaiter3;
            }
            if (connectionWaiter2 != null) {
                connectionWaiter2.mNext = connectionWaiter.mNext;
            } else {
                this.mConnectionWaiterQueue = connectionWaiter.mNext;
            }
            connectionWaiter.mException = new com.tencent.wcdb.support.OperationCanceledException();
            java.util.concurrent.locks.LockSupport.unpark(connectionWaiter.mThread);
            wakeConnectionWaitersLocked();
        }
    }

    private void closeAvailableConnectionsAndLogExceptionsLocked() {
        closeAvailableNonPrimaryConnectionsAndLogExceptionsLocked();
        com.tencent.wcdb.database.SQLiteConnection sQLiteConnection = this.mAvailablePrimaryConnection;
        if (sQLiteConnection != null) {
            closeConnectionAndLogExceptionsLocked(sQLiteConnection);
            this.mAvailablePrimaryConnection = null;
        }
    }

    private void closeAvailableNonPrimaryConnectionsAndLogExceptionsLocked() {
        int size = this.mAvailableNonPrimaryConnections.size();
        for (int i17 = 0; i17 < size; i17++) {
            closeConnectionAndLogExceptionsLocked(this.mAvailableNonPrimaryConnections.get(i17));
        }
        this.mAvailableNonPrimaryConnections.clear();
    }

    private void closeConnectionAndLogExceptionsLocked(com.tencent.wcdb.database.SQLiteConnection sQLiteConnection) {
        try {
            sQLiteConnection.close();
        } catch (java.lang.RuntimeException e17) {
            com.tencent.wcdb.support.Log.e(TAG, "Failed to close connection, its fate is now in the hands of the merciful GC: " + sQLiteConnection + e17.getMessage());
        }
    }

    private void closeExcessConnectionsAndLogExceptionsLocked() {
        int size = this.mAvailableNonPrimaryConnections.size();
        while (true) {
            int i17 = size - 1;
            if (size <= this.mMaxConnectionPoolSize - 1) {
                return;
            }
            closeConnectionAndLogExceptionsLocked(this.mAvailableNonPrimaryConnections.remove(i17));
            size = i17;
        }
    }

    private void discardAcquiredConnectionsLocked() {
        markAcquiredConnectionsLocked(com.tencent.wcdb.database.SQLiteConnectionPool.AcquiredConnectionStatus.DISCARD);
    }

    private void dispose(boolean z17) {
        if (z17) {
            return;
        }
        synchronized (this.mLock) {
            throwIfClosedLocked();
            this.mIsOpen = false;
            closeAvailableConnectionsAndLogExceptionsLocked();
            int size = this.mAcquiredConnections.size();
            if (size != 0) {
                com.tencent.wcdb.support.Log.i(TAG, "The connection pool for " + this.mConfiguration.label + " has been closed but there are still " + size + " connections in use.  They will be closed as they are released back to the pool.");
            }
            wakeConnectionWaitersLocked();
        }
    }

    private void finishAcquireConnectionLocked(com.tencent.wcdb.database.SQLiteConnection sQLiteConnection, int i17) {
        try {
            sQLiteConnection.setOnlyAllowReadOnlyOperations((i17 & 1) != 0);
            this.mAcquiredConnections.put(sQLiteConnection, com.tencent.wcdb.database.SQLiteConnectionPool.AcquiredConnectionStatus.NORMAL);
        } catch (java.lang.RuntimeException e17) {
            com.tencent.wcdb.support.Log.e(TAG, "Failed to prepare acquired connection for session, closing it: " + sQLiteConnection + ", connectionFlags=" + i17);
            closeConnectionAndLogExceptionsLocked(sQLiteConnection);
            throw e17;
        }
    }

    private com.tencent.wcdb.database.SQLiteConnectionPool.ConnectionPoolBusyInfo gatherConnectionPoolBusyInfoLocked() {
        com.tencent.wcdb.database.SQLiteConnectionPool.ConnectionPoolBusyInfo connectionPoolBusyInfo = new com.tencent.wcdb.database.SQLiteConnectionPool.ConnectionPoolBusyInfo();
        connectionPoolBusyInfo.activeConnections = 0;
        connectionPoolBusyInfo.idleConnections = 0;
        if (!this.mAcquiredConnections.isEmpty()) {
            for (com.tencent.wcdb.database.SQLiteConnection sQLiteConnection : this.mAcquiredConnections.keySet()) {
                com.tencent.wcdb.database.SQLiteTrace.TraceInfo<java.lang.StackTraceElement[]> tracePersistAcquisitionUnsafe = sQLiteConnection.tracePersistAcquisitionUnsafe();
                if (tracePersistAcquisitionUnsafe != null) {
                    connectionPoolBusyInfo.activeTransactions.add(tracePersistAcquisitionUnsafe);
                }
                com.tencent.wcdb.database.SQLiteTrace.TraceInfo<java.lang.String> traceCurrentOperationUnsafe = sQLiteConnection.traceCurrentOperationUnsafe();
                if (traceCurrentOperationUnsafe != null) {
                    connectionPoolBusyInfo.activeSql.add(traceCurrentOperationUnsafe);
                    java.lang.String describeCurrentOperationUnsafe = sQLiteConnection.describeCurrentOperationUnsafe();
                    if (describeCurrentOperationUnsafe != null) {
                        connectionPoolBusyInfo.activeOperationDescriptions.add(describeCurrentOperationUnsafe);
                    }
                    connectionPoolBusyInfo.activeConnections++;
                } else {
                    connectionPoolBusyInfo.idleConnections++;
                }
            }
        }
        int size = this.mAvailableNonPrimaryConnections.size();
        connectionPoolBusyInfo.availableConnections = size;
        if (this.mAvailablePrimaryConnection != null) {
            connectionPoolBusyInfo.availableConnections = size + 1;
        }
        return connectionPoolBusyInfo;
    }

    private static int getPriority(int i17) {
        return (i17 & 4) != 0 ? 1 : 0;
    }

    private boolean isSessionBlockingImportantConnectionWaitersLocked(boolean z17, int i17) {
        com.tencent.wcdb.database.SQLiteConnectionPool.ConnectionWaiter connectionWaiter = this.mConnectionWaiterQueue;
        if (connectionWaiter == null) {
            return false;
        }
        int priority = getPriority(i17);
        while (priority <= connectionWaiter.mPriority) {
            if (z17 || !connectionWaiter.mWantPrimaryConnection) {
                return true;
            }
            connectionWaiter = connectionWaiter.mNext;
            if (connectionWaiter == null) {
                return false;
            }
        }
        return false;
    }

    private void logConnectionPoolBusy(com.tencent.wcdb.database.SQLiteConnectionPool.ConnectionPoolBusyInfo connectionPoolBusyInfo, long j17, int i17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        if (j17 != 0) {
            java.lang.Thread currentThread = java.lang.Thread.currentThread();
            sb6.append("The connection pool for database '");
            sb6.append(connectionPoolBusyInfo.label);
            sb6.append("' has been unable to grant a connection to thread ");
            sb6.append(currentThread.getId());
            sb6.append(" (");
            sb6.append(currentThread.getName());
            sb6.append(") with flags 0x");
            sb6.append(java.lang.Integer.toHexString(i17));
            sb6.append(" for ");
            sb6.append(((float) j17) * 0.001f);
            sb6.append(" seconds.\n");
        }
        sb6.append("Connections: ");
        sb6.append(connectionPoolBusyInfo.activeConnections);
        sb6.append(" active, ");
        sb6.append(connectionPoolBusyInfo.idleConnections);
        sb6.append(" idle, ");
        sb6.append(connectionPoolBusyInfo.availableConnections);
        sb6.append(" available.\n");
        if (!connectionPoolBusyInfo.activeOperationDescriptions.isEmpty()) {
            sb6.append("\nRequests in progress:\n");
            java.util.Iterator<java.lang.String> it = connectionPoolBusyInfo.activeOperationDescriptions.iterator();
            while (it.hasNext()) {
                java.lang.String next = it.next();
                sb6.append("  ");
                sb6.append(next);
                sb6.append("\n");
            }
        }
        com.tencent.wcdb.support.Log.w(TAG, sb6.toString());
    }

    private void markAcquiredConnectionsLocked(com.tencent.wcdb.database.SQLiteConnectionPool.AcquiredConnectionStatus acquiredConnectionStatus) {
        if (this.mAcquiredConnections.isEmpty()) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(this.mAcquiredConnections.size());
        for (java.util.Map.Entry<com.tencent.wcdb.database.SQLiteConnection, com.tencent.wcdb.database.SQLiteConnectionPool.AcquiredConnectionStatus> entry : this.mAcquiredConnections.entrySet()) {
            com.tencent.wcdb.database.SQLiteConnectionPool.AcquiredConnectionStatus value = entry.getValue();
            if (acquiredConnectionStatus != value && value != com.tencent.wcdb.database.SQLiteConnectionPool.AcquiredConnectionStatus.DISCARD) {
                arrayList.add(entry.getKey());
            }
        }
        int size = arrayList.size();
        for (int i17 = 0; i17 < size; i17++) {
            this.mAcquiredConnections.put((com.tencent.wcdb.database.SQLiteConnection) arrayList.get(i17), acquiredConnectionStatus);
        }
    }

    private com.tencent.wcdb.database.SQLiteConnectionPool.ConnectionWaiter obtainConnectionWaiterLocked(java.lang.Thread thread, long j17, int i17, boolean z17, java.lang.String str, int i18) {
        com.tencent.wcdb.database.SQLiteConnectionPool.ConnectionWaiter connectionWaiter = this.mConnectionWaiterPool;
        if (connectionWaiter != null) {
            this.mConnectionWaiterPool = connectionWaiter.mNext;
            connectionWaiter.mNext = null;
        } else {
            connectionWaiter = new com.tencent.wcdb.database.SQLiteConnectionPool.ConnectionWaiter();
        }
        connectionWaiter.mThread = thread;
        connectionWaiter.mStartTime = j17;
        connectionWaiter.mPriority = i17;
        connectionWaiter.mWantPrimaryConnection = z17;
        connectionWaiter.mSql = str;
        connectionWaiter.mConnectionFlags = i18;
        return connectionWaiter;
    }

    public static com.tencent.wcdb.database.SQLiteConnectionPool open(com.tencent.wcdb.database.SQLiteDatabase sQLiteDatabase, com.tencent.wcdb.database.SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration, byte[] bArr, com.tencent.wcdb.database.SQLiteCipherSpec sQLiteCipherSpec) {
        return open(sQLiteDatabase, sQLiteDatabaseConfiguration, bArr, sQLiteCipherSpec, 1);
    }

    private com.tencent.wcdb.database.SQLiteConnection openConnectionLocked(com.tencent.wcdb.database.SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration, boolean z17) {
        int i17 = this.mNextConnectionId;
        this.mNextConnectionId = i17 + 1;
        return com.tencent.wcdb.database.SQLiteConnection.open(this, sQLiteDatabaseConfiguration, i17, z17, this.mPassword, this.mCipher);
    }

    private void reconfigureAllConnectionsLocked() {
        com.tencent.wcdb.database.SQLiteConnection sQLiteConnection = this.mAvailablePrimaryConnection;
        if (sQLiteConnection != null) {
            try {
                sQLiteConnection.reconfigure(this.mConfiguration);
            } catch (java.lang.RuntimeException e17) {
                com.tencent.wcdb.support.Log.e(TAG, "Failed to reconfigure available primary connection, closing it: " + this.mAvailablePrimaryConnection, e17);
                closeConnectionAndLogExceptionsLocked(this.mAvailablePrimaryConnection);
                this.mAvailablePrimaryConnection = null;
            }
        }
        int size = this.mAvailableNonPrimaryConnections.size();
        int i17 = 0;
        while (i17 < size) {
            com.tencent.wcdb.database.SQLiteConnection sQLiteConnection2 = this.mAvailableNonPrimaryConnections.get(i17);
            try {
                sQLiteConnection2.reconfigure(this.mConfiguration);
            } catch (java.lang.RuntimeException e18) {
                com.tencent.wcdb.support.Log.e(TAG, "Failed to reconfigure available non-primary connection, closing it: " + sQLiteConnection2, e18);
                closeConnectionAndLogExceptionsLocked(sQLiteConnection2);
                this.mAvailableNonPrimaryConnections.remove(i17);
                size--;
                i17--;
            }
            i17++;
        }
        markAcquiredConnectionsLocked(com.tencent.wcdb.database.SQLiteConnectionPool.AcquiredConnectionStatus.RECONFIGURE);
    }

    private boolean recycleConnectionLocked(com.tencent.wcdb.database.SQLiteConnection sQLiteConnection, com.tencent.wcdb.database.SQLiteConnectionPool.AcquiredConnectionStatus acquiredConnectionStatus) {
        if (acquiredConnectionStatus == com.tencent.wcdb.database.SQLiteConnectionPool.AcquiredConnectionStatus.RECONFIGURE) {
            try {
                sQLiteConnection.reconfigure(this.mConfiguration);
            } catch (java.lang.RuntimeException e17) {
                com.tencent.wcdb.support.Log.e(TAG, "Failed to reconfigure released connection, closing it: " + sQLiteConnection, e17);
                acquiredConnectionStatus = com.tencent.wcdb.database.SQLiteConnectionPool.AcquiredConnectionStatus.DISCARD;
            }
        }
        if (acquiredConnectionStatus != com.tencent.wcdb.database.SQLiteConnectionPool.AcquiredConnectionStatus.DISCARD) {
            return true;
        }
        closeConnectionAndLogExceptionsLocked(sQLiteConnection);
        return false;
    }

    private void recycleConnectionWaiterLocked(com.tencent.wcdb.database.SQLiteConnectionPool.ConnectionWaiter connectionWaiter) {
        connectionWaiter.mNext = this.mConnectionWaiterPool;
        connectionWaiter.mThread = null;
        connectionWaiter.mSql = null;
        connectionWaiter.mAssignedConnection = null;
        connectionWaiter.mException = null;
        connectionWaiter.mNonce++;
        this.mConnectionWaiterPool = connectionWaiter;
    }

    private void setMaxConnectionPoolSizeLocked(int i17) {
        if (i17 <= 0) {
            i17 = (this.mConfiguration.openFlags & com.tencent.wcdb.database.SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? 4 : 1;
        }
        this.mMaxConnectionPoolSize = i17;
        com.tencent.wcdb.support.Log.i(TAG, "Max connection pool size is %d.", java.lang.Integer.valueOf(i17));
    }

    private void throwIfClosedLocked() {
        if (!this.mIsOpen) {
            throw new java.lang.IllegalStateException("Cannot perform this operation because the connection pool has been closed.");
        }
    }

    private com.tencent.wcdb.database.SQLiteConnection tryAcquireNonPrimaryConnectionLocked(java.lang.String str, int i17) {
        int size = this.mAvailableNonPrimaryConnections.size();
        if (size > 1 && str != null) {
            for (int i18 = 0; i18 < size; i18++) {
                com.tencent.wcdb.database.SQLiteConnection sQLiteConnection = this.mAvailableNonPrimaryConnections.get(i18);
                if (sQLiteConnection.isPreparedStatementInCache(str)) {
                    this.mAvailableNonPrimaryConnections.remove(i18);
                    finishAcquireConnectionLocked(sQLiteConnection, i17);
                    return sQLiteConnection;
                }
            }
        }
        if (size > 0) {
            com.tencent.wcdb.database.SQLiteConnection remove = this.mAvailableNonPrimaryConnections.remove(size - 1);
            finishAcquireConnectionLocked(remove, i17);
            return remove;
        }
        int size2 = this.mAcquiredConnections.size();
        if (this.mAvailablePrimaryConnection != null) {
            size2++;
        }
        if (size2 >= this.mMaxConnectionPoolSize) {
            return null;
        }
        com.tencent.wcdb.database.SQLiteConnection openConnectionLocked = openConnectionLocked(this.mConfiguration, false);
        finishAcquireConnectionLocked(openConnectionLocked, i17);
        return openConnectionLocked;
    }

    private com.tencent.wcdb.database.SQLiteConnection tryAcquirePrimaryConnectionLocked(int i17) {
        com.tencent.wcdb.database.SQLiteConnection sQLiteConnection = this.mAvailablePrimaryConnection;
        if (sQLiteConnection != null) {
            this.mAvailablePrimaryConnection = null;
            finishAcquireConnectionLocked(sQLiteConnection, i17);
            return sQLiteConnection;
        }
        java.util.Iterator<com.tencent.wcdb.database.SQLiteConnection> it = this.mAcquiredConnections.keySet().iterator();
        while (it.hasNext()) {
            if (it.next().isPrimaryConnection()) {
                return null;
            }
        }
        com.tencent.wcdb.database.SQLiteConnection openConnectionLocked = openConnectionLocked(this.mConfiguration, true);
        finishAcquireConnectionLocked(openConnectionLocked, i17);
        return openConnectionLocked;
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x00be, code lost:
    
        if (r2 == null) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00ef, code lost:
    
        r8 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00c0, code lost:
    
        r6 = r7 - r1.mStartTime;
        logConnectionPoolBusy(r2, r6, r29);
        r14 = r27.mDB.get();
        r13 = r27.mTraceCallback;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00d2, code lost:
    
        if (r14 == null) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00d4, code lost:
    
        if (r13 == null) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00da, code lost:
    
        r8 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00e5, code lost:
    
        r13.onConnectionPoolBusy(r14, r28, r6, r21, r2.activeSql, r2.activeTransactions);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00e9, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00ed, code lost:
    
        r2 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0114, code lost:
    
        r30.setOnCancelListener(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00eb, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00ec, code lost:
    
        r8 = r15;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0103  */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11, types: [com.tencent.wcdb.support.CancellationSignal$OnCancelListener] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [com.tencent.wcdb.support.CancellationSignal$OnCancelListener] */
    /* JADX WARN: Type inference failed for: r2v8, types: [long] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r30v0, types: [com.tencent.wcdb.support.CancellationSignal] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.tencent.wcdb.database.SQLiteConnection waitForConnection(java.lang.String r28, int r29, com.tencent.wcdb.support.CancellationSignal r30) {
        /*
            Method dump skipped, instructions count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.wcdb.database.SQLiteConnectionPool.waitForConnection(java.lang.String, int, com.tencent.wcdb.support.CancellationSignal):com.tencent.wcdb.database.SQLiteConnection");
    }

    private void wakeConnectionWaitersLocked() {
        com.tencent.wcdb.database.SQLiteConnection sQLiteConnection;
        com.tencent.wcdb.database.SQLiteConnectionPool.ConnectionWaiter connectionWaiter = this.mConnectionWaiterQueue;
        com.tencent.wcdb.database.SQLiteConnectionPool.ConnectionWaiter connectionWaiter2 = null;
        boolean z17 = false;
        boolean z18 = false;
        while (connectionWaiter != null) {
            boolean z19 = true;
            if (this.mIsOpen) {
                try {
                    if (connectionWaiter.mWantPrimaryConnection || z17) {
                        sQLiteConnection = null;
                    } else {
                        sQLiteConnection = tryAcquireNonPrimaryConnectionLocked(connectionWaiter.mSql, connectionWaiter.mConnectionFlags);
                        if (sQLiteConnection == null) {
                            z17 = true;
                        }
                    }
                    if (sQLiteConnection == null && !z18 && (sQLiteConnection = tryAcquirePrimaryConnectionLocked(connectionWaiter.mConnectionFlags)) == null) {
                        z18 = true;
                    }
                    if (sQLiteConnection != null) {
                        connectionWaiter.mAssignedConnection = sQLiteConnection;
                    } else if (z17 && z18) {
                        return;
                    } else {
                        z19 = false;
                    }
                } catch (java.lang.RuntimeException e17) {
                    connectionWaiter.mException = e17;
                }
            }
            com.tencent.wcdb.database.SQLiteConnectionPool.ConnectionWaiter connectionWaiter3 = connectionWaiter.mNext;
            if (z19) {
                if (connectionWaiter2 != null) {
                    connectionWaiter2.mNext = connectionWaiter3;
                } else {
                    this.mConnectionWaiterQueue = connectionWaiter3;
                }
                connectionWaiter.mNext = null;
                java.util.concurrent.locks.LockSupport.unpark(connectionWaiter.mThread);
            } else {
                connectionWaiter2 = connectionWaiter;
            }
            connectionWaiter = connectionWaiter3;
        }
    }

    public com.tencent.wcdb.database.SQLiteConnection acquireConnection(java.lang.String str, int i17, com.tencent.wcdb.support.CancellationSignal cancellationSignal) {
        long uptimeMillis = android.os.SystemClock.uptimeMillis();
        com.tencent.wcdb.database.SQLiteConnection waitForConnection = waitForConnection(str, i17, cancellationSignal);
        waitForConnection.ensureOpen();
        com.tencent.wcdb.database.SQLiteTrace sQLiteTrace = this.mTraceCallback;
        if (sQLiteTrace != null) {
            long uptimeMillis2 = android.os.SystemClock.uptimeMillis() - uptimeMillis;
            com.tencent.wcdb.database.SQLiteDatabase sQLiteDatabase = this.mDB.get();
            if (sQLiteDatabase != null) {
                sQLiteTrace.onConnectionObtained(sQLiteDatabase, str, uptimeMillis2, (i17 & 2) != 0);
            }
        }
        return waitForConnection;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        dispose(false);
    }

    public void collectDbStats(java.util.ArrayList<com.tencent.wcdb.database.SQLiteDebug.DbStats> arrayList) {
        synchronized (this.mLock) {
            com.tencent.wcdb.database.SQLiteConnection sQLiteConnection = this.mAvailablePrimaryConnection;
            if (sQLiteConnection != null) {
                sQLiteConnection.collectDbStats(arrayList);
            }
            java.util.Iterator<com.tencent.wcdb.database.SQLiteConnection> it = this.mAvailableNonPrimaryConnections.iterator();
            while (it.hasNext()) {
                it.next().collectDbStats(arrayList);
            }
            java.util.Iterator<com.tencent.wcdb.database.SQLiteConnection> it6 = this.mAcquiredConnections.keySet().iterator();
            while (it6.hasNext()) {
                it6.next().collectDbStatsUnsafe(arrayList);
            }
        }
    }

    public void dump(android.util.Printer printer, boolean z17) {
        android.util.Printer create = com.tencent.wcdb.support.PrefixPrinter.create(printer, "    ");
        synchronized (this.mLock) {
            printer.println("Connection pool for " + this.mConfiguration.path + ":");
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("  Open: ");
            sb6.append(this.mIsOpen);
            printer.println(sb6.toString());
            printer.println("  Max connections: " + this.mMaxConnectionPoolSize);
            printer.println("  Available primary connection:");
            com.tencent.wcdb.database.SQLiteConnection sQLiteConnection = this.mAvailablePrimaryConnection;
            if (sQLiteConnection != null) {
                sQLiteConnection.dump(create, z17);
            } else {
                create.println("<none>");
            }
            printer.println("  Available non-primary connections:");
            int i17 = 0;
            if (this.mAvailableNonPrimaryConnections.isEmpty()) {
                create.println("<none>");
            } else {
                int size = this.mAvailableNonPrimaryConnections.size();
                for (int i18 = 0; i18 < size; i18++) {
                    this.mAvailableNonPrimaryConnections.get(i18).dump(create, z17);
                }
            }
            printer.println("  Acquired connections:");
            if (this.mAcquiredConnections.isEmpty()) {
                create.println("<none>");
            } else {
                for (java.util.Map.Entry<com.tencent.wcdb.database.SQLiteConnection, com.tencent.wcdb.database.SQLiteConnectionPool.AcquiredConnectionStatus> entry : this.mAcquiredConnections.entrySet()) {
                    entry.getKey().dump(create, z17);
                    create.println("  Status: " + entry.getValue());
                }
            }
            printer.println("  Connection waiters:");
            if (this.mConnectionWaiterQueue != null) {
                long uptimeMillis = android.os.SystemClock.uptimeMillis();
                com.tencent.wcdb.database.SQLiteConnectionPool.ConnectionWaiter connectionWaiter = this.mConnectionWaiterQueue;
                while (connectionWaiter != null) {
                    create.println(i17 + ": waited for " + (uptimeMillis - connectionWaiter.mStartTime) + " ms - thread=" + connectionWaiter.mThread + ", priority=" + connectionWaiter.mPriority + ", sql='" + connectionWaiter.mSql + "'");
                    connectionWaiter = connectionWaiter.mNext;
                    i17++;
                }
            } else {
                create.println("<none>");
            }
        }
    }

    public org.json.JSONObject dumpJSON(boolean z17) {
        org.json.JSONObject put;
        synchronized (this.mLock) {
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            org.json.JSONArray jSONArray2 = new org.json.JSONArray();
            org.json.JSONArray jSONArray3 = new org.json.JSONArray();
            org.json.JSONObject put2 = new org.json.JSONObject().put(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, this.mConfiguration.path).put("open", this.mIsOpen).put("maxConn", this.mMaxConnectionPoolSize);
            com.tencent.wcdb.database.SQLiteConnection sQLiteConnection = this.mAvailablePrimaryConnection;
            put = put2.put("availablePrimary", (java.lang.Object) null).put("availableNonPrimary", jSONArray).put("acquired", jSONArray2).put("waiters", jSONArray3);
            java.util.Iterator<com.tencent.wcdb.database.SQLiteConnection> it = this.mAvailableNonPrimaryConnections.iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next().dumpJSON(z17));
            }
            for (java.util.Map.Entry<com.tencent.wcdb.database.SQLiteConnection, com.tencent.wcdb.database.SQLiteConnectionPool.AcquiredConnectionStatus> entry : this.mAcquiredConnections.entrySet()) {
                jSONArray2.put(entry.getKey().dumpJSON(z17).put("status", entry.getValue().toString()));
            }
            for (com.tencent.wcdb.database.SQLiteConnectionPool.ConnectionWaiter connectionWaiter = this.mConnectionWaiterQueue; connectionWaiter != null; connectionWaiter = connectionWaiter.mNext) {
                jSONArray3.put(new org.json.JSONObject().put("duration", android.os.SystemClock.uptimeMillis() - connectionWaiter.mStartTime).put("thread", connectionWaiter.mThread.toString()).put(com.tencent.tmassistantsdk.downloadservice.DownloadInfo.PRIORITY, connectionWaiter.mPriority).put("sql", connectionWaiter.mSql));
            }
        }
        return put;
    }

    public void finalize() {
        try {
            dispose(true);
        } finally {
            super.finalize();
        }
    }

    public com.tencent.wcdb.database.SQLiteChangeListener getChangeListener() {
        return this.mChangeListener;
    }

    public com.tencent.wcdb.database.SQLiteCheckpointListener getCheckpointListener() {
        return this.mCheckpointListener;
    }

    public com.tencent.wcdb.database.SQLiteTrace getTraceCallback() {
        return this.mTraceCallback;
    }

    public void notifyChanges(java.lang.String str, java.lang.String str2, long[] jArr, long[] jArr2, long[] jArr3) {
        com.tencent.wcdb.database.SQLiteDatabase sQLiteDatabase = this.mDB.get();
        com.tencent.wcdb.database.SQLiteChangeListener sQLiteChangeListener = this.mChangeListener;
        if (sQLiteChangeListener == null || sQLiteDatabase == null) {
            return;
        }
        sQLiteChangeListener.onChange(sQLiteDatabase, str, str2, jArr, jArr2, jArr3);
    }

    public void notifyCheckpoint(java.lang.String str, int i17) {
        com.tencent.wcdb.database.SQLiteDatabase sQLiteDatabase = this.mDB.get();
        com.tencent.wcdb.database.SQLiteCheckpointListener sQLiteCheckpointListener = this.mCheckpointListener;
        if (sQLiteCheckpointListener == null || sQLiteDatabase == null) {
            return;
        }
        sQLiteCheckpointListener.onWALCommit(sQLiteDatabase, str, i17);
    }

    public void onConnectionLeaked() {
        com.tencent.wcdb.support.Log.w(TAG, "A SQLiteConnection object for database '" + this.mConfiguration.label + "' was leaked!  Please fix your application to end transactions in progress properly and to close the database when it is no longer needed.");
        this.mConnectionLeaked.set(true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0082, code lost:
    
        closeAvailableConnectionsAndLogExceptionsLocked();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void reconfigure(com.tencent.wcdb.database.SQLiteDatabaseConfiguration r8) {
        /*
            r7 = this;
            if (r8 == 0) goto La4
            java.lang.Object r0 = r7.mLock
            monitor-enter(r0)
            r7.throwIfClosedLocked()     // Catch: java.lang.Throwable -> La1
            int r1 = r8.openFlags     // Catch: java.lang.Throwable -> La1
            com.tencent.wcdb.database.SQLiteDatabaseConfiguration r2 = r7.mConfiguration     // Catch: java.lang.Throwable -> La1
            int r2 = r2.openFlags     // Catch: java.lang.Throwable -> La1
            r1 = r1 ^ r2
            r2 = 536870912(0x20000000, float:1.0842022E-19)
            r1 = r1 & r2
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L18
            r1 = r2
            goto L19
        L18:
            r1 = r3
        L19:
            if (r1 == 0) goto L2f
            java.util.WeakHashMap<com.tencent.wcdb.database.SQLiteConnection, com.tencent.wcdb.database.SQLiteConnectionPool$AcquiredConnectionStatus> r4 = r7.mAcquiredConnections     // Catch: java.lang.Throwable -> La1
            boolean r4 = r4.isEmpty()     // Catch: java.lang.Throwable -> La1
            if (r4 == 0) goto L27
            r7.closeAvailableNonPrimaryConnectionsAndLogExceptionsLocked()     // Catch: java.lang.Throwable -> La1
            goto L2f
        L27:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> La1
            java.lang.String r1 = "Write Ahead Logging (WAL) mode cannot be enabled or disabled while there are transactions in progress.  Finish all transactions and release all active database connections first."
            r8.<init>(r1)     // Catch: java.lang.Throwable -> La1
            throw r8     // Catch: java.lang.Throwable -> La1
        L2f:
            boolean r4 = r8.foreignKeyConstraintsEnabled     // Catch: java.lang.Throwable -> La1
            com.tencent.wcdb.database.SQLiteDatabaseConfiguration r5 = r7.mConfiguration     // Catch: java.lang.Throwable -> La1
            boolean r5 = r5.foreignKeyConstraintsEnabled     // Catch: java.lang.Throwable -> La1
            if (r4 == r5) goto L39
            r4 = r2
            goto L3a
        L39:
            r4 = r3
        L3a:
            if (r4 == 0) goto L4d
            java.util.WeakHashMap<com.tencent.wcdb.database.SQLiteConnection, com.tencent.wcdb.database.SQLiteConnectionPool$AcquiredConnectionStatus> r4 = r7.mAcquiredConnections     // Catch: java.lang.Throwable -> La1
            boolean r4 = r4.isEmpty()     // Catch: java.lang.Throwable -> La1
            if (r4 == 0) goto L45
            goto L4d
        L45:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> La1
            java.lang.String r1 = "Foreign Key Constraints cannot be enabled or disabled while there are transactions in progress.  Finish all transactions and release all active database connections first."
            r8.<init>(r1)     // Catch: java.lang.Throwable -> La1
            throw r8     // Catch: java.lang.Throwable -> La1
        L4d:
            com.tencent.wcdb.database.SQLiteDatabaseConfiguration r4 = r7.mConfiguration     // Catch: java.lang.Throwable -> La1
            int r5 = r4.openFlags     // Catch: java.lang.Throwable -> La1
            int r6 = r8.openFlags     // Catch: java.lang.Throwable -> La1
            r5 = r5 ^ r6
            r6 = 268435473(0x10000011, float:2.52436E-29)
            r5 = r5 & r6
            if (r5 != 0) goto L80
            java.lang.String r4 = r4.vfsName     // Catch: java.lang.Throwable -> La1
            java.lang.String r5 = r8.vfsName     // Catch: java.lang.Throwable -> La1
            boolean r4 = com.tencent.wcdb.DatabaseUtils.objectEquals(r4, r5)     // Catch: java.lang.Throwable -> La1
            if (r4 == 0) goto L80
            java.util.LinkedHashSet<com.tencent.wcdb.extension.SQLiteExtension> r4 = r8.extensions     // Catch: java.lang.Throwable -> La1
            com.tencent.wcdb.database.SQLiteDatabaseConfiguration r5 = r7.mConfiguration     // Catch: java.lang.Throwable -> La1
            java.util.LinkedHashSet<com.tencent.wcdb.extension.SQLiteExtension> r5 = r5.extensions     // Catch: java.lang.Throwable -> La1
            boolean r4 = r4.containsAll(r5)     // Catch: java.lang.Throwable -> La1
            if (r4 != 0) goto L71
            goto L80
        L71:
            com.tencent.wcdb.database.SQLiteDatabaseConfiguration r1 = r7.mConfiguration     // Catch: java.lang.Throwable -> La1
            r1.updateParametersFrom(r8)     // Catch: java.lang.Throwable -> La1
            r7.setMaxConnectionPoolSizeLocked(r3)     // Catch: java.lang.Throwable -> La1
            r7.closeExcessConnectionsAndLogExceptionsLocked()     // Catch: java.lang.Throwable -> La1
            r7.reconfigureAllConnectionsLocked()     // Catch: java.lang.Throwable -> La1
            goto L9c
        L80:
            if (r1 == 0) goto L85
            r7.closeAvailableConnectionsAndLogExceptionsLocked()     // Catch: java.lang.Throwable -> La1
        L85:
            com.tencent.wcdb.database.SQLiteConnection r1 = r7.openConnectionLocked(r8, r2)     // Catch: java.lang.Throwable -> La1
            r1.ensureOpen()     // Catch: java.lang.Throwable -> La1
            r7.closeAvailableConnectionsAndLogExceptionsLocked()     // Catch: java.lang.Throwable -> La1
            r7.discardAcquiredConnectionsLocked()     // Catch: java.lang.Throwable -> La1
            r7.mAvailablePrimaryConnection = r1     // Catch: java.lang.Throwable -> La1
            com.tencent.wcdb.database.SQLiteDatabaseConfiguration r1 = r7.mConfiguration     // Catch: java.lang.Throwable -> La1
            r1.updateParametersFrom(r8)     // Catch: java.lang.Throwable -> La1
            r7.setMaxConnectionPoolSizeLocked(r3)     // Catch: java.lang.Throwable -> La1
        L9c:
            r7.wakeConnectionWaitersLocked()     // Catch: java.lang.Throwable -> La1
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La1
            return
        La1:
            r8 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La1
            throw r8
        La4:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "configuration must not be null."
            r8.<init>(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.wcdb.database.SQLiteConnectionPool.reconfigure(com.tencent.wcdb.database.SQLiteDatabaseConfiguration):void");
    }

    public void releaseConnection(com.tencent.wcdb.database.SQLiteConnection sQLiteConnection) {
        synchronized (this.mLock) {
            com.tencent.wcdb.database.SQLiteConnectionPool.AcquiredConnectionStatus remove = this.mAcquiredConnections.remove(sQLiteConnection);
            if (remove == null) {
                throw new java.lang.IllegalStateException("Cannot perform this operation because the specified connection was not acquired from this pool or has already been released.");
            }
            if (!this.mIsOpen) {
                closeConnectionAndLogExceptionsLocked(sQLiteConnection);
            } else if (sQLiteConnection.isPrimaryConnection()) {
                if (recycleConnectionLocked(sQLiteConnection, remove)) {
                    this.mAvailablePrimaryConnection = sQLiteConnection;
                }
                wakeConnectionWaitersLocked();
            } else if (this.mAvailableNonPrimaryConnections.size() >= this.mMaxConnectionPoolSize - 1) {
                closeConnectionAndLogExceptionsLocked(sQLiteConnection);
            } else {
                if (recycleConnectionLocked(sQLiteConnection, remove)) {
                    this.mAvailableNonPrimaryConnections.add(sQLiteConnection);
                }
                wakeConnectionWaitersLocked();
            }
        }
    }

    public void setChangeListener(com.tencent.wcdb.database.SQLiteChangeListener sQLiteChangeListener, boolean z17) {
        boolean z18 = sQLiteChangeListener != null;
        if (!z18) {
            z17 = false;
        }
        synchronized (this.mLock) {
            com.tencent.wcdb.database.SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration = this.mConfiguration;
            if (sQLiteDatabaseConfiguration.updateNotificationEnabled != z18 || sQLiteDatabaseConfiguration.updateNotificationRowID != z17) {
                sQLiteDatabaseConfiguration.updateNotificationEnabled = z18;
                sQLiteDatabaseConfiguration.updateNotificationRowID = z17;
                closeExcessConnectionsAndLogExceptionsLocked();
                reconfigureAllConnectionsLocked();
            }
            this.mChangeListener = sQLiteChangeListener;
        }
    }

    public void setCheckpointListener(com.tencent.wcdb.database.SQLiteCheckpointListener sQLiteCheckpointListener) {
        com.tencent.wcdb.database.SQLiteDatabase sQLiteDatabase = this.mDB.get();
        if (this.mCheckpointListener != null) {
            this.mCheckpointListener.onDetach(sQLiteDatabase);
        }
        this.mCheckpointListener = sQLiteCheckpointListener;
        if (this.mCheckpointListener != null) {
            this.mCheckpointListener.onAttach(sQLiteDatabase);
        }
    }

    public void setTraceCallback(com.tencent.wcdb.database.SQLiteTrace sQLiteTrace) {
        this.mTraceCallback = sQLiteTrace;
    }

    public boolean shouldYieldConnection(com.tencent.wcdb.database.SQLiteConnection sQLiteConnection, int i17) {
        synchronized (this.mLock) {
            if (!this.mAcquiredConnections.containsKey(sQLiteConnection)) {
                throw new java.lang.IllegalStateException("Cannot perform this operation because the specified connection was not acquired from this pool or has already been released.");
            }
            if (!this.mIsOpen) {
                return false;
            }
            return isSessionBlockingImportantConnectionWaitersLocked(sQLiteConnection.isPrimaryConnection(), i17);
        }
    }

    public java.lang.String toString() {
        return "SQLiteConnectionPool: " + this.mConfiguration.path;
    }

    public void traceExecute(java.lang.String str, int i17, long j17) {
        com.tencent.wcdb.database.SQLiteDatabase sQLiteDatabase = this.mDB.get();
        com.tencent.wcdb.database.SQLiteTrace sQLiteTrace = this.mTraceCallback;
        if (sQLiteTrace == null || sQLiteDatabase == null || str == null) {
            return;
        }
        sQLiteTrace.onSQLExecuted(sQLiteDatabase, str, i17, j17);
    }

    public static com.tencent.wcdb.database.SQLiteConnectionPool open(com.tencent.wcdb.database.SQLiteDatabase sQLiteDatabase, com.tencent.wcdb.database.SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration, byte[] bArr, com.tencent.wcdb.database.SQLiteCipherSpec sQLiteCipherSpec, int i17) {
        if (sQLiteDatabaseConfiguration != null) {
            com.tencent.wcdb.database.SQLiteConnectionPool sQLiteConnectionPool = new com.tencent.wcdb.database.SQLiteConnectionPool(sQLiteDatabase, sQLiteDatabaseConfiguration, i17);
            sQLiteConnectionPool.mPassword = bArr;
            sQLiteConnectionPool.mCipher = sQLiteCipherSpec == null ? null : new com.tencent.wcdb.database.SQLiteCipherSpec(sQLiteCipherSpec);
            sQLiteConnectionPool.open();
            return sQLiteConnectionPool;
        }
        throw new java.lang.IllegalArgumentException("configuration must not be null.");
    }

    private void open() {
        com.tencent.wcdb.database.SQLiteConnection openConnectionLocked = openConnectionLocked(this.mConfiguration, true);
        this.mAvailablePrimaryConnection = openConnectionLocked;
        openConnectionLocked.ensureOpen();
        this.mIsOpen = true;
    }
}
