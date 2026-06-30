package cx4;

/* loaded from: classes5.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cx4.m f224585d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f224586e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f224587f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f224588g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f224589h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f224590i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f224591m;

    public e(cx4.m mVar, java.lang.String str, int i17, int i18, java.lang.String str2, java.lang.String str3, int i19) {
        this.f224585d = mVar;
        this.f224586e = str;
        this.f224587f = i17;
        this.f224588g = i18;
        this.f224589h = str2;
        this.f224590i = str3;
        this.f224591m = i19;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mars.xlog.Log.i(this.f224585d.f224634a, "doReport url=" + this.f224586e + ", scene=" + this.f224587f + ", keyWordScanTime=" + this.f224588g);
        fo3.s.INSTANCE.Tb(this.f224586e, this.f224589h, this.f224590i, this.f224591m, this.f224587f);
    }
}
