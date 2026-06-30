package k0;

/* loaded from: classes14.dex */
public final class g0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f302911d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f302912e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n0.e5 f302913f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ z.e f302914g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(n0.e5 e5Var, z.e eVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f302913f = e5Var;
        this.f302914g = eVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        k0.g0 g0Var = new k0.g0(this.f302913f, this.f302914g, continuation);
        g0Var.f302912e = obj;
        return g0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((k0.g0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f302911d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.y0 y0Var = (kotlinx.coroutines.y0) this.f302912e;
            kotlinx.coroutines.flow.j f17 = n0.s4.f(new k0.d0(this.f302913f));
            k0.f0 f0Var = new k0.f0(this.f302914g, y0Var);
            this.f302911d = 1;
            if (((kotlinx.coroutines.flow.b) f17).a(f0Var, this) == aVar) {
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
