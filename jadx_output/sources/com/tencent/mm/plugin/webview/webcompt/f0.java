package com.tencent.mm.plugin.webview.webcompt;

/* loaded from: classes8.dex */
public final class f0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f187796d;

    public f0(kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.webview.webcompt.f0(continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return new com.tencent.mm.plugin.webview.webcompt.f0((kotlin.coroutines.Continuation) obj2).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f187796d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mm.plugin.webview.webcompt.h0 h0Var = com.tencent.mm.plugin.webview.webcompt.f1.f187797e;
            this.f187796d = 1;
            if (com.tencent.mm.plugin.webview.webcompt.h0.a(h0Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.tencent.mm.plugin.webview.webcompt.l0 l0Var = new com.tencent.mm.plugin.webview.webcompt.l0();
        int i18 = l0Var.f187857e;
        int i19 = l0Var.f187856d;
        if (i18 == -1) {
            com.tencent.mm.plugin.webview.webcompt.h0 h0Var2 = com.tencent.mm.plugin.webview.webcompt.f1.f187797e;
            com.tencent.mm.plugin.webview.webcompt.z b17 = com.tencent.mm.plugin.webview.webcompt.h0.b(h0Var2);
            java.lang.String script = h0Var2.i("/wxwebcompt.js", l0Var.f187858f.f187837d);
            b17.getClass();
            kotlin.jvm.internal.o.g(script, "script");
            com.tencent.mm.plugin.appbrand.jsruntime.r t07 = b17.t0();
            ((com.tencent.mm.plugin.appbrand.jsruntime.n) t07).evaluateJavascript(script, null);
            l0Var.f187857e = ((com.tencent.mm.plugin.appbrand.jsruntime.q) t07).f84032h;
            com.tencent.mars.xlog.Log.i("MicroMsg.WebComponent", "preload workerManager#" + i19);
        } else {
            com.tencent.mm.plugin.webview.webcompt.h0 h0Var3 = com.tencent.mm.plugin.webview.webcompt.f1.f187797e;
            com.tencent.mars.xlog.Log.w("MicroMsg.WebComponent", "preload twice #" + i19);
        }
        com.tencent.mm.plugin.webview.webcompt.f1.f187807o.offerFirst(l0Var);
        return jz5.f0.f302826a;
    }
}
