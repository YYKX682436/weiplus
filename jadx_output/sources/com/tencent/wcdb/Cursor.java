package com.tencent.wcdb;

/* loaded from: classes12.dex */
public interface Cursor extends android.database.Cursor {
    public static final int FIELD_TYPE_BLOB = 4;
    public static final int FIELD_TYPE_FLOAT = 2;
    public static final int FIELD_TYPE_INTEGER = 1;
    public static final int FIELD_TYPE_NULL = 0;
    public static final int FIELD_TYPE_STRING = 3;

    @Override // android.database.Cursor, java.io.Closeable, java.lang.AutoCloseable
    void close();

    @Override // android.database.Cursor
    void copyStringToBuffer(int i17, android.database.CharArrayBuffer charArrayBuffer);

    @Override // android.database.Cursor
    void deactivate();

    @Override // android.database.Cursor
    byte[] getBlob(int i17);

    @Override // android.database.Cursor
    int getColumnCount();

    @Override // android.database.Cursor
    int getColumnIndex(java.lang.String str);

    @Override // android.database.Cursor
    int getColumnIndexOrThrow(java.lang.String str);

    @Override // android.database.Cursor
    java.lang.String getColumnName(int i17);

    @Override // android.database.Cursor
    java.lang.String[] getColumnNames();

    @Override // android.database.Cursor
    int getCount();

    @Override // android.database.Cursor
    double getDouble(int i17);

    @Override // android.database.Cursor
    android.os.Bundle getExtras();

    @Override // android.database.Cursor
    float getFloat(int i17);

    @Override // android.database.Cursor
    int getInt(int i17);

    @Override // android.database.Cursor
    long getLong(int i17);

    @Override // android.database.Cursor
    int getPosition();

    @Override // android.database.Cursor
    short getShort(int i17);

    @Override // android.database.Cursor
    java.lang.String getString(int i17);

    @Override // android.database.Cursor
    int getType(int i17);

    @Override // android.database.Cursor
    boolean getWantsAllOnMoveCalls();

    @Override // android.database.Cursor
    boolean isAfterLast();

    @Override // android.database.Cursor
    boolean isBeforeFirst();

    @Override // android.database.Cursor
    boolean isClosed();

    @Override // android.database.Cursor
    boolean isFirst();

    @Override // android.database.Cursor
    boolean isLast();

    @Override // android.database.Cursor
    boolean isNull(int i17);

    @Override // android.database.Cursor
    boolean move(int i17);

    @Override // android.database.Cursor
    boolean moveToFirst();

    @Override // android.database.Cursor
    boolean moveToLast();

    @Override // android.database.Cursor
    boolean moveToNext();

    @Override // android.database.Cursor
    boolean moveToPosition(int i17);

    @Override // android.database.Cursor
    boolean moveToPrevious();

    @Override // android.database.Cursor
    void registerContentObserver(android.database.ContentObserver contentObserver);

    @Override // android.database.Cursor
    void registerDataSetObserver(android.database.DataSetObserver dataSetObserver);

    @Override // android.database.Cursor
    @java.lang.Deprecated
    boolean requery();

    @Override // android.database.Cursor
    android.os.Bundle respond(android.os.Bundle bundle);

    @Override // android.database.Cursor
    void setNotificationUri(android.content.ContentResolver contentResolver, android.net.Uri uri);

    @Override // android.database.Cursor
    void unregisterContentObserver(android.database.ContentObserver contentObserver);

    @Override // android.database.Cursor
    void unregisterDataSetObserver(android.database.DataSetObserver dataSetObserver);
}
