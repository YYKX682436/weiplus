package gf;

/* loaded from: classes3.dex */
public final class u0 implements com.tencent.mm.plugin.appbrand.page.i {
    @Override // com.tencent.mm.plugin.appbrand.page.i
    public void a(java.lang.String str) {
        com.tencent.mars.xlog.Log.e("SkylinePageScriptInjectionMode", "injectModuleSharedPageFrameScript");
    }

    @Override // com.tencent.mm.plugin.appbrand.page.i
    public void b(java.lang.String str) {
        com.tencent.mars.xlog.Log.e("SkylinePageScriptInjectionMode", "injectPageScript url:" + str);
    }

    @Override // com.tencent.mm.plugin.appbrand.page.i
    public boolean c(java.lang.String str) {
        com.tencent.mars.xlog.Log.e("SkylinePageScriptInjectionMode", "checkIsAppSharedPageFrameScript");
        return false;
    }

    @Override // com.tencent.mm.plugin.appbrand.page.i
    public void d() {
        com.tencent.mars.xlog.Log.e("SkylinePageScriptInjectionMode", "injectAppSharedPageFrameScript");
    }

    @Override // com.tencent.mm.plugin.appbrand.page.i
    public java.lang.String name() {
        return "SkylinePageScriptInjectionMode";
    }
}
