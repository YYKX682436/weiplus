package com.tencent.mm.plugin.webview.webcompt;

/* loaded from: classes8.dex */
public final class r0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.webcompt.f1 f187888d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cl0.g f187889e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.d24 f187890f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.Continuation f187891g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f187892h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsruntime.r f187893i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(com.tencent.mm.plugin.webview.webcompt.f1 f1Var, cl0.g gVar, r45.d24 d24Var, kotlin.coroutines.Continuation continuation, kotlin.jvm.internal.h0 h0Var, com.tencent.mm.plugin.appbrand.jsruntime.r rVar) {
        super(0);
        this.f187888d = f1Var;
        this.f187889e = gVar;
        this.f187890f = d24Var;
        this.f187891g = continuation;
        this.f187892h = h0Var;
        this.f187893i = rVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        kotlin.coroutines.Continuation continuation = this.f187891g;
        com.tencent.mm.plugin.webview.webcompt.f1 f1Var = this.f187888d;
        try {
            continuation.resumeWith(kotlin.Result.m521constructorimpl(com.tencent.mm.plugin.webview.webcompt.f1.b(f1Var, this.f187889e, this.f187890f)));
        } catch (java.lang.Exception e17) {
            if (e17 instanceof com.tencent.mm.plugin.webview.webcompt.i0) {
                ((yz5.l) this.f187892h.f310123d).invoke(e17);
            } else {
                java.lang.String str = "WeixinWebCompt.onError(" + e17.getMessage() + ')';
                com.tencent.mm.plugin.webview.webcompt.h0 h0Var = com.tencent.mm.plugin.webview.webcompt.f1.f187797e;
                f1Var.h(this.f187893i, str);
            }
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            continuation.resumeWith(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(e17)));
        }
        return jz5.f0.f302826a;
    }
}
