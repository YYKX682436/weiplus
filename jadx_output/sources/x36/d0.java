package x36;

/* loaded from: classes16.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public static final x36.c0 f451664a = new x36.c0(new byte[0], 0, 0, false, false);

    /* renamed from: b, reason: collision with root package name */
    public static final int f451665b;

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicReference[] f451666c;

    static {
        int highestOneBit = java.lang.Integer.highestOneBit((java.lang.Runtime.getRuntime().availableProcessors() * 2) - 1);
        f451665b = highestOneBit;
        java.util.concurrent.atomic.AtomicReference[] atomicReferenceArr = new java.util.concurrent.atomic.AtomicReference[highestOneBit];
        for (int i17 = 0; i17 < highestOneBit; i17++) {
            atomicReferenceArr[i17] = new java.util.concurrent.atomic.AtomicReference();
        }
        f451666c = atomicReferenceArr;
    }

    public static final void a(x36.c0 segment) {
        kotlin.jvm.internal.o.g(segment, "segment");
        boolean z17 = true;
        if (!(segment.f451662f == null && segment.f451663g == null)) {
            throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
        }
        if (segment.f451660d) {
            return;
        }
        java.lang.Thread currentThread = java.lang.Thread.currentThread();
        kotlin.jvm.internal.o.f(currentThread, "Thread.currentThread()");
        java.util.concurrent.atomic.AtomicReference atomicReference = f451666c[(int) (currentThread.getId() & (f451665b - 1))];
        x36.c0 c0Var = (x36.c0) atomicReference.get();
        if (c0Var == f451664a) {
            return;
        }
        int i17 = c0Var != null ? c0Var.f451659c : 0;
        if (i17 >= 65536) {
            return;
        }
        segment.f451662f = c0Var;
        segment.f451658b = 0;
        segment.f451659c = i17 + 8192;
        while (true) {
            if (atomicReference.compareAndSet(c0Var, segment)) {
                break;
            } else if (atomicReference.get() != c0Var) {
                z17 = false;
                break;
            }
        }
        if (z17) {
            return;
        }
        segment.f451662f = null;
    }

    public static final x36.c0 b() {
        java.lang.Thread currentThread = java.lang.Thread.currentThread();
        kotlin.jvm.internal.o.f(currentThread, "Thread.currentThread()");
        java.util.concurrent.atomic.AtomicReference atomicReference = f451666c[(int) (currentThread.getId() & (f451665b - 1))];
        x36.c0 c0Var = f451664a;
        x36.c0 c0Var2 = (x36.c0) atomicReference.getAndSet(c0Var);
        if (c0Var2 == c0Var) {
            return new x36.c0();
        }
        if (c0Var2 == null) {
            atomicReference.set(null);
            return new x36.c0();
        }
        atomicReference.set(c0Var2.f451662f);
        c0Var2.f451662f = null;
        c0Var2.f451659c = 0;
        return c0Var2;
    }
}
