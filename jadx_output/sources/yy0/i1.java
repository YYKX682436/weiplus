package yy0;

/* loaded from: classes5.dex */
public final class i1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yy0.m7 f468141d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.moviecomposing.Timeline f468142e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f468143f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f468144g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(yy0.m7 m7Var, com.tencent.maas.moviecomposing.Timeline timeline, int i17, int i18, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f468141d = m7Var;
        this.f468142e = timeline;
        this.f468143f = i17;
        this.f468144g = i18;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yy0.i1(this.f468141d, this.f468142e, this.f468143f, this.f468144g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        yy0.i1 i1Var = (yy0.i1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        i1Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        jz5.f0 f0Var;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mars.xlog.Log.i(this.f468141d.f468225d, "markMCDidExitNarrationUI: timeline=" + this.f468142e + ", currentComposingStepIndex=" + this.f468143f + ", maxComposingStepIndex=" + this.f468144g);
        com.tencent.maas.instamovie.MJPublisherSessionMetrics mJPublisherSessionMetrics = this.f468141d.f468228g;
        jz5.f0 f0Var2 = jz5.f0.f302826a;
        if (mJPublisherSessionMetrics != null) {
            mJPublisherSessionMetrics.o(this.f468142e, this.f468143f, this.f468144g);
            f0Var = f0Var2;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.w(this.f468141d.f468225d, "mjPublisherSessionMetrics is null. Please call initMetrics() first.");
        }
        return f0Var2;
    }
}
