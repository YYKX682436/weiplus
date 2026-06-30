package zh1;

/* loaded from: classes8.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zh1.n f472878d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(zh1.n nVar) {
        super(1);
        this.f472878d = nVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.appbrand.openmaterial.ui.hybrid.OpenMaterialWebView $receiver = (com.tencent.mm.plugin.appbrand.openmaterial.ui.hybrid.OpenMaterialWebView) obj;
        kotlin.jvm.internal.o.g($receiver, "$this$$receiver");
        $receiver.J0(null, null);
        boolean C = com.tencent.mm.ui.bk.C();
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandOpenMaterialBottomSheet", "buildHybridBottomSheet, isDarkMode: " + C);
        $receiver.getSettings().B(C ? 2 : 0);
        java.lang.Object systemService = $receiver.getContext().getSystemService("window");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        $receiver.setConfigCallback((android.view.WindowManager) systemService);
        com.tencent.mm.plugin.appbrand.openmaterial.ui.hybrid.OpenMaterialJsBridge openMaterialJsBridge = new com.tencent.mm.plugin.appbrand.openmaterial.ui.hybrid.OpenMaterialJsBridge($receiver);
        zh1.n nVar = this.f472878d;
        zh1.e eVar = new zh1.e(nVar);
        openMaterialJsBridge.setLaunchWeAppDelegate(new zh1.c(nVar, eVar));
        openMaterialJsBridge.setWeAppExposureDelegate(new zh1.d(eVar, nVar));
        $receiver.addJavascriptInterface(openMaterialJsBridge, "OpenMaterialJsApi");
        zh1.n nVar2 = this.f472878d;
        nVar2.getClass();
        ((ku5.t0) ku5.t0.f312615d).g(new zh1.j(openMaterialJsBridge, nVar2, $receiver));
        this.f472878d.f472918m = openMaterialJsBridge;
        return jz5.f0.f302826a;
    }
}
