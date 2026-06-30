package yy0;

/* loaded from: classes5.dex */
public final class k7 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yy0.m7 f468189d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k7(yy0.m7 m7Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f468189d = m7Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yy0.k7(this.f468189d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        yy0.k7 k7Var = (yy0.k7) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        k7Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mars.xlog.Log.i(this.f468189d.f468225d, "releaseMetrics");
        yy0.m7 m7Var = this.f468189d;
        m7Var.f468227f = yy0.q0.f468290g;
        com.tencent.maas.instamovie.MJPublisherSessionMetrics mJPublisherSessionMetrics = m7Var.f468228g;
        if (mJPublisherSessionMetrics != null) {
            mJPublisherSessionMetrics.q2();
        }
        this.f468189d.f468228g = null;
        this.f468189d.f468227f = yy0.q0.f468287d;
        ((yy0.o0) ((pp0.k0) i95.n0.c(pp0.k0.class))).getClass();
        pp0.l0 l0Var = (pp0.l0) i95.n0.c(pp0.l0.class);
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        java.util.Map Ai = ((yy0.m7) l0Var).Ai();
        Ai.put("view_id", "publisher_out");
        ((cy1.a) rVar).yj("publisher_out", null, Ai, 6, false);
        return jz5.f0.f302826a;
    }
}
