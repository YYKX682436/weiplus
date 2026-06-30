package com.tencent.mm.plugin.game.model;

/* loaded from: classes8.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.String f140355a = com.tencent.mm.plugin.game.commlib.util.m.b(com.tencent.mm.plugin.game.commlib.util.l.PERMANENT) + "hvmenu/";

    public static void a(java.util.List list, com.tencent.mm.plugin.game.model.k kVar) {
        if (com.tencent.mm.sdk.platformtools.t8.L0(list)) {
            if (kVar != null) {
                com.tencent.mm.plugin.game.model.i iVar = (com.tencent.mm.plugin.game.model.i) kVar;
                java.lang.String str = iVar.f140330a;
                com.tencent.mars.xlog.Log.i("MicroMsg.GameCommOpertionProcessor", "menu icon download complete! save menu data. appid:%s", str);
                ((com.tencent.mm.plugin.game.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Ri().J0("pb_game_hv_menu_" + str, iVar.f140331b);
                return;
            }
            return;
        }
        r45.rk4 rk4Var = (r45.rk4) list.remove(0);
        if (rk4Var == null || com.tencent.mm.sdk.platformtools.t8.K0(rk4Var.f384966f)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.GameCommOpertionProcessor", "menu is null or thumburl is null");
            return;
        }
        java.lang.String str2 = f140355a + kk.k.g(rk4Var.f384966f.getBytes());
        o11.f fVar = new o11.f();
        fVar.f342078b = true;
        fVar.f342082f = str2;
        n11.a.b().d(rk4Var.f384966f, fVar.a(), new com.tencent.mm.plugin.game.model.j(rk4Var, list, kVar));
    }

    public static boolean b(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return false;
        }
        com.tencent.mm.plugin.game.commlib.l lVar = (com.tencent.mm.plugin.game.commlib.l) ((h43.e) i95.n0.c(h43.e.class));
        com.tencent.mm.plugin.webview.model.WebViewJSSDKFileItem webViewJSSDKFileItem = null;
        byte[] z07 = lVar.wi() == null ? null : lVar.wi().z0(str);
        if (z07 != null && z07.length != 0) {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(new java.lang.String(z07));
                int optInt = jSONObject.optInt("mediaType", 0);
                if (optInt == 1) {
                    webViewJSSDKFileItem = new com.tencent.mm.plugin.webview.model.WebViewJSSDKImageItem();
                    webViewJSSDKFileItem.d(jSONObject);
                } else if (optInt == 4) {
                    webViewJSSDKFileItem = new com.tencent.mm.plugin.webview.model.WebViewJSSDKVideoItem();
                    webViewJSSDKFileItem.d(jSONObject);
                }
            } catch (org.json.JSONException unused) {
            }
            if (webViewJSSDKFileItem != null && com.tencent.mm.vfs.w6.j(webViewJSSDKFileItem.f182738g) && (com.tencent.mm.sdk.platformtools.t8.K0(webViewJSSDKFileItem.f182737f) || com.tencent.mm.vfs.w6.j(webViewJSSDKFileItem.f182737f))) {
                com.tencent.mm.plugin.webview.modeltools.z.Zi().a(webViewJSSDKFileItem);
                return true;
            }
        }
        return false;
    }
}
