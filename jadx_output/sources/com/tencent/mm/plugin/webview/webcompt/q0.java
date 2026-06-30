package com.tencent.mm.plugin.webview.webcompt;

/* loaded from: classes8.dex */
public final class q0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f187880d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.webcompt.f1 f187881e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ o25.k2 f187882f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f187883g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r45.d24 f187884h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(com.tencent.mm.plugin.webview.webcompt.f1 f1Var, o25.k2 k2Var, java.lang.String str, r45.d24 d24Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f187881e = f1Var;
        this.f187882f = k2Var;
        this.f187883g = str;
        this.f187884h = d24Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.webview.webcompt.q0(this.f187881e, this.f187882f, this.f187883g, this.f187884h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.webview.webcompt.q0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f187880d;
        o25.k2 k2Var = this.f187882f;
        com.tencent.mm.plugin.webview.webcompt.f1 f1Var = this.f187881e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mm.plugin.webview.webcompt.j0 j0Var = com.tencent.mm.plugin.webview.webcompt.j0.f187829g;
            com.tencent.mm.plugin.webview.webcompt.h0 h0Var = com.tencent.mm.plugin.webview.webcompt.f1.f187797e;
            f1Var.l(k2Var, j0Var);
            java.lang.String name = this.f187884h.f372006d;
            kotlin.jvm.internal.o.f(name, "name");
            this.f187880d = 1;
            obj = f1Var.i(this.f187883g, name, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.tencent.mm.plugin.webview.webcompt.f1.a(f1Var, k2Var, com.tencent.mm.plugin.webview.webcompt.j0.f187829g);
        return obj;
    }
}
