package ty0;

/* loaded from: classes3.dex */
public final class k1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f422863d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f422864e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(n0.v2 v2Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f422864e = v2Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ty0.k1(this.f422864e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ty0.k1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f422863d;
        if (i17 != 0 && i17 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        do {
            n0.v2 v2Var = this.f422864e;
            v2Var.setValue(java.lang.Integer.valueOf(((java.lang.Number) v2Var.getValue()).intValue() + 1));
            this.f422863d = 1;
        } while (kotlinx.coroutines.k1.b(100L, this) != aVar);
        return aVar;
    }
}
