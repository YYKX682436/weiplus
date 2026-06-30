package hu0;

/* loaded from: classes5.dex */
public final class u extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f285059d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hu0.a0 f285060e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(hu0.a0 a0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f285060e = a0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new hu0.u(this.f285060e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((hu0.u) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f285059d;
        hu0.a0 a0Var = this.f285060e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            gu0.k2 S6 = a0Var.S6();
            if (S6 != null) {
                this.f285059d = 1;
                obj = S6.n(this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            return new io.clipworks.displaysys.DSRenderView(a0Var.getActivity());
        }
        if (i17 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        return new io.clipworks.displaysys.DSRenderView(a0Var.getActivity());
    }
}
