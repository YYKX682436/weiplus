package com.tencent.wcdb.database;

/* loaded from: classes12.dex */
public interface SQLiteCheckpointListener {
    void onAttach(com.tencent.wcdb.database.SQLiteDatabase sQLiteDatabase);

    void onDetach(com.tencent.wcdb.database.SQLiteDatabase sQLiteDatabase);

    void onWALCommit(com.tencent.wcdb.database.SQLiteDatabase sQLiteDatabase, java.lang.String str, int i17);
}
