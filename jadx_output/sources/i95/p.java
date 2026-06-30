package i95;

/* loaded from: classes12.dex */
public class p implements java.util.concurrent.Callable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i95.w f289841d;

    public p(i95.w wVar) {
        this.f289841d = wVar;
    }

    @Override // java.util.concurrent.Callable
    public java.lang.Object call() {
        java.util.concurrent.locks.ReentrantLock reentrantLock;
        i95.v vVar;
        java.util.concurrent.locks.ReentrantLock reentrantLock2;
        java.util.concurrent.locks.ReentrantLock reentrantLock3;
        i95.w wVar = this.f289841d;
        try {
            vVar = wVar.mTransitTask;
            reentrantLock2 = wVar.mStatusLock;
            reentrantLock2.unlock();
            vVar.invoke();
            reentrantLock3 = wVar.mStatusLock;
            reentrantLock3.lock();
            return null;
        } catch (java.lang.Throwable th6) {
            reentrantLock = wVar.mStatusLock;
            reentrantLock.lock();
            throw th6;
        }
    }
}
