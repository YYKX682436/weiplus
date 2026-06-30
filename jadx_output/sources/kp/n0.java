package kp;

/* loaded from: classes7.dex */
public final class n0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f310801d;

    /* renamed from: e, reason: collision with root package name */
    public int f310802e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kp.i1 f310803f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(kp.i1 i1Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f310803f = i1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new kp.n0(this.f310803f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((kp.n0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f310802e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kp.i1 i1Var = this.f310803f;
            this.f310801d = i1Var;
            this.f310802e = 1;
            kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(this), 1);
            rVar.k();
            i1Var.f310769m = new kp.l0(rVar);
            rVar.m(new kp.m0(i1Var));
            obj = rVar.j();
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return obj;
    }
}
