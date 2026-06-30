package v26;

/* loaded from: classes14.dex */
public final class s extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f433055d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f433056e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ v26.t f433057f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.k f433058g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(v26.t tVar, kotlinx.coroutines.flow.k kVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f433057f = tVar;
        this.f433058g = kVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        v26.s sVar = new v26.s(this.f433057f, this.f433058g, continuation);
        sVar.f433056e = obj;
        return sVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((v26.s) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f433055d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.y0 y0Var = (kotlinx.coroutines.y0) this.f433056e;
            kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
            v26.t tVar = this.f433057f;
            kotlinx.coroutines.flow.j jVar = tVar.f433034g;
            v26.r rVar = new v26.r(h0Var, y0Var, tVar, this.f433058g);
            this.f433055d = 1;
            if (jVar.a(rVar, this) == aVar) {
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
