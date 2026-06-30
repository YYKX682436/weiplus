package mw4;

/* loaded from: classes7.dex */
public final class u extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f331795d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mw4.w f331796e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f331797f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.s83 f331798g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(kotlin.jvm.internal.h0 h0Var, mw4.w wVar, java.lang.String str, r45.s83 s83Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f331795d = h0Var;
        this.f331796e = wVar;
        this.f331797f = str;
        this.f331798g = s83Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new mw4.u(this.f331795d, this.f331796e, this.f331797f, this.f331798g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        mw4.u uVar = (mw4.u) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        uVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        mw4.w wVar = this.f331796e;
        java.lang.String url = wVar.c().f181916a.getUrl();
        kotlin.jvm.internal.h0 h0Var = this.f331795d;
        h0Var.f310123d = url;
        boolean z17 = true;
        if (r26.i0.p(this.f331797f, (java.lang.String) h0Var.f310123d, true)) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("WebView-Trace Spa notify auth：");
            r45.s83 s83Var = this.f331798g;
            sb6.append(s83Var.f385545d);
            com.tencent.mars.xlog.Log.i("MicroMsg.BizMpVideoInterceptor", sb6.toString());
            wVar.c().f0().a(s83Var.f385545d);
            nw4.n jsApiHandler = wVar.c().g0();
            kotlin.jvm.internal.o.g(jsApiHandler, "jsApiHandler");
            java.lang.String str = com.tencent.mm.plugin.webview.ui.tools.newjsapi.o0.f186402e;
            if (str != null && str.length() != 0) {
                z17 = false;
            }
            if (z17) {
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiDoAuthCurrentUrl", "lastCallBackID is null");
            } else {
                pm0.v.X(new com.tencent.mm.plugin.webview.ui.tools.newjsapi.n0(jsApiHandler, "doAuthCurrentUrl:ok"));
            }
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.BizMpVideoInterceptor", "WebView-Trace Spa auth host not match");
        }
        return jz5.f0.f302826a;
    }
}
