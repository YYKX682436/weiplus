package dh2;

/* loaded from: classes10.dex */
public final class k extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f232448d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dh2.x f232449e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(dh2.x xVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f232449e = xVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new dh2.k(this.f232449e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((dh2.k) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        return pz5.a.f359186d;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f232448d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            dh2.x xVar = this.f232449e;
            kotlinx.coroutines.flow.j2 j2Var = ((om2.e) xVar.f232468e.a(om2.e.class)).f346293i;
            dh2.j jVar = new dh2.j(xVar);
            this.f232448d = 1;
            if (((kotlinx.coroutines.flow.h3) j2Var).a(jVar, this) == aVar) {
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
