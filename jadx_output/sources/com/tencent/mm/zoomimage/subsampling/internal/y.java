package com.tencent.mm.zoomimage.subsampling.internal;

/* loaded from: classes11.dex */
public final class y extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f215157d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.zoomimage.subsampling.internal.m0 f215158e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yq5.k f215159f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f215160g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f215161h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(com.tencent.mm.zoomimage.subsampling.internal.m0 m0Var, yq5.k kVar, long j17, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f215158e = m0Var;
        this.f215159f = kVar;
        this.f215160g = j17;
        this.f215161h = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.zoomimage.subsampling.internal.y(this.f215158e, this.f215159f, this.f215160g, this.f215161h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.zoomimage.subsampling.internal.y) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object b17;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f215157d;
        com.tencent.mm.zoomimage.subsampling.internal.m0 m0Var = this.f215158e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            zq5.k kVar = m0Var.f214993b;
            yq5.k kVar2 = this.f215159f;
            long j17 = this.f215160g;
            java.util.List list = m0Var.f215012u;
            this.f215157d = 1;
            b17 = com.tencent.mm.zoomimage.subsampling.internal.q0.b(kVar, kVar2, j17, list, this);
            if (b17 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            b17 = ((kotlin.Result) obj).getValue();
        }
        boolean m527isFailureimpl = kotlin.Result.m527isFailureimpl(b17);
        jz5.f0 f0Var = jz5.f0.f302826a;
        yq5.k kVar3 = this.f215159f;
        java.lang.String str = this.f215161h;
        if (m527isFailureimpl && !(kotlin.Result.m524exceptionOrNullimpl(b17) instanceof java.util.concurrent.CancellationException) && !(kotlin.Result.m524exceptionOrNullimpl(b17) instanceof java.util.concurrent.CancellationException)) {
            m0Var.f214993b.a(new com.tencent.mm.zoomimage.subsampling.internal.w(m0Var, str, b17, kVar3));
            return f0Var;
        }
        kotlin.ResultKt.throwOnFailure(b17);
        com.tencent.mm.zoomimage.subsampling.internal.v0 v0Var = (com.tencent.mm.zoomimage.subsampling.internal.v0) b17;
        yq5.c cVar = kVar3.f464601b;
        if (cVar == null) {
            cVar = v0Var.f215122m;
        }
        yq5.c cVar2 = cVar;
        m0Var.f215013v = cVar2;
        m0Var.f214999h = v0Var;
        ((br5.b) m0Var.f214994c).a(cVar2.f464591a);
        com.tencent.mm.zoomimage.subsampling.internal.m0 m0Var2 = this.f215158e;
        m0Var2.f214993b.a(new com.tencent.mm.zoomimage.subsampling.internal.x(m0Var2, this.f215161h, this.f215160g, cVar2, this.f215159f));
        m0Var.d(str);
        m0Var.g(str);
        return f0Var;
    }
}
