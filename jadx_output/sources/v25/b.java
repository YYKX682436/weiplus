package v25;

/* loaded from: classes11.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public java.util.concurrent.CountDownLatch f432971a = null;

    public void a() {
        java.util.concurrent.CountDownLatch countDownLatch = this.f432971a;
        if (countDownLatch != null) {
            countDownLatch.countDown();
            this.f432971a = null;
        }
    }

    public void b(long j17, java.lang.Runnable runnable) {
        com.tencent.mars.xlog.Log.i("MicroMsg.SyncJob", "doAsSyncJob");
        if (this.f432971a == null) {
            this.f432971a = new java.util.concurrent.CountDownLatch(1);
        }
        com.tencent.mm.sdk.platformtools.u3.h(runnable);
        com.tencent.mars.xlog.Log.i("MicroMsg.SyncJob", "doAsSyncJob postToMainThread");
        java.util.concurrent.CountDownLatch countDownLatch = this.f432971a;
        if (countDownLatch != null) {
            try {
                countDownLatch.await(j17, java.util.concurrent.TimeUnit.MILLISECONDS);
            } catch (java.lang.InterruptedException e17) {
                com.tencent.mars.xlog.Log.w("MicroMsg.SyncJob", e17.getMessage());
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SyncJob", e17, "", new java.lang.Object[0]);
            }
        }
    }
}
