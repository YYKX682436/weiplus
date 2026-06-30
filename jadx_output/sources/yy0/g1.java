package yy0;

/* loaded from: classes5.dex */
public final class g1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yy0.m7 f468101d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.moviecomposing.Timeline f468102e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f468103f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f468104g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(yy0.m7 m7Var, com.tencent.maas.moviecomposing.Timeline timeline, int i17, int i18, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f468101d = m7Var;
        this.f468102e = timeline;
        this.f468103f = i17;
        this.f468104g = i18;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yy0.g1(this.f468101d, this.f468102e, this.f468103f, this.f468104g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        yy0.g1 g1Var = (yy0.g1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        g1Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        jz5.f0 f0Var;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mars.xlog.Log.i(this.f468101d.f468225d, "markMCDidExitClippingUI: timeline=" + this.f468102e + ", currentComposingStepIndex=" + this.f468103f + ", maxComposingStepIndex=" + this.f468104g);
        com.tencent.maas.instamovie.MJPublisherSessionMetrics mJPublisherSessionMetrics = this.f468101d.f468228g;
        jz5.f0 f0Var2 = jz5.f0.f302826a;
        if (mJPublisherSessionMetrics != null) {
            mJPublisherSessionMetrics.m(this.f468102e, this.f468103f, this.f468104g);
            f0Var = f0Var2;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.w(this.f468101d.f468225d, "mjPublisherSessionMetrics is null. Please call initMetrics() first.");
        }
        return f0Var2;
    }
}
