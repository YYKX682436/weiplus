package com.tencent.mm.plugin.flash;

/* loaded from: classes.dex */
public class l implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f137225d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f137226e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.flash.FaceFlashProcessLayout f137227f;

    public l(com.tencent.mm.plugin.flash.FaceFlashProcessLayout faceFlashProcessLayout, org.json.JSONObject jSONObject, java.lang.String str) {
        this.f137227f = faceFlashProcessLayout;
        this.f137225d = jSONObject;
        this.f137226e = str;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        org.json.JSONObject jSONObject = this.f137225d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/flash/FaceFlashProcessLayout$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        try {
            java.lang.String str = this.f137226e + "?customInfo=" + fp.s0.b(java.lang.String.format("appid=%s;errcode=%d;identifyid=%s", jSONObject.optString("key_app_id", ""), java.lang.Integer.valueOf(jSONObject.optInt("err_code", 0)), jSONObject.optString("verify_result", "")), com.tencent.mapsdk.internal.rv.f51270c);
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", str);
            j45.l.j(this.f137227f.getContext(), "webview", ".ui.tools.WebViewUI", intent, null);
        } catch (java.lang.Exception e17) {
            int i17 = com.tencent.mm.plugin.flash.FaceFlashProcessLayout.f137040q;
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FaceFlashManagerError", e17, "face start feedback webview exception", new java.lang.Object[0]);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/flash/FaceFlashProcessLayout$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
