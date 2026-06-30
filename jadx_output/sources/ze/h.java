package ze;

/* loaded from: classes7.dex */
public class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ze.n f471729d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.luggage.sdk.config.AppBrandInitConfigLU f471730e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.report.AppBrandStatObject f471731f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ze.l f471732g;

    public h(ze.l lVar, ze.n nVar, com.tencent.luggage.sdk.config.AppBrandInitConfigLU appBrandInitConfigLU, com.tencent.mm.plugin.appbrand.report.AppBrandStatObject appBrandStatObject) {
        this.f471732g = lVar;
        this.f471729d = nVar;
        this.f471730e = appBrandInitConfigLU;
        this.f471731f = appBrandStatObject;
    }

    @Override // java.lang.Runnable
    public void run() {
        ze.l lVar = this.f471732g;
        android.app.Activity w17 = lVar.w();
        java.util.LinkedList linkedList = com.tencent.mm.plugin.appbrand.widget.input.h1.f91462u;
        com.tencent.mm.plugin.appbrand.widget.input.h1 h1Var = (com.tencent.mm.plugin.appbrand.widget.input.h1) w17.findViewById(com.tencent.mm.R.id.a0o);
        if (h1Var != null) {
            h1Var.c();
        }
        com.tencent.luggage.sdk.config.AppBrandInitConfigLU appBrandInitConfigLU = this.f471730e;
        ze.n nVar = this.f471729d;
        if (nVar == null) {
            lVar.J(appBrandInitConfigLU.f77278d);
        }
        ze.n nVar2 = (ze.n) lVar.L(appBrandInitConfigLU.f77278d);
        if (nVar2 != null && lVar.getActiveRuntime() == nVar2 && nVar2.J1()) {
            com.tencent.mars.xlog.Log.e("Luggage.AppBrandRuntimeContainerLU[AppBrandSplashAd]", "can't launch runtime that support mutilPageStack when it is active");
            return;
        }
        appBrandInitConfigLU.f47269b2 = this.f471731f;
        if (nVar2 == null) {
            appBrandInitConfigLU.f77290s = sj1.l.f(appBrandInitConfigLU.f77278d, "public:prepare", "小程序环境初始化");
            sj1.l.e(appBrandInitConfigLU.f77278d, "internal:prepare", "createRuntime");
            nVar2 = (ze.n) lVar.I(appBrandInitConfigLU);
            sj1.l.g(appBrandInitConfigLU.f77278d);
            if (nVar2 != null && nVar2.u0() != null) {
                n91.g gVar = ((com.tencent.mm.plugin.appbrand.o6) nVar2).K2;
                if (!(gVar != null && gVar.f335873c.ordinal() <= 1)) {
                    boolean v07 = nVar2.v0();
                    xi1.o oVar = xi1.o.PORTRAIT;
                    if (v07) {
                        com.tencent.luggage.sdk.config.AppBrandInitConfigLU u07 = nVar2.u0();
                        com.tencent.mm.plugin.appbrand.ui.AppBrandUI appBrandUI = ((com.tencent.mm.plugin.appbrand.ui.b8) lVar.f74841t).f89579a;
                        if (appBrandUI != null && !appBrandUI.isFinishing()) {
                            com.tencent.mm.plugin.appbrand.platform.window.activity.j orientationHandler = lVar.getOrientationHandler();
                            if (orientationHandler == null) {
                                com.tencent.mars.xlog.Log.e("Luggage.AppBrandRuntimeContainerLU[AppBrandSplashAd]", "tryRequestOrientationWithSplashAd, appId:%s, orientation:%s, NULL orientationHandler", u07.f77278d, u07.f77282h);
                            } else {
                                java.lang.String str = u07.f77278d;
                                com.tencent.mars.xlog.Log.i("Luggage.AppBrandRuntimeContainerLU[AppBrandSplashAd]", "tryRequestOrientationWithSplashAd, appId:%s, config.Orientation:%s", str, u07.f77282h);
                                orientationHandler.b(oVar, new ze.i(lVar, str));
                            }
                        }
                    } else {
                        com.tencent.luggage.sdk.config.AppBrandInitConfigLU u08 = nVar2.u0();
                        if (!android.text.TextUtils.isEmpty(u08.f77282h) && u08.k()) {
                            com.tencent.mm.plugin.appbrand.platform.window.activity.j orientationHandler2 = lVar.getOrientationHandler();
                            if (orientationHandler2 == null) {
                                com.tencent.mars.xlog.Log.e("Luggage.AppBrandRuntimeContainerLU[AppBrandSplashAd]", "tryRequestOrientationWithoutAd appId[%s] orientation[%s], NULL orientationHandler", u08.f77278d, u08.f77282h);
                            } else {
                                java.lang.String str2 = u08.f77278d;
                                com.tencent.mars.xlog.Log.i("Luggage.AppBrandRuntimeContainerLU[AppBrandSplashAd]", "tryRequestOrientationWithoutAd, appId:%s, config.Orientation:%s", str2, u08.f77282h);
                                java.lang.String str3 = u08.f77282h;
                                xi1.o d17 = android.text.TextUtils.isEmpty(str3) ? null : xi1.o.d(str3);
                                if (d17 != null) {
                                    oVar = d17;
                                }
                                orientationHandler2.b(oVar, new ze.j(lVar, str2));
                            }
                        }
                    }
                }
            }
            sj1.l.e(appBrandInitConfigLU.f77278d, "internal:prepare", "loadNew");
            lVar.O(nVar, nVar2, appBrandInitConfigLU);
            sj1.l.g(appBrandInitConfigLU.f77278d);
        } else if (nVar == nVar2) {
            lVar.N(null, nVar2, appBrandInitConfigLU);
            lVar.Q();
        } else {
            lVar.N(nVar, nVar2, appBrandInitConfigLU);
        }
        if (nVar2.V1() || !lVar.n(nVar2)) {
            return;
        }
        if (nVar2.B0() != null) {
            nVar2.M1(true);
        } else {
            nVar2.M1(false);
        }
    }
}
