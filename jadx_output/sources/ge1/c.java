package ge1;

/* loaded from: classes15.dex */
public final class c implements android.os.IBinder.DeathRecipient {
    @Override // android.os.IBinder.DeathRecipient
    public void binderDied() {
        com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.TransitCard.ServiceConnection", "vendor service died, resetting state");
        java.util.concurrent.locks.ReentrantLock reentrantLock = ge1.h.f270937e;
        reentrantLock.lock();
        try {
            ge1.h.f270938f = ge1.b.f270927d;
            ke1.b bVar = ge1.h.f270939g;
            if (bVar != null) {
                bVar.release();
            }
            ge1.h.f270939g = null;
            android.os.IBinder iBinder = ge1.h.f270947r;
            if (iBinder != null) {
                iBinder.unlinkToDeath(this, 0);
            }
            ge1.h.f270947r = null;
            if (!ge1.h.f270940h.isEmpty()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.TransitCard.ServiceConnection", "pendingTaskQueue is not empty, attempting reconnect");
                ge1.h.f270936d.d();
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
