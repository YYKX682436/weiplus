package com.tencent.mm.plugin.webview.webcompt;

/* loaded from: classes7.dex */
public final class z extends com.tencent.mm.plugin.appbrand.jsruntime.b {
    public z() {
        super(null);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsruntime.b
    public cl.p u0(com.tencent.mm.appbrand.v8.IJSRuntime$Config iJSRuntime$Config) {
        boolean z17 = cl.x.f42817a;
        return new cl.t3(iJSRuntime$Config);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsruntime.b
    public cl.q0 v0(cl.p jsRuntime, int i17) {
        kotlin.jvm.internal.o.g(jsRuntime, "jsRuntime");
        cl.a aVar = (cl.a) jsRuntime;
        return new cl.q0(aVar, aVar.b(), new cl.d(aVar, i17));
    }
}
