package pn4;

/* loaded from: classes4.dex */
public final class i1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f357118d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.j f357119e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ pn4.k1 f357120f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(kotlinx.coroutines.flow.j jVar, pn4.k1 k1Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f357119e = jVar;
        this.f357120f = k1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new pn4.i1(this.f357119e, this.f357120f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((pn4.i1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f357118d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            pn4.h1 h1Var = new pn4.h1(this.f357120f);
            this.f357118d = 1;
            if (this.f357119e.a(h1Var, this) == aVar) {
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
