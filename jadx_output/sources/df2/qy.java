package df2;

/* loaded from: classes10.dex */
public final class qy extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f231199d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ df2.wy f231200e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qy(df2.wy wyVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f231200e = wyVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new df2.qy(this.f231200e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((df2.qy) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        return pz5.a.f359186d;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f231199d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            df2.wy wyVar = this.f231200e;
            kotlinx.coroutines.flow.i2 i2Var = wyVar.f231742s;
            df2.py pyVar = new df2.py(wyVar);
            this.f231199d = 1;
            kotlinx.coroutines.flow.q2 q2Var = (kotlinx.coroutines.flow.q2) i2Var;
            q2Var.getClass();
            if (kotlinx.coroutines.flow.q2.l(q2Var, pyVar, this) == aVar) {
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
