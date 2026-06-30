package com.tencent.wcdb.compat;

/* loaded from: classes12.dex */
public final class SQLiteDatabase {
    public static final int CONFLICT_ABORT = 2;
    public static final int CONFLICT_FAIL = 3;
    public static final int CONFLICT_IGNORE = 4;
    public static final int CONFLICT_NONE = 0;
    public static final int CONFLICT_REPLACE = 5;
    public static final int CONFLICT_ROLLBACK = 1;
    private static final java.lang.String[] CONFLICT_VALUES = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};
    private static final com.tencent.wcdb.core.Database.CipherVersion[] kCipherVersionMapping = com.tencent.wcdb.core.Database.CipherVersion.values();
    private static final com.tencent.wcdb.compat.DatabaseErrorHandler sDefaultErrorHandler = new com.tencent.wcdb.compat.DatabaseErrorHandler() { // from class: com.tencent.wcdb.compat.SQLiteDatabase.3
        @Override // com.tencent.wcdb.compat.DatabaseErrorHandler
        public void onCorruption(com.tencent.wcdb.compat.SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.getInnerDB().removeFiles();
        }
    };
    private final com.tencent.wcdb.core.Database mDB;
    private final java.lang.ThreadLocal<com.tencent.wcdb.compat.SQLiteDatabase.Transaction> mTransactionStack = new java.lang.ThreadLocal<>();

    /* loaded from: classes12.dex */
    public static final class Transaction {
        boolean childFailed;
        android.database.sqlite.SQLiteTransactionListener listener;
        boolean markedSuccessful;
        com.tencent.wcdb.compat.SQLiteDatabase.Transaction parent;

        private Transaction() {
        }
    }

    public SQLiteDatabase(com.tencent.wcdb.core.Database database) {
        this.mDB = database;
    }

    public static com.tencent.wcdb.compat.SQLiteDatabase openDatabase(java.lang.String str) {
        return openDatabase(str, null, null, null);
    }

    public static int releaseMemory() {
        com.tencent.wcdb.core.Database.purgeAll();
        return 0;
    }

    private static void throwIfNoTransaction(com.tencent.wcdb.compat.SQLiteDatabase.Transaction transaction) {
        if (transaction == null) {
            throw new java.lang.IllegalStateException("Cannot perform this operation because there is no current transaction.");
        }
    }

    private static void throwIfTransactionMarkedSuccessful(com.tencent.wcdb.compat.SQLiteDatabase.Transaction transaction) {
        if (transaction != null && transaction.markedSuccessful) {
            throw new java.lang.IllegalStateException("Cannot perform this operation because the transaction has already been marked successful.  The only thing you can do now is call endTransaction().");
        }
    }

    public static com.tencent.wcdb.compat.SQLiteDatabase wrap(com.tencent.wcdb.core.Database database) {
        return new com.tencent.wcdb.compat.SQLiteDatabase(database);
    }

    public void beginTransaction() {
        beginTransactionWithListener(null);
    }

    public void beginTransactionNonExclusive() {
        beginTransactionWithListener(null);
    }

    public void beginTransactionWithListener(android.database.sqlite.SQLiteTransactionListener sQLiteTransactionListener) {
        com.tencent.wcdb.compat.SQLiteDatabase.Transaction transaction = this.mTransactionStack.get();
        throwIfTransactionMarkedSuccessful(transaction);
        if (transaction == null) {
            this.mDB.beginTransaction();
        }
        if (sQLiteTransactionListener != null) {
            try {
                sQLiteTransactionListener.onBegin();
            } catch (java.lang.RuntimeException e17) {
                if (transaction == null) {
                    this.mDB.rollbackTransaction();
                }
                throw e17;
            }
        }
        com.tencent.wcdb.compat.SQLiteDatabase.Transaction transaction2 = new com.tencent.wcdb.compat.SQLiteDatabase.Transaction();
        transaction2.listener = sQLiteTransactionListener;
        transaction2.parent = transaction;
        this.mTransactionStack.set(transaction2);
    }

    public void beginTransactionWithListenerNonExclusive(android.database.sqlite.SQLiteTransactionListener sQLiteTransactionListener) {
        beginTransactionWithListener(sQLiteTransactionListener);
    }

    public void close() {
        this.mDB.close();
    }

    public com.tencent.wcdb.compat.SQLiteStatement compileStatement(java.lang.String str) {
        return new com.tencent.wcdb.compat.SQLiteStatement(this.mDB, str, null);
    }

    public int delete(java.lang.String str, java.lang.String str2, java.lang.String[] strArr) {
        java.lang.String str3;
        com.tencent.wcdb.core.PreparedStatement preparedStatement;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("DELETE FROM ");
        sb6.append(str);
        if (android.text.TextUtils.isEmpty(str2)) {
            str3 = "";
        } else {
            str3 = " WHERE " + str2;
        }
        sb6.append(str3);
        java.lang.String sb7 = sb6.toString();
        com.tencent.wcdb.core.Handle handle = this.mDB.getHandle(true);
        try {
            try {
                preparedStatement = handle.preparedWithMainStatement(sb7);
                if (strArr != null) {
                    int i17 = 0;
                    while (i17 < strArr.length) {
                        try {
                            java.lang.String str4 = strArr[i17];
                            i17++;
                            preparedStatement.bindText(str4, i17);
                        } catch (java.lang.Throwable th6) {
                            th = th6;
                            if (preparedStatement != null) {
                                preparedStatement.finalizeStatement();
                            }
                            throw th;
                        }
                    }
                }
                do {
                    preparedStatement.step();
                } while (!preparedStatement.isDone());
                int changes = handle.getChanges();
                preparedStatement.finalizeStatement();
                handle.close();
                return changes;
            } catch (java.lang.Throwable th7) {
                th = th7;
                preparedStatement = null;
            }
        } catch (java.lang.Throwable th8) {
            if (handle != null) {
                try {
                    handle.close();
                } catch (java.lang.Throwable th9) {
                    th8.addSuppressed(th9);
                }
            }
            throw th8;
        }
    }

    public void endTransaction() {
        com.tencent.wcdb.compat.SQLiteDatabase.Transaction transaction = this.mTransactionStack.get();
        throwIfNoTransaction(transaction);
        boolean z17 = false;
        boolean z18 = transaction.markedSuccessful && !transaction.childFailed;
        android.database.sqlite.SQLiteTransactionListener sQLiteTransactionListener = transaction.listener;
        if (sQLiteTransactionListener != null) {
            try {
                if (z18) {
                    sQLiteTransactionListener.onCommit();
                } else {
                    sQLiteTransactionListener.onRollback();
                }
            } catch (java.lang.RuntimeException e17) {
                e = e17;
            }
        }
        z17 = z18;
        e = null;
        com.tencent.wcdb.compat.SQLiteDatabase.Transaction transaction2 = transaction.parent;
        this.mTransactionStack.set(transaction2);
        if (transaction2 != null) {
            if (!z17) {
                transaction2.childFailed = true;
            }
        } else if (z17) {
            this.mDB.commitTransaction();
        } else {
            this.mDB.rollbackTransaction();
        }
        if (e != null) {
            throw e;
        }
    }

    public void execSQL(java.lang.String str) {
        execSQL(str, null);
    }

    public com.tencent.wcdb.core.Database getInnerDB() {
        return this.mDB;
    }

    public long getMaximumSize() {
        return this.mDB.getValueFromSQL("PRAGMA max_page_count").getLong() * getPageSize();
    }

    public long getPageSize() {
        return this.mDB.getValueFromSQL("PRAGMA page_size").getLong();
    }

    public java.lang.String getPath() {
        return this.mDB.getPath();
    }

    public int getVersion() {
        return this.mDB.getValueFromSQL("PRAGMA user_version").getInt();
    }

    public boolean inTransaction() {
        return this.mDB.isInTransaction();
    }

    public long insert(java.lang.String str, java.lang.String str2, android.content.ContentValues contentValues) {
        try {
            return insertWithOnConflict(str, str2, contentValues, 0);
        } catch (com.tencent.wcdb.base.WCDBException unused) {
            return -1L;
        }
    }

    public long insertOrThrow(java.lang.String str, java.lang.String str2, android.content.ContentValues contentValues) {
        return insertWithOnConflict(str, str2, contentValues, 0);
    }

    public long insertWithOnConflict(java.lang.String str, java.lang.String str2, android.content.ContentValues contentValues, int i17) {
        java.lang.String[] strArr;
        java.lang.Object[] objArr;
        int i18 = 0;
        int size = (contentValues == null || contentValues.size() <= 0) ? 0 : contentValues.size();
        com.tencent.wcdb.core.PreparedStatement preparedStatement = null;
        if (size > 0) {
            objArr = new java.lang.Object[size];
            strArr = new java.lang.String[size];
            int i19 = 0;
            for (java.lang.String str3 : contentValues.keySet()) {
                strArr[i19] = str3;
                objArr[i19] = contentValues.get(str3);
                i19++;
            }
        } else {
            strArr = new java.lang.String[]{str2};
            objArr = new java.lang.Object[]{null};
        }
        com.tencent.wcdb.winq.StatementInsert insertInto = new com.tencent.wcdb.winq.StatementInsert().insertInto(str);
        if (i17 == 1) {
            insertInto.orRollback();
        } else if (i17 == 2) {
            insertInto.orAbort();
        } else if (i17 == 3) {
            insertInto.orFail();
        } else if (i17 == 4) {
            insertInto.orIgnore();
        } else if (i17 == 5) {
            insertInto.orReplace();
        }
        insertInto.columns(strArr).valuesWithBindParameters(objArr.length);
        com.tencent.wcdb.core.Handle handle = this.mDB.getHandle(true);
        try {
            try {
                preparedStatement = handle.preparedWithMainStatement(insertInto);
                while (i18 < objArr.length) {
                    com.tencent.wcdb.base.Value value = new com.tencent.wcdb.base.Value(objArr[i18]);
                    i18++;
                    preparedStatement.bindValue(value, i18);
                }
                do {
                    preparedStatement.step();
                } while (!preparedStatement.isDone());
                long lastInsertedRowId = handle.getLastInsertedRowId();
                preparedStatement.finalizeStatement();
                handle.close();
                return lastInsertedRowId;
            } catch (java.lang.Throwable th6) {
                if (preparedStatement != null) {
                    preparedStatement.finalizeStatement();
                }
                throw th6;
            }
        } catch (java.lang.Throwable th7) {
            if (handle != null) {
                try {
                    handle.close();
                } catch (java.lang.Throwable th8) {
                    th7.addSuppressed(th8);
                }
            }
            throw th7;
        }
    }

    public boolean isOpen() {
        return this.mDB.isOpened();
    }

    public android.database.Cursor query(boolean z17, java.lang.String str, java.lang.String[] strArr, java.lang.String str2, java.lang.String[] strArr2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6) {
        return query(z17, str, strArr, str2, strArr2, str3, str4, str5, str6, null);
    }

    public android.database.Cursor rawQuery(java.lang.String str, java.lang.Object[] objArr) {
        return rawQuery(str, objArr, null);
    }

    public long replace(java.lang.String str, java.lang.String str2, android.content.ContentValues contentValues) {
        try {
            return insertWithOnConflict(str, str2, contentValues, 5);
        } catch (android.database.SQLException unused) {
            return -1L;
        }
    }

    public long replaceOrThrow(java.lang.String str, java.lang.String str2, android.content.ContentValues contentValues) {
        return insertWithOnConflict(str, str2, contentValues, 5);
    }

    public long setMaximumSize(long j17) {
        long pageSize = getPageSize();
        long j18 = j17 / pageSize;
        if (j17 % pageSize != 0) {
            j18++;
        }
        return this.mDB.getValueFromSQL("PRAGMA max_page_count = " + j18).getLong() * pageSize;
    }

    public void setPageSize(long j17) {
        this.mDB.execute("PRAGMA page_size = " + j17);
    }

    public void setTransactionSuccessful() {
        com.tencent.wcdb.compat.SQLiteDatabase.Transaction transaction = this.mTransactionStack.get();
        throwIfNoTransaction(transaction);
        throwIfTransactionMarkedSuccessful(transaction);
        transaction.markedSuccessful = true;
    }

    public void setVersion(int i17) {
        this.mDB.execute("PRAGMA user_version = " + i17);
    }

    public java.lang.String toString() {
        return "SQLiteDatabase: " + getPath();
    }

    public int update(java.lang.String str, android.content.ContentValues contentValues, java.lang.String str2, java.lang.String[] strArr) {
        return updateWithOnConflict(str, contentValues, str2, strArr, 0);
    }

    public int updateWithOnConflict(java.lang.String str, android.content.ContentValues contentValues, java.lang.String str2, java.lang.String[] strArr, int i17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(120);
        sb6.append("UPDATE ");
        sb6.append(CONFLICT_VALUES[i17]);
        sb6.append(str);
        sb6.append(" SET ");
        int size = contentValues.size();
        int length = strArr == null ? size : strArr.length + size;
        java.lang.Object[] objArr = new java.lang.Object[length];
        int i18 = 0;
        int i19 = 0;
        for (java.lang.String str3 : contentValues.keySet()) {
            sb6.append(i19 > 0 ? "," : "");
            sb6.append(str3);
            objArr[i19] = contentValues.get(str3);
            sb6.append("=?");
            i19++;
        }
        if (strArr != null) {
            for (int i27 = size; i27 < length; i27++) {
                objArr[i27] = strArr[i27 - size];
            }
        }
        if (!android.text.TextUtils.isEmpty(str2)) {
            sb6.append(" WHERE ");
            sb6.append(str2);
        }
        com.tencent.wcdb.core.Handle handle = this.mDB.getHandle(true);
        com.tencent.wcdb.core.PreparedStatement preparedStatement = null;
        try {
            try {
                preparedStatement = handle.preparedWithMainStatement(sb6.toString());
                while (i18 < length) {
                    com.tencent.wcdb.base.Value value = new com.tencent.wcdb.base.Value(objArr[i18]);
                    i18++;
                    preparedStatement.bindValue(value, i18);
                }
                do {
                    preparedStatement.step();
                } while (!preparedStatement.isDone());
                int changes = handle.getChanges();
                preparedStatement.finalizeStatement();
                handle.close();
                return changes;
            } catch (java.lang.Throwable th6) {
                if (preparedStatement != null) {
                    preparedStatement.finalizeStatement();
                }
                throw th6;
            }
        } catch (java.lang.Throwable th7) {
            if (handle != null) {
                try {
                    handle.close();
                } catch (java.lang.Throwable th8) {
                    th7.addSuppressed(th8);
                }
            }
            throw th7;
        }
    }

    public static com.tencent.wcdb.compat.SQLiteDatabase openDatabase(java.lang.String str, com.tencent.wcdb.compat.DatabaseErrorHandler databaseErrorHandler) {
        return openDatabase(str, null, null, databaseErrorHandler);
    }

    public int execSQL(java.lang.String str, java.lang.Object[] objArr) {
        return execSQL(str, objArr, null);
    }

    public android.database.Cursor query(boolean z17, java.lang.String str, java.lang.String[] strArr, java.lang.String str2, java.lang.String[] strArr2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, android.os.CancellationSignal cancellationSignal) {
        return rawQuery(android.database.sqlite.SQLiteQueryBuilder.buildQueryString(z17, str, strArr, str2, str3, str4, str5, str6), strArr2, cancellationSignal);
    }

    public android.database.Cursor rawQuery(java.lang.String str, java.lang.Object[] objArr, android.os.CancellationSignal cancellationSignal) {
        com.tencent.wcdb.core.PreparedStatement preparedStatement;
        try {
            com.tencent.wcdb.core.Handle handle = this.mDB.getHandle(false);
            try {
                com.tencent.wcdb.compat.DatabaseUtils.bindCancellationSignal(handle, cancellationSignal);
                try {
                    preparedStatement = handle.preparedWithMainStatement(str);
                    if (objArr != null) {
                        try {
                            int length = objArr.length;
                            int i17 = 0;
                            while (i17 < length) {
                                com.tencent.wcdb.base.Value value = new com.tencent.wcdb.base.Value(objArr[i17]);
                                i17++;
                                preparedStatement.bindValue(value, i17);
                            }
                        } catch (java.lang.Throwable th6) {
                            th = th6;
                            if (preparedStatement != null) {
                                preparedStatement.finalizeStatement();
                            }
                            throw th;
                        }
                    }
                    int columnCount = preparedStatement.getColumnCount();
                    java.lang.String[] strArr = new java.lang.String[columnCount];
                    for (int i18 = 0; i18 < columnCount; i18++) {
                        strArr[i18] = preparedStatement.getColumnName(i18);
                    }
                    com.tencent.wcdb.compat.ValueCursor valueCursor = new com.tencent.wcdb.compat.ValueCursor(preparedStatement.getMultiRows(), strArr);
                    preparedStatement.finalizeStatement();
                    handle.close();
                    return valueCursor;
                } catch (java.lang.Throwable th7) {
                    th = th7;
                    preparedStatement = null;
                }
            } finally {
            }
        } catch (com.tencent.wcdb.base.WCDBInterruptException e17) {
            throw ((android.os.OperationCanceledException) new android.os.OperationCanceledException().initCause(e17));
        }
    }

    public static com.tencent.wcdb.compat.SQLiteDatabase openDatabase(java.lang.String str, byte[] bArr, com.tencent.wcdb.compat.SQLiteCipherSpec sQLiteCipherSpec) {
        return openDatabase(str, bArr, sQLiteCipherSpec, null);
    }

    public int execSQL(java.lang.String str, java.lang.Object[] objArr, android.os.CancellationSignal cancellationSignal) {
        com.tencent.wcdb.compat.SQLiteStatement sQLiteStatement = new com.tencent.wcdb.compat.SQLiteStatement(this.mDB, str, objArr);
        try {
            int execute = sQLiteStatement.execute(cancellationSignal);
            sQLiteStatement.close();
            return execute;
        } catch (java.lang.Throwable th6) {
            try {
                sQLiteStatement.close();
            } catch (java.lang.Throwable th7) {
                th6.addSuppressed(th7);
            }
            throw th6;
        }
    }

    public static com.tencent.wcdb.compat.SQLiteDatabase openDatabase(java.lang.String str, byte[] bArr, final com.tencent.wcdb.compat.SQLiteCipherSpec sQLiteCipherSpec, com.tencent.wcdb.compat.DatabaseErrorHandler databaseErrorHandler) {
        com.tencent.wcdb.core.Database database = new com.tencent.wcdb.core.Database(str);
        if (bArr != null) {
            if (sQLiteCipherSpec == null) {
                database.setCipherKey(bArr);
            } else {
                int i17 = sQLiteCipherSpec.cipherVersion;
                if (i17 >= 0) {
                    database.setCipherKey(bArr, sQLiteCipherSpec.pageSize, kCipherVersionMapping[i17]);
                } else {
                    database.setCipherKey(bArr, sQLiteCipherSpec.pageSize);
                    database.setConfig("com.Tencent.WCDB.Config.CipherSpecCompat", new com.tencent.wcdb.core.Database.Config() { // from class: com.tencent.wcdb.compat.SQLiteDatabase.1
                        @Override // com.tencent.wcdb.core.Database.Config
                        public void onInvocation(com.tencent.wcdb.core.Handle handle) {
                            handle.execute("PRAGMA cipher_use_hmac = " + com.tencent.wcdb.compat.SQLiteCipherSpec.this.hmacEnabled);
                            if (com.tencent.wcdb.compat.SQLiteCipherSpec.this.kdfIteration != 0) {
                                handle.execute("PRAGMA kdf_iter = " + com.tencent.wcdb.compat.SQLiteCipherSpec.this.kdfIteration);
                            }
                            if (com.tencent.wcdb.compat.SQLiteCipherSpec.this.hmacAlgorithm != -1) {
                                handle.execute("PRAGMA cipher_hmac_algorithm = " + com.tencent.wcdb.compat.SQLiteCipherSpec.HMAC_ALGO_MAPPING[com.tencent.wcdb.compat.SQLiteCipherSpec.this.hmacAlgorithm]);
                            }
                            if (com.tencent.wcdb.compat.SQLiteCipherSpec.this.kdfAlgorithm != -1) {
                                handle.execute("PRAGMA cipher_kdf_algorithm = " + com.tencent.wcdb.compat.SQLiteCipherSpec.PBKDF2_ALGO_MAPPING[com.tencent.wcdb.compat.SQLiteCipherSpec.this.kdfAlgorithm]);
                            }
                        }
                    }, com.tencent.wcdb.core.Database.ConfigPriority.highest);
                }
            }
        }
        com.tencent.wcdb.compat.SQLiteDatabase sQLiteDatabase = new com.tencent.wcdb.compat.SQLiteDatabase(database);
        com.tencent.wcdb.core.Database.CorruptionNotification corruptionNotification = new com.tencent.wcdb.core.Database.CorruptionNotification(sQLiteDatabase) { // from class: com.tencent.wcdb.compat.SQLiteDatabase.2
            private final com.tencent.wcdb.compat.DatabaseErrorHandler mHandler;
            final /* synthetic */ com.tencent.wcdb.compat.SQLiteDatabase val$dbObj;

            {
                this.val$dbObj = sQLiteDatabase;
                this.mHandler = com.tencent.wcdb.compat.DatabaseErrorHandler.this == null ? com.tencent.wcdb.compat.SQLiteDatabase.sDefaultErrorHandler : com.tencent.wcdb.compat.DatabaseErrorHandler.this;
            }

            @Override // com.tencent.wcdb.core.Database.CorruptionNotification
            public void onCorrupted(com.tencent.wcdb.core.Database database2) {
                this.mHandler.onCorruption(this.val$dbObj);
            }
        };
        database.setNotificationWhenCorrupted(corruptionNotification);
        if (!database.canOpen()) {
            corruptionNotification.onCorrupted(database);
            database.getHandle().invalidate();
        }
        return sQLiteDatabase;
    }

    public android.database.Cursor query(java.lang.String str, java.lang.String[] strArr, java.lang.String str2, java.lang.String[] strArr2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        return query(false, str, strArr, str2, strArr2, str3, str4, str5, null);
    }

    public android.database.Cursor query(java.lang.String str, java.lang.String[] strArr, java.lang.String str2, java.lang.String[] strArr2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6) {
        return query(false, str, strArr, str2, strArr2, str3, str4, str5, str6);
    }
}
