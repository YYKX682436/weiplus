package df2;

/* loaded from: classes3.dex */
public final class m5 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f230757d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ df2.n5 f230758e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m5(df2.n5 n5Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f230758e = n5Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new df2.m5(this.f230758e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((df2.m5) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f230757d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.r2 r2Var = this.f230758e.f230833m;
            if (r2Var != null) {
                this.f230757d = 1;
                if (kotlinx.coroutines.v2.d(r2Var, this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        if (in0.q.f292769b2 == null) {
            in0.q.f292769b2 = new in0.q(rn0.a.f397609a.a());
        }
        in0.q qVar = in0.q.f292769b2;
        kotlin.jvm.internal.o.d(qVar);
        qVar.a1(kz5.p0.f313996d);
        return jz5.f0.f302826a;
    }
}
