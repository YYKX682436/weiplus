package com.tencent.mm.zoomimage.subsampling.internal;

/* loaded from: classes11.dex */
public final class n extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f215021d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.zoomimage.subsampling.internal.m0 f215022e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(com.tencent.mm.zoomimage.subsampling.internal.m0 m0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f215022e = m0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.zoomimage.subsampling.internal.n(this.f215022e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.zoomimage.subsampling.internal.n) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f215021d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mm.zoomimage.subsampling.internal.m0 m0Var = this.f215022e;
            kotlinx.coroutines.flow.f3 f3Var = ((br5.b) m0Var.f214994c).f23749a.f23752a.Q;
            com.tencent.mm.zoomimage.subsampling.internal.m mVar = new com.tencent.mm.zoomimage.subsampling.internal.m(m0Var);
            this.f215021d = 1;
            if (((kotlinx.coroutines.flow.h3) f3Var).a(mVar, this) == aVar) {
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
