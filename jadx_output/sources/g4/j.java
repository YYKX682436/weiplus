package g4;

/* loaded from: classes5.dex */
public final class j extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f268378d;

    /* renamed from: e, reason: collision with root package name */
    public int f268379e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g4.l f268380f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.j f268381g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(g4.l lVar, kotlinx.coroutines.flow.j jVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f268380f = lVar;
        this.f268381g = jVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation completion) {
        kotlin.jvm.internal.o.g(completion, "completion");
        g4.j jVar = new g4.j(this.f268380f, this.f268381g, completion);
        jVar.f268378d = obj;
        return jVar;
    }

    @Override // yz5.p
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((g4.j) create(obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f268379e;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.flow.k kVar = (kotlinx.coroutines.flow.k) this.f268378d;
            if (this.f268380f.f268411b.compareAndSet(false, true)) {
                this.f268379e = 1;
                java.lang.Object a17 = this.f268381g.a(new kotlinx.coroutines.flow.a2(kVar, new kotlin.jvm.internal.f0()), this);
                if (a17 != pz5.a.f359186d) {
                    a17 = f0Var;
                }
                if (a17 == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return f0Var;
    }
}
