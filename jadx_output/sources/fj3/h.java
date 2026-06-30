package fj3;

/* loaded from: classes14.dex */
public final class h extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f263205d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fj3.k f263206e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ej3.a f263207f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(fj3.k kVar, ej3.a aVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f263206e = kVar;
        this.f263207f = aVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new fj3.h(this.f263206e, this.f263207f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((fj3.h) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object m521constructorimpl;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f263205d;
        try {
            if (i17 == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                fj3.k kVar = this.f263206e;
                ej3.a aVar2 = this.f263207f;
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                ej3.c cVar = kVar.f263214d;
                this.f263205d = 1;
                obj = cVar.c(aVar2, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            m521constructorimpl = kotlin.Result.m521constructorimpl((ej3.b) obj);
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        if (kotlin.Result.m527isFailureimpl(m521constructorimpl)) {
            return null;
        }
        return m521constructorimpl;
    }
}
