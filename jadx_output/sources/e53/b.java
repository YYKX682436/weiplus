package e53;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final e53.b f249612a = new e53.b();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f249613b = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final com.tencent.mm.app.s2 f249614c = new e53.a();

    public static final void a(int i17) {
        java.lang.String v17;
        long elapsedRealtime;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = f249613b;
        if (concurrentHashMap == null || concurrentHashMap.isEmpty()) {
            return;
        }
        java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = (java.util.concurrent.ConcurrentHashMap) concurrentHashMap.remove(java.lang.Integer.valueOf(i17));
        if (concurrentHashMap2 != null) {
            java.util.Iterator it = concurrentHashMap2.entrySet().iterator();
            while (it.hasNext()) {
                e53.c cVar = (e53.c) ((java.util.Map.Entry) it.next()).getValue();
                java.lang.String str = cVar.f249619e;
                if (str == null || str.length() == 0) {
                    v17 = cVar.f249618d;
                } else if (cVar.f249624j != 0) {
                    if (cVar.f249623i) {
                        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                        elapsedRealtime = android.os.SystemClock.elapsedRealtime() - cVar.f249624j;
                    } else {
                        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                        elapsedRealtime = (android.os.SystemClock.elapsedRealtime() - cVar.f249624j) / 1000;
                    }
                    v17 = r26.i0.v(cVar.f249618d, cVar.f249619e, java.lang.String.valueOf(cVar.f249622h + elapsedRealtime), false, 4, null);
                } else {
                    v17 = r26.i0.v(cVar.f249618d, cVar.f249619e, java.lang.String.valueOf(cVar.f249622h), false, 4, null);
                }
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("gamelog.report, logId = ");
                int i18 = cVar.f249616b;
                sb6.append(i18);
                sb6.append(", reportOnDestroy, reportDuration:");
                sb6.append(cVar.f249622h);
                sb6.append(", reportContent = ");
                sb6.append(v17);
                com.tencent.mars.xlog.Log.i("MicroMsg.GamePageTimeReport", sb6.toString());
                jx3.f.INSTANCE.f(i18, v17, cVar.f249621g, false);
            }
        }
        f249614c.dead();
    }

    public static final void b(int i17) {
        long elapsedRealtime;
        java.lang.String v17;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = f249613b;
        if (concurrentHashMap == null || concurrentHashMap.isEmpty()) {
            return;
        }
        java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = (java.util.concurrent.ConcurrentHashMap) concurrentHashMap.get(java.lang.Integer.valueOf(i17));
        java.util.Iterator it = concurrentHashMap2 != null ? concurrentHashMap2.entrySet().iterator() : null;
        if (it != null) {
            while (it.hasNext()) {
                e53.c cVar = (e53.c) ((java.util.Map.Entry) it.next()).getValue();
                if (cVar.f249625k) {
                    java.lang.String str = cVar.f249619e;
                    if (str == null || str.length() == 0) {
                        v17 = cVar.f249618d;
                    } else {
                        if (cVar.f249623i) {
                            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                            elapsedRealtime = android.os.SystemClock.elapsedRealtime() - cVar.f249624j;
                        } else {
                            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                            elapsedRealtime = (android.os.SystemClock.elapsedRealtime() - cVar.f249624j) / 1000;
                        }
                        v17 = r26.i0.v(cVar.f249618d, cVar.f249619e, java.lang.String.valueOf(cVar.f249622h + elapsedRealtime), false, 4, null);
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.GamePageTimeReport", "gamelog.report, logId = " + cVar.f249616b + ", reportContent = " + v17);
                    jx3.f.INSTANCE.f(cVar.f249616b, v17, cVar.f249621g, false);
                    synchronized (f249612a) {
                        it.remove();
                    }
                }
            }
        }
    }

    public static final void c(int i17) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = f249613b;
        if ((concurrentHashMap2 == null || concurrentHashMap2.isEmpty()) || (concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) concurrentHashMap2.get(java.lang.Integer.valueOf(i17))) == null) {
            return;
        }
        java.util.Iterator it = concurrentHashMap.entrySet().iterator();
        while (it.hasNext()) {
            e53.c cVar = (e53.c) ((java.util.Map.Entry) it.next()).getValue();
            if (cVar.f249625k) {
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                cVar.f249624j = android.os.SystemClock.elapsedRealtime();
            }
        }
    }
}
