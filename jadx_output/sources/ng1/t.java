package ng1;

/* loaded from: classes7.dex */
public final class t implements ng1.s {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo f336949a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionInfo f336950b;

    public t(ej1.h hVar, int i17, com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionInfo wxaAttributes$WxaVersionInfo) {
        this.f336950b = wxaAttributes$WxaVersionInfo;
        com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo wxaPkgWrappingInfo = new com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo();
        this.f336949a = wxaPkgWrappingInfo;
        wxaPkgWrappingInfo.pkgVersion = com.tencent.mm.plugin.appbrand.appcache.g0.b(hVar.f253287b) ? hVar.f253288c.f77444d : 0;
        wxaPkgWrappingInfo.f75399d = i17;
        wxaPkgWrappingInfo.f75372md5 = wxaAttributes$WxaVersionInfo.f77447g;
        wxaPkgWrappingInfo.f75404i = new com.tencent.mm.plugin.appbrand.appcache.WxaRuntimeModulePluginListMap();
    }
}
