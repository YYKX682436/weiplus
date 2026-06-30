package fe;

/* loaded from: classes7.dex */
public class c extends com.tencent.mm.plugin.appbrand.v0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fe.g f261348d;

    public c(fe.g gVar) {
        this.f261348d = gVar;
    }

    @Override // com.tencent.mm.plugin.appbrand.v0
    public void b() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MBNiReporter", "hy: onCreate");
        fe.g gVar = this.f261348d;
        gVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.MBNiReporter", "hy: initStatis!");
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = gVar.f261361i;
        if (copyOnWriteArrayList != null && copyOnWriteArrayList.size() > 0) {
            gVar.f261361i.clear();
        }
        synchronized (gVar.f261362j) {
            if (gVar.f261362j.size() > 0) {
                gVar.f261362j.clear();
            }
        }
        gVar.f261357e = false;
        gVar.f261353a = 0;
        gVar.f261354b = 0L;
        gVar.f261355c = 0L;
    }

    @Override // com.tencent.mm.plugin.appbrand.v0
    public void c() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MBNiReporter", "hy: onDestroy");
        fe.g gVar = this.f261348d;
        gVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.MBNiReporter", "hy: release!");
        com.tencent.mm.plugin.appbrand.x0.e(gVar.f261356d, gVar.f261363k);
    }

    @Override // com.tencent.mm.plugin.appbrand.v0
    public void e(com.tencent.mm.plugin.appbrand.w0 w0Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MBNiReporter", "hy: onPause");
        fe.g gVar = this.f261348d;
        if (gVar.f261357e) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MBNiReporter", "hy: hasReported!");
            return;
        }
        ((ku5.t0) ku5.t0.f312615d).g(new fe.e(gVar));
    }

    @Override // com.tencent.mm.plugin.appbrand.v0
    public void g() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MBNiReporter", "hy: onResume");
    }
}
