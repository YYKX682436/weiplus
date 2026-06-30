package o11;

/* loaded from: classes12.dex */
public class a extends ku5.f implements p11.j {

    /* renamed from: v, reason: collision with root package name */
    public boolean f342044v;

    /* renamed from: w, reason: collision with root package name */
    public final java.util.concurrent.locks.ReentrantLock f342045w;

    /* renamed from: x, reason: collision with root package name */
    public final java.util.concurrent.locks.Condition f342046x;

    /* renamed from: y, reason: collision with root package name */
    public final java.util.concurrent.BlockingQueue f342047y;

    public a(java.lang.String str, int i17, int i18, java.util.concurrent.BlockingQueue blockingQueue, ku5.p pVar) {
        super(str, i17, i18, blockingQueue, pVar);
        java.util.concurrent.locks.ReentrantLock reentrantLock = new java.util.concurrent.locks.ReentrantLock();
        this.f342045w = reentrantLock;
        this.f342046x = reentrantLock.newCondition();
        this.f342047y = blockingQueue;
    }

    @Override // ku5.f
    public void b(java.lang.Runnable runnable, java.lang.Throwable th6) {
    }

    @Override // ku5.f
    public void c(java.lang.Thread thread, java.lang.Runnable runnable) {
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.f342045w;
        reentrantLock.lock();
        while (this.f342044v) {
            try {
                try {
                    this.f342046x.await();
                } catch (java.lang.Exception e17) {
                    thread.interrupt();
                    com.tencent.mars.xlog.Log.w("MicroMsg.imageloader.DefaultThreadPoolExecutor", "[cpan] before execute exception:%s", e17.toString());
                }
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    @Override // ku5.f, java.util.concurrent.Executor
    public void execute(java.lang.Runnable runnable) {
        super.execute(runnable);
    }

    @Override // p11.j
    public boolean i() {
        return this.f342044v;
    }

    @Override // ku5.f, java.util.concurrent.ExecutorService, p11.j
    public boolean isShutdown() {
        return super.isShutdown();
    }

    @Override // p11.j
    public void pause() {
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.f342045w;
        reentrantLock.lock();
        try {
            this.f342044v = true;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // p11.j
    public void remove(java.lang.Object obj) {
        java.util.concurrent.BlockingQueue blockingQueue = this.f342047y;
        if (blockingQueue != null) {
            blockingQueue.remove(obj);
        }
    }

    @Override // p11.j
    public void resume() {
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.f342045w;
        reentrantLock.lock();
        try {
            this.f342044v = false;
            this.f342046x.signalAll();
        } finally {
            reentrantLock.unlock();
        }
    }
}
