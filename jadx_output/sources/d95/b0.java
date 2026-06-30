package d95;

/* loaded from: classes12.dex */
public class b0 implements l75.k0 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f227609a;

    /* renamed from: b, reason: collision with root package name */
    public d95.f f227610b;

    /* renamed from: c, reason: collision with root package name */
    public final l75.i0 f227611c;

    /* renamed from: d, reason: collision with root package name */
    public l75.j0 f227612d;

    /* renamed from: e, reason: collision with root package name */
    public d95.a f227613e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f227614f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f227615g;

    /* renamed from: h, reason: collision with root package name */
    public long f227616h;

    public b0(l75.i0 i0Var) {
        this.f227609a = "MicroMsg.SqliteDB";
        this.f227610b = null;
        this.f227611c = null;
        this.f227612d = null;
        this.f227613e = new d95.a();
        this.f227614f = "";
        this.f227615g = "";
        new java.util.LinkedList();
        this.f227616h = 0L;
        this.f227611c = i0Var;
    }

    public static java.lang.String O(java.lang.String str) {
        return com.tencent.mm.sdk.platformtools.t8.K0(str) ? "" : android.database.DatabaseUtils.sqlEscapeString(str);
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [d95.b0$$g] */
    @Override // l75.k0
    public boolean A(java.lang.String str, final java.lang.String str2) {
        iz5.a.g("sql is null ", !com.tencent.mm.sdk.platformtools.t8.K0(str2));
        if (isOpen()) {
            return ((java.lang.Boolean) new java.lang.Object() { // from class: d95.b0$$g
                public final java.lang.Object a() {
                    java.lang.String str3 = str2;
                    d95.b0 b0Var = d95.b0.this;
                    b0Var.getClass();
                    try {
                        b0Var.f227610b.f(str3);
                        return java.lang.Boolean.TRUE;
                    } catch (java.lang.Exception e17) {
                        jx3.f.INSTANCE.idkeyStat(181L, 11L, 1L, false);
                        java.lang.String message = e17.getMessage();
                        com.tencent.mars.xlog.Log.e(b0Var.f227609a, "execSQL Error :" + message);
                        if (message == null || !message.contains("no such table")) {
                            return java.lang.Boolean.FALSE;
                        }
                        com.tencent.mm.vfs.w6.h(b0Var.f227613e.f227594c);
                        l75.j0 j0Var = b0Var.f227612d;
                        if (j0Var != null) {
                            ((gm0.b0$$b) j0Var).a();
                        }
                        throw e17;
                    }
                }
            }.a()).booleanValue();
        }
        com.tencent.mars.xlog.Log.e(this.f227609a, "DB IS CLOSED ! {%s}", new com.tencent.mm.sdk.platformtools.z3());
        return false;
    }

    @Override // l75.k0
    public android.database.Cursor B(java.lang.String str, java.lang.String[] strArr) {
        return f(str, strArr, 0);
    }

    @Override // l75.k0
    public void C() {
        P().acquireReference();
    }

    /* JADX WARN: Type inference failed for: r12v0, types: [d95.b0$$a] */
    @Override // l75.k0
    public android.database.Cursor D(final java.lang.String str, final java.lang.String[] strArr, final java.lang.String str2, final java.lang.String[] strArr2, final java.lang.String str3, final java.lang.String str4, final java.lang.String str5, final int i17) {
        final java.lang.String str6 = null;
        if (isOpen()) {
            return (android.database.Cursor) new java.lang.Object() { // from class: d95.b0$$a
                public final java.lang.Object a() {
                    com.tencent.wcdb.database.SQLiteDatabase.CursorFactory cursorFactory;
                    java.lang.String str7 = str;
                    java.lang.String[] strArr3 = strArr;
                    java.lang.String str8 = str2;
                    java.lang.String[] strArr4 = strArr2;
                    java.lang.String str9 = str3;
                    java.lang.String str10 = str4;
                    java.lang.String str11 = str5;
                    java.lang.String str12 = str6;
                    d95.b0 b0Var = d95.b0.this;
                    b0Var.getClass();
                    try {
                        d95.f fVar = b0Var.f227610b;
                        com.tencent.wcdb.database.SQLiteDatabase sQLiteDatabase = fVar.f227678a;
                        com.tencent.wcdb.database.SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase != null ? sQLiteDatabase : fVar.f227679b;
                        boolean z17 = (d95.f.f227665k & 2) != 0;
                        int i18 = i17;
                        if (i18 == 4) {
                            cursorFactory = e95.m.f250425r;
                        } else if (i18 == 100) {
                            cursorFactory = com.tencent.wcdb.database.SQLiteDirectCursor.FACTORY;
                        } else {
                            if ((z65.c.a() || z17) && i18 != 0) {
                                if (i18 == 1) {
                                    cursorFactory = com.tencent.wcdb.database.SQLiteCursor.FACTORY;
                                } else if (i18 == 2) {
                                    cursorFactory = com.tencent.wcdb.database.SQLiteDirectCursor.FACTORY;
                                }
                            }
                            cursorFactory = null;
                        }
                        if (d95.f.n()) {
                            d95.f.f227668n.c(sQLiteDatabase2, 1, str7);
                        }
                        com.tencent.wcdb.Cursor queryWithFactory = sQLiteDatabase2.queryWithFactory(cursorFactory, false, str7, strArr3, str8, strArr4, str9, str10, str11, str12);
                        return i18 != 4 ? new d95.p(queryWithFactory, str7) : queryWithFactory;
                    } catch (java.lang.Exception e17) {
                        jx3.f.INSTANCE.idkeyStat(181L, 10L, 1L, false);
                        com.tencent.mars.xlog.Log.e(b0Var.f227609a, "query Error :" + e17.getMessage());
                        return d95.d.a();
                    }
                }
            }.a();
        }
        java.lang.String str7 = this.f227609a;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.e(str7, "DB IS CLOSED ! {%s}", new com.tencent.mm.sdk.platformtools.z3());
        return d95.d.a();
    }

    @Override // l75.k0
    public android.database.Cursor E(java.lang.String str, java.lang.String[] strArr, java.lang.String str2, java.lang.String[] strArr2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        return D(str, strArr, str2, strArr2, str3, str4, str5, 0);
    }

    @Override // l75.k0
    public synchronized long F(java.lang.Long l17) {
        long id6 = java.lang.Thread.currentThread().getId();
        com.tencent.mars.xlog.Log.i(this.f227609a, "beginTransaction thr:(%d,%d) ticket:%d db:%b", l17, java.lang.Long.valueOf(id6), java.lang.Long.valueOf(this.f227616h), java.lang.Boolean.valueOf(isOpen()));
        if (!isOpen()) {
            java.lang.String str = this.f227609a;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e(str, "DB IS CLOSED ! {%s}", new com.tencent.mm.sdk.platformtools.z3());
            return -4L;
        }
        if (this.f227616h > 0) {
            com.tencent.mars.xlog.Log.e(this.f227609a, "ERROR beginTransaction transactionTicket:" + this.f227616h);
            return -1L;
        }
        if (!com.tencent.mm.sdk.platformtools.u3.e() && l17.longValue() == -1) {
            com.tencent.mars.xlog.Log.e(this.f227609a, "FORBID: beginTrans UNKNOW_THREAD ParamID:%d nowThr:%d", l17, java.lang.Long.valueOf(id6));
            return -2L;
        }
        try {
            this.f227610b.b();
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            this.f227616h = (java.lang.System.currentTimeMillis() & 2147483647L) | ((2147483647L & id6) << 32);
            com.tencent.mars.xlog.Log.i(this.f227609a, "beginTransaction done thr:(%d,%d) ticket:%d db:%b stack:%s", l17, java.lang.Long.valueOf(id6), java.lang.Long.valueOf(this.f227616h), java.lang.Boolean.valueOf(isOpen()), new com.tencent.mm.sdk.platformtools.z3());
            l75.i0 i0Var = this.f227611c;
            if (i0Var != null) {
                i0Var.d();
            }
            return this.f227616h;
        } catch (java.lang.Exception e17) {
            jx3.f.INSTANCE.idkeyStat(181L, 8L, 1L, false);
            com.tencent.mars.xlog.Log.e(this.f227609a, "beginTransaction Error :" + e17.getMessage());
            return -3L;
        }
    }

    @Override // l75.k0
    public synchronized boolean G() {
        if (isOpen()) {
            return this.f227616h > 0;
        }
        java.lang.String str = this.f227609a;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.e(str, "DB IS CLOSED ! {%s}", new com.tencent.mm.sdk.platformtools.z3());
        return false;
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [d95.b0$$f] */
    @Override // l75.k0
    public boolean H(java.lang.String str, final java.lang.String str2, final java.lang.Object[] objArr) {
        iz5.a.g("sql is null ", !com.tencent.mm.sdk.platformtools.t8.K0(str2));
        if (isOpen()) {
            return ((java.lang.Boolean) new java.lang.Object() { // from class: d95.b0$$f
                public final java.lang.Object a() {
                    java.lang.Object[] objArr2 = objArr;
                    d95.b0 b0Var = d95.b0.this;
                    b0Var.getClass();
                    try {
                        d95.f fVar = b0Var.f227610b;
                        com.tencent.wcdb.database.SQLiteDatabase sQLiteDatabase = fVar.f227678a;
                        if (sQLiteDatabase == null) {
                            sQLiteDatabase = fVar.f227679b;
                        }
                        boolean n17 = d95.f.n();
                        java.lang.String str3 = str2;
                        if (n17) {
                            d95.f.f227668n.c(sQLiteDatabase, 32769, str3);
                        }
                        sQLiteDatabase.execSQL(str3, objArr2);
                        return java.lang.Boolean.TRUE;
                    } catch (java.lang.Exception e17) {
                        jx3.f.INSTANCE.idkeyStat(181L, 11L, 1L, false);
                        java.lang.String message = e17.getMessage();
                        com.tencent.mars.xlog.Log.e(b0Var.f227609a, "execSQL Error :" + message);
                        if (message == null || !message.contains("no such table")) {
                            return java.lang.Boolean.FALSE;
                        }
                        com.tencent.mm.vfs.w6.h(b0Var.f227613e.f227594c);
                        l75.j0 j0Var = b0Var.f227612d;
                        if (j0Var != null) {
                            ((gm0.b0$$b) j0Var).a();
                        }
                        throw e17;
                    }
                }
            }.a()).booleanValue();
        }
        com.tencent.mars.xlog.Log.e(this.f227609a, "DB IS CLOSED ! {%s}", new com.tencent.mm.sdk.platformtools.z3());
        return false;
    }

    @Override // l75.k0
    public boolean I(java.lang.String str) {
        if (!isOpen()) {
            java.lang.String str2 = this.f227609a;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e(str2, "DB IS CLOSED ! {%s}", new com.tencent.mm.sdk.platformtools.z3());
            return false;
        }
        try {
            this.f227610b.f("DROP TABLE " + str);
            return true;
        } catch (java.lang.Exception e17) {
            jx3.f.INSTANCE.idkeyStat(181L, 11L, 1L, false);
            com.tencent.mars.xlog.Log.e(this.f227609a, "drop table Error :" + e17.getMessage());
            return false;
        }
    }

    @Override // l75.k0
    public boolean J() {
        d95.f fVar = this.f227610b;
        return fVar == null || !fVar.o();
    }

    @Override // l75.k0
    public boolean K() {
        d95.a aVar = this.f227613e;
        if (aVar != null) {
            return aVar.f227598g;
        }
        return false;
    }

    public void L() {
        M(null);
    }

    public void M(java.lang.String str) {
        if (this.f227610b == null) {
            return;
        }
        l75.i0 i0Var = this.f227611c;
        if (i0Var != null) {
            i0Var.p();
        }
        java.lang.String str2 = this.f227609a;
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(G());
        java.lang.String hexString = java.lang.Long.toHexString(this.f227616h);
        java.lang.Long valueOf2 = java.lang.Long.valueOf(java.lang.Thread.currentThread().getId());
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.w(str2, "begin close db, inTrans:%b ticket:%s  thr:%d {%s}", valueOf, hexString, valueOf2, new com.tencent.mm.sdk.platformtools.z3());
        fp.j jVar = new fp.j();
        if (str != null) {
            this.f227614f = str;
        }
        this.f227610b.c();
        this.f227610b = null;
        jVar.a();
    }

    public synchronized int N(java.lang.Long l17, boolean z17) {
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        long id6 = java.lang.Thread.currentThread().getId();
        com.tencent.mars.xlog.Log.i(this.f227609a, "endTransaction thr:%d ticket:(%d,%d) db:%b, success=%b", java.lang.Long.valueOf(id6), l17, java.lang.Long.valueOf(this.f227616h), java.lang.Boolean.valueOf(isOpen()), java.lang.Boolean.valueOf(z17));
        if (!isOpen()) {
            com.tencent.mars.xlog.Log.e(this.f227609a, "DB IS CLOSED ! {%s}", new com.tencent.mm.sdk.platformtools.z3());
            return -4;
        }
        if (l17 == null) {
            if (z17) {
                this.f227610b.e();
            } else {
                this.f227610b.y();
            }
            com.tencent.mars.xlog.Log.i(this.f227609a, "endTransaction Succ Time:%d thr:%d ticket:(%d,%d)", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis), java.lang.Long.valueOf(id6), l17, java.lang.Long.valueOf(this.f227616h));
            return 0;
        }
        if (l17.longValue() != this.f227616h) {
            com.tencent.mars.xlog.Log.e(this.f227609a, "ERROR endTransaction ticket:" + l17 + " transactionTicket:" + this.f227616h);
            return -1;
        }
        long longValue = (l17.longValue() >> 32) & 2147483647L;
        if (longValue != id6) {
            com.tencent.mars.xlog.Log.e(this.f227609a, "FORBID: endTrans UNKNOW_THREAD ticket:%s ParamID:%d nowThr:%d", java.lang.Long.toHexString(l17.longValue()), java.lang.Long.valueOf(longValue), java.lang.Long.valueOf(id6));
            return -2;
        }
        try {
            if (z17) {
                this.f227610b.e();
            } else {
                this.f227610b.y();
            }
            com.tencent.mars.xlog.Log.i(this.f227609a, "endTransaction Succ Time:%d thr:%d ticket:(%d,%d) db:%b", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis), java.lang.Long.valueOf(id6), l17, java.lang.Long.valueOf(this.f227616h), java.lang.Boolean.valueOf(isOpen()));
            this.f227616h = 0L;
            l75.i0 i0Var = this.f227611c;
            if (i0Var != null) {
                i0Var.u();
            }
            return 0;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(this.f227609a, "endTransaction Error :" + e17.getMessage());
            jx3.f.INSTANCE.idkeyStat(181L, 9L, 1L, false);
            return -3;
        }
    }

    public com.tencent.wcdb.database.SQLiteDatabase P() {
        d95.f fVar = this.f227610b;
        com.tencent.wcdb.database.SQLiteDatabase sQLiteDatabase = fVar.f227678a;
        return sQLiteDatabase != null ? sQLiteDatabase : fVar.f227679b;
    }

    public final void Q(java.lang.String str) {
        java.lang.String a17 = bm5.f1.a();
        java.lang.String str2 = com.tencent.mm.sdk.platformtools.x2.f193072b;
        com.tencent.mars.xlog.Log.i(this.f227609a, "check process :[%s] [%s] path[%s]", a17, str2, str);
        if (a17 == null || str2 == null || str2.equals(a17)) {
            return;
        }
        iz5.a.g("processName:" + a17 + "  packagename:" + str2, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00f6, code lost:
    
        r25 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0296, code lost:
    
        if (r7.f227592a != null) goto L68;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0209  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean R(java.lang.String r35, java.lang.String r36, java.lang.String r37, long r38, java.lang.String r40, java.util.HashMap r41, boolean r42) {
        /*
            Method dump skipped, instructions count: 717
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d95.b0.R(java.lang.String, java.lang.String, java.lang.String, long, java.lang.String, java.util.HashMap, boolean):boolean");
    }

    public boolean S(java.lang.String str, java.util.HashMap hashMap, boolean z17, boolean z18) {
        boolean z19;
        d95.f fVar;
        int lastIndexOf = str.lastIndexOf("/");
        if (lastIndexOf != -1) {
            this.f227609a += "." + str.substring(lastIndexOf + 1);
        }
        Q(str);
        d95.a aVar = this.f227613e;
        d95.f fVar2 = aVar.f227592a;
        if (fVar2 != null) {
            fVar2.c();
            aVar.f227592a = null;
        }
        boolean j17 = com.tencent.mm.vfs.w6.j(str);
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.DBInit", "initSysDB checkini:%b exist:%b db:%s ", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(j17), str);
            aVar.f227592a = d95.f.t(str, z18);
        } catch (com.tencent.wcdb.database.SQLiteException unused) {
        }
        if (aVar.c(hashMap, z17, !j17)) {
            z19 = true;
            if (!z19) {
            }
            this.f227610b = null;
            this.f227613e = null;
            com.tencent.mars.xlog.Log.e(this.f227609a, "initDB failed.");
            return false;
        }
        d95.f fVar3 = aVar.f227592a;
        if (fVar3 != null) {
            fVar3.c();
            aVar.f227592a = null;
        }
        z19 = false;
        if (!z19 && (fVar = this.f227613e.f227592a) != null) {
            this.f227610b = fVar;
            com.tencent.mars.xlog.Log.i(this.f227609a, "SqliteDB db %s", fVar);
            return true;
        }
        this.f227610b = null;
        this.f227613e = null;
        com.tencent.mars.xlog.Log.e(this.f227609a, "initDB failed.");
        return false;
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [d95.b0$$e] */
    public long T(final java.lang.String str, final java.lang.String str2, final android.content.ContentValues contentValues, final boolean z17) {
        if (isOpen()) {
            return ((java.lang.Long) new java.lang.Object() { // from class: d95.b0$$e
                public final java.lang.Object a() {
                    java.lang.String str3 = str2;
                    android.content.ContentValues contentValues2 = contentValues;
                    d95.b0 b0Var = d95.b0.this;
                    b0Var.getClass();
                    try {
                        d95.f fVar = b0Var.f227610b;
                        com.tencent.wcdb.database.SQLiteDatabase sQLiteDatabase = fVar.f227678a;
                        if (sQLiteDatabase == null) {
                            sQLiteDatabase = fVar.f227679b;
                        }
                        boolean n17 = d95.f.n();
                        java.lang.String str4 = str;
                        if (n17) {
                            d95.f.f227668n.c(sQLiteDatabase, 32769, str4);
                        }
                        return java.lang.Long.valueOf(sQLiteDatabase.insert(str4, str3, contentValues2));
                    } catch (java.lang.Exception e17) {
                        jx3.f.INSTANCE.idkeyStat(181L, 11L, 1L, false);
                        com.tencent.mars.xlog.Log.e(b0Var.f227609a, "insert Error :" + e17.getMessage());
                        if (z17) {
                            throw e17;
                        }
                        return -1L;
                    }
                }
            }.a()).longValue();
        }
        java.lang.String str3 = this.f227609a;
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.e(str3, "DB IS CLOSED ! {%s}", new com.tencent.mm.sdk.platformtools.z3());
        return -2L;
    }

    public android.database.Cursor U(java.lang.String str, java.lang.String[] strArr, int i17, com.tencent.wcdb.support.CancellationSignal cancellationSignal) {
        iz5.a.g("sql is null ", !com.tencent.mm.sdk.platformtools.t8.K0(str));
        if (!isOpen()) {
            com.tencent.mars.xlog.Log.e(this.f227609a, "DB IS CLOSED ! {%s}", new com.tencent.mm.sdk.platformtools.z3());
            return d95.d.a();
        }
        try {
            return this.f227610b.v(str, strArr, i17, false, cancellationSignal);
        } catch (java.lang.Exception e17) {
            jx3.f.INSTANCE.idkeyStat(181L, 10L, 1L, false);
            com.tencent.mars.xlog.Log.e(this.f227609a, "rawQuery Error :" + e17.getMessage());
            return d95.d.a();
        }
    }

    public android.database.Cursor V(java.lang.String str, java.lang.String[] strArr, com.tencent.wcdb.support.CancellationSignal cancellationSignal) {
        iz5.a.g("sql is null ", !com.tencent.mm.sdk.platformtools.t8.K0(str));
        if (!isOpen()) {
            com.tencent.mars.xlog.Log.e(this.f227609a, "DB IS CLOSED ! {%s}", new com.tencent.mm.sdk.platformtools.z3());
            return d95.d.a();
        }
        try {
            return this.f227610b.v(str, strArr, 0, false, cancellationSignal);
        } catch (java.lang.Exception e17) {
            jx3.f.INSTANCE.idkeyStat(181L, 10L, 1L, false);
            com.tencent.mars.xlog.Log.e(this.f227609a, "rawQuery Error :" + e17.getMessage());
            return d95.d.a();
        }
    }

    @Override // l75.k0
    public boolean a() {
        return false;
    }

    @Override // l75.k0
    public long b() {
        return F(-1L);
    }

    @Override // l75.k0
    public boolean c() {
        return this.f227613e.f227595d;
    }

    @Override // l75.k0
    public void close() {
        this.f227610b.c();
    }

    @Override // l75.k0
    public android.database.Cursor d(boolean z17, java.lang.String str, java.lang.String[] strArr, java.lang.String str2, java.lang.String[] strArr2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, com.tencent.wcdb.support.CancellationSignal cancellationSignal) {
        return V(android.database.sqlite.SQLiteQueryBuilder.buildQueryString(z17, str, strArr, str2, str3, str4, str5, str6), strArr2, cancellationSignal);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [d95.b0$$c] */
    @Override // l75.k0
    public int delete(final java.lang.String str, final java.lang.String str2, final java.lang.String[] strArr) {
        if (isOpen()) {
            return ((java.lang.Integer) new java.lang.Object() { // from class: d95.b0$$c
                public final java.lang.Object a() {
                    java.lang.String str3 = str2;
                    java.lang.String[] strArr2 = strArr;
                    d95.b0 b0Var = d95.b0.this;
                    b0Var.getClass();
                    try {
                        d95.f fVar = b0Var.f227610b;
                        com.tencent.wcdb.database.SQLiteDatabase sQLiteDatabase = fVar.f227678a;
                        if (sQLiteDatabase == null) {
                            sQLiteDatabase = fVar.f227679b;
                        }
                        boolean n17 = d95.f.n();
                        java.lang.String str4 = str;
                        if (n17) {
                            d95.f.f227668n.c(sQLiteDatabase, 32769, str4);
                        }
                        return java.lang.Integer.valueOf(sQLiteDatabase.delete(str4, str3, strArr2));
                    } catch (java.lang.Exception e17) {
                        jx3.f.INSTANCE.idkeyStat(181L, 11L, 1L, false);
                        com.tencent.mars.xlog.Log.e(b0Var.f227609a, "delete Error :" + e17.getMessage());
                        return -1;
                    }
                }
            }.a()).intValue();
        }
        java.lang.String str3 = this.f227609a;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.e(str3, "DB IS CLOSED ! {%s}", new com.tencent.mm.sdk.platformtools.z3());
        return -2;
    }

    @Override // l75.k0
    public long e() {
        return this.f227610b.h();
    }

    @Override // l75.k0
    public android.database.Cursor f(java.lang.String str, java.lang.String[] strArr, int i17) {
        iz5.a.g("sql is null ", !com.tencent.mm.sdk.platformtools.t8.K0(str));
        if (!isOpen()) {
            com.tencent.mars.xlog.Log.e(this.f227609a, "DB IS CLOSED ! {%s}", new com.tencent.mm.sdk.platformtools.z3());
            return d95.d.a();
        }
        try {
            return this.f227610b.v(str, strArr, i17, false, null);
        } catch (java.lang.Exception e17) {
            jx3.f.INSTANCE.idkeyStat(181L, 10L, 1L, false);
            com.tencent.mars.xlog.Log.e(this.f227609a, "rawQuery Error :" + e17.getMessage());
            return d95.d.a();
        }
    }

    public void finalize() {
        M(null);
    }

    @Override // l75.k0
    public l75.e1 g() {
        if (isOpen()) {
            this.f227610b.getClass();
            return d95.f.f227668n.a();
        }
        java.lang.String str = this.f227609a;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.e(str, "DB IS CLOSED ! {%s}", new com.tencent.mm.sdk.platformtools.z3());
        return null;
    }

    @Override // l75.k0
    public java.lang.String getPath() {
        if (isOpen()) {
            return this.f227610b.k();
        }
        java.lang.String str = this.f227609a;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.e(str, "DB IS CLOSED ! {%s}", new com.tencent.mm.sdk.platformtools.z3());
        return null;
    }

    @Override // l75.k0
    public long h(long j17) {
        return this.f227610b.g() - j17;
    }

    @Override // l75.k0
    public com.tencent.wcdb.repair.RepairKit.LeafInfo i(java.lang.String[] strArr, com.tencent.wcdb.support.CancellationSignal cancellationSignal) {
        return com.tencent.wcdb.repair.RepairKit.LeafInfo.scan(P(), strArr, cancellationSignal);
    }

    @Override // l75.k0
    public boolean isOpen() {
        d95.f fVar = this.f227610b;
        if (fVar != null && fVar.o()) {
            return true;
        }
        com.tencent.mars.xlog.Log.e(this.f227609a, "DB has been closed :[%s]", java.lang.Boolean.valueOf(com.tencent.mm.sdk.platformtools.t8.K0(this.f227614f)));
        return false;
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [d95.b0$$h] */
    @Override // l75.k0
    public boolean j(java.lang.String str, final java.lang.String str2, final java.lang.Object[] objArr, final com.tencent.wcdb.support.CancellationSignal cancellationSignal) {
        iz5.a.g("sql is null ", !com.tencent.mm.sdk.platformtools.t8.K0(str2));
        if (isOpen()) {
            return ((java.lang.Boolean) new java.lang.Object() { // from class: d95.b0$$h
                public final java.lang.Object a() {
                    java.lang.String str3 = str2;
                    java.lang.Object[] objArr2 = objArr;
                    com.tencent.wcdb.support.CancellationSignal cancellationSignal2 = cancellationSignal;
                    d95.b0 b0Var = d95.b0.this;
                    b0Var.getClass();
                    try {
                        d95.f fVar = b0Var.f227610b;
                        com.tencent.wcdb.database.SQLiteDatabase sQLiteDatabase = fVar.f227678a;
                        if (sQLiteDatabase == null) {
                            sQLiteDatabase = fVar.f227679b;
                        }
                        sQLiteDatabase.execSQL(str3, objArr2, cancellationSignal2);
                        return java.lang.Boolean.TRUE;
                    } catch (java.lang.Exception e17) {
                        jx3.f.INSTANCE.idkeyStat(181L, 11L, 1L, false);
                        java.lang.String message = e17.getMessage();
                        com.tencent.mars.xlog.Log.e(b0Var.f227609a, "execSQL Error :" + message);
                        if (message == null || !message.contains("no such table")) {
                            return java.lang.Boolean.FALSE;
                        }
                        com.tencent.mm.vfs.w6.h(b0Var.f227613e.f227594c);
                        l75.j0 j0Var = b0Var.f227612d;
                        if (j0Var != null) {
                            ((gm0.b0$$b) j0Var).a();
                        }
                        throw e17;
                    }
                }
            }.a()).booleanValue();
        }
        com.tencent.mars.xlog.Log.e(this.f227609a, "DB IS CLOSED ! {%s}", new com.tencent.mm.sdk.platformtools.z3());
        return false;
    }

    @Override // l75.k0
    public long k() {
        return this.f227610b.g();
    }

    @Override // l75.k0
    public long l(java.lang.String str, java.lang.String str2, android.content.ContentValues contentValues) {
        return T(str, str2, contentValues, false);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [d95.b0$$b] */
    @Override // l75.k0
    public long m(final java.lang.String str, final java.lang.String str2, final android.content.ContentValues contentValues) {
        if (isOpen()) {
            return ((java.lang.Long) new java.lang.Object() { // from class: d95.b0$$b
                public final java.lang.Object a() {
                    java.lang.String str3 = str2;
                    android.content.ContentValues contentValues2 = contentValues;
                    d95.b0 b0Var = d95.b0.this;
                    b0Var.getClass();
                    try {
                        d95.f fVar = b0Var.f227610b;
                        com.tencent.wcdb.database.SQLiteDatabase sQLiteDatabase = fVar.f227678a;
                        if (sQLiteDatabase == null) {
                            sQLiteDatabase = fVar.f227679b;
                        }
                        boolean n17 = d95.f.n();
                        java.lang.String str4 = str;
                        if (n17) {
                            d95.f.f227668n.c(sQLiteDatabase, 32769, str4);
                        }
                        return java.lang.Long.valueOf(sQLiteDatabase.replace(str4, str3, contentValues2));
                    } catch (java.lang.Exception e17) {
                        jx3.f.INSTANCE.idkeyStat(181L, 11L, 1L, false);
                        com.tencent.mars.xlog.Log.e(b0Var.f227609a, "repalce  Error :" + e17.getMessage());
                        return -1L;
                    }
                }
            }.a()).longValue();
        }
        java.lang.String str3 = this.f227609a;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.e(str3, "DB IS CLOSED ! {%s}", new com.tencent.mm.sdk.platformtools.z3());
        return -2L;
    }

    @Override // l75.k0
    public boolean n() {
        return this.f227613e.f227596e;
    }

    @Override // l75.k0
    public android.database.Cursor o(com.tencent.wcdb.database.SQLiteDatabase.CursorFactory cursorFactory, java.lang.String str, java.lang.String[] strArr, java.lang.String str2, com.tencent.wcdb.support.CancellationSignal cancellationSignal) {
        if (!isOpen()) {
            java.lang.String str3 = this.f227609a;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e(str3, "DB IS CLOSED ! {%s}", new com.tencent.mm.sdk.platformtools.z3());
            return d95.d.a();
        }
        d95.f fVar = this.f227610b;
        com.tencent.wcdb.database.SQLiteDatabase sQLiteDatabase = fVar.f227678a;
        if (sQLiteDatabase == null) {
            sQLiteDatabase = fVar.f227679b;
        }
        return sQLiteDatabase.rawQueryWithFactory(cursorFactory, str, strArr, str2, cancellationSignal);
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [d95.b0$$d] */
    @Override // l75.k0
    public int p(final java.lang.String str, final android.content.ContentValues contentValues, final java.lang.String str2, final java.lang.String[] strArr) {
        if (isOpen()) {
            return ((java.lang.Integer) new java.lang.Object() { // from class: d95.b0$$d
                public final java.lang.Object a() {
                    android.content.ContentValues contentValues2 = contentValues;
                    java.lang.String str3 = str2;
                    java.lang.String[] strArr2 = strArr;
                    d95.b0 b0Var = d95.b0.this;
                    b0Var.getClass();
                    try {
                        d95.f fVar = b0Var.f227610b;
                        com.tencent.wcdb.database.SQLiteDatabase sQLiteDatabase = fVar.f227678a;
                        if (sQLiteDatabase == null) {
                            sQLiteDatabase = fVar.f227679b;
                        }
                        boolean n17 = d95.f.n();
                        java.lang.String str4 = str;
                        if (n17) {
                            d95.f.f227668n.c(sQLiteDatabase, 32769, str4);
                        }
                        return java.lang.Integer.valueOf(sQLiteDatabase.update(str4, contentValues2, str3, strArr2));
                    } catch (java.lang.Exception e17) {
                        jx3.f.INSTANCE.idkeyStat(181L, 11L, 1L, false);
                        com.tencent.mars.xlog.Log.e(b0Var.f227609a, "update Error :" + e17.getMessage());
                        return -1;
                    }
                }
            }.a()).intValue();
        }
        java.lang.String str3 = this.f227609a;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.e(str3, "DB IS CLOSED ! {%s}", new com.tencent.mm.sdk.platformtools.z3());
        return -2;
    }

    @Override // l75.k0
    public long q() {
        if (isOpen()) {
            return this.f227610b.j();
        }
        java.lang.String str = this.f227609a;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.e(str, "DB IS CLOSED ! {%s}", new com.tencent.mm.sdk.platformtools.z3());
        return 0L;
    }

    @Override // l75.k0
    public void r() {
    }

    @Override // l75.k0
    public android.database.Cursor s(java.lang.String str, java.lang.String[] strArr) {
        iz5.a.g("sql is null ", !com.tencent.mm.sdk.platformtools.t8.K0(str));
        if (!isOpen()) {
            com.tencent.mars.xlog.Log.e(this.f227609a, "DB IS CLOSED ! {%s}", new com.tencent.mm.sdk.platformtools.z3());
            return d95.d.a();
        }
        try {
            return this.f227610b.v(str, strArr, 0, true, null);
        } catch (java.lang.Exception e17) {
            jx3.f.INSTANCE.idkeyStat(181L, 10L, 1L, false);
            com.tencent.mars.xlog.Log.e(this.f227609a, "rawQueryWithCancel Error: %s, SQL: %s", e17.getMessage(), str);
            return d95.d.a();
        }
    }

    @Override // l75.k0
    public int t() {
        return N(null, true);
    }

    @Override // l75.k0
    public boolean u() {
        if (isOpen()) {
            return this.f227610b.z();
        }
        java.lang.String str = this.f227609a;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.e(str, "DB IS CLOSED ! {%s}", new com.tencent.mm.sdk.platformtools.z3());
        return false;
    }

    @Override // l75.k0
    public long v(java.lang.String str, java.lang.String str2, android.content.ContentValues contentValues) {
        return T(str, str2, contentValues, true);
    }

    @Override // l75.k0
    public int w(java.lang.Long l17) {
        return N(l17, true);
    }

    @Override // l75.k0
    public void x() {
        P().releaseReference();
    }

    @Override // l75.k0
    public void y(l75.j0 j0Var) {
        this.f227612d = j0Var;
    }

    @Override // l75.k0
    public p75.k z(java.lang.String str) {
        if (isOpen()) {
            return new p75.e0(P().compileStatement(str), null);
        }
        java.lang.String str2 = this.f227609a;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.e(str2, "DB IS CLOSED ! {%s}", new com.tencent.mm.sdk.platformtools.z3());
        return null;
    }

    public b0(d95.f fVar) {
        this.f227609a = "MicroMsg.SqliteDB";
        this.f227610b = null;
        this.f227611c = null;
        this.f227612d = null;
        this.f227613e = new d95.a();
        this.f227614f = "";
        this.f227615g = "";
        new java.util.LinkedList();
        this.f227616h = 0L;
        this.f227610b = fVar;
    }

    public b0() {
        this.f227609a = "MicroMsg.SqliteDB";
        this.f227610b = null;
        this.f227611c = null;
        this.f227612d = null;
        this.f227613e = new d95.a();
        this.f227614f = "";
        this.f227615g = "";
        new java.util.LinkedList();
        this.f227616h = 0L;
    }
}
