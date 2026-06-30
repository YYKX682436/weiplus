package com.tencent.wcdb.database;

/* loaded from: classes12.dex */
public abstract class SQLiteOpenHelper {
    private static final boolean DEBUG_STRICT_READONLY = false;
    private static final java.lang.String TAG = "WCDB.SQLiteOpenHelper";
    private com.tencent.wcdb.database.SQLiteCipherSpec mCipher;
    private final android.content.Context mContext;
    private com.tencent.wcdb.database.SQLiteDatabase mDatabase;
    private boolean mEnableWriteAheadLogging;
    private final com.tencent.wcdb.DatabaseErrorHandler mErrorHandler;
    private final com.tencent.wcdb.database.SQLiteDatabase.CursorFactory mFactory;
    private boolean mForcedSingleConnection;
    private boolean mIsInitializing;
    private int mMode;
    private final java.lang.String mName;
    private boolean mNeedMode;
    private final int mNewVersion;
    private byte[] mPassword;

    static {
        com.tencent.wcdb.database.SQLiteGlobal.loadLib();
    }

    public SQLiteOpenHelper(android.content.Context context, java.lang.String str, com.tencent.wcdb.database.SQLiteDatabase.CursorFactory cursorFactory, int i17) {
        this(context, str, cursorFactory, i17, null);
    }

    private com.tencent.wcdb.database.SQLiteDatabase getDatabaseLocked(boolean z17) {
        com.tencent.wcdb.database.SQLiteDatabase openDatabase;
        com.tencent.wcdb.database.SQLiteDatabase sQLiteDatabase = this.mDatabase;
        if (sQLiteDatabase != null) {
            if (!sQLiteDatabase.isOpen()) {
                this.mDatabase = null;
            } else if (!z17 || !this.mDatabase.isReadOnly()) {
                return this.mDatabase;
            }
        }
        if (this.mIsInitializing) {
            throw new java.lang.IllegalStateException("getDatabase called recursively");
        }
        com.tencent.wcdb.database.SQLiteDatabase sQLiteDatabase2 = this.mDatabase;
        try {
            this.mIsInitializing = true;
            if (sQLiteDatabase2 == null) {
                java.lang.String str = this.mName;
                if (str == null) {
                    openDatabase = com.tencent.wcdb.database.SQLiteDatabase.create(null);
                } else {
                    boolean z18 = this.mForcedSingleConnection;
                    try {
                        this.mNeedMode = true;
                        int i17 = this.mEnableWriteAheadLogging ? 8 : 0;
                        this.mMode = i17;
                        openDatabase = com.tencent.wcdb.support.Context.openOrCreateDatabase(this.mContext, str, this.mPassword, this.mCipher, i17, this.mFactory, this.mErrorHandler, z18 ? 1 : 0);
                    } catch (com.tencent.wcdb.database.SQLiteException e17) {
                        if (z17) {
                            throw e17;
                        }
                        com.tencent.wcdb.support.Log.e(TAG, "Couldn't open " + this.mName + " for writing (will try read-only):", e17);
                        openDatabase = com.tencent.wcdb.database.SQLiteDatabase.openDatabase(this.mContext.getDatabasePath(this.mName).getPath(), this.mPassword, this.mCipher, this.mFactory, 1, this.mErrorHandler);
                    }
                }
                sQLiteDatabase2 = openDatabase;
            } else if (z17 && sQLiteDatabase2.isReadOnly()) {
                sQLiteDatabase2.reopenReadWrite();
            }
            return getDatabaseLockedLast(sQLiteDatabase2);
        } finally {
            this.mIsInitializing = false;
            if (sQLiteDatabase2 != null && sQLiteDatabase2 != this.mDatabase) {
                sQLiteDatabase2.close();
            }
        }
    }

    private com.tencent.wcdb.database.SQLiteDatabase getDatabaseLockedLast(com.tencent.wcdb.database.SQLiteDatabase sQLiteDatabase) {
        onConfigure(sQLiteDatabase);
        int version = sQLiteDatabase.getVersion();
        if (version != this.mNewVersion) {
            if (sQLiteDatabase.isReadOnly()) {
                throw new com.tencent.wcdb.database.SQLiteException("Can't upgrade read-only database from version " + sQLiteDatabase.getVersion() + " to " + this.mNewVersion + ": " + this.mName);
            }
            sQLiteDatabase.beginTransaction();
            try {
                if (version == 0) {
                    onCreate(sQLiteDatabase);
                } else {
                    int i17 = this.mNewVersion;
                    if (version > i17) {
                        onDowngrade(sQLiteDatabase, version, i17);
                    } else {
                        onUpgrade(sQLiteDatabase, version, i17);
                    }
                }
                sQLiteDatabase.setVersion(this.mNewVersion);
                sQLiteDatabase.setTransactionSuccessful();
            } finally {
                sQLiteDatabase.endTransaction();
            }
        }
        onOpen(sQLiteDatabase);
        if (sQLiteDatabase.isReadOnly()) {
            com.tencent.wcdb.support.Log.w(TAG, "Opened " + this.mName + " in read-only mode");
        }
        this.mDatabase = sQLiteDatabase;
        return sQLiteDatabase;
    }

    public synchronized void close() {
        if (this.mIsInitializing) {
            throw new java.lang.IllegalStateException("Closed during initialization");
        }
        com.tencent.wcdb.database.SQLiteDatabase sQLiteDatabase = this.mDatabase;
        if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
            this.mDatabase.close();
            this.mDatabase = null;
        }
    }

    public java.lang.String getDatabaseName() {
        return this.mName;
    }

    public com.tencent.wcdb.database.SQLiteDatabase getReadableDatabase() {
        com.tencent.wcdb.database.SQLiteDatabase databaseLocked;
        synchronized (this) {
            databaseLocked = getDatabaseLocked(false);
        }
        return databaseLocked;
    }

    public com.tencent.wcdb.database.SQLiteDatabase getWritableDatabase() {
        com.tencent.wcdb.database.SQLiteDatabase databaseLocked;
        synchronized (this) {
            databaseLocked = getDatabaseLocked(true);
        }
        return databaseLocked;
    }

    public void onConfigure(com.tencent.wcdb.database.SQLiteDatabase sQLiteDatabase) {
    }

    public abstract void onCreate(com.tencent.wcdb.database.SQLiteDatabase sQLiteDatabase);

    public void onDowngrade(com.tencent.wcdb.database.SQLiteDatabase sQLiteDatabase, int i17, int i18) {
        throw new com.tencent.wcdb.database.SQLiteException("Can't downgrade database from version " + i17 + " to " + i18);
    }

    public void onOpen(com.tencent.wcdb.database.SQLiteDatabase sQLiteDatabase) {
    }

    public abstract void onUpgrade(com.tencent.wcdb.database.SQLiteDatabase sQLiteDatabase, int i17, int i18);

    public void setForcedSingleConnection(boolean z17) {
        synchronized (this) {
            this.mForcedSingleConnection = z17;
        }
    }

    public void setWriteAheadLoggingEnabled(boolean z17) {
        synchronized (this) {
            if (this.mEnableWriteAheadLogging != z17) {
                com.tencent.wcdb.database.SQLiteDatabase sQLiteDatabase = this.mDatabase;
                if (sQLiteDatabase != null && sQLiteDatabase.isOpen() && !this.mDatabase.isReadOnly()) {
                    if (z17) {
                        this.mDatabase.enableWriteAheadLogging();
                    } else {
                        this.mDatabase.disableWriteAheadLogging();
                    }
                }
                this.mEnableWriteAheadLogging = z17;
            }
        }
    }

    public SQLiteOpenHelper(android.content.Context context, java.lang.String str, byte[] bArr, com.tencent.wcdb.database.SQLiteCipherSpec sQLiteCipherSpec, com.tencent.wcdb.database.SQLiteDatabase.CursorFactory cursorFactory, int i17, com.tencent.wcdb.DatabaseErrorHandler databaseErrorHandler) {
        if (i17 >= 1) {
            this.mContext = context;
            this.mName = str;
            this.mFactory = cursorFactory;
            this.mNewVersion = i17;
            this.mErrorHandler = databaseErrorHandler;
            this.mPassword = bArr;
            this.mCipher = sQLiteCipherSpec == null ? null : new com.tencent.wcdb.database.SQLiteCipherSpec(sQLiteCipherSpec);
            this.mNeedMode = false;
            return;
        }
        throw new java.lang.IllegalArgumentException("Version must be >= 1, was " + i17);
    }

    public SQLiteOpenHelper(android.content.Context context, java.lang.String str, byte[] bArr, com.tencent.wcdb.database.SQLiteDatabase.CursorFactory cursorFactory, int i17, com.tencent.wcdb.DatabaseErrorHandler databaseErrorHandler) {
        this(context, str, bArr, null, cursorFactory, i17, databaseErrorHandler);
    }

    public SQLiteOpenHelper(android.content.Context context, java.lang.String str, com.tencent.wcdb.database.SQLiteDatabase.CursorFactory cursorFactory, int i17, com.tencent.wcdb.DatabaseErrorHandler databaseErrorHandler) {
        this(context, str, null, null, cursorFactory, i17, databaseErrorHandler);
    }
}
