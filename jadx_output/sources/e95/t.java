package e95;

/* loaded from: classes12.dex */
public final class t extends e95.r implements e95.h {
    public e95.g A;
    public boolean B;

    /* renamed from: r, reason: collision with root package name */
    public final com.tencent.wcdb.core.Database f250453r;

    /* renamed from: s, reason: collision with root package name */
    public final int f250454s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f250455t;

    /* renamed from: u, reason: collision with root package name */
    public e95.b f250456u;

    /* renamed from: v, reason: collision with root package name */
    public final e95.u f250457v;

    /* renamed from: w, reason: collision with root package name */
    public e95.f f250458w;

    /* renamed from: x, reason: collision with root package name */
    public int f250459x;

    /* renamed from: y, reason: collision with root package name */
    public java.util.Map f250460y;

    /* renamed from: z, reason: collision with root package name */
    public int f250461z;

    /* JADX WARN: Multi-variable type inference failed */
    public t(com.tencent.wcdb.core.Database db6, java.lang.String sql, java.lang.Object[] objArr, java.lang.String str, android.os.CancellationSignal cancellationSignal) {
        kotlin.jvm.internal.o.g(db6, "db");
        kotlin.jvm.internal.o.g(sql, "sql");
        this.f250453r = db6;
        this.f250454s = -1;
        this.f250459x = -1;
        this.f250461z = 3000;
        this.f250442e = com.tencent.wcdb.DatabaseUtils.findRowIdColumnIndex(getColumnNames());
        com.tencent.wcdb.core.Handle handle = db6.getHandle(false);
        try {
            tp5.a.a(handle, cancellationSignal);
            com.tencent.wcdb.core.PreparedStatement preparedWithMainStatement = sql instanceof com.tencent.wcdb.winq.Statement ? handle.preparedWithMainStatement((com.tencent.wcdb.winq.Statement) sql) : handle.preparedWithMainStatement(sql.toString());
            if (objArr != null) {
                int i17 = 0;
                while (i17 < objArr.length) {
                    com.tencent.wcdb.base.Value value = new com.tencent.wcdb.base.Value(objArr[i17]);
                    i17++;
                    preparedWithMainStatement.bindValue(value, i17);
                }
            }
            int columnCount = preparedWithMainStatement.getColumnCount();
            java.lang.String[] strArr = new java.lang.String[columnCount];
            for (int i18 = 0; i18 < columnCount; i18++) {
                strArr[i18] = preparedWithMainStatement.getColumnName(i18);
            }
            java.util.List<com.tencent.wcdb.base.Value[]> multiRows = preparedWithMainStatement.getMultiRows();
            preparedWithMainStatement.finalizeStatement();
            android.util.Pair create = android.util.Pair.create(multiRows, strArr);
            if (handle != null) {
                handle.close();
            }
            java.util.List list = (java.util.List) create.first;
            java.lang.Object second = create.second;
            kotlin.jvm.internal.o.f(second, "second");
            this.f250457v = new e95.u(list, (java.lang.String[]) second, sql);
        } catch (java.lang.Throwable th6) {
            if (handle != null) {
                try {
                    handle.close();
                } catch (java.lang.Throwable th7) {
                    th6.addSuppressed(th7);
                }
            }
            throw th6;
        }
    }

    @Override // e95.h
    public boolean I0(int i17) {
        return this.f250455t && this.f250456u != null && i17 <= 50;
    }

    @Override // e95.h
    public void Y(e95.g gVar) {
        this.A = gVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:167:0x01d8, code lost:
    
        if (r13 != false) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x01da, code lost:
    
        if (r5 == null) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:?, code lost:
    
        return r5.size();
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x01e1, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:?, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x01d7, code lost:
    
        r13 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x00de, code lost:
    
        if (r13 != false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x00e0, code lost:
    
        if (r6 == null) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x00e2, code lost:
    
        r6 = r6.size();
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x00ea, code lost:
    
        if (r14 == null) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x00ec, code lost:
    
        r14.releaseReference();
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:?, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:?, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x00e7, code lost:
    
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x00e9, code lost:
    
        r6 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x00dd, code lost:
    
        r13 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(int r20) {
        /*
            Method dump skipped, instructions count: 527
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e95.t.a(int):int");
    }

    @Override // android.database.Cursor
    public byte[] getBlob(int i17) {
        e95.f fVar;
        if (this.f250455t || (fVar = this.f250458w) == null) {
            return null;
        }
        return fVar.getBlob(i17);
    }

    @Override // android.database.Cursor
    public int getColumnIndex(java.lang.String _columnName) {
        java.lang.Integer num;
        kotlin.jvm.internal.o.g(_columnName, "_columnName");
        if (this.f250460y == null) {
            java.lang.String[] columnNames = getColumnNames();
            int length = columnNames.length;
            java.util.HashMap hashMap = new java.util.HashMap(length, 1.0f);
            for (int i17 = 0; i17 < length; i17++) {
                hashMap.put(columnNames[i17], java.lang.Integer.valueOf(i17));
            }
            this.f250460y = hashMap;
        }
        int O = r26.n0.O(_columnName, '.', 0, false, 6, null);
        if (O != -1) {
            com.tencent.mars.xlog.Log.e("WCDB.WCDBNewCursor", "requesting column name with table name -- ".concat(_columnName), new java.lang.Exception());
            _columnName = _columnName.substring(O + 1);
            kotlin.jvm.internal.o.f(_columnName, "substring(...)");
        }
        java.util.Map map = this.f250460y;
        if (map == null || (num = (java.lang.Integer) map.get(_columnName)) == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // android.database.Cursor
    public java.lang.String[] getColumnNames() {
        java.lang.String[] strArr;
        e95.u uVar = this.f250457v;
        return (uVar == null || (strArr = uVar.f250463b) == null) ? new java.lang.String[0] : strArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001f, code lost:
    
        if ((r3 != null && r0 == r3.f()) != false) goto L16;
     */
    @Override // android.database.Cursor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int getCount() {
        /*
            r4 = this;
            int r0 = r4.f250459x
            r1 = 0
            int r2 = r4.f250454s
            if (r0 != r2) goto L25
            int r0 = r4.a(r1)
            r4.f250459x = r0
            e95.b r3 = r4.f250456u
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
            r4.B = r2
        L25:
            boolean r0 = r4.f250455t
            if (r0 == 0) goto L39
            boolean r0 = r4.B
            if (r0 == 0) goto L39
            e95.b r0 = r4.f250456u
            if (r0 != 0) goto L32
            goto L38
        L32:
            if (r0 == 0) goto L38
            int r1 = r0.f()
        L38:
            return r1
        L39:
            int r0 = r4.f250459x
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e95.t.getCount():int");
    }

    @Override // android.database.Cursor
    public double getDouble(int i17) {
        e95.f fVar;
        if (this.f250455t || (fVar = this.f250458w) == null) {
            return 0.0d;
        }
        return fVar.getDouble(i17);
    }

    @Override // android.database.Cursor
    public float getFloat(int i17) {
        e95.f fVar;
        if (this.f250455t || (fVar = this.f250458w) == null) {
            return 0.0f;
        }
        return fVar.getFloat(i17);
    }

    @Override // android.database.Cursor
    public int getInt(int i17) {
        e95.f fVar;
        if (this.f250455t || (fVar = this.f250458w) == null) {
            return 0;
        }
        return fVar.getInt(i17);
    }

    @Override // e95.h
    public e95.a getItem(int i17) {
        e95.b bVar = this.f250456u;
        if (bVar == null || bVar == null) {
            return null;
        }
        return bVar.getItem(i17);
    }

    @Override // android.database.Cursor
    public long getLong(int i17) {
        e95.f fVar;
        if (this.f250455t || (fVar = this.f250458w) == null) {
            return 0L;
        }
        return fVar.getLong(i17);
    }

    @Override // android.database.Cursor
    public short getShort(int i17) {
        e95.f fVar;
        if (this.f250455t || (fVar = this.f250458w) == null) {
            return (short) 0;
        }
        return fVar.getShort(i17);
    }

    @Override // android.database.Cursor
    public java.lang.String getString(int i17) {
        e95.f fVar;
        if (this.f250455t || (fVar = this.f250458w) == null) {
            return null;
        }
        return fVar.getString(i17);
    }

    @Override // android.database.Cursor
    public boolean isNull(int i17) {
        e95.f fVar;
        if (this.f250455t || (fVar = this.f250458w) == null) {
            return false;
        }
        return fVar.isNull(i17);
    }

    @Override // e95.h
    public boolean n0(java.lang.Object obj) {
        e95.b bVar;
        if (!this.f250455t || (bVar = this.f250456u) == null || bVar == null) {
            return false;
        }
        return bVar.n0(obj);
    }

    @Override // e95.h
    public android.util.SparseArray[] n1() {
        if (!this.f250455t) {
            return null;
        }
        android.util.SparseArray[] sparseArrayArr = new android.util.SparseArray[1];
        e95.b bVar = this.f250456u;
        sparseArrayArr[0] = bVar != null ? bVar.f250395d : null;
        return sparseArrayArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0011, code lost:
    
        if ((r4.b(r5) ? false : true) != false) goto L10;
     */
    @Override // android.database.CrossProcessCursor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onMove(int r4, int r5) {
        /*
            r3 = this;
            boolean r4 = r3.f250455t
            r0 = 1
            r1 = 0
            if (r4 == 0) goto L1b
            e95.b r4 = r3.f250456u
            if (r4 == 0) goto L13
            boolean r4 = r4.b(r5)
            if (r4 != 0) goto L11
            r1 = r0
        L11:
            if (r1 == 0) goto L48
        L13:
            int r4 = r3.f250461z
            int r5 = r5 / r4
            int r5 = r5 * r4
            r3.a(r5)
            goto L48
        L1b:
            e95.f r4 = r3.f250458w
            if (r4 != 0) goto L2c
            if (r4 != 0) goto L2c
            e95.f r4 = new e95.f
            java.lang.String[] r2 = r3.getColumnNames()
            r4.<init>(r2)
            r3.f250458w = r4
        L2c:
            e95.f r4 = r3.f250458w
            if (r4 == 0) goto L37
            boolean r4 = r4.b(r5)
            if (r4 != 0) goto L37
            r1 = r0
        L37:
            if (r1 == 0) goto L41
            int r4 = r3.f250461z
            int r1 = r5 / r4
            int r1 = r1 * r4
            r3.a(r1)
        L41:
            e95.f r4 = r3.f250458w
            if (r4 == 0) goto L48
            r4.moveToPosition(r5)
        L48:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e95.t.onMove(int, int):boolean");
    }

    @Override // e95.r, android.database.Cursor
    public boolean requery() {
        if (this.f250443f) {
            return false;
        }
        synchronized (this) {
            if (!this.f250453r.isOpened()) {
                return false;
            }
            e95.b bVar = this.f250456u;
            if (bVar != null && bVar != null) {
                bVar.a();
            }
            this.f250441d = -1;
            this.f250459x = -1;
            try {
                super.requery();
                return true;
            } catch (java.lang.IllegalStateException e17) {
                com.tencent.mars.xlog.Log.w("WCDB.WCDBNewCursor", "requery() failed " + e17.getMessage(), e17);
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
            boolean r0 = r4.f250455t
            r1 = 0
            if (r0 == 0) goto L39
            e95.b r2 = r4.f250456u
            if (r2 == 0) goto L39
            boolean r0 = r4.B
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
            int r2 = r4.f250459x
            int r3 = r0.length
            int r2 = r2 - r3
            r4.f250459x = r2
            int r2 = r4.f250461z
            int r0 = r0.length
            int r2 = r2 - r0
            r4.f250461z = r2
        L31:
            e95.b r0 = r4.f250456u
            if (r0 == 0) goto L38
            r0.t(r5, r6)
        L38:
            return r1
        L39:
            if (r0 != 0) goto L42
            e95.f r5 = r4.f250458w
            if (r5 == 0) goto L42
            r5.a()
        L42:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: e95.t.t(java.lang.Object, e95.a):boolean");
    }

    @Override // e95.h
    public void u(boolean z17) {
        this.f250455t = z17;
    }

    @Override // e95.h
    public void u1(int i17) {
        this.f250461z = i17;
    }

    @Override // e95.h
    public boolean y() {
        return this.B;
    }
}
