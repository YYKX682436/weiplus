package com.tencent.mm.plugin.game.luggage.jsapi;

/* loaded from: classes8.dex */
public final class h3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f139657d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.luggage.jsapi.q5 f139658e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.luggage.jsapi.j3 f139659f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f139660g;

    public h3(org.json.JSONObject jSONObject, com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var, com.tencent.mm.plugin.game.luggage.jsapi.j3 j3Var, android.content.Context context) {
        this.f139657d = jSONObject;
        this.f139658e = q5Var;
        this.f139659f = j3Var;
        this.f139660g = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.json.JSONObject jSONObject = this.f139657d;
        if (jSONObject == null) {
            this.f139658e.a("input data is empty", null);
            return;
        }
        java.lang.String optString = jSONObject.optString("patchDownloadUrl");
        java.lang.String optString2 = this.f139657d.optString("pkgName");
        boolean optBoolean = this.f139657d.optBoolean("isServerPatch");
        if (optString2 == null || optString2.length() == 0) {
            this.f139658e.a("pkgName is null or empty", null);
        }
        com.tencent.mm.plugin.game.luggage.jsapi.j3 j3Var = this.f139659f;
        org.json.JSONObject data = this.f139657d;
        kotlin.jvm.internal.o.f(data, "$data");
        j3Var.getClass();
        java.lang.String optString3 = data.optString("appId");
        g02.c cVar = j3Var.f139694e;
        cVar.f267420a = optString3;
        cVar.f267421b = data.optInt(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 0);
        cVar.f267437r = data.optInt(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.USER_SSID, 0);
        cVar.f267435p = data.optInt("uiarea", 0);
        cVar.f267436q = data.optInt("noticeId", 0);
        cVar.f267432m = data.optString("extInfo");
        com.tencent.mm.plugin.game.commlib.util.e eVar = com.tencent.mm.plugin.game.commlib.util.g.f139404b;
        eVar.a();
        eVar.getClass();
        cVar.f267439t = (java.lang.String) com.tencent.mm.plugin.game.commlib.util.g.f139405c.b(eVar, com.tencent.mm.plugin.game.commlib.util.e.f139402a[0]);
        if (optBoolean) {
            vz.t1 t1Var = (vz.t1) i95.n0.c(vz.t1.class);
            g02.c cVar2 = this.f139659f.f139694e;
            ((uz.r1) t1Var).getClass();
            g02.b.c(32, cVar2);
        } else {
            vz.t1 t1Var2 = (vz.t1) i95.n0.c(vz.t1.class);
            g02.c cVar3 = this.f139659f.f139694e;
            ((uz.r1) t1Var2).getClass();
            g02.b.c(31, cVar3);
        }
        u43.a aVar = (u43.a) i95.n0.c(u43.a.class);
        kotlin.jvm.internal.o.d(optString2);
        u43.b e17 = aVar.e(optString2);
        if (e17 == null) {
            if (optBoolean) {
                com.tencent.mm.plugin.game.luggage.jsapi.j3.h(this.f139659f, optString, optString2, this.f139658e, this.f139660g);
                return;
            } else {
                com.tencent.mm.plugin.game.luggage.jsapi.j3.g(this.f139659f, this.f139660g, optString2, this.f139658e);
                return;
            }
        }
        e17.field_startTime = java.lang.System.currentTimeMillis();
        e17.field_isServerPatch = optBoolean;
        com.tencent.mm.plugin.game.luggage.jsapi.j3 j3Var2 = this.f139659f;
        j3Var2.j(j3Var2.f139694e, e17);
        ((u43.a) i95.n0.c(u43.a.class)).ya(e17);
        if (!optBoolean) {
            if (e17.field_taskStatus != 2) {
                com.tencent.mm.plugin.game.luggage.jsapi.j3.g(this.f139659f, this.f139660g, optString2, this.f139658e);
                return;
            }
            if (!com.tencent.mm.vfs.w6.j(e17.field_newChannelApkPath)) {
                com.tencent.mm.plugin.game.luggage.jsapi.j3.g(this.f139659f, this.f139660g, optString2, this.f139658e);
                return;
            }
            vz.y1 y1Var = (vz.y1) i95.n0.c(vz.y1.class);
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            java.lang.String str = e17.field_newChannelApkPath;
            g02.c cVar4 = this.f139659f.f139694e;
            ((uz.a2) y1Var).getClass();
            k02.l.b(context, str, new k02.i(cVar4));
            this.f139658e.a(null, null);
            return;
        }
        int i17 = e17.field_taskStatus;
        if (i17 == 1) {
            if (!com.tencent.mm.vfs.w6.j(e17.field_patchPath)) {
                com.tencent.mm.plugin.game.luggage.jsapi.j3.h(this.f139659f, optString, optString2, this.f139658e, this.f139660g);
                return;
            } else {
                ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.plugin.game.luggage.jsapi.f3(this.f139659f, this.f139660g, optString2, e17));
                this.f139658e.a(null, null);
                return;
            }
        }
        if (i17 != 2) {
            return;
        }
        if (!com.tencent.mm.vfs.w6.j(e17.field_newChannelApkPath)) {
            if (!com.tencent.mm.vfs.w6.j(e17.field_patchPath)) {
                com.tencent.mm.plugin.game.luggage.jsapi.j3.h(this.f139659f, optString, optString2, this.f139658e, this.f139660g);
                return;
            } else {
                ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.plugin.game.luggage.jsapi.g3(this.f139659f, this.f139660g, optString2, e17));
                this.f139658e.a(null, null);
                return;
            }
        }
        vz.y1 y1Var2 = (vz.y1) i95.n0.c(vz.y1.class);
        android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
        java.lang.String str2 = e17.field_newChannelApkPath;
        g02.c cVar5 = this.f139659f.f139694e;
        ((uz.a2) y1Var2).getClass();
        k02.l.b(context2, str2, new k02.i(cVar5));
        this.f139658e.a(null, null);
    }
}
