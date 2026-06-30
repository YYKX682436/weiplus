package zl2;

/* loaded from: classes3.dex */
public final class a5 {

    /* renamed from: b, reason: collision with root package name */
    public static volatile boolean f473655b;

    /* renamed from: c, reason: collision with root package name */
    public static long f473656c;

    /* renamed from: d, reason: collision with root package name */
    public static java.lang.String f473657d;

    /* renamed from: a, reason: collision with root package name */
    public static final zl2.a5 f473654a = new zl2.a5();

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f473658e = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f473659f = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.Set f473660g = new java.util.LinkedHashSet();

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.List f473661h = new java.util.ArrayList();

    public final long a(java.lang.String stage) {
        java.lang.Object putIfAbsent;
        kotlin.jvm.internal.o.g(stage, "stage");
        if (!f473655b) {
            return -1L;
        }
        java.lang.Long l17 = (java.lang.Long) f473658e.remove(stage);
        if (l17 == null) {
            com.tencent.mars.xlog.Log.w("LivePerformanceMonitor", "[" + f473656c + "] 未找到 stage: " + stage + " 的开始时间，请确保调用了 mark()");
            return -1L;
        }
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime() - l17.longValue();
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = f473659f;
        java.lang.Object obj = concurrentHashMap.get(stage);
        if (obj == null && (putIfAbsent = concurrentHashMap.putIfAbsent(stage, (obj = new java.util.ArrayList()))) != null) {
            obj = putIfAbsent;
        }
        ((java.util.List) obj).add(java.lang.Long.valueOf(elapsedRealtime));
        ((java.util.ArrayList) f473661h).add(new zl2.y4(stage, zl2.x4.f474026e, android.os.SystemClock.elapsedRealtime()));
        return elapsedRealtime;
    }

    public final long b(zl2.z4 z4Var, java.lang.String str) {
        if (kotlin.jvm.internal.o.b(z4Var.f474051a, str)) {
            return z4Var.f474052b;
        }
        java.util.Iterator it = z4Var.f474053c.iterator();
        while (it.hasNext()) {
            long b17 = f473654a.b((zl2.z4) it.next(), str);
            if (b17 > 0) {
                return b17;
            }
        }
        return 0L;
    }

    public final void c(java.lang.String stage) {
        kotlin.jvm.internal.o.g(stage, "stage");
        if (f473655b) {
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            f473658e.put(stage, java.lang.Long.valueOf(elapsedRealtime));
            f473660g.add(stage);
            ((java.util.ArrayList) f473661h).add(new zl2.y4(stage, zl2.x4.f474025d, elapsedRealtime));
        }
    }

    public final void d(zl2.z4 z4Var, int i17, java.lang.String str) {
        java.lang.String str2;
        boolean b17 = kotlin.jvm.internal.o.b(z4Var.f474051a, "root");
        zl2.a5 a5Var = f473654a;
        java.util.List list = z4Var.f474053c;
        if (b17) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                a5Var.d((zl2.z4) it.next(), i17, str);
            }
            return;
        }
        java.lang.String str3 = "";
        if (i17 != 0) {
            str2 = "├─ ";
            if (i17 != 1) {
                str2 = "│  " + r26.i0.s("│  ", i17 - 2) + "├─ ";
            }
        } else {
            str2 = "";
        }
        com.tencent.mars.xlog.Log.i("LivePerformanceMonitor", str + str2 + z4Var.f474051a + ": " + z4Var.f474052b + "ms");
        if (!list.isEmpty()) {
            if (i17 != 0) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(str);
                sb6.append(i17 != 1 ? "   " : "│  ");
                str3 = sb6.toString();
            }
            java.util.Iterator it6 = list.iterator();
            while (it6.hasNext()) {
                a5Var.d((zl2.z4) it6.next(), i17 + 1, str3);
            }
        }
    }
}
