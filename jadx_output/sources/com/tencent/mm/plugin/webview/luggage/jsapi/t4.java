package com.tencent.mm.plugin.webview.luggage.jsapi;

/* loaded from: classes8.dex */
public class t4 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f182463d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f182464e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k0 f182465f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.luggage.jsapi.z4 f182466g;

    public t4(com.tencent.mm.plugin.webview.luggage.jsapi.z4 z4Var, org.json.JSONObject jSONObject, java.lang.String str, com.tencent.mm.ui.widget.dialog.k0 k0Var) {
        this.f182466g = z4Var;
        this.f182463d = jSONObject;
        this.f182464e = str;
        this.f182465f = k0Var;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        com.tencent.mm.plugin.webview.luggage.jsapi.f5 f5Var = com.tencent.mm.plugin.webview.luggage.jsapi.f5.GAME_SHARE_TYPE_IMG;
        java.lang.String str = this.f182464e;
        com.tencent.mm.plugin.webview.luggage.jsapi.z4 z4Var = this.f182466g;
        org.json.JSONObject jSONObject = this.f182463d;
        if (itemId == 1) {
            com.tencent.mm.plugin.webview.luggage.jsapi.j4 j4Var = z4Var.f182541g;
            com.tencent.mm.plugin.webview.luggage.jsapi.f5 f5Var2 = j4Var.f182360e;
            com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var = z4Var.f182539e;
            android.content.Context context = z4Var.f182540f;
            if (f5Var2 == f5Var) {
                com.tencent.mm.plugin.webview.luggage.jsapi.j4.g(j4Var, context, jSONObject, str, q5Var);
            } else {
                if (!com.tencent.mm.plugin.webview.luggage.jsapi.j4.h(j4Var, context, jSONObject, q5Var, false)) {
                    com.tencent.mm.plugin.webview.luggage.jsapi.j4.g(z4Var.f182541g, context, jSONObject, str, q5Var);
                }
                com.tencent.mm.game.report.l.c(com.tencent.mm.sdk.platformtools.x2.f193071a, 20, 2001, 2, 2, 0, this.f182464e);
            }
        } else if (itemId == 2) {
            com.tencent.mm.plugin.webview.luggage.jsapi.j4 j4Var2 = z4Var.f182541g;
            com.tencent.mm.plugin.webview.luggage.jsapi.f5 f5Var3 = j4Var2.f182360e;
            com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var2 = z4Var.f182539e;
            android.content.Context context2 = z4Var.f182540f;
            if (f5Var3 == f5Var) {
                com.tencent.mm.plugin.webview.luggage.jsapi.j4.i(j4Var2, context2, jSONObject, str, q5Var2);
            } else if (!com.tencent.mm.plugin.webview.luggage.jsapi.j4.h(j4Var2, context2, jSONObject, q5Var2, true)) {
                com.tencent.mm.plugin.webview.luggage.jsapi.j4.i(z4Var.f182541g, context2, jSONObject, str, q5Var2);
            }
            com.tencent.mm.game.report.l.c(com.tencent.mm.sdk.platformtools.x2.f193071a, 20, 2001, 3, 2, 0, this.f182464e);
        } else {
            z4Var.f182541g.getClass();
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put(dm.i4.COL_ID, itemId - 1000);
            } catch (org.json.JSONException unused) {
            }
            com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var3 = z4Var.f182539e;
            q5Var3.b("onShareCustomMenuItemClick", jSONObject2);
            q5Var3.a(null, null);
        }
        this.f182465f.u();
    }
}
