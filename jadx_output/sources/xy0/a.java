package xy0;

/* loaded from: classes5.dex */
public final class a extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f458120d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f458121e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f458122f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f458123g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f458124h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f458125i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(java.util.List list, long j17, long j18, long j19, int i17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f458121e = list;
        this.f458122f = j17;
        this.f458123g = j18;
        this.f458124h = j19;
        this.f458125i = i17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new xy0.a(this.f458121e, this.f458122f, this.f458123g, this.f458124h, this.f458125i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((xy0.a) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object m521constructorimpl;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f458120d;
        try {
            if (i17 == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                java.util.List list = this.f458121e;
                long j17 = this.f458122f;
                long j18 = this.f458123g;
                long j19 = this.f458124h;
                int i18 = this.f458125i;
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                r45.ih4 ih4Var = new r45.ih4();
                ih4Var.f377046e = 0.0f;
                ih4Var.f377047f = 0.0f;
                ih4Var.f377048g = xy0.d.a(xy0.d.f458135a, list);
                ih4Var.f377051m = j17;
                ih4Var.f377050i = j18;
                ih4Var.f377049h = j19;
                ih4Var.f377045d = i18;
                com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
                lVar.f70667d = 341;
                lVar.f70666c = "/cgi-bin/micromsg-bin/getrecommendedmusiclist";
                lVar.f70664a = ih4Var;
                lVar.f70665b = new r45.jh4();
                com.tencent.mm.modelbase.o a17 = lVar.a();
                com.tencent.mm.modelbase.i iVar = new com.tencent.mm.modelbase.i();
                iVar.p(a17);
                this.f458120d = 1;
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
            m521constructorimpl = kotlin.Result.m521constructorimpl((r45.jh4) obj);
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        java.lang.Throwable m524exceptionOrNullimpl = kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl);
        if (m524exceptionOrNullimpl != null) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.CgiHelper", m524exceptionOrNullimpl, "recommendMusic cgi error", new java.lang.Object[0]);
        }
        if (kotlin.Result.m527isFailureimpl(m521constructorimpl)) {
            return null;
        }
        return m521constructorimpl;
    }
}
