package cz3;

/* loaded from: classes15.dex */
public final class b {

    /* renamed from: c, reason: collision with root package name */
    public static com.tencent.mm.sdk.platformtools.o4 f225020c;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f225021d;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f225022e;

    /* renamed from: g, reason: collision with root package name */
    public static long f225024g;

    /* renamed from: a, reason: collision with root package name */
    public static final cz3.b f225018a = new cz3.b();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashMap f225019b = kz5.c1.i(new jz5.l(3600000L, 3), new jz5.l(86400000L, 10));

    /* renamed from: f, reason: collision with root package name */
    public static final long f225023f = 86400000;

    static {
        f225024g = 604800L;
        try {
            boolean a17 = gm0.j1.a();
            if (a17 && f225020c == null) {
                f225020c = com.tencent.mm.sdk.platformtools.o4.M(c01.z1.r() + "_scan_crash_mmkv");
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.ScanCrashManager", "initMMKV %s, mmkv: %s", java.lang.Boolean.valueOf(a17), f225020c);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ScanCrashManager", e17, "checkInitMMKV exception", new java.lang.Object[0]);
        }
        f225018a.getClass();
        long Ui = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ui(e42.d0.clicfg_scan_merge_disable_scan_goods_duration_seconds, 604800L);
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        f225024g = 86400 <= Ui && Ui < 604801 ? Ui : 604800L;
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanCrashManager", "initCrashConfig crashValidDuration: " + f225024g);
    }

    public static final void b(r45.tu5 crashInfo, yz5.q qVar) {
        java.util.Iterator it;
        yz5.q qVar2 = qVar;
        kotlin.jvm.internal.o.g(crashInfo, "crashInfo");
        java.util.Iterator it6 = f225019b.entrySet().iterator();
        long j17 = 0;
        long j18 = 0;
        boolean z17 = false;
        while (it6.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it6.next();
            long longValue = ((java.lang.Number) entry.getKey()).longValue();
            int intValue = ((java.lang.Number) entry.getValue()).intValue();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.LinkedList crashList = crashInfo.f386815d;
            kotlin.jvm.internal.o.f(crashList, "crashList");
            java.util.Iterator it7 = crashList.iterator();
            int i17 = 0;
            int i18 = 0;
            while (it7.hasNext()) {
                java.lang.Object next = it7.next();
                int i19 = i18 + 1;
                if (i18 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                java.util.Iterator it8 = it6;
                r45.uu5 uu5Var = (r45.uu5) next;
                long j19 = j17;
                long currentTimeMillis = java.lang.System.currentTimeMillis() - uu5Var.f387651d;
                if (currentTimeMillis <= longValue) {
                    it = it7;
                    com.tencent.mars.xlog.Log.w("MicroMsg.ScanCrashManager", "updateCrashInfo find crash diff: " + currentTimeMillis);
                    i17++;
                } else {
                    it = it7;
                }
                if (currentTimeMillis < f225023f) {
                    arrayList.add(uu5Var);
                    j18 = java.lang.Math.max(j18, uu5Var.f387651d);
                }
                if (i17 >= intValue) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.ScanCrashManager", "updateCrashInfo crash count >= limit count");
                    z17 = true;
                    j17 = longValue;
                } else {
                    j17 = j19;
                }
                it6 = it8;
                it7 = it;
                i18 = i19;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.ScanCrashManager", "checkWillCrash time: " + longValue + ", crashLimit: " + intValue + ", currentCrashCount: " + i17 + ", newCrashList: " + arrayList.size() + ", willCrash: " + z17);
            crashList.clear();
            crashList.addAll(arrayList);
            crashInfo.f386816e = z17;
            crashInfo.f386817f = j17;
            crashInfo.f386818g = j18;
            qVar2 = qVar;
            it6 = it6;
        }
        if (qVar2 != null) {
            qVar2.invoke(java.lang.Boolean.valueOf(z17), java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18));
        }
    }

    public final void a() {
        com.tencent.mm.sdk.platformtools.o4 o4Var = f225020c;
        long j17 = o4Var != null ? o4Var.getLong("key_crash_valid_timestamp", 0L) : 0L;
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanCrashManager", "checkCrashExpired crashValidTime: %s", java.lang.Long.valueOf(j17));
        if (j17 > 0 && com.tencent.mm.sdk.platformtools.y3.b(j17, f225024g * 1000)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ScanCrashManager", "checkCrashExpired crashInfo expire and clear");
            com.tencent.mm.sdk.platformtools.o4 o4Var2 = f225020c;
            if (o4Var2 != null) {
                o4Var2.d();
            }
            c(false, 0L);
            f225021d = false;
        }
    }

    public final void c(boolean z17, long j17) {
        android.content.SharedPreferences.Editor putLong;
        android.content.SharedPreferences.Editor putLong2;
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanCrashManager", "saveWillCrash willCrash: " + z17 + ", timeLimit: " + j17);
        f225021d = z17;
        com.tencent.mm.sdk.platformtools.o4 o4Var = f225020c;
        if (o4Var == null || (putLong = ((com.tencent.mm.sdk.platformtools.o4) o4Var.putBoolean("key_will_crash", z17)).putLong("key_will_crash_time_limit", j17)) == null || (putLong2 = putLong.putLong("key_crash_valid_timestamp", java.lang.System.currentTimeMillis())) == null) {
            return;
        }
        putLong2.apply();
    }
}
