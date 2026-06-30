package gf;

/* loaded from: classes7.dex */
public final class i implements com.tencent.skyline.IBootstrapDoneCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.luggage.skyline.wxa.AppServiceSkylineExtensionImpl f271092a;

    public i(com.tencent.luggage.skyline.wxa.AppServiceSkylineExtensionImpl appServiceSkylineExtensionImpl) {
        this.f271092a = appServiceSkylineExtensionImpl;
    }

    @Override // com.tencent.skyline.IBootstrapDoneCallback
    public void onDone() {
        com.tencent.luggage.skyline.wxa.AppServiceSkylineExtensionImpl appServiceSkylineExtensionImpl = this.f271092a;
        synchronized (appServiceSkylineExtensionImpl) {
            while (!appServiceSkylineExtensionImpl.f47706b.isEmpty()) {
                java.lang.Runnable runnable = (java.lang.Runnable) appServiceSkylineExtensionImpl.f47706b.pollFirst();
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
    }
}
