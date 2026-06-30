package e95;

/* loaded from: classes12.dex */
public class m extends com.tencent.wcdb.AbstractCursor implements e95.h {

    /* renamed from: r, reason: collision with root package name */
    public static final com.tencent.wcdb.database.SQLiteDatabase.CursorFactory f250425r = new e95.l();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String[] f250426d;

    /* renamed from: e, reason: collision with root package name */
    public final e95.p f250427e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.wcdb.database.SQLiteCursorDriver f250428f;

    /* renamed from: h, reason: collision with root package name */
    public java.util.Map f250430h;

    /* renamed from: m, reason: collision with root package name */
    public e95.g f250432m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f250433n;

    /* renamed from: o, reason: collision with root package name */
    public e95.b f250434o;

    /* renamed from: p, reason: collision with root package name */
    public e95.f f250435p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f250436q;

    /* renamed from: g, reason: collision with root package name */
    public int f250429g = -1;

    /* renamed from: i, reason: collision with root package name */
    public int f250431i = 3000;

    public m(com.tencent.wcdb.database.SQLiteCursorDriver sQLiteCursorDriver, java.lang.String str, e95.p pVar) {
        if (pVar == null) {
            throw new java.lang.IllegalArgumentException("query object cannot be null");
        }
        this.f250428f = sQLiteCursorDriver;
        this.f250430h = null;
        this.f250427e = pVar;
        java.lang.String[] columnNames = pVar.getColumnNames();
        this.f250426d = columnNames;
        this.mRowIdColumnIndex = com.tencent.wcdb.DatabaseUtils.findRowIdColumnIndex(columnNames);
    }

    @Override // e95.h
    public boolean I0(int i17) {
        if (!this.f250433n) {
            return false;
        }
        this.f250434o.getClass();
        return i17 <= 50;
    }

    @Override // e95.h
    public void Y(e95.g gVar) {
        this.f250432m = gVar;
    }

    public final int a(int i17) {
        boolean z17 = this.f250433n;
        e95.p pVar = this.f250427e;
        if (!z17) {
            if (this.f250435p == null) {
                this.f250435p = new e95.f(this.f250426d);
            }
            return pVar.b(this.f250435p, i17, this.f250431i);
        }
        if (this.f250434o == null) {
            this.f250434o = new e95.k(this, true);
        }
        this.f250434o.getClass();
        return pVar.a(this.f250434o, i17, this.f250431i);
    }

    @Override // com.tencent.wcdb.AbstractCursor
    public void checkPosition() {
        super.checkPosition();
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        super.close();
        synchronized (this) {
            this.f250427e.close();
            this.f250428f.cursorClosed();
        }
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
    public void copyStringToBuffer(int i17, android.database.CharArrayBuffer charArrayBuffer) {
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
    public void deactivate() {
        super.deactivate();
        this.f250428f.cursorDeactivated();
    }

    @Override // com.tencent.wcdb.AbstractCursor
    public void finalize() {
        try {
            if (this.f250434o != null) {
                close();
            }
        } finally {
            super.finalize();
        }
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
    public byte[] getBlob(int i17) {
        if (this.f250433n) {
            return null;
        }
        return this.f250435p.getBlob(i17);
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
    public int getColumnIndex(java.lang.String str) {
        if (this.f250430h == null) {
            java.lang.String[] strArr = this.f250426d;
            int length = strArr.length;
            java.util.HashMap hashMap = new java.util.HashMap(length, 1.0f);
            for (int i17 = 0; i17 < length; i17++) {
                hashMap.put(strArr[i17], java.lang.Integer.valueOf(i17));
            }
            this.f250430h = hashMap;
        }
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf != -1) {
            com.tencent.wcdb.support.Log.e("WCDB.SQLiteNewCursor", "requesting column name with table name -- ".concat(str), new java.lang.Exception());
            str = str.substring(lastIndexOf + 1);
        }
        java.lang.Integer num = (java.lang.Integer) this.f250430h.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
    public java.lang.String[] getColumnNames() {
        return this.f250426d;
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
    public int getCount() {
        if (this.f250429g == -1) {
            int a17 = a(0);
            this.f250429g = a17;
            e95.b bVar = this.f250434o;
            if (bVar != null) {
                this.f250436q = a17 != -1 && a17 == bVar.f();
            }
        }
        if (!this.f250433n || !this.f250436q) {
            return this.f250429g;
        }
        e95.b bVar2 = this.f250434o;
        if (bVar2 == null) {
            return 0;
        }
        return bVar2.f();
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
    public double getDouble(int i17) {
        if (this.f250433n) {
            return 0.0d;
        }
        return this.f250435p.getDouble(i17);
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
    public float getFloat(int i17) {
        if (this.f250433n) {
            return 0.0f;
        }
        return this.f250435p.getFloat(i17);
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
    public int getInt(int i17) {
        if (this.f250433n) {
            return 0;
        }
        return this.f250435p.getInt(i17);
    }

    @Override // e95.h
    public e95.a getItem(int i17) {
        e95.b bVar = this.f250434o;
        if (bVar != null) {
            return bVar.getItem(i17);
        }
        return null;
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
    public long getLong(int i17) {
        if (this.f250433n) {
            return 0L;
        }
        return this.f250435p.getLong(i17);
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
    public short getShort(int i17) {
        if (this.f250433n) {
            return (short) 0;
        }
        return this.f250435p.getShort(i17);
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
    public java.lang.String getString(int i17) {
        if (this.f250433n) {
            return null;
        }
        return this.f250435p.getString(i17);
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
    public boolean isNull(int i17) {
        if (this.f250433n) {
            return false;
        }
        return this.f250435p.isNull(i17);
    }

    @Override // e95.h
    public boolean n0(java.lang.Object obj) {
        e95.b bVar;
        if (this.f250433n && (bVar = this.f250434o) != null) {
            return bVar.n0(obj);
        }
        return false;
    }

    @Override // e95.h
    public android.util.SparseArray[] n1() {
        if (this.f250433n) {
            return new android.util.SparseArray[]{this.f250434o.f250395d};
        }
        return null;
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.CrossProcessCursor
    public boolean onMove(int i17, int i18) {
        if (this.f250433n) {
            e95.b bVar = this.f250434o;
            if (bVar != null && bVar.b(i18)) {
                return true;
            }
            int i19 = this.f250431i;
            a((i18 / i19) * i19);
            return true;
        }
        e95.f fVar = this.f250435p;
        if (fVar == null && fVar == null) {
            this.f250435p = new e95.f(this.f250426d);
        }
        if (!this.f250435p.b(i18)) {
            int i27 = this.f250431i;
            a((i18 / i27) * i27);
        }
        this.f250435p.moveToPosition(i18);
        return true;
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
    public void registerContentObserver(android.database.ContentObserver contentObserver) {
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
    public void registerDataSetObserver(android.database.DataSetObserver dataSetObserver) {
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
    public boolean requery() {
        if (isClosed()) {
            return false;
        }
        synchronized (this) {
            if (!this.f250427e.getDatabase().isOpen()) {
                return false;
            }
            e95.b bVar = this.f250434o;
            if (bVar != null) {
                bVar.a();
            }
            this.mPos = -1;
            this.f250429g = -1;
            this.f250428f.cursorRequeried(this);
            try {
                return super.requery();
            } catch (java.lang.IllegalStateException e17) {
                com.tencent.wcdb.support.Log.w("WCDB.SQLiteNewCursor", "requery() failed " + e17.getMessage(), e17);
                return false;
            }
        }
    }

    @Override // e95.h
    public boolean t(java.lang.Object obj, e95.a aVar) {
        e95.b bVar;
        boolean z17 = this.f250433n;
        if (!z17 || (bVar = this.f250434o) == null) {
            if (!z17) {
                this.f250435p.a();
            }
            return false;
        }
        if (!this.f250436q && (obj instanceof java.lang.Object[]) && bVar.n0(obj)) {
            java.lang.Object[] objArr = (java.lang.Object[]) obj;
            this.f250429g -= objArr.length;
            this.f250431i -= objArr.length;
        }
        this.f250434o.t(obj, aVar);
        return false;
    }

    @Override // e95.h
    public void u(boolean z17) {
        this.f250433n = z17;
    }

    @Override // e95.h
    public void u1(int i17) {
        if (i17 > 15000 || i17 < 2000) {
            return;
        }
        this.f250431i = i17;
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
    public void unregisterContentObserver(android.database.ContentObserver contentObserver) {
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
    public void unregisterDataSetObserver(android.database.DataSetObserver dataSetObserver) {
    }

    @Override // e95.h
    public boolean y() {
        return this.f250436q;
    }
}
