package com.tencent.mm.plugin.webview.luggage.jsapi;

/* loaded from: classes.dex */
public class i3 extends com.tencent.mm.plugin.webview.luggage.jsapi.s5 {
    @Override // sd.c
    public java.lang.String b() {
        return com.google.android.gms.common.Scopes.PROFILE;
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public int c() {
        return 2;
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public void d(android.content.Context context, java.lang.String str, com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            java.lang.String optString = jSONObject.optString(dm.i4.COL_USERNAME);
            if (optString == null || optString.length() == 0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.JsApiProfile", "doProfile fail, username is null");
                q5Var.a("fail", null);
                return;
            }
            if (com.tencent.mm.storage.z3.F3(optString) && !((ox.g) ((tk.o) i95.n0.c(tk.o.class))).Ui()) {
                if (context != null) {
                    dp.a.makeText(context, context.getString(com.tencent.mm.R.string.pas), 0).show();
                }
                q5Var.a("fail", null);
                return;
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
                com.tencent.mm.ipcinvoker.w0.c(true, new com.tencent.mm.plugin.webview.luggage.jsapi.e3(this));
                q5Var.a("fail", null);
                return;
            }
            if (!gm0.j1.b().n()) {
                com.tencent.mars.xlog.Log.e("MicroMsg.JsApiProfile", "doProfile, MMCore.hasCfgDefaultUin() is false");
                q5Var.a("fail", null);
                return;
            }
            com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(optString, true);
            if (n17 == null || ((int) n17.E2) <= 0) {
                n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().g0(optString);
            }
            android.content.Intent intent = new android.content.Intent();
            java.lang.String optString2 = jSONObject.optString("profileReportInfo");
            if (!com.tencent.mm.sdk.platformtools.t8.K0(optString2)) {
                intent.putExtra("key_add_contact_report_info", optString2);
            }
            if (n17 == null || ((int) n17.E2) <= 0) {
                com.tencent.mm.ui.widget.dialog.u3 Q = db5.e1.Q(context, context.getString(com.tencent.mm.R.string.f490573yv), context.getString(com.tencent.mm.R.string.f490604zq), true, true, new com.tencent.mm.plugin.webview.luggage.jsapi.f3(this, optString, q5Var));
                ((c01.k7) c01.n8.a()).b(optString, 17, new com.tencent.mm.plugin.webview.luggage.jsapi.h3(this, context, q5Var, Q, intent));
                return;
            }
            intent.addFlags(268435456);
            intent.putExtra("Contact_User", n17.d1());
            if (n17.k2()) {
                intent.putExtra("Contact_Scene", 42);
            }
            if (n17.r2()) {
                com.tencent.mm.autogen.events.SetLocalQQMobileEvent setLocalQQMobileEvent = new com.tencent.mm.autogen.events.SetLocalQQMobileEvent();
                am.au auVar = setLocalQQMobileEvent.f54766g;
                auVar.f6187a = intent;
                auVar.f6188b = n17.d1();
                setLocalQQMobileEvent.e();
            }
            ((com.tencent.mm.app.y7) dw4.a.f244297a).l(intent, context);
            q5Var.a(null, null);
        } catch (org.json.JSONException unused) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiProfile", "parase json fail");
            q5Var.a("fail", null);
        }
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public void e(sd.b bVar) {
    }
}
