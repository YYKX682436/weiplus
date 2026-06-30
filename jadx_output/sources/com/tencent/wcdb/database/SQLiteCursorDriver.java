package com.tencent.wcdb.database;

/* loaded from: classes12.dex */
public interface SQLiteCursorDriver {
    void cursorClosed();

    void cursorDeactivated();

    void cursorRequeried(com.tencent.wcdb.Cursor cursor);

    com.tencent.wcdb.Cursor query(com.tencent.wcdb.database.SQLiteDatabase.CursorFactory cursorFactory, java.lang.Object[] objArr);

    void setBindArguments(java.lang.String[] strArr);
}
