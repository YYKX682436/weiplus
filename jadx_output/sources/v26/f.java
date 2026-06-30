package v26;

/* loaded from: classes14.dex */
public final class f extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f432995d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f432996e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ v26.g f432997f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(v26.g gVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f432997f = gVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        v26.f fVar = new v26.f(this.f432997f, continuation);
        fVar.f432996e = obj;
        return fVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((v26.f) create((u26.r0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f432995d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            u26.r0 r0Var = (u26.r0) this.f432996e;
            this.f432995d = 1;
            if (this.f432997f.f(r0Var, this) == aVar) {
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
