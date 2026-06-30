package yy0;

/* loaded from: classes5.dex */
public final class b1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yy0.m7 f468020d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.moviecomposing.Timeline f468021e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f468022f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f468023g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(yy0.m7 m7Var, com.tencent.maas.moviecomposing.Timeline timeline, int i17, int i18, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f468020d = m7Var;
        this.f468021e = timeline;
        this.f468022f = i17;
        this.f468023g = i18;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yy0.b1(this.f468020d, this.f468021e, this.f468022f, this.f468023g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        yy0.b1 b1Var = (yy0.b1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        b1Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        jz5.f0 f0Var;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mars.xlog.Log.i(this.f468020d.f468225d, "markMCDidEndComposing: timeline=" + this.f468021e + ", currentComposingStepIndex=" + this.f468022f + ", maxComposingStepIndex=" + this.f468023g);
        com.tencent.maas.instamovie.MJPublisherSessionMetrics mJPublisherSessionMetrics = this.f468020d.f468228g;
        jz5.f0 f0Var2 = jz5.f0.f302826a;
        if (mJPublisherSessionMetrics != null) {
            mJPublisherSessionMetrics.h(this.f468021e, this.f468022f, this.f468023g);
            f0Var = f0Var2;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.w(this.f468020d.f468225d, "mjPublisherSessionMetrics is null. Please call initMetrics() first.");
        }
        return f0Var2;
    }
}
