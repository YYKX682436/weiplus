package sz3;

/* loaded from: classes15.dex */
public final class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sz3.m f414023d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xz3.l f414024e;

    public h(sz3.m mVar, xz3.l lVar) {
        this.f414023d = mVar;
        this.f414024e = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        sz3.m mVar = this.f414023d;
        if (mVar.f414071g) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AiScanImageGetProductManager", "onTaskFinish isCancelled and ignore");
        } else {
            mVar.f414065a.j(this.f414024e);
        }
    }
}
