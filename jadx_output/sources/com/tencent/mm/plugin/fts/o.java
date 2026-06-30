package com.tencent.mm.plugin.fts;

/* loaded from: classes12.dex */
public class o implements o13.t {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.wcdb.database.SQLiteDatabase f137777a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.wcdb.database.SQLiteStatement f137778b;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.wcdb.database.SQLiteStatement f137779c;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.wcdb.database.SQLiteStatement f137780d;

    public o(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSIndexDB", "Create SearchStorage: %s", str + "FTS5IndexMicroMsg_encrypt.db");
        if (this.f137777a != null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FTS.FTSIndexDB", "before initDB, pre DB is not close, why?");
            this.f137777a.close();
        }
        java.lang.String o17 = new com.tencent.mm.vfs.r6(str, "FTS5IndexMicroMsg_encrypt.db").o();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        gm0.j1.i();
        com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
        com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_FTS_MASTER_DB_ENCRYPT_PWD_STRING_SYNC;
        java.lang.String str2 = (java.lang.String) c17.m(u3Var, "");
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            str2 = kk.k.g((gm0.j1.b().j() + wo.w0.g(true) + c01.z1.r()).getBytes()).substring(0, 7);
            gm0.j1.i();
            gm0.j1.u().c().x(u3Var, str2);
        }
        com.tencent.wcdb.database.SQLiteDatabase openOrCreateDatabase = com.tencent.wcdb.database.SQLiteDatabase.openOrCreateDatabase(o17, str2.getBytes(), (com.tencent.wcdb.database.SQLiteDatabase.CursorFactory) null, ((com.tencent.mm.plugin.fts.d0) i95.n0.c(com.tencent.mm.plugin.fts.d0.class)).f137388p);
        this.f137777a = openOrCreateDatabase;
        d95.f fVar = new d95.f();
        fVar.f227679b = openOrCreateDatabase;
        ((java.util.concurrent.ConcurrentHashMap) d95.f.f227663i).put(fVar.k(), fVar);
        d95.f.d(fVar);
        java.lang.String g17 = wo.w0.g(true);
        gm0.j1.i();
        byte[] h17 = kk.k.h((g17 + gm0.j1.b().h()).getBytes());
        com.tencent.wcdb.database.SQLiteDatabase sQLiteDatabase = this.f137777a;
        long acquireNativeConnectionHandle = sQLiteDatabase.acquireNativeConnectionHandle("initFTS", false, false);
        com.tencent.mm.vfs.r6[] G = new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a("/system/usr/icu")).G();
        if (G != null) {
            for (com.tencent.mm.vfs.r6 r6Var : G) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSIndexDB", "icu file %s", r6Var.getName());
            }
        }
        com.tencent.mm.plugin.fts.jni.FTSJNIUtils.nativeInitFts(acquireNativeConnectionHandle, h17);
        sQLiteDatabase.releaseNativeConnection(acquireNativeConnectionHandle, null);
        this.f137777a.rawQuery("PRAGMA journal_mode=WAL;", null).close();
        this.f137777a.execSQL("PRAGMA synchronous=NORMAL;");
        this.f137777a.execSQL(java.lang.String.format("CREATE TABLE IF NOT EXISTS %s (type INTEGER PRIMARY KEY, version INTEGER);", "FTS5IndexVersion"));
        this.f137778b = this.f137777a.compileStatement(java.lang.String.format("SELECT version FROM %s WHERE type=?;", "FTS5IndexVersion"));
        this.f137779c = this.f137777a.compileStatement(java.lang.String.format("INSERT OR REPLACE INTO %s (type, version) VALUES (?, ?);", "FTS5IndexVersion"));
        this.f137780d = this.f137777a.compileStatement(java.lang.String.format("DELETE FROM %s WHERE type=?", "FTS5IndexVersion"));
        com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSIndexDB", "initDB index params %d %s %s supportICU %b finalStartBuildMessageTimestamp %s finalStartBuildMessageClientVersion %s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis), com.tencent.mm.sdk.platformtools.t8.i0(com.tencent.mm.vfs.w6.k(o17), 2.0d), wo.w0.g(true), java.lang.Boolean.FALSE, k35.m1.d(com.tencent.tav.coremedia.TimeUtil.YYYY2MM2DD_HH1MM1SS, k(-310L, 0L) / 1000), java.lang.Integer.toHexString((int) k(-310L, 0L)));
    }

    public static final void f() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        gm0.j1.i();
        sb6.append(gm0.j1.u().h());
        sb6.append("FTS5IndexMicroMsg_encrypt.db");
        java.lang.String sb7 = sb6.toString();
        java.lang.String[] strArr = {"", "-journal", "-wal", "-shm"};
        for (int i17 = 0; i17 < 4; i17++) {
            java.lang.String str = sb7 + strArr[i17];
            com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSIndexDB", "deleteIndexDB %s %s", str, java.lang.Boolean.valueOf(com.tencent.mm.vfs.w6.j(str)));
            com.tencent.mm.vfs.w6.h(str);
        }
    }

    public synchronized void a() {
        com.tencent.wcdb.database.SQLiteDatabase sQLiteDatabase = this.f137777a;
        if (sQLiteDatabase != null && !sQLiteDatabase.inTransaction()) {
            this.f137777a.beginTransaction();
        }
    }

    public boolean b(int i17, int i18) {
        int k17 = (!n("FTS5IndexVersion") || this.f137778b == null) ? 0 : (int) k(i17, 0L);
        com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSIndexDB", "type=%d | dbVersion=%d | targetVersion=%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(k17), java.lang.Integer.valueOf(i18));
        return k17 == i18;
    }

    public void c() {
        java.lang.Object[] objArr = new java.lang.Object[2];
        com.tencent.wcdb.database.SQLiteDatabase sQLiteDatabase = this.f137777a;
        objArr[0] = sQLiteDatabase;
        objArr[1] = java.lang.Boolean.valueOf(sQLiteDatabase != null ? sQLiteDatabase.isOpen() : false);
        com.tencent.mars.xlog.Log.w("MicroMsg.FTS.FTSIndexDB", "close db:%s isOpen:%b ", objArr);
        com.tencent.wcdb.database.SQLiteDatabase sQLiteDatabase2 = this.f137777a;
        if (sQLiteDatabase2 == null || !sQLiteDatabase2.isOpen()) {
            return;
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.FTS.FTSIndexDB", "close in trans :%b ", java.lang.Boolean.valueOf(this.f137777a.inTransaction()));
        while (this.f137777a.inTransaction()) {
            this.f137777a.endTransaction();
        }
        this.f137778b.close();
        this.f137779c.close();
        this.f137777a.close();
        this.f137777a = null;
    }

    public synchronized void d() {
        com.tencent.wcdb.database.SQLiteDatabase sQLiteDatabase = this.f137777a;
        if (sQLiteDatabase != null && sQLiteDatabase.inTransaction()) {
            this.f137777a.setTransactionSuccessful();
            this.f137777a.endTransaction();
        }
    }

    public com.tencent.wcdb.database.SQLiteStatement e(java.lang.String str) {
        return this.f137777a.compileStatement(str);
    }

    public void g(long j17) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        this.f137777a.execSQL(java.lang.String.format("UPDATE %s SET status=? WHERE entity_id=?;", "FTS5MetaMessage"), new java.lang.String[]{java.lang.String.valueOf(-1), java.lang.String.valueOf(j17)});
        j(java.lang.String.format("DELETE FROM %s WHERE rowid IN (SELECT docid FROM %s WHERE entity_id=?);", "FTS5IndexMessage", "FTS5MetaMessage"), new java.lang.String[]{java.lang.String.valueOf(j17)});
        j(java.lang.String.format("DELETE FROM %s WHERE entity_id=?", "FTS5MetaMessage"), new java.lang.String[]{java.lang.String.valueOf(j17)});
        com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSIndexDB", "deleteMsgById use time %d msgId %d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis), java.lang.Long.valueOf(j17));
    }

    public void h(java.lang.String str, long j17) {
        java.lang.String str2;
        if (!com.tencent.mm.storage.z3.p4(str) && !com.tencent.mm.storage.z3.z3(str)) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            j(java.lang.String.format("DELETE FROM %s WHERE rowid IN (SELECT docid FROM %s WHERE aux_index=? AND timestamp <= ?);", "FTS5IndexMessage", "FTS5MetaMessage"), new java.lang.String[]{str, java.lang.String.valueOf(j17)});
            j(java.lang.String.format("DELETE FROM %s WHERE aux_index=? AND timestamp <= ?", "FTS5MetaMessage"), new java.lang.String[]{str, java.lang.String.valueOf(j17)});
            long currentTimeMillis2 = java.lang.System.currentTimeMillis() - currentTimeMillis;
            com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSIndexDB", "deleteTalkerMsgByTimestamp use time %d talker %s timestamp %s", java.lang.Long.valueOf(currentTimeMillis2), str, k35.m1.d(com.tencent.tav.coremedia.TimeUtil.YYYY2MM2DD_HH1MM1SS, j17 / 1000));
            jx3.f fVar = jx3.f.INSTANCE;
            fVar.idkeyStat(729L, 10L, 1L, false);
            if (currentTimeMillis2 > com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT) {
                fVar.idkeyStat(79L, 13L, 1L, false);
                return;
            } else if (currentTimeMillis2 > 1000) {
                fVar.idkeyStat(79L, 12L, 1L, false);
                return;
            } else {
                if (currentTimeMillis2 > 500) {
                    fVar.idkeyStat(79L, 11L, 1L, false);
                    return;
                }
                return;
            }
        }
        if (com.tencent.mm.storage.z3.p4(str)) {
            str2 = "opencustomerservicemsg";
        } else if (!com.tencent.mm.storage.z3.z3(str)) {
            return;
        } else {
            str2 = "appbrandcustomerservicemsg";
        }
        long currentTimeMillis3 = java.lang.System.currentTimeMillis();
        j(java.lang.String.format("DELETE FROM %s WHERE rowid IN (SELECT docid FROM %s WHERE aux_index=? AND talker=? AND timestamp <= ?);", "FTS5IndexMessage", "FTS5MetaMessage"), new java.lang.String[]{str2, str, java.lang.String.valueOf(j17)});
        j(java.lang.String.format("DELETE FROM %s WHERE aux_index=? AND talker=? AND timestamp <= ?", "FTS5MetaMessage"), new java.lang.String[]{str2, str, java.lang.String.valueOf(j17)});
        long currentTimeMillis4 = java.lang.System.currentTimeMillis() - currentTimeMillis3;
        com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSIndexDB", "deleteKefuTalkerMsgByTimestamp use time %d talker %s timestamp %s", java.lang.Long.valueOf(currentTimeMillis4), str2, k35.m1.d(com.tencent.tav.coremedia.TimeUtil.YYYY2MM2DD_HH1MM1SS, j17 / 1000));
        jx3.f fVar2 = jx3.f.INSTANCE;
        fVar2.idkeyStat(729L, 10L, 1L, false);
        if (currentTimeMillis4 > com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT) {
            fVar2.idkeyStat(79L, 13L, 1L, false);
        } else if (currentTimeMillis4 > 1000) {
            fVar2.idkeyStat(79L, 12L, 1L, false);
        } else if (currentTimeMillis4 > 500) {
            fVar2.idkeyStat(79L, 11L, 1L, false);
        }
    }

    public void i(java.lang.String str) {
        this.f137777a.execSQL(str);
    }

    public void j(java.lang.String str, java.lang.Object[] objArr) {
        this.f137777a.execSQL(str, objArr);
    }

    public long k(long j17, long j18) {
        this.f137778b.bindLong(1, j17);
        try {
            return this.f137778b.simpleQueryForLong();
        } catch (com.tencent.wcdb.database.SQLiteDoneException unused) {
            return j18;
        }
    }

    public l75.k0 l() {
        return new w13.l(this.f137777a);
    }

    public boolean m() {
        com.tencent.wcdb.database.SQLiteDatabase sQLiteDatabase = this.f137777a;
        return sQLiteDatabase != null && sQLiteDatabase.inTransaction();
    }

    public boolean n(java.lang.String str) {
        com.tencent.wcdb.Cursor rawQuery = this.f137777a.rawQuery("SELECT 1 FROM sqlite_master WHERE type='table' AND name=?;", new java.lang.String[]{str});
        boolean moveToNext = rawQuery.moveToNext();
        rawQuery.close();
        return moveToNext;
    }

    public android.database.Cursor o(java.lang.String str, java.lang.String[] strArr) {
        return new com.tencent.mm.plugin.fts.e(this.f137777a.rawQueryWithFactory(com.tencent.wcdb.database.SQLiteDirectCursor.FACTORY, str, strArr, null));
    }

    public synchronized void p() {
        com.tencent.wcdb.database.SQLiteDatabase sQLiteDatabase = this.f137777a;
        if (sQLiteDatabase != null && sQLiteDatabase.isOpen() && this.f137777a.inTransaction()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSIndexDB", "rollback");
            try {
                this.f137777a.endTransaction();
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FTS.FTSIndexDB", e17, "occur error \n%s", e17);
            }
        }
    }

    public void q(long j17, long j18) {
        this.f137779c.bindLong(1, j17);
        this.f137779c.bindLong(2, j18);
        this.f137779c.execute();
    }
}
