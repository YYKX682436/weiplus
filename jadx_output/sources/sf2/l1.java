package sf2;

/* loaded from: classes10.dex */
public final class l1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f407194d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sf2.m1 f407195e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(sf2.m1 m1Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f407195e = m1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new sf2.l1(this.f407195e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((sf2.l1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        return pz5.a.f359186d;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f407194d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            sf2.m1 m1Var = this.f407195e;
            kotlinx.coroutines.flow.f3 f3Var = m1Var.f407203b.f329251s;
            sf2.k1 k1Var = new sf2.k1(m1Var);
            this.f407194d = 1;
            if (((kotlinx.coroutines.flow.h3) f3Var).a(k1Var, this) == aVar) {
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
