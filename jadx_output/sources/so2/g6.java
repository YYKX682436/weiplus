package so2;

/* loaded from: classes2.dex */
public final class g6 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f410367d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ so2.m6 f410368e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f410369f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g6(so2.m6 m6Var, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f410368e = m6Var;
        this.f410369f = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new so2.g6(this.f410368e, this.f410369f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((so2.g6) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f410367d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f410367d = 1;
            so2.m6 m6Var = this.f410368e;
            m6Var.getClass();
            kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(this), 1);
            rVar.k();
            rVar.m(new so2.b6(rVar));
            mn2.g1 g1Var = mn2.g1.f329975a;
            wo0.c b17 = g1Var.e().b(new mn2.q3(this.f410369f, com.tencent.mm.plugin.finder.storage.y90.f128356f), g1Var.h(mn2.f1.f329964r));
            so2.c6 c6Var = new so2.c6(m6Var, rVar);
            b17.getClass();
            b17.f447873d = c6Var;
            b17.f447879j = new so2.d6(rVar);
            b17.f447878i = new so2.e6(rVar);
            b17.f();
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
