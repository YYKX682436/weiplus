package sz3;

/* loaded from: classes15.dex */
public final class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sz3.m f414029d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sz3.x0 f414030e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f414031f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f414032g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f414033h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f414034i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f414035m;

    public j(sz3.m mVar, sz3.x0 x0Var, int i17, long j17, int i18, int i19, java.lang.String str) {
        this.f414029d = mVar;
        this.f414030e = x0Var;
        this.f414031f = i17;
        this.f414032g = j17;
        this.f414033h = i18;
        this.f414034i = i19;
        this.f414035m = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        sz3.m mVar = this.f414029d;
        if (mVar.f414071g) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AiScanImageGetProductManager", "onUploadFailed isCancelled and ignore");
        } else {
            mVar.f414065a.d(this.f414030e, this.f414031f, this.f414032g, this.f414033h, this.f414034i, this.f414035m);
        }
    }
}
