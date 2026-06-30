package com.tencent.mm.zoomimage.subsampling.internal;

/* loaded from: classes11.dex */
public final class j1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.zoomimage.subsampling.internal.v1 f214971d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yq5.m f214972e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(com.tencent.mm.zoomimage.subsampling.internal.v1 v1Var, yq5.m mVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f214971d = v1Var;
        this.f214972e = mVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.zoomimage.subsampling.internal.j1(this.f214971d, this.f214972e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.zoomimage.subsampling.internal.j1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object m521constructorimpl;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.zoomimage.subsampling.internal.v1 v1Var = this.f214971d;
        yq5.m mVar = this.f214972e;
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(v1Var.f215125c.a(mVar.f464607b, mVar.f464608c));
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        return kotlin.Result.m520boximpl(m521constructorimpl);
    }
}
