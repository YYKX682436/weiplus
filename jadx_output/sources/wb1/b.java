package wb1;

/* loaded from: classes7.dex */
public final class b implements com.tencent.mm.plugin.appbrand.jsapi.w {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wb1.h f444357d;

    public b(wb1.h hVar) {
        this.f444357d = hVar;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.w
    public void onDestroy() {
        wb1.h hVar = this.f444357d;
        android.view.Surface surface = hVar.f444380o;
        if (surface != null) {
            try {
                gh.t tVar = hVar.f444379n;
                if (tVar != null) {
                    tVar.a(surface, false);
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrand.SameLayer.AppBrandWebGLPluginHandler", e17, "handle page.onDestroy", new java.lang.Object[0]);
            }
            hVar.f444380o = null;
        }
        com.tencent.mm.plugin.appbrand.page.v5 v5Var = hVar.f444376h;
        if (v5Var != null) {
            v5Var.K(this);
        } else {
            kotlin.jvm.internal.o.o("componentView");
            throw null;
        }
    }
}
