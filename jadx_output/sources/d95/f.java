package d95;

/* loaded from: classes12.dex */
public class f implements com.tencent.wcdb.database.SQLiteTrace, com.tencent.wcdb.DatabaseErrorHandler {

    /* renamed from: j, reason: collision with root package name */
    public static final android.content.SharedPreferences f227664j;

    /* renamed from: k, reason: collision with root package name */
    public static final int f227665k;

    /* renamed from: m, reason: collision with root package name */
    public static final com.tencent.wcdb.database.SQLiteCheckpointListener f227667m;

    /* renamed from: o, reason: collision with root package name */
    public static boolean f227669o;

    /* renamed from: p, reason: collision with root package name */
    public static boolean f227670p;

    /* renamed from: q, reason: collision with root package name */
    public static com.tencent.wcdb.database.SQLiteTrace f227671q;

    /* renamed from: r, reason: collision with root package name */
    public static com.tencent.wcdb.database.SQLiteTrace f227672r;

    /* renamed from: s, reason: collision with root package name */
    public static final jx3.b f227673s;

    /* renamed from: t, reason: collision with root package name */
    public static f95.e f227674t;

    /* renamed from: u, reason: collision with root package name */
    public static final int[] f227675u;

    /* renamed from: v, reason: collision with root package name */
    public static final java.util.regex.Pattern f227676v;

    /* renamed from: w, reason: collision with root package name */
    public static final java.lang.String[] f227677w;

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.wcdb.database.SQLiteDatabase f227678a = null;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.wcdb.database.SQLiteDatabase f227679b = null;

    /* renamed from: c, reason: collision with root package name */
    public boolean f227680c = false;

    /* renamed from: d, reason: collision with root package name */
    public volatile java.lang.String f227681d = "";

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashMap f227682e;

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.Set f227660f = java.util.Collections.synchronizedSet(new java.util.HashSet());

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.ThreadLocal f227661g = new java.lang.ThreadLocal();

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.Map f227662h = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: i, reason: collision with root package name */
    public static final java.util.Map f227663i = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: l, reason: collision with root package name */
    public static final com.tencent.wcdb.database.SQLiteCipherSpec f227666l = new com.tencent.wcdb.database.SQLiteCipherSpec().setPageSize(1024).setSQLCipherVersion(1);

    /* renamed from: n, reason: collision with root package name */
    public static final l75.e1 f227668n = new l75.e1();

    static {
        com.tencent.wcdb.database.SQLiteGlobal.loadLib();
        com.tencent.wcdb.database.SQLiteDebug.setIOTraceFlags(0);
        com.tencent.wcdb.CursorWindow.windowSize(com.tencent.youtu.sdkkitframework.common.ErrorCode.YT_SDK_PARAM_ERROR);
        android.content.SharedPreferences sharedPreferences = com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("db_config", 0);
        f227664j = sharedPreferences;
        f227665k = sharedPreferences.getInt("flags", 0);
        sharedPreferences.getInt("acp", 100);
        f227667m = new d95.g(null, 1, Integer.MAX_VALUE, com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT);
        ((aq1.q0) ((a25.q) i95.n0.c(a25.q.class))).getClass();
        mm.d0.f328475a.b(new d95.h());
        f227673s = new jx3.b(463);
        f227675u = new int[]{27, 39, 24, 36, 27, 39, 48, 54, 33, 45, 30, 42, 33, 45, 51, 57};
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        f227676v = z65.c.a() ? java.util.regex.Pattern.compile("^\\s*create\\s+(?:unique\\s+)?index\\s+(?:if\\s+not\\s+exists\\s+)?(\\S+)\\s+on\\s+(\\S+)\\s*\\(", 66) : null;
        f227677w = new java.lang.String[]{"messagecreatetaklertimeindex", "messagecreatetaklertypetimeindex", "messagecreatetimeindex", "messageidindex", "messagemessagetalkerflagmsgseqindex", "messagemessagetalkermsgseqindex", "messagesendcreatetimeindex", "messagesvridindex", "messagetalkercreatetimeissendindex", "messagetalkeridtypeindex", "messagetalkerstatusindex", "messagetalkersvridindex", "messagetalkertypeindex"};
    }

    public f() {
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        this.f227682e = z65.c.a() ? new java.util.HashMap() : null;
    }

    public static void a() {
        final java.lang.Throwable lastCorruptionException = com.tencent.wcdb.database.SQLiteDebug.getLastCorruptionException();
        if (lastCorruptionException == null) {
            return;
        }
        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MMDataBase", lastCorruptionException, "Database corrupted, force crash.", new java.lang.Object[0]);
        try {
            ((ku5.t0) ku5.t0.f312615d).m(new java.util.concurrent.Callable() { // from class: d95.f$$a
                @Override // java.util.concurrent.Callable
                public final java.lang.Object call() {
                    java.lang.Throwable th6 = lastCorruptionException;
                    if (th6 instanceof java.lang.RuntimeException) {
                        throw ((java.lang.RuntimeException) th6);
                    }
                    throw new java.lang.RuntimeException(th6);
                }
            }, 1500L).get();
        } catch (java.lang.Exception unused) {
        }
    }

    public static void d(d95.f fVar) {
        d95.l lVar = new d95.l(fVar);
        com.tencent.mars.xlog.Log.i("MicroMsg.MMDataBase", "vacuumedSet = " + f227660f);
        com.tencent.mars.xlog.Log.i("MicroMsg.MMDataBase", "db.getPath() = " + fVar.k());
        ((ku5.t0) ku5.t0.f312615d).l(new d95.m(fVar, lVar), com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT, "vacuum-task");
    }

    public static boolean m(java.lang.String str) {
        boolean z17 = false;
        if (!str.endsWith("EnMicroMsg.db")) {
            return false;
        }
        boolean z18 = true;
        if (!com.tencent.mm.vfs.w6.j(lp0.b.e0() + "/AsyncCP.flag")) {
            int i17 = com.tencent.mm.sdk.platformtools.o4.L().getInt("clicfg_wcdb_async_checkpoint", 0);
            long k17 = com.tencent.mm.vfs.w6.k(str.concat("-wal"));
            com.tencent.mars.xlog.Log.i("MicroMsg.MMDataBase", "Async value: %d, WAL size: %d", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(k17));
            if (k17 > 33554432) {
                com.tencent.mm.app.p5.b(21019, 0, java.lang.Long.valueOf(k17), 66001);
            }
            if (i17 == 1 || (i17 == 2 && k17 > 33554432)) {
                z17 = true;
            }
            z18 = z17;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MMDataBase", "Async checkpoint enabled: " + z18);
        return z18;
    }

    public static boolean n() {
        return android.os.Looper.myLooper() == android.os.Looper.getMainLooper();
    }

    public static void q() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MMDataBase", "markCorruptIgnore, thread: " + java.lang.Thread.currentThread());
        f227661g.set(java.lang.Boolean.TRUE);
    }

    public static void r(java.lang.String str) {
        com.tencent.mm.vfs.z7 z7Var;
        com.tencent.mm.vfs.z7 z7Var2;
        com.tencent.mm.vfs.x1 m17;
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(str));
        com.tencent.mm.vfs.r6 s17 = r6Var.s();
        java.lang.String name = r6Var.getName();
        com.tencent.mm.vfs.r6 s18 = r6Var.s();
        java.lang.String l17 = com.tencent.mm.vfs.e8.l("corrupted", false, true);
        com.tencent.mm.vfs.z7 z7Var3 = s18 == null ? com.tencent.mm.vfs.z7.f213276i : s18.f213166d;
        if (l17 != null && !l17.isEmpty()) {
            java.lang.String str2 = z7Var3.f213279f;
            z7Var3 = new com.tencent.mm.vfs.z7(z7Var3.f213277d, z7Var3.f213278e, str2 + '/' + l17, z7Var3.f213280g, z7Var3.f213281h);
        }
        com.tencent.mm.vfs.z2 m18 = com.tencent.mm.vfs.a3.f212781a.m(z7Var3, null);
        if (m18.a()) {
            m18.f213266a.r(m18.f213267b);
        }
        java.lang.String l18 = com.tencent.mm.vfs.e8.l(name, false, true);
        if (l18 == null || l18.isEmpty()) {
            z7Var = z7Var3;
        } else {
            java.lang.String str3 = z7Var3.f213279f;
            z7Var = new com.tencent.mm.vfs.z7(z7Var3.f213277d, z7Var3.f213278e, str3 + '/' + l18, z7Var3.f213280g, z7Var3.f213281h);
        }
        long C = r6Var.C();
        com.tencent.mm.vfs.z2 m19 = com.tencent.mm.vfs.a3.f212781a.m(z7Var, null);
        long j17 = 0;
        if (m19.a() && (m17 = m19.f213266a.m(m19.f213267b)) != null) {
            j17 = m17.f213233c;
        }
        long B = r6Var.B();
        try {
            B = java.lang.Math.min(android.system.Os.stat(str).st_atime * 1000, B);
        } catch (android.system.ErrnoException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMDataBase", "Cannot get access time: %s", e17);
        }
        java.lang.String[] strArr = {"", "-journal", "-wal", ".ini", ".sm", ".li"};
        if (C < j17 && C < 8388608 && java.lang.System.currentTimeMillis() - B < 259200000) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMDataBase", "Repeated corruption detected, delete corrupted. baseSize: %d, targetSize: %d, createTime: %d", java.lang.Long.valueOf(C), java.lang.Long.valueOf(j17), java.lang.Long.valueOf(B));
            for (int i17 = 0; i17 < 6; i17++) {
                java.lang.String l19 = com.tencent.mm.vfs.e8.l(name + strArr[i17], false, true);
                com.tencent.mm.vfs.z7 z7Var4 = s17 == null ? com.tencent.mm.vfs.z7.f213276i : s17.f213166d;
                if (l19 != null && !l19.isEmpty()) {
                    java.lang.String str4 = z7Var4.f213279f;
                    z7Var4 = new com.tencent.mm.vfs.z7(z7Var4.f213277d, z7Var4.f213278e, str4 + '/' + l19, z7Var4.f213280g, z7Var4.f213281h);
                }
                com.tencent.mm.vfs.AccessControlFileSystem.c(3, z7Var4);
                com.tencent.mm.vfs.z2 m27 = com.tencent.mm.vfs.a3.f212781a.m(z7Var4, null);
                if (m27.a()) {
                    m27.f213266a.d(m27.f213267b);
                }
                com.tencent.mm.vfs.AccessControlFileSystem.e(3);
            }
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MMDataBase", "Not repeated corruption, move and backup. baseSize: %d, targetSize: %d", java.lang.Long.valueOf(C), java.lang.Long.valueOf(j17));
        int i18 = 0;
        for (int i19 = 6; i18 < i19; i19 = 6) {
            java.lang.String str5 = strArr[i18];
            java.lang.String l27 = com.tencent.mm.vfs.e8.l(name + str5, false, true);
            com.tencent.mm.vfs.z7 z7Var5 = s17 == null ? com.tencent.mm.vfs.z7.f213276i : s17.f213166d;
            if (l27 != null && !l27.isEmpty()) {
                java.lang.String str6 = z7Var5.f213279f;
                z7Var5 = new com.tencent.mm.vfs.z7(z7Var5.f213277d, z7Var5.f213278e, str6 + '/' + l27, z7Var5.f213280g, z7Var5.f213281h);
            }
            com.tencent.mm.vfs.AccessControlFileSystem.c(9, z7Var5);
            java.lang.String l28 = com.tencent.mm.vfs.e8.l(name + str5, false, true);
            if (l28 == null || l28.isEmpty()) {
                z7Var2 = z7Var3;
            } else {
                java.lang.String str7 = z7Var3.f213279f;
                z7Var2 = new com.tencent.mm.vfs.z7(z7Var3.f213277d, z7Var3.f213278e, str7 + '/' + l28, z7Var3.f213280g, z7Var3.f213281h);
            }
            com.tencent.mm.vfs.z2 m28 = com.tencent.mm.vfs.a3.f212781a.m(z7Var5, null);
            com.tencent.mm.vfs.z2 m29 = com.tencent.mm.vfs.a3.f212781a.m(z7Var2, null);
            if (m28.a() && m29.a()) {
                try {
                    m29.f213266a.t(m29.f213267b, m28.f213266a, m28.f213267b);
                } catch (java.io.IOException unused) {
                }
            }
            com.tencent.mm.vfs.AccessControlFileSystem.e(9);
            i18++;
        }
    }

    public static d95.f s(java.lang.String str, java.lang.String str2, int i17, boolean z17) {
        byte[] bytes;
        com.tencent.wcdb.database.SQLiteCipherSpec sQLiteCipherSpec;
        int i18;
        try {
            com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(str + "-vfslog");
            com.tencent.mm.vfs.r6 r6Var2 = new com.tencent.mm.vfs.r6(str + "-vfslo1");
            if (r6Var.m() && r6Var.C() > 256) {
                r6Var.l();
            }
            if (r6Var2.m() && r6Var2.C() > 256) {
                r6Var2.l();
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MMDataBase", th6, "", new java.lang.Object[0]);
        }
        d95.f fVar = new d95.f();
        java.lang.String str3 = com.tencent.mm.sdk.platformtools.t8.K0(str) ? com.tencent.wcdb.database.SQLiteDatabaseConfiguration.MEMORY_DB_PATH : str;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            bytes = null;
            sQLiteCipherSpec = null;
        } else {
            bytes = str2.getBytes();
            sQLiteCipherSpec = f227666l;
        }
        if (z17 && d95.b.f227600a) {
            i18 = 805306368;
        } else {
            if (!d95.b.f227600a) {
                com.tencent.mm.vfs.w6.h(str + "-shm");
            }
            i18 = 268435456;
        }
        int i19 = i18;
        try {
            if (str3.endsWith("EnMicroMsg.db")) {
                fVar.f227678a = com.tencent.wcdb.database.SQLiteDatabase.openDatabase(str3, bytes, sQLiteCipherSpec, null, i19, fVar, 32);
            } else {
                fVar.f227678a = com.tencent.wcdb.database.SQLiteDatabase.openDatabase(str3, bytes, sQLiteCipherSpec, null, i19, fVar);
            }
            fVar.f227678a.setTraceCallback(fVar);
            if (m(str)) {
                fVar.f227678a.setCheckpointCallback(f227667m);
                com.tencent.mars.xlog.Log.i("MicroMsg.MMDataBase", "Enable async checkpointer for DB: " + fVar.k());
            }
            ((java.util.concurrent.ConcurrentHashMap) f227662h).put(fVar.k(), fVar);
            d(fVar);
            if (fVar.f227678a == null) {
                return null;
            }
            return fVar;
        } catch (com.tencent.wcdb.database.SQLiteException e17) {
            jx3.f fVar2 = jx3.f.INSTANCE;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("DB (");
            com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(str3);
            java.lang.String str4 = a17.f213279f;
            if (str4 != null) {
                java.lang.String l17 = com.tencent.mm.vfs.e8.l(str4, false, false);
                if (!str4.equals(l17)) {
                    a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
                }
            }
            java.lang.String str5 = a17.f213279f;
            int lastIndexOf = str5.lastIndexOf("/");
            if (lastIndexOf >= 0) {
                str5 = str5.substring(lastIndexOf + 1);
            }
            sb6.append(str5);
            sb6.append(") can't open: ");
            sb6.append(com.tencent.mm.sdk.platformtools.z3.c(e17));
            fVar2.i("DBCantOpen", sb6.toString(), null);
            throw e17;
        }
    }

    public static d95.f t(java.lang.String str, boolean z17) {
        int i17;
        d95.f fVar = new d95.f();
        if (str == null || str.length() == 0) {
            com.tencent.wcdb.database.SQLiteDatabase create = com.tencent.wcdb.database.SQLiteDatabase.create(null);
            fVar.f227679b = create;
            if (create == null) {
                return null;
            }
            return fVar;
        }
        if (z17 && d95.b.f227600a) {
            i17 = 805306368;
        } else {
            if (!d95.b.f227600a) {
                com.tencent.mm.vfs.w6.h(str.concat("-shm"));
            }
            i17 = 268435456;
        }
        try {
            com.tencent.wcdb.database.SQLiteDatabase openDatabase = com.tencent.wcdb.database.SQLiteDatabase.openDatabase(str, null, i17, fVar);
            fVar.f227679b = openDatabase;
            openDatabase.setTraceCallback(fVar);
            if (m(str)) {
                fVar.f227679b.setCheckpointCallback(f227667m);
                com.tencent.mars.xlog.Log.i("MicroMsg.MMDataBase", "Enable async checkpointer for DB: " + fVar.k());
            }
            ((java.util.concurrent.ConcurrentHashMap) f227663i).put(fVar.k(), fVar);
            d(fVar);
            if (fVar.f227679b == null) {
                return null;
            }
            return fVar;
        } catch (com.tencent.wcdb.database.SQLiteException e17) {
            jx3.f fVar2 = jx3.f.INSTANCE;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("DB (");
            com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(str);
            java.lang.String str2 = a17.f213279f;
            if (str2 != null) {
                java.lang.String l17 = com.tencent.mm.vfs.e8.l(str2, false, false);
                if (!str2.equals(l17)) {
                    a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
                }
            }
            java.lang.String str3 = a17.f213279f;
            int lastIndexOf = str3.lastIndexOf("/");
            if (lastIndexOf >= 0) {
                str3 = str3.substring(lastIndexOf + 1);
            }
            sb6.append(str3);
            sb6.append(") can't open: ");
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            sb6.append(com.tencent.mm.sdk.platformtools.z3.c(e17));
            fVar2.i("DBCantOpen", sb6.toString(), null);
            throw e17;
        }
    }

    public static void w() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MMDataBase", "removeCorruptIgnore, thread: " + java.lang.Thread.currentThread());
        f227661g.remove();
    }

    public void b() {
        com.tencent.wcdb.database.SQLiteDatabase sQLiteDatabase = this.f227678a;
        if (sQLiteDatabase == null) {
            sQLiteDatabase = this.f227679b;
        }
        if (n()) {
            f227668n.c(sQLiteDatabase, 32769, "BEGIN TRANSACTION;");
        }
        try {
            sQLiteDatabase.beginTransaction();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MMDataBase", e17, "", new java.lang.Object[0]);
        }
    }

    public void c() {
        try {
            com.tencent.wcdb.database.SQLiteDatabase sQLiteDatabase = this.f227678a;
            if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
                this.f227678a.close();
                this.f227678a = null;
            }
            com.tencent.wcdb.database.SQLiteDatabase sQLiteDatabase2 = this.f227679b;
            if (sQLiteDatabase2 != null && sQLiteDatabase2.isOpen()) {
                this.f227679b.close();
                this.f227679b = null;
            }
            ((java.util.concurrent.ConcurrentHashMap) f227662h).remove(k());
            ((java.util.concurrent.ConcurrentHashMap) f227663i).remove(k());
        } catch (java.lang.Exception e17) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.MMDataBase", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
        }
    }

    public void e() {
        com.tencent.wcdb.database.SQLiteDatabase sQLiteDatabase = this.f227678a;
        if (sQLiteDatabase == null) {
            sQLiteDatabase = this.f227679b;
        }
        if (n()) {
            f227668n.c(sQLiteDatabase, 32769, "COMMIT;");
        }
        try {
            sQLiteDatabase.setTransactionSuccessful();
            sQLiteDatabase.endTransaction();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MMDataBase", e17, "", new java.lang.Object[0]);
        }
    }

    public void f(java.lang.String str) {
        com.tencent.wcdb.database.SQLiteDatabase sQLiteDatabase = this.f227678a;
        if (sQLiteDatabase == null) {
            sQLiteDatabase = this.f227679b;
        }
        if (n()) {
            f227668n.c(sQLiteDatabase, 32769, str);
        }
        sQLiteDatabase.execSQL(str);
    }

    public long g() {
        com.tencent.mm.vfs.x1 m17;
        com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(k());
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

    public long h() {
        com.tencent.wcdb.database.SQLiteDatabase sQLiteDatabase = this.f227678a;
        if (sQLiteDatabase == null) {
            sQLiteDatabase = this.f227679b;
        }
        long j17 = -1;
        if (sQLiteDatabase == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMDataBase", "getFreeListSize db is null");
            return -1L;
        }
        try {
            com.tencent.wcdb.Cursor rawQuery = sQLiteDatabase.rawQuery("PRAGMA freelist_count", null);
            while (rawQuery.moveToNext()) {
                j17 = rawQuery.getLong(0);
            }
            rawQuery.close();
            com.tencent.mars.xlog.Log.i("MicroMsg.MMDataBase", "getFreeListCount, count = " + j17);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMDataBase", "getFreeListSize error, t = " + th6.getMessage());
        }
        return j17 * j();
    }

    public final java.lang.String i(java.lang.String str, java.lang.String str2) {
        boolean z17 = false;
        for (java.lang.String str3 : str.split(" ")) {
            java.lang.String trim = str3.trim();
            if (z17 && !trim.isEmpty()) {
                return str3;
            }
            if (trim.equalsIgnoreCase(str2)) {
                z17 = true;
            }
        }
        return "";
    }

    public long j() {
        com.tencent.wcdb.database.SQLiteDatabase sQLiteDatabase = this.f227678a;
        if (sQLiteDatabase == null) {
            sQLiteDatabase = this.f227679b;
        }
        if (sQLiteDatabase == null) {
            return -1L;
        }
        try {
            return sQLiteDatabase.getPageSize();
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMDataBase", "getPageSize error : " + th6.getMessage());
            return -1L;
        }
    }

    public java.lang.String k() {
        com.tencent.wcdb.database.SQLiteDatabase sQLiteDatabase = this.f227678a;
        if (sQLiteDatabase != null) {
            return sQLiteDatabase.getPath();
        }
        com.tencent.wcdb.database.SQLiteDatabase sQLiteDatabase2 = this.f227679b;
        return sQLiteDatabase2 != null ? sQLiteDatabase2.getPath() : "";
    }

    public final java.lang.String l() {
        android.content.SharedPreferences sharedPreferences = f227664j;
        int i17 = sharedPreferences.getInt("acp", 100);
        return java.lang.String.format("flags: 0x%04x\nacp: %d / %d", java.lang.Integer.valueOf(sharedPreferences.getInt("flags", 0)), java.lang.Integer.valueOf(i17 >>> 16), java.lang.Integer.valueOf(i17 & 65535));
    }

    public boolean o() {
        com.tencent.wcdb.database.SQLiteDatabase sQLiteDatabase = this.f227678a;
        if (sQLiteDatabase != null) {
            return sQLiteDatabase.isOpen();
        }
        com.tencent.wcdb.database.SQLiteDatabase sQLiteDatabase2 = this.f227679b;
        if (sQLiteDatabase2 != null) {
            return sQLiteDatabase2.isOpen();
        }
        return false;
    }

    @Override // com.tencent.wcdb.database.SQLiteTrace
    public void onConnectionObtained(com.tencent.wcdb.database.SQLiteDatabase sQLiteDatabase, java.lang.String str, long j17, boolean z17) {
        if (sQLiteDatabase.getPath().endsWith("EnMicroMsg.db")) {
            int i17 = f227675u[(sQLiteDatabase.isWriteAheadLoggingEnabled() ? 2 : 0) + (sQLiteDatabase.getAsyncCheckpointEnabled() ? 4 : 0) + (z17 ? 8 : 0) + 1];
            f227673s.b(i17 + 1, i17 + 2, (int) j17);
        }
        if (n()) {
            f227668n.c(sQLiteDatabase, (z17 ? 32768 : 0) | 3, str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.wcdb.database.SQLiteTrace
    public void onConnectionPoolBusy(com.tencent.wcdb.database.SQLiteDatabase sQLiteDatabase, java.lang.String str, long j17, boolean z17, java.util.List list, java.util.List list2) {
        java.lang.String str2;
        if (z65.c.f470458d) {
            return;
        }
        int i17 = 0;
        if (n()) {
            f227668n.c(sQLiteDatabase, (z17 ? 32768 : 0) | 2, str);
        }
        com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(sQLiteDatabase.getPath());
        java.lang.String str3 = a17.f213279f;
        if (str3 != null) {
            java.lang.String l17 = com.tencent.mm.vfs.e8.l(str3, false, false);
            if (!a17.f213279f.equals(l17)) {
                a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
            }
        }
        java.lang.String str4 = a17.f213279f;
        int lastIndexOf = str4.lastIndexOf("/");
        if (lastIndexOf >= 0) {
            str4 = str4.substring(lastIndexOf + 1);
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(2048);
        sb6.append(str4);
        sb6.append("\n");
        char c17 = '\n';
        if (list != null && !list.isEmpty()) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                com.tencent.wcdb.database.SQLiteTrace.TraceInfo traceInfo = (com.tencent.wcdb.database.SQLiteTrace.TraceInfo) it.next();
                sb6.append("[RUNNING] ");
                sb6.append((java.lang.String) traceInfo.info);
                sb6.append('\n');
            }
            sb6.append('\n');
        }
        java.lang.String str5 = "  at ";
        if (list2 != null && !list2.isEmpty()) {
            java.util.Iterator it6 = list2.iterator();
            while (it6.hasNext()) {
                com.tencent.wcdb.database.SQLiteTrace.TraceInfo traceInfo2 = (com.tencent.wcdb.database.SQLiteTrace.TraceInfo) it6.next();
                sb6.append("[TRANSACTION]\n");
                java.lang.StackTraceElement[] stackTraceElementArr = (java.lang.StackTraceElement[]) traceInfo2.info;
                int length = stackTraceElementArr.length;
                for (int i18 = i17; i18 < length; i18++) {
                    java.lang.StackTraceElement stackTraceElement = stackTraceElementArr[i18];
                    sb6.append("  at ");
                    sb6.append(stackTraceElement.toString());
                    sb6.append('\n');
                }
                sb6.append('\n');
                i17 = 0;
            }
        }
        java.lang.String sb7 = sb6.toString();
        if (this.f227681d.equals(sb7)) {
            return;
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.MMDataBase", "Database connection pool busy: " + str4);
        com.tencent.mars.xlog.Log.w("MicroMsg.MMDataBase", "[REQUEST primary: " + z17 + "] " + str);
        if (list == null || list.isEmpty()) {
            str2 = "  at ";
        } else {
            java.util.Iterator it7 = list.iterator();
            while (it7.hasNext()) {
                com.tencent.wcdb.database.SQLiteTrace.TraceInfo traceInfo3 = (com.tencent.wcdb.database.SQLiteTrace.TraceInfo) it7.next();
                com.tencent.mars.xlog.Log.w("MicroMsg.MMDataBase", "[RUNNING tid: %d (%d ms)] %s", java.lang.Integer.valueOf(traceInfo3.tid), java.lang.Long.valueOf(currentTimeMillis - traceInfo3.time), traceInfo3.info);
                str5 = str5;
                c17 = '\n';
            }
            str2 = str5;
            sb6.append(c17);
        }
        if (list2 != null && !list2.isEmpty()) {
            java.util.Iterator it8 = list2.iterator();
            while (it8.hasNext()) {
                com.tencent.wcdb.database.SQLiteTrace.TraceInfo traceInfo4 = (com.tencent.wcdb.database.SQLiteTrace.TraceInfo) it8.next();
                sb6.setLength(0);
                sb6.append(java.lang.String.format("[TRANSACTION tid: %d (%d ms)]\n", java.lang.Integer.valueOf(traceInfo4.tid), java.lang.Long.valueOf(currentTimeMillis - traceInfo4.time)));
                java.lang.StackTraceElement[] stackTraceElementArr2 = (java.lang.StackTraceElement[]) traceInfo4.info;
                int length2 = stackTraceElementArr2.length;
                int i19 = 0;
                while (i19 < length2) {
                    java.lang.StackTraceElement stackTraceElement2 = stackTraceElementArr2[i19];
                    sb6.append(str2);
                    sb6.append(stackTraceElement2.toString());
                    sb6.append('\n');
                    i19++;
                    it8 = it8;
                }
                sb6.append('\n');
                com.tencent.mars.xlog.Log.w("MicroMsg.MMDataBase", sb6.toString());
                it8 = it8;
            }
        }
        sb6.setLength(0);
        sQLiteDatabase.dump(new d95.i(this, sb6), false);
        java.lang.String sb8 = sb6.toString();
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        linkedHashMap.put("SQL", str);
        linkedHashMap.put("dump", sb8);
        linkedHashMap.put("settings", l());
        jx3.f fVar = jx3.f.INSTANCE;
        fVar.i("DBPoolBusy", sb7, linkedHashMap);
        this.f227681d = sb7;
        fVar.idkeyStat(463L, 6L, 1L, false);
        try {
            java.lang.StringBuilder sb9 = new java.lang.StringBuilder();
            if (list == null) {
                return;
            }
            java.util.Iterator it9 = list.iterator();
            while (it9.hasNext()) {
                sb9.append(((java.lang.String) ((com.tencent.wcdb.database.SQLiteTrace.TraceInfo) it9.next()).info) + "\n");
            }
            z65.c.f470461g = sb9.toString();
            boolean z18 = com.tencent.mm.app.w.INSTANCE.f53889n;
            boolean n17 = n();
            jx3.f fVar2 = jx3.f.INSTANCE;
            java.lang.Object[] objArr = new java.lang.Object[7];
            objArr[0] = str;
            objArr[1] = java.lang.Long.valueOf(j17);
            objArr[2] = java.lang.Integer.valueOf(z17 ? 1 : 0);
            objArr[3] = sb9.toString();
            objArr[4] = java.lang.Integer.valueOf(z18 ? 1 : 0);
            objArr[5] = java.lang.Integer.valueOf(n17 ? 1 : 0);
            objArr[6] = str4;
            fVar2.d(20584, objArr);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMDataBase", "report db busy failed = " + th6.getMessage());
        }
    }

    @Override // com.tencent.wcdb.DatabaseErrorHandler
    public void onCorruption(com.tencent.wcdb.database.SQLiteDatabase sQLiteDatabase) {
        if (java.lang.Boolean.TRUE.equals(f227661g.get())) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MMDataBase", "needIgnoreCorrupt, thread: " + java.lang.Thread.currentThread());
            return;
        }
        boolean isOpen = sQLiteDatabase.isOpen();
        java.lang.String path = sQLiteDatabase.getPath();
        com.tencent.mars.xlog.Log.e("MicroMsg.MMDataBase", "Database corrupted, isOpen: %s, path: %s", java.lang.Boolean.toString(isOpen), path);
        java.util.List<android.util.Pair<java.lang.String, java.lang.String>> attachedDbs = sQLiteDatabase.getAttachedDbs();
        if (isOpen) {
            if (!this.f227680c) {
                this.f227680c = true;
            }
            try {
                jx3.f.INSTANCE.idkeyStat(181L, !sQLiteDatabase.isWriteAheadLoggingEnabled() ? 42 : sQLiteDatabase.getAsyncCheckpointEnabled() ? 43 : 41, 1L, true);
                x(sQLiteDatabase);
                sQLiteDatabase.close();
                if (attachedDbs == null) {
                    r(path);
                } else {
                    java.util.Iterator<android.util.Pair<java.lang.String, java.lang.String>> it = attachedDbs.iterator();
                    while (it.hasNext()) {
                        r((java.lang.String) it.next().second);
                    }
                }
                if (path.contains("EnMicroMsg.db")) {
                    a();
                }
            } catch (java.lang.Exception unused) {
            }
        }
    }

    @Override // com.tencent.wcdb.database.SQLiteTrace
    public void onDatabaseCorrupted(com.tencent.wcdb.database.SQLiteDatabase sQLiteDatabase) {
    }

    @Override // com.tencent.wcdb.database.SQLiteTrace
    public void onSQLExecuted(com.tencent.wcdb.database.SQLiteDatabase sQLiteDatabase, java.lang.String str, int i17, long j17) {
        java.lang.String str2;
        java.lang.String i18;
        if (str == null) {
            return;
        }
        if (sQLiteDatabase.getPath().endsWith("EnMicroMsg.db")) {
            int i19 = f227675u[(sQLiteDatabase.isWriteAheadLoggingEnabled() ? 2 : 0) + (sQLiteDatabase.getAsyncCheckpointEnabled() ? 4 : 0) + (i17 != 1 ? 8 : 0)];
            f227673s.b(i19 + 1, i19 + 2, (int) j17);
            boolean b17 = kotlin.jvm.internal.o.b(android.os.Looper.myLooper(), android.os.Looper.getMainLooper());
            if (f227674t == null) {
                synchronized (d95.f.class) {
                    if (f227674t == null) {
                        f227674t = new f95.e();
                    }
                }
            }
            f227674t.c(sQLiteDatabase.getPath(), str, i17, j17, b17);
            if (str.startsWith("select") || str.startsWith("SELECT") || str.startsWith("delete") || str.startsWith("DELETE")) {
                i18 = i(str, "from");
            } else if (str.startsWith("update") || str.startsWith("UPDATE")) {
                i18 = i(str, "update");
            } else if (str.startsWith("insert") || str.startsWith("INSERT")) {
                i18 = i(str, "into");
                if (i18.contains("(")) {
                    i18 = i18.substring(i18.indexOf("(") + 1);
                }
            } else {
                i18 = "";
            }
            if (i18.equalsIgnoreCase("rconversation") && str.toLowerCase().contains("delete from")) {
                java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
                java.lang.Throwable th6 = new java.lang.Throwable();
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                com.tencent.mars.xlog.Log.i("MicroMsg.MMDataBase", "delete rconversation, type: %d, sql: %s, stack: %s", valueOf, str, com.tencent.mm.sdk.platformtools.z3.c(th6));
            }
        }
        com.tencent.wcdb.database.SQLiteTrace sQLiteTrace = f227671q;
        if (sQLiteTrace != null) {
            sQLiteTrace.onSQLExecuted(sQLiteDatabase, str, i17, j17);
        }
        if (n()) {
            l75.e1 e1Var = f227668n;
            synchronized (e1Var) {
                e1Var.f316958b = 0;
                e1Var.f316960d = 0L;
            }
        }
        if (this.f227682e != null && i17 == 8) {
            java.util.regex.Matcher matcher = f227676v.matcher(str);
            if (matcher.find()) {
                java.lang.String group = matcher.group(1);
                java.lang.String group2 = matcher.group(2);
                synchronized (this.f227682e) {
                    str2 = (java.lang.String) this.f227682e.put(group, str);
                    if (str2 == null || str2.equals(str)) {
                        str2 = null;
                    } else {
                        this.f227682e.put(group, str2);
                    }
                }
                if (str2 != null) {
                    throw new java.lang.AssertionError(java.lang.String.format("Duplicated index created: %s, SQL: %s, existing: %s", group, str, str2));
                }
                if (group2.equalsIgnoreCase(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.MESSAGE) && java.util.Arrays.binarySearch(f227677w, group.toLowerCase(java.util.Locale.ENGLISH)) < 0) {
                    throw new java.lang.AssertionError(java.lang.String.format("New index for message table found: %s, SQL: %s", group, str));
                }
            }
        }
        if (f227672r == null || !sQLiteDatabase.getPath().endsWith("SnsMicroMsg.db")) {
            return;
        }
        f227672r.onSQLExecuted(sQLiteDatabase, str, i17, j17);
    }

    public boolean p() {
        try {
            android.os.StatFs statFs = new android.os.StatFs(android.os.Environment.getDataDirectory().getPath());
            android.os.StatFs statFs2 = new android.os.StatFs(lp0.b.e0());
            long availableBytes = statFs.getAvailableBytes();
            long availableBytes2 = statFs2.getAvailableBytes();
            long g17 = g();
            com.tencent.mars.xlog.Log.i("MicroMsg.MMDataBase", "dataFreeSpace = " + availableBytes + ", sdcardFreeSpace = " + availableBytes2 + ", dbFileSize = " + g17);
            long j17 = g17 * 2;
            return availableBytes > j17 && availableBytes2 > j17;
        } catch (java.lang.Throwable unused) {
            return false;
        }
    }

    public android.database.Cursor u(java.lang.String str, java.lang.String[] strArr) {
        return v(str, strArr, 0, false, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.database.Cursor v(java.lang.String r9, java.lang.String[] r10, int r11, boolean r12, com.tencent.wcdb.support.CancellationSignal r13) {
        /*
            r8 = this;
            com.tencent.wcdb.database.SQLiteDatabase r0 = r8.f227678a
            if (r0 == 0) goto L5
            goto L7
        L5:
            com.tencent.wcdb.database.SQLiteDatabase r0 = r8.f227679b
        L7:
            r1 = r0
            int r0 = d95.f.f227665k
            r2 = 2
            r0 = r0 & r2
            r3 = 0
            r4 = 1
            if (r0 == 0) goto L12
            r0 = r4
            goto L13
        L12:
            r0 = r3
        L13:
            r7 = 4
            r5 = 0
            if (r11 != r7) goto L1b
            com.tencent.wcdb.database.SQLiteDatabase$CursorFactory r0 = e95.m.f250425r
        L19:
            r2 = r0
            goto L3a
        L1b:
            r6 = 100
            if (r11 != r6) goto L22
            com.tencent.wcdb.database.SQLiteDatabase$CursorFactory r0 = com.tencent.wcdb.database.SQLiteDirectCursor.FACTORY
            goto L19
        L22:
            boolean r6 = z65.c.a()
            if (r6 != 0) goto L2d
            if (r0 == 0) goto L2b
            goto L2d
        L2b:
            r2 = r5
            goto L3a
        L2d:
            if (r11 == 0) goto L2b
            if (r11 == r4) goto L37
            if (r11 == r2) goto L34
            goto L2b
        L34:
            com.tencent.wcdb.database.SQLiteDatabase$CursorFactory r0 = com.tencent.wcdb.database.SQLiteDirectCursor.FACTORY
            goto L19
        L37:
            com.tencent.wcdb.database.SQLiteDatabase$CursorFactory r0 = com.tencent.wcdb.database.SQLiteCursor.FACTORY
            goto L19
        L3a:
            boolean r0 = n()
            if (r0 == 0) goto L55
            int r0 = com.tencent.wcdb.DatabaseUtils.getSqlStatementType(r9)
            if (r0 != r4) goto L48
            r0 = r4
            goto L49
        L48:
            r0 = r3
        L49:
            if (r0 == 0) goto L4e
            r3 = 32768(0x8000, float:4.5918E-41)
        L4e:
            r0 = r3 | 1
            l75.e1 r3 = d95.f.f227668n
            r3.c(r1, r0, r9)
        L55:
            if (r12 == 0) goto L77
            if (r13 == 0) goto L5a
            goto L5f
        L5a:
            com.tencent.wcdb.support.CancellationSignal r13 = new com.tencent.wcdb.support.CancellationSignal
            r13.<init>()
        L5f:
            r5 = 0
            r3 = r9
            r4 = r10
            r6 = r13
            com.tencent.wcdb.Cursor r10 = r1.rawQueryWithFactory(r2, r3, r4, r5, r6)
            if (r11 == 0) goto L71
            if (r11 == r7) goto L71
            d95.o r11 = new d95.o
            r11.<init>(r10, r9, r13)
            goto L76
        L71:
            d95.n r11 = new d95.n
            r11.<init>(r10, r13)
        L76:
            return r11
        L77:
            com.tencent.wcdb.Cursor r10 = r1.rawQueryWithFactory(r2, r9, r10, r5)
            if (r11 == 0) goto L85
            if (r11 == r7) goto L85
            d95.p r11 = new d95.p
            r11.<init>(r10, r9)
            r10 = r11
        L85:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: d95.f.v(java.lang.String, java.lang.String[], int, boolean, com.tencent.wcdb.support.CancellationSignal):android.database.Cursor");
    }

    public final void x(com.tencent.wcdb.database.SQLiteDatabase sQLiteDatabase) {
        int lastErrorLine = com.tencent.wcdb.database.SQLiteDebug.getLastErrorLine();
        java.lang.String l17 = l();
        com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(sQLiteDatabase.getPath());
        java.lang.String str = a17.f213279f;
        if (str != null) {
            java.lang.String l18 = com.tencent.mm.vfs.e8.l(str, false, false);
            if (!str.equals(l18)) {
                a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l18, a17.f213280g, a17.f213281h);
            }
        }
        java.lang.String str2 = a17.f213279f;
        int lastIndexOf = str2.lastIndexOf("/");
        if (lastIndexOf >= 0) {
            str2 = str2.substring(lastIndexOf + 1);
        }
        jx3.f.INSTANCE.d(22323, str2, java.lang.Integer.valueOf(f227664j.getInt("flags", 0)), l17, 0, java.lang.Integer.valueOf(lastErrorLine), android.os.Build.FINGERPRINT);
    }

    public void y() {
        com.tencent.wcdb.database.SQLiteDatabase sQLiteDatabase = this.f227678a;
        if (sQLiteDatabase == null) {
            sQLiteDatabase = this.f227679b;
        }
        if (n()) {
            f227668n.c(sQLiteDatabase, 32769, "ROLLBACK;");
        }
        try {
            sQLiteDatabase.endTransaction();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MMDataBase", e17, "", new java.lang.Object[0]);
        }
    }

    public synchronized boolean z() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MMDataBase", "vacuum, dbPath = " + k());
        if (f227669o) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MMDataBase", "isVacuuming");
            return false;
        }
        if (!p()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMDataBase", "isStorageAvailableSatisfyVacuum = false");
            return false;
        }
        com.tencent.wcdb.database.SQLiteDatabase sQLiteDatabase = this.f227678a;
        if (sQLiteDatabase == null) {
            sQLiteDatabase = this.f227679b;
        }
        if (sQLiteDatabase == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMDataBase", "getFreeListSize db is null");
            return false;
        }
        f227669o = true;
        com.tencent.mars.xlog.Log.i("MicroMsg.MMDataBase", "Vacuum Start");
        try {
            sQLiteDatabase.execSQL("vacuum");
            f227669o = false;
            com.tencent.mars.xlog.Log.i("MicroMsg.MMDataBase", "Vacuum Done");
            return true;
        } catch (java.lang.Throwable th6) {
            try {
                com.tencent.mars.xlog.Log.e("MicroMsg.MMDataBase", "vacuum error, t = " + th6.getMessage());
                return false;
            } finally {
                f227669o = false;
            }
        }
    }
}
