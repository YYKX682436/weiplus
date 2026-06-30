package d83;

/* loaded from: classes5.dex */
public final class s0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f227018d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d83.t0 f227019e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(d83.t0 t0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f227019e = t0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new d83.s0(this.f227019e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((d83.s0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f227018d;
        d83.t0 t0Var = this.f227019e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            t0Var.getClass();
            this.f227018d = 1;
            if (kotlinx.coroutines.k1.b(300000L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        if (java.lang.System.currentTimeMillis() - t0Var.f227026f.get() >= 300000) {
            t0Var.d();
        }
        return jz5.f0.f302826a;
    }
}
