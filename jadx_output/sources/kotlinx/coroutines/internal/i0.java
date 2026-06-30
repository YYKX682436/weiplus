package kotlinx.coroutines.internal;

/* loaded from: classes14.dex */
public abstract class i0 extends kotlinx.coroutines.internal.g {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater f310500d = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(kotlinx.coroutines.internal.i0.class, "cleanedAndPointers");

    /* renamed from: c, reason: collision with root package name */
    public final long f310501c;
    private volatile /* synthetic */ int cleanedAndPointers;

    public i0(long j17, kotlinx.coroutines.internal.i0 i0Var, int i17) {
        super(i0Var);
        this.f310501c = j17;
        this.cleanedAndPointers = i17 << 16;
    }

    @Override // kotlinx.coroutines.internal.g
    public boolean b() {
        return this.cleanedAndPointers == f() && !c();
    }

    public final boolean e() {
        return f310500d.addAndGet(this, -65536) == f() && !c();
    }

    public abstract int f();

    public final boolean g() {
        int i17;
        do {
            i17 = this.cleanedAndPointers;
            if (!(i17 != f() || c())) {
                return false;
            }
        } while (!f310500d.compareAndSet(this, i17, 65536 + i17));
        return true;
    }
}
