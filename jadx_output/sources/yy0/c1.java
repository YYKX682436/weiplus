package yy0;

/* loaded from: classes5.dex */
public final class c1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yy0.m7 f468034d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f468035e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f468036f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f468037g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f468038h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(yy0.m7 m7Var, java.lang.String str, boolean z17, java.lang.String str2, boolean z18, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f468034d = m7Var;
        this.f468035e = str;
        this.f468036f = z17;
        this.f468037g = str2;
        this.f468038h = z18;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yy0.c1(this.f468034d, this.f468035e, this.f468036f, this.f468037g, this.f468038h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        yy0.c1 c1Var = (yy0.c1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        c1Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        jz5.f0 f0Var;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mars.xlog.Log.i(this.f468034d.f468225d, "markMCDidEndExporting: endReason=" + this.f468035e + ", skipExporting=" + this.f468036f + ", resultMediaFilePath=" + this.f468037g + ", isHardwareEncoding=" + this.f468038h);
        com.tencent.maas.instamovie.MJPublisherSessionMetrics mJPublisherSessionMetrics = this.f468034d.f468228g;
        jz5.f0 f0Var2 = jz5.f0.f302826a;
        if (mJPublisherSessionMetrics != null) {
            mJPublisherSessionMetrics.i(this.f468035e, this.f468036f, this.f468037g, this.f468038h);
            f0Var = f0Var2;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.w(this.f468034d.f468225d, "mjPublisherSessionMetrics is null. Please call initMetrics() first.");
        }
        return f0Var2;
    }
}
