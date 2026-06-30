package sf0;

/* loaded from: classes11.dex */
public class i implements com.tencent.mm.modelbase.j1 {
    @Override // com.tencent.mm.modelbase.j1
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (m1Var instanceof wn4.y) {
            tn4.o oVar = (tn4.o) i95.n0.c(tn4.o.class);
            com.tencent.mm.ui.widget.dialog.u3 u3Var = oVar.f420844m;
            if (u3Var != null) {
                u3Var.dismiss();
                oVar.f420844m = null;
            }
            wn4.y yVar = (wn4.y) m1Var;
            if (yVar.f447576d == 4) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Updater.PluginUpdater", "is ConstantsUpdater.Source.Setting_check");
                return;
            }
            com.tencent.mm.plugin.hp.util.TinkerSyncResponse tinkerSyncResponse = (com.tencent.mm.plugin.hp.util.TinkerSyncResponse) yVar.f447580h;
            com.tencent.mm.plugin.hp.util.TinkerSyncResponse g17 = y73.p.g();
            if (g17 != null && ((tn4.o) ((un4.e) i95.n0.c(un4.e.class))).Ri(g17)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Updater.PluginUpdater", "hardCodeMMdiffResponeForTest responseTmp is no null");
                tinkerSyncResponse = g17;
            }
            ((qf0.q) ((rf0.o) i95.n0.c(rf0.o.class))).getClass();
            oq1.n h17 = y73.p.h(tinkerSyncResponse, false);
            if ((h17 instanceof com.tencent.mm.plugin.hp.util.TinkerSyncResponse) && ((tn4.o) ((un4.e) i95.n0.c(un4.e.class))).Ri(g17)) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1429L, 39L, 1L, false);
                com.tencent.mars.xlog.Log.i("MicroMsg.Updater.PluginUpdater", "hardCodeXkeyMMdiffResponeForReddot responseTmp is no null");
                tinkerSyncResponse = (com.tencent.mm.plugin.hp.util.TinkerSyncResponse) h17;
            }
            ((tn4.o) i95.n0.c(tn4.o.class)).fj(tinkerSyncResponse, yVar.f447576d, false);
        }
    }
}
