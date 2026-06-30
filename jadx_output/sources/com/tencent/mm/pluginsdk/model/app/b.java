package com.tencent.mm.pluginsdk.model.app;

/* loaded from: classes11.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f188802a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f188803b;

    /* renamed from: c, reason: collision with root package name */
    public final int f188804c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f188805d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f188806e;

    /* renamed from: f, reason: collision with root package name */
    public final long f188807f;

    /* renamed from: g, reason: collision with root package name */
    public final long f188808g;

    public b(java.lang.String str) {
        java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d(str, "msg", null);
        java.lang.String str2 = (java.lang.String) d17.get(".msg.appmsg.des");
        this.f188806e = str2;
        int P = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".msg.alphainfo.clientVersion"), 0);
        this.f188802a = P;
        java.lang.String str3 = (java.lang.String) d17.get(".msg.alphainfo.url");
        this.f188803b = str3;
        int P2 = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".msg.alphainfo.size"), 0);
        this.f188804c = P2;
        java.lang.String str4 = (java.lang.String) d17.get(".msg.alphainfo.md5");
        this.f188805d = str4;
        long V = com.tencent.mm.sdk.platformtools.t8.V((java.lang.String) d17.get(".msg.alphainfo.maxAge"), 0L);
        this.f188807f = V;
        long V2 = com.tencent.mm.sdk.platformtools.t8.V((java.lang.String) d17.get(".msg.alphainfo.expireTime"), 0L);
        this.f188808g = V2;
        com.tencent.mars.xlog.Log.i("MicroMsg.AlphaUpdateInfo", "updateInfo, content:%s, clientVersion:%d, url:%s, size:%d, md5:%s, desc:%s, maxAge:%d, expireTime:%d", str, java.lang.Integer.valueOf(P), str3, java.lang.Integer.valueOf(P2), str4, str2, java.lang.Long.valueOf(V), java.lang.Long.valueOf(V2));
    }

    public static void a() {
        gm0.j1.u().c().w(352273, null);
        gm0.j1.u().c().w(352274, null);
    }

    public static com.tencent.mm.pluginsdk.model.app.b c() {
        java.lang.String str = (java.lang.String) gm0.j1.u().c().l(352273, "");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mm.pluginsdk.model.app.b bVar = new com.tencent.mm.pluginsdk.model.app.b(str);
            if (bVar.f() && !bVar.e()) {
                return bVar;
            }
            a();
        }
        return null;
    }

    public void b() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AlphaUpdateInfo", "downloadInSilence.");
        if (!f() || e()) {
            return;
        }
        boolean z17 = false;
        if (com.tencent.mm.sdk.platformtools.t8.D1(((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("SilentDownloadApkAtWiFi"), 0) == 0) {
            boolean z18 = com.tencent.mars.comm.NetStatusUtil.isWifi(com.tencent.mm.sdk.platformtools.x2.f193071a) && ((((java.lang.Integer) gm0.j1.u().c().l(7, 0)).intValue() & com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel.HEVCMainTierLevel62) == 0);
            if ((com.tencent.mm.sdk.platformtools.a0.f192438a & 1) == 0) {
                z17 = z18;
            }
        }
        if (!z17) {
            d();
            return;
        }
        int i17 = this.f188804c;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        java.lang.String str = this.f188805d;
        java.lang.String str2 = this.f188806e;
        java.lang.String str3 = this.f188803b;
        com.tencent.mars.xlog.Log.i("MicroMsg.AlphaUpdateInfo", "go to download, %s, %d, %s, %s", str, valueOf, str2, str3);
        mi3.f fVar = (mi3.f) i95.n0.c(mi3.f.class);
        java.lang.String replaceFirst = str2.replaceFirst("(\n)*<a.*</a>(\n)*", "\n");
        ((com.tencent.mm.plugin.sandbox.SubCoreSandBox) fVar).getClass();
        int i18 = com.tencent.mm.sandbox.updater.Updater.f192322o;
        android.content.Intent intent = new android.content.Intent(com.tencent.mm.sdk.platformtools.x2.f193071a, (java.lang.Class<?>) com.tencent.mm.sandbox.updater.UpdaterService.class);
        intent.putExtra("intent_client_version", o45.wf.f343029g);
        intent.putExtra("intent_update_type", 4);
        intent.putExtra("intent_extra_desc", replaceFirst);
        intent.putExtra("intent_extra_md5", str);
        intent.putExtra("intent_extra_size", i17);
        intent.putExtra("intent_extra_download_url", new java.lang.String[]{str3});
        intent.putExtra("intent_extra_updateMode", com.tencent.mm.sdk.platformtools.a0.f192438a);
        intent.putExtra("intent_extra_marketUrl", com.tencent.mm.sdk.platformtools.a0.f192444g);
        intent.putExtra("intent_extra_run_in_foreground", true);
        intent.putExtra("intent_extra_download_mode", 2);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(405L, 45L, 1L, true);
        l85.h1.e(intent, "sandbox", true, j45.l.e("sandbox"));
    }

    public void d() {
        com.tencent.mm.storage.f9 f9Var = new com.tencent.mm.storage.f9();
        f9Var.e1(c01.w9.m("weixin", com.tencent.mm.sdk.platformtools.t8.i1()));
        f9Var.setType(1);
        f9Var.d1(this.f188806e);
        com.tencent.mm.sdk.platformtools.t8.G1(f9Var.j());
        f9Var.j1(0);
        f9Var.u1("weixin");
        f9Var.r1(3);
        c01.w9.x(f9Var);
        com.tencent.mars.xlog.Log.i("MicroMsg.AlphaUpdateInfo", "insertUpdateTextMsg");
        a();
    }

    public boolean e() {
        boolean z17 = java.lang.System.currentTimeMillis() - ((java.lang.Long) gm0.j1.u().c().l(352274, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()))).longValue() > this.f188807f || java.lang.System.currentTimeMillis() > this.f188808g;
        com.tencent.mars.xlog.Log.i("MicroMsg.AlphaUpdateInfo", "isExpired: %b", java.lang.Boolean.valueOf(z17));
        return z17;
    }

    public boolean f() {
        boolean z17 = (this.f188802a <= o45.wf.f343029g || com.tencent.mm.sdk.platformtools.t8.K0(this.f188803b) || com.tencent.mm.sdk.platformtools.t8.K0(this.f188805d) || com.tencent.mm.sdk.platformtools.t8.K0(this.f188806e)) ? false : true;
        com.tencent.mars.xlog.Log.i("MicroMsg.AlphaUpdateInfo", "isValid %b", java.lang.Boolean.valueOf(z17));
        return z17;
    }
}
