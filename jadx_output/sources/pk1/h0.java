package pk1;

/* loaded from: classes12.dex */
public final class h0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final pk1.h0 f355453d = new pk1.h0();

    public h0() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.concurrent.locks.ReentrantLock reentrantLock = pk1.c0.f355424e;
        reentrantLock.lock();
        try {
            java.util.Set keySet = pk1.c0.f355425f.keySet();
            kotlin.jvm.internal.o.f(keySet, "<get-keys>(...)");
            return kz5.n0.S0(keySet);
        } finally {
            reentrantLock.unlock();
        }
    }
}
