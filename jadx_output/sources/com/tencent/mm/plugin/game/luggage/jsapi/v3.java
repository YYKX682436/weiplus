package com.tencent.mm.plugin.game.luggage.jsapi;

/* loaded from: classes.dex */
public class v3 implements j35.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.luggage.jsapi.q5 f139759a;

    public v3(com.tencent.mm.plugin.game.luggage.jsapi.w3 w3Var, com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var) {
        this.f139759a = q5Var;
    }

    @Override // j35.a
    public void a(com.tencent.mm.pluginsdk.permission.AbsRequestFloatWindowPermissionDialog absRequestFloatWindowPermissionDialog) {
        org.json.JSONObject jSONObject;
        com.tencent.mars.xlog.Log.w("MicroMsg.JsApiRequestOverlayPermission", "float window permission granted");
        if (absRequestFloatWindowPermissionDialog != null) {
            absRequestFloatWindowPermissionDialog.finish();
        }
        try {
            jSONObject = new org.json.JSONObject();
            jSONObject.put("ret", 0);
        } catch (org.json.JSONException unused) {
            jSONObject = null;
        }
        this.f139759a.a(null, jSONObject);
    }

    @Override // j35.a
    public void b(com.tencent.mm.pluginsdk.permission.AbsRequestFloatWindowPermissionDialog absRequestFloatWindowPermissionDialog) {
        org.json.JSONObject jSONObject;
        com.tencent.mars.xlog.Log.w("MicroMsg.JsApiRequestOverlayPermission", "onResultCancel ok:%b", java.lang.Boolean.valueOf(((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).Ui(com.tencent.mm.sdk.platformtools.x2.f193071a)));
        if (absRequestFloatWindowPermissionDialog != null) {
            absRequestFloatWindowPermissionDialog.finish();
        }
        try {
            jSONObject = new org.json.JSONObject();
            jSONObject.put("ret", -1);
        } catch (org.json.JSONException unused) {
            jSONObject = null;
        }
        this.f139759a.a(null, jSONObject);
    }

    @Override // j35.a
    public void c(com.tencent.mm.pluginsdk.permission.AbsRequestFloatWindowPermissionDialog absRequestFloatWindowPermissionDialog) {
        org.json.JSONObject jSONObject;
        com.tencent.mars.xlog.Log.w("MicroMsg.JsApiRequestOverlayPermission", "float window permission refused");
        if (absRequestFloatWindowPermissionDialog != null) {
            absRequestFloatWindowPermissionDialog.finish();
        }
        try {
            jSONObject = new org.json.JSONObject();
            jSONObject.put("ret", -1);
        } catch (org.json.JSONException unused) {
            jSONObject = null;
        }
        this.f139759a.a(null, jSONObject);
    }
}
