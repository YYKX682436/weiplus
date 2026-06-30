package com.tencent.mm.plugin.webview.luggage;

/* loaded from: classes8.dex */
public class s2 implements uw4.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.luggage.v2 f182617a;

    public s2(com.tencent.mm.plugin.webview.luggage.v2 v2Var) {
        this.f182617a = v2Var;
    }

    @Override // uw4.o
    public void a(java.lang.String str, org.json.JSONObject jSONObject) {
        com.tencent.mm.plugin.webview.luggage.v2 v2Var = this.f182617a;
        ((java.util.HashSet) v2Var.f182637a.L.f182659e).add("sendAppMessage");
        v2Var.f182637a.f406655i.c(new com.tencent.mm.plugin.webview.luggage.r2(this, jSONObject));
    }
}
