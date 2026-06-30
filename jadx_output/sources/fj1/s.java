package fj1;

/* loaded from: classes7.dex */
public final class s implements com.tencent.mm.plugin.appbrand.appcache.nb {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f263134a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo f263135b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fj1.t f263136c;

    public s(java.lang.String str, com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo wxaPkgWrappingInfo, fj1.t tVar) {
        this.f263136c = tVar;
        this.f263134a = str;
        this.f263135b = wxaPkgWrappingInfo;
    }

    @Override // com.tencent.mm.plugin.appbrand.appcache.nb
    public boolean a() {
        return true;
    }

    @Override // com.tencent.mm.plugin.appbrand.appcache.nb
    public void b(k91.y0 configFileList) {
        kotlin.jvm.internal.o.g(configFileList, "configFileList");
        this.f263136c.getClass();
    }

    @Override // com.tencent.mm.plugin.appbrand.appcache.nb
    public com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo c() {
        return this.f263135b;
    }

    @Override // com.tencent.mm.plugin.appbrand.appcache.nb
    public java.lang.String getAppId() {
        return this.f263134a;
    }
}
