package com.tencent.mm.plugin.game.luggage.jsapi;

/* loaded from: classes8.dex */
public class s4 implements u53.w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.luggage.jsapi.q5 f139744a;

    public s4(com.tencent.mm.plugin.game.luggage.jsapi.t4 t4Var, com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var) {
        this.f139744a = q5Var;
    }

    @Override // u53.w
    public void a(boolean z17) {
        com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var = this.f139744a;
        if (z17) {
            q5Var.a(null, null);
        } else {
            q5Var.a("setBlackList error", null);
        }
    }
}
