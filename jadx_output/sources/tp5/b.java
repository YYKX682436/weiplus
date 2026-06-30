package tp5;

/* loaded from: classes12.dex */
public final class b implements android.database.Cursor {

    /* renamed from: i, reason: collision with root package name */
    public static final int[] f421157i = {0, 1, 2, 3, 4};

    /* renamed from: d, reason: collision with root package name */
    public final tp5.c f421158d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Iterator f421159e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String[] f421160f = null;

    /* renamed from: g, reason: collision with root package name */
    public int f421161g = -1;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.wcdb.core.PreparedStatement f421162h = null;

    public b(tp5.c cVar) {
        this.f421158d = cVar;
        this.f421159e = cVar.iterator();
    }

    @Override // android.database.Cursor, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f421158d.close();
        this.f421162h = null;
        this.f421161g = -2;
    }

    @Override // android.database.Cursor
    public void copyStringToBuffer(int i17, android.database.CharArrayBuffer charArrayBuffer) {
        java.lang.String string = getString(i17);
        if (string == null) {
            charArrayBuffer.sizeCopied = 0;
            return;
        }
        char[] cArr = charArrayBuffer.data;
        if (cArr == null || cArr.length < string.length()) {
            charArrayBuffer.data = string.toCharArray();
        } else {
            string.getChars(0, string.length(), cArr, 0);
        }
        charArrayBuffer.sizeCopied = string.length();
    }

    @Override // android.database.Cursor
    public void deactivate() {
        throw new java.lang.AssertionError();
    }

    @Override // android.database.Cursor
    public byte[] getBlob(int i17) {
        com.tencent.wcdb.core.PreparedStatement preparedStatement = this.f421162h;
        if (preparedStatement != null) {
            return preparedStatement.getBLOB(i17);
        }
        throw new android.database.CursorIndexOutOfBoundsException("Cursor pointed to an invalid position: " + this.f421161g);
    }

    @Override // android.database.Cursor
    public int getColumnCount() {
        return getColumnNames().length;
    }

    @Override // android.database.Cursor
    public int getColumnIndex(java.lang.String str) {
        if (this.f421160f == null) {
            com.tencent.wcdb.core.PreparedStatement preparedStatement = this.f421158d.f421168f;
            int columnCount = preparedStatement.getColumnCount();
            java.lang.String[] strArr = new java.lang.String[columnCount];
            for (int i17 = 0; i17 < columnCount; i17++) {
                strArr[i17] = preparedStatement.getColumnName(i17);
            }
            this.f421160f = strArr;
        }
        int length = this.f421160f.length;
        for (int i18 = 0; i18 < length; i18++) {
            if (this.f421160f[i18].equalsIgnoreCase(str)) {
                return i18;
            }
        }
        return -1;
    }

    @Override // android.database.Cursor
    public int getColumnIndexOrThrow(java.lang.String str) {
        int columnIndex = getColumnIndex(str);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        throw new java.lang.IllegalArgumentException("column '" + str + "' does not exist");
    }

    @Override // android.database.Cursor
    public java.lang.String getColumnName(int i17) {
        return getColumnNames()[i17];
    }

    @Override // android.database.Cursor
    public java.lang.String[] getColumnNames() {
        if (this.f421160f == null) {
            com.tencent.wcdb.core.PreparedStatement preparedStatement = this.f421158d.f421168f;
            int columnCount = preparedStatement.getColumnCount();
            java.lang.String[] strArr = new java.lang.String[columnCount];
            for (int i17 = 0; i17 < columnCount; i17++) {
                strArr[i17] = preparedStatement.getColumnName(i17);
            }
            this.f421160f = strArr;
        }
        return this.f421160f;
    }

    @Override // android.database.Cursor
    public int getCount() {
        throw new java.lang.AssertionError();
    }

    @Override // android.database.Cursor
    public double getDouble(int i17) {
        com.tencent.wcdb.core.PreparedStatement preparedStatement = this.f421162h;
        if (preparedStatement != null) {
            return preparedStatement.getDouble(i17);
        }
        throw new android.database.CursorIndexOutOfBoundsException("Cursor pointed to an invalid position: " + this.f421161g);
    }

    @Override // android.database.Cursor
    public android.os.Bundle getExtras() {
        return null;
    }

    @Override // android.database.Cursor
    public float getFloat(int i17) {
        com.tencent.wcdb.core.PreparedStatement preparedStatement = this.f421162h;
        if (preparedStatement != null) {
            return preparedStatement.getFloat(i17);
        }
        throw new android.database.CursorIndexOutOfBoundsException("Cursor pointed to an invalid position: " + this.f421161g);
    }

    @Override // android.database.Cursor
    public int getInt(int i17) {
        com.tencent.wcdb.core.PreparedStatement preparedStatement = this.f421162h;
        if (preparedStatement != null) {
            return preparedStatement.getInt(i17);
        }
        throw new android.database.CursorIndexOutOfBoundsException("Cursor pointed to an invalid position: " + this.f421161g);
    }

    @Override // android.database.Cursor
    public long getLong(int i17) {
        com.tencent.wcdb.core.PreparedStatement preparedStatement = this.f421162h;
        if (preparedStatement != null) {
            return preparedStatement.getLong(i17);
        }
        throw new android.database.CursorIndexOutOfBoundsException("Cursor pointed to an invalid position: " + this.f421161g);
    }

    @Override // android.database.Cursor
    public android.net.Uri getNotificationUri() {
        return null;
    }

    @Override // android.database.Cursor
    public int getPosition() {
        return this.f421161g;
    }

    @Override // android.database.Cursor
    public short getShort(int i17) {
        com.tencent.wcdb.core.PreparedStatement preparedStatement = this.f421162h;
        if (preparedStatement != null) {
            return preparedStatement.getShort(i17);
        }
        throw new android.database.CursorIndexOutOfBoundsException("Cursor pointed to an invalid position: " + this.f421161g);
    }

    @Override // android.database.Cursor
    public java.lang.String getString(int i17) {
        com.tencent.wcdb.core.PreparedStatement preparedStatement = this.f421162h;
        if (preparedStatement != null) {
            return preparedStatement.getText(i17);
        }
        throw new android.database.CursorIndexOutOfBoundsException("Cursor pointed to an invalid position: " + this.f421161g);
    }

    @Override // android.database.Cursor
    public int getType(int i17) {
        com.tencent.wcdb.core.PreparedStatement preparedStatement = this.f421162h;
        if (preparedStatement != null) {
            return f421157i[preparedStatement.getColumnType(i17).ordinal()];
        }
        throw new android.database.CursorIndexOutOfBoundsException("Cursor pointed to an invalid position: " + this.f421161g);
    }

    @Override // android.database.Cursor
    public boolean getWantsAllOnMoveCalls() {
        return false;
    }

    @Override // android.database.Cursor
    public boolean isAfterLast() {
        return this.f421161g >= 0 && this.f421162h == null;
    }

    @Override // android.database.Cursor
    public boolean isBeforeFirst() {
        return this.f421161g == -1;
    }

    @Override // android.database.Cursor
    public boolean isClosed() {
        return this.f421161g == -2;
    }

    @Override // android.database.Cursor
    public boolean isFirst() {
        return this.f421161g == 0 && this.f421162h != null;
    }

    @Override // android.database.Cursor
    public boolean isLast() {
        throw new java.lang.AssertionError();
    }

    @Override // android.database.Cursor
    public boolean isNull(int i17) {
        com.tencent.wcdb.core.PreparedStatement preparedStatement = this.f421162h;
        if (preparedStatement != null) {
            return preparedStatement.getColumnType(i17) == com.tencent.wcdb.winq.ColumnType.Null;
        }
        throw new android.database.CursorIndexOutOfBoundsException("Cursor pointed to an invalid position: " + this.f421161g);
    }

    @Override // android.database.Cursor
    public boolean move(int i17) {
        if (i17 < 0) {
            throw new java.lang.AssertionError();
        }
        if (this.f421161g < -1) {
            throw new java.lang.IllegalStateException("Cursor is already closed");
        }
        for (int i18 = 0; i18 < i17; i18++) {
            this.f421161g++;
            tp5.e eVar = (tp5.e) this.f421159e;
            if (!eVar.hasNext()) {
                this.f421162h = null;
                return false;
            }
            this.f421162h = (com.tencent.wcdb.core.PreparedStatement) eVar.next();
        }
        return true;
    }

    @Override // android.database.Cursor
    public boolean moveToFirst() {
        return moveToPosition(0);
    }

    @Override // android.database.Cursor
    public boolean moveToLast() {
        throw new java.lang.AssertionError();
    }

    @Override // android.database.Cursor
    public boolean moveToNext() {
        return move(1);
    }

    @Override // android.database.Cursor
    public boolean moveToPosition(int i17) {
        return move(i17 - this.f421161g);
    }

    @Override // android.database.Cursor
    public boolean moveToPrevious() {
        throw new java.lang.AssertionError();
    }

    @Override // android.database.Cursor
    public void registerContentObserver(android.database.ContentObserver contentObserver) {
        throw new java.lang.AssertionError();
    }

    @Override // android.database.Cursor
    public void registerDataSetObserver(android.database.DataSetObserver dataSetObserver) {
        throw new java.lang.AssertionError();
    }

    @Override // android.database.Cursor
    public boolean requery() {
        throw new java.lang.AssertionError();
    }

    @Override // android.database.Cursor
    public android.os.Bundle respond(android.os.Bundle bundle) {
        throw new java.lang.AssertionError();
    }

    @Override // android.database.Cursor
    public void setExtras(android.os.Bundle bundle) {
        throw new java.lang.AssertionError();
    }

    @Override // android.database.Cursor
    public void setNotificationUri(android.content.ContentResolver contentResolver, android.net.Uri uri) {
        throw new java.lang.AssertionError();
    }

    @Override // android.database.Cursor
    public void unregisterContentObserver(android.database.ContentObserver contentObserver) {
        throw new java.lang.AssertionError();
    }

    @Override // android.database.Cursor
    public void unregisterDataSetObserver(android.database.DataSetObserver dataSetObserver) {
        throw new java.lang.AssertionError();
    }
}
