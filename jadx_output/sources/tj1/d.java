package tj1;

/* loaded from: classes7.dex */
public final class d implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.AppBrandRuntime f419691d;

    public d(com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime) {
        this.f419691d = appBrandRuntime;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        com.tencent.mars.xlog.Log.i("Luggage.AppBrandTranslateLogic", "onMenuSelected index:" + i17);
        if (i17 == 0) {
            tj1.o oVar = new tj1.o();
            com.tencent.mm.plugin.appbrand.e9 C0 = this.f419691d.C0();
            kotlin.jvm.internal.o.f(C0, "getService(...)");
            oVar.x(C0, 1);
        }
    }
}
