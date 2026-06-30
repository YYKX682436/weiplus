package gx0;

/* loaded from: classes5.dex */
public final class pf extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f276848d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f276849e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f276850f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f276851g;

    /* renamed from: h, reason: collision with root package name */
    public int f276852h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.moviecomposing.segments.ClipSegment f276853i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ gx0.gg f276854m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f276855n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ pu0.b f276856o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pf(com.tencent.maas.moviecomposing.segments.ClipSegment clipSegment, gx0.gg ggVar, java.lang.String str, pu0.b bVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f276853i = clipSegment;
        this.f276854m = ggVar;
        this.f276855n = str;
        this.f276856o = bVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new gx0.pf(this.f276853i, this.f276854m, this.f276855n, this.f276856o, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((gx0.pf) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object m521constructorimpl;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f276852h;
        boolean z17 = true;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.maas.moviecomposing.segments.ClipSegment clipSegment = this.f276853i;
            this.f276848d = clipSegment;
            gx0.gg ggVar = this.f276854m;
            this.f276849e = ggVar;
            java.lang.String str = this.f276855n;
            this.f276850f = str;
            pu0.b bVar = this.f276856o;
            this.f276851g = bVar;
            this.f276852h = 1;
            kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(this), 1);
            rVar.k();
            rVar.m(new gx0.of(ggVar));
            com.tencent.maas.model.time.MJTimeRange x17 = clipSegment.x1();
            kotlin.jvm.internal.o.f(x17, "getTimeRangeInMedia(...)");
            try {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                java.nio.ByteBuffer a17 = com.tencent.maas.utils.MJAudioPCMExtractor.a(new java.io.File(str), 2, 1, 16000, x17);
                kotlin.jvm.internal.o.d(a17);
                boolean booleanValue = bVar.d(a17).booleanValue();
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("asrAudioLocalCheck: localResult ");
                sb6.append(booleanValue);
                com.tencent.mars.xlog.Log.i("SubtitleRecommendedUseUIC", sb6.toString());
                if (!booleanValue) {
                    z17 = false;
                }
                rVar.resumeWith(kotlin.Result.m521constructorimpl(java.lang.Boolean.valueOf(z17)));
                m521constructorimpl = kotlin.Result.m521constructorimpl(jz5.f0.f302826a);
            } catch (java.lang.Throwable th6) {
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
            }
            java.lang.Throwable m524exceptionOrNullimpl = kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl);
            if (m524exceptionOrNullimpl != null) {
                com.tencent.mars.xlog.Log.i("SubtitleRecommendedUseUIC", "asrAudioLocalCheck: extractAudioPCM failed, error message = " + m524exceptionOrNullimpl.getMessage());
                rVar.resumeWith(kotlin.Result.m521constructorimpl(java.lang.Boolean.FALSE));
            }
            obj = rVar.j();
            pz5.a aVar2 = pz5.a.f359186d;
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return obj;
    }
}
