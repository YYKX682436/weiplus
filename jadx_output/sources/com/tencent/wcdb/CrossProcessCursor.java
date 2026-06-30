package com.tencent.wcdb;

/* loaded from: classes12.dex */
public interface CrossProcessCursor extends com.tencent.wcdb.Cursor {
    void fillWindow(int i17, com.tencent.wcdb.CursorWindow cursorWindow);

    com.tencent.wcdb.CursorWindow getWindow();

    boolean onMove(int i17, int i18);
}
