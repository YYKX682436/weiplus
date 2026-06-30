package gf;

/* loaded from: classes7.dex */
public final class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.luggage.skyline.wxa.AppServiceSkylineExtensionImpl f271166d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.luggage.sdk.jsapi.component.service.y f271167e;

    public r(com.tencent.luggage.skyline.wxa.AppServiceSkylineExtensionImpl appServiceSkylineExtensionImpl, com.tencent.luggage.sdk.jsapi.component.service.y yVar) {
        this.f271166d = appServiceSkylineExtensionImpl;
        this.f271167e = yVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f271166d.d(this.f271167e, true);
    }
}
