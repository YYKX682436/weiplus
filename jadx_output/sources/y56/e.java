package y56;

/* loaded from: classes16.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final long f459583a;

    /* renamed from: b, reason: collision with root package name */
    public final r56.a f459584b;

    /* renamed from: c, reason: collision with root package name */
    public final p56.p f459585c;

    /* renamed from: d, reason: collision with root package name */
    public final long f459586d;

    public e(p56.p pVar, long j17, r56.a aVar) {
        long j18 = rx.schedulers.TestScheduler.f400895g;
        rx.schedulers.TestScheduler.f400895g = 1 + j18;
        this.f459586d = j18;
        this.f459583a = j17;
        this.f459584b = aVar;
        this.f459585c = pVar;
    }

    public java.lang.String toString() {
        return java.lang.String.format("TimedAction(time = %d, action = %s)", java.lang.Long.valueOf(this.f459583a), this.f459584b.toString());
    }
}
