package gx0;

/* loaded from: classes5.dex */
public final class jd extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f276585d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f276586e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f276587f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f276588g;

    /* renamed from: h, reason: collision with root package name */
    public int f276589h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ gx0.bf f276590i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.moviecomposing.VideoClipWrapper f276591m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.moviecomposing.segments.ClipSegment f276592n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jd(gx0.bf bfVar, com.tencent.maas.moviecomposing.VideoClipWrapper videoClipWrapper, com.tencent.maas.moviecomposing.segments.ClipSegment clipSegment, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f276590i = bfVar;
        this.f276591m = videoClipWrapper;
        this.f276592n = clipSegment;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new gx0.jd(this.f276590i, this.f276591m, this.f276592n, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((gx0.jd) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f276589h;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.maas.moviecomposing.PlaybackSession playbackSession = this.f276590i.B;
            if (playbackSession == null) {
                com.tencent.mars.xlog.Log.w("MovieComp.PlaybackControlUIC", "beginClipSkimming - playbackSession is null");
                this.f276590i.L = false;
                this.f276591m.a();
                return java.lang.Boolean.FALSE;
            }
            com.tencent.maas.moviecomposing.VideoClipWrapper videoClipWrapper = this.f276591m;
            com.tencent.maas.moviecomposing.segments.ClipSegment clipSegment = this.f276592n;
            gx0.bf bfVar = this.f276590i;
            this.f276585d = playbackSession;
            this.f276586e = videoClipWrapper;
            this.f276587f = clipSegment;
            this.f276588g = bfVar;
            this.f276589h = 1;
            oz5.n nVar = new oz5.n(pz5.f.b(this));
            playbackSession.beginClipSkimming(videoClipWrapper, new gx0.id(clipSegment, bfVar, videoClipWrapper, nVar));
            obj = nVar.a();
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
