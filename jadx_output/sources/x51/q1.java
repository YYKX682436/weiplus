package x51;

/* loaded from: classes12.dex */
public final class q1 {

    /* renamed from: b, reason: collision with root package name */
    public static final x51.p1 f452075b = new x51.p1(null);

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f452076a;

    public q1(java.lang.String expt) {
        kotlin.jvm.internal.o.g(expt, "expt");
        this.f452076a = expt;
    }

    public final void a(java.lang.Runnable runnable, long j17, boolean z17) {
        kotlin.jvm.internal.o.g(runnable, "runnable");
        if (!z17 || !f452075b.a(this.f452076a)) {
            gm0.j1.e().k(runnable, j17);
            return;
        }
        ((ku5.t0) ku5.t0.f312615d).l(runnable, j17, this.f452076a);
    }
}
