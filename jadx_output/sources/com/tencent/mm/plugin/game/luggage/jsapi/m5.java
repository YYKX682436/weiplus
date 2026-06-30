package com.tencent.mm.plugin.game.luggage.jsapi;

/* loaded from: classes.dex */
public final class m5 extends com.tencent.mm.plugin.webview.luggage.jsapi.r5 {
    @Override // sd.c
    public java.lang.String b() {
        return "showToast";
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public int c() {
        return 2;
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public void d(android.content.Context context, java.lang.String str, com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var) {
        if (q5Var == null || context == null) {
            return;
        }
        org.json.JSONObject e17 = com.tencent.mm.plugin.webview.luggage.util.g.e(str);
        if (e17 == null) {
            q5Var.a("invalid_params", null);
            return;
        }
        java.lang.String optString = e17.optString("status");
        java.lang.String optString2 = e17.optString("word");
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString) || com.tencent.mm.sdk.platformtools.t8.K0(optString2)) {
            q5Var.a("invalid_params", null);
            return;
        }
        boolean optBoolean = e17.optBoolean("needBlock", false);
        int optInt = e17.optInt("timeout", 10);
        if (optString != null) {
            switch (optString.hashCode()) {
                case -1867169789:
                    if (optString.equals(ya.b.SUCCESS)) {
                        db5.t7.h(context, optString2);
                        q5Var.a(null, null);
                        return;
                    }
                    return;
                case 3135262:
                    if (optString.equals("fail")) {
                        db5.t7.g(context, optString2);
                        q5Var.a(null, null);
                        return;
                    }
                    return;
                case 336650556:
                    if (optString.equals("loading")) {
                        com.tencent.mm.ui.widget.dialog.u3 f17 = com.tencent.mm.ui.widget.dialog.u3.f(context, optString2, !optBoolean, 3, new com.tencent.mm.plugin.game.luggage.jsapi.l5(q5Var));
                        android.app.Dialog dialog = com.tencent.mm.plugin.game.luggage.m.f139850a;
                        if (dialog != null) {
                            dialog.dismiss();
                        }
                        com.tencent.mm.plugin.game.luggage.m.f139850a = f17;
                        ku5.t0 t0Var = (ku5.t0) ku5.t0.f312615d;
                        t0Var.getClass();
                        t0Var.z(new com.tencent.mm.plugin.game.luggage.jsapi.k5(f17, q5Var), optInt * 1000, false);
                        return;
                    }
                    return;
                case 1940070258:
                    if (optString.equals("dismissloading")) {
                        android.app.Dialog dialog2 = com.tencent.mm.plugin.game.luggage.m.f139850a;
                        if (dialog2 != null) {
                            dialog2.dismiss();
                        }
                        com.tencent.mm.plugin.game.luggage.m.f139850a = null;
                        q5Var.a(null, null);
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public void e(sd.b bVar) {
    }
}
