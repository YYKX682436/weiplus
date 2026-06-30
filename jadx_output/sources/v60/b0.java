package v60;

/* loaded from: classes.dex */
public final class b0 extends com.tencent.mm.sdk.event.n {
    public b0() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.CheckResUpdateCacheFileEvent event = (com.tencent.mm.autogen.events.CheckResUpdateCacheFileEvent) iEvent;
        kotlin.jvm.internal.o.g(event, "event");
        am.r2 r2Var = event.f54053g;
        int i17 = r2Var.f7759a;
        if (i17 == 216) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WxPayWPHKUrlResUpdateListener", "WPHK get notify res download finish, type:%d subType:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(r2Var.f7760b));
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1882, 114);
            try {
                java.lang.String str = r2Var.f7761c;
                if (!com.tencent.mm.sdk.platformtools.t8.K0(str) && com.tencent.mm.vfs.w6.j(str)) {
                    java.lang.String M = com.tencent.mm.vfs.w6.M(str);
                    if (com.tencent.mm.sdk.platformtools.t8.K0(M)) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.WxPayWPHKUrlResUpdateListener", "WPHK config content is null");
                    } else {
                        com.tencent.mars.xlog.Log.i("MicroMsg.WxPayWPHKUrlResUpdateListener", "WPHK save config file to mmkv");
                        com.tencent.mm.sdk.platformtools.o4 M2 = com.tencent.mm.sdk.platformtools.o4.M("mmkv.wallet");
                        if (M2 != null) {
                            M2.putString("MMKV_KEY_WPHK_CONFIG_DATA", M);
                        }
                        if (M2 != null) {
                            M2.putLong("MMKV_KEY_WPHK_CONFIG_TIMESTAMP", 0L);
                        }
                    }
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WxPayWPHKUrlResUpdateListener", e17, "", new java.lang.Object[0]);
            }
        }
        return false;
    }
}
