package yy0;

/* loaded from: classes5.dex */
public final class t2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yy0.m7 f468331d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f468332e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f468333f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f468334g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f468335h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ float f468336i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f468337m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t2(yy0.m7 m7Var, float f17, float f18, float f19, float f27, float f28, float f29, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f468331d = m7Var;
        this.f468332e = f17;
        this.f468333f = f18;
        this.f468334g = f19;
        this.f468335h = f27;
        this.f468336i = f28;
        this.f468337m = f29;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yy0.t2(this.f468331d, this.f468332e, this.f468333f, this.f468334g, this.f468335h, this.f468336i, this.f468337m, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        yy0.t2 t2Var = (yy0.t2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        t2Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        jz5.f0 f0Var;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mars.xlog.Log.i(this.f468331d.f468225d, "notifyMCApplyColorAdjustment: brightness=" + this.f468332e + ", contrast=" + this.f468333f + ", saturability=" + this.f468334g + ", temperature=" + this.f468335h + ", vignette=" + this.f468336i + ", sharpness=" + this.f468337m);
        com.tencent.maas.instamovie.MJPublisherSessionMetrics mJPublisherSessionMetrics = this.f468331d.f468228g;
        jz5.f0 f0Var2 = jz5.f0.f302826a;
        if (mJPublisherSessionMetrics != null) {
            mJPublisherSessionMetrics.Z(this.f468332e, this.f468333f, this.f468334g, this.f468335h, this.f468336i, this.f468337m);
            f0Var = f0Var2;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.w(this.f468331d.f468225d, "mjPublisherSessionMetrics is null. Please call initMetrics() first.");
        }
        return f0Var2;
    }
}
