package cz0;

/* loaded from: classes5.dex */
public final class r extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final cz0.r f224963d = new cz0.r();

    public r() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.concurrent.locks.ReentrantLock reentrantLock = cz0.y.f224972d;
        reentrantLock.lock();
        try {
            cz0.y.a(cz0.y.f224969a);
            reentrantLock.unlock();
            return jz5.f0.f302826a;
        } catch (java.lang.Throwable th6) {
            cz0.y.f224972d.unlock();
            throw th6;
        }
    }
}
