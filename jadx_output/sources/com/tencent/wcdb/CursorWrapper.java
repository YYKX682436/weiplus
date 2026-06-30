package com.tencent.wcdb;

/* loaded from: classes12.dex */
public class CursorWrapper implements com.tencent.wcdb.Cursor {
    protected final com.tencent.wcdb.Cursor mCursor;

    public CursorWrapper(com.tencent.wcdb.Cursor cursor) {
        this.mCursor = cursor;
    }

    @Override // com.tencent.wcdb.Cursor, android.database.Cursor, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.mCursor.close();
    }

    @Override // com.tencent.wcdb.Cursor, android.database.Cursor
    public void copyStringToBuffer(int i17, android.database.CharArrayBuffer charArrayBuffer) {
        this.mCursor.copyStringToBuffer(i17, charArrayBuffer);
    }

    @Override // com.tencent.wcdb.Cursor, android.database.Cursor
    public void deactivate() {
        this.mCursor.deactivate();
    }

    @Override // com.tencent.wcdb.Cursor, android.database.Cursor
    public byte[] getBlob(int i17) {
        return this.mCursor.getBlob(i17);
    }

    @Override // com.tencent.wcdb.Cursor, android.database.Cursor
    public int getColumnCount() {
        return this.mCursor.getColumnCount();
    }

    @Override // com.tencent.wcdb.Cursor, android.database.Cursor
    public int getColumnIndex(java.lang.String str) {
        return this.mCursor.getColumnIndex(str);
    }

    @Override // com.tencent.wcdb.Cursor, android.database.Cursor
    public int getColumnIndexOrThrow(java.lang.String str) {
        return this.mCursor.getColumnIndexOrThrow(str);
    }

    @Override // com.tencent.wcdb.Cursor, android.database.Cursor
    public java.lang.String getColumnName(int i17) {
        return this.mCursor.getColumnName(i17);
    }

    @Override // com.tencent.wcdb.Cursor, android.database.Cursor
    public java.lang.String[] getColumnNames() {
        return this.mCursor.getColumnNames();
    }

    @Override // com.tencent.wcdb.Cursor, android.database.Cursor
    public int getCount() {
        return this.mCursor.getCount();
    }

    @Override // com.tencent.wcdb.Cursor, android.database.Cursor
    public double getDouble(int i17) {
        return this.mCursor.getDouble(i17);
    }

    @Override // com.tencent.wcdb.Cursor, android.database.Cursor
    public android.os.Bundle getExtras() {
        return this.mCursor.getExtras();
    }

    @Override // com.tencent.wcdb.Cursor, android.database.Cursor
    public float getFloat(int i17) {
        return this.mCursor.getFloat(i17);
    }

    @Override // com.tencent.wcdb.Cursor, android.database.Cursor
    public int getInt(int i17) {
        return this.mCursor.getInt(i17);
    }

    @Override // com.tencent.wcdb.Cursor, android.database.Cursor
    public long getLong(int i17) {
        return this.mCursor.getLong(i17);
    }

    @Override // android.database.Cursor
    public android.net.Uri getNotificationUri() {
        return null;
    }

    @Override // com.tencent.wcdb.Cursor, android.database.Cursor
    public int getPosition() {
        return this.mCursor.getPosition();
    }

    @Override // com.tencent.wcdb.Cursor, android.database.Cursor
    public short getShort(int i17) {
        return this.mCursor.getShort(i17);
    }

    @Override // com.tencent.wcdb.Cursor, android.database.Cursor
    public java.lang.String getString(int i17) {
        return this.mCursor.getString(i17);
    }

    @Override // com.tencent.wcdb.Cursor, android.database.Cursor
    public int getType(int i17) {
        return this.mCursor.getType(i17);
    }

    @Override // com.tencent.wcdb.Cursor, android.database.Cursor
    public boolean getWantsAllOnMoveCalls() {
        return this.mCursor.getWantsAllOnMoveCalls();
    }

    public com.tencent.wcdb.Cursor getWrappedCursor() {
        return this.mCursor;
    }

    @Override // com.tencent.wcdb.Cursor, android.database.Cursor
    public boolean isAfterLast() {
        return this.mCursor.isAfterLast();
    }

    @Override // com.tencent.wcdb.Cursor, android.database.Cursor
    public boolean isBeforeFirst() {
        return this.mCursor.isBeforeFirst();
    }

    @Override // com.tencent.wcdb.Cursor, android.database.Cursor
    public boolean isClosed() {
        return this.mCursor.isClosed();
    }

    @Override // com.tencent.wcdb.Cursor, android.database.Cursor
    public boolean isFirst() {
        return this.mCursor.isFirst();
    }

    @Override // com.tencent.wcdb.Cursor, android.database.Cursor
    public boolean isLast() {
        return this.mCursor.isLast();
    }

    @Override // com.tencent.wcdb.Cursor, android.database.Cursor
    public boolean isNull(int i17) {
        return this.mCursor.isNull(i17);
    }

    @Override // com.tencent.wcdb.Cursor, android.database.Cursor
    public boolean move(int i17) {
        return this.mCursor.move(i17);
    }

    @Override // com.tencent.wcdb.Cursor, android.database.Cursor
    public boolean moveToFirst() {
        return this.mCursor.moveToFirst();
    }

    @Override // com.tencent.wcdb.Cursor, android.database.Cursor
    public boolean moveToLast() {
        return this.mCursor.moveToLast();
    }

    @Override // com.tencent.wcdb.Cursor, android.database.Cursor
    public boolean moveToNext() {
        return this.mCursor.moveToNext();
    }

    @Override // com.tencent.wcdb.Cursor, android.database.Cursor
    public boolean moveToPosition(int i17) {
        return this.mCursor.moveToPosition(i17);
    }

    @Override // com.tencent.wcdb.Cursor, android.database.Cursor
    public boolean moveToPrevious() {
        return this.mCursor.moveToPrevious();
    }

    @Override // com.tencent.wcdb.Cursor, android.database.Cursor
    public void registerContentObserver(android.database.ContentObserver contentObserver) {
        this.mCursor.registerContentObserver(contentObserver);
    }

    @Override // com.tencent.wcdb.Cursor, android.database.Cursor
    public void registerDataSetObserver(android.database.DataSetObserver dataSetObserver) {
        this.mCursor.registerDataSetObserver(dataSetObserver);
    }

    @Override // com.tencent.wcdb.Cursor, android.database.Cursor
    public boolean requery() {
        return this.mCursor.requery();
    }

    @Override // com.tencent.wcdb.Cursor, android.database.Cursor
    public android.os.Bundle respond(android.os.Bundle bundle) {
        return this.mCursor.respond(bundle);
    }

    @Override // android.database.Cursor
    public void setExtras(android.os.Bundle bundle) {
    }

    @Override // com.tencent.wcdb.Cursor, android.database.Cursor
    public void setNotificationUri(android.content.ContentResolver contentResolver, android.net.Uri uri) {
        this.mCursor.setNotificationUri(contentResolver, uri);
    }

    @Override // com.tencent.wcdb.Cursor, android.database.Cursor
    public void unregisterContentObserver(android.database.ContentObserver contentObserver) {
        this.mCursor.unregisterContentObserver(contentObserver);
    }

    @Override // com.tencent.wcdb.Cursor, android.database.Cursor
    public void unregisterDataSetObserver(android.database.DataSetObserver dataSetObserver) {
        this.mCursor.unregisterDataSetObserver(dataSetObserver);
    }
}
