package wf;

/* loaded from: classes7.dex */
public class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wf.b f445480d;

    public q(wf.b bVar) {
        this.f445480d = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        wf.b bVar = this.f445480d;
        com.tencent.mm.plugin.appbrand.jsapi.l m17 = bVar.f445422p.m();
        com.tencent.mm.plugin.appbrand.page.v5 V0 = m17 instanceof com.tencent.mm.plugin.appbrand.page.v5 ? (com.tencent.mm.plugin.appbrand.page.v5) m17 : m17 instanceof com.tencent.mm.plugin.appbrand.e9 ? ((com.tencent.mm.plugin.appbrand.e9) m17).V0() : null;
        if (V0 != null) {
            com.tencent.mm.plugin.appbrand.AppBrandRuntime runtime = V0.getRuntime();
            com.tencent.mars.xlog.Log.i(bVar.w(), "requestAppEnterBackground close runtime");
            runtime.S();
        }
    }
}
