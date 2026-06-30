package com.tencent.mm.plugin.game.luggage.jsapi;

/* loaded from: classes8.dex */
public class z3 implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.luggage.jsapi.a4 f139785d;

    public z3(com.tencent.mm.plugin.game.luggage.jsapi.a4 a4Var) {
        this.f139785d = a4Var;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        boolean z17 = bundle.getBoolean(ya.b.SUCCESS);
        com.tencent.mm.plugin.game.luggage.jsapi.a4 a4Var = this.f139785d;
        if (z17) {
            try {
                a4Var.f139589e.e(new org.json.JSONObject(bundle.getString("ret")));
            } catch (org.json.JSONException unused) {
            }
        } else {
            a4Var.f139589e.c(bundle.getString(com.tencent.tmassistantsdk.openSDK.OpenSDKTool4Assistant.EXTRA_ERROR_MSG), null);
        }
        com.tencent.mm.ipcinvoker.d0.h(this);
    }
}
