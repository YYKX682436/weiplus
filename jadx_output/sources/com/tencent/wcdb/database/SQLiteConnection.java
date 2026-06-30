package com.tencent.wcdb.database;

/* loaded from: classes12.dex */
public final class SQLiteConnection implements com.tencent.wcdb.support.CancellationSignal.OnCancelListener {
    private static final boolean DEBUG = false;
    private static final java.lang.String TAG = "WCDB.SQLiteConnection";
    private java.lang.Throwable mAcquiredStack;
    private java.lang.Thread mAcquiredThread;
    private int mAcquiredTid;
    private long mAcquiredTimestamp;
    private int mCancellationSignalAttachCount;
    private com.tencent.wcdb.database.SQLiteCipherSpec mCipher;
    private final com.tencent.wcdb.database.SQLiteDatabaseConfiguration mConfiguration;
    private final int mConnectionId;
    private long mConnectionPtr;
    private final boolean mIsPrimaryConnection;
    private final boolean mIsReadOnlyConnection;
    private int mNativeHandleCount;
    private com.tencent.wcdb.database.SQLiteConnection.Operation mNativeOperation;
    private boolean mOnlyAllowReadOnlyOperations;
    private byte[] mPassword;
    private final com.tencent.wcdb.database.SQLiteConnectionPool mPool;
    private final com.tencent.wcdb.database.SQLiteConnection.PreparedStatementCache mPreparedStatementCache;
    private com.tencent.wcdb.database.SQLiteConnection.PreparedStatement mPreparedStatementPool;
    private final com.tencent.wcdb.database.SQLiteConnection.OperationLog mRecentOperations = new com.tencent.wcdb.database.SQLiteConnection.OperationLog();
    private static final java.lang.String[] EMPTY_STRING_ARRAY = new java.lang.String[0];
    private static final byte[] EMPTY_BYTE_ARRAY = new byte[0];
    private static final java.util.regex.Pattern TRIM_SQL_PATTERN = java.util.regex.Pattern.compile("[\\s]*\\n+[\\s]*");
    private static final java.lang.String[] HMAC_ALGO_MAPPING = {"HMAC_SHA1", "HMAC_SHA256", "HMAC_SHA512"};
    private static final java.lang.String[] PBKDF2_ALGO_MAPPING = {"PBKDF2_HMAC_SHA1", "PBKDF2_HMAC_SHA256", "PBKDF2_HMAC_SHA512"};

    /* loaded from: classes12.dex */
    public static final class Operation {
        private static final java.text.SimpleDateFormat sDateFormat = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        java.util.ArrayList<java.lang.Object> mBindArgs;
        int mCookie;
        long mEndTime;
        java.lang.Exception mException;
        boolean mFinished;
        java.lang.String mKind;
        java.lang.String mSql;
        long mStartTime;
        int mTid;
        int mType;

        private Operation() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public java.lang.String getFormattedStartTime() {
            return sDateFormat.format(new java.util.Date(this.mStartTime));
        }

        private java.lang.String getStatus() {
            return !this.mFinished ? "running" : this.mException != null ? com.tencent.youtu.sdkkitframework.common.StateEvent.ProcessResult.FAILED : "succeeded";
        }

        public void describe(java.lang.StringBuilder sb6, boolean z17) {
            java.util.ArrayList<java.lang.Object> arrayList;
            sb6.append(this.mKind);
            if (this.mFinished) {
                sb6.append(" took ");
                sb6.append(this.mEndTime - this.mStartTime);
                sb6.append("ms");
            } else {
                sb6.append(" started ");
                sb6.append(java.lang.System.currentTimeMillis() - this.mStartTime);
                sb6.append("ms ago");
            }
            sb6.append(" - ");
            sb6.append(getStatus());
            if (this.mSql != null) {
                sb6.append(", sql=\"");
                sb6.append(com.tencent.wcdb.database.SQLiteConnection.trimSqlForDisplay(this.mSql));
                sb6.append("\"");
            }
            if (this.mTid > 0) {
                sb6.append(", tid=");
                sb6.append(this.mTid);
            }
            if (z17 && (arrayList = this.mBindArgs) != null && arrayList.size() != 0) {
                sb6.append(", bindArgs=[");
                int size = this.mBindArgs.size();
                for (int i17 = 0; i17 < size; i17++) {
                    java.lang.Object obj = this.mBindArgs.get(i17);
                    if (i17 != 0) {
                        sb6.append(", ");
                    }
                    if (obj == null) {
                        sb6.append("null");
                    } else if (obj instanceof byte[]) {
                        sb6.append("<byte[]>");
                    } else if (obj instanceof java.lang.String) {
                        sb6.append("\"");
                        sb6.append((java.lang.String) obj);
                        sb6.append("\"");
                    } else {
                        sb6.append(obj);
                    }
                }
                sb6.append("]");
            }
            java.lang.Exception exc = this.mException;
            if (exc == null || exc.getMessage() == null) {
                return;
            }
            sb6.append(", exception=\"");
            sb6.append(this.mException.getMessage());
            sb6.append("\"");
        }

        public org.json.JSONObject dumpJSON(boolean z17) {
            org.json.JSONObject putOpt = new org.json.JSONObject().put("start", this.mStartTime).put("kind", this.mKind).put("duration", (this.mFinished ? this.mEndTime : java.lang.System.currentTimeMillis()) - this.mStartTime).put("status", getStatus()).putOpt("sql", this.mSql);
            int i17 = this.mTid;
            return putOpt.putOpt("tid", i17 > 0 ? java.lang.Integer.valueOf(i17) : null).putOpt("exception", this.mException);
        }
    }

    /* loaded from: classes12.dex */
    public final class OperationLog {
        private static final int COOKIE_GENERATION_SHIFT = 8;
        private static final int COOKIE_INDEX_MASK = 255;
        private static final int MAX_RECENT_OPERATIONS = 20;
        private int mGeneration;
        private int mIndex;
        private final com.tencent.wcdb.database.SQLiteConnection.Operation[] mOperations;

        private OperationLog() {
            this.mOperations = new com.tencent.wcdb.database.SQLiteConnection.Operation[20];
        }

        private boolean endOperationDeferLogLocked(com.tencent.wcdb.database.SQLiteConnection.Operation operation) {
            if (operation == null) {
                return false;
            }
            operation.mEndTime = java.lang.System.currentTimeMillis();
            operation.mFinished = true;
            java.lang.Exception exc = operation.mException;
            if (exc == null || exc.getMessage() == null) {
                return com.tencent.wcdb.database.SQLiteDebug.shouldLogSlowQuery(operation.mEndTime - operation.mStartTime);
            }
            return true;
        }

        private com.tencent.wcdb.database.SQLiteConnection.Operation getOperationLocked(int i17) {
            com.tencent.wcdb.database.SQLiteConnection.Operation operation = this.mOperations[i17 & 255];
            if (operation.mCookie == i17) {
                return operation;
            }
            return null;
        }

        private void logOperationLocked(com.tencent.wcdb.database.SQLiteConnection.Operation operation, java.lang.String str) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            operation.describe(sb6, false);
            if (str != null) {
                sb6.append(", ");
                sb6.append(str);
            }
            com.tencent.wcdb.support.Log.i(com.tencent.wcdb.database.SQLiteConnection.TAG, sb6.toString());
        }

        private int newOperationCookieLocked(int i17) {
            int i18 = this.mGeneration;
            this.mGeneration = i18 + 1;
            return i17 | (i18 << 8);
        }

        public com.tencent.wcdb.database.SQLiteConnection.Operation beginOperation(java.lang.String str, java.lang.String str2, java.lang.Object[] objArr) {
            com.tencent.wcdb.database.SQLiteConnection.Operation operation;
            synchronized (this.mOperations) {
                int i17 = (this.mIndex + 1) % 20;
                operation = this.mOperations[i17];
                if (operation == null) {
                    operation = new com.tencent.wcdb.database.SQLiteConnection.Operation();
                    this.mOperations[i17] = operation;
                } else {
                    operation.mFinished = false;
                    operation.mException = null;
                    java.util.ArrayList<java.lang.Object> arrayList = operation.mBindArgs;
                    if (arrayList != null) {
                        arrayList.clear();
                    }
                }
                operation.mStartTime = java.lang.System.currentTimeMillis();
                operation.mKind = str;
                operation.mSql = str2;
                if (objArr != null) {
                    java.util.ArrayList<java.lang.Object> arrayList2 = operation.mBindArgs;
                    if (arrayList2 == null) {
                        operation.mBindArgs = new java.util.ArrayList<>();
                    } else {
                        arrayList2.clear();
                    }
                    for (java.lang.Object obj : objArr) {
                        if (obj == null || !(obj instanceof byte[])) {
                            operation.mBindArgs.add(obj);
                        } else {
                            operation.mBindArgs.add(com.tencent.wcdb.database.SQLiteConnection.EMPTY_BYTE_ARRAY);
                        }
                    }
                }
                operation.mCookie = newOperationCookieLocked(i17);
                operation.mTid = com.tencent.wcdb.database.SQLiteConnection.this.mAcquiredTid;
                this.mIndex = i17;
            }
            return operation;
        }

        public java.lang.String describeCurrentOperation() {
            synchronized (this.mOperations) {
                com.tencent.wcdb.database.SQLiteConnection.Operation operation = this.mOperations[this.mIndex];
                if (operation == null || operation.mFinished) {
                    return null;
                }
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                operation.describe(sb6, false);
                return sb6.toString();
            }
        }

        public void dump(android.util.Printer printer, boolean z17) {
            synchronized (this.mOperations) {
                printer.println("  Most recently executed operations:");
                int i17 = this.mIndex;
                com.tencent.wcdb.database.SQLiteConnection.Operation operation = this.mOperations[i17];
                if (operation != null) {
                    int i18 = 0;
                    do {
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                        sb6.append("    ");
                        sb6.append(i18);
                        sb6.append(": [");
                        sb6.append(operation.getFormattedStartTime());
                        sb6.append("] ");
                        operation.describe(sb6, z17);
                        printer.println(sb6.toString());
                        i17 = i17 > 0 ? i17 - 1 : 19;
                        i18++;
                        operation = this.mOperations[i17];
                        if (operation == null) {
                            break;
                        }
                    } while (i18 < 20);
                } else {
                    printer.println("    <none>");
                }
            }
        }

        public org.json.JSONArray dumpJSON(boolean z17) {
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            synchronized (this.mOperations) {
                int i17 = this.mIndex;
                int i18 = 0;
                while (true) {
                    com.tencent.wcdb.database.SQLiteConnection.Operation operation = this.mOperations[i17];
                    if (operation == null) {
                        break;
                    }
                    int i19 = i18 + 1;
                    if (i18 >= 20) {
                        break;
                    }
                    jSONArray.put(operation.dumpJSON(z17));
                    i17 = i17 > 0 ? i17 - 1 : 19;
                    i18 = i19;
                }
            }
            return jSONArray;
        }

        public void endOperation(int i17) {
            java.lang.String str;
            java.lang.String str2;
            int i18;
            long j17;
            synchronized (this.mOperations) {
                com.tencent.wcdb.database.SQLiteConnection.Operation operationLocked = getOperationLocked(i17);
                if (endOperationDeferLogLocked(operationLocked)) {
                    logOperationLocked(operationLocked, null);
                }
                str = operationLocked.mSql;
                str2 = operationLocked.mKind;
                i18 = operationLocked.mType;
                j17 = operationLocked.mEndTime - operationLocked.mStartTime;
            }
            if ("prepare".equals(str2) || com.tencent.wcdb.database.SQLiteConnection.this.mAcquiredThread == null) {
                return;
            }
            com.tencent.wcdb.database.SQLiteConnection.this.mPool.traceExecute(str, i18, j17);
        }

        public boolean endOperationDeferLog(int i17) {
            synchronized (this.mOperations) {
                com.tencent.wcdb.database.SQLiteConnection.Operation operationLocked = getOperationLocked(i17);
                if (operationLocked == null) {
                    return false;
                }
                boolean endOperationDeferLogLocked = endOperationDeferLogLocked(operationLocked);
                java.lang.String str = operationLocked.mSql;
                java.lang.String str2 = operationLocked.mKind;
                int i18 = operationLocked.mType;
                long j17 = operationLocked.mEndTime - operationLocked.mStartTime;
                if (!"prepare".equals(str2) && com.tencent.wcdb.database.SQLiteConnection.this.mAcquiredThread != null) {
                    com.tencent.wcdb.database.SQLiteConnection.this.mPool.traceExecute(str, i18, j17);
                }
                return endOperationDeferLogLocked;
            }
        }

        public void failOperation(int i17, java.lang.Exception exc) {
            synchronized (this.mOperations) {
                com.tencent.wcdb.database.SQLiteConnection.Operation operationLocked = getOperationLocked(i17);
                if (operationLocked != null) {
                    operationLocked.mException = exc;
                }
            }
        }

        public void logOperation(int i17, java.lang.String str) {
            synchronized (this.mOperations) {
                com.tencent.wcdb.database.SQLiteConnection.Operation operationLocked = getOperationLocked(i17);
                if (operationLocked != null) {
                    logOperationLocked(operationLocked, str);
                }
            }
        }

        public com.tencent.wcdb.database.SQLiteTrace.TraceInfo<java.lang.String> traceCurrentOperation() {
            synchronized (this.mOperations) {
                com.tencent.wcdb.database.SQLiteConnection.Operation operation = this.mOperations[this.mIndex];
                if (operation == null || operation.mFinished) {
                    return null;
                }
                return new com.tencent.wcdb.database.SQLiteTrace.TraceInfo<>(operation.mSql, operation.mStartTime, operation.mTid);
            }
        }
    }

    /* loaded from: classes12.dex */
    public static final class PreparedStatement {
        private java.lang.ref.WeakReference<com.tencent.wcdb.database.SQLiteConnection> mConnection;
        private boolean mInCache;
        private boolean mInUse;
        private int mNumParameters;
        private com.tencent.wcdb.database.SQLiteConnection.Operation mOperation;
        private com.tencent.wcdb.database.SQLiteConnection.PreparedStatement mPoolNext;
        private boolean mReadOnly;
        private java.lang.String mSql;
        private long mStatementPtr;
        private int mType;

        public PreparedStatement(com.tencent.wcdb.database.SQLiteConnection sQLiteConnection) {
            this.mConnection = new java.lang.ref.WeakReference<>(sQLiteConnection);
        }

        public void attachCancellationSignal(com.tencent.wcdb.support.CancellationSignal cancellationSignal) {
            com.tencent.wcdb.database.SQLiteConnection sQLiteConnection = this.mConnection.get();
            if (sQLiteConnection == null) {
                return;
            }
            sQLiteConnection.attachCancellationSignal(cancellationSignal);
        }

        public void beginOperation(java.lang.String str, java.lang.Object[] objArr) {
            com.tencent.wcdb.database.SQLiteConnection sQLiteConnection = this.mConnection.get();
            if (sQLiteConnection == null) {
                return;
            }
            com.tencent.wcdb.database.SQLiteConnection.Operation beginOperation = sQLiteConnection.mRecentOperations.beginOperation(str, this.mSql, objArr);
            this.mOperation = beginOperation;
            beginOperation.mType = this.mType;
        }

        public void bindArguments(java.lang.Object[] objArr) {
            com.tencent.wcdb.database.SQLiteConnection sQLiteConnection = this.mConnection.get();
            if (sQLiteConnection == null) {
                return;
            }
            sQLiteConnection.bindArguments(this, objArr);
        }

        public void detachCancellationSignal(com.tencent.wcdb.support.CancellationSignal cancellationSignal) {
            com.tencent.wcdb.database.SQLiteConnection sQLiteConnection = this.mConnection.get();
            if (sQLiteConnection == null) {
                return;
            }
            sQLiteConnection.detachCancellationSignal(cancellationSignal);
        }

        public void endOperation(java.lang.String str) {
            com.tencent.wcdb.database.SQLiteConnection sQLiteConnection;
            if (this.mOperation == null || (sQLiteConnection = this.mConnection.get()) == null) {
                return;
            }
            if (sQLiteConnection.mRecentOperations.endOperationDeferLog(this.mOperation.mCookie)) {
                sQLiteConnection.mRecentOperations.logOperation(this.mOperation.mCookie, str);
            }
            this.mOperation = null;
        }

        public void failOperation(java.lang.Exception exc) {
            com.tencent.wcdb.database.SQLiteConnection sQLiteConnection;
            if (this.mOperation == null || (sQLiteConnection = this.mConnection.get()) == null) {
                return;
            }
            sQLiteConnection.mRecentOperations.failOperation(this.mOperation.mCookie, exc);
        }

        public long getPtr() {
            return this.mStatementPtr;
        }

        public java.lang.String getSQL() {
            return this.mSql;
        }

        public int getType() {
            return this.mType;
        }

        public boolean isReadOnly() {
            return this.mReadOnly;
        }

        public void reset(boolean z17) {
            com.tencent.wcdb.database.SQLiteConnection sQLiteConnection = this.mConnection.get();
            if (sQLiteConnection == null) {
                return;
            }
            sQLiteConnection.resetStatement(this, z17);
        }
    }

    /* loaded from: classes12.dex */
    public final class PreparedStatementCache extends com.tencent.wcdb.support.LruCache<java.lang.String, com.tencent.wcdb.database.SQLiteConnection.PreparedStatement> {
        public PreparedStatementCache(int i17) {
            super(i17);
        }

        public void dump(android.util.Printer printer) {
            printer.println("  Prepared statement cache:");
            java.util.Map<java.lang.String, com.tencent.wcdb.database.SQLiteConnection.PreparedStatement> snapshot = snapshot();
            if (snapshot.isEmpty()) {
                printer.println("    <none>");
                return;
            }
            int i17 = 0;
            for (java.util.Map.Entry<java.lang.String, com.tencent.wcdb.database.SQLiteConnection.PreparedStatement> entry : snapshot.entrySet()) {
                com.tencent.wcdb.database.SQLiteConnection.PreparedStatement value = entry.getValue();
                if (value.mInCache) {
                    printer.println("    " + i17 + ": statementPtr=0x" + java.lang.Long.toHexString(value.getPtr()) + ", numParameters=" + value.mNumParameters + ", type=" + value.mType + ", readOnly=" + value.mReadOnly + ", sql=\"" + com.tencent.wcdb.database.SQLiteConnection.trimSqlForDisplay(entry.getKey()) + "\"");
                }
                i17++;
            }
        }

        @Override // com.tencent.wcdb.support.LruCache
        public void entryRemoved(boolean z17, java.lang.String str, com.tencent.wcdb.database.SQLiteConnection.PreparedStatement preparedStatement, com.tencent.wcdb.database.SQLiteConnection.PreparedStatement preparedStatement2) {
            preparedStatement.mInCache = false;
            if (preparedStatement.mInUse) {
                return;
            }
            com.tencent.wcdb.database.SQLiteConnection.this.finalizePreparedStatement(preparedStatement);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private SQLiteConnection(com.tencent.wcdb.database.SQLiteConnectionPool sQLiteConnectionPool, com.tencent.wcdb.database.SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration, int i17, boolean z17, byte[] bArr, com.tencent.wcdb.database.SQLiteCipherSpec sQLiteCipherSpec) {
        this.mPassword = bArr;
        this.mCipher = sQLiteCipherSpec != null ? new com.tencent.wcdb.database.SQLiteCipherSpec(sQLiteCipherSpec) : null;
        this.mPool = sQLiteConnectionPool;
        com.tencent.wcdb.database.SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration2 = new com.tencent.wcdb.database.SQLiteDatabaseConfiguration(sQLiteDatabaseConfiguration);
        this.mConfiguration = sQLiteDatabaseConfiguration2;
        this.mConnectionId = i17;
        this.mIsPrimaryConnection = z17;
        this.mIsReadOnlyConnection = (sQLiteDatabaseConfiguration.openFlags & 1) != 0;
        this.mPreparedStatementCache = new com.tencent.wcdb.database.SQLiteConnection.PreparedStatementCache(sQLiteDatabaseConfiguration2.maxSqlCacheSize);
    }

    private void applyBlockGuardPolicy(com.tencent.wcdb.database.SQLiteConnection.PreparedStatement preparedStatement) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void attachCancellationSignal(com.tencent.wcdb.support.CancellationSignal cancellationSignal) {
        if (cancellationSignal != null) {
            cancellationSignal.throwIfCanceled();
            int i17 = this.mCancellationSignalAttachCount + 1;
            this.mCancellationSignalAttachCount = i17;
            if (i17 == 1) {
                nativeResetCancel(this.mConnectionPtr, true);
                cancellationSignal.setOnCancelListener(this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bindArguments(com.tencent.wcdb.database.SQLiteConnection.PreparedStatement preparedStatement, java.lang.Object[] objArr) {
        int length = objArr != null ? objArr.length : 0;
        if (length != preparedStatement.mNumParameters) {
            throw new com.tencent.wcdb.database.SQLiteBindOrColumnIndexOutOfRangeException("Expected " + preparedStatement.mNumParameters + " bind arguments but " + length + " were provided.");
        }
        if (length == 0) {
            return;
        }
        long ptr = preparedStatement.getPtr();
        for (int i17 = 0; i17 < length; i17++) {
            java.lang.Object obj = objArr[i17];
            int typeOfObject = com.tencent.wcdb.DatabaseUtils.getTypeOfObject(obj);
            if (typeOfObject == 0) {
                nativeBindNull(this.mConnectionPtr, ptr, i17 + 1);
            } else if (typeOfObject == 1) {
                nativeBindLong(this.mConnectionPtr, ptr, i17 + 1, ((java.lang.Number) obj).longValue());
            } else if (typeOfObject == 2) {
                nativeBindDouble(this.mConnectionPtr, ptr, i17 + 1, ((java.lang.Number) obj).doubleValue());
            } else if (typeOfObject == 4) {
                nativeBindBlob(this.mConnectionPtr, ptr, i17 + 1, (byte[]) obj);
            } else if (obj instanceof java.lang.Boolean) {
                nativeBindLong(this.mConnectionPtr, ptr, i17 + 1, ((java.lang.Boolean) obj).booleanValue() ? 1L : 0L);
            } else {
                nativeBindString(this.mConnectionPtr, ptr, i17 + 1, obj.toString());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void detachCancellationSignal(com.tencent.wcdb.support.CancellationSignal cancellationSignal) {
        if (cancellationSignal != null) {
            int i17 = this.mCancellationSignalAttachCount - 1;
            this.mCancellationSignalAttachCount = i17;
            if (i17 == 0) {
                cancellationSignal.setOnCancelListener(null);
                nativeResetCancel(this.mConnectionPtr, false);
            }
        }
    }

    private void dispose(boolean z17) {
        if (this.mConnectionPtr != 0) {
            int i17 = this.mRecentOperations.beginOperation("close", null, null).mCookie;
            try {
                this.mPreparedStatementCache.evictAll();
                nativeClose(this.mConnectionPtr);
                this.mConnectionPtr = 0L;
            } finally {
                this.mRecentOperations.endOperation(i17);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void finalizePreparedStatement(com.tencent.wcdb.database.SQLiteConnection.PreparedStatement preparedStatement) {
        nativeFinalizeStatement(this.mConnectionPtr, preparedStatement.getPtr());
        recyclePreparedStatement(preparedStatement);
    }

    private com.tencent.wcdb.database.SQLiteDebug.DbStats getMainDbStatsUnsafe(int i17, long j17, long j18) {
        java.lang.String str = this.mConfiguration.path;
        if (!this.mIsPrimaryConnection) {
            str = str + " (" + this.mConnectionId + ")";
        }
        return new com.tencent.wcdb.database.SQLiteDebug.DbStats(str, j17, j18, i17, this.mPreparedStatementCache.hitCount(), this.mPreparedStatementCache.missCount(), this.mPreparedStatementCache.size());
    }

    private static boolean isCacheable(int i17) {
        return i17 == 2 || i17 == 1;
    }

    private static native void nativeBindBlob(long j17, long j18, int i17, byte[] bArr);

    private static native void nativeBindDouble(long j17, long j18, int i17, double d17);

    private static native void nativeBindLong(long j17, long j18, int i17, long j19);

    private static native void nativeBindNull(long j17, long j18, int i17);

    private static native void nativeBindString(long j17, long j18, int i17, java.lang.String str);

    private static native void nativeCancel(long j17);

    private static native void nativeClose(long j17);

    private static native void nativeExecute(long j17, long j18);

    private static native int nativeExecuteForChangedRowCount(long j17, long j18);

    private static native long nativeExecuteForCursorWindow(long j17, long j18, long j19, int i17, int i18, boolean z17);

    private static native long nativeExecuteForLastInsertedRowId(long j17, long j18);

    private static native long nativeExecuteForLong(long j17, long j18);

    private static native java.lang.String nativeExecuteForString(long j17, long j18);

    private static native void nativeFinalizeStatement(long j17, long j18);

    private static native int nativeGetColumnCount(long j17, long j18);

    private static native java.lang.String nativeGetColumnName(long j17, long j18, int i17);

    private static native int nativeGetDbLookaside(long j17);

    private static native int nativeGetParameterCount(long j17, long j18);

    private static native boolean nativeIsReadOnly(long j17, long j18);

    private native long nativeOpen(java.lang.String str, int i17, java.lang.String str2);

    private static native long nativePrepareStatement(long j17, java.lang.String str);

    private static native void nativeRegisterCustomFunction(long j17, com.tencent.wcdb.database.SQLiteCustomFunction sQLiteCustomFunction);

    private static native void nativeRegisterLocalizedCollators(long j17, java.lang.String str);

    private static native void nativeResetCancel(long j17, boolean z17);

    private static native void nativeResetStatement(long j17, long j18, boolean z17);

    private static native long nativeSQLiteHandle(long j17, boolean z17);

    private static native void nativeSetKey(long j17, byte[] bArr);

    private static native void nativeSetUpdateNotification(long j17, boolean z17, boolean z18);

    private static native void nativeSetWalHook(long j17);

    private static native long nativeWalCheckpoint(long j17, int i17, java.lang.String str);

    private void notifyChange(java.lang.String str, java.lang.String str2, long[] jArr, long[] jArr2, long[] jArr3) {
        this.mPool.notifyChanges(str, str2, jArr, jArr2, jArr3);
    }

    private void notifyCheckpoint(java.lang.String str, int i17) {
        this.mPool.notifyCheckpoint(str, i17);
    }

    private com.tencent.wcdb.database.SQLiteConnection.PreparedStatement obtainPreparedStatement(java.lang.String str, long j17, int i17, int i18, boolean z17) {
        com.tencent.wcdb.database.SQLiteConnection.PreparedStatement preparedStatement = this.mPreparedStatementPool;
        if (preparedStatement != null) {
            this.mPreparedStatementPool = preparedStatement.mPoolNext;
            preparedStatement.mPoolNext = null;
            preparedStatement.mInCache = false;
        } else {
            preparedStatement = new com.tencent.wcdb.database.SQLiteConnection.PreparedStatement(this);
        }
        preparedStatement.mSql = str;
        preparedStatement.mStatementPtr = j17;
        preparedStatement.mNumParameters = i17;
        preparedStatement.mType = i18;
        preparedStatement.mReadOnly = z17;
        return preparedStatement;
    }

    public static com.tencent.wcdb.database.SQLiteConnection open(com.tencent.wcdb.database.SQLiteConnectionPool sQLiteConnectionPool, com.tencent.wcdb.database.SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration, int i17, boolean z17, byte[] bArr, com.tencent.wcdb.database.SQLiteCipherSpec sQLiteCipherSpec) {
        return new com.tencent.wcdb.database.SQLiteConnection(sQLiteConnectionPool, sQLiteDatabaseConfiguration, i17, z17, bArr, sQLiteCipherSpec);
    }

    private void recyclePreparedStatement(com.tencent.wcdb.database.SQLiteConnection.PreparedStatement preparedStatement) {
        preparedStatement.mSql = null;
        preparedStatement.mPoolNext = this.mPreparedStatementPool;
        this.mPreparedStatementPool = preparedStatement;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void resetStatement(com.tencent.wcdb.database.SQLiteConnection.PreparedStatement preparedStatement, boolean z17) {
        nativeResetStatement(this.mConnectionPtr, preparedStatement.getPtr(), z17);
    }

    private void setCheckpointStrategy() {
        if (this.mConfiguration.isInMemoryDb() || this.mIsReadOnlyConnection) {
            return;
        }
        if (this.mConfiguration.customWALHookEnabled) {
            nativeSetWalHook(this.mConnectionPtr);
        } else if (executeForLong("PRAGMA wal_autocheckpoint", null, null) != 100) {
            executeForLong("PRAGMA wal_autocheckpoint=100", null, null);
        }
    }

    private void setCipherSpec() {
        com.tencent.wcdb.database.SQLiteCipherSpec sQLiteCipherSpec = this.mCipher;
        if (sQLiteCipherSpec == null) {
            execute("PRAGMA kdf_iter=64000", null, null);
            execute("PRAGMA cipher_hmac_algorithm=HMAC_SHA1", null, null);
            execute("PRAGMA cipher_kdf_algorithm=PBKDF2_HMAC_SHA1", null, null);
            return;
        }
        if (sQLiteCipherSpec.kdfIteration != 0) {
            execute("PRAGMA kdf_iter=" + this.mCipher.kdfIteration, null, null);
        }
        execute("PRAGMA cipher_use_hmac=" + this.mCipher.hmacEnabled, null, null);
        if (this.mCipher.hmacAlgorithm != -1) {
            execute("PRAGMA cipher_hmac_algorithm=" + HMAC_ALGO_MAPPING[this.mCipher.hmacAlgorithm], null, null);
        }
        if (this.mCipher.kdfAlgorithm != -1) {
            execute("PRAGMA cipher_kdf_algorithm=" + PBKDF2_ALGO_MAPPING[this.mCipher.kdfAlgorithm], null, null);
        }
    }

    private void setForeignKeyModeFromConfiguration() {
        if (this.mIsReadOnlyConnection) {
            return;
        }
        long j17 = this.mConfiguration.foreignKeyConstraintsEnabled ? 1L : 0L;
        if (executeForLong("PRAGMA foreign_keys", null, null) != j17) {
            execute("PRAGMA foreign_keys=" + j17, null, null);
        }
    }

    private void setJournalMode(java.lang.String str) {
        java.lang.String executeForString = executeForString("PRAGMA journal_mode", null, null);
        if (executeForString.equalsIgnoreCase(str)) {
            return;
        }
        try {
            if (executeForString("PRAGMA journal_mode=" + str, null, null).equalsIgnoreCase(str)) {
                return;
            }
        } catch (com.tencent.wcdb.database.SQLiteDatabaseLockedException unused) {
        }
        com.tencent.wcdb.support.Log.w(TAG, "Could not change the database journal mode of '" + this.mConfiguration.label + "' from '" + executeForString + "' to '" + str + "' because the database is locked.  This usually means that there are other open connections to the database which prevents the database from enabling or disabling write-ahead logging mode.  Proceeding without changing the journal mode.");
    }

    private void setJournalSizeLimit() {
        if (this.mConfiguration.isInMemoryDb() || this.mIsReadOnlyConnection || executeForLong("PRAGMA journal_size_limit", null, null) == 524288) {
            return;
        }
        executeForLong("PRAGMA journal_size_limit=524288", null, null);
    }

    private void setLocaleFromConfiguration() {
        com.tencent.wcdb.database.SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration = this.mConfiguration;
        int i17 = sQLiteDatabaseConfiguration.openFlags | 16;
        sQLiteDatabaseConfiguration.openFlags = i17;
        if ((i17 & 16) != 0) {
            return;
        }
        java.lang.String locale = sQLiteDatabaseConfiguration.locale.toString();
        nativeRegisterLocalizedCollators(this.mConnectionPtr, locale);
        if (this.mIsReadOnlyConnection) {
            return;
        }
        try {
            execute("CREATE TABLE IF NOT EXISTS android_metadata (locale TEXT)", null, null);
            java.lang.String executeForString = executeForString("SELECT locale FROM android_metadata UNION SELECT NULL ORDER BY locale DESC LIMIT 1", null, null);
            if (executeForString == null || !executeForString.equals(locale)) {
                execute("BEGIN", null, null);
                try {
                    execute("DELETE FROM android_metadata", null, null);
                    execute("INSERT INTO android_metadata (locale) VALUES(?)", new java.lang.Object[]{locale}, null);
                    execute("REINDEX LOCALIZED", null, null);
                    execute("COMMIT", null, null);
                } catch (java.lang.Throwable th6) {
                    execute("ROLLBACK", null, null);
                    throw th6;
                }
            }
        } catch (java.lang.RuntimeException e17) {
            throw new com.tencent.wcdb.database.SQLiteException("Failed to change locale for db '" + this.mConfiguration.label + "' to '" + locale + "'.", e17);
        }
    }

    private void setPageSize() {
        java.lang.String str;
        int i17;
        if (this.mConfiguration.isInMemoryDb()) {
            return;
        }
        long j17 = 4096;
        if (this.mPassword != null) {
            com.tencent.wcdb.database.SQLiteCipherSpec sQLiteCipherSpec = this.mCipher;
            if (sQLiteCipherSpec != null && (i17 = sQLiteCipherSpec.pageSize) > 0) {
                j17 = i17;
            }
            str = "PRAGMA cipher_page_size";
        } else {
            str = "PRAGMA page_size";
        }
        if (executeForLong(str, null, null) != j17) {
            execute(str + "=" + j17, null, null);
        }
    }

    private void setReadOnlyFromConfiguration() {
        if (this.mIsReadOnlyConnection) {
            execute("PRAGMA query_only = 1", null, null);
        }
    }

    private void setSyncModeFromConfiguration() {
        execute("PRAGMA synchronous=" + this.mConfiguration.synchronousMode, null, null);
    }

    private void setUpdateNotificationFromConfiguration() {
        long j17 = this.mConnectionPtr;
        com.tencent.wcdb.database.SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration = this.mConfiguration;
        nativeSetUpdateNotification(j17, sQLiteDatabaseConfiguration.updateNotificationEnabled, sQLiteDatabaseConfiguration.updateNotificationRowID);
    }

    private void setWalModeFromConfiguration() {
        if (this.mConfiguration.isInMemoryDb() || this.mIsReadOnlyConnection) {
            return;
        }
        setJournalMode((this.mConfiguration.openFlags & com.tencent.wcdb.database.SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? "WAL" : com.tencent.wcdb.database.SQLiteGlobal.defaultJournalMode);
    }

    private void throwIfStatementForbidden(com.tencent.wcdb.database.SQLiteConnection.PreparedStatement preparedStatement) {
        if (!this.mOnlyAllowReadOnlyOperations || preparedStatement.mReadOnly) {
            return;
        }
        com.tencent.wcdb.support.Log.e(TAG, "Executing write operation in read-only connection.");
        java.lang.Throwable th6 = this.mAcquiredStack;
        if (th6 != null) {
            for (java.lang.StackTraceElement stackTraceElement : th6.getStackTrace()) {
                com.tencent.wcdb.support.Log.e(TAG, "  at " + stackTraceElement.toString());
            }
        }
        throw new com.tencent.wcdb.database.SQLiteException("Cannot execute this statement because it might modify the database but the connection is read-only.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static java.lang.String trimSqlForDisplay(java.lang.String str) {
        return TRIM_SQL_PATTERN.matcher(str).replaceAll(" ");
    }

    public com.tencent.wcdb.database.SQLiteConnection.PreparedStatement acquirePreparedStatement(java.lang.String str) {
        boolean z17;
        com.tencent.wcdb.database.SQLiteConnection.PreparedStatement preparedStatement = this.mPreparedStatementCache.get(str);
        if (preparedStatement == null) {
            z17 = false;
        } else {
            if (!preparedStatement.mInUse) {
                preparedStatement.mInUse = true;
                return preparedStatement;
            }
            z17 = true;
        }
        long nativePrepareStatement = nativePrepareStatement(this.mConnectionPtr, str);
        try {
            int nativeGetParameterCount = nativeGetParameterCount(this.mConnectionPtr, nativePrepareStatement);
            int sqlStatementType = com.tencent.wcdb.DatabaseUtils.getSqlStatementType(str);
            preparedStatement = obtainPreparedStatement(str, nativePrepareStatement, nativeGetParameterCount, sqlStatementType, nativeIsReadOnly(this.mConnectionPtr, nativePrepareStatement));
            if (!z17 && isCacheable(sqlStatementType)) {
                this.mPreparedStatementCache.put(str, preparedStatement);
                preparedStatement.mInCache = true;
            }
            preparedStatement.mInUse = true;
            return preparedStatement;
        } catch (java.lang.RuntimeException e17) {
            if (preparedStatement == null || !preparedStatement.mInCache) {
                nativeFinalizeStatement(this.mConnectionPtr, nativePrepareStatement);
            }
            throw e17;
        }
    }

    public void close() {
        dispose(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0043 A[Catch: all -> 0x00c8, SQLiteException -> 0x00cd, TRY_LEAVE, TryCatch #1 {SQLiteException -> 0x00cd, blocks: (B:9:0x002e, B:10:0x003d, B:12:0x0043, B:19:0x0086, B:21:0x009d, B:22:0x00b1), top: B:8:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009d A[Catch: all -> 0x00c8, SQLiteException -> 0x00cd, TryCatch #1 {SQLiteException -> 0x00cd, blocks: (B:9:0x002e, B:10:0x003d, B:12:0x0043, B:19:0x0086, B:21:0x009d, B:22:0x00b1), top: B:8:0x002e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void collectDbStats(java.util.ArrayList<com.tencent.wcdb.database.SQLiteDebug.DbStats> r26) {
        /*
            r25 = this;
            r9 = r25
            r0 = r26
            java.lang.String r10 = "PRAGMA "
            long r1 = r9.mConnectionPtr
            int r2 = nativeGetDbLookaside(r1)
            r11 = 0
            r12 = 0
            java.lang.String r1 = "PRAGMA page_count;"
            long r3 = r9.executeForLong(r1, r11, r11)     // Catch: com.tencent.wcdb.database.SQLiteException -> L1c
            java.lang.String r1 = "PRAGMA page_size;"
            long r5 = r9.executeForLong(r1, r11, r11)     // Catch: com.tencent.wcdb.database.SQLiteException -> L1d
            goto L1e
        L1c:
            r3 = r12
        L1d:
            r5 = r12
        L1e:
            r1 = r25
            com.tencent.wcdb.database.SQLiteDebug$DbStats r1 = r1.getMainDbStatsUnsafe(r2, r3, r5)
            r0.add(r1)
            com.tencent.wcdb.CursorWindow r14 = new com.tencent.wcdb.CursorWindow
            java.lang.String r1 = "collectDbStats"
            r14.<init>(r1)
            java.lang.String r2 = "PRAGMA database_list;"
            r3 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r1 = r25
            r4 = r14
            r1.executeForCursorWindow(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> Lc8 com.tencent.wcdb.database.SQLiteException -> Lcd
            r1 = 1
            r2 = r1
        L3d:
            int r3 = r14.getNumRows()     // Catch: java.lang.Throwable -> Lc8 com.tencent.wcdb.database.SQLiteException -> Lcd
            if (r2 >= r3) goto Lcd
            java.lang.String r3 = r14.getString(r2, r1)     // Catch: java.lang.Throwable -> Lc8 com.tencent.wcdb.database.SQLiteException -> Lcd
            r4 = 2
            java.lang.String r4 = r14.getString(r2, r4)     // Catch: java.lang.Throwable -> Lc8 com.tencent.wcdb.database.SQLiteException -> Lcd
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: com.tencent.wcdb.database.SQLiteException -> L81 java.lang.Throwable -> Lc8
            r5.<init>()     // Catch: com.tencent.wcdb.database.SQLiteException -> L81 java.lang.Throwable -> Lc8
            r5.append(r10)     // Catch: com.tencent.wcdb.database.SQLiteException -> L81 java.lang.Throwable -> Lc8
            r5.append(r3)     // Catch: com.tencent.wcdb.database.SQLiteException -> L81 java.lang.Throwable -> Lc8
            java.lang.String r6 = ".page_count;"
            r5.append(r6)     // Catch: com.tencent.wcdb.database.SQLiteException -> L81 java.lang.Throwable -> Lc8
            java.lang.String r5 = r5.toString()     // Catch: com.tencent.wcdb.database.SQLiteException -> L81 java.lang.Throwable -> Lc8
            long r5 = r9.executeForLong(r5, r11, r11)     // Catch: com.tencent.wcdb.database.SQLiteException -> L81 java.lang.Throwable -> Lc8
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: com.tencent.wcdb.database.SQLiteException -> L82 java.lang.Throwable -> Lc8
            r7.<init>()     // Catch: com.tencent.wcdb.database.SQLiteException -> L82 java.lang.Throwable -> Lc8
            r7.append(r10)     // Catch: com.tencent.wcdb.database.SQLiteException -> L82 java.lang.Throwable -> Lc8
            r7.append(r3)     // Catch: com.tencent.wcdb.database.SQLiteException -> L82 java.lang.Throwable -> Lc8
            java.lang.String r8 = ".page_size;"
            r7.append(r8)     // Catch: com.tencent.wcdb.database.SQLiteException -> L82 java.lang.Throwable -> Lc8
            java.lang.String r7 = r7.toString()     // Catch: com.tencent.wcdb.database.SQLiteException -> L82 java.lang.Throwable -> Lc8
            long r7 = r9.executeForLong(r7, r11, r11)     // Catch: com.tencent.wcdb.database.SQLiteException -> L82 java.lang.Throwable -> Lc8
            r17 = r5
            r19 = r7
            goto L86
        L81:
            r5 = r12
        L82:
            r17 = r5
            r19 = r12
        L86:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc8 com.tencent.wcdb.database.SQLiteException -> Lcd
            r5.<init>()     // Catch: java.lang.Throwable -> Lc8 com.tencent.wcdb.database.SQLiteException -> Lcd
            java.lang.String r6 = "  (attached) "
            r5.append(r6)     // Catch: java.lang.Throwable -> Lc8 com.tencent.wcdb.database.SQLiteException -> Lcd
            r5.append(r3)     // Catch: java.lang.Throwable -> Lc8 com.tencent.wcdb.database.SQLiteException -> Lcd
            java.lang.String r3 = r5.toString()     // Catch: java.lang.Throwable -> Lc8 com.tencent.wcdb.database.SQLiteException -> Lcd
            int r5 = r4.length()     // Catch: java.lang.Throwable -> Lc8 com.tencent.wcdb.database.SQLiteException -> Lcd
            if (r5 == 0) goto Lb1
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc8 com.tencent.wcdb.database.SQLiteException -> Lcd
            r5.<init>()     // Catch: java.lang.Throwable -> Lc8 com.tencent.wcdb.database.SQLiteException -> Lcd
            r5.append(r3)     // Catch: java.lang.Throwable -> Lc8 com.tencent.wcdb.database.SQLiteException -> Lcd
            java.lang.String r3 = ": "
            r5.append(r3)     // Catch: java.lang.Throwable -> Lc8 com.tencent.wcdb.database.SQLiteException -> Lcd
            r5.append(r4)     // Catch: java.lang.Throwable -> Lc8 com.tencent.wcdb.database.SQLiteException -> Lcd
            java.lang.String r3 = r5.toString()     // Catch: java.lang.Throwable -> Lc8 com.tencent.wcdb.database.SQLiteException -> Lcd
        Lb1:
            r16 = r3
            com.tencent.wcdb.database.SQLiteDebug$DbStats r3 = new com.tencent.wcdb.database.SQLiteDebug$DbStats     // Catch: java.lang.Throwable -> Lc8 com.tencent.wcdb.database.SQLiteException -> Lcd
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r15 = r3
            r15.<init>(r16, r17, r19, r21, r22, r23, r24)     // Catch: java.lang.Throwable -> Lc8 com.tencent.wcdb.database.SQLiteException -> Lcd
            r0.add(r3)     // Catch: java.lang.Throwable -> Lc8 com.tencent.wcdb.database.SQLiteException -> Lcd
            int r2 = r2 + 1
            goto L3d
        Lc8:
            r0 = move-exception
            r14.close()
            throw r0
        Lcd:
            r14.close()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.wcdb.database.SQLiteConnection.collectDbStats(java.util.ArrayList):void");
    }

    public void collectDbStatsUnsafe(java.util.ArrayList<com.tencent.wcdb.database.SQLiteDebug.DbStats> arrayList) {
        arrayList.add(getMainDbStatsUnsafe(0, 0L, 0L));
    }

    public java.lang.String describeCurrentOperationUnsafe() {
        return this.mRecentOperations.describeCurrentOperation();
    }

    public void dump(android.util.Printer printer, boolean z17) {
        printer.println("Connection #" + this.mConnectionId + ":");
        if (z17) {
            printer.println("  connectionPtr: 0x" + java.lang.Long.toHexString(this.mConnectionPtr));
        }
        printer.println("  isPrimaryConnection: " + this.mIsPrimaryConnection);
        printer.println("  onlyAllowReadOnlyOperations: " + this.mOnlyAllowReadOnlyOperations);
        if (this.mAcquiredThread != null) {
            printer.println("  acquiredThread: " + this.mAcquiredThread + " (tid: " + this.mAcquiredTid + ")");
        }
        this.mRecentOperations.dump(printer, z17);
        if (z17) {
            this.mPreparedStatementCache.dump(printer);
        }
    }

    public org.json.JSONObject dumpJSON(boolean z17) {
        org.json.JSONObject put = new org.json.JSONObject().put(dm.i4.COL_ID, this.mConnectionId).put("ptr", java.lang.Long.toHexString(this.mConnectionPtr)).put("primary", this.mIsPrimaryConnection).put("readOnly", this.mOnlyAllowReadOnlyOperations);
        java.lang.Thread thread = this.mAcquiredThread;
        org.json.JSONObject putOpt = put.putOpt("thread", thread != null ? thread.toString() : null);
        int i17 = this.mAcquiredTid;
        return putOpt.putOpt("tid", i17 > 0 ? java.lang.Integer.valueOf(i17) : null).put("operations", this.mRecentOperations.dumpJSON(z17));
    }

    public void endNativeHandle(java.lang.Exception exc) {
        int i17 = this.mNativeHandleCount - 1;
        this.mNativeHandleCount = i17;
        if (i17 != 0 || this.mNativeOperation == null) {
            return;
        }
        nativeSQLiteHandle(this.mConnectionPtr, false);
        if (exc == null) {
            this.mRecentOperations.endOperationDeferLog(this.mNativeOperation.mCookie);
        } else {
            this.mRecentOperations.failOperation(this.mNativeOperation.mCookie, exc);
        }
        this.mNativeOperation = null;
    }

    public void ensureOpen() {
        if (this.mConnectionPtr != 0) {
            return;
        }
        boolean z17 = this.mOnlyAllowReadOnlyOperations;
        try {
            try {
                this.mOnlyAllowReadOnlyOperations = false;
                open();
            } catch (com.tencent.wcdb.database.SQLiteException e17) {
                com.tencent.wcdb.database.SQLiteDebug.collectLastIOTraceStats(this);
                dispose(false);
                throw e17;
            }
        } finally {
            this.mOnlyAllowReadOnlyOperations = z17;
        }
    }

    public void execute(java.lang.String str, java.lang.Object[] objArr, com.tencent.wcdb.support.CancellationSignal cancellationSignal) {
        if (str == null) {
            throw new java.lang.IllegalArgumentException("sql must not be null.");
        }
        com.tencent.wcdb.database.SQLiteConnection.Operation beginOperation = this.mRecentOperations.beginOperation("execute", str, objArr);
        int i17 = beginOperation.mCookie;
        try {
            try {
                com.tencent.wcdb.database.SQLiteConnection.PreparedStatement acquirePreparedStatement = acquirePreparedStatement(str);
                beginOperation.mType = acquirePreparedStatement.mType;
                try {
                    throwIfStatementForbidden(acquirePreparedStatement);
                    bindArguments(acquirePreparedStatement, objArr);
                    applyBlockGuardPolicy(acquirePreparedStatement);
                    attachCancellationSignal(cancellationSignal);
                    try {
                        nativeExecute(this.mConnectionPtr, acquirePreparedStatement.getPtr());
                    } finally {
                        detachCancellationSignal(cancellationSignal);
                    }
                } finally {
                    releasePreparedStatement(acquirePreparedStatement);
                }
            } finally {
                this.mRecentOperations.endOperation(i17);
            }
        } catch (java.lang.RuntimeException e17) {
            this.mRecentOperations.failOperation(i17, e17);
            throw e17;
        }
    }

    public int executeForChangedRowCount(java.lang.String str, java.lang.Object[] objArr, com.tencent.wcdb.support.CancellationSignal cancellationSignal) {
        if (str == null) {
            throw new java.lang.IllegalArgumentException("sql must not be null.");
        }
        com.tencent.wcdb.database.SQLiteConnection.Operation beginOperation = this.mRecentOperations.beginOperation("executeForChangedRowCount", str, objArr);
        int i17 = beginOperation.mCookie;
        try {
            try {
                com.tencent.wcdb.database.SQLiteConnection.PreparedStatement acquirePreparedStatement = acquirePreparedStatement(str);
                beginOperation.mType = acquirePreparedStatement.mType;
                try {
                    throwIfStatementForbidden(acquirePreparedStatement);
                    bindArguments(acquirePreparedStatement, objArr);
                    applyBlockGuardPolicy(acquirePreparedStatement);
                    attachCancellationSignal(cancellationSignal);
                    try {
                        int nativeExecuteForChangedRowCount = nativeExecuteForChangedRowCount(this.mConnectionPtr, acquirePreparedStatement.getPtr());
                        if (this.mRecentOperations.endOperationDeferLog(i17)) {
                            this.mRecentOperations.logOperation(i17, "changedRows=" + nativeExecuteForChangedRowCount);
                        }
                        return nativeExecuteForChangedRowCount;
                    } finally {
                        detachCancellationSignal(cancellationSignal);
                    }
                } finally {
                    releasePreparedStatement(acquirePreparedStatement);
                }
            } catch (java.lang.Throwable th6) {
                if (this.mRecentOperations.endOperationDeferLog(i17)) {
                    this.mRecentOperations.logOperation(i17, "changedRows=0");
                }
                throw th6;
            }
        } catch (java.lang.RuntimeException e17) {
            this.mRecentOperations.failOperation(i17, e17);
            throw e17;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3, types: [com.tencent.wcdb.database.SQLiteConnection$OperationLog] */
    /* JADX WARN: Type inference failed for: r2v5, types: [com.tencent.wcdb.database.SQLiteConnection$OperationLog] */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v4, types: [int] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.String] */
    public int executeForCursorWindow(java.lang.String str, java.lang.Object[] objArr, com.tencent.wcdb.CursorWindow cursorWindow, int i17, int i18, boolean z17, com.tencent.wcdb.support.CancellationSignal cancellationSignal) {
        java.lang.String str2;
        int i19;
        ?? r152;
        ?? r96;
        ?? r47;
        int i27;
        int i28;
        int i29;
        com.tencent.wcdb.database.SQLiteConnection.PreparedStatement preparedStatement;
        int i37;
        int i38;
        int numRows;
        java.lang.String str3 = ", countedRows=";
        java.lang.String str4 = ", filledRows=";
        java.lang.String str5 = ", actualPos=";
        java.lang.String str6 = "', startPos=";
        ?? r86 = "window='";
        if (str == null) {
            throw new java.lang.IllegalArgumentException("sql must not be null.");
        }
        if (cursorWindow == null) {
            throw new java.lang.IllegalArgumentException("window must not be null.");
        }
        cursorWindow.acquireReference();
        try {
            ?? r57 = "executeForCursorWindow";
            com.tencent.wcdb.database.SQLiteConnection.Operation beginOperation = this.mRecentOperations.beginOperation("executeForCursorWindow", str, objArr);
            int i39 = beginOperation.mCookie;
            try {
                try {
                    com.tencent.wcdb.database.SQLiteConnection.PreparedStatement acquirePreparedStatement = acquirePreparedStatement(str);
                    beginOperation.mType = acquirePreparedStatement.mType;
                    try {
                        throwIfStatementForbidden(acquirePreparedStatement);
                        bindArguments(acquirePreparedStatement, objArr);
                        applyBlockGuardPolicy(acquirePreparedStatement);
                        attachCancellationSignal(cancellationSignal);
                        try {
                            try {
                                preparedStatement = acquirePreparedStatement;
                                i29 = i39;
                                try {
                                    long nativeExecuteForCursorWindow = nativeExecuteForCursorWindow(this.mConnectionPtr, acquirePreparedStatement.getPtr(), cursorWindow.mWindowPtr, i17, i18, z17);
                                    i28 = (int) (nativeExecuteForCursorWindow >> 32);
                                    i38 = (int) nativeExecuteForCursorWindow;
                                    try {
                                        numRows = cursorWindow.getNumRows();
                                        try {
                                            cursorWindow.setStartPosition(i28);
                                            try {
                                                detachCancellationSignal(cancellationSignal);
                                            } catch (java.lang.Throwable th6) {
                                                th = th6;
                                                try {
                                                    releasePreparedStatement(preparedStatement);
                                                    throw th;
                                                } catch (java.lang.RuntimeException e17) {
                                                    e = e17;
                                                    this.mRecentOperations.failOperation(i29, e);
                                                    throw e;
                                                }
                                            }
                                        } catch (java.lang.Throwable th7) {
                                            th = th7;
                                            i29 = i29;
                                            try {
                                                detachCancellationSignal(cancellationSignal);
                                                throw th;
                                            } catch (java.lang.Throwable th8) {
                                                th = th8;
                                                releasePreparedStatement(preparedStatement);
                                                throw th;
                                            }
                                        }
                                    } catch (java.lang.Throwable th9) {
                                        th = th9;
                                    }
                                } catch (java.lang.Throwable th10) {
                                    th = th10;
                                    i37 = i29;
                                    i29 = i37;
                                    detachCancellationSignal(cancellationSignal);
                                    throw th;
                                }
                            } catch (java.lang.Throwable th11) {
                                th = th11;
                                i37 = i39;
                                preparedStatement = acquirePreparedStatement;
                            }
                        } catch (java.lang.Throwable th12) {
                            th = th12;
                            preparedStatement = acquirePreparedStatement;
                            i37 = i39;
                        }
                    } catch (java.lang.Throwable th13) {
                        th = th13;
                        preparedStatement = acquirePreparedStatement;
                        i29 = i39;
                    }
                } catch (java.lang.Throwable th14) {
                    th = th14;
                    i28 = -1;
                    r47 = beginOperation;
                    i27 = r57;
                    i19 = r86;
                    r96 = i39;
                    r152 = str3;
                }
            } catch (java.lang.RuntimeException e18) {
                e = e18;
                i29 = i39;
            } catch (java.lang.Throwable th15) {
                th = th15;
                str2 = "', startPos=";
                str6 = ", filledRows=";
                str4 = "window='";
                i19 = i17;
                r152 = i39;
                r96 = ", actualPos=";
                str5 = ", countedRows=";
                r47 = -1;
                i27 = -1;
                i28 = -1;
            }
            try {
                releasePreparedStatement(preparedStatement);
                if (this.mRecentOperations.endOperationDeferLog(i29)) {
                    this.mRecentOperations.logOperation(i29, "window='" + cursorWindow + "', startPos=" + i17 + ", actualPos=" + i28 + ", filledRows=" + numRows + ", countedRows=" + i38);
                }
                return i38;
            } catch (java.lang.RuntimeException e19) {
                e = e19;
                this.mRecentOperations.failOperation(i29, e);
                throw e;
            } catch (java.lang.Throwable th16) {
                th = th16;
                i19 = i17;
                str4 = "window='";
                str5 = ", countedRows=";
                str2 = "', startPos=";
                r96 = ", actualPos=";
                str6 = ", filledRows=";
                r47 = i38;
                i27 = numRows;
                r152 = i29;
                if (this.mRecentOperations.endOperationDeferLog(r152)) {
                    this.mRecentOperations.logOperation(r152, str4 + cursorWindow + str2 + i19 + r96 + i28 + str6 + i27 + str5 + r47);
                }
                throw th;
            }
        } finally {
            cursorWindow.releaseReference();
        }
    }

    public long executeForLastInsertedRowId(java.lang.String str, java.lang.Object[] objArr, com.tencent.wcdb.support.CancellationSignal cancellationSignal) {
        if (str == null) {
            throw new java.lang.IllegalArgumentException("sql must not be null.");
        }
        com.tencent.wcdb.database.SQLiteConnection.Operation beginOperation = this.mRecentOperations.beginOperation("executeForLastInsertedRowId", str, objArr);
        int i17 = beginOperation.mCookie;
        try {
            try {
                com.tencent.wcdb.database.SQLiteConnection.PreparedStatement acquirePreparedStatement = acquirePreparedStatement(str);
                beginOperation.mType = acquirePreparedStatement.mType;
                try {
                    throwIfStatementForbidden(acquirePreparedStatement);
                    bindArguments(acquirePreparedStatement, objArr);
                    applyBlockGuardPolicy(acquirePreparedStatement);
                    attachCancellationSignal(cancellationSignal);
                    try {
                        return nativeExecuteForLastInsertedRowId(this.mConnectionPtr, acquirePreparedStatement.getPtr());
                    } finally {
                        detachCancellationSignal(cancellationSignal);
                    }
                } finally {
                    releasePreparedStatement(acquirePreparedStatement);
                }
            } catch (java.lang.RuntimeException e17) {
                this.mRecentOperations.failOperation(i17, e17);
                throw e17;
            }
        } finally {
            this.mRecentOperations.endOperation(i17);
        }
    }

    public long executeForLong(java.lang.String str, java.lang.Object[] objArr, com.tencent.wcdb.support.CancellationSignal cancellationSignal) {
        if (str == null) {
            throw new java.lang.IllegalArgumentException("sql must not be null.");
        }
        com.tencent.wcdb.database.SQLiteConnection.Operation beginOperation = this.mRecentOperations.beginOperation("executeForLong", str, objArr);
        int i17 = beginOperation.mCookie;
        try {
            try {
                com.tencent.wcdb.database.SQLiteConnection.PreparedStatement acquirePreparedStatement = acquirePreparedStatement(str);
                beginOperation.mType = acquirePreparedStatement.mType;
                try {
                    throwIfStatementForbidden(acquirePreparedStatement);
                    bindArguments(acquirePreparedStatement, objArr);
                    applyBlockGuardPolicy(acquirePreparedStatement);
                    attachCancellationSignal(cancellationSignal);
                    try {
                        return nativeExecuteForLong(this.mConnectionPtr, acquirePreparedStatement.getPtr());
                    } finally {
                        detachCancellationSignal(cancellationSignal);
                    }
                } finally {
                    releasePreparedStatement(acquirePreparedStatement);
                }
            } catch (java.lang.RuntimeException e17) {
                this.mRecentOperations.failOperation(i17, e17);
                throw e17;
            }
        } finally {
            this.mRecentOperations.endOperation(i17);
        }
    }

    public java.lang.String executeForString(java.lang.String str, java.lang.Object[] objArr, com.tencent.wcdb.support.CancellationSignal cancellationSignal) {
        if (str == null) {
            throw new java.lang.IllegalArgumentException("sql must not be null.");
        }
        com.tencent.wcdb.database.SQLiteConnection.Operation beginOperation = this.mRecentOperations.beginOperation("executeForString", str, objArr);
        int i17 = beginOperation.mCookie;
        try {
            try {
                com.tencent.wcdb.database.SQLiteConnection.PreparedStatement acquirePreparedStatement = acquirePreparedStatement(str);
                beginOperation.mType = acquirePreparedStatement.mType;
                try {
                    throwIfStatementForbidden(acquirePreparedStatement);
                    bindArguments(acquirePreparedStatement, objArr);
                    applyBlockGuardPolicy(acquirePreparedStatement);
                    attachCancellationSignal(cancellationSignal);
                    try {
                        return nativeExecuteForString(this.mConnectionPtr, acquirePreparedStatement.getPtr());
                    } finally {
                        detachCancellationSignal(cancellationSignal);
                    }
                } finally {
                    releasePreparedStatement(acquirePreparedStatement);
                }
            } catch (java.lang.RuntimeException e17) {
                this.mRecentOperations.failOperation(i17, e17);
                throw e17;
            }
        } finally {
            this.mRecentOperations.endOperation(i17);
        }
    }

    public void finalize() {
        try {
            com.tencent.wcdb.database.SQLiteConnectionPool sQLiteConnectionPool = this.mPool;
            if (sQLiteConnectionPool != null && this.mConnectionPtr != 0) {
                sQLiteConnectionPool.onConnectionLeaked();
            }
            dispose(true);
        } finally {
            super.finalize();
        }
    }

    public int getConnectionId() {
        return this.mConnectionId;
    }

    public long getNativeHandle(java.lang.String str) {
        if (this.mConnectionPtr == 0) {
            return 0L;
        }
        if (str != null && this.mNativeOperation == null) {
            com.tencent.wcdb.database.SQLiteConnection.Operation beginOperation = this.mRecentOperations.beginOperation(str, null, null);
            this.mNativeOperation = beginOperation;
            beginOperation.mType = 99;
        }
        this.mNativeHandleCount++;
        return nativeSQLiteHandle(this.mConnectionPtr, true);
    }

    public boolean isPreparedStatementInCache(java.lang.String str) {
        return this.mPreparedStatementCache.get(str) != null;
    }

    public boolean isPrimaryConnection() {
        return this.mIsPrimaryConnection;
    }

    @Override // com.tencent.wcdb.support.CancellationSignal.OnCancelListener
    public void onCancel() {
        nativeCancel(this.mConnectionPtr);
    }

    public void prepare(java.lang.String str, com.tencent.wcdb.database.SQLiteStatementInfo sQLiteStatementInfo) {
        if (str == null) {
            throw new java.lang.IllegalArgumentException("sql must not be null.");
        }
        com.tencent.wcdb.database.SQLiteConnection.Operation beginOperation = this.mRecentOperations.beginOperation("prepare", str, null);
        int i17 = beginOperation.mCookie;
        try {
            try {
                com.tencent.wcdb.database.SQLiteConnection.PreparedStatement acquirePreparedStatement = acquirePreparedStatement(str);
                beginOperation.mType = acquirePreparedStatement.mType;
                if (sQLiteStatementInfo != null) {
                    try {
                        sQLiteStatementInfo.numParameters = acquirePreparedStatement.mNumParameters;
                        sQLiteStatementInfo.readOnly = acquirePreparedStatement.mReadOnly;
                        int nativeGetColumnCount = nativeGetColumnCount(this.mConnectionPtr, acquirePreparedStatement.getPtr());
                        if (nativeGetColumnCount == 0) {
                            sQLiteStatementInfo.columnNames = EMPTY_STRING_ARRAY;
                        } else {
                            sQLiteStatementInfo.columnNames = new java.lang.String[nativeGetColumnCount];
                            for (int i18 = 0; i18 < nativeGetColumnCount; i18++) {
                                sQLiteStatementInfo.columnNames[i18] = nativeGetColumnName(this.mConnectionPtr, acquirePreparedStatement.getPtr(), i18);
                            }
                        }
                    } finally {
                        releasePreparedStatement(acquirePreparedStatement);
                    }
                }
            } catch (java.lang.RuntimeException e17) {
                this.mRecentOperations.failOperation(i17, e17);
                throw e17;
            }
        } finally {
            this.mRecentOperations.endOperation(i17);
        }
    }

    public void reconfigure(com.tencent.wcdb.database.SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration) {
        this.mOnlyAllowReadOnlyOperations = false;
        long j17 = com.tencent.wcdb.database.WCDBInitializationProbe.apiEnv;
        long nativeSQLiteHandle = nativeSQLiteHandle(this.mConnectionPtr, true);
        try {
            java.util.Iterator<com.tencent.wcdb.extension.SQLiteExtension> it = sQLiteDatabaseConfiguration.extensions.iterator();
            while (it.hasNext()) {
                com.tencent.wcdb.extension.SQLiteExtension next = it.next();
                if (!this.mConfiguration.extensions.contains(next)) {
                    next.initialize(nativeSQLiteHandle, j17);
                }
            }
            nativeSQLiteHandle(this.mConnectionPtr, false);
            int i17 = sQLiteDatabaseConfiguration.openFlags;
            com.tencent.wcdb.database.SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration2 = this.mConfiguration;
            boolean z17 = ((i17 ^ sQLiteDatabaseConfiguration2.openFlags) & com.tencent.wcdb.database.SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0;
            boolean z18 = sQLiteDatabaseConfiguration.foreignKeyConstraintsEnabled != sQLiteDatabaseConfiguration2.foreignKeyConstraintsEnabled;
            boolean z19 = !sQLiteDatabaseConfiguration.locale.equals(sQLiteDatabaseConfiguration2.locale);
            boolean z27 = sQLiteDatabaseConfiguration.customWALHookEnabled;
            com.tencent.wcdb.database.SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration3 = this.mConfiguration;
            boolean z28 = z27 != sQLiteDatabaseConfiguration3.customWALHookEnabled;
            boolean z29 = sQLiteDatabaseConfiguration.synchronousMode != sQLiteDatabaseConfiguration3.synchronousMode;
            boolean z37 = (sQLiteDatabaseConfiguration.updateNotificationEnabled == sQLiteDatabaseConfiguration3.updateNotificationEnabled && sQLiteDatabaseConfiguration.updateNotificationRowID == sQLiteDatabaseConfiguration3.updateNotificationRowID) ? false : true;
            sQLiteDatabaseConfiguration3.updateParametersFrom(sQLiteDatabaseConfiguration);
            this.mPreparedStatementCache.resize(sQLiteDatabaseConfiguration.maxSqlCacheSize);
            if (z18) {
                setForeignKeyModeFromConfiguration();
            }
            if (z17) {
                setWalModeFromConfiguration();
            }
            if (z29) {
                setSyncModeFromConfiguration();
            }
            if (z28) {
                setCheckpointStrategy();
            }
            if (z19) {
                setLocaleFromConfiguration();
            }
            if (z37) {
                setUpdateNotificationFromConfiguration();
            }
        } catch (java.lang.Throwable th6) {
            nativeSQLiteHandle(this.mConnectionPtr, false);
            throw th6;
        }
    }

    public void releasePreparedStatement(com.tencent.wcdb.database.SQLiteConnection.PreparedStatement preparedStatement) {
        preparedStatement.mInUse = false;
        if (!preparedStatement.mInCache) {
            finalizePreparedStatement(preparedStatement);
            return;
        }
        try {
            resetStatement(preparedStatement, true);
        } catch (com.tencent.wcdb.database.SQLiteException unused) {
            this.mPreparedStatementCache.remove(preparedStatement.mSql);
        }
    }

    public void setAcquisitionState(boolean z17, boolean z18) {
        if (!z17) {
            this.mAcquiredThread = null;
            this.mAcquiredTid = 0;
            this.mAcquiredStack = null;
            this.mAcquiredTimestamp = 0L;
            return;
        }
        this.mAcquiredThread = java.lang.Thread.currentThread();
        this.mAcquiredTid = android.os.Process.myTid();
        if (z18) {
            this.mAcquiredStack = new java.lang.Throwable();
            this.mAcquiredTimestamp = java.lang.System.currentTimeMillis();
        } else {
            this.mAcquiredStack = null;
            this.mAcquiredTimestamp = 0L;
        }
    }

    public void setOnlyAllowReadOnlyOperations(boolean z17) {
        this.mOnlyAllowReadOnlyOperations = z17;
    }

    public java.lang.String toString() {
        return "SQLiteConnection: " + this.mConfiguration.path + " (" + this.mConnectionId + ")";
    }

    public com.tencent.wcdb.database.SQLiteTrace.TraceInfo<java.lang.String> traceCurrentOperationUnsafe() {
        return this.mRecentOperations.traceCurrentOperation();
    }

    public com.tencent.wcdb.database.SQLiteTrace.TraceInfo<java.lang.StackTraceElement[]> tracePersistAcquisitionUnsafe() {
        java.lang.Throwable th6 = this.mAcquiredStack;
        if (th6 == null) {
            return null;
        }
        return new com.tencent.wcdb.database.SQLiteTrace.TraceInfo<>(th6.getStackTrace(), this.mAcquiredTimestamp, this.mAcquiredTid);
    }

    public android.util.Pair<java.lang.Integer, java.lang.Integer> walCheckpoint(java.lang.String str, int i17) {
        if (str == null || str.isEmpty()) {
            str = com.tencent.matrix.battery.accumulate.persist.FlattProperty.PROC_MM;
        }
        long nativeWalCheckpoint = nativeWalCheckpoint(this.mConnectionPtr, i17, str);
        return new android.util.Pair<>(java.lang.Integer.valueOf((int) (nativeWalCheckpoint >> 32)), java.lang.Integer.valueOf((int) (nativeWalCheckpoint & io.flutter.embedding.android.KeyboardMap.kValueMask)));
    }

    private void open() {
        com.tencent.wcdb.database.SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration = this.mConfiguration;
        long nativeOpen = nativeOpen(sQLiteDatabaseConfiguration.path, sQLiteDatabaseConfiguration.openFlags, sQLiteDatabaseConfiguration.vfsName);
        this.mConnectionPtr = nativeOpen;
        byte[] bArr = this.mPassword;
        if (bArr != null && bArr.length == 0) {
            this.mPassword = null;
        }
        byte[] bArr2 = this.mPassword;
        if (bArr2 != null) {
            nativeSetKey(nativeOpen, bArr2);
            setCipherSpec();
        }
        setPageSize();
        setReadOnlyFromConfiguration();
        setForeignKeyModeFromConfiguration();
        setWalModeFromConfiguration();
        setSyncModeFromConfiguration();
        setJournalSizeLimit();
        setCheckpointStrategy();
        setLocaleFromConfiguration();
        long j17 = com.tencent.wcdb.database.WCDBInitializationProbe.apiEnv;
        long nativeSQLiteHandle = nativeSQLiteHandle(this.mConnectionPtr, true);
        try {
            java.util.Iterator<com.tencent.wcdb.extension.SQLiteExtension> it = this.mConfiguration.extensions.iterator();
            while (it.hasNext()) {
                it.next().initialize(nativeSQLiteHandle, j17);
            }
            nativeSQLiteHandle(this.mConnectionPtr, false);
            setUpdateNotificationFromConfiguration();
        } catch (java.lang.Throwable th6) {
            nativeSQLiteHandle(this.mConnectionPtr, false);
            throw th6;
        }
    }
}
