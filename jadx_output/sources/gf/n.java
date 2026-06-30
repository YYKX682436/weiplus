package gf;

/* loaded from: classes7.dex */
public final class n implements com.tencent.mm.plugin.appbrand.jsruntime.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f271132d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.luggage.skyline.wxa.AppServiceSkylineExtensionImpl f271133e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.skyline.SkylineRuntime f271134f;

    public n(int i17, com.tencent.luggage.skyline.wxa.AppServiceSkylineExtensionImpl appServiceSkylineExtensionImpl, com.tencent.skyline.SkylineRuntime skylineRuntime) {
        this.f271132d = i17;
        this.f271133e = appServiceSkylineExtensionImpl;
        this.f271134f = skylineRuntime;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsruntime.x
    public final void onDestroy() {
        boolean z17;
        boolean unused;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("v8 destroy callback ");
        sb6.append(this.f271132d);
        sb6.append(" mSkylineRuntimeJNIBootstrapDone:");
        z17 = this.f271133e.f47711g;
        sb6.append(z17);
        com.tencent.mars.xlog.Log.i("AppServiceSkylineExtensionImpl", sb6.toString());
        long runtimePtr = this.f271134f.getRuntimePtr();
        com.tencent.luggage.skyline.wxa.AppServiceSkylineExtensionImpl appServiceSkylineExtensionImpl = this.f271133e;
        unused = appServiceSkylineExtensionImpl.f47711g;
        com.tencent.skyline.SkylineRuntime skylineRuntime = appServiceSkylineExtensionImpl.f47708d;
        if (skylineRuntime != null) {
            skylineRuntime.clearJSBindings();
            skylineRuntime.release();
        }
        appServiceSkylineExtensionImpl.f47708d = null;
        synchronized (df.a1.f229421a) {
            df.x0 x0Var = (df.x0) df.a1.f229423c.get(java.lang.Long.valueOf(runtimePtr));
            if (x0Var != null) {
                x0Var.f229608f.size();
            }
        }
        ik1.h0.b(new gf.m(runtimePtr));
    }
}
