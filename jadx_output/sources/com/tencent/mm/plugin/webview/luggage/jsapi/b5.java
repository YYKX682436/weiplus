package com.tencent.mm.plugin.webview.luggage.jsapi;

/* loaded from: classes8.dex */
public class b5 implements com.tencent.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f182270d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f182271e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f182272f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.luggage.jsapi.q5 f182273g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.luggage.jsapi.j4 f182274h;

    public b5(com.tencent.mm.plugin.webview.luggage.jsapi.j4 j4Var, android.content.Context context, org.json.JSONObject jSONObject, java.lang.String str, com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var) {
        this.f182274h = j4Var;
        this.f182270d = context;
        this.f182271e = jSONObject;
        this.f182272f = str;
        this.f182273g = q5Var;
    }

    @Override // com.tencent.mm.ui.xc
    public void mmOnActivityResult(int i17, int i18, android.content.Intent intent) {
        this.f182274h.l(this.f182270d, this.f182271e, this.f182272f, i17, i18, intent, this.f182273g);
    }
}
