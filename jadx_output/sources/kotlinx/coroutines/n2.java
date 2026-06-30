package kotlinx.coroutines;

/* loaded from: classes14.dex */
public final class n2 extends kotlinx.coroutines.t2 {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater f310558i = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(kotlinx.coroutines.n2.class, "_invoked");
    private volatile /* synthetic */ int _invoked = 0;

    /* renamed from: h, reason: collision with root package name */
    public final yz5.l f310559h;

    public n2(yz5.l lVar) {
        this.f310559h = lVar;
    }

    @Override // yz5.l
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
        u((java.lang.Throwable) obj);
        return jz5.f0.f302826a;
    }

    @Override // kotlinx.coroutines.g0
    public void u(java.lang.Throwable th6) {
        if (f310558i.compareAndSet(this, 0, 1)) {
            this.f310559h.invoke(th6);
        }
    }
}
