package sp2;

/* loaded from: classes2.dex */
public final class l0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f411068d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f411069e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ sp2.o2 f411070f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(int i17, sp2.o2 o2Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f411069e = i17;
        this.f411070f = o2Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new sp2.l0(this.f411069e, this.f411070f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((sp2.l0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f411068d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            long j17 = this.f411069e + 200;
            this.f411068d = 1;
            if (kotlinx.coroutines.k1.b(j17, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return jz5.f0.f302826a;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
        sp2.k0 k0Var = new sp2.k0(this.f411070f, null);
        this.f411068d = 2;
        if (kotlinx.coroutines.l.g(g3Var, k0Var, this) == aVar) {
            return aVar;
        }
        return jz5.f0.f302826a;
    }
}
