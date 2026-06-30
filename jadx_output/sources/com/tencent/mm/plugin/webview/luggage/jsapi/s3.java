package com.tencent.mm.plugin.webview.luggage.jsapi;

/* loaded from: classes.dex */
public class s3 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f182452d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f182453e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.luggage.jsapi.q5 f182454f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.luggage.jsapi.v3 f182455g;

    public s3(com.tencent.mm.plugin.webview.luggage.jsapi.v3 v3Var, org.json.JSONObject jSONObject, long j17, com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var) {
        this.f182455g = v3Var;
        this.f182452d = jSONObject;
        this.f182453e = j17;
        this.f182454f = q5Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        this.f182455g.g(this.f182452d, this.f182453e, this.f182454f);
        dialogInterface.dismiss();
    }
}
