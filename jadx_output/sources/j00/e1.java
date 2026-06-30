package j00;

/* loaded from: classes9.dex */
public final class e1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j00.k1 f296757d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f296758e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f296759f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f296760g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.Long f296761h;

    public e1(j00.k1 k1Var, java.lang.String str, java.lang.String str2, boolean z17, java.lang.Long l17) {
        this.f296757d = k1Var;
        this.f296758e = str;
        this.f296759f = str2;
        this.f296760g = z17;
        this.f296761h = l17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f296757d.ij(this.f296758e, this.f296759f, this.f296760g, this.f296761h);
    }
}
