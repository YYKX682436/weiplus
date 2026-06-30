package hh;

/* loaded from: classes7.dex */
public class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.FutureTask f281442d;

    public h(java.lang.Runnable runnable) {
        this.f281442d = new java.util.concurrent.FutureTask(runnable, 0);
    }

    public boolean a(long j17) {
        try {
            this.f281442d.get(j17, java.util.concurrent.TimeUnit.MILLISECONDS);
            return true;
        } catch (java.lang.InterruptedException e17) {
            ah.i.c("MagicBrush.SyncTask", e17, "await failed", new java.lang.Object[0]);
            return false;
        } catch (java.util.concurrent.ExecutionException e18) {
            ah.i.c("MagicBrush.SyncTask", e18, "execute failed", new java.lang.Object[0]);
            return false;
        } catch (java.util.concurrent.TimeoutException e19) {
            ah.i.c("MagicBrush.SyncTask", e19, "execute timeout", new java.lang.Object[0]);
            return false;
        }
    }

    public java.lang.Object b() {
        try {
            return this.f281442d.get();
        } catch (java.lang.InterruptedException e17) {
            ah.i.c("MagicBrush.SyncTask", e17, "await failed", new java.lang.Object[0]);
            return null;
        } catch (java.util.concurrent.ExecutionException e18) {
            ah.i.c("MagicBrush.SyncTask", e18, "execute failed", new java.lang.Object[0]);
            return null;
        }
    }

    public void onDestroy() {
        run();
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f281442d.run();
    }

    public h(java.util.concurrent.Callable callable) {
        this.f281442d = new java.util.concurrent.FutureTask(callable);
    }
}
