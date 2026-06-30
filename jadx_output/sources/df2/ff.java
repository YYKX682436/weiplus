package df2;

/* loaded from: classes3.dex */
public final class ff extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f230138d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ df2.qf f230139e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ff(df2.qf qfVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f230139e = qfVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new df2.ff(this.f230139e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((df2.ff) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        return pz5.a.f359186d;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f230138d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            df2.qf qfVar = this.f230139e;
            kotlinx.coroutines.flow.j2 j2Var = ((mm2.j2) qfVar.business(mm2.j2.class)).f329165m;
            df2.ef efVar = new df2.ef(qfVar);
            this.f230138d = 1;
            if (((kotlinx.coroutines.flow.h3) j2Var).a(efVar, this) == aVar) {
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
