package p56;

/* loaded from: classes16.dex */
public class o implements r56.a {

    /* renamed from: d, reason: collision with root package name */
    public long f352095d;

    /* renamed from: e, reason: collision with root package name */
    public long f352096e;

    /* renamed from: f, reason: collision with root package name */
    public long f352097f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r56.a f352098g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ a66.e f352099h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f352100i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ p56.p f352101m;

    public o(p56.p pVar, long j17, long j18, r56.a aVar, a66.e eVar, long j19) {
        this.f352101m = pVar;
        this.f352098g = aVar;
        this.f352099h = eVar;
        this.f352100i = j19;
        this.f352096e = j17;
        this.f352097f = j18;
    }

    @Override // r56.a
    public void call() {
        long j17;
        this.f352098g.call();
        a66.e eVar = this.f352099h;
        if (eVar.b()) {
            return;
        }
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.MILLISECONDS;
        p56.p pVar = this.f352101m;
        long nanos = timeUnit.toNanos(pVar.a());
        long j18 = p56.q.f352102d;
        long j19 = nanos + j18;
        long j27 = this.f352096e;
        long j28 = this.f352100i;
        if (j19 < j27 || nanos >= j27 + j28 + j18) {
            j17 = nanos + j28;
            long j29 = this.f352095d + 1;
            this.f352095d = j29;
            this.f352097f = j17 - (j28 * j29);
        } else {
            long j37 = this.f352097f;
            long j38 = this.f352095d + 1;
            this.f352095d = j38;
            j17 = j37 + (j38 * j28);
        }
        this.f352096e = nanos;
        eVar.a(pVar.e(this, j17 - nanos, java.util.concurrent.TimeUnit.NANOSECONDS));
    }
}
