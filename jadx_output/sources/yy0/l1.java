package yy0;

/* loaded from: classes5.dex */
public final class l1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yy0.m7 f468195d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.moviecomposing.Timeline f468196e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(yy0.m7 m7Var, com.tencent.maas.moviecomposing.Timeline timeline, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f468195d = m7Var;
        this.f468196e = timeline;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yy0.l1(this.f468195d, this.f468196e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        yy0.l1 l1Var = (yy0.l1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        l1Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        jz5.f0 f0Var;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mars.xlog.Log.i(this.f468195d.f468225d, "markMCDidStartComposing: timeline=" + this.f468196e);
        com.tencent.maas.instamovie.MJPublisherSessionMetrics mJPublisherSessionMetrics = this.f468195d.f468228g;
        jz5.f0 f0Var2 = jz5.f0.f302826a;
        if (mJPublisherSessionMetrics != null) {
            mJPublisherSessionMetrics.r(this.f468196e);
            f0Var = f0Var2;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.w(this.f468195d.f468225d, "mjPublisherSessionMetrics is null. Please call initMetrics() first.");
        }
        return f0Var2;
    }
}
