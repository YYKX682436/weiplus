package tn4;

/* loaded from: classes11.dex */
public class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f420832d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f420833e;

    public k(tn4.o oVar, boolean z17, boolean z18) {
        this.f420832d = z17;
        this.f420833e = z18;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17 = this.f420833e;
        boolean z18 = this.f420832d;
        if (z18) {
            try {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1429L, 38L, 1L, false);
                ((wv.e0) ((xv.l0) i95.n0.c(xv.l0.class))).getClass();
                w73.f.h(261, 4);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.w("MicroMsg.Updater.PluginUpdater", "parse tabconfig failed: %s", e17.getMessage());
            }
        }
        org.json.JSONObject f17 = y73.p.f(c83.e.g(c83.e.i(com.tencent.mm.sdk.platformtools.x2.f193071a)));
        if (f17 == null) {
            return;
        }
        java.lang.String string = f17.getString("clientVersion");
        java.lang.String string2 = f17.getString("cdnUrl");
        java.lang.String string3 = f17.getString("fileMd5");
        int i17 = f17.getInt("fileSize");
        boolean z19 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_upgrade_force_stop_tinker_xpatch_update, 0) == 1;
        com.tencent.mars.xlog.Log.i("MicroMsg.Updater.PluginUpdater", "checkMMdiffUpdatePatchPkgVersion, clientVersion = %s, cdnUrl = %s, fileMd5 = %s, fileSize = %s, onlyShowNewRedDot = %s, isForceStopTinkerXpatchMerge = %s.", string, string2, string3, java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z19));
        if (z19) {
            return;
        }
        try {
            int i18 = f17.getInt("packageType");
            if (!com.tencent.mm.sdk.platformtools.t8.K0(string) && !com.tencent.mm.sdk.platformtools.t8.K0(string2) && !com.tencent.mm.sdk.platformtools.t8.K0(string3) && i17 != 0) {
                int e18 = y73.p.e();
                int parseInt = java.lang.Integer.parseInt(string.substring(2), 16);
                int i19 = o45.wf.f343029g;
                com.tencent.mars.xlog.Log.i("MicroMsg.Updater.PluginUpdater", "xKeyTargetApk = %s, mmdiffTargetVersion = %s, currentApkClientVersionCode = %s, hasManualUpdaterTabRedDot = %s, packageType = %s.", java.lang.Integer.valueOf(e18), java.lang.Integer.valueOf(parseInt), java.lang.Integer.valueOf(i19), java.lang.Boolean.valueOf(((tn4.o) ((un4.e) i95.n0.c(un4.e.class))).nj()), java.lang.Integer.valueOf(i18));
                if (parseInt > i19 && parseInt >= e18) {
                    if (z17) {
                        ((tn4.o) ((un4.e) i95.n0.c(un4.e.class))).vj(parseInt);
                    }
                    if (z18) {
                        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1429L, 42L, 1L, false);
                        ((wv.e0) ((xv.l0) i95.n0.c(xv.l0.class))).getClass();
                        w73.f.h(264, 4);
                    }
                    if (i18 == 2) {
                        tn4.o oVar = (tn4.o) ((un4.e) i95.n0.c(un4.e.class));
                        oVar.getClass();
                        com.tencent.mars.xlog.Log.i("MicroMsg.Updater.PluginUpdater", "autoCheckUpdate %s", 5);
                        gm0.j1.d().g(new z73.g(oVar.hj(), oVar.ij(), z73.h.c(), true));
                    }
                    ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
                    bk0.a.g().r(262145, false);
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1429L, 37L, 1L, false);
                }
            }
        } catch (java.lang.Exception e19) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Updater.PluginUpdater", "e = " + e19 + ", packageType = -1");
        }
    }
}
