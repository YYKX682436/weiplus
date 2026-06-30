package yy0;

/* loaded from: classes5.dex */
public final class m2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yy0.m7 f468211d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f468212e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f468213f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f468214g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f468215h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f468216i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f468217m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f468218n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f468219o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ boolean f468220p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m2(yy0.m7 m7Var, java.lang.String str, java.lang.String str2, int i17, boolean z17, java.lang.String str3, boolean z18, boolean z19, boolean z27, boolean z28, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f468211d = m7Var;
        this.f468212e = str;
        this.f468213f = str2;
        this.f468214g = i17;
        this.f468215h = z17;
        this.f468216i = str3;
        this.f468217m = z18;
        this.f468218n = z19;
        this.f468219o = z27;
        this.f468220p = z28;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yy0.m2(this.f468211d, this.f468212e, this.f468213f, this.f468214g, this.f468215h, this.f468216i, this.f468217m, this.f468218n, this.f468219o, this.f468220p, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        yy0.m2 m2Var = (yy0.m2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        m2Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        jz5.f0 f0Var;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mars.xlog.Log.i(this.f468211d.f468225d, "markSCWillStartPreviewing: templateID=" + this.f468212e + ", templateTabID=" + this.f468213f + ", templateIndex=" + this.f468214g + ", isTemplateSelectDefault=" + this.f468215h + ", musicID=" + this.f468216i + ", isFrontFacingCamera=" + this.f468217m + ", isMicrophoneOpened=" + this.f468218n + ", isFavorite=" + this.f468219o + ", isAIGC=" + this.f468220p);
        this.f468211d.B = this.f468217m;
        com.tencent.maas.instamovie.MJPublisherSessionMetrics mJPublisherSessionMetrics = this.f468211d.f468228g;
        jz5.f0 f0Var2 = jz5.f0.f302826a;
        if (mJPublisherSessionMetrics != null) {
            mJPublisherSessionMetrics.S(this.f468212e, this.f468213f, this.f468214g, this.f468215h, this.f468216i, this.f468217m, this.f468218n, this.f468219o, this.f468220p);
            f0Var = f0Var2;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.w(this.f468211d.f468225d, "mjPublisherSessionMetrics is null. Please call initMetrics() first.");
        }
        return f0Var2;
    }
}
