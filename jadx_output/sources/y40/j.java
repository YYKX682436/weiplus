package y40;

/* loaded from: classes11.dex */
public final class j extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f459312d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ y40.i0 f459313e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(y40.i0 i0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f459313e = i0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new y40.j(this.f459313e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((y40.j) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f459312d;
        y40.i0 i0Var = this.f459313e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            pi0.l1 l1Var = i0Var.f459298g;
            if (l1Var != null) {
                this.f459312d = 1;
                if (l1Var.h(i0Var, this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        i0Var.f459298g = null;
        return jz5.f0.f302826a;
    }
}
