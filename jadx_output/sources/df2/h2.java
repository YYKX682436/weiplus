package df2;

/* loaded from: classes10.dex */
public final class h2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f230278d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ df2.k2 f230279e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h2(df2.k2 k2Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f230279e = k2Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new df2.h2(this.f230279e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((df2.h2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        return pz5.a.f359186d;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f230278d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            df2.k2 k2Var = this.f230279e;
            kotlinx.coroutines.flow.j2 j2Var = ((mm2.c1) k2Var.business(mm2.c1.class)).f328829k2;
            df2.g2 g2Var = new df2.g2(k2Var);
            this.f230278d = 1;
            if (((kotlinx.coroutines.flow.h3) j2Var).a(g2Var, this) == aVar) {
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
