package com.tencent.wcdb;

/* loaded from: classes12.dex */
public interface IBulkCursor extends android.os.IInterface {
    public static final int CLOSE_TRANSACTION = 7;
    public static final int DEACTIVATE_TRANSACTION = 2;
    public static final int GET_CURSOR_WINDOW_TRANSACTION = 1;
    public static final int GET_EXTRAS_TRANSACTION = 5;
    public static final int ON_MOVE_TRANSACTION = 4;
    public static final int REQUERY_TRANSACTION = 3;
    public static final int RESPOND_TRANSACTION = 6;
    public static final java.lang.String descriptor = "android.content.IBulkCursor";

    void close();

    void deactivate();

    android.os.Bundle getExtras();

    com.tencent.wcdb.CursorWindow getWindow(int i17);

    void onMove(int i17);

    int requery(com.tencent.wcdb.IContentObserver iContentObserver);

    android.os.Bundle respond(android.os.Bundle bundle);
}
