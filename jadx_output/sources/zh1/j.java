package zh1;

/* loaded from: classes8.dex */
public final class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.openmaterial.ui.hybrid.OpenMaterialJsBridge f472892d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zh1.n f472893e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.openmaterial.ui.hybrid.OpenMaterialWebView f472894f;

    public j(com.tencent.mm.plugin.appbrand.openmaterial.ui.hybrid.OpenMaterialJsBridge openMaterialJsBridge, zh1.n nVar, com.tencent.mm.plugin.appbrand.openmaterial.ui.hybrid.OpenMaterialWebView openMaterialWebView) {
        this.f472892d = openMaterialJsBridge;
        this.f472893e = nVar;
        this.f472894f = openMaterialWebView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        uv4.g g17 = com.tencent.mm.plugin.websearch.l2.g(7);
        if (g17 == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.AppBrandOpenMaterialBottomSheet", "loadDataAsync, openMaterialTemplate is null");
            return;
        }
        java.lang.String str = g17.l() + "/app.html";
        byte[] N = com.tencent.mm.vfs.w6.N(str, 0, -1);
        if (N != null) {
            if (!(N.length == 0)) {
                com.tencent.mm.plugin.appbrand.openmaterial.ui.hybrid.OpenMaterialJsBridge openMaterialJsBridge = this.f472892d;
                bi1.g gVar = ((di1.f) this.f472893e.f472916h).f232630b;
                kotlin.jvm.internal.o.f(gVar, "getOpenMaterialScene(...)");
                java.util.List<? extends com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialDetailModel> appBrandOpenMaterialDetailModels = this.f472893e.f472914f.f86252g;
                kotlin.jvm.internal.o.f(appBrandOpenMaterialDetailModels, "appBrandOpenMaterialDetailModels");
                ((ku5.t0) ku5.t0.f312615d).B(new zh1.i(this.f472894f, "file://" + str, openMaterialJsBridge.attachMyOpenMaterials2Template(N, gVar, appBrandOpenMaterialDetailModels)));
                return;
            }
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.AppBrandOpenMaterialBottomSheet", "loadDataAsync, rawHtmlContent is empty");
    }
}
