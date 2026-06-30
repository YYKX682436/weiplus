package com.tencent.mm.plugin.webview.luggage.jsapi;

/* loaded from: classes8.dex */
public class c5 implements q80.x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f182288a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f182289b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f182290c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.luggage.jsapi.q5 f182291d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.luggage.jsapi.j4 f182292e;

    public c5(com.tencent.mm.plugin.webview.luggage.jsapi.j4 j4Var, android.content.Context context, org.json.JSONObject jSONObject, java.lang.String str, com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var) {
        this.f182292e = j4Var;
        this.f182288a = context;
        this.f182289b = jSONObject;
        this.f182290c = str;
        this.f182291d = q5Var;
    }

    @Override // q80.x
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        this.f182292e.l(this.f182288a, this.f182289b, this.f182290c, i17, i18, intent, this.f182291d);
    }
}
