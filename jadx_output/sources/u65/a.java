package u65;

/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicInteger f425030a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.Runnable f425031b;

    public a(int i17) {
        if (i17 > 0) {
            this.f425030a = new java.util.concurrent.atomic.AtomicInteger(i17);
            return;
        }
        throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
    }

    public final boolean a() {
        return this.f425030a.getAndSet(-1) > 0;
    }

    public final boolean b() {
        java.lang.Runnable runnable;
        if (this.f425030a.decrementAndGet() != 0 || (runnable = this.f425031b) == null) {
            return false;
        }
        if (runnable != null) {
            runnable.run();
            return true;
        }
        kotlin.jvm.internal.o.o("callback");
        throw null;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(int i17, java.lang.Runnable callback) {
        this(i17);
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f425031b = callback;
    }
}
