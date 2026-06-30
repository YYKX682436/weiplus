package gf;

/* loaded from: classes7.dex */
public final class f implements com.tencent.skyline.IWindowDestroyCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f271043a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.luggage.skyline.wxa.AppServiceSkylineExtensionImpl f271044b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.skyline.SkylineRuntime f271045c;

    public f(int i17, com.tencent.luggage.skyline.wxa.AppServiceSkylineExtensionImpl appServiceSkylineExtensionImpl, com.tencent.skyline.SkylineRuntime skylineRuntime) {
        this.f271043a = i17;
        this.f271044b = appServiceSkylineExtensionImpl;
        this.f271045c = skylineRuntime;
    }

    @Override // com.tencent.skyline.IWindowDestroyCallback
    public void onWindowDestroy(int i17) {
        boolean isEmpty;
        com.tencent.mars.xlog.Log.i("AppServiceSkylineExtensionImpl", this.f271043a + " onWindowDestroy id:" + i17);
        com.tencent.luggage.skyline.wxa.AppServiceSkylineExtensionImpl appServiceSkylineExtensionImpl = this.f271044b;
        synchronized (appServiceSkylineExtensionImpl.f47719o) {
            appServiceSkylineExtensionImpl.f47718n.remove(java.lang.Integer.valueOf(i17));
            isEmpty = appServiceSkylineExtensionImpl.f47718n.isEmpty();
        }
        ((ku5.t0) ku5.t0.f312615d).B(new gf.e(i17));
        if (isEmpty && this.f271044b.f47712h) {
            this.f271045c.clearWorkletJSBindings();
        }
    }
}
