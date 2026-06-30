package com.tencent.mm.plugin.webview.luggage.menu;

/* loaded from: classes8.dex */
public class h extends com.tencent.mm.plugin.webview.luggage.menu.a {
    public h() {
        super(29);
    }

    @Override // com.tencent.mm.plugin.webview.luggage.menu.a
    public void a(android.content.Context context, com.tencent.mm.plugin.webview.luggage.e0 e0Var, db5.g4 g4Var) {
        boolean z17 = e0Var.f406657n.getBoolean("from_shortcut", false);
        e0Var.f182179l1.getClass();
        java.lang.String str = null;
        java.lang.String t17 = com.tencent.mm.sdk.platformtools.t8.K0(null) ? e0Var.t() : null;
        if (com.tencent.mm.sdk.platformtools.t8.K0(null)) {
            com.tencent.mm.plugin.webview.luggage.c4 c4Var = e0Var.K;
            java.lang.String b17 = c4Var.b();
            if (!com.tencent.mm.sdk.platformtools.t8.K0(b17)) {
                str = (java.lang.String) c4Var.f182160c.get(b17);
            }
        }
        if (z17 || com.tencent.mm.sdk.platformtools.t8.K0(t17) || com.tencent.mm.sdk.platformtools.t8.K0(str) || !e0Var.v(255)) {
            return;
        }
        g4Var.g(29, context.getString(com.tencent.mm.R.string.hr8), com.tencent.mm.R.raw.webview_add_shortcut);
        java.lang.String s17 = e0Var.s();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("url", s17);
        } catch (org.json.JSONException unused) {
        }
        com.tencent.mm.game.report.l.c(context, 34, 3401, 1, 1, 0, nj0.a.d(jSONObject.toString()));
    }

    @Override // com.tencent.mm.plugin.webview.luggage.menu.a
    public void b(android.content.Context context, com.tencent.mm.plugin.webview.luggage.e0 e0Var, com.tencent.mm.plugin.webview.luggage.menu.z zVar) {
        java.lang.String str;
        android.os.Bundle bundle = new android.os.Bundle();
        e0Var.f182179l1.getClass();
        if (com.tencent.mm.sdk.platformtools.t8.K0(null)) {
            com.tencent.mm.plugin.webview.luggage.c4 c4Var = e0Var.K;
            java.lang.String b17 = c4Var.b();
            java.lang.String str2 = com.tencent.mm.sdk.platformtools.t8.K0(b17) ? null : (java.lang.String) c4Var.f182160c.get(b17);
            if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                return;
            }
            int lastIndexOf = str2.lastIndexOf("/");
            if (lastIndexOf != -1) {
                str = str2.substring(0, lastIndexOf) + "/0";
            } else {
                str = str2;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.MenuDelegate_AddShortcut", "rawIconUrl : %s, newIconUrl : %s", str2, str);
            bundle.putString("icon_url", str);
        } else {
            bundle.putString("icon_url", null);
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(null)) {
            java.lang.String s17 = e0Var.s();
            android.net.Uri parse = android.net.Uri.parse(s17);
            java.lang.String query = parse.getQuery();
            try {
                s17 = new java.net.URI(parse.getScheme(), parse.getAuthority(), parse.getPath(), com.tencent.mm.sdk.platformtools.t8.K0(query) ? "ssid=25" : query.contains("ssid=") ? query.replaceFirst("ssid=[0-9]*", "ssid=25") : query.concat("&ssid=25"), parse.getFragment()).toString();
            } catch (java.net.URISyntaxException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MenuDelegate_AddShortcut", e17, "", new java.lang.Object[0]);
            }
            bundle.putString("page_url", s17);
        } else {
            bundle.putString("page_url", null);
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(null)) {
            bundle.putString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, e0Var.t());
        } else {
            bundle.putString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, null);
        }
        com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.w9.f193053a, bundle, com.tencent.mm.plugin.webview.luggage.menu.g.class, new com.tencent.mm.plugin.webview.luggage.menu.e(this, e0Var, context));
        com.tencent.mm.plugin.report.service.g0.INSTANCE.A(com.tencent.mm.plugin.appbrand.jsapi.ga.CTRL_INDEX, 12);
        java.lang.String s18 = e0Var.s();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("url", s18);
        } catch (org.json.JSONException unused) {
        }
        com.tencent.mm.game.report.l.c(context, 34, 3401, 1, 2, 0, nj0.a.d(jSONObject.toString()));
    }
}
