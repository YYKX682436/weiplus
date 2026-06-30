package com.tencent.mm.plugin.webview.luggage.jsapi;

/* loaded from: classes8.dex */
public class a5 extends com.tencent.mm.plugin.webview.luggage.jsapi.q5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.luggage.jsapi.q5 f182253a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f182254b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f182255c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f182256d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f182257e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.luggage.jsapi.j4 f182258f;

    public a5(com.tencent.mm.plugin.webview.luggage.jsapi.j4 j4Var, com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var, org.json.JSONObject jSONObject, android.content.Intent intent, android.content.Context context, java.lang.String str) {
        this.f182258f = j4Var;
        this.f182253a = q5Var;
        this.f182254b = jSONObject;
        this.f182255c = intent;
        this.f182256d = context;
        this.f182257e = str;
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.q5
    public void a(java.lang.String str, org.json.JSONObject jSONObject) {
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(str);
        com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var = this.f182253a;
        if (!K0 || jSONObject == null) {
            q5Var.a(str, null);
            return;
        }
        java.lang.String optString = jSONObject.optString("imgPath");
        com.tencent.mm.plugin.webview.luggage.jsapi.j4 j4Var = this.f182258f;
        j4Var.f182361f = optString;
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
            q5Var.a("imgPath is null", null);
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("img_path", j4Var.f182361f);
        org.json.JSONObject optJSONObject = this.f182254b.optJSONObject("tailInfo");
        if (optJSONObject != null) {
            hashMap.put("tail_url", optJSONObject.optString("url", ""));
        }
        java.lang.String str2 = j4Var.f182361f;
        android.content.Intent intent = this.f182255c;
        intent.putExtra("image_path", str2);
        intent.putExtra("webview_params", hashMap);
        this.f182258f.n(this.f182255c, this.f182256d, this.f182254b, hashMap, this.f182257e, this.f182253a);
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.q5
    public void b(java.lang.String str, org.json.JSONObject jSONObject) {
    }
}
