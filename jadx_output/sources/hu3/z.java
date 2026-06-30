package hu3;

/* loaded from: classes5.dex */
public final class z extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f285221d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hu3.n0 f285222e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(hu3.n0 n0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f285222e = n0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new hu3.z(this.f285222e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((hu3.z) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f285221d;
        hu3.n0 n0Var = this.f285222e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            if (n0Var.f285179z) {
                pp0.p0 p0Var = n0Var.f285162f;
                if (p0Var != null) {
                    this.f285221d = 1;
                    obj = p0Var.E0(this);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                n0Var.f285179z = false;
            }
            return jz5.f0.f302826a;
        }
        if (i17 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        n0Var.f285179z = false;
        return jz5.f0.f302826a;
    }
}
