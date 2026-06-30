package com.tencent.wcdb;

/* loaded from: classes12.dex */
public final class DatabaseUtils {
    private static final boolean DEBUG = false;
    private static final int EX_HAS_REPLY_HEADER = -128;
    public static final int STATEMENT_ABORT = 6;
    public static final int STATEMENT_ATTACH = 3;
    public static final int STATEMENT_BEGIN = 4;
    public static final int STATEMENT_COMMIT = 5;
    public static final int STATEMENT_DDL = 8;
    public static final int STATEMENT_OTHER = 99;
    public static final int STATEMENT_PRAGMA = 7;
    public static final int STATEMENT_SELECT = 1;
    public static final int STATEMENT_UNPREPARED = 9;
    public static final int STATEMENT_UPDATE = 2;
    private static final java.lang.String TAG = "WCDB.DatabaseUtils";
    private static final char[] DIGITS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    private static java.text.Collator mColl = null;

    @java.lang.Deprecated
    /* loaded from: classes12.dex */
    public static class InsertHelper {
        public static final int TABLE_INFO_PRAGMA_COLUMNNAME_INDEX = 1;
        public static final int TABLE_INFO_PRAGMA_DEFAULT_INDEX = 4;
        private java.util.HashMap<java.lang.String, java.lang.Integer> mColumns;
        private final com.tencent.wcdb.database.SQLiteDatabase mDb;
        private final java.lang.String mTableName;
        private java.lang.String mInsertSQL = null;
        private com.tencent.wcdb.database.SQLiteStatement mInsertStatement = null;
        private com.tencent.wcdb.database.SQLiteStatement mReplaceStatement = null;
        private com.tencent.wcdb.database.SQLiteStatement mPreparedStatement = null;

        public InsertHelper(com.tencent.wcdb.database.SQLiteDatabase sQLiteDatabase, java.lang.String str) {
            this.mDb = sQLiteDatabase;
            this.mTableName = str;
        }

        private void buildSQL() {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder(128);
            sb6.append("INSERT INTO ");
            sb6.append(this.mTableName);
            sb6.append(" (");
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder(128);
            sb7.append("VALUES (");
            com.tencent.wcdb.Cursor cursor = null;
            try {
                cursor = this.mDb.rawQuery("PRAGMA table_info(" + this.mTableName + ")", null);
                this.mColumns = new java.util.HashMap<>(cursor.getCount());
                int i17 = 1;
                while (cursor.moveToNext()) {
                    java.lang.String string = cursor.getString(1);
                    java.lang.String string2 = cursor.getString(4);
                    this.mColumns.put(string, java.lang.Integer.valueOf(i17));
                    sb6.append("'");
                    sb6.append(string);
                    sb6.append("'");
                    if (string2 == null) {
                        sb7.append("?");
                    } else {
                        sb7.append("COALESCE(?, ");
                        sb7.append(string2);
                        sb7.append(")");
                    }
                    sb6.append(i17 == cursor.getCount() ? ") " : ", ");
                    sb7.append(i17 == cursor.getCount() ? ");" : ", ");
                    i17++;
                }
                cursor.close();
                sb6.append((java.lang.CharSequence) sb7);
                this.mInsertSQL = sb6.toString();
            } catch (java.lang.Throwable th6) {
                if (cursor != null) {
                    cursor.close();
                }
                throw th6;
            }
        }

        private com.tencent.wcdb.database.SQLiteStatement getStatement(boolean z17) {
            if (!z17) {
                if (this.mInsertStatement == null) {
                    if (this.mInsertSQL == null) {
                        buildSQL();
                    }
                    this.mInsertStatement = this.mDb.compileStatement(this.mInsertSQL);
                }
                return this.mInsertStatement;
            }
            if (this.mReplaceStatement == null) {
                if (this.mInsertSQL == null) {
                    buildSQL();
                }
                this.mReplaceStatement = this.mDb.compileStatement("INSERT OR REPLACE" + this.mInsertSQL.substring(6));
            }
            return this.mReplaceStatement;
        }

        private long insertInternal(android.content.ContentValues contentValues, boolean z17) {
            this.mDb.beginTransactionNonExclusive();
            try {
                try {
                    com.tencent.wcdb.database.SQLiteStatement statement = getStatement(z17);
                    statement.clearBindings();
                    for (java.util.Map.Entry<java.lang.String, java.lang.Object> entry : contentValues.valueSet()) {
                        com.tencent.wcdb.DatabaseUtils.bindObjectToProgram(statement, getColumnIndex(entry.getKey()), entry.getValue());
                    }
                    long executeInsert = statement.executeInsert();
                    this.mDb.setTransactionSuccessful();
                    return executeInsert;
                } catch (com.tencent.wcdb.SQLException e17) {
                    com.tencent.wcdb.support.Log.e(com.tencent.wcdb.DatabaseUtils.TAG, "Error inserting " + contentValues + " into table  " + this.mTableName, e17);
                    this.mDb.endTransaction();
                    return -1L;
                }
            } finally {
                this.mDb.endTransaction();
            }
        }

        public void bind(int i17, double d17) {
            this.mPreparedStatement.bindDouble(i17, d17);
        }

        public void bindNull(int i17) {
            this.mPreparedStatement.bindNull(i17);
        }

        public void close() {
            com.tencent.wcdb.database.SQLiteStatement sQLiteStatement = this.mInsertStatement;
            if (sQLiteStatement != null) {
                sQLiteStatement.close();
                this.mInsertStatement = null;
            }
            com.tencent.wcdb.database.SQLiteStatement sQLiteStatement2 = this.mReplaceStatement;
            if (sQLiteStatement2 != null) {
                sQLiteStatement2.close();
                this.mReplaceStatement = null;
            }
            this.mInsertSQL = null;
            this.mColumns = null;
        }

        public long execute() {
            com.tencent.wcdb.database.SQLiteStatement sQLiteStatement = this.mPreparedStatement;
            if (sQLiteStatement == null) {
                throw new java.lang.IllegalStateException("you must prepare this inserter before calling execute");
            }
            try {
                try {
                    return sQLiteStatement.executeInsert();
                } catch (com.tencent.wcdb.SQLException e17) {
                    com.tencent.wcdb.support.Log.e(com.tencent.wcdb.DatabaseUtils.TAG, "Error executing InsertHelper with table " + this.mTableName, e17);
                    this.mPreparedStatement = null;
                    return -1L;
                }
            } finally {
                this.mPreparedStatement = null;
            }
        }

        public int getColumnIndex(java.lang.String str) {
            getStatement(false);
            java.lang.Integer num = this.mColumns.get(str);
            if (num != null) {
                return num.intValue();
            }
            throw new java.lang.IllegalArgumentException("column '" + str + "' is invalid");
        }

        public long insert(android.content.ContentValues contentValues) {
            return insertInternal(contentValues, false);
        }

        public void prepareForInsert() {
            com.tencent.wcdb.database.SQLiteStatement statement = getStatement(false);
            this.mPreparedStatement = statement;
            statement.clearBindings();
        }

        public void prepareForReplace() {
            com.tencent.wcdb.database.SQLiteStatement statement = getStatement(true);
            this.mPreparedStatement = statement;
            statement.clearBindings();
        }

        public long replace(android.content.ContentValues contentValues) {
            return insertInternal(contentValues, true);
        }

        public void bind(int i17, float f17) {
            this.mPreparedStatement.bindDouble(i17, f17);
        }

        public void bind(int i17, long j17) {
            this.mPreparedStatement.bindLong(i17, j17);
        }

        public void bind(int i17, int i18) {
            this.mPreparedStatement.bindLong(i17, i18);
        }

        public void bind(int i17, boolean z17) {
            this.mPreparedStatement.bindLong(i17, z17 ? 1L : 0L);
        }

        public void bind(int i17, byte[] bArr) {
            if (bArr == null) {
                this.mPreparedStatement.bindNull(i17);
            } else {
                this.mPreparedStatement.bindBlob(i17, bArr);
            }
        }

        public void bind(int i17, java.lang.String str) {
            if (str == null) {
                this.mPreparedStatement.bindNull(i17);
            } else {
                this.mPreparedStatement.bindString(i17, str);
            }
        }
    }

    public static void appendEscapedSQLString(java.lang.StringBuilder sb6, java.lang.String str) {
        sb6.append('\'');
        if (str.indexOf(39) != -1) {
            int length = str.length();
            for (int i17 = 0; i17 < length; i17++) {
                char charAt = str.charAt(i17);
                if (charAt == '\'') {
                    sb6.append('\'');
                }
                sb6.append(charAt);
            }
        } else {
            sb6.append(str);
        }
        sb6.append('\'');
    }

    public static java.lang.String[] appendSelectionArgs(java.lang.String[] strArr, java.lang.String[] strArr2) {
        if (strArr == null || strArr.length == 0) {
            return strArr2;
        }
        java.lang.String[] strArr3 = new java.lang.String[strArr.length + strArr2.length];
        java.lang.System.arraycopy(strArr, 0, strArr3, 0, strArr.length);
        java.lang.System.arraycopy(strArr2, 0, strArr3, strArr.length, strArr2.length);
        return strArr3;
    }

    public static final void appendValueToSql(java.lang.StringBuilder sb6, java.lang.Object obj) {
        if (obj == null) {
            sb6.append("NULL");
            return;
        }
        if (!(obj instanceof java.lang.Boolean)) {
            appendEscapedSQLString(sb6, obj.toString());
        } else if (((java.lang.Boolean) obj).booleanValue()) {
            sb6.append('1');
        } else {
            sb6.append('0');
        }
    }

    public static void bindObjectToProgram(com.tencent.wcdb.database.SQLiteProgram sQLiteProgram, int i17, java.lang.Object obj) {
        if (obj == null) {
            sQLiteProgram.bindNull(i17);
            return;
        }
        if ((obj instanceof java.lang.Double) || (obj instanceof java.lang.Float)) {
            sQLiteProgram.bindDouble(i17, ((java.lang.Number) obj).doubleValue());
            return;
        }
        if (obj instanceof java.lang.Number) {
            sQLiteProgram.bindLong(i17, ((java.lang.Number) obj).longValue());
            return;
        }
        if (obj instanceof java.lang.Boolean) {
            if (((java.lang.Boolean) obj).booleanValue()) {
                sQLiteProgram.bindLong(i17, 1L);
                return;
            } else {
                sQLiteProgram.bindLong(i17, 0L);
                return;
            }
        }
        if (obj instanceof byte[]) {
            sQLiteProgram.bindBlob(i17, (byte[]) obj);
        } else {
            sQLiteProgram.bindString(i17, obj.toString());
        }
    }

    public static java.lang.String concatenateWhere(java.lang.String str, java.lang.String str2) {
        if (android.text.TextUtils.isEmpty(str)) {
            return str2;
        }
        if (android.text.TextUtils.isEmpty(str2)) {
            return str;
        }
        return "(" + str + ") AND (" + str2 + ")";
    }

    public static void createDbFromSqlStatements(android.content.Context context, java.lang.String str, byte[] bArr, com.tencent.wcdb.database.SQLiteCipherSpec sQLiteCipherSpec, int i17, java.lang.String str2) {
        com.tencent.wcdb.database.SQLiteDatabase openOrCreateDatabase = com.tencent.wcdb.support.Context.openOrCreateDatabase(context, str, bArr, sQLiteCipherSpec, 0, null);
        for (java.lang.String str3 : android.text.TextUtils.split(str2, ";\n")) {
            if (!android.text.TextUtils.isEmpty(str3)) {
                openOrCreateDatabase.execSQL(str3);
            }
        }
        openOrCreateDatabase.setVersion(i17);
        openOrCreateDatabase.close();
    }

    public static void cursorDoubleToContentValues(com.tencent.wcdb.Cursor cursor, java.lang.String str, android.content.ContentValues contentValues, java.lang.String str2) {
        int columnIndex = cursor.getColumnIndex(str);
        if (cursor.isNull(columnIndex)) {
            contentValues.put(str2, (java.lang.Double) null);
        } else {
            contentValues.put(str2, java.lang.Double.valueOf(cursor.getDouble(columnIndex)));
        }
    }

    public static void cursorDoubleToContentValuesIfPresent(com.tencent.wcdb.Cursor cursor, android.content.ContentValues contentValues, java.lang.String str) {
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex == -1 || cursor.isNull(columnIndex)) {
            return;
        }
        contentValues.put(str, java.lang.Double.valueOf(cursor.getDouble(columnIndex)));
    }

    public static void cursorDoubleToCursorValues(com.tencent.wcdb.Cursor cursor, java.lang.String str, android.content.ContentValues contentValues) {
        cursorDoubleToContentValues(cursor, str, contentValues, str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002b, code lost:
    
        r3 = r5.getType(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002f, code lost:
    
        if (r3 == 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0032, code lost:
    
        if (r3 == 1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0035, code lost:
    
        if (r3 == 2) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0038, code lost:
    
        if (r3 == 4) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003a, code lost:
    
        r3 = r5.getString(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003e, code lost:
    
        if (r3 == null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0040, code lost:
    
        r3 = r7.putString(r3, r6, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0070, code lost:
    
        if (r3 != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0076, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0072, code lost:
    
        r7.freeLastRow();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0079, code lost:
    
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007f, code lost:
    
        if (r5.moveToNext() != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0045, code lost:
    
        r3 = r7.putNull(r6, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x004a, code lost:
    
        r3 = r5.getBlob(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x004e, code lost:
    
        if (r3 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0050, code lost:
    
        r3 = r7.putBlob(r3, r6, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0055, code lost:
    
        r3 = r7.putNull(r6, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x005a, code lost:
    
        r3 = r7.putDouble(r5.getDouble(r2), r6, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0063, code lost:
    
        r3 = r7.putLong(r5.getLong(r2), r6, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x006c, code lost:
    
        r3 = r7.putNull(r6, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0081, code lost:
    
        r5.moveToPosition(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0084, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001f, code lost:
    
        if (r5.moveToPosition(r6) != false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0025, code lost:
    
        if (r7.allocRow() != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0028, code lost:
    
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0029, code lost:
    
        if (r2 >= r1) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void cursorFillWindow(com.tencent.wcdb.Cursor r5, int r6, com.tencent.wcdb.CursorWindow r7) {
        /*
            if (r6 < 0) goto L84
            int r0 = r5.getCount()
            if (r6 < r0) goto La
            goto L84
        La:
            int r0 = r5.getPosition()
            int r1 = r5.getColumnCount()
            r7.clear()
            r7.setStartPosition(r6)
            r7.setNumColumns(r1)
            boolean r2 = r5.moveToPosition(r6)
            if (r2 == 0) goto L81
        L21:
            boolean r2 = r7.allocRow()
            if (r2 != 0) goto L28
            goto L81
        L28:
            r2 = 0
        L29:
            if (r2 >= r1) goto L79
            int r3 = r5.getType(r2)
            if (r3 == 0) goto L6c
            r4 = 1
            if (r3 == r4) goto L63
            r4 = 2
            if (r3 == r4) goto L5a
            r4 = 4
            if (r3 == r4) goto L4a
            java.lang.String r3 = r5.getString(r2)
            if (r3 == 0) goto L45
            boolean r3 = r7.putString(r3, r6, r2)
            goto L70
        L45:
            boolean r3 = r7.putNull(r6, r2)
            goto L70
        L4a:
            byte[] r3 = r5.getBlob(r2)
            if (r3 == 0) goto L55
            boolean r3 = r7.putBlob(r3, r6, r2)
            goto L70
        L55:
            boolean r3 = r7.putNull(r6, r2)
            goto L70
        L5a:
            double r3 = r5.getDouble(r2)
            boolean r3 = r7.putDouble(r3, r6, r2)
            goto L70
        L63:
            long r3 = r5.getLong(r2)
            boolean r3 = r7.putLong(r3, r6, r2)
            goto L70
        L6c:
            boolean r3 = r7.putNull(r6, r2)
        L70:
            if (r3 != 0) goto L76
            r7.freeLastRow()
            goto L79
        L76:
            int r2 = r2 + 1
            goto L29
        L79:
            int r6 = r6 + 1
            boolean r2 = r5.moveToNext()
            if (r2 != 0) goto L21
        L81:
            r5.moveToPosition(r0)
        L84:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.wcdb.DatabaseUtils.cursorFillWindow(com.tencent.wcdb.Cursor, int, com.tencent.wcdb.CursorWindow):void");
    }

    public static void cursorFloatToContentValuesIfPresent(com.tencent.wcdb.Cursor cursor, android.content.ContentValues contentValues, java.lang.String str) {
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex == -1 || cursor.isNull(columnIndex)) {
            return;
        }
        contentValues.put(str, java.lang.Float.valueOf(cursor.getFloat(columnIndex)));
    }

    public static void cursorIntToContentValues(com.tencent.wcdb.Cursor cursor, java.lang.String str, android.content.ContentValues contentValues) {
        cursorIntToContentValues(cursor, str, contentValues, str);
    }

    public static void cursorIntToContentValuesIfPresent(com.tencent.wcdb.Cursor cursor, android.content.ContentValues contentValues, java.lang.String str) {
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex == -1 || cursor.isNull(columnIndex)) {
            return;
        }
        contentValues.put(str, java.lang.Integer.valueOf(cursor.getInt(columnIndex)));
    }

    public static void cursorLongToContentValues(com.tencent.wcdb.Cursor cursor, java.lang.String str, android.content.ContentValues contentValues) {
        cursorLongToContentValues(cursor, str, contentValues, str);
    }

    public static void cursorLongToContentValuesIfPresent(com.tencent.wcdb.Cursor cursor, android.content.ContentValues contentValues, java.lang.String str) {
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex == -1 || cursor.isNull(columnIndex)) {
            return;
        }
        contentValues.put(str, java.lang.Long.valueOf(cursor.getLong(columnIndex)));
    }

    public static int cursorPickFillWindowStartPosition(int i17, int i18) {
        return java.lang.Math.max(i17 - (i18 / 3), 0);
    }

    public static void cursorRowToContentValues(com.tencent.wcdb.Cursor cursor, android.content.ContentValues contentValues) {
        com.tencent.wcdb.AbstractWindowedCursor abstractWindowedCursor = cursor instanceof com.tencent.wcdb.AbstractWindowedCursor ? (com.tencent.wcdb.AbstractWindowedCursor) cursor : null;
        java.lang.String[] columnNames = cursor.getColumnNames();
        int length = columnNames.length;
        for (int i17 = 0; i17 < length; i17++) {
            if (abstractWindowedCursor == null || !abstractWindowedCursor.isBlob(i17)) {
                contentValues.put(columnNames[i17], cursor.getString(i17));
            } else {
                contentValues.put(columnNames[i17], cursor.getBlob(i17));
            }
        }
    }

    public static void cursorShortToContentValuesIfPresent(com.tencent.wcdb.Cursor cursor, android.content.ContentValues contentValues, java.lang.String str) {
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex == -1 || cursor.isNull(columnIndex)) {
            return;
        }
        contentValues.put(str, java.lang.Short.valueOf(cursor.getShort(columnIndex)));
    }

    public static void cursorStringToContentValues(com.tencent.wcdb.Cursor cursor, java.lang.String str, android.content.ContentValues contentValues) {
        cursorStringToContentValues(cursor, str, contentValues, str);
    }

    public static void cursorStringToContentValuesIfPresent(com.tencent.wcdb.Cursor cursor, android.content.ContentValues contentValues, java.lang.String str) {
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex == -1 || cursor.isNull(columnIndex)) {
            return;
        }
        contentValues.put(str, cursor.getString(columnIndex));
    }

    public static void cursorStringToInsertHelper(com.tencent.wcdb.Cursor cursor, java.lang.String str, com.tencent.wcdb.DatabaseUtils.InsertHelper insertHelper, int i17) {
        insertHelper.bind(i17, cursor.getString(cursor.getColumnIndexOrThrow(str)));
    }

    public static void dumpCurrentRow(com.tencent.wcdb.Cursor cursor) {
        dumpCurrentRow(cursor, java.lang.System.out);
    }

    public static java.lang.String dumpCurrentRowToString(com.tencent.wcdb.Cursor cursor) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        dumpCurrentRow(cursor, sb6);
        return sb6.toString();
    }

    public static void dumpCursor(com.tencent.wcdb.Cursor cursor) {
        dumpCursor(cursor, java.lang.System.out);
    }

    public static java.lang.String dumpCursorToString(com.tencent.wcdb.Cursor cursor) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        dumpCursor(cursor, sb6);
        return sb6.toString();
    }

    private static char[] encodeHex(byte[] bArr) {
        char[] cArr = new char[bArr.length << 1];
        int i17 = 0;
        for (byte b17 : bArr) {
            int i18 = i17 + 1;
            char[] cArr2 = DIGITS;
            cArr[i17] = cArr2[(b17 & 240) >>> 4];
            i17 = i18 + 1;
            cArr[i18] = cArr2[b17 & 15];
        }
        return cArr;
    }

    private static int extractSqlCode(java.lang.String str) {
        int i17 = 0;
        for (int i18 = 0; i18 < 3; i18++) {
            int charAt = str.charAt(i18);
            if (charAt >= 97 && charAt <= 122) {
                charAt = (charAt - 97) + 65;
            } else if (charAt >= 128) {
                return 0;
            }
            i17 |= (charAt & 127) << (i18 * 8);
        }
        return i17;
    }

    public static int findRowIdColumnIndex(java.lang.String[] strArr) {
        int length = strArr.length;
        for (int i17 = 0; i17 < length; i17++) {
            if (strArr[i17].equals("_id")) {
                return i17;
            }
        }
        return -1;
    }

    public static java.lang.String getCollationKey(java.lang.String str) {
        byte[] collationKeyInBytes = getCollationKeyInBytes(str);
        try {
            return new java.lang.String(collationKeyInBytes, 0, getKeyLen(collationKeyInBytes), "ISO8859_1");
        } catch (java.lang.Exception unused) {
            return "";
        }
    }

    private static byte[] getCollationKeyInBytes(java.lang.String str) {
        if (mColl == null) {
            java.text.Collator collator = java.text.Collator.getInstance();
            mColl = collator;
            collator.setStrength(0);
        }
        return mColl.getCollationKey(str).toByteArray();
    }

    public static java.lang.String getHexCollationKey(java.lang.String str) {
        byte[] collationKeyInBytes = getCollationKeyInBytes(str);
        return new java.lang.String(encodeHex(collationKeyInBytes), 0, getKeyLen(collationKeyInBytes) * 2);
    }

    private static int getKeyLen(byte[] bArr) {
        return bArr[bArr.length + (-1)] != 0 ? bArr.length : bArr.length - 1;
    }

    public static int getSqlStatementType(java.lang.String str) {
        java.lang.String trim = str.trim();
        if (trim.length() < 3) {
            return 99;
        }
        switch (extractSqlCode(trim)) {
            case 4279873:
            case 5522756:
                return 9;
            case 4280912:
                return 7;
            case 4476485:
            case 5066563:
                return 5;
            case 4477013:
            case 4998468:
            case 5260626:
            case 5459529:
                return 2;
            case 4543043:
            case 5198404:
            case 5524545:
                return 8;
            case 4670786:
                return 4;
            case 4998483:
                return 1;
            case 5001042:
                return 6;
            case 5526593:
                return 3;
            default:
                return 99;
        }
    }

    public static int getTypeOfObject(java.lang.Object obj) {
        if (obj == null) {
            return 0;
        }
        if (obj instanceof byte[]) {
            return 4;
        }
        if ((obj instanceof java.lang.Float) || (obj instanceof java.lang.Double)) {
            return 2;
        }
        return ((obj instanceof java.lang.Long) || (obj instanceof java.lang.Integer) || (obj instanceof java.lang.Short) || (obj instanceof java.lang.Byte)) ? 1 : 3;
    }

    public static long longForQuery(com.tencent.wcdb.database.SQLiteDatabase sQLiteDatabase, java.lang.String str, java.lang.String[] strArr) {
        com.tencent.wcdb.database.SQLiteStatement compileStatement = sQLiteDatabase.compileStatement(str);
        try {
            return longForQuery(compileStatement, strArr);
        } finally {
            compileStatement.close();
        }
    }

    public static boolean objectEquals(java.lang.Object obj, java.lang.Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static boolean queryIsEmpty(com.tencent.wcdb.database.SQLiteDatabase sQLiteDatabase, java.lang.String str) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("select exists(select 1 from ");
        sb6.append(str);
        sb6.append(")");
        return longForQuery(sQLiteDatabase, sb6.toString(), null) == 0;
    }

    public static long queryNumEntries(com.tencent.wcdb.database.SQLiteDatabase sQLiteDatabase, java.lang.String str) {
        return queryNumEntries(sQLiteDatabase, str, null, null);
    }

    private static final int readExceptionCode(android.os.Parcel parcel) {
        int readInt = parcel.readInt();
        if (readInt != EX_HAS_REPLY_HEADER) {
            return readInt;
        }
        if (parcel.readInt() != 0) {
            return 0;
        }
        com.tencent.wcdb.support.Log.e(TAG, "Unexpected zero-sized Parcel reply header.");
        return 0;
    }

    public static final void readExceptionFromParcel(android.os.Parcel parcel) {
        int readExceptionCode = readExceptionCode(parcel);
        if (readExceptionCode == 0) {
            return;
        }
        readExceptionFromParcel(parcel, parcel.readString(), readExceptionCode);
    }

    public static void readExceptionWithFileNotFoundExceptionFromParcel(android.os.Parcel parcel) {
        int readExceptionCode = readExceptionCode(parcel);
        if (readExceptionCode == 0) {
            return;
        }
        java.lang.String readString = parcel.readString();
        if (readExceptionCode == 1) {
            throw new java.io.FileNotFoundException(readString);
        }
        readExceptionFromParcel(parcel, readString, readExceptionCode);
    }

    public static void readExceptionWithOperationApplicationExceptionFromParcel(android.os.Parcel parcel) {
        int readExceptionCode = readExceptionCode(parcel);
        if (readExceptionCode == 0) {
            return;
        }
        java.lang.String readString = parcel.readString();
        if (readExceptionCode == 10) {
            throw new android.content.OperationApplicationException(readString);
        }
        readExceptionFromParcel(parcel, readString, readExceptionCode);
    }

    public static java.lang.String sqlEscapeString(java.lang.String str) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        appendEscapedSQLString(sb6, str);
        return sb6.toString();
    }

    public static java.lang.String stringForQuery(com.tencent.wcdb.database.SQLiteDatabase sQLiteDatabase, java.lang.String str, java.lang.String[] strArr) {
        com.tencent.wcdb.database.SQLiteStatement compileStatement = sQLiteDatabase.compileStatement(str);
        try {
            return stringForQuery(compileStatement, strArr);
        } finally {
            compileStatement.close();
        }
    }

    public static final void writeExceptionToParcel(android.os.Parcel parcel, java.lang.Exception exc) {
        int i17;
        boolean z17 = false;
        int i18 = 1;
        if (!(exc instanceof java.io.FileNotFoundException)) {
            if (exc instanceof java.lang.IllegalArgumentException) {
                i17 = 2;
            } else if (exc instanceof java.lang.UnsupportedOperationException) {
                i17 = 3;
            } else if (exc instanceof com.tencent.wcdb.database.SQLiteAbortException) {
                i17 = 4;
            } else if (exc instanceof com.tencent.wcdb.database.SQLiteConstraintException) {
                i17 = 5;
            } else if (exc instanceof com.tencent.wcdb.database.SQLiteDatabaseCorruptException) {
                i17 = 6;
            } else if (exc instanceof com.tencent.wcdb.database.SQLiteFullException) {
                i17 = 7;
            } else if (exc instanceof com.tencent.wcdb.database.SQLiteDiskIOException) {
                i17 = 8;
            } else if (exc instanceof com.tencent.wcdb.database.SQLiteException) {
                i17 = 9;
            } else if (exc instanceof android.content.OperationApplicationException) {
                i17 = 10;
            } else {
                if (!(exc instanceof com.tencent.wcdb.support.OperationCanceledException)) {
                    parcel.writeException(exc);
                    com.tencent.wcdb.support.Log.e(TAG, "Writing exception to parcel", exc);
                    return;
                }
                i18 = 11;
            }
            z17 = true;
            i18 = i17;
        }
        parcel.writeInt(i18);
        parcel.writeString(exc.getMessage());
        if (z17) {
            com.tencent.wcdb.support.Log.e(TAG, "Writing exception to parcel", exc);
        }
    }

    public static void cursorIntToContentValues(com.tencent.wcdb.Cursor cursor, java.lang.String str, android.content.ContentValues contentValues, java.lang.String str2) {
        int columnIndex = cursor.getColumnIndex(str);
        if (!cursor.isNull(columnIndex)) {
            contentValues.put(str2, java.lang.Integer.valueOf(cursor.getInt(columnIndex)));
        } else {
            contentValues.put(str2, (java.lang.Integer) null);
        }
    }

    public static void cursorLongToContentValues(com.tencent.wcdb.Cursor cursor, java.lang.String str, android.content.ContentValues contentValues, java.lang.String str2) {
        int columnIndex = cursor.getColumnIndex(str);
        if (!cursor.isNull(columnIndex)) {
            contentValues.put(str2, java.lang.Long.valueOf(cursor.getLong(columnIndex)));
        } else {
            contentValues.put(str2, (java.lang.Long) null);
        }
    }

    public static void cursorStringToContentValues(com.tencent.wcdb.Cursor cursor, java.lang.String str, android.content.ContentValues contentValues, java.lang.String str2) {
        contentValues.put(str2, cursor.getString(cursor.getColumnIndexOrThrow(str)));
    }

    public static void dumpCurrentRow(com.tencent.wcdb.Cursor cursor, java.io.PrintStream printStream) {
        java.lang.String str;
        java.lang.String[] columnNames = cursor.getColumnNames();
        printStream.println("" + cursor.getPosition() + " {");
        int length = columnNames.length;
        for (int i17 = 0; i17 < length; i17++) {
            try {
                str = cursor.getString(i17);
            } catch (com.tencent.wcdb.database.SQLiteException unused) {
                str = "<unprintable>";
            }
            printStream.println("   " + columnNames[i17] + '=' + str);
        }
        printStream.println("}");
    }

    public static void dumpCursor(com.tencent.wcdb.Cursor cursor, java.io.PrintStream printStream) {
        printStream.println(">>>>> Dumping cursor " + cursor);
        if (cursor != null) {
            int position = cursor.getPosition();
            cursor.moveToPosition(-1);
            while (cursor.moveToNext()) {
                dumpCurrentRow(cursor, printStream);
            }
            cursor.moveToPosition(position);
        }
        printStream.println("<<<<<");
    }

    public static long queryNumEntries(com.tencent.wcdb.database.SQLiteDatabase sQLiteDatabase, java.lang.String str, java.lang.String str2) {
        return queryNumEntries(sQLiteDatabase, str, str2, null);
    }

    public static long queryNumEntries(com.tencent.wcdb.database.SQLiteDatabase sQLiteDatabase, java.lang.String str, java.lang.String str2, java.lang.String[] strArr) {
        java.lang.String str3;
        if (android.text.TextUtils.isEmpty(str2)) {
            str3 = "";
        } else {
            str3 = " where " + str2;
        }
        return longForQuery(sQLiteDatabase, "select count(*) from " + str + str3, strArr);
    }

    private static final void readExceptionFromParcel(android.os.Parcel parcel, java.lang.String str, int i17) {
        switch (i17) {
            case 2:
                throw new java.lang.IllegalArgumentException(str);
            case 3:
                throw new java.lang.UnsupportedOperationException(str);
            case 4:
                throw new com.tencent.wcdb.database.SQLiteAbortException(str);
            case 5:
                throw new com.tencent.wcdb.database.SQLiteConstraintException(str);
            case 6:
                throw new com.tencent.wcdb.database.SQLiteDatabaseCorruptException(str);
            case 7:
                throw new com.tencent.wcdb.database.SQLiteFullException(str);
            case 8:
                throw new com.tencent.wcdb.database.SQLiteDiskIOException(str);
            case 9:
                throw new com.tencent.wcdb.database.SQLiteException(str);
            case 10:
            default:
                parcel.readException(i17, str);
                return;
            case 11:
                throw new com.tencent.wcdb.support.OperationCanceledException(str);
        }
    }

    public static long longForQuery(com.tencent.wcdb.database.SQLiteStatement sQLiteStatement, java.lang.String[] strArr) {
        sQLiteStatement.bindAllArgsAsStrings(strArr);
        return sQLiteStatement.simpleQueryForLong();
    }

    public static java.lang.String stringForQuery(com.tencent.wcdb.database.SQLiteStatement sQLiteStatement, java.lang.String[] strArr) {
        sQLiteStatement.bindAllArgsAsStrings(strArr);
        return sQLiteStatement.simpleQueryForString();
    }

    public static void createDbFromSqlStatements(android.content.Context context, java.lang.String str, int i17, java.lang.String str2) {
        createDbFromSqlStatements(context, str, null, null, i17, str2);
    }

    public static void dumpCurrentRow(com.tencent.wcdb.Cursor cursor, java.lang.StringBuilder sb6) {
        java.lang.String str;
        java.lang.String[] columnNames = cursor.getColumnNames();
        sb6.append("" + cursor.getPosition() + " {\n");
        int length = columnNames.length;
        for (int i17 = 0; i17 < length; i17++) {
            try {
                str = cursor.getString(i17);
            } catch (com.tencent.wcdb.database.SQLiteException unused) {
                str = "<unprintable>";
            }
            sb6.append("   " + columnNames[i17] + '=' + str + "\n");
        }
        sb6.append("}\n");
    }

    public static void dumpCursor(com.tencent.wcdb.Cursor cursor, java.lang.StringBuilder sb6) {
        sb6.append(">>>>> Dumping cursor " + cursor + "\n");
        if (cursor != null) {
            int position = cursor.getPosition();
            cursor.moveToPosition(-1);
            while (cursor.moveToNext()) {
                dumpCurrentRow(cursor, sb6);
            }
            cursor.moveToPosition(position);
        }
        sb6.append("<<<<<\n");
    }
}
