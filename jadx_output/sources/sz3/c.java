package sz3;

/* loaded from: classes15.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sz3.m f413972d;

    public c(sz3.m mVar) {
        this.f413972d = mVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        sz3.m mVar = this.f413972d;
        java.util.Iterator it = mVar.f414069e.iterator();
        while (it.hasNext()) {
            ((xz3.f) it.next()).b();
        }
        mVar.f414069e.clear();
        java.util.Iterator it6 = mVar.f414068d.iterator();
        while (it6.hasNext()) {
            ((xz3.f) it6.next()).b();
        }
        mVar.f414068d.clear();
    }
}
