package com.tencent.wcdb.database;

/* loaded from: classes12.dex */
public final class SQLiteDatabase extends com.tencent.wcdb.database.SQLiteClosable {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final int CHECKPOINT_FULL = 1;
    public static final int CHECKPOINT_PASSIVE = 0;
    public static final int CHECKPOINT_RESTART = 2;
    public static final int CHECKPOINT_TRUNCATE = 3;
    public static final int CONFLICT_ABORT = 2;
    public static final int CONFLICT_FAIL = 3;
    public static final int CONFLICT_IGNORE = 4;
    public static final int CONFLICT_NONE = 0;
    public static final int CONFLICT_REPLACE = 5;
    public static final int CONFLICT_ROLLBACK = 1;
    private static final java.lang.String[] CONFLICT_VALUES;
    public static final int CREATE_IF_NECESSARY = 268435456;
    public static final int ENABLE_IO_TRACE = 256;
    public static final int ENABLE_WRITE_AHEAD_LOGGING = 536870912;
    public static final int MAX_SQL_CACHE_SIZE = 100;
    public static final int NO_LOCALIZED_COLLATORS = 16;
    public static final int OPEN_READONLY = 1;
    public static final int OPEN_READWRITE = 0;
    private static final int OPEN_READ_MASK = 1;
    public static final int SQLITE_MAX_LIKE_PATTERN_LENGTH = 50000;
    public static final int SYNCHRONOUS_EXTRA = 3;
    public static final int SYNCHRONOUS_FULL = 2;
    public static final int SYNCHRONOUS_NORMAL = 1;
    public static final int SYNCHRONOUS_OFF = 0;
    private static final java.lang.String TAG = "WCDB.SQLiteDatabase";
    private static final java.util.WeakHashMap<com.tencent.wcdb.database.SQLiteDatabase, java.lang.Object> sActiveDatabases;
    private final com.tencent.wcdb.database.SQLiteDatabaseConfiguration mConfigurationLocked;
    private com.tencent.wcdb.database.SQLiteConnectionPool mConnectionPoolLocked;
    private final com.tencent.wcdb.database.SQLiteDatabase.CursorFactory mCursorFactory;
    private final com.tencent.wcdb.DatabaseErrorHandler mErrorHandler;
    private boolean mHasAttachedDbsLocked;
    private final java.lang.ThreadLocal<com.tencent.wcdb.database.SQLiteSession> mThreadSession = new java.lang.ThreadLocal<com.tencent.wcdb.database.SQLiteSession>() { // from class: com.tencent.wcdb.database.SQLiteDatabase.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.lang.ThreadLocal
        public com.tencent.wcdb.database.SQLiteSession initialValue() {
            return com.tencent.wcdb.database.SQLiteDatabase.this.createSession();
        }
    };
    private final java.lang.Object mLock = new java.lang.Object();

    /* loaded from: classes12.dex */
    public interface CursorFactory {
        com.tencent.wcdb.Cursor newCursor(com.tencent.wcdb.database.SQLiteDatabase sQLiteDatabase, com.tencent.wcdb.database.SQLiteCursorDriver sQLiteCursorDriver, java.lang.String str, com.tencent.wcdb.database.SQLiteProgram sQLiteProgram);

        com.tencent.wcdb.database.SQLiteProgram newQuery(com.tencent.wcdb.database.SQLiteDatabase sQLiteDatabase, java.lang.String str, java.lang.Object[] objArr, com.tencent.wcdb.support.CancellationSignal cancellationSignal);
    }

    /* loaded from: classes12.dex */
    public interface CustomFunction {
        void callback(java.lang.String[] strArr);
    }

    static {
        com.tencent.wcdb.database.SQLiteGlobal.loadLib();
        sActiveDatabases = new java.util.WeakHashMap<>();
        CONFLICT_VALUES = new java.lang.String[]{"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};
    }

    private SQLiteDatabase(java.lang.String str, int i17, com.tencent.wcdb.database.SQLiteDatabase.CursorFactory cursorFactory, com.tencent.wcdb.DatabaseErrorHandler databaseErrorHandler) {
        this.mCursorFactory = cursorFactory;
        this.mErrorHandler = databaseErrorHandler == null ? new com.tencent.wcdb.DefaultDatabaseErrorHandler(true) : databaseErrorHandler;
        this.mConfigurationLocked = new com.tencent.wcdb.database.SQLiteDatabaseConfiguration(str, i17);
    }

    private void collectDbStats(java.util.ArrayList<com.tencent.wcdb.database.SQLiteDebug.DbStats> arrayList) {
        synchronized (this.mLock) {
            com.tencent.wcdb.database.SQLiteConnectionPool sQLiteConnectionPool = this.mConnectionPoolLocked;
            if (sQLiteConnectionPool != null) {
                sQLiteConnectionPool.collectDbStats(arrayList);
            }
        }
    }

    public static com.tencent.wcdb.database.SQLiteDatabase create(com.tencent.wcdb.database.SQLiteDatabase.CursorFactory cursorFactory) {
        return openDatabase(com.tencent.wcdb.database.SQLiteDatabaseConfiguration.MEMORY_DB_PATH, cursorFactory, 268435456);
    }

    public static boolean deleteDatabase(java.io.File file) {
        if (file == null) {
            throw new java.lang.IllegalArgumentException("file must not be null");
        }
        boolean delete = file.delete() | new java.io.File(file.getPath() + "-journal").delete() | new java.io.File(file.getPath() + "-shm").delete() | new java.io.File(file.getPath() + "-wal").delete();
        java.io.File parentFile = file.getParentFile();
        if (parentFile != null) {
            final java.lang.String str = file.getName() + "-mj";
            java.io.File[] listFiles = parentFile.listFiles(new java.io.FileFilter() { // from class: com.tencent.wcdb.database.SQLiteDatabase.2
                @Override // java.io.FileFilter
                public boolean accept(java.io.File file2) {
                    return file2.getName().startsWith(str);
                }
            });
            if (listFiles != null) {
                for (java.io.File file2 : listFiles) {
                    delete |= file2.delete();
                }
            }
        }
        return delete;
    }

    private void dispose(boolean z17) {
        com.tencent.wcdb.database.SQLiteConnectionPool sQLiteConnectionPool;
        synchronized (this.mLock) {
            sQLiteConnectionPool = this.mConnectionPoolLocked;
            this.mConnectionPoolLocked = null;
        }
        if (z17) {
            return;
        }
        java.util.WeakHashMap<com.tencent.wcdb.database.SQLiteDatabase, java.lang.Object> weakHashMap = sActiveDatabases;
        synchronized (weakHashMap) {
            weakHashMap.remove(this);
        }
        if (sQLiteConnectionPool != null) {
            sQLiteConnectionPool.close();
        }
    }

    public static void dumpAll(android.util.Printer printer, boolean z17) {
        java.util.Iterator<com.tencent.wcdb.database.SQLiteDatabase> it = getActiveDatabases().iterator();
        while (it.hasNext()) {
            it.next().dump(printer, z17);
        }
    }

    public static org.json.JSONArray dumpAllJSON(boolean z17) {
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        java.util.Iterator<com.tencent.wcdb.database.SQLiteDatabase> it = getActiveDatabases().iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next().dumpJSON(z17));
        }
        return jSONArray;
    }

    private int executeSql(java.lang.String str, java.lang.Object[] objArr, com.tencent.wcdb.support.CancellationSignal cancellationSignal) {
        boolean z17;
        acquireReference();
        try {
            if (com.tencent.wcdb.DatabaseUtils.getSqlStatementType(str) == 3) {
                synchronized (this.mLock) {
                    if (this.mHasAttachedDbsLocked) {
                        z17 = false;
                    } else {
                        z17 = true;
                        this.mHasAttachedDbsLocked = true;
                    }
                }
                if (z17) {
                    disableWriteAheadLogging();
                }
            }
            com.tencent.wcdb.database.SQLiteStatement sQLiteStatement = new com.tencent.wcdb.database.SQLiteStatement(this, str, objArr);
            try {
                return sQLiteStatement.executeUpdateDelete(cancellationSignal);
            } finally {
                sQLiteStatement.close();
            }
        } finally {
            releaseReference();
        }
    }

    public static java.lang.String findEditTable(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            throw new java.lang.IllegalStateException("Invalid tables");
        }
        int indexOf = str.indexOf(32);
        int indexOf2 = str.indexOf(44);
        return (indexOf <= 0 || (indexOf >= indexOf2 && indexOf2 >= 0)) ? indexOf2 > 0 ? (indexOf2 < indexOf || indexOf < 0) ? str.substring(0, indexOf2) : str : str : str.substring(0, indexOf);
    }

    private static java.util.ArrayList<com.tencent.wcdb.database.SQLiteDatabase> getActiveDatabases() {
        java.util.ArrayList<com.tencent.wcdb.database.SQLiteDatabase> arrayList = new java.util.ArrayList<>();
        java.util.WeakHashMap<com.tencent.wcdb.database.SQLiteDatabase, java.lang.Object> weakHashMap = sActiveDatabases;
        synchronized (weakHashMap) {
            arrayList.addAll(weakHashMap.keySet());
        }
        return arrayList;
    }

    public static java.util.ArrayList<com.tencent.wcdb.database.SQLiteDebug.DbStats> getDbStats() {
        java.util.ArrayList<com.tencent.wcdb.database.SQLiteDebug.DbStats> arrayList = new java.util.ArrayList<>();
        java.util.Iterator<com.tencent.wcdb.database.SQLiteDatabase> it = getActiveDatabases().iterator();
        while (it.hasNext()) {
            it.next().collectDbStats(arrayList);
        }
        return arrayList;
    }

    private static boolean isMainThread() {
        android.os.Looper myLooper = android.os.Looper.myLooper();
        return myLooper != null && myLooper == android.os.Looper.getMainLooper();
    }

    private boolean isReadOnlyLocked() {
        return (this.mConfigurationLocked.openFlags & 1) == 1;
    }

    private java.util.Set<java.lang.String> keySet(android.content.ContentValues contentValues) {
        return contentValues.keySet();
    }

    private void open(byte[] bArr, com.tencent.wcdb.database.SQLiteCipherSpec sQLiteCipherSpec, int i17) {
        try {
            try {
                openInner(bArr, sQLiteCipherSpec, i17);
            } catch (com.tencent.wcdb.database.SQLiteDatabaseCorruptException unused) {
                onCorruption();
                openInner(bArr, sQLiteCipherSpec, i17);
            }
        } catch (com.tencent.wcdb.database.SQLiteException e17) {
            com.tencent.wcdb.support.Log.e(TAG, "Failed to open database '" + getLabel() + "'.", e17);
            close();
            throw e17;
        }
    }

    public static com.tencent.wcdb.database.SQLiteDatabase openDatabase(java.lang.String str, com.tencent.wcdb.database.SQLiteDatabase.CursorFactory cursorFactory, int i17) {
        return openDatabase(str, cursorFactory, i17, null);
    }

    private void openInner(byte[] bArr, com.tencent.wcdb.database.SQLiteCipherSpec sQLiteCipherSpec, int i17) {
        synchronized (this.mLock) {
            this.mConnectionPoolLocked = com.tencent.wcdb.database.SQLiteConnectionPool.open(this, this.mConfigurationLocked, bArr, sQLiteCipherSpec, i17);
        }
        java.util.WeakHashMap<com.tencent.wcdb.database.SQLiteDatabase, java.lang.Object> weakHashMap = sActiveDatabases;
        synchronized (weakHashMap) {
            weakHashMap.put(this, null);
        }
    }

    public static com.tencent.wcdb.database.SQLiteDatabase openOrCreateDatabase(java.io.File file, com.tencent.wcdb.database.SQLiteDatabase.CursorFactory cursorFactory) {
        return openOrCreateDatabase(file.getPath(), cursorFactory);
    }

    public static com.tencent.wcdb.database.SQLiteDatabase openOrCreateDatabaseInWalMode(java.lang.String str, com.tencent.wcdb.database.SQLiteDatabase.CursorFactory cursorFactory) {
        return openDatabase(str, null, null, cursorFactory, 805306368, null, 0);
    }

    public static com.tencent.wcdb.database.SQLiteDatabase openOrCreateMemoryDatabaseInWalMode(com.tencent.wcdb.database.SQLiteDatabase.CursorFactory cursorFactory) {
        return openDatabase(com.tencent.wcdb.database.SQLiteDatabaseConfiguration.MEMORY_DB_PATH, null, null, cursorFactory, 805306368, null, 0);
    }

    public static int releaseMemory() {
        return com.tencent.wcdb.database.SQLiteGlobal.releaseMemory();
    }

    private void throwIfNotOpenLocked() {
        if (this.mConnectionPoolLocked != null) {
            return;
        }
        throw new java.lang.IllegalStateException("The database '" + this.mConfigurationLocked.label + "' is not open.");
    }

    private boolean yieldIfContendedHelper(boolean z17, long j17) {
        acquireReference();
        try {
            return getThreadSession().yieldTransaction(j17, z17, null);
        } finally {
            releaseReference();
        }
    }

    public long acquireNativeConnectionHandle(java.lang.String str, boolean z17, boolean z18) {
        if (str == null) {
            str = "unnamedNative";
        }
        int i17 = z17 ? 1 : 2;
        if (z18) {
            i17 |= 4;
        }
        long nativeHandle = getThreadSession().acquireConnectionForNativeHandle(i17).getNativeHandle(str);
        if (nativeHandle != 0) {
            return nativeHandle;
        }
        throw new java.lang.IllegalStateException("SQLiteConnection native handle not initialized.");
    }

    public void addExtension(com.tencent.wcdb.extension.SQLiteExtension sQLiteExtension) {
        synchronized (this.mLock) {
            throwIfNotOpenLocked();
            if (this.mConfigurationLocked.extensions.add(sQLiteExtension)) {
                try {
                    this.mConnectionPoolLocked.reconfigure(this.mConfigurationLocked);
                } catch (java.lang.RuntimeException e17) {
                    this.mConfigurationLocked.extensions.remove(sQLiteExtension);
                    throw e17;
                }
            }
        }
    }

    public void beginTransaction() {
        beginTransaction(null, true);
    }

    public void beginTransactionNonExclusive() {
        beginTransaction(null, false);
    }

    public void beginTransactionWithListener(android.database.sqlite.SQLiteTransactionListener sQLiteTransactionListener) {
        beginTransaction(sQLiteTransactionListener, true);
    }

    public void beginTransactionWithListenerNonExclusive(android.database.sqlite.SQLiteTransactionListener sQLiteTransactionListener) {
        beginTransaction(sQLiteTransactionListener, false);
    }

    public com.tencent.wcdb.database.SQLiteStatement compileStatement(java.lang.String str) {
        acquireReference();
        try {
            return new com.tencent.wcdb.database.SQLiteStatement(this, str, null);
        } finally {
            releaseReference();
        }
    }

    public com.tencent.wcdb.database.SQLiteSession createSession() {
        com.tencent.wcdb.database.SQLiteConnectionPool sQLiteConnectionPool;
        synchronized (this.mLock) {
            throwIfNotOpenLocked();
            sQLiteConnectionPool = this.mConnectionPoolLocked;
        }
        return new com.tencent.wcdb.database.SQLiteSession(sQLiteConnectionPool);
    }

    public int delete(java.lang.String str, java.lang.String str2, java.lang.String[] strArr) {
        java.lang.String str3;
        acquireReference();
        try {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("DELETE FROM ");
            sb6.append(str);
            if (android.text.TextUtils.isEmpty(str2)) {
                str3 = "";
            } else {
                str3 = " WHERE " + str2;
            }
            sb6.append(str3);
            com.tencent.wcdb.database.SQLiteStatement sQLiteStatement = new com.tencent.wcdb.database.SQLiteStatement(this, sb6.toString(), strArr);
            try {
                return sQLiteStatement.executeUpdateDelete();
            } finally {
                sQLiteStatement.close();
            }
        } finally {
            releaseReference();
        }
    }

    public void disableWriteAheadLogging() {
        synchronized (this.mLock) {
            throwIfNotOpenLocked();
            com.tencent.wcdb.database.SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration = this.mConfigurationLocked;
            int i17 = sQLiteDatabaseConfiguration.openFlags;
            if ((i17 & ENABLE_WRITE_AHEAD_LOGGING) == 0) {
                return;
            }
            sQLiteDatabaseConfiguration.openFlags = i17 & (-536870913);
            try {
                this.mConnectionPoolLocked.reconfigure(sQLiteDatabaseConfiguration);
            } catch (java.lang.RuntimeException e17) {
                com.tencent.wcdb.database.SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration2 = this.mConfigurationLocked;
                sQLiteDatabaseConfiguration2.openFlags = 536870912 | sQLiteDatabaseConfiguration2.openFlags;
                throw e17;
            }
        }
    }

    public void dump(android.util.Printer printer, boolean z17) {
        synchronized (this.mLock) {
            com.tencent.wcdb.database.SQLiteConnectionPool sQLiteConnectionPool = this.mConnectionPoolLocked;
            if (sQLiteConnectionPool != null) {
                sQLiteConnectionPool.dump(printer, z17);
            }
        }
    }

    public org.json.JSONObject dumpJSON(boolean z17) {
        synchronized (this.mLock) {
            com.tencent.wcdb.database.SQLiteConnectionPool sQLiteConnectionPool = this.mConnectionPoolLocked;
            if (sQLiteConnectionPool != null) {
                return sQLiteConnectionPool.dumpJSON(z17);
            }
            return new org.json.JSONObject();
        }
    }

    public boolean enableWriteAheadLogging() {
        synchronized (this.mLock) {
            throwIfNotOpenLocked();
            if ((this.mConfigurationLocked.openFlags & ENABLE_WRITE_AHEAD_LOGGING) != 0) {
                return true;
            }
            if (isReadOnlyLocked()) {
                return false;
            }
            if (this.mConfigurationLocked.isInMemoryDb()) {
                com.tencent.wcdb.support.Log.i(TAG, "can't enable WAL for memory databases.");
                return false;
            }
            if (this.mHasAttachedDbsLocked) {
                com.tencent.wcdb.support.Log.i(TAG, "this database: " + this.mConfigurationLocked.label + " has attached databases. can't  enable WAL.");
                return false;
            }
            com.tencent.wcdb.database.SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration = this.mConfigurationLocked;
            sQLiteDatabaseConfiguration.openFlags |= ENABLE_WRITE_AHEAD_LOGGING;
            try {
                this.mConnectionPoolLocked.reconfigure(sQLiteDatabaseConfiguration);
                return true;
            } catch (java.lang.RuntimeException e17) {
                this.mConfigurationLocked.openFlags &= -536870913;
                throw e17;
            }
        }
    }

    public void endTransaction() {
        acquireReference();
        try {
            getThreadSession().endTransaction(null);
        } finally {
            releaseReference();
        }
    }

    public void execSQL(java.lang.String str) {
        executeSql(str, null, null);
    }

    public void finalize() {
        try {
            dispose(true);
        } finally {
            super.finalize();
        }
    }

    public boolean getAsyncCheckpointEnabled() {
        com.tencent.wcdb.database.SQLiteCheckpointListener checkpointCallback = getCheckpointCallback();
        return checkpointCallback != null && (checkpointCallback instanceof com.tencent.wcdb.database.SQLiteAsyncCheckpointer);
    }

    public java.util.List<android.util.Pair<java.lang.String, java.lang.String>> getAttachedDbs() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        synchronized (this.mLock) {
            com.tencent.wcdb.Cursor cursor = null;
            if (this.mConnectionPoolLocked == null) {
                return null;
            }
            if (!this.mHasAttachedDbsLocked) {
                arrayList.add(new android.util.Pair(com.tencent.matrix.battery.accumulate.persist.FlattProperty.PROC_MM, this.mConfigurationLocked.path));
                return arrayList;
            }
            acquireReference();
            try {
                try {
                    cursor = rawQuery("pragma database_list;", null);
                    while (cursor.moveToNext()) {
                        arrayList.add(new android.util.Pair(cursor.getString(1), cursor.getString(2)));
                    }
                    cursor.close();
                    return arrayList;
                } catch (java.lang.Throwable th6) {
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th6;
                }
            } finally {
                releaseReference();
            }
        }
    }

    public com.tencent.wcdb.database.SQLiteChangeListener getChangeListener() {
        com.tencent.wcdb.database.SQLiteChangeListener changeListener;
        synchronized (this.mLock) {
            throwIfNotOpenLocked();
            changeListener = this.mConnectionPoolLocked.getChangeListener();
        }
        return changeListener;
    }

    public com.tencent.wcdb.database.SQLiteCheckpointListener getCheckpointCallback() {
        synchronized (this.mLock) {
            throwIfNotOpenLocked();
            if (!this.mConfigurationLocked.customWALHookEnabled) {
                return null;
            }
            return this.mConnectionPoolLocked.getCheckpointListener();
        }
    }

    public java.lang.String getLabel() {
        java.lang.String str;
        synchronized (this.mLock) {
            str = this.mConfigurationLocked.label;
        }
        return str;
    }

    public long getMaximumSize() {
        return com.tencent.wcdb.DatabaseUtils.longForQuery(this, "PRAGMA max_page_count;", null) * getPageSize();
    }

    public long getPageSize() {
        return com.tencent.wcdb.DatabaseUtils.longForQuery(this, "PRAGMA page_size;", null);
    }

    public final java.lang.String getPath() {
        java.lang.String str;
        synchronized (this.mLock) {
            str = this.mConfigurationLocked.path;
        }
        return str;
    }

    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String> getSyncedTables() {
        return new java.util.HashMap(0);
    }

    public int getSynchronousMode() {
        int i17;
        synchronized (this.mLock) {
            throwIfNotOpenLocked();
            i17 = this.mConfigurationLocked.synchronousMode;
        }
        return i17;
    }

    public int getThreadDefaultConnectionFlags(boolean z17) {
        int i17 = z17 ? 1 : 2;
        return isMainThread() ? i17 | 4 : i17;
    }

    public com.tencent.wcdb.database.SQLiteSession getThreadSession() {
        return this.mThreadSession.get();
    }

    public com.tencent.wcdb.database.SQLiteTrace getTraceCallback() {
        com.tencent.wcdb.database.SQLiteTrace traceCallback;
        synchronized (this.mLock) {
            throwIfNotOpenLocked();
            traceCallback = this.mConnectionPoolLocked.getTraceCallback();
        }
        return traceCallback;
    }

    public int getVersion() {
        return java.lang.Long.valueOf(com.tencent.wcdb.DatabaseUtils.longForQuery(this, "PRAGMA user_version;", null)).intValue();
    }

    public boolean inTransaction() {
        acquireReference();
        try {
            return getThreadSession().hasTransaction();
        } finally {
            releaseReference();
        }
    }

    public long insert(java.lang.String str, java.lang.String str2, android.content.ContentValues contentValues) {
        try {
            return insertWithOnConflict(str, str2, contentValues, 0);
        } catch (com.tencent.wcdb.database.SQLiteDatabaseCorruptException e17) {
            throw e17;
        } catch (com.tencent.wcdb.SQLException e18) {
            com.tencent.wcdb.support.Log.e(TAG, "Error inserting %s: %s", contentValues, e18);
            return -1L;
        }
    }

    public long insertOrThrow(java.lang.String str, java.lang.String str2, android.content.ContentValues contentValues) {
        return insertWithOnConflict(str, str2, contentValues, 0);
    }

    public long insertWithOnConflict(java.lang.String str, java.lang.String str2, android.content.ContentValues contentValues, int i17) {
        java.lang.Object[] objArr;
        acquireReference();
        try {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append("INSERT");
            sb6.append(CONFLICT_VALUES[i17]);
            sb6.append(" INTO ");
            sb6.append(str);
            sb6.append('(');
            int i18 = 0;
            int size = (contentValues == null || contentValues.size() <= 0) ? 0 : contentValues.size();
            if (size > 0) {
                objArr = new java.lang.Object[size];
                int i19 = 0;
                for (java.lang.String str3 : keySet(contentValues)) {
                    sb6.append(i19 > 0 ? "," : "");
                    sb6.append(str3);
                    objArr[i19] = contentValues.get(str3);
                    i19++;
                }
                sb6.append(')');
                sb6.append(" VALUES (");
                while (i18 < size) {
                    sb6.append(i18 > 0 ? ",?" : "?");
                    i18++;
                }
            } else {
                sb6.append(str2 + ") VALUES (NULL");
                objArr = null;
            }
            sb6.append(')');
            com.tencent.wcdb.database.SQLiteStatement sQLiteStatement = new com.tencent.wcdb.database.SQLiteStatement(this, sb6.toString(), objArr);
            try {
                return sQLiteStatement.executeInsert();
            } finally {
                sQLiteStatement.close();
            }
        } finally {
            releaseReference();
        }
    }

    public boolean isDatabaseIntegrityOk() {
        java.util.List<android.util.Pair<java.lang.String, java.lang.String>> list;
        java.util.List<android.util.Pair<java.lang.String, java.lang.String>> attachedDbs;
        acquireReference();
        try {
            try {
                attachedDbs = getAttachedDbs();
            } catch (com.tencent.wcdb.database.SQLiteException unused) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(new android.util.Pair(com.tencent.matrix.battery.accumulate.persist.FlattProperty.PROC_MM, getPath()));
                list = arrayList;
            }
            if (attachedDbs == null) {
                throw new java.lang.IllegalStateException("databaselist for: " + getPath() + " couldn't be retrieved. probably because the database is closed");
            }
            list = attachedDbs;
            for (int i17 = 0; i17 < list.size(); i17++) {
                android.util.Pair<java.lang.String, java.lang.String> pair = list.get(i17);
                com.tencent.wcdb.database.SQLiteStatement sQLiteStatement = null;
                try {
                    sQLiteStatement = compileStatement("PRAGMA " + ((java.lang.String) pair.first) + ".integrity_check(1);");
                    java.lang.String simpleQueryForString = sQLiteStatement.simpleQueryForString();
                    if (!com.tencent.wcdb.DatabaseUtils.objectEquals(simpleQueryForString, "ok")) {
                        com.tencent.wcdb.support.Log.e(TAG, "PRAGMA integrity_check on " + ((java.lang.String) pair.second) + " returned: " + simpleQueryForString);
                        sQLiteStatement.close();
                        return false;
                    }
                    sQLiteStatement.close();
                } catch (java.lang.Throwable th6) {
                    if (sQLiteStatement != null) {
                        sQLiteStatement.close();
                    }
                    throw th6;
                }
            }
            releaseReference();
            return true;
        } finally {
            releaseReference();
        }
    }

    public boolean isDbLockedByCurrentThread() {
        acquireReference();
        try {
            return getThreadSession().hasConnection();
        } finally {
            releaseReference();
        }
    }

    @java.lang.Deprecated
    public boolean isDbLockedByOtherThreads() {
        return false;
    }

    public boolean isInMemoryDatabase() {
        boolean isInMemoryDb;
        synchronized (this.mLock) {
            isInMemoryDb = this.mConfigurationLocked.isInMemoryDb();
        }
        return isInMemoryDb;
    }

    public boolean isOpen() {
        boolean z17;
        synchronized (this.mLock) {
            z17 = this.mConnectionPoolLocked != null;
        }
        return z17;
    }

    public boolean isReadOnly() {
        boolean isReadOnlyLocked;
        synchronized (this.mLock) {
            isReadOnlyLocked = isReadOnlyLocked();
        }
        return isReadOnlyLocked;
    }

    public boolean isWriteAheadLoggingEnabled() {
        boolean z17;
        synchronized (this.mLock) {
            throwIfNotOpenLocked();
            z17 = (this.mConfigurationLocked.openFlags & ENABLE_WRITE_AHEAD_LOGGING) != 0;
        }
        return z17;
    }

    @java.lang.Deprecated
    public void markTableSyncable(java.lang.String str, java.lang.String str2) {
    }

    public boolean needUpgrade(int i17) {
        return i17 > getVersion();
    }

    @Override // com.tencent.wcdb.database.SQLiteClosable
    public void onAllReferencesReleased() {
        dispose(false);
    }

    public void onCorruption() {
        this.mErrorHandler.onCorruption(this);
    }

    public com.tencent.wcdb.Cursor query(boolean z17, java.lang.String str, java.lang.String[] strArr, java.lang.String str2, java.lang.Object[] objArr, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6) {
        return queryWithFactory(null, z17, str, strArr, str2, objArr, str3, str4, str5, str6, null);
    }

    public com.tencent.wcdb.Cursor queryWithFactory(com.tencent.wcdb.database.SQLiteDatabase.CursorFactory cursorFactory, boolean z17, java.lang.String str, java.lang.String[] strArr, java.lang.String str2, java.lang.Object[] objArr, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6) {
        return queryWithFactory(cursorFactory, z17, str, strArr, str2, objArr, str3, str4, str5, str6, null);
    }

    public com.tencent.wcdb.Cursor rawQuery(java.lang.String str, java.lang.Object[] objArr) {
        return rawQueryWithFactory(null, str, objArr, null, null);
    }

    public com.tencent.wcdb.Cursor rawQueryWithFactory(com.tencent.wcdb.database.SQLiteDatabase.CursorFactory cursorFactory, java.lang.String str, java.lang.Object[] objArr, java.lang.String str2) {
        return rawQueryWithFactory(cursorFactory, str, objArr, str2, null);
    }

    public void releaseNativeConnection(long j17, java.lang.Exception exc) {
        getThreadSession().releaseConnectionForNativeHandle(exc);
    }

    public void reopenReadWrite() {
        synchronized (this.mLock) {
            throwIfNotOpenLocked();
            if (isReadOnlyLocked()) {
                com.tencent.wcdb.database.SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration = this.mConfigurationLocked;
                int i17 = sQLiteDatabaseConfiguration.openFlags;
                sQLiteDatabaseConfiguration.openFlags = (i17 & (-2)) | 0;
                try {
                    this.mConnectionPoolLocked.reconfigure(sQLiteDatabaseConfiguration);
                } catch (java.lang.RuntimeException e17) {
                    this.mConfigurationLocked.openFlags = i17;
                    throw e17;
                }
            }
        }
    }

    public long replace(java.lang.String str, java.lang.String str2, android.content.ContentValues contentValues) {
        try {
            return insertWithOnConflict(str, str2, contentValues, 5);
        } catch (com.tencent.wcdb.database.SQLiteDatabaseCorruptException e17) {
            throw e17;
        } catch (com.tencent.wcdb.SQLException e18) {
            com.tencent.wcdb.support.Log.e(TAG, "Error inserting " + contentValues, e18);
            return -1L;
        }
    }

    public long replaceOrThrow(java.lang.String str, java.lang.String str2, android.content.ContentValues contentValues) {
        return insertWithOnConflict(str, str2, contentValues, 5);
    }

    public void setAsyncCheckpointEnabled(boolean z17) {
        setCheckpointCallback(z17 ? new com.tencent.wcdb.database.SQLiteAsyncCheckpointer() : null);
    }

    public void setChangeListener(com.tencent.wcdb.database.SQLiteChangeListener sQLiteChangeListener, boolean z17) {
        synchronized (this.mLock) {
            throwIfNotOpenLocked();
            this.mConnectionPoolLocked.setChangeListener(sQLiteChangeListener, z17);
        }
    }

    public void setCheckpointCallback(com.tencent.wcdb.database.SQLiteCheckpointListener sQLiteCheckpointListener) {
        boolean z17 = true;
        boolean z18 = sQLiteCheckpointListener != null;
        synchronized (this.mLock) {
            throwIfNotOpenLocked();
            com.tencent.wcdb.database.SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration = this.mConfigurationLocked;
            if (sQLiteDatabaseConfiguration.customWALHookEnabled != z18) {
                sQLiteDatabaseConfiguration.customWALHookEnabled = z18;
                try {
                    this.mConnectionPoolLocked.reconfigure(sQLiteDatabaseConfiguration);
                } catch (java.lang.RuntimeException e17) {
                    com.tencent.wcdb.database.SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration2 = this.mConfigurationLocked;
                    if (z18) {
                        z17 = false;
                    }
                    sQLiteDatabaseConfiguration2.customWALHookEnabled = z17;
                    throw e17;
                }
            }
            this.mConnectionPoolLocked.setCheckpointListener(sQLiteCheckpointListener);
        }
    }

    public void setForeignKeyConstraintsEnabled(boolean z17) {
        synchronized (this.mLock) {
            throwIfNotOpenLocked();
            com.tencent.wcdb.database.SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration = this.mConfigurationLocked;
            if (sQLiteDatabaseConfiguration.foreignKeyConstraintsEnabled == z17) {
                return;
            }
            sQLiteDatabaseConfiguration.foreignKeyConstraintsEnabled = z17;
            try {
                this.mConnectionPoolLocked.reconfigure(sQLiteDatabaseConfiguration);
            } catch (java.lang.RuntimeException e17) {
                this.mConfigurationLocked.foreignKeyConstraintsEnabled = !z17;
                throw e17;
            }
        }
    }

    public void setLocale(java.util.Locale locale) {
        if (locale == null) {
            throw new java.lang.IllegalArgumentException("locale must not be null.");
        }
        synchronized (this.mLock) {
            throwIfNotOpenLocked();
            com.tencent.wcdb.database.SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration = this.mConfigurationLocked;
            java.util.Locale locale2 = sQLiteDatabaseConfiguration.locale;
            sQLiteDatabaseConfiguration.locale = locale;
            try {
                this.mConnectionPoolLocked.reconfigure(sQLiteDatabaseConfiguration);
            } catch (java.lang.RuntimeException e17) {
                this.mConfigurationLocked.locale = locale2;
                throw e17;
            }
        }
    }

    @java.lang.Deprecated
    public void setLockingEnabled(boolean z17) {
    }

    public void setMaxSqlCacheSize(int i17) {
        if (i17 > 100 || i17 < 0) {
            throw new java.lang.IllegalStateException("expected value between 0 and 100");
        }
        synchronized (this.mLock) {
            throwIfNotOpenLocked();
            com.tencent.wcdb.database.SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration = this.mConfigurationLocked;
            int i18 = sQLiteDatabaseConfiguration.maxSqlCacheSize;
            sQLiteDatabaseConfiguration.maxSqlCacheSize = i17;
            try {
                this.mConnectionPoolLocked.reconfigure(sQLiteDatabaseConfiguration);
            } catch (java.lang.RuntimeException e17) {
                this.mConfigurationLocked.maxSqlCacheSize = i18;
                throw e17;
            }
        }
    }

    public long setMaximumSize(long j17) {
        long pageSize = getPageSize();
        long j18 = j17 / pageSize;
        if (j17 % pageSize != 0) {
            j18++;
        }
        return com.tencent.wcdb.DatabaseUtils.longForQuery(this, "PRAGMA max_page_count = " + j18, null) * pageSize;
    }

    public void setPageSize(long j17) {
        execSQL("PRAGMA page_size = " + j17);
    }

    public void setSynchronousMode(int i17) {
        synchronized (this.mLock) {
            throwIfNotOpenLocked();
            com.tencent.wcdb.database.SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration = this.mConfigurationLocked;
            int i18 = sQLiteDatabaseConfiguration.synchronousMode;
            if (i18 != i17) {
                sQLiteDatabaseConfiguration.synchronousMode = i17;
                try {
                    this.mConnectionPoolLocked.reconfigure(sQLiteDatabaseConfiguration);
                } catch (java.lang.RuntimeException e17) {
                    this.mConfigurationLocked.synchronousMode = i18;
                    throw e17;
                }
            }
        }
    }

    public void setTraceCallback(com.tencent.wcdb.database.SQLiteTrace sQLiteTrace) {
        synchronized (this.mLock) {
            throwIfNotOpenLocked();
            this.mConnectionPoolLocked.setTraceCallback(sQLiteTrace);
        }
    }

    public void setTransactionSuccessful() {
        acquireReference();
        try {
            getThreadSession().setTransactionSuccessful();
        } finally {
            releaseReference();
        }
    }

    public void setVersion(int i17) {
        execSQL("PRAGMA user_version = " + i17);
    }

    public java.lang.String toString() {
        return "SQLiteDatabase: " + getPath();
    }

    public int update(java.lang.String str, android.content.ContentValues contentValues, java.lang.String str2, java.lang.String[] strArr) {
        return updateWithOnConflict(str, contentValues, str2, strArr, 0);
    }

    public int updateWithOnConflict(java.lang.String str, android.content.ContentValues contentValues, java.lang.String str2, java.lang.String[] strArr, int i17) {
        if (contentValues == null || contentValues.size() == 0) {
            throw new java.lang.IllegalArgumentException("Empty values");
        }
        acquireReference();
        try {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder(120);
            sb6.append("UPDATE ");
            sb6.append(CONFLICT_VALUES[i17]);
            sb6.append(str);
            sb6.append(" SET ");
            int size = contentValues.size();
            int length = strArr == null ? size : strArr.length + size;
            java.lang.Object[] objArr = new java.lang.Object[length];
            int i18 = 0;
            for (java.lang.String str3 : keySet(contentValues)) {
                sb6.append(i18 > 0 ? "," : "");
                sb6.append(str3);
                objArr[i18] = contentValues.get(str3);
                sb6.append("=?");
                i18++;
            }
            if (strArr != null) {
                for (int i19 = size; i19 < length; i19++) {
                    objArr[i19] = strArr[i19 - size];
                }
            }
            if (!android.text.TextUtils.isEmpty(str2)) {
                sb6.append(" WHERE ");
                sb6.append(str2);
            }
            com.tencent.wcdb.database.SQLiteStatement sQLiteStatement = new com.tencent.wcdb.database.SQLiteStatement(this, sb6.toString(), objArr);
            try {
                return sQLiteStatement.executeUpdateDelete();
            } finally {
                sQLiteStatement.close();
            }
        } finally {
            releaseReference();
        }
    }

    public android.util.Pair<java.lang.Integer, java.lang.Integer> walCheckpoint(java.lang.String str, int i17) {
        acquireReference();
        try {
            return getThreadSession().walCheckpoint(str, i17, i17 > 0 ? 2 : 0);
        } finally {
            releaseReference();
        }
    }

    @java.lang.Deprecated
    public boolean yieldIfContended() {
        return yieldIfContendedHelper(false, -1L);
    }

    public boolean yieldIfContendedSafely() {
        return yieldIfContendedHelper(true, -1L);
    }

    private void beginTransaction(android.database.sqlite.SQLiteTransactionListener sQLiteTransactionListener, boolean z17) {
        acquireReference();
        try {
            getThreadSession().beginTransaction(z17 ? 2 : 1, sQLiteTransactionListener, getThreadDefaultConnectionFlags(false), null);
        } finally {
            releaseReference();
        }
    }

    public static com.tencent.wcdb.database.SQLiteDatabase openDatabase(java.lang.String str, byte[] bArr, com.tencent.wcdb.database.SQLiteCipherSpec sQLiteCipherSpec, com.tencent.wcdb.database.SQLiteDatabase.CursorFactory cursorFactory, int i17, com.tencent.wcdb.DatabaseErrorHandler databaseErrorHandler, int i18) {
        com.tencent.wcdb.database.SQLiteDatabase sQLiteDatabase = new com.tencent.wcdb.database.SQLiteDatabase(str, i17, cursorFactory, databaseErrorHandler);
        sQLiteDatabase.open(bArr, sQLiteCipherSpec, i18);
        return sQLiteDatabase;
    }

    public static com.tencent.wcdb.database.SQLiteDatabase openOrCreateDatabase(java.io.File file, byte[] bArr, com.tencent.wcdb.database.SQLiteCipherSpec sQLiteCipherSpec, com.tencent.wcdb.database.SQLiteDatabase.CursorFactory cursorFactory, com.tencent.wcdb.DatabaseErrorHandler databaseErrorHandler) {
        return openOrCreateDatabase(file.getPath(), bArr, sQLiteCipherSpec, cursorFactory, databaseErrorHandler, 0);
    }

    public static com.tencent.wcdb.database.SQLiteDatabase openOrCreateDatabaseInWalMode(java.lang.String str, com.tencent.wcdb.database.SQLiteDatabase.CursorFactory cursorFactory, int i17) {
        return openDatabase(str, null, null, cursorFactory, 805306368, null, i17);
    }

    public void execSQL(java.lang.String str, java.lang.Object[] objArr) {
        executeSql(str, objArr, null);
    }

    @java.lang.Deprecated
    public void markTableSyncable(java.lang.String str, java.lang.String str2, java.lang.String str3) {
    }

    public com.tencent.wcdb.Cursor query(boolean z17, java.lang.String str, java.lang.String[] strArr, java.lang.String str2, java.lang.Object[] objArr, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, com.tencent.wcdb.support.CancellationSignal cancellationSignal) {
        return queryWithFactory(null, z17, str, strArr, str2, objArr, str3, str4, str5, str6, cancellationSignal);
    }

    public com.tencent.wcdb.Cursor queryWithFactory(com.tencent.wcdb.database.SQLiteDatabase.CursorFactory cursorFactory, boolean z17, java.lang.String str, java.lang.String[] strArr, java.lang.String str2, java.lang.Object[] objArr, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, com.tencent.wcdb.support.CancellationSignal cancellationSignal) {
        acquireReference();
        try {
            return rawQueryWithFactory(cursorFactory, com.tencent.wcdb.database.SQLiteQueryBuilder.buildQueryString(z17, str, strArr, str2, str3, str4, str5, str6), objArr, findEditTable(str), cancellationSignal);
        } finally {
            releaseReference();
        }
    }

    public com.tencent.wcdb.Cursor rawQuery(java.lang.String str, java.lang.Object[] objArr, com.tencent.wcdb.support.CancellationSignal cancellationSignal) {
        return rawQueryWithFactory(null, str, objArr, null, cancellationSignal);
    }

    public com.tencent.wcdb.Cursor rawQueryWithFactory(com.tencent.wcdb.database.SQLiteDatabase.CursorFactory cursorFactory, java.lang.String str, java.lang.Object[] objArr, java.lang.String str2, com.tencent.wcdb.support.CancellationSignal cancellationSignal) {
        acquireReference();
        try {
            com.tencent.wcdb.database.SQLiteDirectCursorDriver sQLiteDirectCursorDriver = new com.tencent.wcdb.database.SQLiteDirectCursorDriver(this, str, str2, cancellationSignal);
            if (cursorFactory == null) {
                cursorFactory = this.mCursorFactory;
            }
            return sQLiteDirectCursorDriver.query(cursorFactory, objArr);
        } finally {
            releaseReference();
        }
    }

    public boolean yieldIfContendedSafely(long j17) {
        return yieldIfContendedHelper(true, j17);
    }

    public static com.tencent.wcdb.database.SQLiteDatabase openOrCreateDatabase(java.io.File file, byte[] bArr, com.tencent.wcdb.database.SQLiteCipherSpec sQLiteCipherSpec, com.tencent.wcdb.database.SQLiteDatabase.CursorFactory cursorFactory, com.tencent.wcdb.DatabaseErrorHandler databaseErrorHandler, int i17) {
        return openOrCreateDatabase(file.getPath(), bArr, sQLiteCipherSpec, cursorFactory, databaseErrorHandler, i17);
    }

    public static com.tencent.wcdb.database.SQLiteDatabase openOrCreateDatabaseInWalMode(java.lang.String str, byte[] bArr, com.tencent.wcdb.database.SQLiteCipherSpec sQLiteCipherSpec, com.tencent.wcdb.database.SQLiteDatabase.CursorFactory cursorFactory, com.tencent.wcdb.DatabaseErrorHandler databaseErrorHandler, int i17) {
        return openDatabase(str, bArr, sQLiteCipherSpec, cursorFactory, 805306368, databaseErrorHandler, i17);
    }

    public void execSQL(java.lang.String str, java.lang.Object[] objArr, com.tencent.wcdb.support.CancellationSignal cancellationSignal) {
        executeSql(str, objArr, cancellationSignal);
    }

    public com.tencent.wcdb.Cursor query(java.lang.String str, java.lang.String[] strArr, java.lang.String str2, java.lang.Object[] objArr, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        return query(false, str, strArr, str2, objArr, str3, str4, str5, null);
    }

    public static com.tencent.wcdb.database.SQLiteDatabase openDatabase(java.lang.String str, byte[] bArr, com.tencent.wcdb.database.SQLiteCipherSpec sQLiteCipherSpec, com.tencent.wcdb.database.SQLiteDatabase.CursorFactory cursorFactory, int i17, com.tencent.wcdb.DatabaseErrorHandler databaseErrorHandler) {
        return openDatabase(str, bArr, sQLiteCipherSpec, cursorFactory, i17, databaseErrorHandler, 0);
    }

    public static com.tencent.wcdb.database.SQLiteDatabase openOrCreateDatabase(java.io.File file, byte[] bArr, com.tencent.wcdb.database.SQLiteDatabase.CursorFactory cursorFactory, com.tencent.wcdb.DatabaseErrorHandler databaseErrorHandler) {
        return openOrCreateDatabase(file.getPath(), bArr, (com.tencent.wcdb.database.SQLiteCipherSpec) null, cursorFactory, databaseErrorHandler, 0);
    }

    public static com.tencent.wcdb.database.SQLiteDatabase openOrCreateDatabaseInWalMode(java.lang.String str, byte[] bArr, com.tencent.wcdb.database.SQLiteCipherSpec sQLiteCipherSpec, com.tencent.wcdb.database.SQLiteDatabase.CursorFactory cursorFactory) {
        return openDatabase(str, bArr, sQLiteCipherSpec, cursorFactory, 805306368, null, 0);
    }

    public com.tencent.wcdb.Cursor query(java.lang.String str, java.lang.String[] strArr, java.lang.String str2, java.lang.Object[] objArr, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6) {
        return query(false, str, strArr, str2, objArr, str3, str4, str5, str6);
    }

    public static com.tencent.wcdb.database.SQLiteDatabase openDatabase(java.lang.String str, com.tencent.wcdb.database.SQLiteDatabase.CursorFactory cursorFactory, int i17, com.tencent.wcdb.DatabaseErrorHandler databaseErrorHandler) {
        return openDatabase(str, null, null, cursorFactory, i17, databaseErrorHandler, 0);
    }

    public static com.tencent.wcdb.database.SQLiteDatabase openOrCreateDatabase(java.io.File file, byte[] bArr, com.tencent.wcdb.database.SQLiteDatabase.CursorFactory cursorFactory, com.tencent.wcdb.DatabaseErrorHandler databaseErrorHandler, int i17) {
        return openOrCreateDatabase(file.getPath(), bArr, (com.tencent.wcdb.database.SQLiteCipherSpec) null, cursorFactory, databaseErrorHandler, i17);
    }

    public static com.tencent.wcdb.database.SQLiteDatabase openDatabase(java.lang.String str, com.tencent.wcdb.database.SQLiteDatabase.CursorFactory cursorFactory, int i17, com.tencent.wcdb.DatabaseErrorHandler databaseErrorHandler, int i18) {
        return openDatabase(str, null, null, cursorFactory, i17, databaseErrorHandler, i18);
    }

    public static com.tencent.wcdb.database.SQLiteDatabase openOrCreateDatabase(java.lang.String str, com.tencent.wcdb.database.SQLiteDatabase.CursorFactory cursorFactory, int i17) {
        return openDatabase(str, null, null, cursorFactory, 268435456, null, i17);
    }

    public static com.tencent.wcdb.database.SQLiteDatabase openOrCreateDatabase(java.lang.String str, com.tencent.wcdb.database.SQLiteDatabase.CursorFactory cursorFactory) {
        return openDatabase(str, null, null, cursorFactory, 268435456, null, 0);
    }

    public static com.tencent.wcdb.database.SQLiteDatabase openOrCreateDatabase(java.lang.String str, com.tencent.wcdb.database.SQLiteDatabase.CursorFactory cursorFactory, boolean z17) {
        return openDatabase(str, null, null, cursorFactory, z17 ? 805306368 : 268435456, null, 0);
    }

    public static com.tencent.wcdb.database.SQLiteDatabase openOrCreateDatabase(java.lang.String str, byte[] bArr, com.tencent.wcdb.database.SQLiteCipherSpec sQLiteCipherSpec, com.tencent.wcdb.database.SQLiteDatabase.CursorFactory cursorFactory, com.tencent.wcdb.DatabaseErrorHandler databaseErrorHandler, int i17) {
        return openDatabase(str, bArr, sQLiteCipherSpec, cursorFactory, 268435456, databaseErrorHandler, i17);
    }

    public static com.tencent.wcdb.database.SQLiteDatabase openOrCreateDatabase(java.lang.String str, byte[] bArr, com.tencent.wcdb.database.SQLiteDatabase.CursorFactory cursorFactory, com.tencent.wcdb.DatabaseErrorHandler databaseErrorHandler, int i17) {
        return openOrCreateDatabase(str, bArr, (com.tencent.wcdb.database.SQLiteCipherSpec) null, cursorFactory, databaseErrorHandler, i17);
    }

    public static com.tencent.wcdb.database.SQLiteDatabase openOrCreateDatabase(java.lang.String str, byte[] bArr, com.tencent.wcdb.database.SQLiteDatabase.CursorFactory cursorFactory, com.tencent.wcdb.DatabaseErrorHandler databaseErrorHandler) {
        return openOrCreateDatabase(str, bArr, (com.tencent.wcdb.database.SQLiteCipherSpec) null, cursorFactory, databaseErrorHandler, 0);
    }

    public static com.tencent.wcdb.database.SQLiteDatabase openOrCreateDatabase(java.lang.String str, com.tencent.wcdb.database.SQLiteDatabase.CursorFactory cursorFactory, com.tencent.wcdb.DatabaseErrorHandler databaseErrorHandler) {
        return openDatabase(str, cursorFactory, 268435456, databaseErrorHandler);
    }
}
