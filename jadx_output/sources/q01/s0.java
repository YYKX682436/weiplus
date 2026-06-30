package q01;

/* loaded from: classes12.dex */
public final class s0 {

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicInteger f359328f = new java.util.concurrent.atomic.AtomicInteger();

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.modelbase.m1 f359329a;

    /* renamed from: b, reason: collision with root package name */
    public final int f359330b;

    /* renamed from: c, reason: collision with root package name */
    public final long f359331c;

    /* renamed from: d, reason: collision with root package name */
    public final int f359332d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f359333e;

    public s0(com.tencent.mm.modelbase.m1 netScene) {
        kotlin.jvm.internal.o.g(netScene, "netScene");
        this.f359329a = netScene;
        this.f359330b = f359328f.incrementAndGet();
        this.f359331c = android.os.SystemClock.uptimeMillis();
        this.f359332d = netScene.getType();
        this.f359333e = jz5.h.b(new q01.r0(this));
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q01.s0) && kotlin.jvm.internal.o.b(this.f359329a, ((q01.s0) obj).f359329a);
    }

    public int hashCode() {
        return this.f359329a.hashCode();
    }

    public java.lang.String toString() {
        return "Req(" + this.f359330b + ", " + q01.a1.f359259a.a(this.f359329a) + ')';
    }
}
