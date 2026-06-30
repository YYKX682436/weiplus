package pe3;

/* loaded from: classes5.dex */
public final class b0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f353636d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f353637e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ pe3.g0 f353638f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(pe3.g0 g0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f353638f = g0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        pe3.b0 b0Var = new pe3.b0(this.f353638f, continuation);
        b0Var.f353637e = obj;
        return b0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((pe3.b0) create((p1.a0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f353636d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            p1.a0 a0Var = (p1.a0) this.f353637e;
            pe3.a0 a0Var2 = new pe3.a0(this.f353638f);
            this.f353636d = 1;
            if (b0.d4.e(a0Var, a0Var2, null, null, null, this, 14, null) == aVar) {
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
