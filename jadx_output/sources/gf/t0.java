package gf;

/* loaded from: classes7.dex */
public final class t0 implements com.tencent.mm.plugin.appbrand.page.u4 {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.page.u4 f271173a;

    /* renamed from: b, reason: collision with root package name */
    public final ze.n f271174b;

    public t0(com.tencent.mm.plugin.appbrand.page.u4 origin, ze.n runtime) {
        kotlin.jvm.internal.o.g(origin, "origin");
        kotlin.jvm.internal.o.g(runtime, "runtime");
        this.f271173a = origin;
        this.f271174b = runtime;
    }

    @Override // com.tencent.mm.plugin.appbrand.page.u4
    public void a() {
        com.tencent.luggage.sdk.jsapi.component.service.y C0 = this.f271174b.C0();
        kotlin.jvm.internal.o.e(C0, "null cannot be cast to non-null type com.tencent.luggage.sdk.jsapi.component.service.AppBrandServiceLU");
        com.tencent.luggage.skyline.wxa.AppServiceSkylineExtensionImpl appServiceSkylineExtensionImpl = (com.tencent.luggage.skyline.wxa.AppServiceSkylineExtensionImpl) C0.z1(com.tencent.luggage.skyline.wxa.AppServiceSkylineExtensionImpl.class);
        if (appServiceSkylineExtensionImpl == null) {
            this.f271173a.a();
        } else {
            appServiceSkylineExtensionImpl.a(new gf.s0(this));
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.page.u4
    public void c(java.lang.String str, java.lang.Object obj) {
        this.f271173a.c(str, obj);
    }

    @Override // com.tencent.mm.plugin.appbrand.page.u4
    public void cancel() {
        this.f271173a.cancel();
    }

    @Override // com.tencent.mm.plugin.appbrand.page.u4
    public void setAnimationEnabled(boolean z17) {
        this.f271173a.setAnimationEnabled(z17);
    }
}
