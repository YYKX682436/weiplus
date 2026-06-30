package com.tencent.wcdb;

/* loaded from: classes12.dex */
public class CrossProcessCursorWrapper extends com.tencent.wcdb.CursorWrapper implements com.tencent.wcdb.CrossProcessCursor {
    public CrossProcessCursorWrapper(com.tencent.wcdb.Cursor cursor) {
        super(cursor);
    }

    @Override // com.tencent.wcdb.CrossProcessCursor
    public void fillWindow(int i17, com.tencent.wcdb.CursorWindow cursorWindow) {
        com.tencent.wcdb.Cursor cursor = this.mCursor;
        if (cursor instanceof com.tencent.wcdb.CrossProcessCursor) {
            ((com.tencent.wcdb.CrossProcessCursor) cursor).fillWindow(i17, cursorWindow);
        } else {
            com.tencent.wcdb.DatabaseUtils.cursorFillWindow(cursor, i17, cursorWindow);
        }
    }

    @Override // com.tencent.wcdb.CrossProcessCursor
    public com.tencent.wcdb.CursorWindow getWindow() {
        com.tencent.wcdb.Cursor cursor = this.mCursor;
        if (cursor instanceof com.tencent.wcdb.CrossProcessCursor) {
            return ((com.tencent.wcdb.CrossProcessCursor) cursor).getWindow();
        }
        return null;
    }

    @Override // com.tencent.wcdb.CrossProcessCursor
    public boolean onMove(int i17, int i18) {
        com.tencent.wcdb.Cursor cursor = this.mCursor;
        if (cursor instanceof com.tencent.wcdb.CrossProcessCursor) {
            return ((com.tencent.wcdb.CrossProcessCursor) cursor).onMove(i17, i18);
        }
        return true;
    }
}
