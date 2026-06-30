package df2;

/* loaded from: classes3.dex */
public final class lf extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f230662d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ df2.qf f230663e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lf(df2.qf qfVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f230663e = qfVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new df2.lf(this.f230663e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((df2.lf) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        return pz5.a.f359186d;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f230662d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            df2.qf qfVar = this.f230663e;
            kotlinx.coroutines.flow.i2 i2Var = ((mm2.j2) qfVar.business(mm2.j2.class)).f329176x;
            df2.kf kfVar = new df2.kf(qfVar);
            this.f230662d = 1;
            kotlinx.coroutines.flow.q2 q2Var = (kotlinx.coroutines.flow.q2) i2Var;
            q2Var.getClass();
            if (kotlinx.coroutines.flow.q2.l(q2Var, kfVar, this) == aVar) {
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
