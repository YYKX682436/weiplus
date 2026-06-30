package yy0;

/* loaded from: classes5.dex */
public final class h1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yy0.m7 f468118d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f468119e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f468120f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f468121g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f468122h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.moviecomposing.Timeline f468123i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f468124m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f468125n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(yy0.m7 m7Var, java.lang.String str, boolean z17, boolean z18, boolean z19, com.tencent.maas.moviecomposing.Timeline timeline, int i17, int i18, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f468118d = m7Var;
        this.f468119e = str;
        this.f468120f = z17;
        this.f468121g = z18;
        this.f468122h = z19;
        this.f468123i = timeline;
        this.f468124m = i17;
        this.f468125n = i18;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yy0.h1(this.f468118d, this.f468119e, this.f468120f, this.f468121g, this.f468122h, this.f468123i, this.f468124m, this.f468125n, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        yy0.h1 h1Var = (yy0.h1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        h1Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        jz5.f0 f0Var;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mars.xlog.Log.i(this.f468118d.f468225d, "markMCDidExitMusicUI: musicID=" + this.f468119e + ", enableBGM=" + this.f468120f + ", enableLyric=" + this.f468121g + ", enableOST=" + this.f468122h + ", timeline=" + this.f468123i + ", currentComposingStepIndex=" + this.f468124m + ", maxComposingStepIndex=" + this.f468125n);
        com.tencent.maas.instamovie.MJPublisherSessionMetrics mJPublisherSessionMetrics = this.f468118d.f468228g;
        jz5.f0 f0Var2 = jz5.f0.f302826a;
        if (mJPublisherSessionMetrics != null) {
            mJPublisherSessionMetrics.n(this.f468119e, this.f468120f, this.f468121g, this.f468122h, this.f468123i, this.f468124m, this.f468125n);
            f0Var = f0Var2;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.w(this.f468118d.f468225d, "mjPublisherSessionMetrics is null. Please call initMetrics() first.");
        }
        return f0Var2;
    }
}
