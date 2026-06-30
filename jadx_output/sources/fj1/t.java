package fj1;

/* loaded from: classes7.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f263137a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.appcache.ac f263138b;

    public t(java.lang.String appId, com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo pkgWrappingInfo) {
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.o.g(pkgWrappingInfo, "pkgWrappingInfo");
        this.f263137a = "MicroMsg.WAMagicBrushFramePkgReader(" + appId + ')';
        com.tencent.mm.plugin.appbrand.appcache.ac acVar = new com.tencent.mm.plugin.appbrand.appcache.ac(new fj1.s(appId, pkgWrappingInfo, this), new fj1.r(this));
        acVar.j();
        this.f263138b = acVar;
    }
}
