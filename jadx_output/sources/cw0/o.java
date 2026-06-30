package cw0;

/* loaded from: classes5.dex */
public final class o extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f222662d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cw0.l0 f222663e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f222664f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(cw0.l0 l0Var, boolean z17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f222663e = l0Var;
        this.f222664f = z17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new cw0.o(this.f222663e, this.f222664f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((cw0.o) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f222662d;
        cw0.l0 l0Var = this.f222663e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.r2 r2Var = l0Var.f222649u;
            if (r2Var != null) {
                this.f222662d = 1;
                if (r2Var.C(this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        l0Var.t7().getClass();
        uu0.c.e().h(java.lang.Boolean.valueOf(this.f222664f));
        return jz5.f0.f302826a;
    }
}
