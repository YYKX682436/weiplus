package yy0;

/* loaded from: classes5.dex */
public final class j1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yy0.m7 f468159d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.moviecomposing.Timeline f468160e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f468161f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f468162g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(yy0.m7 m7Var, com.tencent.maas.moviecomposing.Timeline timeline, int i17, int i18, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f468159d = m7Var;
        this.f468160e = timeline;
        this.f468161f = i17;
        this.f468162g = i18;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yy0.j1(this.f468159d, this.f468160e, this.f468161f, this.f468162g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        yy0.j1 j1Var = (yy0.j1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        j1Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        jz5.f0 f0Var;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mars.xlog.Log.i(this.f468159d.f468225d, "markMCDidExitStickerUI: timeline=" + this.f468160e + ", currentComposingStepIndex=" + this.f468161f + ", maxComposingStepIndex=" + this.f468162g);
        com.tencent.maas.instamovie.MJPublisherSessionMetrics mJPublisherSessionMetrics = this.f468159d.f468228g;
        jz5.f0 f0Var2 = jz5.f0.f302826a;
        if (mJPublisherSessionMetrics != null) {
            mJPublisherSessionMetrics.p(this.f468160e, this.f468161f, this.f468162g);
            f0Var = f0Var2;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.w(this.f468159d.f468225d, "mjPublisherSessionMetrics is null. Please call initMetrics() first.");
        }
        return f0Var2;
    }
}
