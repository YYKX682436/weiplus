package tg1;

/* loaded from: classes7.dex */
public abstract class d {
    public void a(java.lang.String str, int i17, com.tencent.mm.plugin.appbrand.report.AppBrandStatObject appBrandStatObject, android.os.Bundle bundle, android.os.Bundle bundle2) {
        appBrandStatObject.f87790f = i17;
        appBrandStatObject.f87791g = fp.s0.a(str);
        if (bundle != null) {
            appBrandStatObject.f87791g += ":" + bundle.getString("stat_send_msg_user");
            appBrandStatObject.f87803v = bundle.getInt("stat_geta8key_msg_scene");
            appBrandStatObject.f87801t = bundle.getString("stat_send_msg_user");
            appBrandStatObject.f87802u = bundle.getString("stat_chat_talker_username");
            appBrandStatObject.f87800s = bundle.getString("stat_msg_id", "").replace("msg_", "").replace("sns_", "");
        }
        appBrandStatObject.f87788d = com.tencent.mm.plugin.appbrand.report.z0.a(i17, bundle);
        appBrandStatObject.f87789e = com.tencent.mm.plugin.appbrand.report.z0.b(i17, bundle);
        if (bundle2 != null) {
            appBrandStatObject.f87797p = bundle2.getBundle("stat_get_a8_key_cgi_speed");
        }
        if (i17 == 1037 || i17 == 1018) {
            appBrandStatObject.f87793i = 0;
        } else {
            appBrandStatObject.f87793i = i17;
        }
        appBrandStatObject.f87799r = com.tencent.mm.plugin.appbrand.launching.y.a(i17, bundle);
    }

    /* JADX WARN: Removed duplicated region for block: B:97:0x02e0 A[Catch: JSONException -> 0x02fb, TryCatch #0 {JSONException -> 0x02fb, blocks: (B:95:0x02d5, B:97:0x02e0, B:99:0x02f3), top: B:94:0x02d5 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final tg1.c b(android.content.Context r29, java.lang.String r30, int r31, android.os.Bundle r32, android.os.Bundle r33, l81.e1 r34) {
        /*
            Method dump skipped, instructions count: 1274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tg1.d.b(android.content.Context, java.lang.String, int, android.os.Bundle, android.os.Bundle, l81.e1):tg1.c");
    }

    public abstract void c(java.lang.String str, android.net.Uri uri, int i17, android.os.Bundle bundle, tg1.c cVar);

    public final void d(android.content.Context context, java.lang.String str, android.net.Uri uri, int i17, android.os.Bundle bundle, java.lang.String str2, android.os.Bundle bundle2, l81.e1 e1Var) {
        java.lang.String queryParameter = uri.getQueryParameter(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        java.lang.String str3 = queryParameter == null ? "" : queryParameter;
        int P = com.tencent.mm.sdk.platformtools.t8.P(uri.getQueryParameter("version"), 0);
        int P2 = com.tencent.mm.sdk.platformtools.t8.P(uri.getQueryParameter("type"), 0);
        com.tencent.mm.plugin.appbrand.report.AppBrandStatObject appBrandStatObject = new com.tencent.mm.plugin.appbrand.report.AppBrandStatObject();
        a(str, i17, appBrandStatObject, bundle, bundle2);
        if (bundle != null && bundle2 != null) {
            java.lang.String string = bundle.getString("stat_chat_talker_username", "");
            java.lang.String string2 = bundle.getString("stat_send_msg_user", "");
            int i18 = bundle.getInt("pay_qrcode_session_type", 0);
            java.lang.String string3 = bundle.getString("stat_msg_id", "");
            if (!com.tencent.mm.sdk.platformtools.t8.K0(string3) && string3.startsWith("msg_")) {
                string3 = string3.substring(4);
            }
            java.lang.String str4 = string3;
            java.lang.String string4 = bundle.getString("pay_init_raw_url", "");
            long j17 = bundle.getLong("pay_init_timestamp", 0L);
            com.tencent.mm.plugin.wallet_core.utils.q0 q0Var = com.tencent.mm.plugin.wallet_core.utils.q0.f180967g;
            if (i18 == 3) {
                com.tencent.mm.plugin.wallet_core.utils.v0.f180993a.a(str2, new com.tencent.mm.plugin.wallet_core.utils.WCPaySessionInfoRecorder$JsApiPayInfo(com.tencent.mm.plugin.wallet_core.utils.n0.f180939e.b(string2), com.tencent.mm.plugin.wallet_core.utils.s0.f180980e.a(string2), q0Var, string2, bundle.getString("pay_qrcode_timeline_objid"), "", string2, string4, j17));
            } else if (i18 != 0) {
                com.tencent.mm.plugin.wallet_core.utils.v0.f180993a.a(str2, new com.tencent.mm.plugin.wallet_core.utils.WCPaySessionInfoRecorder$JsApiPayInfo(string, string2, i18, bundle.getString("pay_qrcode_session_name"), str4, string4, j17));
            } else {
                com.tencent.mm.plugin.wallet_core.utils.v0.f180993a.a(str2, new com.tencent.mm.plugin.wallet_core.utils.WCPaySessionInfoRecorder$JsApiPayInfo(string, string2, 0, "", str4, string4, j17));
            }
        }
        if (e1Var == null) {
            com.tencent.mm.plugin.appbrand.launching.AppBrandLaunchProxyUI.e7(context, str2, null, str3, P2, P, appBrandStatObject, null, null);
            return;
        }
        l81.b1 b1Var = new l81.b1();
        b1Var.f317012a = str2;
        b1Var.f317022f = str3;
        b1Var.f317016c = P2;
        b1Var.f317018d = P;
        b1Var.a(appBrandStatObject);
        b1Var.L = e1Var;
        ((com.tencent.mm.plugin.appbrand.launching.xc) ((com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class))).bj(context, b1Var);
    }
}
