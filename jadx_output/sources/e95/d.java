package e95;

/* loaded from: classes12.dex */
public final class d extends com.tencent.wcdb.AbstractCursor implements e95.h {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.wcdb.database.SQLiteCursorDriver f250400d;

    /* renamed from: e, reason: collision with root package name */
    public final e95.p f250401e;

    /* renamed from: g, reason: collision with root package name */
    public boolean f250403g;

    /* renamed from: h, reason: collision with root package name */
    public e95.b f250404h;

    /* renamed from: i, reason: collision with root package name */
    public e95.f f250405i;

    /* renamed from: n, reason: collision with root package name */
    public java.util.Map f250407n;

    /* renamed from: p, reason: collision with root package name */
    public e95.g f250409p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f250410q;

    /* renamed from: f, reason: collision with root package name */
    public final int f250402f = -1;

    /* renamed from: m, reason: collision with root package name */
    public int f250406m = -1;

    /* renamed from: o, reason: collision with root package name */
    public int f250408o = 1;

    public d(com.tencent.wcdb.database.SQLiteCursorDriver sQLiteCursorDriver, java.lang.String str, e95.p pVar) {
        this.f250400d = sQLiteCursorDriver;
        this.f250401e = pVar;
        this.mRowIdColumnIndex = com.tencent.wcdb.DatabaseUtils.findRowIdColumnIndex(getColumnNames());
    }

    @Override // e95.h
    public boolean I0(int i17) {
        return this.f250403g && this.f250404h != null && i17 <= 50;
    }

    @Override // e95.h
    public void Y(e95.g gVar) {
        this.f250409p = gVar;
    }

    public final int a(int i17) {
        boolean z17 = this.f250403g;
        e95.p pVar = this.f250401e;
        if (!z17) {
            if (this.f250405i == null) {
                this.f250405i = new e95.f(getColumnNames());
            }
            if (pVar != null) {
                return pVar.b(this.f250405i, i17, this.f250408o);
            }
            return 0;
        }
        if (this.f250404h == null) {
            this.f250404h = new e95.c(this);
        }
        e95.b bVar = this.f250404h;
        if (pVar != null) {
            return pVar.a(bVar, i17, this.f250408o);
        }
        return 0;
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        super.close();
        synchronized (this) {
            e95.p pVar = this.f250401e;
            if (pVar != null) {
                pVar.close();
            }
            com.tencent.wcdb.database.SQLiteCursorDriver sQLiteCursorDriver = this.f250400d;
            if (sQLiteCursorDriver != null) {
                sQLiteCursorDriver.cursorClosed();
            }
        }
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
    public void deactivate() {
        super.deactivate();
        com.tencent.wcdb.database.SQLiteCursorDriver sQLiteCursorDriver = this.f250400d;
        if (sQLiteCursorDriver != null) {
            sQLiteCursorDriver.cursorDeactivated();
        }
    }

    @Override // com.tencent.wcdb.AbstractCursor
    public void finalize() {
        try {
            if (this.f250404h != null) {
                close();
            }
        } finally {
            super.finalize();
        }
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
    public byte[] getBlob(int i17) {
        e95.f fVar;
        if (this.f250403g || (fVar = this.f250405i) == null) {
            return null;
        }
        return fVar.getBlob(i17);
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
    public int getColumnIndex(java.lang.String _columnName) {
        java.lang.Integer num;
        kotlin.jvm.internal.o.g(_columnName, "_columnName");
        if (this.f250407n == null) {
            java.lang.String[] columnNames = getColumnNames();
            int length = columnNames.length;
            java.util.HashMap hashMap = new java.util.HashMap(length, 1.0f);
            for (int i17 = 0; i17 < length; i17++) {
                hashMap.put(columnNames[i17], java.lang.Integer.valueOf(i17));
            }
            this.f250407n = hashMap;
        }
        int O = r26.n0.O(_columnName, '.', 0, false, 6, null);
        if (O != -1) {
            com.tencent.wcdb.support.Log.e("WCDB.CustomNewCursor", "requesting column name with table name -- ".concat(_columnName), new java.lang.Exception());
            _columnName = _columnName.substring(O + 1);
            kotlin.jvm.internal.o.f(_columnName, "substring(...)");
        }
        java.util.Map map = this.f250407n;
        if (map == null || (num = (java.lang.Integer) map.get(_columnName)) == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
    public java.lang.String[] getColumnNames() {
        e95.p pVar = this.f250401e;
        java.lang.String[] columnNames = pVar != null ? pVar.getColumnNames() : null;
        return columnNames == null ? new java.lang.String[0] : columnNames;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001f, code lost:
    
        if ((r3 != null && r0 == r3.f()) != false) goto L16;
     */
    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int getCount() {
        /*
            r4 = this;
            int r0 = r4.f250406m
            r1 = 0
            int r2 = r4.f250402f
            if (r0 != r2) goto L25
            int r0 = r4.a(r1)
            r4.f250406m = r0
            e95.b r3 = r4.f250404h
            if (r3 == 0) goto L25
            if (r0 == r2) goto L22
            r2 = 1
            if (r3 == 0) goto L1e
            int r3 = r3.f()
            if (r0 != r3) goto L1e
            r0 = r2
            goto L1f
        L1e:
            r0 = r1
        L1f:
            if (r0 == 0) goto L22
            goto L23
        L22:
            r2 = r1
        L23:
            r4.f250410q = r2
        L25:
            boolean r0 = r4.f250403g
            if (r0 == 0) goto L39
            boolean r0 = r4.f250410q
            if (r0 == 0) goto L39
            e95.b r0 = r4.f250404h
            if (r0 != 0) goto L32
            goto L38
        L32:
            if (r0 == 0) goto L38
            int r1 = r0.f()
        L38:
            return r1
        L39:
            int r0 = r4.f250406m
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e95.d.getCount():int");
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
    public double getDouble(int i17) {
        e95.f fVar;
        if (this.f250403g || (fVar = this.f250405i) == null) {
            return 0.0d;
        }
        return fVar.getDouble(i17);
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
    public float getFloat(int i17) {
        e95.f fVar;
        if (this.f250403g || (fVar = this.f250405i) == null) {
            return 0.0f;
        }
        return fVar.getFloat(i17);
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
    public int getInt(int i17) {
        e95.f fVar;
        if (this.f250403g || (fVar = this.f250405i) == null) {
            return 0;
        }
        return fVar.getInt(i17);
    }

    @Override // e95.h
    public e95.a getItem(int i17) {
        e95.b bVar = this.f250404h;
        if (bVar == null || bVar == null) {
            return null;
        }
        return bVar.getItem(i17);
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
    public long getLong(int i17) {
        e95.f fVar;
        if (this.f250403g || (fVar = this.f250405i) == null) {
            return 0L;
        }
        return fVar.getLong(i17);
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
    public short getShort(int i17) {
        e95.f fVar;
        if (this.f250403g || (fVar = this.f250405i) == null) {
            return (short) 0;
        }
        return fVar.getShort(i17);
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
    public java.lang.String getString(int i17) {
        e95.f fVar;
        if (this.f250403g || (fVar = this.f250405i) == null) {
            return null;
        }
        return fVar.getString(i17);
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
    public boolean isNull(int i17) {
        e95.f fVar;
        if (this.f250403g || (fVar = this.f250405i) == null) {
            return false;
        }
        return fVar.isNull(i17);
    }

    @Override // e95.h
    public boolean n0(java.lang.Object obj) {
        e95.b bVar;
        if (!this.f250403g || (bVar = this.f250404h) == null || bVar == null) {
            return false;
        }
        return bVar.n0(obj);
    }

    @Override // e95.h
    public android.util.SparseArray[] n1() {
        if (!this.f250403g) {
            return null;
        }
        android.util.SparseArray[] sparseArrayArr = new android.util.SparseArray[1];
        e95.b bVar = this.f250404h;
        sparseArrayArr[0] = bVar != null ? bVar.f250395d : null;
        return sparseArrayArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0011, code lost:
    
        if ((r4.b(r5) ? false : true) != false) goto L10;
     */
    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.CrossProcessCursor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onMove(int r4, int r5) {
        /*
            r3 = this;
            boolean r4 = r3.f250403g
            r0 = 1
            r1 = 0
            if (r4 == 0) goto L1b
            e95.b r4 = r3.f250404h
            if (r4 == 0) goto L13
            boolean r4 = r4.b(r5)
            if (r4 != 0) goto L11
            r1 = r0
        L11:
            if (r1 == 0) goto L48
        L13:
            int r4 = r3.f250408o
            int r5 = r5 / r4
            int r5 = r5 * r4
            r3.a(r5)
            goto L48
        L1b:
            e95.f r4 = r3.f250405i
            if (r4 != 0) goto L2c
            if (r4 != 0) goto L2c
            e95.f r4 = new e95.f
            java.lang.String[] r2 = r3.getColumnNames()
            r4.<init>(r2)
            r3.f250405i = r4
        L2c:
            e95.f r4 = r3.f250405i
            if (r4 == 0) goto L37
            boolean r4 = r4.b(r5)
            if (r4 != 0) goto L37
            r1 = r0
        L37:
            if (r1 == 0) goto L41
            int r4 = r3.f250408o
            int r1 = r5 / r4
            int r1 = r1 * r4
            r3.a(r1)
        L41:
            e95.f r4 = r3.f250405i
            if (r4 == 0) goto L48
            r4.moveToPosition(r5)
        L48:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e95.d.onMove(int, int):boolean");
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
    public boolean requery() {
        com.tencent.wcdb.database.SQLiteDatabase database;
        if (isClosed()) {
            return false;
        }
        synchronized (this) {
            e95.p pVar = this.f250401e;
            if ((pVar == null || (database = pVar.getDatabase()) == null || database.isOpen()) ? false : true) {
                return false;
            }
            e95.b bVar = this.f250404h;
            if (bVar != null && bVar != null) {
                bVar.a();
            }
            this.mPos = -1;
            this.f250406m = -1;
            com.tencent.wcdb.database.SQLiteCursorDriver sQLiteCursorDriver = this.f250400d;
            if (sQLiteCursorDriver != null) {
                sQLiteCursorDriver.cursorRequeried(this);
            }
            try {
                return super.requery();
            } catch (java.lang.IllegalStateException e17) {
                com.tencent.wcdb.support.Log.w("WCDB.CustomNewCursor", "requery() failed " + e17.getMessage(), e17);
                return false;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x001f, code lost:
    
        if (r2.n0(r5) == true) goto L17;
     */
    @Override // e95.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean t(java.lang.Object r5, e95.a r6) {
        /*
            r4 = this;
            boolean r0 = r4.f250403g
            r1 = 0
            if (r0 == 0) goto L39
            e95.b r2 = r4.f250404h
            if (r2 == 0) goto L39
            boolean r0 = r4.f250410q
            if (r0 != 0) goto L31
            boolean r0 = r5 instanceof java.lang.Object[]
            if (r0 == 0) goto L31
            r0 = r5
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            boolean r3 = r0 instanceof java.lang.Object[]
            if (r3 == 0) goto L31
            if (r2 == 0) goto L22
            boolean r2 = r2.n0(r5)
            r3 = 1
            if (r2 != r3) goto L22
            goto L23
        L22:
            r3 = r1
        L23:
            if (r3 == 0) goto L31
            int r2 = r4.f250406m
            int r3 = r0.length
            int r2 = r2 - r3
            r4.f250406m = r2
            int r2 = r4.f250408o
            int r0 = r0.length
            int r2 = r2 - r0
            r4.f250408o = r2
        L31:
            e95.b r0 = r4.f250404h
            if (r0 == 0) goto L38
            r0.t(r5, r6)
        L38:
            return r1
        L39:
            if (r0 != 0) goto L42
            e95.f r5 = r4.f250405i
            if (r5 == 0) goto L42
            r5.a()
        L42:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: e95.d.t(java.lang.Object, e95.a):boolean");
    }

    @Override // e95.h
    public void u(boolean z17) {
        this.f250403g = z17;
    }

    @Override // e95.h
    public void u1(int i17) {
        this.f250408o = i17;
    }

    @Override // e95.h
    public boolean y() {
        return this.f250410q;
    }
}
