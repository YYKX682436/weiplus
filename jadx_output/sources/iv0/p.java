package iv0;

/* loaded from: classes5.dex */
public final class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ iv0.w f295078d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mv0.a f295079e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ iv0.c f295080f;

    public p(iv0.w wVar, mv0.a aVar, iv0.c cVar) {
        this.f295078d = wVar;
        this.f295079e = aVar;
        this.f295080f = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        iv0.w wVar = this.f295078d;
        gx0.w8 m76 = wVar.m7();
        mv0.a aVar = this.f295079e;
        java.lang.Float a17 = by0.b.a(aVar.f331527a.f331530a);
        m76.q7(a17 != null ? a17.floatValue() : 0.5625f, this.f295080f.getPanelHeight());
        gx0.kh p76 = wVar.p7();
        p76.getClass();
        mv0.b aspectRatioType = aVar.f331527a;
        kotlin.jvm.internal.o.g(aspectRatioType, "aspectRatioType");
        ex0.a0 a0Var = p76.f276642r;
        if (a0Var != null) {
            a0Var.f257103m = aspectRatioType;
        }
        com.tencent.maas.moviecomposing.AspectRatio a18 = com.tencent.maas.moviecomposing.AspectRatio.a(aspectRatioType.f331530a);
        com.tencent.maas.moviecomposing.Timeline o76 = p76.o7();
        if (o76 != null) {
            o76.C(a18);
        }
        iv0.w.l7(wVar).post(new iv0.o(wVar));
    }
}
