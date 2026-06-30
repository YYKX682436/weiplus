package d90;

/* loaded from: classes11.dex */
public final class n extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final d90.n f227438d = new d90.n();

    public n() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.concurrent.atomic.AtomicLong atomicLong = d90.l.f227436a;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        long incrementAndGet = d90.l.f227436a.incrementAndGet();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(currentTimeMillis);
        sb6.append('_');
        sb6.append(incrementAndGet);
        return sb6.toString();
    }
}
