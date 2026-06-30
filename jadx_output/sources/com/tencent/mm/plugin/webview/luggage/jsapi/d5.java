package com.tencent.mm.plugin.webview.luggage.jsapi;

/* loaded from: classes8.dex */
public class d5 implements m33.i1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.luggage.jsapi.q5 f182299a;

    public d5(com.tencent.mm.plugin.webview.luggage.jsapi.j4 j4Var, com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var) {
        this.f182299a = q5Var;
    }

    @Override // m33.i1
    public void a(java.lang.String str) {
        this.f182299a.a(str, null);
    }

    @Override // m33.i1
    public void onCancel() {
        this.f182299a.a("cancel", null);
    }

    @Override // m33.i1
    public void onSuccess() {
        this.f182299a.a(null, null);
    }
}
