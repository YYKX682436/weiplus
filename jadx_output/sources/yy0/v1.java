package yy0;

/* loaded from: classes5.dex */
public final class v1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yy0.m7 f468375d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f468376e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f468377f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f468378g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(yy0.m7 m7Var, boolean z17, int i17, boolean z18, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f468375d = m7Var;
        this.f468376e = z17;
        this.f468377f = i17;
        this.f468378g = z18;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yy0.v1(this.f468375d, this.f468376e, this.f468377f, this.f468378g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        yy0.v1 v1Var = (yy0.v1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        v1Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        jz5.f0 f0Var;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mars.xlog.Log.i(this.f468375d.f468225d, "markMCWillStartImporting: isFromAlbum=" + this.f468376e + ", assetCount=" + this.f468377f + ", isFromMovieTemplate=" + this.f468378g);
        com.tencent.maas.instamovie.MJPublisherSessionMetrics mJPublisherSessionMetrics = this.f468375d.f468228g;
        jz5.f0 f0Var2 = jz5.f0.f302826a;
        if (mJPublisherSessionMetrics != null) {
            mJPublisherSessionMetrics.B(this.f468376e, this.f468377f, this.f468378g);
            f0Var = f0Var2;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.w(this.f468375d.f468225d, "mjPublisherSessionMetrics is null. Please call initMetrics() first.");
        }
        return f0Var2;
    }
}
