package ku5;

/* loaded from: classes12.dex */
public class t0 implements ku5.u0, ku5.g {

    /* renamed from: d, reason: collision with root package name */
    public static volatile ku5.u0 f312615d;

    /* renamed from: e, reason: collision with root package name */
    public static volatile ku5.g f312616e;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f312617a = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    public volatile ku5.c f312618b;

    /* renamed from: c, reason: collision with root package name */
    public final vu5.l f312619c;

    public t0(ku5.c cVar) {
        this.f312618b = cVar;
        this.f312619c = new vu5.l(cVar);
    }

    public boolean A(java.lang.String str) {
        java.util.Objects.requireNonNull(str);
        xu5.b bVar = (xu5.b) xu5.b.f457300e.get(str);
        if (bVar == null) {
            return false;
        }
        bVar.f457303b.a();
        return true;
    }

    public wu5.c B(java.lang.Runnable runnable) {
        java.util.Objects.requireNonNull(runnable);
        return z(runnable, 0L, false);
    }

    public wu5.c C(java.util.concurrent.Callable callable) {
        java.util.Objects.requireNonNull(callable);
        return (wu5.c) new ru5.g(callable).f(new ku5.b0(this, 0L)).f(new ku5.a0(this, false)).g();
    }

    public wu5.c D(java.lang.Runnable runnable) {
        java.util.Objects.requireNonNull(runnable);
        return z(runnable, 0L, true);
    }

    public wu5.c E(java.lang.Runnable runnable, long j17) {
        java.util.Objects.requireNonNull(runnable);
        return z(runnable, j17, false);
    }

    public wu5.c a(java.lang.Runnable runnable) {
        java.util.Objects.requireNonNull(runnable);
        return w(runnable, 0L, null);
    }

    public wu5.c b(java.lang.Runnable runnable, java.lang.String str) {
        java.util.Objects.requireNonNull(runnable);
        return w(runnable, 0L, str);
    }

    public wu5.c c(java.util.concurrent.Callable callable) {
        java.util.Objects.requireNonNull(callable);
        return x(callable, 0L, null);
    }

    public wu5.c d(java.lang.Runnable runnable, long j17, long j18) {
        java.util.Objects.requireNonNull(runnable);
        return v(runnable, j17, j18, false);
    }

    public wu5.c e(java.lang.Runnable runnable, long j17, long j18) {
        java.util.Objects.requireNonNull(runnable);
        return v(runnable, j17, j18, true);
    }

    public java.util.Map f() {
        ((uu5.a) tu5.j.f422176a).getClass();
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.HashMap hashMap2 = uu5.a.f431309a;
        synchronized (hashMap2) {
            for (tu5.g gVar : hashMap2.values()) {
                int i17 = gVar.f422171c.get();
                if (i17 > 0) {
                    hashMap.put(gVar.f422170b, java.lang.Integer.valueOf(i17));
                }
            }
        }
        return hashMap;
    }

    public wu5.c g(java.lang.Runnable runnable) {
        java.util.Objects.requireNonNull(runnable);
        return k(runnable, 0L);
    }

    public wu5.c h(java.lang.Runnable runnable, java.lang.String str) {
        java.util.Objects.requireNonNull(runnable);
        return l(runnable, 0L, str);
    }

    public wu5.c i(java.util.concurrent.Callable callable) {
        java.util.Objects.requireNonNull(callable);
        return m(callable, 0L);
    }

    public wu5.c j(java.lang.Runnable runnable, java.lang.String str) {
        java.util.Objects.requireNonNull(runnable);
        return y(runnable, 0L, str, true);
    }

    public wu5.c k(java.lang.Runnable runnable, long j17) {
        java.util.Objects.requireNonNull(runnable);
        return (wu5.c) new ru5.g(runnable).f(new ku5.v(this, j17)).f(new ku5.s0(this)).g();
    }

    public wu5.c l(java.lang.Runnable runnable, long j17, java.lang.String str) {
        java.util.Objects.requireNonNull(runnable);
        return y(runnable, j17, str, false);
    }

    public wu5.c m(java.util.concurrent.Callable callable, long j17) {
        java.util.Objects.requireNonNull(callable);
        return (wu5.c) new ru5.g(callable).f(new ku5.g0(this, j17)).f(new ku5.e0(this)).g();
    }

    public wu5.c n(java.util.concurrent.Callable callable, long j17, java.lang.String str) {
        java.util.Objects.requireNonNull(callable);
        return (wu5.c) new ru5.g(callable).f(new ku5.k0(this, j17, str)).f(new ku5.j0(this, false)).g();
    }

    public ku5.f o(java.lang.String str, int i17, int i18, java.util.concurrent.BlockingQueue blockingQueue) {
        return new ku5.f(str, i17, i18, blockingQueue, new ku5.d());
    }

    public ku5.f p(java.lang.String str) {
        return new ku5.f(str, 1, 1, new java.util.concurrent.LinkedBlockingQueue(), new ku5.d());
    }

    public wu5.c q(java.lang.Runnable runnable) {
        java.util.Objects.requireNonNull(runnable);
        return t(runnable, 0L, null);
    }

    public wu5.c r(java.lang.Runnable runnable, java.lang.String str) {
        java.util.Objects.requireNonNull(runnable);
        return t(runnable, 0L, str);
    }

    public wu5.c s(java.util.concurrent.Callable callable) {
        java.util.Objects.requireNonNull(callable);
        return u(callable, 0L, null);
    }

    public final wu5.c t(java.lang.Runnable runnable, long j17, java.lang.String str) {
        return (wu5.c) new ru5.g(runnable).f(new ku5.p0(this, j17, str)).f(new ku5.o0(this)).g();
    }

    public final wu5.c u(java.util.concurrent.Callable callable, long j17, java.lang.String str) {
        return (wu5.c) new ru5.g(callable).f(new ku5.d0(this, j17, str)).f(new ku5.c0(this)).g();
    }

    public final wu5.c v(java.lang.Runnable runnable, long j17, long j18, boolean z17) {
        return (wu5.c) new ru5.g(runnable).f(new ku5.z(this, j17, j18, z17)).f(new ku5.y(this)).g();
    }

    public final wu5.c w(java.lang.Runnable runnable, long j17, java.lang.String str) {
        return (wu5.c) new ru5.g(runnable).f(new ku5.r0(this, j17, str)).f(new ku5.q0(this)).g();
    }

    public final wu5.c x(java.util.concurrent.Callable callable, long j17, java.lang.String str) {
        return (wu5.c) new ru5.g(callable).f(new ku5.i0(this, j17, str)).f(new ku5.h0(this)).g();
    }

    public final wu5.c y(java.lang.Runnable runnable, long j17, java.lang.String str, boolean z17) {
        return (wu5.c) new ru5.g(runnable).f(new ku5.x(this, j17, str)).f(new ku5.w(this, z17)).g();
    }

    public final wu5.c z(java.lang.Runnable runnable, long j17, boolean z17) {
        return (wu5.c) new ru5.g(runnable).f(new ku5.n0(this, j17)).f(new ku5.m0(this, z17)).g();
    }
}
