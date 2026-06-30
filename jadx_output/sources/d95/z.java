package d95;

/* loaded from: classes12.dex */
public class z implements l75.k0 {

    /* renamed from: f, reason: collision with root package name */
    public static final l75.e1 f227715f = new l75.e1();

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.regex.Pattern f227716g = java.util.regex.Pattern.compile("^[\\s]*CREATE[\\s]+TABLE[\\s]*", 2);

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.HashSet f227717h = new java.util.HashSet();

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.wcdb.compat.SQLiteDatabase f227718a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f227719b;

    /* renamed from: c, reason: collision with root package name */
    public l75.i0 f227720c = null;

    /* renamed from: d, reason: collision with root package name */
    public l75.j0 f227721d = null;

    /* renamed from: e, reason: collision with root package name */
    public boolean f227722e = false;

    public z(com.tencent.wcdb.core.Database database, boolean z17) {
        this.f227718a = com.tencent.wcdb.compat.SQLiteDatabase.wrap(database);
        this.f227719b = z17;
        ((aq1.q0) ((a25.q) i95.n0.c(a25.q.class))).getClass();
        mm.d0.f328475a.b(new d95.a0(this));
        java.util.Set set = f95.j.f260564a;
        f95.i iVar = new f95.i(this);
        com.tencent.mars.xlog.Log.i("MicroMsg.WCDBPerformance", "vacuumedSet = " + f95.j.f260564a);
        com.tencent.mars.xlog.Log.i("MicroMsg.WCDBPerformance", "db.getPath() = " + getPath());
        ((ku5.t0) ku5.t0.f312615d).l(new f95.f(this, iVar), com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT, "vacuum-task");
    }

    public static android.database.Cursor L(android.database.Cursor cursor, java.lang.String str) {
        if (com.tencent.wcdb.compat.ValueCursorCompat.isValueCursor(cursor) && cursor.getCount() > 10000 && f227717h.add(str)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.SQLiteWrapper", "Returned cursor is too big: %d, sql: %s", java.lang.Integer.valueOf(cursor.getCount()), str);
            jx3.f.INSTANCE.d(21019, 0, java.lang.Integer.valueOf(cursor.getCount()), 66030, "", str.replace(',', ';'));
        }
        return cursor;
    }

    public static boolean N() {
        return android.os.Looper.myLooper() == android.os.Looper.getMainLooper();
    }

    @Override // l75.k0
    public boolean A(java.lang.String str, java.lang.String str2) {
        iz5.a.g("sql is null ", !com.tencent.mm.sdk.platformtools.t8.K0(str2));
        try {
            boolean N = N();
            com.tencent.wcdb.compat.SQLiteDatabase sQLiteDatabase = this.f227718a;
            if (N) {
                f227715f.b(sQLiteDatabase, 32769, str2);
            }
            sQLiteDatabase.execSQL(str2);
            return true;
        } catch (java.lang.RuntimeException e17) {
            O(e17);
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SQLiteWrapper", e17, "Execute failed.", new java.lang.Object[0]);
            java.lang.String message = e17.getMessage();
            com.tencent.mars.xlog.Log.e("MicroMsg.SQLiteWrapper", "execSQL Error :" + message);
            if (message == null || !message.contains("no such table")) {
                return false;
            }
            l75.j0 j0Var = this.f227721d;
            if (j0Var != null) {
                ((gm0.b0$$b) j0Var).a();
            }
            throw e17;
        }
    }

    @Override // l75.k0
    public android.database.Cursor B(java.lang.String str, java.lang.String[] strArr) {
        iz5.a.g("sql is null ", !com.tencent.mm.sdk.platformtools.t8.K0(str));
        try {
            boolean N = N();
            com.tencent.wcdb.compat.SQLiteDatabase sQLiteDatabase = this.f227718a;
            if (N) {
                f227715f.b(sQLiteDatabase, 1 | (com.tencent.wcdb.DatabaseUtils.getSqlStatementType(str) == 1 ? 32768 : 0), str);
            }
            android.database.Cursor rawQuery = sQLiteDatabase.rawQuery(str, strArr);
            L(rawQuery, str);
            return rawQuery;
        } catch (java.lang.RuntimeException e17) {
            O(e17);
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SQLiteWrapper", e17, "Query failed.", new java.lang.Object[0]);
            return d95.d.a();
        }
    }

    @Override // l75.k0
    public android.database.Cursor D(java.lang.String str, java.lang.String[] strArr, java.lang.String str2, java.lang.String[] strArr2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i17) {
        return B(android.database.sqlite.SQLiteQueryBuilder.buildQueryString(false, str, strArr, str2, str3, str4, str5, null), strArr2);
    }

    @Override // l75.k0
    public android.database.Cursor E(java.lang.String str, java.lang.String[] strArr, java.lang.String str2, java.lang.String[] strArr2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        return B(android.database.sqlite.SQLiteQueryBuilder.buildQueryString(false, str, strArr, str2, str3, str4, str5, null), strArr2);
    }

    @Override // l75.k0
    public long F(java.lang.Long l17) {
        java.lang.Long valueOf = java.lang.Long.valueOf(java.lang.Thread.currentThread().getId());
        java.lang.Boolean valueOf2 = java.lang.Boolean.valueOf(isOpen());
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.i("MicroMsg.SQLiteWrapper", "beginTransaction thr:(%d,%d) db:%b stack:%s", l17, valueOf, valueOf2, new com.tencent.mm.sdk.platformtools.z3());
        boolean N = N();
        com.tencent.wcdb.compat.SQLiteDatabase sQLiteDatabase = this.f227718a;
        if (N) {
            f227715f.b(sQLiteDatabase, 32769, "BEGIN TRANSACTION;");
        }
        try {
            sQLiteDatabase.beginTransaction();
            l75.i0 i0Var = this.f227720c;
            if (i0Var == null) {
                return 1L;
            }
            i0Var.d();
            return 1L;
        } catch (java.lang.RuntimeException e17) {
            O(e17);
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SQLiteWrapper", e17, "Begin transaction failed.", new java.lang.Object[0]);
            return -1L;
        }
    }

    @Override // l75.k0
    public boolean G() {
        return this.f227718a.inTransaction();
    }

    @Override // l75.k0
    public boolean H(java.lang.String str, java.lang.String str2, java.lang.Object[] objArr) {
        iz5.a.g("sql is null ", !com.tencent.mm.sdk.platformtools.t8.K0(str2));
        try {
            boolean N = N();
            com.tencent.wcdb.compat.SQLiteDatabase sQLiteDatabase = this.f227718a;
            if (N) {
                f227715f.b(sQLiteDatabase, 32769, str2);
            }
            sQLiteDatabase.execSQL(str2, objArr);
            return true;
        } catch (java.lang.RuntimeException e17) {
            O(e17);
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SQLiteWrapper", e17, "Execute failed.", new java.lang.Object[0]);
            java.lang.String message = e17.getMessage();
            com.tencent.mars.xlog.Log.e("MicroMsg.SQLiteWrapper", "execSQL Error :" + message);
            if (message == null || !message.contains("no such table")) {
                return false;
            }
            l75.j0 j0Var = this.f227721d;
            if (j0Var != null) {
                ((gm0.b0$$b) j0Var).a();
            }
            throw e17;
        }
    }

    @Override // l75.k0
    public boolean I(java.lang.String str) {
        try {
            A(str, "DROP TABLE " + str);
            return true;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SQLiteWrapper", "drop table Error :" + e17.getMessage());
            return false;
        }
    }

    @Override // l75.k0
    public boolean J() {
        return !this.f227718a.isOpen();
    }

    public boolean M(java.util.HashMap hashMap, boolean z17, boolean z18) {
        java.lang.String str;
        java.lang.String str2;
        com.tencent.wcdb.compat.SQLiteDatabase sQLiteDatabase;
        java.util.Iterator it;
        java.lang.String[] strArr;
        int i17;
        hashMap.size();
        com.tencent.wcdb.compat.SQLiteDatabase sQLiteDatabase2 = this.f227718a;
        int i18 = 0;
        if (z17) {
            java.lang.String str3 = sQLiteDatabase2.getPath() + ".ini";
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            for (d95.c0 c0Var : hashMap.values()) {
                if (c0Var.a() == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.SQLiteWrapper", "factory.getSQLs() is null: %s", c0Var.getClass().toString());
                    iz5.a.g("factory.getSQLs() is null:" + c0Var.getClass().toString(), false);
                }
                for (java.lang.String str4 : c0Var.a()) {
                    sb6.append(str4.hashCode());
                }
            }
            java.lang.String g17 = kk.k.g(sb6.toString().getBytes());
            if (!z18) {
                java.lang.String c17 = new l75.a(str3).c("createmd5");
                if (!com.tencent.mm.sdk.platformtools.t8.K0(c17) && g17.equals(c17)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.SQLiteWrapper", "Create table factories not changed , no need create !  %s", sQLiteDatabase2.getPath());
                    return true;
                }
            }
            str2 = g17;
            str = str3;
        } else {
            str = "";
            str2 = str;
        }
        fp.j jVar = new fp.j();
        long F = F(java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
        java.util.Iterator it6 = hashMap.values().iterator();
        int i19 = 0;
        while (it6.hasNext()) {
            java.lang.String[] a17 = ((d95.c0) it6.next()).a();
            int length = a17.length;
            int i27 = i19;
            int i28 = i18;
            while (i28 < length) {
                java.lang.String str5 = a17[i28];
                try {
                    sQLiteDatabase2.execSQL(str5);
                    i27++;
                    sQLiteDatabase = sQLiteDatabase2;
                    it = it6;
                    strArr = a17;
                    i17 = 0;
                } catch (java.lang.Exception e17) {
                    java.util.regex.Matcher matcher = f227716g.matcher(str5);
                    sQLiteDatabase = sQLiteDatabase2;
                    it = it6;
                    strArr = a17;
                    if (matcher == null || !matcher.matches()) {
                        i17 = 0;
                        com.tencent.mars.xlog.Log.w("MicroMsg.SQLiteWrapper", "CreateTable failed:[" + str5 + "][" + e17.getMessage() + "]");
                    } else {
                        iz5.a.g("CreateTable failed:[" + str5 + "][" + e17.getMessage() + "]", false);
                        i17 = 0;
                    }
                }
                i28++;
                it6 = it;
                a17 = strArr;
                i18 = i17;
                sQLiteDatabase2 = sQLiteDatabase;
            }
            i19 = i27;
        }
        long a18 = jVar.a();
        w(java.lang.Long.valueOf(F));
        com.tencent.mars.xlog.Log.i("MicroMsg.SQLiteWrapper", "createtables end sql:%d trans:%d sqlCount:%d", java.lang.Long.valueOf(a18), java.lang.Long.valueOf(jVar.a()), java.lang.Integer.valueOf(i19));
        if (!z17) {
            return true;
        }
        new l75.a(str).d("createmd5", str2);
        return true;
    }

    public final void O(java.lang.RuntimeException runtimeException) {
        if (this.f227719b && (runtimeException instanceof com.tencent.wcdb.base.WCDBCorruptOrIOException)) {
            com.tencent.wcdb.base.WCDBCorruptOrIOException wCDBCorruptOrIOException = (com.tencent.wcdb.base.WCDBCorruptOrIOException) runtimeException;
            com.tencent.wcdb.base.WCDBException.Code code = wCDBCorruptOrIOException.code;
            if (code == com.tencent.wcdb.base.WCDBException.Code.Corrupt) {
                throw wCDBCorruptOrIOException;
            }
            if (code == com.tencent.wcdb.base.WCDBException.Code.NotADatabase) {
                throw wCDBCorruptOrIOException;
            }
        }
    }

    public android.database.Cursor P(java.lang.String str, java.lang.String[] strArr, com.tencent.wcdb.support.CancellationSignal cancellationSignal) {
        iz5.a.g("sql is null ", !com.tencent.mm.sdk.platformtools.t8.K0(str));
        try {
            boolean N = N();
            com.tencent.wcdb.compat.SQLiteDatabase sQLiteDatabase = this.f227718a;
            if (N) {
                f227715f.b(sQLiteDatabase, 1 | (com.tencent.wcdb.DatabaseUtils.getSqlStatementType(str) == 1 ? 32768 : 0), str);
            }
            android.database.Cursor rawQuery = sQLiteDatabase.rawQuery(str, strArr, cancellationSignal != null ? new p75.c(cancellationSignal, this).f352623b : null);
            L(rawQuery, str);
            return rawQuery;
        } catch (java.lang.RuntimeException e17) {
            O(e17);
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SQLiteWrapper", e17, "Query failed.", new java.lang.Object[0]);
            return d95.d.a();
        }
    }

    @Override // l75.k0
    public boolean a() {
        return true;
    }

    @Override // l75.k0
    public void close() {
        this.f227718a.close();
    }

    @Override // l75.k0
    public android.database.Cursor d(boolean z17, java.lang.String str, java.lang.String[] strArr, java.lang.String str2, java.lang.String[] strArr2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, com.tencent.wcdb.support.CancellationSignal cancellationSignal) {
        return P(android.database.sqlite.SQLiteQueryBuilder.buildQueryString(z17, str, strArr, str2, str3, str4, str5, str6), strArr2, cancellationSignal);
    }

    @Override // l75.k0
    public int delete(java.lang.String str, java.lang.String str2, java.lang.String[] strArr) {
        try {
            boolean N = N();
            com.tencent.wcdb.compat.SQLiteDatabase sQLiteDatabase = this.f227718a;
            if (N) {
                f227715f.b(sQLiteDatabase, 32769, str);
            }
            return sQLiteDatabase.delete(str, str2, strArr);
        } catch (java.lang.RuntimeException e17) {
            O(e17);
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SQLiteWrapper", e17, "Delete failed.", new java.lang.Object[0]);
            return -1;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004a, code lost:
    
        if (r3 == null) goto L13;
     */
    @Override // l75.k0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long e() {
        /*
            r7 = this;
            java.lang.String r0 = "MicroMsg.SQLiteWrapper"
            r1 = -1
            r3 = 0
            com.tencent.wcdb.compat.SQLiteDatabase r4 = r7.f227718a     // Catch: java.lang.Throwable -> L31
            java.lang.String r5 = "PRAGMA freelist_count"
            android.database.Cursor r3 = r4.rawQuery(r5, r3)     // Catch: java.lang.Throwable -> L31
        Ld:
            boolean r4 = r3.moveToNext()     // Catch: java.lang.Throwable -> L31
            if (r4 == 0) goto L19
            r4 = 0
            long r1 = r3.getLong(r4)     // Catch: java.lang.Throwable -> L31
            goto Ld
        L19:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L31
            r4.<init>()     // Catch: java.lang.Throwable -> L31
            java.lang.String r5 = "getFreeListCount, count = "
            r4.append(r5)     // Catch: java.lang.Throwable -> L31
            r4.append(r1)     // Catch: java.lang.Throwable -> L31
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L31
            com.tencent.mars.xlog.Log.i(r0, r4)     // Catch: java.lang.Throwable -> L31
        L2d:
            r3.close()
            goto L4d
        L31:
            r4 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L53
            r5.<init>()     // Catch: java.lang.Throwable -> L53
            java.lang.String r6 = "getFreeListSize error, t = "
            r5.append(r6)     // Catch: java.lang.Throwable -> L53
            java.lang.String r4 = r4.getMessage()     // Catch: java.lang.Throwable -> L53
            r5.append(r4)     // Catch: java.lang.Throwable -> L53
            java.lang.String r4 = r5.toString()     // Catch: java.lang.Throwable -> L53
            com.tencent.mars.xlog.Log.e(r0, r4)     // Catch: java.lang.Throwable -> L53
            if (r3 == 0) goto L4d
            goto L2d
        L4d:
            long r3 = r7.q()
            long r1 = r1 * r3
            return r1
        L53:
            r0 = move-exception
            if (r3 == 0) goto L59
            r3.close()
        L59:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: d95.z.e():long");
    }

    @Override // l75.k0
    public android.database.Cursor f(java.lang.String str, java.lang.String[] strArr, int i17) {
        iz5.a.g("sql is null ", !com.tencent.mm.sdk.platformtools.t8.K0(str));
        boolean N = N();
        com.tencent.wcdb.compat.SQLiteDatabase sQLiteDatabase = this.f227718a;
        if (N) {
            f227715f.b(sQLiteDatabase, (com.tencent.wcdb.DatabaseUtils.getSqlStatementType(str) == 1 ? 32768 : 0) | 1, str);
        }
        if (i17 != 4) {
            return B(str, strArr);
        }
        e95.t tVar = new e95.t(sQLiteDatabase.getInnerDB(), str, strArr, null, null);
        L(tVar, str);
        return tVar;
    }

    public void finalize() {
        l75.i0 i0Var = this.f227720c;
        if (i0Var != null) {
            i0Var.p();
        }
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(G());
        java.lang.Long valueOf2 = java.lang.Long.valueOf(java.lang.Thread.currentThread().getId());
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.w("MicroMsg.SQLiteWrapper", "begin close db, inTrans:%b thr:%d {%s}", valueOf, valueOf2, new com.tencent.mm.sdk.platformtools.z3());
        fp.j jVar = new fp.j();
        this.f227718a.close();
        jVar.a();
    }

    @Override // l75.k0
    public l75.e1 g() {
        return f227715f.a();
    }

    @Override // l75.k0
    public java.lang.String getPath() {
        return this.f227718a.getPath();
    }

    @Override // l75.k0
    public long h(long j17) {
        return k() - j17;
    }

    @Override // l75.k0
    public boolean j(java.lang.String str, java.lang.String str2, java.lang.Object[] objArr, com.tencent.wcdb.support.CancellationSignal cancellationSignal) {
        iz5.a.g("sql is null ", !com.tencent.mm.sdk.platformtools.t8.K0(str2));
        try {
            boolean N = N();
            com.tencent.wcdb.compat.SQLiteDatabase sQLiteDatabase = this.f227718a;
            if (N) {
                f227715f.b(sQLiteDatabase, 32769, str2);
            }
            sQLiteDatabase.execSQL(str2, objArr, cancellationSignal != null ? new p75.c(cancellationSignal, this).f352623b : null);
            return true;
        } catch (java.lang.RuntimeException e17) {
            O(e17);
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SQLiteWrapper", e17, "Execute failed.", new java.lang.Object[0]);
            java.lang.String message = e17.getMessage();
            com.tencent.mars.xlog.Log.e("MicroMsg.SQLiteWrapper", "execSQL Error :" + message);
            if (message == null || !message.contains("no such table")) {
                return false;
            }
            l75.j0 j0Var = this.f227721d;
            if (j0Var != null) {
                ((gm0.b0$$b) j0Var).a();
            }
            throw e17;
        }
    }

    @Override // l75.k0
    public long k() {
        com.tencent.mm.vfs.x1 m17;
        if (getPath() == null) {
            return 0L;
        }
        com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(getPath());
        java.lang.String str = a17.f213279f;
        if (str != null) {
            java.lang.String l17 = com.tencent.mm.vfs.e8.l(str, false, false);
            if (!str.equals(l17)) {
                a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
            }
        }
        com.tencent.mm.vfs.z2 m18 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
        if (m18.a() && (m17 = m18.f213266a.m(m18.f213267b)) != null) {
            return m17.f213233c;
        }
        return 0L;
    }

    @Override // l75.k0
    public long l(java.lang.String str, java.lang.String str2, android.content.ContentValues contentValues) {
        try {
            boolean N = N();
            com.tencent.wcdb.compat.SQLiteDatabase sQLiteDatabase = this.f227718a;
            if (N) {
                f227715f.b(sQLiteDatabase, 32769, str);
            }
            return sQLiteDatabase.insertOrThrow(str, str2, contentValues);
        } catch (java.lang.RuntimeException e17) {
            O(e17);
            com.tencent.mars.xlog.Log.e("MicroMsg.SQLiteWrapper", "Insert failed: " + e17.getMessage());
            return -1L;
        }
    }

    @Override // l75.k0
    public long m(java.lang.String str, java.lang.String str2, android.content.ContentValues contentValues) {
        try {
            boolean N = N();
            com.tencent.wcdb.compat.SQLiteDatabase sQLiteDatabase = this.f227718a;
            if (N) {
                f227715f.b(sQLiteDatabase, 32769, str);
            }
            return sQLiteDatabase.replaceOrThrow(str, str2, contentValues);
        } catch (java.lang.RuntimeException e17) {
            O(e17);
            com.tencent.mars.xlog.Log.e("MicroMsg.SQLiteWrapper", "Replace failed: " + e17.getMessage());
            return -1L;
        }
    }

    @Override // l75.k0
    public boolean n() {
        return d95.q.f227703c;
    }

    @Override // l75.k0
    public android.database.Cursor o(com.tencent.wcdb.database.SQLiteDatabase.CursorFactory cursorFactory, java.lang.String str, java.lang.String[] strArr, java.lang.String str2, com.tencent.wcdb.support.CancellationSignal cancellationSignal) {
        try {
            boolean N = N();
            com.tencent.wcdb.compat.SQLiteDatabase sQLiteDatabase = this.f227718a;
            if (N) {
                f227715f.b(sQLiteDatabase, (com.tencent.wcdb.DatabaseUtils.getSqlStatementType(str) == 1 ? 32768 : 0) | 1, str);
            }
            android.database.Cursor rawQuery = sQLiteDatabase.rawQuery(str, strArr, cancellationSignal != null ? new p75.c(cancellationSignal, this).f352623b : null);
            L(rawQuery, str);
            return rawQuery;
        } catch (java.lang.RuntimeException e17) {
            O(e17);
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SQLiteWrapper", e17, "Query failed.", new java.lang.Object[0]);
            return d95.d.a();
        }
    }

    @Override // l75.k0
    public int p(java.lang.String str, android.content.ContentValues contentValues, java.lang.String str2, java.lang.String[] strArr) {
        try {
            boolean N = N();
            com.tencent.wcdb.compat.SQLiteDatabase sQLiteDatabase = this.f227718a;
            if (N) {
                f227715f.b(sQLiteDatabase, 32769, str);
            }
            return sQLiteDatabase.update(str, contentValues, str2, strArr);
        } catch (java.lang.RuntimeException e17) {
            O(e17);
            com.tencent.mars.xlog.Log.e("MicroMsg.SQLiteWrapper", "Update failed: " + e17.getMessage());
            return -1;
        }
    }

    @Override // l75.k0
    public long q() {
        return this.f227718a.getPageSize();
    }

    @Override // l75.k0
    public android.database.Cursor s(java.lang.String str, java.lang.String[] strArr) {
        iz5.a.g("sql is null ", !com.tencent.mm.sdk.platformtools.t8.K0(str));
        if (N()) {
            f227715f.b(this.f227718a, (com.tencent.wcdb.DatabaseUtils.getSqlStatementType(str) == 1 ? 32768 : 0) | 1, str);
        }
        return new d95.y(new d95.z$$a(this, str, strArr));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ae  */
    @Override // l75.k0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean u() {
        /*
            r12 = this;
            java.lang.String r0 = "vacuum error, t = "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "vacuum, dbPath = "
            r1.<init>(r2)
            java.lang.String r2 = r12.getPath()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "MicroMsg.SQLiteWrapper"
            com.tencent.mars.xlog.Log.i(r2, r1)
            boolean r1 = r12.f227722e
            r3 = 0
            if (r1 == 0) goto L26
            java.lang.String r0 = "isVacuuming"
            com.tencent.mars.xlog.Log.i(r2, r0)
            return r3
        L26:
            r1 = 1
            android.os.StatFs r4 = new android.os.StatFs     // Catch: java.lang.Throwable -> L77
            java.io.File r5 = android.os.Environment.getDataDirectory()     // Catch: java.lang.Throwable -> L77
            java.lang.String r5 = r5.getPath()     // Catch: java.lang.Throwable -> L77
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L77
            android.os.StatFs r5 = new android.os.StatFs     // Catch: java.lang.Throwable -> L77
            java.lang.String r6 = lp0.b.e0()     // Catch: java.lang.Throwable -> L77
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L77
            long r6 = r4.getAvailableBytes()
            long r4 = r5.getAvailableBytes()
            long r8 = r12.k()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "dataFreeSpace = "
            r10.<init>(r11)
            r10.append(r6)
            java.lang.String r11 = ", sdcardFreeSpace = "
            r10.append(r11)
            r10.append(r4)
            java.lang.String r11 = ", dbFileSize = "
            r10.append(r11)
            r10.append(r8)
            java.lang.String r10 = r10.toString()
            com.tencent.mars.xlog.Log.i(r2, r10)
            r10 = 2
            long r8 = r8 * r10
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 <= 0) goto L77
            int r4 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r4 <= 0) goto L77
            r4 = r1
            goto L78
        L77:
            r4 = r3
        L78:
            if (r4 == 0) goto Lae
            r12.f227722e = r1
            java.lang.String r4 = "Vacuum Start"
            com.tencent.mars.xlog.Log.i(r2, r4)
            com.tencent.wcdb.compat.SQLiteDatabase r4 = r12.f227718a     // Catch: java.lang.Throwable -> L93
            com.tencent.wcdb.core.Database r4 = r4.getInnerDB()     // Catch: java.lang.Throwable -> L93
            r5 = 0
            r4.vacuum(r5)     // Catch: java.lang.Throwable -> L93
            r12.f227722e = r3
            java.lang.String r0 = "Vacuum Done"
            com.tencent.mars.xlog.Log.i(r2, r0)
            return r1
        L93:
            r1 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Laa
            r4.<init>(r0)     // Catch: java.lang.Throwable -> Laa
            java.lang.String r0 = r1.getMessage()     // Catch: java.lang.Throwable -> Laa
            r4.append(r0)     // Catch: java.lang.Throwable -> Laa
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Throwable -> Laa
            com.tencent.mars.xlog.Log.e(r2, r0)     // Catch: java.lang.Throwable -> Laa
            r12.f227722e = r3
            return r3
        Laa:
            r0 = move-exception
            r12.f227722e = r3
            throw r0
        Lae:
            java.lang.String r0 = "isStorageAvailableSatisfyVacuum = false"
            com.tencent.mars.xlog.Log.e(r2, r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: d95.z.u():boolean");
    }

    @Override // l75.k0
    public long v(java.lang.String str, java.lang.String str2, android.content.ContentValues contentValues) {
        boolean N = N();
        com.tencent.wcdb.compat.SQLiteDatabase sQLiteDatabase = this.f227718a;
        if (N) {
            f227715f.b(sQLiteDatabase, 32769, str);
        }
        return sQLiteDatabase.insertOrThrow(str, str2, contentValues);
    }

    @Override // l75.k0
    public int w(java.lang.Long l17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.SQLiteWrapper", "endTransaction thr:%d ticket:(%d) db:%b, success=%b", java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()), l17, java.lang.Boolean.valueOf(isOpen()), java.lang.Boolean.TRUE);
        boolean N = N();
        com.tencent.wcdb.compat.SQLiteDatabase sQLiteDatabase = this.f227718a;
        if (N) {
            f227715f.b(sQLiteDatabase, 32769, "COMMIT;");
        }
        try {
            sQLiteDatabase.setTransactionSuccessful();
            sQLiteDatabase.endTransaction();
            l75.i0 i0Var = this.f227720c;
            if (i0Var != null) {
                i0Var.u();
            }
            return 1;
        } catch (java.lang.RuntimeException e17) {
            O(e17);
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SQLiteWrapper", e17, "End transaction failed.", new java.lang.Object[0]);
            return -1;
        }
    }

    @Override // l75.k0
    public void y(l75.j0 j0Var) {
        this.f227721d = j0Var;
    }

    @Override // l75.k0
    public p75.k z(java.lang.String str) {
        return new p75.e0(null, this.f227718a.compileStatement(str));
    }
}
