package com.tencent.mm.zoomimage.subsampling.internal;

/* loaded from: classes11.dex */
public final class l extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f214981d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.zoomimage.subsampling.internal.m0 f214982e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(com.tencent.mm.zoomimage.subsampling.internal.m0 m0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f214982e = m0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.zoomimage.subsampling.internal.l(this.f214982e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.zoomimage.subsampling.internal.l) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f214981d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mm.zoomimage.subsampling.internal.m0 m0Var = this.f214982e;
            kotlinx.coroutines.flow.f3 f3Var = ((br5.b) m0Var.f214994c).f23749a.f23752a.f256255p;
            com.tencent.mm.zoomimage.subsampling.internal.k kVar = new com.tencent.mm.zoomimage.subsampling.internal.k(m0Var);
            this.f214981d = 1;
            if (((kotlinx.coroutines.flow.h3) f3Var).a(kVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return jz5.f0.f302826a;
    }
}
