package com.tencent.mm.plugin.game.luggage.jsapi;

/* loaded from: classes5.dex */
public final class i3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.luggage.jsapi.j3 f139669d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f139670e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f139671f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f139672g;

    public i3(com.tencent.mm.plugin.game.luggage.jsapi.j3 j3Var, java.lang.String str, java.lang.String str2, android.content.Context context) {
        this.f139669d = j3Var;
        this.f139670e = str;
        this.f139671f = str2;
        this.f139672g = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        e02.h hVar;
        com.tencent.mm.plugin.game.luggage.jsapi.j3 j3Var = this.f139669d;
        java.lang.String str = this.f139670e;
        java.lang.String str2 = this.f139671f;
        android.content.Context context = this.f139672g;
        j3Var.getClass();
        java.lang.String str3 = r26.i0.t(str2, ".", "", false) + java.lang.System.currentTimeMillis() + ".patch";
        java.lang.String str4 = com.tencent.mm.vfs.q7.c("gameDownload") + "/gameApk/patch/";
        com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(str4);
        java.lang.String str5 = a17.f213279f;
        if (str5 != null) {
            java.lang.String l17 = com.tencent.mm.vfs.e8.l(str5, false, false);
            if (!str5.equals(l17)) {
                a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
            }
        }
        com.tencent.mm.vfs.b3 b3Var = com.tencent.mm.vfs.a3.f212781a;
        com.tencent.mm.vfs.z2 m17 = b3Var.m(a17, null);
        if (!(!m17.a() ? false : m17.f213266a.F(m17.f213267b))) {
            com.tencent.mm.vfs.z2 m18 = b3Var.m(a17, m17);
            if (m18.a()) {
                m18.f213266a.r(m18.f213267b);
            }
        }
        java.lang.String str6 = str4 + str3;
        com.tencent.mars.xlog.Log.i("patchApkChannel", "gamelog.jsapi, gamedownload, download patch path  = " + str6);
        vz.y1 y1Var = (vz.y1) i95.n0.c(vz.y1.class);
        com.tencent.mm.plugin.game.luggage.jsapi.e3 e3Var = new com.tencent.mm.plugin.game.luggage.jsapi.e3(str2, j3Var, context, str6);
        uz.a2 a2Var = (uz.a2) y1Var;
        a2Var.getClass();
        synchronized (e02.h.class) {
            if (e02.h.f245853c == null) {
                e02.h.f245853c = new e02.h();
            }
            hVar = e02.h.f245853c;
        }
        hVar.a(str, str6, 0, new uz.z1(a2Var, e3Var));
    }
}
