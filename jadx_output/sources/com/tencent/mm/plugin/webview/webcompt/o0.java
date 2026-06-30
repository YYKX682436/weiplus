package com.tencent.mm.plugin.webview.webcompt;

/* loaded from: classes8.dex */
public final class o0 implements com.tencent.mm.plugin.appbrand.jsruntime.s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f187871a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.webcompt.f1 f187872b;

    public o0(java.lang.String str, com.tencent.mm.plugin.webview.webcompt.f1 f1Var) {
        this.f187871a = str;
        this.f187872b = f1Var;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsruntime.s
    public final void a(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.webview.webcompt.h0 h0Var = com.tencent.mm.plugin.webview.webcompt.f1.f187797e;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("engine ");
        java.lang.String name = this.f187871a;
        sb6.append(name);
        sb6.append(" exception: ");
        sb6.append(str);
        sb6.append(" \nstackTrace:\n");
        sb6.append(str2);
        com.tencent.mars.xlog.Log.e("MicroMsg.WebComponent", sb6.toString());
        com.tencent.mm.plugin.webview.webcompt.f1 f1Var = this.f187872b;
        kotlin.jvm.internal.o.f(name, "$name");
        kotlin.jvm.internal.o.d(str);
        f1Var.g(name, str, str2, 0, 0);
        this.f187872b.f187812b.a(com.tencent.mm.plugin.webview.webcompt.b.D);
    }
}
