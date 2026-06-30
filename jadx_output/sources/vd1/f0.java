package vd1;

/* loaded from: classes7.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    public static final vd1.f0 f435573a = new vd1.f0();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f435574b = jz5.h.b(vd1.z.f435629d);

    /* renamed from: c, reason: collision with root package name */
    public static final long f435575c = java.util.concurrent.TimeUnit.MINUTES.toMillis(5);

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.sdk.platformtools.b4 f435576d = new com.tencent.mm.sdk.platformtools.b4(android.os.Looper.getMainLooper(), (com.tencent.mm.sdk.platformtools.a4) vd1.e0.f435570d, true);

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.HashSet f435577e = new java.util.HashSet();

    /* renamed from: f, reason: collision with root package name */
    public static final vd1.w f435578f = new vd1.w();

    /* renamed from: g, reason: collision with root package name */
    public static long f435579g;

    public final synchronized void a(java.util.List list, vd1.x xVar) {
        com.tencent.mm.sdk.platformtools.b4 b4Var = f435576d;
        long j17 = f435575c;
        b4Var.c(j17, j17);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        f435579g = android.os.SystemClock.elapsedRealtime();
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.JsApiOperateRealtimeReport.RealtimeReportQueue", "doCgi queue.size=" + list.size() + ", reason=" + xVar.name());
        if (list.isEmpty()) {
            return;
        }
        ((ch1.c) c()).b(1074L, 1L, list.size());
        c().a(1074L, 4L);
        vd1.f fVar = new vd1.f();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            vd1.y yVar = (vd1.y) it.next();
            java.util.LinkedList linkedList = fVar.f435572b.f392367d;
            r45.re7 re7Var = new r45.re7();
            re7Var.f384781d = yVar.f435623b;
            re7Var.f384782e = com.tencent.mm.protobuf.g.c(yVar.f435624c);
            re7Var.f384783f = yVar.f435627f;
            linkedList.add(re7Var);
        }
        fVar.a(null, new vd1.b0(list));
    }

    public final void b(com.tencent.mm.plugin.appbrand.y component, int i17, int i18, java.lang.String content, vd1.l priority) {
        long j17;
        kotlin.jvm.internal.o.g(component, "component");
        kotlin.jvm.internal.o.g(content, "content");
        kotlin.jvm.internal.o.g(priority, "priority");
        java.util.HashSet hashSet = f435577e;
        synchronized (hashSet) {
            com.tencent.mm.plugin.appbrand.AppBrandRuntime t37 = component.t3();
            kotlin.jvm.internal.o.e(t37, "null cannot be cast to non-null type com.tencent.luggage.sdk.runtime.AppBrandRuntimeLU");
            boolean add = hashSet.add((ze.n) t37);
            if (add && hashSet.size() == 1) {
                com.tencent.mm.sdk.platformtools.b4 b4Var = f435576d;
                long j18 = f435575c;
                b4Var.c(j18, j18);
            }
            if (add) {
                component.t3().N.a(new vd1.d0(component));
            }
        }
        c().a(1074L, 0L);
        synchronized (this) {
            vd1.w wVar = f435578f;
            wVar.b(new vd1.y(i17, i18, content, priority, component));
            vd1.n nVar = new vd1.n();
            nVar.b(component);
            nVar.f435605f = i17;
            nVar.f435606g = i18;
            nVar.f435607h = priority;
            nVar.f435608i = java.util.concurrent.TimeUnit.MILLISECONDS.toSeconds(f435575c);
            nVar.f435609j = 0;
            nVar.f435610k = vd1.m.f435595e;
            nVar.a();
            if (vd1.a0.f435561a[priority.ordinal()] == 1) {
                f435573a.a(wVar.a(65536L), vd1.x.f435620g);
            } else {
                vd1.v[] vVarArr = wVar.f435616a;
                java.util.ArrayList arrayList = new java.util.ArrayList(vVarArr.length);
                for (vd1.v vVar : vVarArr) {
                    synchronized (vVar.f435614c) {
                        j17 = vVar.f435615d;
                    }
                    arrayList.add(java.lang.Long.valueOf(j17));
                }
                if (kz5.n0.J0(arrayList) >= 65536) {
                    f435573a.a(f435578f.a(65536L), vd1.x.f435618e);
                } else {
                    long j19 = f435579g;
                    if (j19 > 0) {
                        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                        if (android.os.SystemClock.elapsedRealtime() - j19 >= f435575c) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.JsApiOperateRealtimeReport.RealtimeReportQueue", "enqueue, Util.ticksToNow(lastDoCgiTick) >= REPORT_PERIOD_INTERVAL");
                            f435573a.d(vd1.x.f435617d);
                        }
                    }
                }
            }
        }
    }

    public final com.tencent.mm.plugin.appbrand.profile.a c() {
        return (com.tencent.mm.plugin.appbrand.profile.a) ((jz5.n) f435574b).getValue();
    }

    public final void d(vd1.x xVar) {
        a(f435578f.a(65536L), xVar);
    }
}
