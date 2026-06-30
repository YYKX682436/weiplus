package gf;

/* loaded from: classes7.dex */
public final class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.luggage.skyline.wxa.AppServiceSkylineExtensionImpl f271062d;

    public g(com.tencent.luggage.skyline.wxa.AppServiceSkylineExtensionImpl appServiceSkylineExtensionImpl) {
        this.f271062d = appServiceSkylineExtensionImpl;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.luggage.skyline.wxa.AppServiceSkylineExtensionImpl appServiceSkylineExtensionImpl = this.f271062d;
        com.tencent.skyline.SkylineRuntime skylineRuntime = appServiceSkylineExtensionImpl.f47708d;
        if (skylineRuntime != null) {
            skylineRuntime.clearJSBindings();
            skylineRuntime.release();
        }
        appServiceSkylineExtensionImpl.f47708d = null;
    }
}
