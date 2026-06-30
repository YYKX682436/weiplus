package ge1;

/* loaded from: classes15.dex */
public final class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final ge1.g f270935d = new ge1.g();

    @Override // java.lang.Runnable
    public final void run() {
        java.util.concurrent.locks.ReentrantLock reentrantLock = ge1.h.f270937e;
        reentrantLock.lock();
        try {
            if (ge1.h.f270938f == ge1.b.f270929f && ge1.h.f270940h.isEmpty()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.TransitCard.ServiceConnection", "idle timeout reached (180000ms), proactively unbinding vendor service");
                ge1.h.f270936d.b();
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
