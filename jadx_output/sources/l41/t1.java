package l41;

/* loaded from: classes4.dex */
public final class t1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f315928d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.j f315929e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f315930f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(kotlinx.coroutines.flow.j jVar, yz5.l lVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f315929e = jVar;
        this.f315930f = lVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new l41.t1(this.f315929e, this.f315930f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((l41.t1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f315928d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            l41.s1 s1Var = new l41.s1(this.f315930f);
            this.f315928d = 1;
            if (this.f315929e.a(s1Var, this) == aVar) {
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
