package g4;

/* loaded from: classes5.dex */
public final class l2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f268417d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g4.p2 f268418e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ u26.w f268419f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(g4.p2 p2Var, u26.w wVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f268418e = p2Var;
        this.f268419f = wVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation completion) {
        kotlin.jvm.internal.o.g(completion, "completion");
        return new g4.l2(this.f268418e, this.f268419f, completion);
    }

    @Override // yz5.p
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((g4.l2) create(obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f268417d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.flow.j jVar = this.f268418e.f268489h.f268640k;
            g4.k2 k2Var = new g4.k2(this);
            this.f268417d = 1;
            if (jVar.a(k2Var, this) == aVar) {
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
