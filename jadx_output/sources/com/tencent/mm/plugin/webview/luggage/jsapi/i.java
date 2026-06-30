package com.tencent.mm.plugin.webview.luggage.jsapi;

/* loaded from: classes.dex */
public class i implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f182332d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f182333e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f182334f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f182335g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f182336h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.luggage.jsapi.q5 f182337i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.luggage.jsapi.l f182338m;

    public i(com.tencent.mm.plugin.webview.luggage.jsapi.l lVar, java.lang.String str, java.lang.String str2, java.lang.String str3, android.content.Context context, org.json.JSONObject jSONObject, com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var) {
        this.f182338m = lVar;
        this.f182332d = str;
        this.f182333e = str2;
        this.f182334f = str3;
        this.f182335g = context;
        this.f182336h = jSONObject;
        this.f182337i = q5Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14217, this.f182332d, 5, this.f182333e, this.f182334f, 3);
        this.f182338m.g(this.f182335g, this.f182336h, this.f182337i);
        dialogInterface.dismiss();
    }
}
