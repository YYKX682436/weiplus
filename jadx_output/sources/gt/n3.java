package gt;

/* loaded from: classes7.dex */
public class n3 implements com.tencent.mm.app.a3 {
    @Override // com.tencent.mm.app.a3
    public android.os.Handler getHandler() {
        return null;
    }

    @Override // com.tencent.mm.app.a3
    public void onAppBackground(java.lang.String str) {
        if (gm0.j1.a()) {
            za1.b bVar = za1.b.f470878a;
            ((ku5.t0) ku5.t0.f312615d).g(za1.a.f470877d);
            com.tencent.mm.plugin.appbrand.app.q0 q0Var = com.tencent.mm.plugin.appbrand.app.q0.f75227a;
            com.tencent.mm.sdk.platformtools.o4 a17 = q0Var.a();
            kotlin.jvm.internal.o.d(a17);
            if (!a17.getBoolean("last_appbrand_switch_short_link_highlight", false)) {
                ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).Bi();
                com.tencent.mm.sdk.platformtools.o4 a18 = q0Var.a();
                kotlin.jvm.internal.o.d(a18);
                a18.putBoolean("last_appbrand_switch_short_link_highlight", true);
                com.tencent.mars.xlog.Log.i("WxaShortLinkCapacity", "short link highlight change to enable!");
            }
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeSuspendingMainProcessTriggerCheckEvent.f74857g.a(false);
            com.tencent.mars.xlog.Log.i(com.tencent.mm.plugin.appbrand.app.PluginAppBrand.TAG, "onAppBackground");
        }
    }

    @Override // com.tencent.mm.app.a3
    public void onAppForeground(java.lang.String str) {
        if (gm0.j1.a()) {
            com.tencent.mm.plugin.appbrand.app.r9.nj("onAppForeground:" + str, com.tencent.mm.plugin.appbrand.service.x6.f88821i);
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeSuspendingMainProcessTriggerCheckEvent.f74857g.a(false);
            com.tencent.mm.plugin.appbrand.app.g2.Ui(com.tencent.mm.plugin.appbrand.app.t1.f75281e);
            com.tencent.mars.xlog.Log.i(com.tencent.mm.plugin.appbrand.app.PluginAppBrand.TAG, "onAppForeground");
        }
    }
}
