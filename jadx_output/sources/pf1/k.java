package pf1;

/* loaded from: classes7.dex */
public final class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pf1.n f353779d;

    public k(pf1.n nVar) {
        this.f353779d = nVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        pf1.n nVar = this.f353779d;
        if (nVar.f353783n) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.HTMLVConsoleView", "destroy hash[%d]", java.lang.Integer.valueOf(nVar.hashCode()));
        nVar.getViewWV().stopLoading();
        if (!nVar.getViewWV().f211376y) {
            nVar.getViewWV().destroy();
        }
        nVar.f353783n = true;
    }
}
