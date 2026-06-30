package tx0;

/* loaded from: classes.dex */
public final class b extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f422499d;

    /* renamed from: e, reason: collision with root package name */
    public int f422500e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f422501f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ tx0.k f422502g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ double f422503h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ double f422504i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(tx0.k kVar, double d17, double d18, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f422502g = kVar;
        this.f422503h = d17;
        this.f422504i = d18;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        tx0.b bVar = new tx0.b(this.f422502g, this.f422503h, this.f422504i, continuation);
        bVar.f422501f = obj;
        return bVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((tx0.b) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v4, types: [kotlinx.coroutines.y0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7, types: [kotlinx.coroutines.y0] */
    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object m521constructorimpl;
        ?? r17;
        tx0.k kVar;
        java.lang.Object obj2;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f422500e;
        try {
            if (i17 == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                ?? r18 = (kotlinx.coroutines.y0) this.f422501f;
                tx0.k kVar2 = this.f422502g;
                double d17 = this.f422503h;
                double d18 = this.f422504i;
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                this.f422501f = r18;
                this.f422499d = kVar2;
                this.f422500e = 1;
                java.lang.Object a17 = tx0.k.a(kVar2, d17, d18, this);
                if (a17 == aVar) {
                    return aVar;
                }
                kVar = kVar2;
                obj2 = a17;
                i17 = r18;
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kVar = (tx0.k) this.f422499d;
                ?? r19 = (kotlinx.coroutines.y0) this.f422501f;
                kotlin.ResultKt.throwOnFailure(obj);
                obj2 = ((kotlin.Result) obj).getValue();
                i17 = r19;
            }
            kVar.f422527d = kotlin.Result.m520boximpl(obj2);
            m521constructorimpl = kotlin.Result.m521constructorimpl(jz5.f0.f302826a);
            r17 = i17;
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
            r17 = i17;
        }
        java.lang.Throwable m524exceptionOrNullimpl = kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl);
        if (m524exceptionOrNullimpl != null) {
            tx0.k kVar3 = this.f422502g;
            com.tencent.mars.xlog.Log.printErrStackTrace("Finder.LocationHelper", m524exceptionOrNullimpl, "", new java.lang.Object[0]);
            kVar3.f422527d = kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(m524exceptionOrNullimpl)));
        }
        tx0.k kVar4 = this.f422502g;
        synchronized (r17) {
            try {
                yz5.l lVar = kVar4.f422528e;
                if (lVar != null) {
                    kotlin.Result result = kVar4.f422527d;
                    lVar.invoke(kotlin.Result.m520boximpl(result != null ? result.getValue() : kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(new java.lang.IllegalStateException("No Location")))));
                }
                kVar4.f422528e = null;
            } catch (java.lang.Throwable th7) {
                throw th7;
            }
        }
        return jz5.f0.f302826a;
    }
}
