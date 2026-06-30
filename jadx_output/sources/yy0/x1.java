package yy0;

/* loaded from: classes5.dex */
public final class x1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yy0.m7 f468401d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f468402e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f468403f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f468404g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(yy0.m7 m7Var, int i17, int i18, int i19, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f468401d = m7Var;
        this.f468402e = i17;
        this.f468403f = i18;
        this.f468404g = i19;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yy0.x1(this.f468401d, this.f468402e, this.f468403f, this.f468404g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        yy0.x1 x1Var = (yy0.x1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        x1Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        jz5.f0 f0Var;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mars.xlog.Log.i(this.f468401d.f468225d, "markMCWillStartTemplateCreating: assetCount=" + this.f468402e + ", imageCount=" + this.f468403f + ", videoCount=" + this.f468404g);
        com.tencent.maas.instamovie.MJPublisherSessionMetrics mJPublisherSessionMetrics = this.f468401d.f468228g;
        jz5.f0 f0Var2 = jz5.f0.f302826a;
        if (mJPublisherSessionMetrics != null) {
            mJPublisherSessionMetrics.D(this.f468402e, this.f468403f, this.f468404g);
            f0Var = f0Var2;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.w(this.f468401d.f468225d, "mjPublisherSessionMetrics is null. Please call initMetrics() first.");
        }
        return f0Var2;
    }
}
