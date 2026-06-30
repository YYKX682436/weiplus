package com.tencent.mm.plugin.game.ui;

/* loaded from: classes8.dex */
public class r0 extends com.tencent.mm.plugin.game.ui.j {
    public final boolean c(long j17) {
        ((uz.p1) ((vz.q1) i95.n0.c(vz.q1.class))).getClass();
        h02.a c17 = com.tencent.mm.plugin.downloader.model.m0.c(j17);
        if (c17 != null && c17.field_downloadInWifi) {
            c17.field_downloadInWifi = false;
            ((uz.p1) ((vz.q1) i95.n0.c(vz.q1.class))).getClass();
            com.tencent.mm.plugin.downloader.model.m0.l(c17);
        }
        ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
        return com.tencent.mm.plugin.downloader.model.r0.i().o(j17);
    }

    public final void d() {
        com.tencent.mm.plugin.game.model.b bVar = this.f141427f;
        g02.c cVar = new g02.c(bVar.field_appId, bVar.f140213p2, this.f141430i.field_downloadId, "", null, 0);
        ((uz.r1) ((vz.t1) i95.n0.c(vz.t1.class))).getClass();
        g02.b.c(10, cVar);
        ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
        if (!com.tencent.mm.plugin.downloader.model.r0.i().w(this.f141430i.field_downloadId)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.GameClickListener", "resumeDownloadTask false");
            ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
            com.tencent.mm.plugin.downloader.model.r0.i().t(this.f141430i.field_downloadId);
            b(false);
            return;
        }
        com.tencent.mm.plugin.game.model.f.m(this.f141426e, this.f141427f.field_appId);
        android.content.Context context = this.f141426e;
        com.tencent.mm.plugin.game.model.b bVar2 = this.f141427f;
        com.tencent.mm.game.report.l.g(context, bVar2.f140212o2, bVar2.f140213p2, bVar2.f140214q2, 4, bVar2.field_appId, this.f141431m, bVar2.f140210m2, this.f141432n);
    }

    public final void e() {
        android.content.Context context = this.f141426e;
        if (!com.tencent.mars.comm.NetStatusUtil.isNetworkConnected(context)) {
            dp.a.makeText(context, context.getString(com.tencent.mm.R.string.f492208fm1), 0).show();
        } else if (com.tencent.mars.comm.NetStatusUtil.isWifi(context)) {
            d();
        } else {
            android.content.Context context2 = this.f141426e;
            db5.e1.D(context2, context2.getString(com.tencent.mm.R.string.l5x), context.getString(com.tencent.mm.R.string.l5y), context.getString(com.tencent.mm.R.string.l5q), context.getString(com.tencent.mm.R.string.f490347sg), false, new com.tencent.mm.plugin.game.ui.p0(this), new com.tencent.mm.plugin.game.ui.q0(this), com.tencent.mm.R.color.aaq);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        boolean F;
        int i17;
        int i18;
        if (!(view.getTag() instanceof com.tencent.mm.plugin.game.model.b)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.GameClickListener", "No AppInfo");
            return;
        }
        this.f141427f = (com.tencent.mm.plugin.game.model.b) view.getTag();
        com.tencent.mars.xlog.Log.i("MicroMsg.GameClickListener", "Clicked appid = " + this.f141427f.field_appId);
        vz.q1 q1Var = (vz.q1) i95.n0.c(vz.q1.class);
        java.lang.String str = this.f141427f.field_appId;
        ((uz.p1) q1Var).getClass();
        this.f141430i = com.tencent.mm.plugin.downloader.model.m0.d(str);
        ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
        com.tencent.mm.plugin.downloader.model.FileDownloadTaskInfo q17 = com.tencent.mm.plugin.downloader.model.r0.i().q(this.f141427f.field_appId);
        this.f141429h = q17;
        long j17 = q17.f96961d;
        this.f141425d = q17.f96963f;
        this.f141428g = q17.f96964g;
        lt.i0 i0Var = (lt.i0) i95.n0.c(lt.i0.class);
        java.lang.String str2 = this.f141427f.field_appId;
        ((kt.c) i0Var).getClass();
        android.content.Context context = this.f141426e;
        if (com.tencent.mm.pluginsdk.model.app.w.r(context, str2)) {
            com.tencent.mm.plugin.game.model.b bVar = this.f141427f;
            if (bVar instanceof com.tencent.mm.plugin.game.model.b) {
                i17 = r53.f.j(bVar.field_packageName);
                i18 = this.f141427f.f140215r2;
            } else {
                i17 = 0;
                i18 = 0;
            }
            if (i18 <= i17) {
                com.tencent.mm.plugin.game.model.b bVar2 = this.f141427f;
                com.tencent.mars.xlog.Log.i("MicroMsg.GameClickListener", "launchFromWX, appId = %s, pkg = %s, openId = %s", bVar2.field_appId, bVar2.field_packageName, bVar2.field_openId);
                android.content.Context context2 = this.f141426e;
                com.tencent.mm.plugin.game.model.b bVar3 = this.f141427f;
                com.tencent.mm.game.report.l.g(context2, bVar3.f140212o2, bVar3.f140213p2, bVar3.f140214q2, 3, bVar3.field_appId, this.f141431m, bVar3.f140210m2, this.f141432n);
                com.tencent.mm.plugin.game.model.f.j(context, this.f141427f.field_appId);
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.GameClickListener", "AppId: %s installed, local: %d, server: %d", this.f141427f.field_appId, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
            com.tencent.mm.plugin.game.model.b bVar4 = this.f141427f;
            com.tencent.mm.plugin.game.model.b0.g(bVar4.f238368J, bVar4.P, bVar4.f140213p2, bVar4.field_appId, null, "app_update");
            com.tencent.mm.plugin.downloader.model.FileDownloadTaskInfo fileDownloadTaskInfo = this.f141429h;
            int i19 = fileDownloadTaskInfo.f96963f;
            if (i19 == 1) {
                com.tencent.mars.xlog.Log.i("MicroMsg.GameClickListener", "pauseDownloadTask ret = " + c(fileDownloadTaskInfo.f96961d));
                return;
            }
            if (i19 == 2) {
                e();
                return;
            }
            if (i19 != 3) {
                b(true);
                return;
            }
            if (!com.tencent.mm.vfs.w6.j(fileDownloadTaskInfo.f96964g) || r53.f.i(this.f141429h.f96964g) <= i17) {
                b(true);
                return;
            }
            zb0.y yVar = (zb0.y) i95.n0.c(zb0.y.class);
            java.lang.String str3 = this.f141429h.f96964g;
            ((yb0.c) yVar).getClass();
            com.tencent.mm.pluginsdk.model.app.n1.d(context, str3, null, false);
            android.content.Context context3 = this.f141426e;
            com.tencent.mm.plugin.game.model.b bVar5 = this.f141427f;
            com.tencent.mm.game.report.l.g(context3, bVar5.f140212o2, bVar5.f140213p2, bVar5.f140214q2, 8, bVar5.field_appId, this.f141431m, bVar5.f140210m2, this.f141432n);
            return;
        }
        if (this.f141427f.I0()) {
            r53.f.v(context, this.f141427f.C2.f323651e, "game_center_hv_game", null);
            android.content.Context context4 = this.f141426e;
            com.tencent.mm.plugin.game.model.b bVar6 = this.f141427f;
            com.tencent.mm.game.report.l.g(context4, bVar6.f140212o2, bVar6.f140213p2, bVar6.f140214q2, 29, bVar6.field_appId, this.f141431m, bVar6.f140210m2, this.f141432n);
            return;
        }
        com.tencent.mm.plugin.game.model.b bVar7 = this.f141427f;
        com.tencent.mm.plugin.game.model.b0.g(bVar7.f238368J, bVar7.P, bVar7.f140213p2, bVar7.field_appId, null, this.f141433o);
        int i27 = this.f141425d;
        if (i27 == 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.GameClickListener", "pauseDownloadTask ret = " + c(this.f141429h.f96961d));
            return;
        }
        if (i27 == 2) {
            e();
            return;
        }
        if (i27 != 3) {
            b(false);
            return;
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f141428g) && com.tencent.mm.vfs.w6.j(this.f141428g)) {
            java.lang.String str4 = this.f141428g;
            java.lang.String str5 = this.f141430i.field_md5;
            boolean z17 = r53.f.f392653a;
            com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(str4);
            java.lang.String str6 = a17.f213279f;
            if (str6 != null) {
                java.lang.String l17 = com.tencent.mm.vfs.e8.l(str6, false, false);
                if (!str6.equals(l17)) {
                    a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
                }
            }
            java.lang.String p17 = com.tencent.mm.vfs.w6.p(a17.toString());
            if (com.tencent.mm.sdk.platformtools.t8.K0(str5) || com.tencent.mm.sdk.platformtools.t8.K0(p17)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.GameCenterUtil", "checkPkgMD5Valid, md5 is null");
                com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
                F = !m17.a() ? false : m17.f213266a.F(m17.f213267b);
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.GameCenterUtil", "checkPkgMD5Valid, md5 = %s, calculateMD5 = %s", str5, p17);
                F = str5.equalsIgnoreCase(p17);
            }
            if (F) {
                java.lang.String str7 = this.f141427f.field_appId;
                long j18 = this.f141430i.field_downloadId;
                ((uz.a) ((vz.f1) i95.n0.c(vz.f1.class))).getClass();
                k02.l.a(j18, false, null);
                android.content.Context context5 = this.f141426e;
                com.tencent.mm.plugin.game.model.b bVar8 = this.f141427f;
                com.tencent.mm.game.report.l.g(context5, bVar8.f140212o2, bVar8.f140213p2, bVar8.f140214q2, 8, bVar8.field_appId, this.f141431m, bVar8.f140210m2, this.f141432n);
                return;
            }
        }
        b(false);
    }
}
