package xc1;

/* loaded from: classes7.dex */
public final class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.AppBrandRuntime f453050d;

    public k(com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime) {
        this.f453050d = appBrandRuntime;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime = this.f453050d;
        com.tencent.luggage.sdk.config.AppBrandInitConfigLU u07 = ((ze.n) appBrandRuntime).u0();
        com.tencent.luggage.sdk.config.AppBrandInitWindowConfig appBrandInitWindowConfig = ((ze.n) appBrandRuntime).u0().B1;
        if (appBrandInitWindowConfig == null) {
            appBrandInitWindowConfig = new com.tencent.luggage.sdk.config.AppBrandInitWindowConfig(false, 0, null, null, false, null, null, 127, null);
        }
        appBrandInitWindowConfig.f47292m = k91.y3.DISABLED;
        u07.B1 = appBrandInitWindowConfig;
    }
}
