package df2;

/* loaded from: classes3.dex */
public final class df extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f229973d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ df2.qf f229974e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public df(df2.qf qfVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f229974e = qfVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new df2.df(this.f229974e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((df2.df) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f229973d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            df2.qf qfVar = this.f229974e;
            mm2.j2 j2Var = (mm2.j2) qfVar.business(mm2.j2.class);
            df2.cf cfVar = new df2.cf(qfVar);
            this.f229973d = 1;
            if (j2Var.V6(cfVar, true, this) == aVar) {
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
