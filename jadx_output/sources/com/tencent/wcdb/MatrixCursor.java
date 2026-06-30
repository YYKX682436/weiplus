package com.tencent.wcdb;

/* loaded from: classes12.dex */
public class MatrixCursor extends com.tencent.wcdb.AbstractCursor {
    private final int columnCount;
    private final java.lang.String[] columnNames;
    private java.lang.Object[] data;
    private int rowCount;

    /* loaded from: classes12.dex */
    public class RowBuilder {
        private final int endIndex;
        private int index;

        public RowBuilder(int i17, int i18) {
            this.index = i17;
            this.endIndex = i18;
        }

        public com.tencent.wcdb.MatrixCursor.RowBuilder add(java.lang.Object obj) {
            if (this.index == this.endIndex) {
                throw new com.tencent.wcdb.CursorIndexOutOfBoundsException("No more columns left.");
            }
            java.lang.Object[] objArr = com.tencent.wcdb.MatrixCursor.this.data;
            int i17 = this.index;
            this.index = i17 + 1;
            objArr[i17] = obj;
            return this;
        }
    }

    public MatrixCursor(java.lang.String[] strArr, int i17) {
        this.rowCount = 0;
        this.columnNames = strArr;
        int length = strArr.length;
        this.columnCount = length;
        this.data = new java.lang.Object[length * (i17 < 1 ? 1 : i17)];
    }

    private void ensureCapacity(int i17) {
        java.lang.Object[] objArr = this.data;
        if (i17 > objArr.length) {
            int length = objArr.length * 2;
            if (length >= i17) {
                i17 = length;
            }
            java.lang.Object[] objArr2 = new java.lang.Object[i17];
            this.data = objArr2;
            java.lang.System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
        }
    }

    private java.lang.Object get(int i17) {
        int i18;
        if (i17 < 0 || i17 >= (i18 = this.columnCount)) {
            throw new com.tencent.wcdb.CursorIndexOutOfBoundsException("Requested column: " + i17 + ", # of columns: " + this.columnCount);
        }
        int i19 = this.mPos;
        if (i19 < 0) {
            throw new com.tencent.wcdb.CursorIndexOutOfBoundsException("Before first row.");
        }
        if (i19 < this.rowCount) {
            return this.data[(i19 * i18) + i17];
        }
        throw new com.tencent.wcdb.CursorIndexOutOfBoundsException("After last row.");
    }

    public void addRow(java.lang.Object[] objArr) {
        int length = objArr.length;
        int i17 = this.columnCount;
        if (length == i17) {
            int i18 = this.rowCount;
            this.rowCount = i18 + 1;
            int i19 = i18 * i17;
            ensureCapacity(i17 + i19);
            java.lang.System.arraycopy(objArr, 0, this.data, i19, this.columnCount);
            return;
        }
        throw new java.lang.IllegalArgumentException("columnNames.length = " + this.columnCount + ", columnValues.length = " + objArr.length);
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
    public void copyStringToBuffer(int i17, android.database.CharArrayBuffer charArrayBuffer) {
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
    public byte[] getBlob(int i17) {
        return (byte[]) get(i17);
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
    public java.lang.String[] getColumnNames() {
        return this.columnNames;
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
    public int getCount() {
        return this.rowCount;
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
    public double getDouble(int i17) {
        java.lang.Object obj = get(i17);
        if (obj == null) {
            return 0.0d;
        }
        return obj instanceof java.lang.Number ? ((java.lang.Number) obj).doubleValue() : java.lang.Double.parseDouble(obj.toString());
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
    public float getFloat(int i17) {
        java.lang.Object obj = get(i17);
        if (obj == null) {
            return 0.0f;
        }
        return obj instanceof java.lang.Number ? ((java.lang.Number) obj).floatValue() : java.lang.Float.parseFloat(obj.toString());
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
    public int getInt(int i17) {
        java.lang.Object obj = get(i17);
        if (obj == null) {
            return 0;
        }
        return obj instanceof java.lang.Number ? ((java.lang.Number) obj).intValue() : java.lang.Integer.parseInt(obj.toString());
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
    public long getLong(int i17) {
        java.lang.Object obj = get(i17);
        if (obj == null) {
            return 0L;
        }
        return obj instanceof java.lang.Number ? ((java.lang.Number) obj).longValue() : java.lang.Long.parseLong(obj.toString());
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
    public short getShort(int i17) {
        java.lang.Object obj = get(i17);
        if (obj == null) {
            return (short) 0;
        }
        return obj instanceof java.lang.Number ? ((java.lang.Number) obj).shortValue() : java.lang.Short.parseShort(obj.toString());
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
    public java.lang.String getString(int i17) {
        java.lang.Object obj = get(i17);
        if (obj == null) {
            return null;
        }
        return obj.toString();
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
    public int getType(int i17) {
        return com.tencent.wcdb.DatabaseUtils.getTypeOfObject(get(i17));
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
    public boolean isNull(int i17) {
        return get(i17) == null;
    }

    public com.tencent.wcdb.MatrixCursor.RowBuilder newRow() {
        int i17 = this.rowCount + 1;
        this.rowCount = i17;
        int i18 = i17 * this.columnCount;
        ensureCapacity(i18);
        return new com.tencent.wcdb.MatrixCursor.RowBuilder(i18 - this.columnCount, i18);
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
    public void registerContentObserver(android.database.ContentObserver contentObserver) {
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
    public void registerDataSetObserver(android.database.DataSetObserver dataSetObserver) {
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
    public void unregisterContentObserver(android.database.ContentObserver contentObserver) {
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
    public void unregisterDataSetObserver(android.database.DataSetObserver dataSetObserver) {
    }

    public MatrixCursor(java.lang.String[] strArr) {
        this(strArr, 16);
    }

    public void addRow(java.lang.Iterable<?> iterable) {
        int i17 = this.rowCount;
        int i18 = this.columnCount;
        int i19 = i17 * i18;
        int i27 = i18 + i19;
        ensureCapacity(i27);
        if (iterable instanceof java.util.ArrayList) {
            addRow((java.util.ArrayList) iterable, i19);
            return;
        }
        java.lang.Object[] objArr = this.data;
        for (java.lang.Object obj : iterable) {
            if (i19 != i27) {
                objArr[i19] = obj;
                i19++;
            } else {
                throw new java.lang.IllegalArgumentException("columnValues.size() > columnNames.length");
            }
        }
        if (i19 == i27) {
            this.rowCount++;
            return;
        }
        throw new java.lang.IllegalArgumentException("columnValues.size() < columnNames.length");
    }

    private void addRow(java.util.ArrayList<?> arrayList, int i17) {
        int size = arrayList.size();
        if (size == this.columnCount) {
            this.rowCount++;
            java.lang.Object[] objArr = this.data;
            for (int i18 = 0; i18 < size; i18++) {
                objArr[i17 + i18] = arrayList.get(i18);
            }
            return;
        }
        throw new java.lang.IllegalArgumentException("columnNames.length = " + this.columnCount + ", columnValues.size() = " + size);
    }
}
