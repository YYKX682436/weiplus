package yy0;

/* loaded from: classes5.dex */
public final class h2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yy0.m7 f468126d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h2(yy0.m7 m7Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f468126d = m7Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yy0.h2(this.f468126d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        yy0.h2 h2Var = (yy0.h2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        h2Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        jz5.f0 f0Var;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mars.xlog.Log.i(this.f468126d.f468225d, "markSCWillEnterMusicUI");
        com.tencent.maas.instamovie.MJPublisherSessionMetrics mJPublisherSessionMetrics = this.f468126d.f468228g;
        jz5.f0 f0Var2 = jz5.f0.f302826a;
        if (mJPublisherSessionMetrics != null) {
            mJPublisherSessionMetrics.N();
            f0Var = f0Var2;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.w(this.f468126d.f468225d, "mjPublisherSessionMetrics is null. Please call initMetrics() first.");
        }
        return f0Var2;
    }
}
