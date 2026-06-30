package sz3;

/* loaded from: classes15.dex */
public final class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sz3.m f414037d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sz3.x0 f414038e;

    public k(sz3.m mVar, sz3.x0 x0Var) {
        this.f414037d = mVar;
        this.f414038e = x0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        sz3.m mVar = this.f414037d;
        if (mVar.f414071g) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AiScanImageGetProductManager", "onUploadSuccess isCancelled and ignore");
        } else {
            mVar.f414065a.c(this.f414038e);
        }
    }
}
