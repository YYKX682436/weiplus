package com.tencent.mm.plugin.sns.model;

@j95.b(dependencies = {c42.i.class})
/* loaded from: classes4.dex */
public final class l4 extends i95.w implements p94.p0 {
    public static int Y;
    public static final java.util.HashMap Z;

    /* renamed from: l1, reason: collision with root package name */
    public static final int f164401l1;

    /* renamed from: p0, reason: collision with root package name */
    public static com.tencent.mm.sdk.platformtools.n3 f164402p0;

    /* renamed from: p1, reason: collision with root package name */
    public static android.graphics.Point f164403p1;

    /* renamed from: x0, reason: collision with root package name */
    public static final int f164404x0;

    /* renamed from: x1, reason: collision with root package name */
    public static boolean f164405x1;

    /* renamed from: y0, reason: collision with root package name */
    public static final int f164406y0;
    public com.tencent.mm.plugin.sns.model.i4 A;
    public com.tencent.mm.plugin.sns.storage.v2 B;
    public com.tencent.mm.plugin.sns.storage.t2 C;
    public com.tencent.mm.plugin.sns.model.d6 D;
    public com.tencent.mm.plugin.sns.model.m0 E;
    public com.tencent.mm.plugin.sns.model.o7 F;
    public com.tencent.mm.plugin.sns.ui.f8 G;
    public ra4.d H;
    public ra4.e I;

    /* renamed from: J, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.model.w6 f164407J;
    public com.tencent.mm.plugin.sns.model.k6 K;
    public com.tencent.mm.plugin.sns.storage.k2 L;
    public i64.i1 M;
    public s94.a P;
    public ac4.c Q;
    public com.tencent.mm.plugin.sns.model.i7 U;
    public final com.tencent.mm.sdk.event.IListener W;
    public final com.tencent.mm.sdk.event.IListener X;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.storage.p2 f164413i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.storage.m2 f164414m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.storage.f2 f164415n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.storage.z0 f164416o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.storage.h0 f164417p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.storage.b3 f164418q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.storage.f0 f164419r;

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.storage.w0 f164420s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.storage.p0 f164421t;

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.model.i1 f164422u;

    /* renamed from: v, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.storage.e2 f164423v;

    /* renamed from: w, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.storage.a2 f164424w;

    /* renamed from: x, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.storage.w1 f164425x;

    /* renamed from: y, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.storage.r2 f164426y;

    /* renamed from: z, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.storage.c2 f164427z;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f164408d = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.ExecutorService[] f164409e = {null};

    /* renamed from: f, reason: collision with root package name */
    public final java.util.concurrent.ExecutorService[] f164410f = {null};

    /* renamed from: g, reason: collision with root package name */
    public final java.util.concurrent.ExecutorService[] f164411g = {null};

    /* renamed from: h, reason: collision with root package name */
    public final java.util.concurrent.ExecutorService[] f164412h = {null};
    public final com.tencent.mm.plugin.sns.model.h6 N = new com.tencent.mm.plugin.sns.model.h6();
    public final byte[] R = new byte[0];
    public volatile boolean S = false;
    public final byte[] T = new byte[0];
    public final com.tencent.mm.sdk.platformtools.o4 V = com.tencent.mm.sdk.platformtools.o4.M("sns_core_db_damage_record");

    static {
        java.util.HashMap hashMap = new java.util.HashMap();
        Z = hashMap;
        f164404x0 = 103;
        f164406y0 = com.tencent.mm.ui.zk.e(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.aaw);
        f164401l1 = 712;
        f164403p1 = new android.graphics.Point();
        hashMap.put(-838549946, new com.tencent.mm.plugin.sns.model.w4());
        hashMap.put(657748297, new com.tencent.mm.plugin.sns.model.z4());
        hashMap.put(936699413, new com.tencent.mm.plugin.sns.model.a5());
        hashMap.put(2017039304, new com.tencent.mm.plugin.sns.model.b5());
        hashMap.put(1438482882, new com.tencent.mm.plugin.sns.model.c5());
        hashMap.put(481637147, new com.tencent.mm.plugin.sns.model.d5());
        hashMap.put(705018933, new com.tencent.mm.plugin.sns.model.e5());
        hashMap.put(705018933, new com.tencent.mm.plugin.sns.model.f5());
        hashMap.put(-106609422, new com.tencent.mm.plugin.sns.model.g5());
        hashMap.put(-1101647464, new com.tencent.mm.plugin.sns.model.m4());
        hashMap.put(1820255062, new com.tencent.mm.plugin.sns.model.n4());
        hashMap.put(2010687871, new com.tencent.mm.plugin.sns.model.o4());
        hashMap.put(1221165350, new com.tencent.mm.plugin.sns.model.p4());
        hashMap.put(1091255064, new com.tencent.mm.plugin.sns.model.q4());
        hashMap.put(658091182, new com.tencent.mm.plugin.sns.model.r4());
        hashMap.put(584924793, new com.tencent.mm.plugin.sns.model.s4());
        hashMap.put(297855733, new com.tencent.mm.plugin.sns.model.t4());
        f164405x1 = false;
    }

    public l4() {
        final gm0.b bVar = gm0.j1.b().f273245h;
        this.W = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.BeforeAggressiveCleanCacheEvent>(this, bVar) { // from class: com.tencent.mm.plugin.sns.model.SnsCore$22
            {
                this.__eventId = 1489935310;
            }

            /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.BeforeAggressiveCleanCacheEvent beforeAggressiveCleanCacheEvent) {
                java.lang.String str;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.model.SnsCore$22");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.model.SnsCore$22");
                if ((beforeAggressiveCleanCacheEvent.f53999g.f7589a & 2) == 0) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.model.SnsCore$22");
                } else if ("1".equals(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).aj("clicfg_clean_include_snsdb", "1"))) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.SnsCore", "Before clean cache, copy ad table");
                    java.lang.String str2 = gm0.j1.u().h() + "SnsMicroMsg2.db";
                    for (java.lang.String str3 : d95.b.f227602c) {
                        com.tencent.mm.vfs.w6.h(str2 + str3);
                    }
                    com.tencent.mm.plugin.sns.storage.p2 aj6 = com.tencent.mm.plugin.sns.model.l4.aj();
                    aj6.getClass();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getInnerDB", "com.tencent.mm.plugin.sns.storage.SnsSqliteDB");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getInnerDB", "com.tencent.mm.plugin.sns.storage.SnsSqliteDB");
                    l75.k0 k0Var = aj6.f166100a;
                    if (k0Var instanceof d95.z) {
                        com.tencent.wcdb.core.Database innerDB = ((d95.z) k0Var).f227718a.getInnerDB();
                        com.tencent.wcdb.core.Database database = new com.tencent.wcdb.core.Database(str2);
                        try {
                            d95.b.a(innerDB, database, "adsnsinfo", 0, true, true, null, null, null);
                            d95.b.a(innerDB, database, dm.va.TABLE_NAME, 0, true, true, null, "SELECT * FROM SnsInfo ORDER BY createTime DESC LIMIT 30", null);
                            d95.b.a(innerDB, database, "SnsComment", 0, true, true, null, null, null);
                            d95.b.a(innerDB, database, "SnsCover", 0, true, true, null, "SELECT * FROM SnsCover WHERE userName = '" + gm0.j1.b().k() + "'", null);
                            d95.b.a(innerDB, database, "snsExtInfo3", 0, true, true, null, null, null);
                        } catch (java.lang.Exception e17) {
                            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SnsCore", e17, "Cannot save database for clean", new java.lang.Object[0]);
                        }
                        database.close();
                    } else {
                        try {
                            try {
                                com.tencent.wcdb.database.SQLiteDatabase openOrCreateDatabase = com.tencent.wcdb.database.SQLiteDatabase.openOrCreateDatabase(str2, (com.tencent.wcdb.database.SQLiteDatabase.CursorFactory) null, true);
                                str = "Cannot save database for clean";
                                try {
                                    d95.b.b(k0Var, openOrCreateDatabase, "adsnsinfo", 0, true, true, null, null, null);
                                    d95.b.b(k0Var, openOrCreateDatabase, dm.va.TABLE_NAME, 0, true, true, null, "SELECT * FROM SnsInfo ORDER BY createTime DESC LIMIT 30", null);
                                    d95.b.b(k0Var, openOrCreateDatabase, "SnsComment", 0, true, true, null, null, null);
                                    d95.b.b(k0Var, openOrCreateDatabase, "SnsCover", 0, true, true, null, "SELECT * FROM SnsCover WHERE userName = '" + gm0.j1.b().k() + "'", null);
                                    d95.b.b(k0Var, openOrCreateDatabase, "snsExtInfo3", 0, true, true, null, null, null);
                                    openOrCreateDatabase.close();
                                } catch (java.lang.Throwable th6) {
                                    if (openOrCreateDatabase != null) {
                                        try {
                                            openOrCreateDatabase.close();
                                        } catch (java.lang.Throwable th7) {
                                            th6.addSuppressed(th7);
                                        }
                                    }
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.model.SnsCore$22");
                                    throw th6;
                                }
                            } catch (java.lang.Exception e18) {
                                e = e18;
                                str = "Cannot save database for clean";
                                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SnsCore", e, str, new java.lang.Object[0]);
                                com.tencent.mars.xlog.Log.i("MicroMsg.SnsCore", "Done copy ad table");
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.model.SnsCore$22");
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.model.SnsCore$22");
                                return false;
                            }
                        } catch (java.lang.Exception e19) {
                            e = e19;
                            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SnsCore", e, str, new java.lang.Object[0]);
                            com.tencent.mars.xlog.Log.i("MicroMsg.SnsCore", "Done copy ad table");
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.model.SnsCore$22");
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.model.SnsCore$22");
                            return false;
                        }
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.SnsCore", "Done copy ad table");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.model.SnsCore$22");
                } else {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.model.SnsCore$22");
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.model.SnsCore$22");
                return false;
            }
        };
        final gm0.b bVar2 = gm0.j1.b().f273245h;
        this.X = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.AggressiveCleanCacheEvent>(bVar2) { // from class: com.tencent.mm.plugin.sns.model.SnsCore$23
            {
                this.__eventId = 1843821197;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.AggressiveCleanCacheEvent aggressiveCleanCacheEvent) {
                androidx.lifecycle.c1 a17;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.model.SnsCore$23");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.model.SnsCore$23");
                if ((aggressiveCleanCacheEvent.f53972g.f7202a & 2) == 0) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.model.SnsCore$23");
                } else if ("1".equals(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).aj("clicfg_clean_include_snsdb", "1"))) {
                    com.tencent.mm.plugin.sns.model.l4 l4Var = com.tencent.mm.plugin.sns.model.l4.this;
                    int i17 = com.tencent.mm.plugin.sns.model.l4.Y;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.model.SnsCore");
                    com.tencent.mm.plugin.sns.storage.p2 p2Var = l4Var.f164413i;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.model.SnsCore");
                    if (p2Var != null) {
                        p2Var.close();
                    }
                    java.lang.String h17 = gm0.j1.u().h();
                    java.lang.String str = h17 + "SnsMicroMsg2.db";
                    java.lang.String str2 = h17 + "SnsMicroMsg.db";
                    for (java.lang.String str3 : d95.b.f227602c) {
                        com.tencent.mm.vfs.w6.x(str + str3, str2 + str3, false);
                    }
                    com.tencent.mm.plugin.sns.model.l4 l4Var2 = com.tencent.mm.plugin.sns.model.l4.this;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$102", "com.tencent.mm.plugin.sns.model.SnsCore");
                    l4Var2.f164413i = null;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$102", "com.tencent.mm.plugin.sns.model.SnsCore");
                    com.tencent.mm.plugin.sns.model.l4 l4Var3 = com.tencent.mm.plugin.sns.model.l4.this;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$202", "com.tencent.mm.plugin.sns.model.SnsCore");
                    l4Var3.f164414m = null;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$202", "com.tencent.mm.plugin.sns.model.SnsCore");
                    com.tencent.mm.plugin.sns.model.l4 l4Var4 = com.tencent.mm.plugin.sns.model.l4.this;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$302", "com.tencent.mm.plugin.sns.model.SnsCore");
                    l4Var4.f164415n = null;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$302", "com.tencent.mm.plugin.sns.model.SnsCore");
                    com.tencent.mm.plugin.sns.model.l4 l4Var5 = com.tencent.mm.plugin.sns.model.l4.this;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$402", "com.tencent.mm.plugin.sns.model.SnsCore");
                    l4Var5.f164416o = null;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$402", "com.tencent.mm.plugin.sns.model.SnsCore");
                    com.tencent.mm.plugin.sns.model.l4 l4Var6 = com.tencent.mm.plugin.sns.model.l4.this;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$502", "com.tencent.mm.plugin.sns.model.SnsCore");
                    l4Var6.f164417p = null;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$502", "com.tencent.mm.plugin.sns.model.SnsCore");
                    com.tencent.mm.plugin.sns.model.l4 l4Var7 = com.tencent.mm.plugin.sns.model.l4.this;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$602", "com.tencent.mm.plugin.sns.model.SnsCore");
                    l4Var7.f164418q = null;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$602", "com.tencent.mm.plugin.sns.model.SnsCore");
                    com.tencent.mm.plugin.sns.model.l4 l4Var8 = com.tencent.mm.plugin.sns.model.l4.this;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$702", "com.tencent.mm.plugin.sns.model.SnsCore");
                    l4Var8.f164419r = null;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$702", "com.tencent.mm.plugin.sns.model.SnsCore");
                    com.tencent.mm.plugin.sns.model.l4 l4Var9 = com.tencent.mm.plugin.sns.model.l4.this;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$802", "com.tencent.mm.plugin.sns.model.SnsCore");
                    l4Var9.f164420s = null;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$802", "com.tencent.mm.plugin.sns.model.SnsCore");
                    com.tencent.mm.plugin.sns.model.l4 l4Var10 = com.tencent.mm.plugin.sns.model.l4.this;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$902", "com.tencent.mm.plugin.sns.model.SnsCore");
                    l4Var10.f164421t = null;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$902", "com.tencent.mm.plugin.sns.model.SnsCore");
                    com.tencent.mm.plugin.sns.model.l4 l4Var11 = com.tencent.mm.plugin.sns.model.l4.this;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1002", "com.tencent.mm.plugin.sns.model.SnsCore");
                    l4Var11.f164423v = null;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1002", "com.tencent.mm.plugin.sns.model.SnsCore");
                    com.tencent.mm.plugin.sns.model.l4 l4Var12 = com.tencent.mm.plugin.sns.model.l4.this;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1102", "com.tencent.mm.plugin.sns.model.SnsCore");
                    l4Var12.f164424w = null;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1102", "com.tencent.mm.plugin.sns.model.SnsCore");
                    com.tencent.mm.plugin.sns.model.l4 l4Var13 = com.tencent.mm.plugin.sns.model.l4.this;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1202", "com.tencent.mm.plugin.sns.model.SnsCore");
                    l4Var13.f164425x = null;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1202", "com.tencent.mm.plugin.sns.model.SnsCore");
                    com.tencent.mm.plugin.sns.model.l4 l4Var14 = com.tencent.mm.plugin.sns.model.l4.this;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1302", "com.tencent.mm.plugin.sns.model.SnsCore");
                    l4Var14.f164426y = null;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1302", "com.tencent.mm.plugin.sns.model.SnsCore");
                    com.tencent.mm.plugin.sns.model.l4 l4Var15 = com.tencent.mm.plugin.sns.model.l4.this;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1402", "com.tencent.mm.plugin.sns.model.SnsCore");
                    l4Var15.f164427z = null;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1402", "com.tencent.mm.plugin.sns.model.SnsCore");
                    com.tencent.mm.plugin.sns.model.l4 l4Var16 = com.tencent.mm.plugin.sns.model.l4.this;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1502", "com.tencent.mm.plugin.sns.model.SnsCore");
                    l4Var16.B = null;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1502", "com.tencent.mm.plugin.sns.model.SnsCore");
                    com.tencent.mm.plugin.sns.model.l4 l4Var17 = com.tencent.mm.plugin.sns.model.l4.this;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1602", "com.tencent.mm.plugin.sns.model.SnsCore");
                    l4Var17.C = null;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1602", "com.tencent.mm.plugin.sns.model.SnsCore");
                    com.tencent.mm.plugin.sns.model.l4 l4Var18 = com.tencent.mm.plugin.sns.model.l4.this;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1702", "com.tencent.mm.plugin.sns.model.SnsCore");
                    l4Var18.L = null;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1702", "com.tencent.mm.plugin.sns.model.SnsCore");
                    synchronized (jm0.k.f300270i) {
                        gm0.j1.b().c();
                        if (!jm0.k.class.isAssignableFrom(zc4.h.class)) {
                            throw new java.lang.IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
                        }
                        a17 = new androidx.lifecycle.j1(gm0.j1.b().f273245h, new jm0.h()).a(zc4.h.class);
                    }
                    zc4.h hVar = (zc4.h) a17;
                    hVar.onCleared();
                    hVar.f300273g = com.tencent.mm.plugin.sns.model.l4.aj();
                    com.tencent.mm.plugin.sns.model.l4.qj().a();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.model.SnsCore$23");
                } else {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.model.SnsCore$23");
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.model.SnsCore$23");
                return false;
            }
        };
    }

    public static com.tencent.mm.plugin.sns.storage.w1 Aj() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsCommentStg", "com.tencent.mm.plugin.sns.model.SnsCore");
        gm0.j1.b().c();
        if (Zi().f164425x == null) {
            com.tencent.mm.plugin.sns.model.l4 Zi = Zi();
            Zi();
            Zi.f164425x = new com.tencent.mm.plugin.sns.storage.w1(aj());
        }
        com.tencent.mm.plugin.sns.storage.w1 w1Var = Zi().f164425x;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsCommentStg", "com.tencent.mm.plugin.sns.model.SnsCore");
        return w1Var;
    }

    public static java.lang.String Bi() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAccPath", "com.tencent.mm.plugin.sns.model.SnsCore");
        gm0.j1.b().c();
        gm0.j1.i();
        java.lang.String d17 = gm0.j1.u().d();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAccPath", "com.tencent.mm.plugin.sns.model.SnsCore");
        return d17;
    }

    public static com.tencent.mm.plugin.sns.storage.a2 Bj() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsCoverStg", "com.tencent.mm.plugin.sns.model.SnsCore");
        gm0.j1.b().c();
        if (Zi().f164424w == null) {
            com.tencent.mm.plugin.sns.model.l4 Zi = Zi();
            Zi();
            Zi.f164424w = new com.tencent.mm.plugin.sns.storage.a2(aj());
        }
        com.tencent.mm.plugin.sns.storage.a2 a2Var = Zi().f164424w;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsCoverStg", "com.tencent.mm.plugin.sns.model.SnsCore");
        return a2Var;
    }

    public static com.tencent.mm.plugin.sns.model.m0 Cj() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsDownManager", "com.tencent.mm.plugin.sns.model.SnsCore");
        gm0.j1.b().c();
        if (Zi().E == null) {
            Zi().E = new com.tencent.mm.plugin.sns.model.m0();
        }
        com.tencent.mm.plugin.sns.model.m0 m0Var = Zi().E;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsDownManager", "com.tencent.mm.plugin.sns.model.SnsCore");
        return m0Var;
    }

    public static java.lang.String Di() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAccSnsPath", "com.tencent.mm.plugin.sns.model.SnsCore");
        java.lang.String wi6 = ((n34.q2) ((p94.e0) i95.n0.c(p94.e0.class))).wi();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAccSnsPath", "com.tencent.mm.plugin.sns.model.SnsCore");
        return wi6;
    }

    public static com.tencent.mm.plugin.sns.storage.c2 Dj() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsDraftStg", "com.tencent.mm.plugin.sns.model.SnsCore");
        gm0.j1.b().c();
        if (Zi().f164427z == null) {
            Zi().f164427z = new com.tencent.mm.plugin.sns.storage.c2(aj());
        }
        com.tencent.mm.plugin.sns.storage.c2 c2Var = Zi().f164427z;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsDraftStg", "com.tencent.mm.plugin.sns.model.SnsCore");
        return c2Var;
    }

    public static com.tencent.mm.plugin.sns.storage.e2 Ej() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsExtStg", "com.tencent.mm.plugin.sns.model.SnsCore");
        gm0.j1.b().c();
        if (Zi().f164423v == null) {
            com.tencent.mm.plugin.sns.model.l4 Zi = Zi();
            Zi();
            Zi.f164423v = new com.tencent.mm.plugin.sns.storage.e2(aj(), new com.tencent.mm.plugin.sns.model.o5());
        }
        com.tencent.mm.plugin.sns.storage.e2 e2Var = Zi().f164423v;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsExtStg", "com.tencent.mm.plugin.sns.model.SnsCore");
        return e2Var;
    }

    public static com.tencent.mm.plugin.sns.storage.f2 Fj() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsInfoStorage", "com.tencent.mm.plugin.sns.model.SnsCore");
        gm0.j1.b().c();
        if (Zi().f164415n == null) {
            Zi().f164415n = new com.tencent.mm.plugin.sns.storage.f2(aj());
        }
        com.tencent.mm.plugin.sns.storage.f2 f2Var = Zi().f164415n;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsInfoStorage", "com.tencent.mm.plugin.sns.model.SnsCore");
        return f2Var;
    }

    public static i64.i1 Gj() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsLogMgr", "com.tencent.mm.plugin.sns.model.SnsCore");
        gm0.j1.b().c();
        if (Zi().M == null) {
            Zi().M = new i64.i1();
        }
        i64.i1 i1Var = Zi().M;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsLogMgr", "com.tencent.mm.plugin.sns.model.SnsCore");
        return i1Var;
    }

    public static com.tencent.mm.plugin.sns.storage.m2 Hj() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsMediaStorage", "com.tencent.mm.plugin.sns.model.SnsCore");
        gm0.j1.b().c();
        if (Zi().f164414m == null) {
            com.tencent.mm.plugin.sns.model.l4 Zi = Zi();
            Zi();
            Zi.f164414m = new com.tencent.mm.plugin.sns.storage.m2(aj());
        }
        com.tencent.mm.plugin.sns.storage.m2 m2Var = Zi().f164414m;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsMediaStorage", "com.tencent.mm.plugin.sns.model.SnsCore");
        return m2Var;
    }

    public static com.tencent.mm.plugin.sns.storage.k2 Ij() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsReportStg", "com.tencent.mm.plugin.sns.model.SnsCore");
        gm0.j1.b().c();
        if (Zi().L == null) {
            Zi().L = new com.tencent.mm.plugin.sns.storage.k2(aj());
        }
        com.tencent.mm.plugin.sns.storage.k2 k2Var = Zi().L;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsReportStg", "com.tencent.mm.plugin.sns.model.SnsCore");
        return k2Var;
    }

    public static com.tencent.mm.plugin.sns.model.k6 Jj() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsRetryEditTipManager", "com.tencent.mm.plugin.sns.model.SnsCore");
        gm0.j1.b().c();
        if (Zi().K == null) {
            Zi().K = new com.tencent.mm.plugin.sns.model.k6();
        }
        com.tencent.mm.plugin.sns.model.k6 k6Var = Zi().K;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsRetryEditTipManager", "com.tencent.mm.plugin.sns.model.SnsCore");
        return k6Var;
    }

    public static com.tencent.mm.plugin.sns.model.d6 Kj() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsServer", "com.tencent.mm.plugin.sns.model.SnsCore");
        gm0.j1.b().c();
        if (Zi().D == null) {
            Zi().D = new com.tencent.mm.plugin.sns.model.d6();
        }
        com.tencent.mm.plugin.sns.model.d6 d6Var = Zi().D;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsServer", "com.tencent.mm.plugin.sns.model.SnsCore");
        return d6Var;
    }

    public static com.tencent.mm.plugin.sns.storage.r2 Lj() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsTagInfoStg", "com.tencent.mm.plugin.sns.model.SnsCore");
        gm0.j1.b().c();
        if (Zi().f164426y == null) {
            Zi().f164426y = new com.tencent.mm.plugin.sns.storage.r2(aj());
        }
        com.tencent.mm.plugin.sns.storage.r2 r2Var = Zi().f164426y;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsTagInfoStg", "com.tencent.mm.plugin.sns.model.SnsCore");
        return r2Var;
    }

    public static com.tencent.mm.plugin.sns.model.w6 Mj() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsUnreadTipManager", "com.tencent.mm.plugin.sns.model.SnsCore");
        gm0.j1.b().c();
        if (Zi().f164407J == null) {
            Zi().f164407J = new com.tencent.mm.plugin.sns.model.w6();
        }
        com.tencent.mm.plugin.sns.model.w6 w6Var = Zi().f164407J;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsUnreadTipManager", "com.tencent.mm.plugin.sns.model.SnsCore");
        return w6Var;
    }

    public static java.lang.String Ni() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAccSnsTmpPath", "com.tencent.mm.plugin.sns.model.SnsCore");
        java.lang.String Ai = ((n34.q2) ((p94.e0) i95.n0.c(p94.e0.class))).Ai();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAccSnsTmpPath", "com.tencent.mm.plugin.sns.model.SnsCore");
        return Ai;
    }

    public static com.tencent.mm.plugin.sns.model.o7 Nj() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsUploadManager", "com.tencent.mm.plugin.sns.model.SnsCore");
        gm0.j1.b().c();
        if (Zi().F == null) {
            Zi().F = new com.tencent.mm.plugin.sns.model.o7();
        }
        com.tencent.mm.plugin.sns.model.o7 o7Var = Zi().F;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsUploadManager", "com.tencent.mm.plugin.sns.model.SnsCore");
        return o7Var;
    }

    public static int Oj() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsUserPageShowThumbSize", "com.tencent.mm.plugin.sns.model.SnsCore");
        float f17 = com.tencent.mm.ui.bh.a(com.tencent.mm.sdk.platformtools.x2.f193071a).f197135a * 0.22f;
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsCore", "getSnsUserPageShowThumbSize >> %f", java.lang.Float.valueOf(f17));
        int i17 = f164401l1;
        if (f17 > i17) {
            f17 = i17;
        }
        int i18 = (int) f17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsUserPageShowThumbSize", "com.tencent.mm.plugin.sns.model.SnsCore");
        return i18;
    }

    public static com.tencent.mm.plugin.sns.model.i7 Pj() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsVideoService", "com.tencent.mm.plugin.sns.model.SnsCore");
        gm0.j1.b().c();
        if (Zi().U == null) {
            Zi().U = new com.tencent.mm.plugin.sns.model.i7();
        }
        com.tencent.mm.plugin.sns.model.i7 i7Var = Zi().U;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsVideoService", "com.tencent.mm.plugin.sns.model.SnsCore");
        return i7Var;
    }

    public static com.tencent.mm.plugin.sns.storage.t2 Qj() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsWsFoldDetailStg", "com.tencent.mm.plugin.sns.model.SnsCore");
        gm0.j1.b().c();
        if (Zi().C == null) {
            Zi().C = new com.tencent.mm.plugin.sns.storage.t2(aj());
        }
        com.tencent.mm.plugin.sns.storage.t2 t2Var = Zi().C;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsWsFoldDetailStg", "com.tencent.mm.plugin.sns.model.SnsCore");
        return t2Var;
    }

    public static com.tencent.mm.plugin.sns.storage.p0 Ri() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAdDynamicCanvasInfoStorage", "com.tencent.mm.plugin.sns.model.SnsCore");
        gm0.j1.b().c();
        if (Zi().f164421t == null) {
            Zi().f164421t = new com.tencent.mm.plugin.sns.storage.p0(aj());
        }
        com.tencent.mm.plugin.sns.storage.p0 p0Var = Zi().f164421t;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdDynamicCanvasInfoStorage", "com.tencent.mm.plugin.sns.model.SnsCore");
        return p0Var;
    }

    public static com.tencent.mm.plugin.sns.storage.v2 Rj() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsWsFoldGroupStg", "com.tencent.mm.plugin.sns.model.SnsCore");
        gm0.j1.b().c();
        if (Zi().B == null) {
            Zi().B = new com.tencent.mm.plugin.sns.storage.v2(aj());
        }
        com.tencent.mm.plugin.sns.storage.v2 v2Var = Zi().B;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsWsFoldGroupStg", "com.tencent.mm.plugin.sns.model.SnsCore");
        return v2Var;
    }

    public static java.util.concurrent.ExecutorService Sj() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTaskExecutor", "com.tencent.mm.plugin.sns.model.SnsCore");
        if (Zi().f164412h[0] == null) {
            synchronized (Zi().f164412h) {
                try {
                    if (Zi().f164412h[0] == null) {
                        Zi().f164412h[0] = ((ku5.t0) ku5.t0.f312615d).p("SnsCore#Task");
                    }
                } catch (java.lang.Throwable th6) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTaskExecutor", "com.tencent.mm.plugin.sns.model.SnsCore");
                    throw th6;
                }
            }
        }
        java.util.concurrent.ExecutorService executorService = Zi().f164412h[0];
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTaskExecutor", "com.tencent.mm.plugin.sns.model.SnsCore");
        return executorService;
    }

    public static com.tencent.mm.sdk.platformtools.n3 Tj() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getUIHandler", "com.tencent.mm.plugin.sns.model.SnsCore");
        com.tencent.mm.plugin.sns.model.l4 Zi = Zi();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getUIHandler", "com.tencent.mm.plugin.sns.model.SnsCore");
        return Zi.f164408d;
    }

    public static com.tencent.mm.plugin.sns.storage.w0 Ui() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAdPullRecordsInfoStorage", "com.tencent.mm.plugin.sns.model.SnsCore");
        gm0.j1.b().c();
        if (Zi().f164420s == null) {
            Zi().f164420s = new com.tencent.mm.plugin.sns.storage.w0(aj());
        }
        com.tencent.mm.plugin.sns.storage.w0 w0Var = Zi().f164420s;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdPullRecordsInfoStorage", "com.tencent.mm.plugin.sns.model.SnsCore");
        return w0Var;
    }

    public static com.tencent.mm.sdk.platformtools.n3 Uj() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getWorkingHandler", "com.tencent.mm.plugin.sns.model.SnsCore");
        if (f164402p0 == null) {
            f164402p0 = new com.tencent.mm.sdk.platformtools.n3("MicroMsg.SnsCore#WorkingHandler");
        }
        com.tencent.mm.sdk.platformtools.n3 n3Var = f164402p0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getWorkingHandler", "com.tencent.mm.plugin.sns.model.SnsCore");
        return n3Var;
    }

    public static com.tencent.mm.plugin.sns.storage.z0 Vi() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAdSnsInfoStorage", "com.tencent.mm.plugin.sns.model.SnsCore");
        gm0.j1.b().c();
        if (Zi().f164416o == null) {
            Zi().f164416o = new com.tencent.mm.plugin.sns.storage.z0(aj());
        }
        com.tencent.mm.plugin.sns.storage.z0 z0Var = Zi().f164416o;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdSnsInfoStorage", "com.tencent.mm.plugin.sns.model.SnsCore");
        return z0Var;
    }

    public static boolean Wj() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isDownloadUseWxamImg", "com.tencent.mm.plugin.sns.model.SnsCore");
        if (((rx.a) ((sx.a0) i95.n0.c(sx.a0.class))).bj()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isDownloadUseWxamImg", "com.tencent.mm.plugin.sns.model.SnsCore");
            return true;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsCore", "isDownloadUseWxamImg: hevc not support");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isDownloadUseWxamImg", "com.tencent.mm.plugin.sns.model.SnsCore");
        return false;
    }

    public static boolean Xj() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isInValid", "com.tencent.mm.plugin.sns.model.SnsCore");
        Zi();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isValid", "com.tencent.mm.plugin.sns.model.SnsCore");
        boolean m17 = gm0.j1.b().m();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isValid", "com.tencent.mm.plugin.sns.model.SnsCore");
        boolean z17 = !m17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isInValid", "com.tencent.mm.plugin.sns.model.SnsCore");
        return z17;
    }

    public static boolean Yj() {
        boolean z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isUseHevcImg", "com.tencent.mm.plugin.sns.model.SnsCore");
        if (!((rx.a) ((sx.a0) i95.n0.c(sx.a0.class))).bj()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsCore", "isUseHevcImg: hevc not support");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isUseHevcImg", "com.tencent.mm.plugin.sns.model.SnsCore");
            return false;
        }
        android.content.SharedPreferences c17 = com.tencent.mm.sdk.platformtools.l4.c(com.tencent.mm.sdk.platformtools.x2.f193071a, "sp_sns_dynswitch_stg", 4, false);
        if (c17.contains("st_sw_use_vcodec_img")) {
            z17 = c17.getBoolean("st_sw_use_vcodec_img", false);
            com.tencent.mars.xlog.Log.w("MicroMsg.SnsCore", "isUseVCodecImg: %b (set statically outside)", java.lang.Boolean.valueOf(z17));
        } else {
            z17 = c17.getBoolean("sw_use_vcodec_img", false);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isUseHevcImg", "com.tencent.mm.plugin.sns.model.SnsCore");
        return z17;
    }

    public static com.tencent.mm.plugin.sns.model.l4 Zi() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCore", "com.tencent.mm.plugin.sns.model.SnsCore");
        com.tencent.mm.plugin.sns.model.l4 l4Var = (com.tencent.mm.plugin.sns.model.l4) i95.n0.c(com.tencent.mm.plugin.sns.model.l4.class);
        l4Var.Vj();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCore", "com.tencent.mm.plugin.sns.model.SnsCore");
        return l4Var;
    }

    public static boolean Zj() {
        boolean z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isUseWxpcImg", "com.tencent.mm.plugin.sns.model.SnsCore");
        if (!((rx.a) ((sx.a0) i95.n0.c(sx.a0.class))).bj()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsCore", "isUseWxpcImg: hevc not support");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isUseWxpcImg", "com.tencent.mm.plugin.sns.model.SnsCore");
            return false;
        }
        android.content.SharedPreferences c17 = com.tencent.mm.sdk.platformtools.l4.c(com.tencent.mm.sdk.platformtools.x2.f193071a, "sp_sns_dynswitch_stg", 4, false);
        if (c17.contains("st_sw_use_wxpc_img")) {
            z17 = c17.getBoolean("st_sw_use_wxpc_img", false);
            com.tencent.mars.xlog.Log.w("MicroMsg.SnsCore", "isUseWxpcImg: %b (set statically outside)", java.lang.Boolean.valueOf(z17));
        } else {
            z17 = c17.getBoolean("sw_use_wxpc_img", false);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isUseWxpcImg", "com.tencent.mm.plugin.sns.model.SnsCore");
        return z17;
    }

    public static com.tencent.mm.plugin.sns.storage.p2 aj() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getDataDB", "com.tencent.mm.plugin.sns.model.SnsCore");
        com.tencent.mm.plugin.sns.model.l4 Zi = Zi();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initDbOnDemand", "com.tencent.mm.plugin.sns.model.SnsCore");
        if (gm0.j1.a()) {
            synchronized (Zi.R) {
                try {
                    if (Zi.f164413i != null) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initDbOnDemand", "com.tencent.mm.plugin.sns.model.SnsCore");
                    } else {
                        com.tencent.mars.xlog.Log.i("MicroMsg.SnsCore", "getCore need reset DB now " + java.lang.Thread.currentThread().getName() + " " + java.lang.Thread.currentThread().getId() + " " + Zi.hashCode());
                        com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC.f168761r.getClass();
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("triggerInit", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$Companion");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("triggerInit", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$Companion");
                        Zi.ak();
                        com.tencent.mars.xlog.Log.i("MicroMsg.SnsCore", "resetdb done");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initDbOnDemand", "com.tencent.mm.plugin.sns.model.SnsCore");
                    }
                } catch (java.lang.Throwable th6) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initDbOnDemand", "com.tencent.mm.plugin.sns.model.SnsCore");
                    throw th6;
                }
            }
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initDbOnDemand", "com.tencent.mm.plugin.sns.model.SnsCore");
        }
        com.tencent.mm.plugin.sns.storage.p2 p2Var = Zi().f164413i;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDataDB", "com.tencent.mm.plugin.sns.model.SnsCore");
        return p2Var;
    }

    public static java.util.concurrent.ExecutorService bj() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getDecodeExecutor", "com.tencent.mm.plugin.sns.model.SnsCore");
        if (Zi().f164410f[0] == null) {
            synchronized (Zi().f164410f) {
                try {
                    if (Zi().f164410f[0] == null) {
                        Zi().f164410f[0] = ((ku5.t0) ku5.t0.f312615d).o("SnsCore_thumbDecode_handler", 6, 6, new java.util.concurrent.LinkedBlockingQueue());
                    }
                } catch (java.lang.Throwable th6) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDecodeExecutor", "com.tencent.mm.plugin.sns.model.SnsCore");
                    throw th6;
                }
            }
        }
        java.util.concurrent.ExecutorService executorService = Zi().f164410f[0];
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDecodeExecutor", "com.tencent.mm.plugin.sns.model.SnsCore");
        return executorService;
    }

    public static void bk(android.graphics.Point point) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setScreenSize", "com.tencent.mm.plugin.sns.model.SnsCore");
        f164403p1 = point;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setScreenSize", "com.tencent.mm.plugin.sns.model.SnsCore");
    }

    public static java.util.concurrent.ExecutorService cj() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getFileExecutor", "com.tencent.mm.plugin.sns.model.SnsCore");
        if (Zi().f164409e[0] == null) {
            synchronized (Zi().f164409e) {
                try {
                    if (Zi().f164409e[0] == null) {
                        Zi().f164409e[0] = ((ku5.t0) ku5.t0.f312615d).p("SnsCore#File");
                    }
                } catch (java.lang.Throwable th6) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFileExecutor", "com.tencent.mm.plugin.sns.model.SnsCore");
                    throw th6;
                }
            }
        }
        java.util.concurrent.ExecutorService executorService = Zi().f164409e[0];
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFileExecutor", "com.tencent.mm.plugin.sns.model.SnsCore");
        return executorService;
    }

    public static java.lang.String fj() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getFileSys", "com.tencent.mm.plugin.sns.model.SnsCore");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFileSys", "com.tencent.mm.plugin.sns.model.SnsCore");
        return "";
    }

    public static com.tencent.mm.plugin.sns.model.i1 hj() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getImageLoader", "com.tencent.mm.plugin.sns.model.SnsCore");
        gm0.j1.b().c();
        if (Zi().f164422u == null) {
            Zi().f164422u = new com.tencent.mm.plugin.sns.model.i1();
        }
        com.tencent.mm.plugin.sns.model.i1 i1Var = Zi().f164422u;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getImageLoader", "com.tencent.mm.plugin.sns.model.SnsCore");
        return i1Var;
    }

    public static java.util.concurrent.ExecutorService ij() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMediaExecutor", "com.tencent.mm.plugin.sns.model.SnsCore");
        if (Zi().f164411g[0] == null) {
            synchronized (Zi().f164411g) {
                try {
                    if (Zi().f164411g[0] == null) {
                        Zi().f164411g[0] = ((ku5.t0) ku5.t0.f312615d).o("SnsCore_CDNDownload_handler", 6, 6, new java.util.concurrent.LinkedBlockingQueue());
                    }
                } catch (java.lang.Throwable th6) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMediaExecutor", "com.tencent.mm.plugin.sns.model.SnsCore");
                    throw th6;
                }
            }
        }
        java.util.concurrent.ExecutorService executorService = Zi().f164411g[0];
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMediaExecutor", "com.tencent.mm.plugin.sns.model.SnsCore");
        return executorService;
    }

    public static int mj() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMultiThumbBitmapSize", "com.tencent.mm.plugin.sns.model.SnsCore");
        if (!pc4.d.f353410a.f()) {
            int nj6 = nj();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMultiThumbBitmapSize", "com.tencent.mm.plugin.sns.model.SnsCore");
            return nj6;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsMultiThumbMaxSize", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_sns_image_multi_thumb_size_limit, 200);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsMultiThumbMaxSize", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMultiThumbBitmapSize", "com.tencent.mm.plugin.sns.model.SnsCore");
        return Ni;
    }

    public static int nj() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMultiThumbDisplaySize", "com.tencent.mm.plugin.sns.model.SnsCore");
        int b17 = (rj().x - i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, f164404x0)) / 3;
        int i17 = f164406y0;
        if (b17 > i17) {
            b17 = i17;
        }
        if (b17 > 10) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMultiThumbDisplaySize", "com.tencent.mm.plugin.sns.model.SnsCore");
            return b17;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.SnsCore", "can not get multiThumbDisplaySize or the multiThumbDisplaySize < 10");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMultiThumbDisplaySize", "com.tencent.mm.plugin.sns.model.SnsCore");
        return 150;
    }

    public static com.tencent.mm.plugin.sns.model.h6 oj() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPreTimelineService", "com.tencent.mm.plugin.sns.model.SnsCore");
        com.tencent.mm.plugin.sns.model.l4 Zi = Zi();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPreTimelineService", "com.tencent.mm.plugin.sns.model.SnsCore");
        return Zi.N;
    }

    public static com.tencent.mm.storage.e8 pj() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getRcontactStg", "com.tencent.mm.plugin.sns.model.SnsCore");
        gm0.j1.i();
        com.tencent.mm.storage.k4 Bi = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getRcontactStg", "com.tencent.mm.plugin.sns.model.SnsCore");
        return Bi;
    }

    public static com.tencent.mm.plugin.sns.ui.f8 qj() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getResumeControl", "com.tencent.mm.plugin.sns.model.SnsCore");
        gm0.j1.b().c();
        if (Zi().G == null) {
            Zi().G = new com.tencent.mm.plugin.sns.ui.f8();
        }
        com.tencent.mm.plugin.sns.ui.f8 f8Var = Zi().G;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getResumeControl", "com.tencent.mm.plugin.sns.model.SnsCore");
        return f8Var;
    }

    public static android.graphics.Point rj() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getScreenSize", "com.tencent.mm.plugin.sns.model.SnsCore");
        if (f164403p1.x == 0) {
            android.view.WindowManager windowManager = (android.view.WindowManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("window");
            android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
            android.graphics.Point point = f164403p1;
            point.x = displayMetrics.widthPixels;
            point.y = displayMetrics.heightPixels;
        }
        android.graphics.Point point2 = f164403p1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getScreenSize", "com.tencent.mm.plugin.sns.model.SnsCore");
        return point2;
    }

    public static java.lang.String sj() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSelfName", "com.tencent.mm.plugin.sns.model.SnsCore");
        gm0.j1.i();
        java.lang.String str = (java.lang.String) gm0.j1.u().c().l(2, null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSelfName", "com.tencent.mm.plugin.sns.model.SnsCore");
        return str;
    }

    public static int tj() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSingleThumbDisplayMaxSize", "com.tencent.mm.plugin.sns.model.SnsCore");
        if (!pc4.d.f353410a.f()) {
            if (Y <= 0) {
                Y = 200;
                Y = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 200);
            }
            int i17 = Y;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSingleThumbDisplayMaxSize", "com.tencent.mm.plugin.sns.model.SnsCore");
            return i17;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsSingleThumbMaxSize", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_sns_image_single_thumb_size_limit, 480);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsSingleThumbMaxSize", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSingleThumbDisplayMaxSize", "com.tencent.mm.plugin.sns.model.SnsCore");
        return Ni;
    }

    public static ra4.d uj() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsAbTestMgr", "com.tencent.mm.plugin.sns.model.SnsCore");
        gm0.j1.b().c();
        if (Zi().H == null) {
            Zi().H = new ra4.d();
        }
        ra4.d dVar = Zi().H;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsAbTestMgr", "com.tencent.mm.plugin.sns.model.SnsCore");
        return dVar;
    }

    public static ra4.e vj() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsAdAbTestMgr", "com.tencent.mm.plugin.sns.model.SnsCore");
        gm0.j1.b().c();
        if (Zi().I == null) {
            Zi().I = new ra4.e();
        }
        ra4.e eVar = Zi().I;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsAdAbTestMgr", "com.tencent.mm.plugin.sns.model.SnsCore");
        return eVar;
    }

    public static java.lang.String wj() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsAdPath", "com.tencent.mm.plugin.sns.model.SnsCore");
        ((n34.q2) ((p94.e0) i95.n0.c(p94.e0.class))).getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsAdPath", "com.tencent.mm.plugin.sns.PluginSns");
        java.lang.String str = com.tencent.mm.vfs.q7.c("sns") + "/sns_ad//";
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsAdPath", "com.tencent.mm.plugin.sns.PluginSns");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsAdPath", "com.tencent.mm.plugin.sns.model.SnsCore");
        return str;
    }

    public static com.tencent.mm.plugin.sns.model.i4 xj() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsAsyncQueueMgr", "com.tencent.mm.plugin.sns.model.SnsCore");
        gm0.j1.b().c();
        if (Zi().A == null) {
            com.tencent.mm.plugin.sns.model.l4 Zi = Zi();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            gm0.j1.i();
            sb6.append(gm0.j1.u().h());
            sb6.append("snsAsyncQueue.data");
            Zi.A = new com.tencent.mm.plugin.sns.model.i4(sb6.toString());
        }
        com.tencent.mm.plugin.sns.model.i4 i4Var = Zi().A;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsAsyncQueueMgr", "com.tencent.mm.plugin.sns.model.SnsCore");
        return i4Var;
    }

    public static s94.a yj() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsCleanStorageManager", "com.tencent.mm.plugin.sns.model.SnsCore");
        gm0.j1.b().c();
        if (Zi().P == null) {
            Zi().P = new s94.a();
        }
        s94.a aVar = Zi().P;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsCleanStorageManager", "com.tencent.mm.plugin.sns.model.SnsCore");
        return aVar;
    }

    public static ac4.c zj() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsCmtImageUploadMgr", "com.tencent.mm.plugin.sns.model.SnsCore");
        gm0.j1.b().c();
        if (Zi().Q == null) {
            Zi().Q = new ac4.c();
        }
        ac4.c cVar = Zi().Q;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsCmtImageUploadMgr", "com.tencent.mm.plugin.sns.model.SnsCore");
        return cVar;
    }

    public final void Ai() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("closeDB", "com.tencent.mm.plugin.sns.model.SnsCore");
        synchronized (this.R) {
            try {
                com.tencent.mm.plugin.sns.storage.p2 p2Var = this.f164413i;
                if (p2Var != null) {
                    p2Var.close();
                    this.f164413i = null;
                }
            } catch (java.lang.Throwable th6) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("closeDB", "com.tencent.mm.plugin.sns.model.SnsCore");
                throw th6;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("closeDB", "com.tencent.mm.plugin.sns.model.SnsCore");
    }

    public final void Vj() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initDirOnDemand", "com.tencent.mm.plugin.sns.model.SnsCore");
        if (!gm0.j1.a()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initDirOnDemand", "com.tencent.mm.plugin.sns.model.SnsCore");
            return;
        }
        if (this.S) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initDirOnDemand", "com.tencent.mm.plugin.sns.model.SnsCore");
            return;
        }
        synchronized (this.T) {
            try {
                if (!this.S) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.SnsCore", "init dir");
                    wi();
                    this.S = true;
                }
            } catch (java.lang.Throwable th6) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initDirOnDemand", "com.tencent.mm.plugin.sns.model.SnsCore");
                throw th6;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initDirOnDemand", "com.tencent.mm.plugin.sns.model.SnsCore");
    }

    public final void ak() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetDb", "com.tencent.mm.plugin.sns.model.SnsCore");
        if (this.f164413i != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetDb", "com.tencent.mm.plugin.sns.model.SnsCore");
            return;
        }
        gm0.j1.i();
        java.lang.String str = gm0.j1.u().h() + "SnsMicroMsg.db";
        boolean z17 = !"0".equals(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).aj("clicfg_sns_use_wcdb2", "0"));
        java.util.HashMap hashMap = Z;
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsCore", "USE NEW WCDB");
            d95.z zVar = new d95.z(d95.q.a(str, null, 8), true);
            this.f164413i = new com.tencent.mm.plugin.sns.storage.p2(zVar);
            zVar.M(hashMap, true, true);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsCore", "USE LEGACY DB");
            d95.b0 b0Var = new d95.b0();
            this.f164413i = new com.tencent.mm.plugin.sns.storage.p2(b0Var);
            if (!b0Var.S(str, hashMap, true, true)) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.A(150, 82);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("removeDirtyDB", "com.tencent.mm.plugin.sns.model.SnsCore");
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsCore", "removeDirtyDB.");
                gm0.j1.i();
                java.lang.Iterable<com.tencent.mm.vfs.x1> s17 = com.tencent.mm.vfs.w6.s(gm0.j1.u().h(), false);
                if (s17 == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.SnsCore", "removeDirtyDB files null");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("removeDirtyDB", "com.tencent.mm.plugin.sns.model.SnsCore");
                } else {
                    for (com.tencent.mm.vfs.x1 x1Var : s17) {
                        if (!x1Var.f213236f && x1Var.f213232b.contains("SnsMicroMsg")) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.SnsCore", "removeDirtyDB will delete:%s", x1Var.f213231a);
                            x1Var.a();
                        }
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("removeDirtyDB", "com.tencent.mm.plugin.sns.model.SnsCore");
                }
                this.f164413i = new com.tencent.mm.plugin.sns.storage.p2(new d95.b0());
                boolean S = b0Var.S(str, hashMap, true, true);
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsCore", "one more time result:%s:", java.lang.Boolean.valueOf(S));
                if (S) {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.A(150, 83);
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetDb", "com.tencent.mm.plugin.sns.model.SnsCore");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x015c  */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v2, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r1v8 */
    @Override // i95.w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onAccountInitialized(android.content.Context r21) {
        /*
            Method dump skipped, instructions count: 449
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.model.l4.onAccountInitialized(android.content.Context):void");
    }

    @Override // i95.w
    public void onAccountReleased(android.content.Context context) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAccountReleased", "com.tencent.mm.plugin.sns.model.SnsCore");
        super.onAccountReleased(context);
        za4.k g17 = za4.k.g();
        g17.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("clearCallback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
        if (g17.f471135b) {
            try {
                com.tencent.mars.xlog.Log.w("MicroMsg.AdDownloadApkMgr", "clearCallback, unregister package receiver");
                com.tencent.mm.sdk.platformtools.x2.f193071a.unregisterReceiver(g17.f471134a);
                g17.f471135b = false;
            } catch (java.lang.IllegalArgumentException e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AdDownloadApkMgr", "unregister install receiver exception", e17.getMessage());
            }
        }
        ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
        com.tencent.mm.plugin.downloader.model.r0.i().s(g17.f471141h);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("clearCallback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reset", "com.tencent.mm.plugin.sns.model.SnsCore");
        Ai();
        synchronized (this.f164411g) {
            try {
                java.util.concurrent.ExecutorService executorService = this.f164411g[0];
                if (executorService != null) {
                    executorService.shutdownNow();
                    this.f164411g[0] = null;
                }
            } finally {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reset", "com.tencent.mm.plugin.sns.model.SnsCore");
            }
        }
        synchronized (this.f164410f) {
            try {
                java.util.concurrent.ExecutorService executorService2 = this.f164410f[0];
                if (executorService2 != null) {
                    executorService2.shutdownNow();
                    this.f164410f[0] = null;
                }
            } finally {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reset", "com.tencent.mm.plugin.sns.model.SnsCore");
            }
        }
        synchronized (this.f164409e) {
            try {
                java.util.concurrent.ExecutorService executorService3 = this.f164409e[0];
                if (executorService3 != null) {
                    executorService3.shutdownNow();
                    this.f164409e[0] = null;
                }
            } finally {
            }
        }
        synchronized (this.f164412h) {
            try {
                java.util.concurrent.ExecutorService executorService4 = this.f164412h[0];
                if (executorService4 != null) {
                    executorService4.shutdownNow();
                    this.f164412h[0] = null;
                }
            } finally {
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reset", "com.tencent.mm.plugin.sns.model.SnsCore");
        com.tencent.mm.memory.i.f68963d.c();
        com.tencent.mm.memory.c.f68956e.c();
        com.tencent.mm.memory.u.f68981d.c();
        Pj().n();
        ga4.m.g();
        n34.f.b();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAccountRelease", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdAccountChangeHelper");
        com.tencent.mars.xlog.Log.i("AdAccountChangeHelper", "onAccountRelease");
        try {
            p34.o.b();
            n74.w0.a();
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("AdAccountChangeHelper", "onAccountRelease, exp=" + th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAccountRelease", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdAccountChangeHelper");
        this.X.dead();
        this.W.dead();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAccountReleased", "com.tencent.mm.plugin.sns.model.SnsCore");
    }

    public void wi() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkDir", "com.tencent.mm.plugin.sns.model.SnsCore");
        com.tencent.mm.vfs.w6.u(((n34.q2) ((p94.e0) i95.n0.c(p94.e0.class))).wi());
        com.tencent.mm.vfs.w6.u(((n34.q2) ((p94.e0) i95.n0.c(p94.e0.class))).Ai());
        com.tencent.mm.vfs.w6.t(za4.t0.g());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkDir", "com.tencent.mm.plugin.sns.model.SnsCore");
    }
}
