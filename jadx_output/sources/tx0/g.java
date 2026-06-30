package tx0;

/* loaded from: classes.dex */
public final class g extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f422512d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f422513e;

    /* renamed from: f, reason: collision with root package name */
    public int f422514f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f422515g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ tx0.k f422516h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(tx0.k kVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f422516h = kVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        tx0.g gVar = new tx0.g(this.f422516h, continuation);
        gVar.f422515g = obj;
        return gVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((tx0.g) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        tx0.k kVar;
        java.lang.Throwable th6;
        java.lang.Object m521constructorimpl;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f422514f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            tx0.k kVar2 = this.f422516h;
            try {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                this.f422515g = kVar2;
                this.f422512d = this;
                this.f422513e = kVar2;
                this.f422514f = 1;
                kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(this), 1);
                rVar.k();
                if (kVar2.f422526c) {
                    kVar2.f422528e = new tx0.e(rVar);
                    ((t60.e) ((u60.g) i95.n0.c(u60.g.class))).getClass();
                    i11.h.e().l(kVar2.f422529f, true, false, false);
                    rVar.m(new tx0.f(kVar2));
                } else {
                    rVar.resumeWith(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(new java.lang.IllegalStateException("No Location Permission"))));
                }
                java.lang.Object j17 = rVar.j();
                if (j17 == aVar) {
                    return aVar;
                }
                kVar = kVar2;
                obj = j17;
            } catch (java.lang.Throwable th7) {
                kVar = kVar2;
                th6 = th7;
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
                kVar.f422527d = kotlin.Result.m520boximpl(m521constructorimpl);
                return jz5.f0.f302826a;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kVar = (tx0.k) this.f422513e;
            try {
                kotlin.ResultKt.throwOnFailure(obj);
            } catch (java.lang.Throwable th8) {
                th6 = th8;
                kotlin.Result.Companion companion22 = kotlin.Result.INSTANCE;
                m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
                kVar.f422527d = kotlin.Result.m520boximpl(m521constructorimpl);
                return jz5.f0.f302826a;
            }
        }
        m521constructorimpl = kotlin.Result.m521constructorimpl((com.tencent.mm.modelgeo.Addr) obj);
        kVar.f422527d = kotlin.Result.m520boximpl(m521constructorimpl);
        return jz5.f0.f302826a;
    }
}
