package ph1;

/* loaded from: classes7.dex */
public final class h0 implements java.util.Comparator {
    @Override // java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        int length;
        int length2;
        if (obj2 instanceof com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionModuleInfo) {
            length = ((com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionModuleInfo) obj2).f77464d.length();
        } else {
            if (!(obj2 instanceof com.tencent.mm.plugin.appbrand.appcache.ModulePkgInfo)) {
                throw new java.lang.IllegalStateException("Only WxaAttributes.WxaVersionModuleInfo or ModulePkgInfo supported here.".toString());
            }
            length = ((com.tencent.mm.plugin.appbrand.appcache.ModulePkgInfo) obj2).name.length();
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(length);
        if (obj instanceof com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionModuleInfo) {
            length2 = ((com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionModuleInfo) obj).f77464d.length();
        } else {
            if (!(obj instanceof com.tencent.mm.plugin.appbrand.appcache.ModulePkgInfo)) {
                throw new java.lang.IllegalStateException("Only WxaAttributes.WxaVersionModuleInfo or ModulePkgInfo supported here.".toString());
            }
            length2 = ((com.tencent.mm.plugin.appbrand.appcache.ModulePkgInfo) obj).name.length();
        }
        return mz5.a.b(valueOf, java.lang.Integer.valueOf(length2));
    }
}
