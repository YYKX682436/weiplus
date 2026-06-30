package jf2;

/* loaded from: classes3.dex */
public final class g0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f299372d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ jf2.k0 f299373e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(jf2.k0 k0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f299373e = k0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new jf2.g0(this.f299373e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((jf2.g0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.f3 f3Var;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f299372d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            jf2.k0 k0Var = this.f299373e;
            mm2.n0 n0Var = (mm2.n0) k0Var.business(mm2.n0.class);
            if (n0Var == null || (f3Var = n0Var.f329271p) == null) {
                return jz5.f0.f302826a;
            }
            jf2.f0 f0Var = new jf2.f0(k0Var);
            this.f299372d = 1;
            if (f3Var.a(f0Var, this) == aVar) {
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
