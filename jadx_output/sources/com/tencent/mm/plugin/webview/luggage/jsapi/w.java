package com.tencent.mm.plugin.webview.luggage.jsapi;

/* loaded from: classes.dex */
public class w implements com.tencent.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.luggage.jsapi.q5 f182490d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.luggage.jsapi.x f182491e;

    public w(com.tencent.mm.plugin.webview.luggage.jsapi.x xVar, com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var) {
        this.f182491e = xVar;
        this.f182490d = q5Var;
    }

    @Override // com.tencent.mm.ui.xc
    public void mmOnActivityResult(int i17, int i18, android.content.Intent intent) {
        if (i17 == (this.f182491e.hashCode() & 65535)) {
            com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var = this.f182490d;
            if (i18 == -1) {
                q5Var.a(null, null);
            } else {
                q5Var.a("fail", null);
            }
        }
    }
}
