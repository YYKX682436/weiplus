package com.tencent.mm.plugin.webview.luggage.jsapi;

/* loaded from: classes8.dex */
public class z4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f182538d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.luggage.jsapi.q5 f182539e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f182540f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.luggage.jsapi.j4 f182541g;

    public z4(com.tencent.mm.plugin.webview.luggage.jsapi.j4 j4Var, java.lang.String str, com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var, android.content.Context context) {
        this.f182541g = j4Var;
        this.f182538d = str;
        this.f182539e = q5Var;
        this.f182540f = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str = "";
        java.lang.String str2 = this.f182538d;
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(str2);
        final com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var = this.f182539e;
        if (K0) {
            q5Var.a("params is empty", null);
            return;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str2);
            org.json.JSONObject optJSONObject = jSONObject.optJSONObject("extInfo");
            final com.tencent.mm.plugin.webview.luggage.jsapi.j4 j4Var = this.f182541g;
            j4Var.getClass();
            com.tencent.mm.plugin.webview.luggage.jsapi.f5 f5Var = com.tencent.mm.plugin.webview.luggage.jsapi.f5.GAME_SHARE_TYPE_LINK;
            if (jSONObject.optString("shareType", "link").equals("image")) {
                f5Var = com.tencent.mm.plugin.webview.luggage.jsapi.f5.GAME_SHARE_TYPE_IMG;
            }
            j4Var.f182360e = f5Var;
            if (optJSONObject != null) {
                try {
                    str = java.net.URLEncoder.encode(optJSONObject.toString(), com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding);
                } catch (java.io.UnsupportedEncodingException unused) {
                }
            }
            org.json.JSONArray optJSONArray = jSONObject.optJSONArray("menuItems");
            final org.json.JSONArray optJSONArray2 = jSONObject.optJSONArray("opItems");
            final android.content.Context context = this.f182540f;
            final com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0(context, 0, false);
            k0Var.f211872n = new com.tencent.mm.plugin.webview.luggage.jsapi.s4(this, optJSONArray);
            k0Var.f211881s = new com.tencent.mm.plugin.webview.luggage.jsapi.t4(this, jSONObject, str, k0Var);
            if (optJSONArray2 != null) {
                k0Var.f211874o = new db5.o4() { // from class: com.tencent.mm.plugin.webview.luggage.jsapi.j4$$a
                    @Override // db5.o4
                    public final void onCreateMMMenu(db5.g4 g4Var) {
                        com.tencent.mm.plugin.webview.luggage.jsapi.j4.this.j(optJSONArray2, g4Var, context);
                    }
                };
                k0Var.f211884v = new db5.t4() { // from class: com.tencent.mm.plugin.webview.luggage.jsapi.j4$$b
                    @Override // db5.t4
                    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
                        com.tencent.mm.plugin.webview.luggage.jsapi.j4.this.getClass();
                        int itemId = menuItem.getItemId();
                        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                        try {
                            jSONObject2.put(dm.i4.COL_ID, itemId - 1000);
                        } catch (org.json.JSONException unused2) {
                        }
                        com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var2 = q5Var;
                        q5Var2.b("onShareCustomMenuItemClick", jSONObject2);
                        q5Var2.a(null, null);
                        k0Var.u();
                    }
                };
            }
            k0Var.f211854d = new com.tencent.mm.plugin.webview.luggage.jsapi.u4(this, str);
            if (jSONObject.optBoolean("enableQuickSend", true)) {
                uw4.u.a(context, k0Var, new com.tencent.mm.plugin.webview.luggage.jsapi.y4(this, jSONObject, str));
            }
            k0Var.v();
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.JsApiShareCustomContent", e17, "", new java.lang.Object[0]);
            q5Var.a("parse data Json fail", null);
        }
    }
}
