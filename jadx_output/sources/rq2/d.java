package rq2;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: b, reason: collision with root package name */
    public static long f398817b;

    /* renamed from: c, reason: collision with root package name */
    public static long f398818c;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f398819d;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f398820e;

    /* renamed from: i, reason: collision with root package name */
    public static long f398824i;

    /* renamed from: j, reason: collision with root package name */
    public static boolean f398825j;

    /* renamed from: a, reason: collision with root package name */
    public static final rq2.d f398816a = new rq2.d();

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f398821f = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f398822g = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.HashSet f398823h = new java.util.HashSet();

    public final java.lang.String a(int i17, int i18) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(i17);
        sb6.append('_');
        sb6.append(i18);
        return sb6.toString();
    }

    public final rq2.a b(int i17, int i18) {
        if (i17 == 9 || i17 == 10) {
            i17 = 0;
        }
        return (rq2.a) f398821f.get(a(i17, i18));
    }

    public final boolean c(int i17, int i18) {
        com.tencent.mars.xlog.Log.i("FinderLiveNewSquareReporter", "isValidPullType: pullType=" + i17 + " tabType=" + i18);
        return i17 == 1 || i17 == 0 || i17 == 10 || i17 == 9 || i17 == 21 || i17 == 26;
    }

    public final void d(int i17, int i18, boolean z17, int i19) {
        rq2.a b17 = b(i17, i18);
        if (b17 != null) {
            b17.f398794e = i19;
            com.tencent.mars.xlog.Log.i("FinderLiveNewSquareReporter", "notifyLiveExitToSquare: isUseCache=" + z17 + ", pullType=" + i17 + ", tabType=" + i18);
            rq2.d dVar = f398816a;
            if (!z17) {
                dVar.g(i18);
                return;
            }
            b17.f398790a = 0L;
            f398824i = 0L;
            b17.f398792c = 0L;
            b17.f398793d = 0L;
            b17.f398796g = 0L;
            b17.f398795f = 0L;
            b17.f398798i = 0L;
            b17.f398797h = 0L;
            dVar.j(i17, i18);
        }
    }

    public final void e(int i17, int i18) {
        rq2.a b17 = b(i17, i18);
        if (b17 != null) {
            com.tencent.mars.xlog.Log.i("FinderLiveNewSquareReporter", "onDbEnd: tabType=" + i18 + ", pullType=" + i17);
            b17.f398796g = android.os.SystemClock.elapsedRealtime();
            rq2.a b18 = f398816a.b(i17, i18);
            if (b18 != null) {
                b18.f398797h = android.os.SystemClock.elapsedRealtime();
                com.tencent.mars.xlog.Log.i("FinderLiveNewSquareReporter", "onUIShowBegin: tabType=" + i18 + ", pullType=" + i17);
            }
        }
    }

    public final void f(int i17, int i18) {
        rq2.a b17 = b(i17, i18);
        if (b17 != null) {
            com.tencent.mars.xlog.Log.i("FinderLiveNewSquareReporter", "onDbStart tabType: " + i18);
            b17.f398795f = android.os.SystemClock.elapsedRealtime();
        }
    }

    public final void g(int i17) {
        com.tencent.mars.xlog.Log.i("FinderLiveNewSquareReporter", "onLoadingBarShow tabType: " + i17);
        f398824i = android.os.SystemClock.elapsedRealtime();
    }

    public final void h(int i17, int i18) {
        jz5.f0 f0Var;
        rq2.a b17 = b(i17, i18);
        if (b17 != null) {
            b17.f398798i = android.os.SystemClock.elapsedRealtime();
            com.tencent.mars.xlog.Log.i("FinderLiveNewSquareReporter", "onUIShowEnd: tabType=" + i18 + ", pullType=" + i17);
            f398816a.j(i17, i18);
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.i("FinderLiveNewSquareReporter", "onUIShowEnd data is null, tabType=" + i18 + ", pullType=" + i17);
        }
    }

    public final void i(boolean z17) {
        f398819d = z17;
        f398817b = android.os.SystemClock.elapsedRealtime();
        boolean z18 = ((c61.l7) i95.n0.c(c61.l7.class)).nk().L0(c92.g.f39738a.b() ? "FinderLiveEntrance" : "NearbyEntrance") != null;
        f398820e = z17 && z18;
        com.tencent.mars.xlog.Log.i("FinderLiveNewSquareReporter", "saveClickEnterTime isFromClick : " + z17 + " isFromRedClick: " + f398820e + " hasRedDot: " + z18);
    }

    public final void j(int i17, int i18) {
        rq2.a b17 = b(i17, i18);
        if (b17 != null) {
            if (i17 == 21 && b17.f398794e != 20) {
                com.tencent.mars.xlog.Log.i("FinderLiveNewSquareReporter", "tickReportEnd: do not report when enter live room, cgiType=" + b17.f398794e);
                return;
            }
            if (i17 == 26 && b17.f398794e != 23) {
                com.tencent.mars.xlog.Log.i("FinderLiveNewSquareReporter", "tickReportEnd: do not report when end page scroll up, cgiType=" + b17.f398794e);
                return;
            }
            if (f398819d) {
                b17.f398809t = f398818c - b17.f398790a;
            }
            if (b17.f398793d > 0 && b17.f398792c == 0) {
                java.lang.Long l17 = (java.lang.Long) f398822g.get(f398816a.a(i17, i18));
                b17.f398792c = l17 == null ? 0L : l17.longValue();
                com.tencent.mars.xlog.Log.i("FinderLiveNewSquareReporter", "tickReportEnd: get outside start cgi, pullType=" + i17 + ", tabType=" + i18);
            }
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = f398822g;
            rq2.d dVar = f398816a;
            concurrentHashMap.remove(dVar.a(i17, i18));
            b17.f398805p = java.lang.Math.max(0L, b17.f398792c - b17.f398790a);
            b17.f398806q = b17.f398793d - b17.f398792c;
            b17.f398808s = b17.f398796g - b17.f398795f;
            b17.f398807r = b17.f398798i - b17.f398797h;
            com.tencent.mars.xlog.Log.i("FinderLiveNewSquareReporter", "tickReportEnd: add to report list: pullType=" + i17 + ", tabType=" + i18 + ", enterCost=" + b17.f398805p + ", cgiCost=" + b17.f398806q + ", dbCost=" + b17.f398808s + ", uiCost=" + b17.f398807r + ", isClickEnter=" + b17.f398791b);
            java.util.HashSet hashSet = f398823h;
            synchronized (hashSet) {
                if (b17.a()) {
                    hashSet.add(b17);
                }
            }
        }
        if (f398820e) {
            com.tencent.mars.xlog.Log.i("FinderLiveNewSquareReporter", "tickReportEnd isFromRedClick clear reportedData");
            f398823h.clear();
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("tickReportEnd: isFromRedClick=");
        sb6.append(f398820e);
        sb6.append(", reportSize=");
        sb6.append(f398823h.size());
        sb6.append(", pullType=");
        sb6.append(i17);
        sb6.append(", tabType=");
        sb6.append(i18);
        com.tencent.mars.xlog.Log.i("FinderLiveNewSquareReporter", sb6.toString());
        if ((!r2.isEmpty()) && i18 == 10000) {
            new rq2.y().l();
        }
    }

    public final void k(int i17, int i18, java.lang.String tabName, int i19, int i27) {
        long elapsedRealtime;
        kotlin.jvm.internal.o.g(tabName, "tabName");
        java.lang.String a17 = a(i17, i18);
        boolean c17 = c(i17, i18);
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = f398821f;
        if (!c17) {
            com.tencent.mars.xlog.Log.i("FinderLiveNewSquareReporter", "tickReportStart remove data, key: " + a17);
            concurrentHashMap.remove(a17);
            return;
        }
        if (!concurrentHashMap.containsKey(a17)) {
            rq2.a aVar = new rq2.a();
            aVar.f398803n = i18;
            aVar.f398800k = i17;
            aVar.f398801l = i27;
            aVar.f398804o = tabName;
            aVar.f398802m = i19;
            concurrentHashMap.put(a17, aVar);
            com.tencent.mars.xlog.Log.i("FinderLiveNewSquareReporter", "tickReportStart add op tabName=".concat(tabName));
        }
        com.tencent.mars.xlog.Log.i("FinderLiveNewSquareReporter", "tickReportStart pullTypeParams: " + i17 + " tabType: " + i18 + " tabName: " + tabName);
        rq2.a b17 = b(i17, i18);
        if (b17 != null) {
            if (i17 == 0) {
                b17.f398791b = true;
                elapsedRealtime = f398817b;
            } else {
                f398819d = false;
                f398820e = false;
                elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            }
            b17.f398790a = elapsedRealtime;
        }
    }
}
