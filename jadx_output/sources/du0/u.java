package du0;

/* loaded from: classes.dex */
public final class u extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f243446d;

    /* renamed from: e, reason: collision with root package name */
    public int f243447e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ du0.i0 f243448f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(du0.i0 i0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f243448f = i0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new du0.u(this.f243448f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((du0.u) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f243447e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            du0.i0 i0Var = this.f243448f;
            this.f243446d = i0Var;
            this.f243447e = 1;
            kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(this), 1);
            rVar.k();
            du0.p pVar = new du0.p(i0Var, new du0.t(rVar, i0Var));
            ((t60.e) ((u60.g) i95.n0.c(u60.g.class))).getClass();
            i11.h.e().k(pVar, true);
            rVar.m(new du0.r(pVar));
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
