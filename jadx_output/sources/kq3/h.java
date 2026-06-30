package kq3;

/* loaded from: classes12.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.wcdb.database.SQLiteDatabase f311273a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.wcdb.database.SQLiteStatement f311274b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.wcdb.database.SQLiteStatement f311275c;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.wcdb.database.SQLiteStatement f311276d;

    public h(java.lang.String str) {
        if (this.f311273a != null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.Priority.PriorityDB", "before initDB, pre DB is not close, why?");
            this.f311273a.close();
        }
        java.lang.String o17 = new com.tencent.mm.vfs.r6(str, "MicroMsgPriority.db").o();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.wcdb.database.SQLiteDatabase openOrCreateDatabase = com.tencent.wcdb.database.SQLiteDatabase.openOrCreateDatabase(o17, kk.k.g((gm0.j1.b().j() + c01.z1.r() + wo.w0.g(true)).getBytes()).substring(0, 7).getBytes(), (com.tencent.wcdb.database.SQLiteDatabase.CursorFactory) null, (com.tencent.wcdb.DatabaseErrorHandler) null);
        this.f311273a = openOrCreateDatabase;
        d95.f fVar = new d95.f();
        fVar.f227679b = openOrCreateDatabase;
        ((java.util.concurrent.ConcurrentHashMap) d95.f.f227663i).put(fVar.k(), fVar);
        d95.f.d(fVar);
        com.tencent.wcdb.database.SQLiteDatabase sQLiteDatabase = this.f311273a;
        long acquireNativeConnectionHandle = sQLiteDatabase.acquireNativeConnectionHandle("initPriority", false, false);
        com.tencent.mm.plugin.priority.model.PriorityJni.nativeInit(acquireNativeConnectionHandle);
        sQLiteDatabase.releaseNativeConnection(acquireNativeConnectionHandle, null);
        this.f311273a.execSQL(java.lang.String.format("CREATE TABLE IF NOT EXISTS %s (type INTEGER PRIMARY KEY, version INTEGER);", "PriorityConfig"));
        this.f311274b = this.f311273a.compileStatement(java.lang.String.format("SELECT version FROM %s WHERE type=?;", "PriorityConfig"));
        this.f311275c = this.f311273a.compileStatement(java.lang.String.format("INSERT OR REPLACE INTO %s (type, version) VALUES (?, ?);", "PriorityConfig"));
        this.f311276d = this.f311273a.compileStatement(java.lang.String.format("DELETE FROM %s WHERE type=?", "PriorityConfig"));
        com.tencent.mars.xlog.Log.i("MicroMsg.Priority.PriorityDB", "initDB index params %d %s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis), com.tencent.mm.sdk.platformtools.t8.i0(com.tencent.mm.vfs.w6.k(o17), 100.0d));
    }

    public com.tencent.wcdb.database.SQLiteStatement a(java.lang.String str) {
        return this.f311273a.compileStatement(str);
    }

    public void b(java.lang.String str) {
        this.f311273a.execSQL(java.lang.String.format("DROP TABLE %s", str));
    }

    public void c(java.lang.String str) {
        this.f311273a.execSQL(str);
    }

    public void d(java.lang.String str, java.lang.Object[] objArr) {
        this.f311273a.execSQL(str, objArr);
    }

    public long e(long j17, long j18) {
        com.tencent.wcdb.database.SQLiteStatement sQLiteStatement = this.f311274b;
        sQLiteStatement.bindLong(1, j17);
        try {
            return sQLiteStatement.simpleQueryForLong();
        } catch (com.tencent.wcdb.database.SQLiteDoneException unused) {
            return j18;
        }
    }

    public int f(java.lang.String str) {
        com.tencent.wcdb.Cursor rawQuery = this.f311273a.rawQuery(java.lang.String.format("SELECT count(*) FROM %s;", str), null);
        try {
            if (rawQuery.moveToNext()) {
                return rawQuery.getInt(0);
            }
            return 0;
        } finally {
            rawQuery.close();
        }
    }

    public boolean g(java.lang.String str) {
        com.tencent.wcdb.Cursor rawQuery = this.f311273a.rawQuery("SELECT 1 FROM sqlite_master WHERE type='table' AND name=?;", new java.lang.String[]{str});
        boolean moveToNext = rawQuery.moveToNext();
        rawQuery.close();
        return moveToNext;
    }

    public android.database.Cursor h(java.lang.String str, java.lang.String[] strArr) {
        return this.f311273a.rawQueryWithFactory(com.tencent.wcdb.database.SQLiteDirectCursor.FACTORY, str, strArr, null);
    }

    public void i(long j17, long j18) {
        com.tencent.wcdb.database.SQLiteStatement sQLiteStatement = this.f311275c;
        sQLiteStatement.bindLong(1, j17);
        sQLiteStatement.bindLong(2, j18);
        sQLiteStatement.execute();
    }
}
