package com.tencent.mm.plugin.webview.luggage.jsapi;

/* loaded from: classes.dex */
public class z3 implements k70.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.app.ProgressDialog f182531a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f182532b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f182533c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f182534d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f182535e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f182536f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.luggage.jsapi.q5 f182537g;

    public z3(com.tencent.mm.plugin.webview.luggage.jsapi.w3 w3Var, android.app.ProgressDialog progressDialog, android.content.Context context, java.lang.String str, java.lang.String str2, org.json.JSONObject jSONObject, java.lang.String str3, com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var) {
        this.f182531a = progressDialog;
        this.f182532b = context;
        this.f182533c = str;
        this.f182534d = str2;
        this.f182535e = jSONObject;
        this.f182536f = str3;
        this.f182537g = q5Var;
    }

    @Override // k70.u
    public void a(android.graphics.Bitmap bitmap, byte[] bArr) {
        android.app.ProgressDialog progressDialog = this.f182531a;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        uw4.y.a(this.f182532b, this.f182533c, this.f182534d, this.f182535e, this.f182536f);
        this.f182537g.a(null, null);
    }
}
