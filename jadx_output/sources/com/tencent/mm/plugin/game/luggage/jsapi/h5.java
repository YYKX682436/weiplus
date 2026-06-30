package com.tencent.mm.plugin.game.luggage.jsapi;

/* loaded from: classes.dex */
public final class h5 extends com.tencent.mm.plugin.webview.luggage.jsapi.r5 {
    @Override // sd.c
    public java.lang.String b() {
        return "showDialog";
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
        java.lang.String optString = e17.optString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        java.lang.String optString2 = e17.optString("desc");
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString) && com.tencent.mm.sdk.platformtools.t8.K0(optString2)) {
            q5Var.a("invalid_params", null);
            return;
        }
        java.lang.String optString3 = e17.optString("confirmText");
        java.lang.String optString4 = e17.optString("cancelText");
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString3) && com.tencent.mm.sdk.platformtools.t8.K0(optString4)) {
            q5Var.a("invalid_params", null);
            return;
        }
        boolean optBoolean = e17.optBoolean("dark", false);
        boolean optBoolean2 = e17.optBoolean("outSideCancel", false);
        com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(context);
        u1Var.u(optString);
        u1Var.r(optBoolean);
        u1Var.g(optString2);
        u1Var.a(optBoolean2);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(optString3)) {
            u1Var.n(optString3);
            u1Var.l(new com.tencent.mm.plugin.game.luggage.jsapi.e5(q5Var));
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(optString4)) {
            u1Var.j(optString4);
            u1Var.i(new com.tencent.mm.plugin.game.luggage.jsapi.f5(q5Var));
        }
        if (optBoolean2) {
            u1Var.e(new com.tencent.mm.plugin.game.luggage.jsapi.g5(q5Var));
        }
        u1Var.q(false);
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public void e(sd.b bVar) {
    }
}
