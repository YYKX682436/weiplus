package ig0;

/* loaded from: classes12.dex */
public final class f extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f291313d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f291314e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ cg0.a f291315f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ig0.o f291316g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(cg0.a aVar, ig0.o oVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f291315f = aVar;
        this.f291316g = oVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        ig0.f fVar = new ig0.f(this.f291315f, this.f291316g, continuation);
        fVar.f291314e = obj;
        return fVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ig0.f) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f291313d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.y0 y0Var = (kotlinx.coroutines.y0) this.f291314e;
            fg0.g a17 = fg0.g.f261836h.a();
            ig0.e eVar = new ig0.e(y0Var, this.f291316g);
            this.f291313d = 1;
            if (a17.V6(this.f291315f, eVar, this) == aVar) {
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
