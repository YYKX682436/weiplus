package com.tencent.mm.plugin.game.luggage.jsapi;

/* loaded from: classes8.dex */
public class f4 extends com.tencent.mm.plugin.webview.luggage.jsapi.q5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f139641a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ipcinvoker.r f139642b;

    public f4(com.tencent.mm.plugin.game.luggage.jsapi.g4 g4Var, android.os.Bundle bundle, com.tencent.mm.ipcinvoker.r rVar) {
        this.f139641a = bundle;
        this.f139642b = rVar;
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.q5
    public void a(java.lang.String str, org.json.JSONObject jSONObject) {
        android.os.Bundle bundle = this.f139641a;
        if (jSONObject != null) {
            bundle.putString("ret", jSONObject.toString());
        } else {
            bundle.putBoolean(ya.b.SUCCESS, false);
            bundle.putString(com.tencent.tmassistantsdk.openSDK.OpenSDKTool4Assistant.EXTRA_ERROR_MSG, str);
        }
        this.f139642b.a(bundle);
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.q5
    public void b(java.lang.String str, org.json.JSONObject jSONObject) {
    }
}
