package df2;

/* loaded from: classes3.dex */
public final class di extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f229981d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ df2.fi f229982e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public di(df2.fi fiVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f229982e = fiVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new df2.di(this.f229982e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((df2.di) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        return pz5.a.f359186d;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f229981d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            df2.fi fiVar = this.f229982e;
            kotlinx.coroutines.flow.j2 j2Var = ((mm2.g1) fiVar.business(mm2.g1.class)).f329079t;
            df2.ci ciVar = new df2.ci(fiVar);
            this.f229981d = 1;
            if (((kotlinx.coroutines.flow.h3) j2Var).a(ciVar, this) == aVar) {
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
