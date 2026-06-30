package te2;

/* loaded from: classes10.dex */
public final class l9 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f418210d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ te2.m9 f418211e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l9(te2.m9 m9Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f418211e = m9Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new te2.l9(this.f418211e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((te2.l9) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        return pz5.a.f359186d;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f418210d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            te2.m9 m9Var = this.f418211e;
            kotlinx.coroutines.flow.f3 f3Var = ((mm2.m6) m9Var.f418150e.a(mm2.m6.class)).f329251s;
            te2.k9 k9Var = new te2.k9(m9Var);
            this.f418210d = 1;
            if (((kotlinx.coroutines.flow.h3) f3Var).a(k9Var, this) == aVar) {
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
