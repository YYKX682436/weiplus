package com.tencent.wcdb;

/* loaded from: classes12.dex */
public abstract class AbstractWindowedCursor extends com.tencent.wcdb.AbstractCursor {
    protected com.tencent.wcdb.CursorWindow mWindow;

    @Override // com.tencent.wcdb.AbstractCursor
    public void checkPosition() {
        super.checkPosition();
        if (this.mWindow == null) {
            throw new com.tencent.wcdb.StaleDataException("Attempting to access a closed CursorWindow.Most probable cause: cursor is deactivated prior to calling this method.");
        }
    }

    public void clearOrCreateWindow(java.lang.String str) {
        com.tencent.wcdb.CursorWindow cursorWindow = this.mWindow;
        if (cursorWindow == null) {
            this.mWindow = new com.tencent.wcdb.CursorWindow(str);
        } else {
            cursorWindow.clear();
        }
    }

    public void closeWindow() {
        com.tencent.wcdb.CursorWindow cursorWindow = this.mWindow;
        if (cursorWindow != null) {
            cursorWindow.close();
            this.mWindow = null;
        }
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
    public void copyStringToBuffer(int i17, android.database.CharArrayBuffer charArrayBuffer) {
        checkPosition();
        this.mWindow.copyStringToBuffer(this.mPos, i17, charArrayBuffer);
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
    public byte[] getBlob(int i17) {
        checkPosition();
        return this.mWindow.getBlob(this.mPos, i17);
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
    public double getDouble(int i17) {
        checkPosition();
        return this.mWindow.getDouble(this.mPos, i17);
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
    public float getFloat(int i17) {
        checkPosition();
        return this.mWindow.getFloat(this.mPos, i17);
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
    public int getInt(int i17) {
        checkPosition();
        return this.mWindow.getInt(this.mPos, i17);
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
    public long getLong(int i17) {
        checkPosition();
        return this.mWindow.getLong(this.mPos, i17);
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
    public short getShort(int i17) {
        checkPosition();
        return this.mWindow.getShort(this.mPos, i17);
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
    public java.lang.String getString(int i17) {
        checkPosition();
        return this.mWindow.getString(this.mPos, i17);
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
    public int getType(int i17) {
        checkPosition();
        return this.mWindow.getType(this.mPos, i17);
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.CrossProcessCursor
    public com.tencent.wcdb.CursorWindow getWindow() {
        return this.mWindow;
    }

    public boolean hasWindow() {
        return this.mWindow != null;
    }

    @java.lang.Deprecated
    public boolean isBlob(int i17) {
        return getType(i17) == 4;
    }

    @java.lang.Deprecated
    public boolean isFloat(int i17) {
        return getType(i17) == 2;
    }

    @java.lang.Deprecated
    public boolean isLong(int i17) {
        return getType(i17) == 1;
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
    public boolean isNull(int i17) {
        checkPosition();
        return this.mWindow.getType(this.mPos, i17) == 0;
    }

    @java.lang.Deprecated
    public boolean isString(int i17) {
        return getType(i17) == 3;
    }

    @Override // com.tencent.wcdb.AbstractCursor
    public void onDeactivateOrClose() {
        super.onDeactivateOrClose();
        closeWindow();
    }

    public void setWindow(com.tencent.wcdb.CursorWindow cursorWindow) {
        if (cursorWindow != this.mWindow) {
            closeWindow();
            this.mWindow = cursorWindow;
        }
    }
}
