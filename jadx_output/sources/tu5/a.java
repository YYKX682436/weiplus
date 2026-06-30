package tu5;

/* loaded from: classes12.dex */
public class a extends tu5.e {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.locks.ReentrantLock f422165d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.locks.Condition f422166e;

    public a(int i17, int i18) {
        super(i17, i18);
        java.util.concurrent.locks.ReentrantLock reentrantLock = new java.util.concurrent.locks.ReentrantLock();
        this.f422165d = reentrantLock;
        this.f422166e = reentrantLock.newCondition();
    }

    @Override // uu5.a, uu5.b
    public void b(tu5.h hVar) {
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.f422165d;
        while (!a(hVar)) {
            try {
                try {
                    reentrantLock.lock();
                    this.f422166e.await();
                    reentrantLock.unlock();
                } catch (java.lang.Throwable th6) {
                    reentrantLock.unlock();
                    throw th6;
                }
            } catch (java.lang.InterruptedException unused) {
                return;
            }
        }
    }

    @Override // tu5.b, uu5.a, uu5.b
    public void c(tu5.h hVar) {
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.f422165d;
        super.c(hVar);
        try {
            reentrantLock.lock();
            this.f422166e.signal();
        } finally {
            reentrantLock.unlock();
        }
    }
}
