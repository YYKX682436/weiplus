package ge1;

/* loaded from: classes15.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ge1.h f270934d;

    public f(ge1.h hVar) {
        this.f270934d = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.concurrent.locks.ReentrantLock reentrantLock = ge1.h.f270937e;
        ge1.h hVar = this.f270934d;
        reentrantLock.lock();
        try {
            if (ge1.h.f270938f == ge1.b.f270928e) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.TransitCard.ServiceConnection", "bind timeout reached (5000ms), giving up");
                ge1.h.f270938f = ge1.b.f270927d;
                ge1.h.f270936d.c(10014, "Bind vendor service timeout");
                try {
                    android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
                    if (context != null) {
                        context.unbindService(hVar);
                    }
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.TransitCard.ServiceConnection", "unbindService on timeout exception: " + e17.getMessage());
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
