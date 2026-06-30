package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class ve extends com.tencent.mm.ui.chatting.b6 {

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.ui.chatting.viewitems.a0 f205849g;

    public ve(yb5.d dVar, com.tencent.mm.ui.chatting.viewitems.a0 a0Var) {
        super(dVar);
        this.f205849g = a0Var;
    }

    @Override // com.tencent.mm.ui.chatting.b6
    public void a(android.view.View view, yb5.d dVar, com.tencent.mm.storage.f9 f9Var) {
        int i17;
        java.lang.String str;
        ((fq3.w) ((bx1.t) i95.n0.c(bx1.t.class))).Di(f9Var.Q0(), 1);
        ot0.q v17 = ot0.q.v(c01.w9.l(dVar.D(), f9Var.j(), f9Var.A0()));
        if (v17 == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WeishiVideoClickListener", "weishi chatItemClick, content is null");
            return;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(v17.f348677k2) && com.tencent.mm.sdk.platformtools.t8.K0(v17.f348673j2)) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", ((kt.e) ((lt.m0) i95.n0.c(lt.m0.class))).wi(v17.f348674k, dVar.D() ? "groupmessage" : "singlemessage"));
            intent.putExtra("webpageTitle", v17.f348654f);
            intent.putExtra("shortUrl", v17.f348674k);
            j45.l.j(dVar.g(), "webview", ".ui.tools.WebViewUI", intent, null);
            return;
        }
        java.lang.String x17 = dVar.x();
        java.lang.String A = this.f205849g.A(dVar, f9Var);
        android.os.Bundle bundle = new android.os.Bundle();
        if (dVar.D()) {
            bundle.putInt("stat_scene", 2);
        } else {
            bundle.putInt("stat_scene", c01.e2.G(x17) ? 7 : 1);
        }
        bundle.putString("stat_msg_id", "msg_" + java.lang.Long.toString(f9Var.I0()));
        bundle.putString("stat_chat_talker_username", x17);
        bundle.putString("stat_send_msg_user", A);
        lt.i0 i0Var = (lt.i0) i95.n0.c(lt.i0.class);
        java.lang.String str2 = v17.f348646d;
        int i18 = v17.G;
        ((kt.c) i0Var).getClass();
        com.tencent.mm.pluginsdk.model.app.m i19 = com.tencent.mm.pluginsdk.model.app.w.i(str2, i18);
        bundle.putString("stat_weishi_app_name", (i19 == null || (str = i19.field_appName) == null || str.trim().length() <= 0) ? v17.H : i19.field_appName);
        bundle.putString("stat_weishi_app_id", v17.f348646d);
        bundle.putString("stat_weishi_source_username", v17.f348722w);
        ot0.a aVar = (ot0.a) v17.y(ot0.a.class);
        bundle.putBoolean("stat_weishi_from_opensdk", aVar != null && aVar.D == 1);
        bundle.putString("stat_weishi_msg_img_path", f9Var.z0());
        ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
        bundle.putString("stat_weishi_thumb_path", m11.b1.Di().D2(f9Var, f9Var.z0(), true));
        bundle.putString("stat_weishi_thumb_url", aVar != null ? aVar.C : null);
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var.d(16979, v17.f348677k2, v17.f348669i2, 0, 1);
        g0Var.idkeyStat(1129L, 0L, 1L, false);
        com.tencent.mm.plugin.appbrand.service.h6 h6Var = (com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class);
        android.app.Activity g17 = dVar.g();
        boolean D = dVar.D();
        ((com.tencent.mm.plugin.appbrand.launching.xc) h6Var).getClass();
        com.tencent.mm.plugin.appbrand.report.AppBrandStatObject appBrandStatObject = new com.tencent.mm.plugin.appbrand.report.AppBrandStatObject();
        com.tencent.mm.modelappbrand.LaunchParamsOptional launchParamsOptional = new com.tencent.mm.modelappbrand.LaunchParamsOptional();
        com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer appBrandLaunchReferrer = new com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer();
        if (bundle.getBoolean("stat_weishi_from_opensdk", false)) {
            ot0.a aVar2 = (ot0.a) v17.y(ot0.a.class);
            if (aVar2 == null || (i17 = aVar2.O) <= 0) {
                appBrandStatObject.f87790f = 1036;
                com.tencent.mars.xlog.Log.i("MicroMsg.WeAppLauncher", "launchWeishiVideoMiniProgram use VISIT_SCENE_FROM_OPEN_SDK scene");
            } else {
                appBrandStatObject.f87790f = i17;
                com.tencent.mars.xlog.Log.i("MicroMsg.WeAppLauncher", "launchWeishiVideoMiniProgram use launchscene:%d", java.lang.Integer.valueOf(i17));
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            java.lang.String str3 = v17.f348646d;
            if (str3 == null) {
                str3 = "";
            }
            sb6.append(str3);
            sb6.append(":");
            java.lang.String a17 = fp.s0.a(v17.f348674k);
            if (a17 == null) {
                a17 = "";
            }
            sb6.append(a17);
            sb6.append(":");
            java.lang.String str4 = v17.f348689n2;
            sb6.append(str4 != null ? str4 : "");
            appBrandStatObject.f87791g = sb6.toString();
            appBrandStatObject.f87788d = D ? 2 : 1;
            if (D) {
                A = java.lang.String.format("%s:%s", x17, A);
            }
            appBrandStatObject.f87789e = A;
            com.tencent.mars.xlog.Log.i("MicroMsg.WeAppLauncher", "launchWeishiVideoMiniProgram, from opensdk appmsg, scene:%s", java.lang.Integer.valueOf(appBrandStatObject.f87790f));
            if (com.tencent.mm.sdk.platformtools.t8.K0(v17.f348693o2)) {
                appBrandStatObject.f87791g += ":0";
            } else {
                appBrandStatObject.f87791g += ":1";
            }
            appBrandLaunchReferrer.f77323e = v17.f348646d;
            appBrandLaunchReferrer.f77322d = 4;
        } else {
            java.lang.String str5 = v17.f348689n2;
            if (D) {
                appBrandStatObject.f87790f = 1008;
                appBrandStatObject.f87791g = x17 + ":" + A + ":" + str5;
            } else {
                appBrandStatObject.f87790f = 1007;
                appBrandStatObject.f87791g = A + ":" + str5;
            }
            appBrandStatObject.f87788d = com.tencent.mm.plugin.appbrand.report.z0.a(appBrandStatObject.f87790f, bundle);
            appBrandStatObject.f87789e = com.tencent.mm.plugin.appbrand.report.z0.b(appBrandStatObject.f87790f, bundle);
            com.tencent.mars.xlog.Log.i("MicroMsg.WeAppLauncher", "launchWeishiVideoMiniProgram, from chatting appmsg, scene:%s", java.lang.Integer.valueOf(appBrandStatObject.f87790f));
            appBrandLaunchReferrer.f77323e = v17.f348646d;
            appBrandLaunchReferrer.f77322d = 6;
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(v17.f348693o2)) {
            launchParamsOptional.f70415d = x17;
            launchParamsOptional.f70416e = v17.f348693o2;
        }
        oe1.b2.a(v17.f348677k2);
        com.tencent.mm.plugin.appbrand.launching.AppBrandLaunchProxyUI.e7(g17, v17.f348673j2, v17.f348677k2, v17.f348669i2, v17.f348737z2, v17.A2, appBrandStatObject, appBrandLaunchReferrer, launchParamsOptional);
    }
}
