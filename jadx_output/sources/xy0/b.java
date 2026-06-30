package xy0;

/* loaded from: classes5.dex */
public final class b extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f458126d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f458127e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f458128f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f458129g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f458130h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f458131i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(long j17, java.lang.String str, int i17, int i18, long j18, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f458127e = j17;
        this.f458128f = str;
        this.f458129g = i17;
        this.f458130h = i18;
        this.f458131i = j18;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new xy0.b(this.f458127e, this.f458128f, this.f458129g, this.f458130h, this.f458131i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((xy0.b) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object m521constructorimpl;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f458126d;
        try {
            if (i17 == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                long j17 = this.f458127e;
                java.lang.String str = this.f458128f;
                int i18 = this.f458129g;
                int i19 = this.f458130h;
                long j18 = this.f458131i;
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                r45.lh lhVar = new r45.lh();
                lhVar.f379467e = j17;
                lhVar.f379468f = str;
                lhVar.f379469g = i18;
                lhVar.f379470h = i19;
                lhVar.f379471i = j18;
                com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
                lVar.f70667d = 3645;
                lVar.f70666c = "/cgi-bin/micromsg-bin/sprbgmsearch";
                lVar.f70664a = lhVar;
                lVar.f70665b = new r45.mh();
                com.tencent.mm.modelbase.o a17 = lVar.a();
                com.tencent.mm.modelbase.i iVar = new com.tencent.mm.modelbase.i();
                iVar.p(a17);
                this.f458126d = 1;
                obj = rm0.h.a(iVar, 0L, null, this, 3, null);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            m521constructorimpl = kotlin.Result.m521constructorimpl((r45.mh) obj);
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        java.lang.Throwable m524exceptionOrNullimpl = kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl);
        if (m524exceptionOrNullimpl != null) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.CgiHelper", m524exceptionOrNullimpl, "searchMMMusic cgi error", new java.lang.Object[0]);
        }
        if (kotlin.Result.m527isFailureimpl(m521constructorimpl)) {
            return null;
        }
        return m521constructorimpl;
    }
}
