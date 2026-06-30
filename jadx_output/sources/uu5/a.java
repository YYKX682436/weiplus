package uu5;

/* loaded from: classes12.dex */
public abstract class a implements uu5.b {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.HashMap f431309a = new java.util.HashMap();

    @Override // uu5.b
    public void b(tu5.h hVar) {
    }

    @Override // uu5.b
    public void c(tu5.h hVar) {
        int i17;
        java.util.concurrent.atomic.AtomicInteger atomicInteger = hVar.f422173b.f422171c;
        do {
            i17 = atomicInteger.get();
        } while (!atomicInteger.compareAndSet(i17, i17 - 1));
        if (hVar.f422173b.f422171c.intValue() <= 0) {
            java.util.HashMap hashMap = f431309a;
            synchronized (hashMap) {
                hashMap.remove(hVar.f422173b.f422170b);
            }
        }
    }
}
