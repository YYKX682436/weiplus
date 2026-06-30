package com.tencent.mm.plugin.webview.webcompt;

/* loaded from: classes8.dex */
public final class s0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f187899d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f187900e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f187901f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f187902g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f187903h;

    /* renamed from: i, reason: collision with root package name */
    public int f187904i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.webcompt.f1 f187905m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ o25.k2 f187906n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ cl0.g f187907o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ r45.d24 f187908p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f187909q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsruntime.r f187910r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(com.tencent.mm.plugin.webview.webcompt.f1 f1Var, o25.k2 k2Var, cl0.g gVar, r45.d24 d24Var, kotlin.jvm.internal.h0 h0Var, com.tencent.mm.plugin.appbrand.jsruntime.r rVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f187905m = f1Var;
        this.f187906n = k2Var;
        this.f187907o = gVar;
        this.f187908p = d24Var;
        this.f187909q = h0Var;
        this.f187910r = rVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.webview.webcompt.s0(this.f187905m, this.f187906n, this.f187907o, this.f187908p, this.f187909q, this.f187910r, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.webview.webcompt.s0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f187904i;
        o25.k2 k2Var = this.f187906n;
        com.tencent.mm.plugin.webview.webcompt.f1 f1Var = this.f187905m;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mm.plugin.webview.webcompt.j0 j0Var = com.tencent.mm.plugin.webview.webcompt.j0.f187831i;
            com.tencent.mm.plugin.webview.webcompt.h0 h0Var = com.tencent.mm.plugin.webview.webcompt.f1.f187797e;
            f1Var.l(k2Var, j0Var);
            com.tencent.mm.plugin.webview.webcompt.f1 f1Var2 = this.f187905m;
            cl0.g gVar = this.f187907o;
            r45.d24 d24Var = this.f187908p;
            kotlin.jvm.internal.h0 h0Var2 = this.f187909q;
            com.tencent.mm.plugin.appbrand.jsruntime.r rVar = this.f187910r;
            this.f187899d = f1Var2;
            this.f187900e = gVar;
            this.f187901f = d24Var;
            this.f187902g = h0Var2;
            this.f187903h = rVar;
            this.f187904i = 1;
            oz5.n nVar = new oz5.n(pz5.f.b(this));
            com.tencent.mm.plugin.webview.webcompt.h0 h0Var3 = com.tencent.mm.plugin.webview.webcompt.f1.f187797e;
            pm0.v.L("MicroMsg.WebComponent", true, new com.tencent.mm.plugin.webview.webcompt.r0(f1Var2, gVar, d24Var, nVar, h0Var2, rVar));
            obj = nVar.a();
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.tencent.mm.plugin.webview.webcompt.f1.a(f1Var, k2Var, com.tencent.mm.plugin.webview.webcompt.j0.f187831i);
        return obj;
    }
}
