package ly0;

/* loaded from: classes5.dex */
public final class f extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f322199d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ly0.n f322200e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f322201f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ly0.d f322202g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(ly0.n nVar, java.lang.String str, ly0.d dVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f322200e = nVar;
        this.f322201f = str;
        this.f322202g = dVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ly0.f(this.f322200e, this.f322201f, this.f322202g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ly0.f) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object m521constructorimpl;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f322199d;
        try {
            if (i17 == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                ly0.n nVar = this.f322200e;
                java.lang.String str = this.f322201f;
                ly0.d dVar = this.f322202g;
                this.f322199d = 1;
                m521constructorimpl = nVar.e(str, dVar, this);
                if (m521constructorimpl == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                m521constructorimpl = ((kotlin.Result) obj).getValue();
            }
        } catch (java.lang.Exception e17) {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(e17));
        }
        return kotlin.Result.m520boximpl(m521constructorimpl);
    }
}
