package sz3;

/* loaded from: classes15.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sz3.m f414009d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sz3.c1 f414010e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ sz3.x0 f414011f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f414012g;

    public e(sz3.m mVar, sz3.c1 c1Var, sz3.x0 x0Var, yz5.l lVar) {
        this.f414009d = mVar;
        this.f414010e = c1Var;
        this.f414011f = x0Var;
        this.f414012g = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        sz3.m mVar = this.f414009d;
        if (mVar.f414071g) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AiScanImageGetProductManager", "onAddScanProductResultForFullImage isCancelled and ignore");
            return;
        }
        mVar.f414065a.f(this.f414010e, this.f414011f, this.f414012g);
    }
}
