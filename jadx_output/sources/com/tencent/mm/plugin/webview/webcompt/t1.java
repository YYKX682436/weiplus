package com.tencent.mm.plugin.webview.webcompt;

/* loaded from: classes8.dex */
public final class t1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f187928d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.webcompt.y1 f187929e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ o25.k2 f187930f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f187931g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f187932h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f187933i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(java.util.LinkedList linkedList, com.tencent.mm.plugin.webview.webcompt.y1 y1Var, o25.k2 k2Var, java.lang.String str, java.lang.String str2, kotlin.jvm.internal.c0 c0Var) {
        super(0);
        this.f187928d = linkedList;
        this.f187929e = y1Var;
        this.f187930f = k2Var;
        this.f187931g = str;
        this.f187932h = str2;
        this.f187933i = c0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        try {
            java.util.LinkedList<r45.d24> linkedList = this.f187928d;
            com.tencent.mm.plugin.webview.webcompt.y1 y1Var = this.f187929e;
            o25.k2 performanceHelper = this.f187930f;
            java.lang.String str = this.f187931g;
            java.lang.String str2 = this.f187932h;
            kotlin.jvm.internal.c0 c0Var = this.f187933i;
            for (r45.d24 d24Var : linkedList) {
                if (y1Var.f187954e.containsKey(d24Var.f372006d)) {
                    com.tencent.mm.plugin.webview.webcompt.f1 c17 = y1Var.c();
                    c17.getClass();
                    kotlin.jvm.internal.o.g(performanceHelper, "performanceHelper");
                    com.tencent.mm.plugin.webview.webcompt.k0 k0Var = (com.tencent.mm.plugin.webview.webcompt.k0) c17.k().get(d24Var.f372006d);
                    if (k0Var != null) {
                        c17.c(k0Var.a(), d24Var, performanceHelper.f342550a, false);
                    }
                } else {
                    java.util.HashMap hashMap = y1Var.f187954e;
                    java.lang.String name = d24Var.f372006d;
                    kotlin.jvm.internal.o.f(name, "name");
                    hashMap.put(name, d24Var);
                    y1Var.c().d(str, str2, d24Var, performanceHelper, c0Var.f310112d);
                    y1Var.c().f187812b.f187911a.add(java.lang.Long.valueOf(d24Var.f372010h));
                }
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mm.plugin.webview.webcompt.h0 h0Var = com.tencent.mm.plugin.webview.webcompt.f1.f187797e;
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WebComponent", e17, "config webcompt", new java.lang.Object[0]);
        }
        return jz5.f0.f302826a;
    }
}
