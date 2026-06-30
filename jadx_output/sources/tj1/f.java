package tj1;

/* loaded from: classes7.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final tj1.f f419693a = new tj1.f();

    /* renamed from: b, reason: collision with root package name */
    public static tj1.b f419694b;

    public final void a(com.tencent.mm.plugin.appbrand.AppBrandRuntime runtime) {
        kotlin.jvm.internal.o.g(runtime, "runtime");
        com.tencent.mm.plugin.appbrand.page.v5 pageView = runtime.x0().getPageView();
        if (pageView == null) {
            com.tencent.mars.xlog.Log.w("Luggage.AppBrandTranslateLogic", "translateClick error, pageView is null, runtime:" + runtime);
            return;
        }
        tj1.m W1 = pageView.W1();
        com.tencent.mars.xlog.Log.i("Luggage.AppBrandTranslateLogic", "translateClick pageState:" + W1);
        if (W1 != tj1.m.f419704f) {
            if (W1 == tj1.m.f419705g) {
                tj1.o oVar = new tj1.o();
                com.tencent.mm.plugin.appbrand.e9 C0 = runtime.C0();
                kotlin.jvm.internal.o.f(C0, "getService(...)");
                oVar.x(C0, 0);
                return;
            }
            return;
        }
        android.app.Activity r07 = runtime.r0();
        if (r07 == null) {
            com.tencent.mars.xlog.Log.w("Luggage.AppBrandTranslateLogic", "translateClick error, context is null, runtime:" + runtime);
        } else {
            fl1.b bVar = new fl1.b(r07);
            bVar.E(com.tencent.mm.R.string.m6v);
            bVar.A(r07.getString(com.tencent.mm.R.string.m4l), true, new tj1.e(r07));
            bVar.w(r07.getString(com.tencent.mm.R.string.m6x), true, null);
            ((fl1.c0) runtime.getDialogContainer()).c(bVar);
        }
    }
}
