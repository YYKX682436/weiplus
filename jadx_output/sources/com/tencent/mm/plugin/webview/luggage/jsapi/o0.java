package com.tencent.mm.plugin.webview.luggage.jsapi;

/* loaded from: classes.dex */
public class o0 implements com.tencent.mm.plugin.webview.model.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f182412a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.luggage.jsapi.q5 f182413b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.luggage.jsapi.q0 f182414c;

    public o0(com.tencent.mm.plugin.webview.luggage.jsapi.q0 q0Var, java.lang.String str, com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var) {
        this.f182414c = q0Var;
        this.f182412a = str;
        this.f182413b = q5Var;
    }

    @Override // com.tencent.mm.plugin.webview.model.n0
    public void a(boolean z17, int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiDownLoadImage", "doDownLoadImage, on cdn finish, is success : %b, local id : %s, media id is : %s", java.lang.Boolean.valueOf(z17), str, str2);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2) || !str2.equals(this.f182412a)) {
            return;
        }
        com.tencent.mm.plugin.webview.modeltools.z.bj().i(this);
        com.tencent.mm.plugin.webview.luggage.jsapi.q0 q0Var = this.f182414c;
        android.app.ProgressDialog progressDialog = q0Var.f182441e;
        if (progressDialog != null) {
            progressDialog.dismiss();
            q0Var.f182441e = null;
        }
        com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var = this.f182413b;
        if (!z17) {
            q5Var.a("fail", null);
            return;
        }
        com.tencent.mm.plugin.webview.model.WebViewJSSDKFileItem b17 = com.tencent.mm.plugin.webview.modeltools.z.Zi().b(str);
        if ((b17 instanceof com.tencent.mm.plugin.webview.model.WebViewJSSDKImageItem) && com.tencent.mm.sdk.platformtools.t8.K0(b17.f182737f)) {
            ((com.tencent.mm.plugin.webview.model.WebViewJSSDKImageItem) b17).f();
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put(dm.i4.COL_LOCALID, str);
        } catch (org.json.JSONException unused) {
        }
        q5Var.a(null, jSONObject);
    }
}
