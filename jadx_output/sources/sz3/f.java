package sz3;

/* loaded from: classes15.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sz3.m f414013d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sz3.x0 f414014e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f414015f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f414016g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f414017h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f414018i;

    public f(sz3.m mVar, sz3.x0 x0Var, int i17, long j17, int i18, java.lang.String str) {
        this.f414013d = mVar;
        this.f414014e = x0Var;
        this.f414015f = i17;
        this.f414016g = j17;
        this.f414017h = i18;
        this.f414018i = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        sz3.m mVar = this.f414013d;
        if (mVar.f414071g) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AiScanImageGetProductManager", "onRetrievalFailed isCancelled and ignore");
        } else {
            mVar.f414065a.a(this.f414014e, this.f414015f, this.f414016g, this.f414017h, this.f414018i);
        }
    }
}
