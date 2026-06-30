package r43;

/* loaded from: classes8.dex */
public class g0 implements vz.k1, com.tencent.mm.plugin.downloader.model.i1 {
    @Override // vz.k1
    public void Z(int i17, long j17) {
        if (i17 == 9) {
            com.tencent.mm.plugin.game.model.b0 b0Var = com.tencent.mm.plugin.game.model.b0.f140224a;
            ((ku5.t0) ku5.t0.f312615d).l(new com.tencent.mm.plugin.game.model.y(j17), 500L, "onInstallFinish");
        }
    }

    @Override // com.tencent.mm.plugin.downloader.model.g1
    public void b(long j17, int i17, boolean z17) {
        com.tencent.mm.plugin.game.model.b0.b().c(j17, i17, z17);
    }

    @Override // com.tencent.mm.plugin.downloader.model.g1
    public void c(long j17, java.lang.String str, boolean z17) {
        com.tencent.mm.plugin.game.model.b0 b17 = com.tencent.mm.plugin.game.model.b0.b();
        b17.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.GameDownloadEventBus", "onTaskFinished, path = %s, fileExists = %b", str, java.lang.Boolean.valueOf(com.tencent.mm.vfs.w6.j(str)));
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str) && com.tencent.mm.vfs.w6.j(str)) {
            b17.a(j17, 3);
            if (z17) {
                ((uz.p1) ((vz.q1) i95.n0.c(vz.q1.class))).getClass();
                h02.a c17 = com.tencent.mm.plugin.downloader.model.m0.c(j17);
                if (c17 != null) {
                    jj0.a.a().c(c17.field_appId, 5, 0, null, null);
                }
            }
            b17.d(j17);
            b17.f(j17);
            return;
        }
        ((uz.p1) ((vz.q1) i95.n0.c(vz.q1.class))).getClass();
        h02.a c18 = com.tencent.mm.plugin.downloader.model.m0.c(j17);
        if (c18 != null) {
            c18.field_status = 4;
            c18.field_errCode = 805;
            ((uz.p1) ((vz.q1) i95.n0.c(vz.q1.class))).getClass();
            com.tencent.mm.plugin.downloader.model.m0.l(c18);
        }
        b17.c(j17, 805, z17);
        if (c18 != null) {
            vz.t1 t1Var = (vz.t1) i95.n0.c(vz.t1.class);
            java.lang.String str2 = c18.field_appId;
            ((uz.r1) t1Var).getClass();
            g02.b.d(str2, 9L, 1L);
        }
    }

    @Override // com.tencent.mm.plugin.downloader.model.g1
    public void f(long j17) {
        com.tencent.mm.plugin.game.model.b0.b().getClass();
    }

    @Override // com.tencent.mm.plugin.downloader.model.g1
    public void h(long j17, java.lang.String str, long j18, long j19) {
        com.tencent.mm.plugin.game.model.b0.b().a(j17, 6);
    }

    @Override // com.tencent.mm.plugin.downloader.model.g1
    public void i(long j17, java.lang.String str) {
        com.tencent.mm.plugin.game.model.b0.b().a(j17, 7);
    }

    @Override // com.tencent.mm.plugin.downloader.model.g1
    public void k(long j17) {
        com.tencent.mm.plugin.game.model.b0.b().a(j17, 2);
    }

    @Override // com.tencent.mm.plugin.downloader.model.g1
    public void l(long j17, java.lang.String str) {
        com.tencent.mm.plugin.game.model.b0 b17 = com.tencent.mm.plugin.game.model.b0.b();
        b17.a(j17, 1);
        b17.f(j17);
    }

    @Override // com.tencent.mm.plugin.downloader.model.g1
    public void m(long j17) {
        com.tencent.mm.plugin.game.model.b0 b17 = com.tencent.mm.plugin.game.model.b0.b();
        b17.a(j17, 4);
        ((uz.p1) ((vz.q1) i95.n0.c(vz.q1.class))).getClass();
        h02.a c17 = com.tencent.mm.plugin.downloader.model.m0.c(j17);
        if (c17 != null) {
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            java.lang.String str = c17.field_appId;
            android.content.SharedPreferences sharedPreferences = context.getSharedPreferences("game_center_pref", 0);
            java.lang.String string = sharedPreferences.getString("download_app_id_time_map", "");
            if (!com.tencent.mm.sdk.platformtools.t8.K0(string) && string.contains(str)) {
                java.lang.String str2 = new java.lang.String();
                java.lang.String[] split = string.split(",");
                for (int i17 = 0; i17 < split.length; i17++) {
                    java.lang.String str3 = split[i17];
                    if (!str3.contains(str)) {
                        str2 = i17 == split.length - 1 ? str2 + str3 : str2 + str3 + ",";
                    }
                }
                sharedPreferences.edit().putString("download_app_id_time_map", str2).apply();
            }
        }
        b17.f(j17);
    }
}
