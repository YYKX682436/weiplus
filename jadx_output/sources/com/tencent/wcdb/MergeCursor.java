package com.tencent.wcdb;

/* loaded from: classes12.dex */
public class MergeCursor extends com.tencent.wcdb.AbstractCursor {
    private com.tencent.wcdb.Cursor mCursor;
    private com.tencent.wcdb.Cursor[] mCursors;
    private android.database.DataSetObserver mObserver = new android.database.DataSetObserver() { // from class: com.tencent.wcdb.MergeCursor.1
        @Override // android.database.DataSetObserver
        public void onChanged() {
            com.tencent.wcdb.MergeCursor.this.mPos = -1;
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            com.tencent.wcdb.MergeCursor.this.mPos = -1;
        }
    };

    public MergeCursor(com.tencent.wcdb.Cursor[] cursorArr) {
        this.mCursors = cursorArr;
        int i17 = 0;
        this.mCursor = cursorArr[0];
        while (true) {
            com.tencent.wcdb.Cursor[] cursorArr2 = this.mCursors;
            if (i17 >= cursorArr2.length) {
                return;
            }
            com.tencent.wcdb.Cursor cursor = cursorArr2[i17];
            if (cursor != null) {
                cursor.registerDataSetObserver(this.mObserver);
            }
            i17++;
        }
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        int length = this.mCursors.length;
        for (int i17 = 0; i17 < length; i17++) {
            com.tencent.wcdb.Cursor cursor = this.mCursors[i17];
            if (cursor != null) {
                cursor.close();
            }
        }
        super.close();
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
    public void deactivate() {
        int length = this.mCursors.length;
        for (int i17 = 0; i17 < length; i17++) {
            com.tencent.wcdb.Cursor cursor = this.mCursors[i17];
            if (cursor != null) {
                cursor.deactivate();
            }
        }
        super.deactivate();
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
    public byte[] getBlob(int i17) {
        return this.mCursor.getBlob(i17);
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
    public java.lang.String[] getColumnNames() {
        com.tencent.wcdb.Cursor cursor = this.mCursor;
        return cursor != null ? cursor.getColumnNames() : new java.lang.String[0];
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
    public int getCount() {
        int length = this.mCursors.length;
        int i17 = 0;
        for (int i18 = 0; i18 < length; i18++) {
            com.tencent.wcdb.Cursor cursor = this.mCursors[i18];
            if (cursor != null) {
                i17 += cursor.getCount();
            }
        }
        return i17;
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
    public double getDouble(int i17) {
        return this.mCursor.getDouble(i17);
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
    public float getFloat(int i17) {
        return this.mCursor.getFloat(i17);
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
    public int getInt(int i17) {
        return this.mCursor.getInt(i17);
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
    public long getLong(int i17) {
        return this.mCursor.getLong(i17);
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
    public short getShort(int i17) {
        return this.mCursor.getShort(i17);
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
    public java.lang.String getString(int i17) {
        return this.mCursor.getString(i17);
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
    public int getType(int i17) {
        return this.mCursor.getType(i17);
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
    public boolean isNull(int i17) {
        return this.mCursor.isNull(i17);
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.CrossProcessCursor
    public boolean onMove(int i17, int i18) {
        this.mCursor = null;
        int length = this.mCursors.length;
        int i19 = 0;
        int i27 = 0;
        while (true) {
            if (i19 >= length) {
                break;
            }
            com.tencent.wcdb.Cursor cursor = this.mCursors[i19];
            if (cursor != null) {
                if (i18 < cursor.getCount() + i27) {
                    this.mCursor = this.mCursors[i19];
                    break;
                }
                i27 += this.mCursors[i19].getCount();
            }
            i19++;
        }
        com.tencent.wcdb.Cursor cursor2 = this.mCursor;
        if (cursor2 != null) {
            return cursor2.moveToPosition(i18 - i27);
        }
        return false;
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
    public void registerContentObserver(android.database.ContentObserver contentObserver) {
        int length = this.mCursors.length;
        for (int i17 = 0; i17 < length; i17++) {
            com.tencent.wcdb.Cursor cursor = this.mCursors[i17];
            if (cursor != null) {
                cursor.registerContentObserver(contentObserver);
            }
        }
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
    public void registerDataSetObserver(android.database.DataSetObserver dataSetObserver) {
        int length = this.mCursors.length;
        for (int i17 = 0; i17 < length; i17++) {
            com.tencent.wcdb.Cursor cursor = this.mCursors[i17];
            if (cursor != null) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
    public boolean requery() {
        int length = this.mCursors.length;
        for (int i17 = 0; i17 < length; i17++) {
            com.tencent.wcdb.Cursor cursor = this.mCursors[i17];
            if (cursor != null && !cursor.requery()) {
                return false;
            }
        }
        return true;
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
    public void unregisterContentObserver(android.database.ContentObserver contentObserver) {
        int length = this.mCursors.length;
        for (int i17 = 0; i17 < length; i17++) {
            com.tencent.wcdb.Cursor cursor = this.mCursors[i17];
            if (cursor != null) {
                cursor.unregisterContentObserver(contentObserver);
            }
        }
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
    public void unregisterDataSetObserver(android.database.DataSetObserver dataSetObserver) {
        int length = this.mCursors.length;
        for (int i17 = 0; i17 < length; i17++) {
            com.tencent.wcdb.Cursor cursor = this.mCursors[i17];
            if (cursor != null) {
                cursor.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }
}
