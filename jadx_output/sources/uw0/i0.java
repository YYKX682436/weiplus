package uw0;

/* loaded from: classes5.dex */
public final class i0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f431568d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ uw0.t0 f431569e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(uw0.t0 t0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f431569e = t0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new uw0.i0(this.f431569e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((uw0.i0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f431568d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            by0.n nVar = (by0.n) ((jz5.n) this.f431569e.f431609x).getValue();
            if (nVar != null) {
                this.f431568d = 1;
                if (nVar.a(this) == aVar) {
                    return aVar;
                }
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
