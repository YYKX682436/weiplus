package sz3;

/* loaded from: classes15.dex */
public final class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sz3.m f414020d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sz3.x0 f414021e;

    public g(sz3.m mVar, sz3.x0 x0Var) {
        this.f414020d = mVar;
        this.f414021e = x0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        sz3.m mVar = this.f414020d;
        if (mVar.f414071g) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AiScanImageGetProductManager", "onRetrievalSuccess isCancelled and ignore");
        } else {
            mVar.f414065a.h(this.f414021e);
        }
    }
}
