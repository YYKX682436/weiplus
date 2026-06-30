package com.tencent.wcdb.compat;

/* loaded from: classes12.dex */
class ValueCursor extends android.database.AbstractCursor {
    private final java.lang.String[] mColumnNames;
    private final java.util.List<com.tencent.wcdb.base.Value[]> mRows;

    public ValueCursor(java.util.List<com.tencent.wcdb.base.Value[]> list, java.lang.String[] strArr) {
        this.mRows = list;
        this.mColumnNames = strArr;
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public byte[] getBlob(int i17) {
        return this.mRows.get(((android.database.AbstractCursor) this).mPos)[i17].getBLOB();
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public java.lang.String[] getColumnNames() {
        return this.mColumnNames;
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public int getCount() {
        return this.mRows.size();
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public double getDouble(int i17) {
        return this.mRows.get(((android.database.AbstractCursor) this).mPos)[i17].getDouble();
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public float getFloat(int i17) {
        return (float) this.mRows.get(((android.database.AbstractCursor) this).mPos)[i17].getDouble();
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public int getInt(int i17) {
        return this.mRows.get(((android.database.AbstractCursor) this).mPos)[i17].getInt();
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public long getLong(int i17) {
        return this.mRows.get(((android.database.AbstractCursor) this).mPos)[i17].getLong();
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public short getShort(int i17) {
        return (short) this.mRows.get(((android.database.AbstractCursor) this).mPos)[i17].getLong();
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public java.lang.String getString(int i17) {
        return this.mRows.get(((android.database.AbstractCursor) this).mPos)[i17].getText();
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public int getType(int i17) {
        return this.mRows.get(((android.database.AbstractCursor) this).mPos)[i17].getType().ordinal();
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public boolean isNull(int i17) {
        return this.mRows.get(((android.database.AbstractCursor) this).mPos)[i17].getType() == com.tencent.wcdb.winq.ColumnType.Null;
    }
}
