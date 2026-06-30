package com.tencent.mm.zoomimage.subsampling.internal;

/* loaded from: classes11.dex */
public final class r extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f215072d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.zoomimage.subsampling.internal.m0 f215073e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(com.tencent.mm.zoomimage.subsampling.internal.m0 m0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f215073e = m0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.zoomimage.subsampling.internal.r(this.f215073e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((com.tencent.mm.zoomimage.subsampling.internal.r) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        return pz5.a.f359186d;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f215072d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mm.zoomimage.subsampling.internal.m0 m0Var = this.f215073e;
            kotlinx.coroutines.flow.i2 i2Var = m0Var.f215002k;
            com.tencent.mm.zoomimage.subsampling.internal.q qVar = new com.tencent.mm.zoomimage.subsampling.internal.q(m0Var);
            this.f215072d = 1;
            kotlinx.coroutines.flow.q2 q2Var = (kotlinx.coroutines.flow.q2) i2Var;
            q2Var.getClass();
            if (kotlinx.coroutines.flow.q2.l(q2Var, qVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        throw new jz5.d();
    }
}
