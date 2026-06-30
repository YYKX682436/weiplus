package com.tencent.mm.plugin.performance.watchdogs;

/* loaded from: classes12.dex */
public class j implements java.lang.Runnable {

    /* renamed from: p, reason: collision with root package name */
    public static final com.tencent.mm.plugin.performance.watchdogs.j f153064p = new com.tencent.mm.plugin.performance.watchdogs.j();

    /* renamed from: q, reason: collision with root package name */
    public static final java.util.Set f153065q;

    /* renamed from: d, reason: collision with root package name */
    public boolean f153066d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f153067e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f153068f;

    /* renamed from: g, reason: collision with root package name */
    public int f153069g;

    /* renamed from: h, reason: collision with root package name */
    public int f153070h;

    /* renamed from: o, reason: collision with root package name */
    public boolean f153074o;

    /* renamed from: n, reason: collision with root package name */
    public int f153073n = 1024;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.Map f153071i = new java.util.HashMap();

    /* renamed from: m, reason: collision with root package name */
    public final java.util.Map f153072m = new java.util.HashMap();

    static {
        java.util.HashSet hashSet = new java.util.HashSet();
        f153065q = hashSet;
        hashSet.add("anon_inode:sync_file");
    }

    public static com.tencent.mm.plugin.performance.watchdogs.j b() {
        return f153064p;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00c6 A[Catch: Exception -> 0x0172, all -> 0x0174, TryCatch #1 {, blocks: (B:8:0x0052, B:67:0x0058, B:10:0x0063, B:14:0x0069, B:16:0x0078, B:18:0x007c, B:20:0x0091, B:24:0x00c0, B:26:0x00c6, B:30:0x00d6, B:32:0x00de, B:36:0x00e8, B:38:0x00f7, B:39:0x0106, B:41:0x010e, B:42:0x0124, B:44:0x0133, B:46:0x0145, B:48:0x0117, B:50:0x009a, B:53:0x00a4, B:55:0x00aa, B:56:0x00a0), top: B:7:0x0052 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d6 A[Catch: Exception -> 0x0172, all -> 0x0174, TryCatch #1 {, blocks: (B:8:0x0052, B:67:0x0058, B:10:0x0063, B:14:0x0069, B:16:0x0078, B:18:0x007c, B:20:0x0091, B:24:0x00c0, B:26:0x00c6, B:30:0x00d6, B:32:0x00de, B:36:0x00e8, B:38:0x00f7, B:39:0x0106, B:41:0x010e, B:42:0x0124, B:44:0x0133, B:46:0x0145, B:48:0x0117, B:50:0x009a, B:53:0x00a4, B:55:0x00aa, B:56:0x00a0), top: B:7:0x0052 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0190  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a() {
        /*
            Method dump skipped, instructions count: 447
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.performance.watchdogs.j.a():int");
    }

    public long c() {
        return com.tencent.matrix.fd.FDDumpBridge.getInodesFreeCount();
    }

    public long d() {
        return com.tencent.matrix.fd.FDDumpBridge.getInodesTotalCount();
    }

    public final boolean e(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return true;
        }
        java.util.Iterator it = ((java.util.HashSet) f153065q).iterator();
        while (it.hasNext()) {
            if (str.matches((java.lang.String) it.next())) {
                return true;
            }
        }
        return false;
    }

    public final java.lang.String f() {
        java.util.ArrayList arrayList = new java.util.ArrayList(((java.util.HashMap) this.f153072m).entrySet());
        java.util.Collections.sort(arrayList, new com.tencent.mm.plugin.performance.watchdogs.k(this));
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.util.Iterator it = arrayList.iterator();
        int i17 = 0;
        while (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            com.tencent.mars.xlog.Log.e("MicroMsg.FDWatchDog", ">>>>>>>>>>>> FD SOS: type = %s, count = %s", entry.getKey(), entry.getValue());
            java.util.Map map = (java.util.Map) ((java.util.HashMap) this.f153071i).get(entry.getKey());
            if (map != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList(map.entrySet());
                java.util.Collections.sort(arrayList2, new com.tencent.mm.plugin.performance.watchdogs.l(this));
                java.util.Iterator it6 = arrayList2.iterator();
                while (it6.hasNext()) {
                    java.util.Map.Entry entry2 = (java.util.Map.Entry) it6.next();
                    com.tencent.mars.xlog.Log.e("MicroMsg.FDWatchDog", "-> [%s] %s", entry2.getValue(), entry2.getKey());
                    int i18 = i17 + 1;
                    if (i17 < 40) {
                        sb6.append("[");
                        sb6.append(entry2.getValue());
                        sb6.append("]");
                        sb6.append((java.lang.String) entry2.getKey());
                        sb6.append(";");
                    }
                    i17 = i18;
                }
            }
        }
        java.lang.String sb7 = sb6.toString();
        com.tencent.mars.xlog.Log.e("MicroMsg.FDWatchDog", "top path is %s", sb7);
        return sb7;
    }

    public final int g(com.tencent.mm.plugin.performance.watchdogs.m mVar) {
        java.lang.Integer num = (java.lang.Integer) ((java.util.HashMap) this.f153072m).get(mVar.name());
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = com.tencent.mm.sdk.platformtools.x2.n() ? 100 : com.tencent.mm.sdk.platformtools.x2.s() ? 120 : com.tencent.mm.sdk.platformtools.x2.j() ? 140 : com.tencent.mm.sdk.platformtools.x2.p() ? 150 : 0;
        int a17 = a();
        if (a17 <= 256 && a17 - this.f153070h > 32) {
            jx3.f.INSTANCE.idkeyStat(1031L, i17 - 2, 1L, false);
            this.f153070h = java.lang.Math.max(a17, this.f153070h);
        } else if (256 < a17 && a17 <= 512 && !this.f153066d) {
            jx3.f.INSTANCE.idkeyStat(1031L, i17 - 1, 1L, false);
            this.f153066d = true;
        } else if (512 < a17 && a17 <= 768 && !this.f153067e) {
            jx3.f.INSTANCE.idkeyStat(1031L, i17, 1L, false);
            this.f153067e = true;
        } else if (768 < a17 && a17 <= 896 && !this.f153068f) {
            jx3.f.INSTANCE.idkeyStat(1031L, i17 + 1, 1L, false);
            this.f153068f = true;
        } else if (a17 > 896) {
            jx3.f.INSTANCE.idkeyStat(1031L, i17 + 2, 1L, false);
            com.tencent.mars.xlog.Log.e("MicroMsg.FDWatchDog", ">>>>>>>>>>>> FD SOS: total count = %d", java.lang.Integer.valueOf(a17));
        }
        if (a17 > this.f153073n * 0.9d && !this.f153074o) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FDWatchDog", ">>>>>>>>>>>> FD SOS: total count = %d", java.lang.Integer.valueOf(a17));
            this.f153074o = true;
            jx3.f fVar = jx3.f.INSTANCE;
            fVar.idkeyStat(1031L, i17 + 4, 1L, false);
            fVar.d(17899, java.lang.Integer.valueOf(a17), java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), bm5.f1.a(), java.lang.Integer.valueOf(g(com.tencent.mm.plugin.performance.watchdogs.m.FD_TYPE_ANNON_INODE_EVENT)), java.lang.Integer.valueOf(g(com.tencent.mm.plugin.performance.watchdogs.m.FD_TYPE_ANNON_INODE_DMABUF)), java.lang.Integer.valueOf(g(com.tencent.mm.plugin.performance.watchdogs.m.FD_TYPE_SOCKET)), java.lang.Integer.valueOf(g(com.tencent.mm.plugin.performance.watchdogs.m.FD_TYPE_PATH_DATA_MM_FILES_MMKV)), java.lang.Integer.valueOf(g(com.tencent.mm.plugin.performance.watchdogs.m.FD_TYPE_PATH_DATA_MM_FILES_KVCOMM)), java.lang.Integer.valueOf(g(com.tencent.mm.plugin.performance.watchdogs.m.FD_TYPE_PATH_DATA_MM_FILES_XLOG)), java.lang.Integer.valueOf(g(com.tencent.mm.plugin.performance.watchdogs.m.FD_TYPE_PATH_DATA_MM_FILES_OTHERS)), java.lang.Integer.valueOf(g(com.tencent.mm.plugin.performance.watchdogs.m.FD_TYPE_PATH_DATA_MM_MICRO_MSG)), java.lang.Integer.valueOf(g(com.tencent.mm.plugin.performance.watchdogs.m.FD_TYPE_PATH_DATA_MM_OTHERS)), java.lang.Integer.valueOf(g(com.tencent.mm.plugin.performance.watchdogs.m.FD_TYPE_PATH_EXT_AC_VOICE)), java.lang.Integer.valueOf(g(com.tencent.mm.plugin.performance.watchdogs.m.FD_TYPE_PATH_EXT_AC_VIDEO)), java.lang.Integer.valueOf(g(com.tencent.mm.plugin.performance.watchdogs.m.FD_TYPE_PATH_EXT_AC_ATTACHMENT)), java.lang.Integer.valueOf(g(com.tencent.mm.plugin.performance.watchdogs.m.FD_TYPE_PATH_EXT_AC_IMAGE)), java.lang.Integer.valueOf(g(com.tencent.mm.plugin.performance.watchdogs.m.FD_TYPE_PATH_EXT_AC_OTHERS)), java.lang.Integer.valueOf(g(com.tencent.mm.plugin.performance.watchdogs.m.FD_TYPE_PATH_EXT_OTHERS)), java.lang.Integer.valueOf(g(com.tencent.mm.plugin.performance.watchdogs.m.FD_TYPE_PATH_SYSTEM_FRAMEWORK)), java.lang.Integer.valueOf(g(com.tencent.mm.plugin.performance.watchdogs.m.FD_TYPE_PATH_DEV_ASHMEM)), java.lang.Integer.valueOf(g(com.tencent.mm.plugin.performance.watchdogs.m.FD_TYPE_PATH_DEV_OTHERS)), java.lang.Integer.valueOf(g(com.tencent.mm.plugin.performance.watchdogs.m.FD_TYPE_OTHERS)), f(), java.lang.Integer.valueOf(this.f153069g), java.lang.Integer.valueOf(g(com.tencent.mm.plugin.performance.watchdogs.m.FD_TYPE_ANNON_INODE_GRALLOC)), java.lang.Integer.valueOf(g(com.tencent.mm.plugin.performance.watchdogs.m.FD_TYPE_PIPE)), java.lang.Integer.valueOf(g(com.tencent.mm.plugin.performance.watchdogs.m.FD_TYPE_ANNON_INODE_MALITL)), 1, java.lang.Integer.valueOf(this.f153073n), java.lang.Integer.valueOf(g(com.tencent.mm.plugin.performance.watchdogs.m.FD_TYPE_RAW_PATH)));
        }
        ((ku5.t0) ku5.t0.f312615d).k(this, 1800000L);
    }
}
