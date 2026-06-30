package e26;

/* loaded from: classes15.dex */
public class b implements e26.z {

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.locks.Lock f247015b;

    public b(java.util.concurrent.locks.Lock lock) {
        kotlin.jvm.internal.o.g(lock, "lock");
        this.f247015b = lock;
    }

    @Override // e26.z
    public void lock() {
        this.f247015b.lock();
    }

    @Override // e26.z
    public void unlock() {
        this.f247015b.unlock();
    }
}
