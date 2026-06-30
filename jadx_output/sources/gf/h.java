package gf;

/* loaded from: classes7.dex */
public final class h implements com.tencent.skyline.IBootstrapDoneCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.luggage.skyline.wxa.AppServiceSkylineExtensionImpl f271081a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.luggage.sdk.jsapi.component.service.y f271082b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f271083c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsruntime.f0 f271084d;

    public h(com.tencent.luggage.skyline.wxa.AppServiceSkylineExtensionImpl appServiceSkylineExtensionImpl, com.tencent.luggage.sdk.jsapi.component.service.y yVar, int i17, com.tencent.mm.plugin.appbrand.jsruntime.f0 f0Var) {
        this.f271081a = appServiceSkylineExtensionImpl;
        this.f271082b = yVar;
        this.f271083c = i17;
        this.f271084d = f0Var;
    }

    @Override // com.tencent.skyline.IBootstrapDoneCallback
    public void onDone() {
        com.tencent.luggage.skyline.wxa.AppServiceSkylineExtensionImpl appServiceSkylineExtensionImpl = this.f271081a;
        com.tencent.luggage.sdk.jsapi.component.service.y yVar = this.f271082b;
        appServiceSkylineExtensionImpl.d(yVar, false);
        if (!appServiceSkylineExtensionImpl.f47717m) {
            appServiceSkylineExtensionImpl.e(new gf.p(yVar));
            appServiceSkylineExtensionImpl.f47717m = true;
        }
        com.tencent.mars.xlog.Log.i("AppServiceSkylineExtensionImpl", "SkylineGlobalReady " + this.f271083c);
        this.f271081a.f47711g = true;
        if (this.f271081a.f47712h) {
            this.f271084d.k0(new gf.g(this.f271081a));
        }
    }
}
