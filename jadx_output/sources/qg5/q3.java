package qg5;

/* loaded from: classes8.dex */
public final class q3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f363141d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qg5.u3 f363142e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f363143f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q3(qg5.u3 u3Var, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f363142e = u3Var;
        this.f363143f = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new qg5.q3(this.f363142e, this.f363143f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((qg5.q3) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f363141d;
        qg5.u3 u3Var = this.f363142e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            ct.q2 U6 = u3Var.U6();
            this.f363141d = 1;
            if (((qg5.l0) U6).nj(this.f363143f, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        ((qg5.l0) u3Var.U6()).ij();
        return jz5.f0.f302826a;
    }
}
