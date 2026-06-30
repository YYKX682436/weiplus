package gy;

/* loaded from: classes12.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final yz5.l f277494a;

    /* renamed from: b, reason: collision with root package name */
    public final jz5.g f277495b;

    /* renamed from: c, reason: collision with root package name */
    public java.util.Timer f277496c;

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f277497d;

    public j(yz5.l decibelCallback) {
        kotlin.jvm.internal.o.g(decibelCallback, "decibelCallback");
        this.f277494a = decibelCallback;
        this.f277495b = jz5.h.b(gy.h.f277492d);
    }

    public final java.util.LinkedList a() {
        return (java.util.LinkedList) ((jz5.n) this.f277495b).getValue();
    }

    public final synchronized void b() {
        if (this.f277497d) {
            return;
        }
        this.f277497d = true;
        java.util.Timer timer = new java.util.Timer(false);
        timer.schedule(new gy.i(this), 0L, 100L);
        this.f277496c = timer;
    }

    public final synchronized void c() {
        if (this.f277497d) {
            this.f277497d = false;
            java.util.Timer timer = this.f277496c;
            if (timer != null) {
                timer.cancel();
            }
            this.f277496c = null;
            a().clear();
        }
    }
}
