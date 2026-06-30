package sz3;

/* loaded from: classes15.dex */
public final class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sz3.p f414063d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sz3.m f414064e;

    public l(sz3.p pVar, sz3.m mVar) {
        this.f414063d = pVar;
        this.f414064e = mVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        sz3.p pVar = this.f414063d;
        com.tencent.mars.xlog.Log.i("MicroMsg.AiScanImageGetProductManager", "requestGetProduct trackId: %s, session: %s", java.lang.Integer.valueOf(pVar.f413945b.f413959a.getId()), java.lang.Long.valueOf(pVar.f413946c));
        sz3.m mVar = this.f414064e;
        java.util.ArrayList arrayList = mVar.f414068d;
        xz3.f fVar = new xz3.f(pVar, mVar);
        mVar.k(fVar);
        arrayList.add(fVar);
        sz3.m.l(mVar);
    }
}
