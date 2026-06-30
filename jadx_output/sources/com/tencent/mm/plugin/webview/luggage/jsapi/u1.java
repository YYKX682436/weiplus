package com.tencent.mm.plugin.webview.luggage.jsapi;

/* loaded from: classes.dex */
public class u1 implements com.tencent.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.luggage.jsapi.q5 f182471d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.luggage.jsapi.v1 f182472e;

    public u1(com.tencent.mm.plugin.webview.luggage.jsapi.v1 v1Var, com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var) {
        this.f182472e = v1Var;
        this.f182471d = q5Var;
    }

    @Override // com.tencent.mm.ui.xc
    public void mmOnActivityResult(int i17, int i18, android.content.Intent intent) {
        if (i17 == (this.f182472e.hashCode() & 65535)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiJumpToBizProfile", "request jumpToBizProfile, resultCode = " + i18);
            com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var = this.f182471d;
            if (i18 == -1) {
                q5Var.a(null, null);
                return;
            }
            if (i18 == 0) {
                q5Var.a("cancel", null);
            } else if (i18 == 2 || i18 == 3) {
                q5Var.a("check_fail", null);
            } else {
                q5Var.a("fail", null);
                com.tencent.mars.xlog.Log.e("MicroMsg.JsApiJumpToBizProfile", "unknown resultCode");
            }
        }
    }
}
