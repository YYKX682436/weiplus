package com.tencent.mm.plugin.flash.action;

/* loaded from: classes.dex */
public class d0 implements l72.b0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f137124a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f137125b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.flash.action.FaceFlashActionProcessLayout f137126c;

    public d0(com.tencent.mm.plugin.flash.action.FaceFlashActionProcessLayout faceFlashActionProcessLayout, org.json.JSONObject jSONObject, java.lang.String str) {
        this.f137126c = faceFlashActionProcessLayout;
        this.f137124a = jSONObject;
        this.f137125b = str;
    }

    @Override // l72.b0
    public void a(java.lang.String str) {
        org.json.JSONObject jSONObject = this.f137124a;
        int i17 = com.tencent.mm.plugin.flash.action.FaceFlashActionProcessLayout.f137088t;
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashActionProcessLayout", "click feedback url ");
        try {
            java.lang.String str2 = this.f137125b + "?customInfo=" + fp.s0.b(java.lang.String.format("appid=%s;errcode=%d;identifyid=%s", jSONObject.optString("key_app_id", ""), java.lang.Integer.valueOf(jSONObject.optInt("err_code", 0)), jSONObject.optString("verify_result", "")), com.tencent.mapsdk.internal.rv.f51270c);
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", str2);
            j45.l.j(this.f137126c.getContext(), "webview", ".ui.tools.WebViewUI", intent, null);
        } catch (java.lang.Exception e17) {
            int i18 = com.tencent.mm.plugin.flash.action.FaceFlashActionProcessLayout.f137088t;
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FaceFlashManagerError", e17, "face start feedback webview exception", new java.lang.Object[0]);
        }
    }
}
