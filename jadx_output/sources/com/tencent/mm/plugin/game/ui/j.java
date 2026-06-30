package com.tencent.mm.plugin.game.ui;

/* loaded from: classes8.dex */
public abstract class j implements android.view.View.OnClickListener {

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f141426e;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f141428g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.downloader.model.FileDownloadTaskInfo f141429h;

    /* renamed from: i, reason: collision with root package name */
    public dm.t3 f141430i;

    /* renamed from: m, reason: collision with root package name */
    public int f141431m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f141432n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f141433o;

    /* renamed from: d, reason: collision with root package name */
    public int f141425d = -1;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.game.model.b f141427f = null;

    public j(android.content.Context context) {
        this.f141426e = context;
    }

    public final void a(boolean z17) {
        long b17;
        if (z17) {
            com.tencent.mm.plugin.game.model.b bVar = this.f141427f;
            com.tencent.mm.plugin.game.model.b0.g(bVar.f238368J, bVar.P, bVar.f140213p2, bVar.field_appId, null, "app_update");
        } else {
            com.tencent.mm.plugin.game.model.b bVar2 = this.f141427f;
            com.tencent.mm.plugin.game.model.b0.g(bVar2.f238368J, bVar2.P, bVar2.f140213p2, bVar2.field_appId, null, this.f141433o);
        }
        com.tencent.mm.plugin.downloader.model.t0 t0Var = new com.tencent.mm.plugin.downloader.model.t0(null);
        com.tencent.mm.plugin.game.model.b bVar3 = this.f141427f;
        t0Var.f97150a = bVar3.f238368J;
        t0Var.f97151b = bVar3.f140222y2;
        t0Var.f97152c = bVar3.f140223z2;
        lt.i0 i0Var = (lt.i0) i95.n0.c(lt.i0.class);
        com.tencent.mm.plugin.game.model.b bVar4 = this.f141427f;
        android.content.Context context = this.f141426e;
        t0Var.f97153d = ((kt.c) i0Var).Ui(context, bVar4);
        com.tencent.mm.plugin.game.model.b bVar5 = this.f141427f;
        t0Var.f97156g = bVar5.field_appId;
        t0Var.f97154e = bVar5.P;
        t0Var.f97158i = true;
        t0Var.f97155f = 1;
        t0Var.f97157h = bVar5.field_packageName;
        t0Var.f97161l = bVar5.f140213p2;
        if (bVar5.A2 == 1) {
            ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
            b17 = com.tencent.mm.plugin.downloader.model.r0.i().c(t0Var);
        } else {
            ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
            b17 = com.tencent.mm.plugin.downloader.model.r0.i().b(t0Var);
        }
        long j17 = b17;
        java.lang.Long valueOf = java.lang.Long.valueOf(j17);
        com.tencent.mm.plugin.game.model.b bVar6 = this.f141427f;
        com.tencent.mars.xlog.Log.i("MicroMsg.CommonGameClickLinstener", " add download task result:[%d], appid[%s]，downloaerType[%d]", valueOf, bVar6.field_appId, java.lang.Integer.valueOf(bVar6.A2));
        com.tencent.mm.plugin.game.model.f.m(context, this.f141427f.field_appId);
        com.tencent.mm.plugin.game.model.b bVar7 = this.f141427f;
        g02.c cVar = new g02.c(bVar7.field_appId, bVar7.f140213p2, j17, "", null, 0);
        ((uz.r1) ((vz.t1) i95.n0.c(vz.t1.class))).getClass();
        g02.b.c(9, cVar);
    }

    public void b(boolean z17) {
        android.content.Context context = this.f141426e;
        if (!com.tencent.mars.comm.NetStatusUtil.isNetworkConnected(context)) {
            dp.a.makeText(context, context.getString(com.tencent.mm.R.string.f492208fm1), 0).show();
            com.tencent.mm.plugin.game.model.b0.b().e(this.f141427f.field_appId, 803, false, null);
            return;
        }
        gm0.j1.i();
        if (!gm0.j1.u().l()) {
            dp.a.makeText(context, context.getString(com.tencent.mm.R.string.f492210fm3), 0).show();
            com.tencent.mm.plugin.game.model.b0.b().e(this.f141427f.field_appId, 804, false, null);
            return;
        }
        vz.u1 u1Var = (vz.u1) i95.n0.c(vz.u1.class);
        long j17 = this.f141427f.f140223z2;
        ((uz.t1) u1Var).getClass();
        if (!com.tencent.mm.plugin.downloader.model.u0.a(j17)) {
            vz.u1 u1Var2 = (vz.u1) i95.n0.c(vz.u1.class);
            long j18 = this.f141427f.f140223z2;
            ((uz.t1) u1Var2).getClass();
            if (!com.tencent.mm.plugin.downloader.model.u0.c(j18)) {
                dp.a.makeText(context, context.getString(com.tencent.mm.R.string.f492209fm2), 0).show();
                com.tencent.mm.plugin.game.model.b0.b().e(this.f141427f.field_appId, 804, false, null);
                return;
            }
        }
        if (o45.wf.f343024b.toLowerCase().contains("xiaomi")) {
            try {
                if (android.provider.Settings.Secure.getInt(context.getContentResolver(), "install_non_market_apps") == 0 && !context.getSharedPreferences("game_center_pref", 0).getBoolean("show_open_download_authority_tips", false)) {
                    db5.e1.k(this.f141426e, com.tencent.mm.R.string.fpi, com.tencent.mm.R.string.fpj, com.tencent.mm.R.string.fm_, com.tencent.mm.R.string.f490347sg, false, new com.tencent.mm.plugin.game.ui.h(this), new com.tencent.mm.plugin.game.ui.i(this));
                    context.getSharedPreferences("game_center_pref", 0).edit().putBoolean("show_open_download_authority_tips", true).commit();
                }
            } catch (android.provider.Settings.SettingNotFoundException e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.CommonGameClickLinstener", "SettingNotFoundException ; %S", e17.getMessage());
            }
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f141427f.f238368J) && !com.tencent.mm.sdk.platformtools.t8.K0(this.f141427f.P)) {
            android.content.Context context2 = this.f141426e;
            com.tencent.mm.plugin.game.model.b bVar = this.f141427f;
            com.tencent.mm.game.report.l.g(context2, bVar.f140212o2, bVar.f140213p2, bVar.f140214q2, 4, bVar.field_appId, this.f141431m, bVar.f140210m2, this.f141432n);
            if (com.tencent.mars.comm.NetStatusUtil.isWifi(context)) {
                a(z17);
                return;
            }
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14217, this.f141427f.field_appId, 4, "", this.f141427f.f238368J, 2);
            android.content.Context context3 = this.f141426e;
            db5.e1.D(context3, context3.getString(com.tencent.mm.R.string.l5x), context.getString(com.tencent.mm.R.string.l5y), context.getString(com.tencent.mm.R.string.l5q), context.getString(com.tencent.mm.R.string.f490347sg), false, new com.tencent.mm.plugin.game.ui.f(this, z17), new com.tencent.mm.plugin.game.ui.g(this), com.tencent.mm.R.color.aaq);
            return;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f141427f.Q)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CommonGameClickLinstener", "downloadApk fail, gpDownloadUrl is null");
        } else {
            ((yb0.c) ((zb0.y) i95.n0.c(zb0.y.class))).wi(context, this.f141427f.Q);
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f141427f.f238368J)) {
            com.tencent.mm.plugin.game.model.b0.b().e(this.f141427f.field_appId, 700, false, null);
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f141427f.P)) {
            com.tencent.mm.plugin.game.model.b0.b().e(this.f141427f.field_appId, com.tencent.mm.plugin.appbrand.jsapi.share.r0.CTRL_INDEX, false, null);
        }
    }
}
