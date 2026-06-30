package com.tencent.mm.plugin.report.service;

/* loaded from: classes12.dex */
public abstract class x {

    /* renamed from: a, reason: collision with root package name */
    public static java.util.Map f158320a;

    /* renamed from: b, reason: collision with root package name */
    public static final lx3.f f158321b = new lx3.f(null);

    /* renamed from: c, reason: collision with root package name */
    public static int f158322c = -1;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f158323d = false;

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.Object f158324e = new java.lang.Object();

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f158325f = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.ThreadLocal f158326g = new com.tencent.mm.plugin.report.service.w();

    public static void a(java.util.ArrayList arrayList, boolean z17, boolean z18) {
        if (arrayList != null) {
            boolean z19 = false;
            for (int i17 = 0; i17 < arrayList.size(); i17++) {
                if (arrayList.get(i17) != null && com.tencent.mm.plugin.report.service.j.b((int) ((com.tencent.mars.smc.IDKey) arrayList.get(i17)).GetID())) {
                    java.lang.Exception exc = new java.lang.Exception("The IDKey has not applied yet, check your code. IDKey:(" + ((com.tencent.mars.smc.IDKey) arrayList.get(i17)).GetID() + "," + ((com.tencent.mars.smc.IDKey) arrayList.get(i17)).GetKey() + ")");
                    boolean z27 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                    com.tencent.mars.xlog.Log.e("MicroMsg.KVEasyReport", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(exc));
                    b(1566L, 1L, 1L, false);
                    z19 = true;
                }
            }
            if (z19) {
                return;
            }
            try {
                ((com.tencent.mars.smc.SmcManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.smc.SmcManager.class)).reportListIDKey((com.tencent.mars.smc.IDKey[]) arrayList.toArray(new com.tencent.mars.smc.IDKey[arrayList.size()]), z17, z18);
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.KVEasyReport", th6, "", new java.lang.Object[0]);
                if (!fp.h.a(20)) {
                    throw th6;
                }
                ((com.tencent.mars.smc.SmcManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.smc.SmcManager.class)).reportListIDKey((com.tencent.mars.smc.IDKey[]) arrayList.toArray(new com.tencent.mars.smc.IDKey[arrayList.size()]), z17, z18);
            }
        }
    }

    public static void b(long j17, long j18, long j19, boolean z17) {
        if (com.tencent.mm.plugin.report.service.j.b((int) j17)) {
            java.lang.Exception exc = new java.lang.Exception("The IDKey has not applied yet, check your code, IDKey:(" + j17 + "," + j18 + ")");
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.KVEasyReport", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(exc));
            b(1566L, 1L, 1L, false);
            return;
        }
        try {
            ((com.tencent.mars.smc.SmcManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.smc.SmcManager.class)).reportIDKey(j17, j18, j19, z17);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.KVEasyReport", th6, "", new java.lang.Object[0]);
            if (!fp.h.a(20)) {
                throw th6;
            }
            ((com.tencent.mars.smc.SmcManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.smc.SmcManager.class)).reportIDKey(j17, j18, j19, z17);
        }
        if (f158323d) {
            if (f158320a == null) {
                k();
            }
            long k17 = com.tencent.mm.sdk.platformtools.t8.k1((java.lang.Long) ((java.util.HashMap) f158320a).get(java.lang.Long.valueOf(j17)), 0L);
            if (k17 > 0) {
                b(k17, j18, j19, z17);
            }
        }
    }

    public static void c(long j17, long j18, long j19, boolean z17) {
        if (com.tencent.mm.plugin.report.service.j.b((int) j17)) {
            java.lang.Exception exc = new java.lang.Exception("The IDKey has not applied yet, check your code, IDKey:(" + j17 + "," + j18 + ")");
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.KVEasyReport", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(exc));
            b(1566L, 1L, 1L, false);
            return;
        }
        try {
            ((com.tencent.mars.smc.SmcManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.smc.SmcManager.class)).reportIDKey(j17, j18, j19, z17);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.KVEasyReport", th6, "", new java.lang.Object[0]);
            if (!fp.h.a(20)) {
                throw th6;
            }
            ((com.tencent.mars.smc.SmcManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.smc.SmcManager.class)).reportIDKey(j17, j18, j19, z17);
        }
        if (f158323d) {
            if (f158320a == null) {
                k();
            }
            long k17 = com.tencent.mm.sdk.platformtools.t8.k1((java.lang.Long) ((java.util.HashMap) f158320a).get(java.lang.Long.valueOf(j17)), 0L);
            if (k17 > 0) {
                b(k17, j18, j19, z17);
            }
        }
    }

    public static void d(long j17, byte[] bArr, boolean z17, boolean z18) {
        if (!z18) {
            ((com.tencent.mars.smc.SmcManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.smc.SmcManager.class)).writeKvPbData(j17, bArr, z17);
            return;
        }
        try {
            ((com.tencent.mars.smc.SmcManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.smc.SmcManager.class)).writeImportKvPbData(j17, bArr, z17);
        } catch (java.lang.Exception e17) {
            boolean z19 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.KVEasyReport", "localReport :%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
        }
    }

    public static boolean e(long j17, boolean z17) {
        if (z17) {
            return true;
        }
        return f158325f.containsKey(java.lang.Long.valueOf(j17));
    }

    public static void f(long j17, java.lang.String str, boolean z17, boolean z18, boolean z19) {
        boolean e17 = e(j17, z19);
        if (z18) {
            try {
                ((com.tencent.mars.smc.SmcManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.smc.SmcManager.class)).writeImportKvData(j17, str, z17, e17);
            } catch (java.lang.Exception e18) {
                boolean z27 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                com.tencent.mars.xlog.Log.e("MicroMsg.KVEasyReport", "localReport :%s", com.tencent.mm.sdk.platformtools.z3.c(e18));
            }
        } else {
            try {
                ((com.tencent.mars.smc.SmcManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.smc.SmcManager.class)).writeKvData(j17, str, z17, e17);
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.KVEasyReport", th6, "", new java.lang.Object[0]);
                if (!fp.h.a(20)) {
                    throw th6;
                }
                ((com.tencent.mars.smc.SmcManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.smc.SmcManager.class)).writeKvData(j17, str, z17, e17);
            }
        }
        j(j17, str);
    }

    public static void g(long j17, java.lang.String str, boolean z17, boolean z18, boolean z19) {
        boolean e17 = e(j17, z19);
        if (z18) {
            try {
                ((com.tencent.mars.smc.SmcManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.smc.SmcManager.class)).writeImportKvData(j17, str, z17, e17);
            } catch (java.lang.Exception e18) {
                boolean z27 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                com.tencent.mars.xlog.Log.e("MicroMsg.KVEasyReport", "localReport :%s", com.tencent.mm.sdk.platformtools.z3.c(e18));
            }
        } else {
            try {
                ((com.tencent.mars.smc.SmcManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.smc.SmcManager.class)).writeKvData(j17, str, z17, e17);
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.KVEasyReport", th6, "", new java.lang.Object[0]);
                if (!fp.h.a(20)) {
                    throw th6;
                }
                ((com.tencent.mars.smc.SmcManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.smc.SmcManager.class)).writeKvData(j17, str, z17, e17);
            }
        }
        j(j17, str);
    }

    public static void h(long j17, long j18, java.lang.String str, boolean z17, boolean z18, boolean z19) {
        boolean e17 = e(j17, z19);
        if (z18) {
            try {
                ((com.tencent.mars.smc.SmcManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.smc.SmcManager.class)).writeImportKvDataWithType(j17, j18, str, z17, e17);
            } catch (java.lang.Exception e18) {
                boolean z27 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                com.tencent.mars.xlog.Log.e("MicroMsg.KVEasyReport", "localReport :%s", com.tencent.mm.sdk.platformtools.z3.c(e18));
            }
        } else {
            try {
                ((com.tencent.mars.smc.SmcManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.smc.SmcManager.class)).writeKvDataWithType(j17, j18, str, z17, e17);
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.KVEasyReport", th6, "", new java.lang.Object[0]);
                if (!fp.h.a(20)) {
                    throw th6;
                }
                ((com.tencent.mars.smc.SmcManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.smc.SmcManager.class)).writeKvDataWithType(j17, j18, str, z17, e17);
            }
        }
        j(j17, str);
    }

    public static void i(long j17, long j18, java.lang.String str, boolean z17, boolean z18, boolean z19) {
        boolean e17 = e(j17, z19);
        if (z18) {
            try {
                ((com.tencent.mars.smc.SmcManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.smc.SmcManager.class)).writeImportKvDataWithType(j17, j18, str, z17, e17);
            } catch (java.lang.Exception e18) {
                boolean z27 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                com.tencent.mars.xlog.Log.e("MicroMsg.KVEasyReport", "localReport :%s", com.tencent.mm.sdk.platformtools.z3.c(e18));
            }
        } else {
            try {
                ((com.tencent.mars.smc.SmcManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.smc.SmcManager.class)).writeKvDataWithType(j17, j18, str, z17, e17);
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.KVEasyReport", th6, "", new java.lang.Object[0]);
                if (!fp.h.a(20)) {
                    throw th6;
                }
                ((com.tencent.mars.smc.SmcManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.smc.SmcManager.class)).writeKvDataWithType(j17, j18, str, z17, e17);
            }
        }
        j(j17, str);
    }

    public static void j(long j17, java.lang.String str) {
        java.lang.ThreadLocal threadLocal = f158326g;
        java.lang.Boolean bool = (java.lang.Boolean) threadLocal.get();
        if (bool == null || !bool.booleanValue()) {
            try {
                threadLocal.set(java.lang.Boolean.TRUE);
                com.tencent.mm.autogen.events.KvReportEvent kvReportEvent = new com.tencent.mm.autogen.events.KvReportEvent();
                am.ji jiVar = kvReportEvent.f54460g;
                jiVar.f7033a = j17;
                jiVar.f7034b = str;
                kvReportEvent.e();
            } finally {
                threadLocal.set(java.lang.Boolean.FALSE);
            }
        }
    }

    public static synchronized void k() {
        int i17;
        synchronized (com.tencent.mm.plugin.report.service.x.class) {
            if (f158320a == null) {
                f158320a = new java.util.HashMap(20);
            }
            r45.gw3 a17 = f158321b.a();
            if (a17 != null && (i17 = a17.f375558d) != f158322c) {
                f158322c = i17;
                f158320a.clear();
                java.util.LinkedList linkedList = a17.f375559e;
                if (linkedList != null) {
                    java.util.Iterator it = linkedList.iterator();
                    while (it.hasNext()) {
                        r45.bq4 bq4Var = (r45.bq4) it.next();
                        f158320a.put(new java.lang.Long(bq4Var.f370989d), new java.lang.Long(bq4Var.f370990e));
                    }
                }
            }
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.i("MicroMsg.KVEasyReport", "summerhv reloadHeavyUserIDMap heavyUserIDMap[%d][%d][%s], stack[%s]", java.lang.Integer.valueOf(f158322c), java.lang.Integer.valueOf(f158320a.size()), f158320a, new com.tencent.mm.sdk.platformtools.z3());
        }
    }

    public static void l(boolean z17) {
        java.lang.String[] split;
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(f158323d);
        java.lang.Boolean valueOf2 = java.lang.Boolean.valueOf(z17);
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.i("MicroMsg.KVEasyReport", "summerhv setHeavyUser [%b %b], stack[%s]", valueOf, valueOf2, new com.tencent.mm.sdk.platformtools.z3());
        f158323d = z17;
        j62.e g17 = j62.e.g();
        g17.getClass();
        java.util.HashSet hashSet = new java.util.HashSet();
        java.lang.String j17 = g17.j("clicfg_ignore_freq_logid", "", false, true);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(j17) && (split = j17.split(";")) != null) {
            for (java.lang.String str : split) {
                hashSet.add(java.lang.Long.valueOf(com.tencent.mm.sdk.platformtools.t8.V(str, -1L)));
            }
        }
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = f158325f;
        concurrentHashMap.clear();
        java.util.Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            concurrentHashMap.put((java.lang.Long) it.next(), f158324e);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.KVEasyReport", "reset ignore freq limit logid [%s]", concurrentHashMap);
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_smc_max_log_item_size, 15);
        if (Ni > 0) {
            ((com.tencent.mars.smc.SmcManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.smc.SmcManager.class)).SetMaxLogItemSize(Ni);
        }
    }
}
