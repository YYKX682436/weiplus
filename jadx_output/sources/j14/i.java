package j14;

/* loaded from: classes11.dex */
public class i extends com.tencent.mm.sdk.event.n {
    public i() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        am.k3 k3Var;
        com.tencent.mm.autogen.events.ConfigUpdatedEvent configUpdatedEvent = (com.tencent.mm.autogen.events.ConfigUpdatedEvent) iEvent;
        if (configUpdatedEvent != null && (k3Var = configUpdatedEvent.f54072g) != null && !com.tencent.mm.sdk.platformtools.a0.c()) {
            if (!com.tencent.mm.sdk.platformtools.t8.K0(k3Var.f7126a) && k3Var.f7126a.startsWith("clicfg_settings_plugin_wetype_reddot")) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreSetting", "receive clicfg_settings_plugin_wetype_reddot config.");
                java.lang.String Zi = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_settings_plugin_wetype_reddot, "", true);
                if (!com.tencent.mm.sdk.platformtools.t8.K0(Zi)) {
                    try {
                        r45.j4 j4Var = new r45.j4();
                        j4Var.f377560g = 10002;
                        r45.du5 du5Var = new r45.du5();
                        du5Var.f372756d = Zi;
                        du5Var.f372757e = true;
                        j4Var.f377561h = du5Var;
                        com.tencent.mm.modelbase.p0 p0Var = new com.tencent.mm.modelbase.p0(j4Var, false, false, false);
                        ((com.tencent.mm.plugin.messenger.foundation.PluginMessengerFoundation) ((vg3.f4) i95.n0.c(vg3.f4.class))).getClass();
                        c01.ad.f37061a.b1(p0Var);
                    } catch (java.lang.Exception e17) {
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SubCoreSetting", e17, null, new java.lang.Object[0]);
                    }
                }
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(k3Var.f7126a) && k3Var.f7126a.startsWith("clicfg_settings_plugin_params")) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreSetting", "receive clicfg_settings_plugin_params config.");
                ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).cj("wxalitebf3a88de4da873052ba340892dc97559", null);
            }
        }
        return false;
    }
}
