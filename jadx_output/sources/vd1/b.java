package vd1;

/* loaded from: classes7.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final android.util.SparseArray f435562a = new android.util.SparseArray();

    /* renamed from: b, reason: collision with root package name */
    public final vd1.a f435563b = new vd1.a();

    public final void a() {
        this.f435563b.f435560a.clear();
        android.util.SparseArray sparseArray = this.f435562a;
        synchronized (sparseArray) {
            sparseArray.clear();
        }
    }

    public final void b(int i17, java.lang.String ret) {
        java.lang.Object obj;
        kotlin.jvm.internal.o.g(ret, "ret");
        android.util.SparseArray sparseArray = this.f435562a;
        synchronized (sparseArray) {
            obj = sparseArray.get(i17, null);
            if (obj != null) {
                sparseArray.remove(i17);
            }
        }
        vd1.g gVar = (vd1.g) obj;
        if (gVar == null) {
            return;
        }
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime() - gVar.f435583d;
        com.tencent.mm.plugin.appbrand.jsapi.d0 d0Var = gVar.f435580a;
        java.lang.String appId = d0Var != null ? d0Var.getAppId() : null;
        java.lang.String str = gVar.f435584e;
        java.lang.String k17 = gVar.f435581b.k();
        java.lang.String str2 = gVar.f435582c;
        int i18 = gVar.f435585f;
        java.util.Set set = com.tencent.mm.plugin.appbrand.report.model.e0.f87937a;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(appId)) {
            com.tencent.mm.plugin.appbrand.report.model.c0 c0Var = (com.tencent.mm.plugin.appbrand.report.model.c0) ((java.util.concurrent.ConcurrentLinkedQueue) com.tencent.mm.plugin.appbrand.report.model.e0.f87939c.f87936a).poll();
            if (c0Var == null) {
                c0Var = new com.tencent.mm.plugin.appbrand.report.model.c0(null);
            }
            c0Var.f87929d = appId;
            c0Var.f87930e = str;
            c0Var.f87931f = k17;
            c0Var.f87932g = str2;
            c0Var.f87933h = i18;
            c0Var.f87934i = elapsedRealtime;
            c0Var.f87935m = ret;
            ((java.util.concurrent.AbstractExecutorService) com.tencent.mm.plugin.appbrand.report.model.e0.f87938b).submit(c0Var);
        }
        vd1.a aVar = this.f435563b;
        aVar.getClass();
        aVar.f435560a.offer(gVar);
    }
}
