package yy0;

/* loaded from: classes5.dex */
public final class j2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yy0.m7 f468163d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f468164e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f468165f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f468166g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(yy0.m7 m7Var, int i17, int i18, int i19, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f468163d = m7Var;
        this.f468164e = i17;
        this.f468165f = i18;
        this.f468166g = i19;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yy0.j2(this.f468163d, this.f468164e, this.f468165f, this.f468166g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        yy0.j2 j2Var = (yy0.j2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        j2Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        jz5.f0 f0Var;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mars.xlog.Log.i(this.f468163d.f468225d, "markSCWillStartAssetCreating: assetCount=" + this.f468164e + ", imageCount=" + this.f468165f + ", videoCount=" + this.f468166g);
        com.tencent.maas.instamovie.MJPublisherSessionMetrics mJPublisherSessionMetrics = this.f468163d.f468228g;
        jz5.f0 f0Var2 = jz5.f0.f302826a;
        if (mJPublisherSessionMetrics != null) {
            mJPublisherSessionMetrics.P(this.f468164e, this.f468165f, this.f468166g);
            f0Var = f0Var2;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.w(this.f468163d.f468225d, "mjPublisherSessionMetrics is null. Please call initMetrics() first.");
        }
        return f0Var2;
    }
}
