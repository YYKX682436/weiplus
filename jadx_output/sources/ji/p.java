package ji;

/* loaded from: classes12.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final ji.q f299897a;

    /* renamed from: b, reason: collision with root package name */
    public final ji.q f299898b;

    /* renamed from: c, reason: collision with root package name */
    public final ji.q f299899c;

    /* renamed from: d, reason: collision with root package name */
    public final ji.q f299900d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f299901e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.matrix.lifecycle.IBackgroundStatefulOwner f299902f;

    /* renamed from: g, reason: collision with root package name */
    public final long f299903g;

    /* renamed from: h, reason: collision with root package name */
    public final yz5.l f299904h;

    public p(boolean z17, com.tencent.matrix.lifecycle.IBackgroundStatefulOwner bgStatefulOwner, long j17, long j18, long j19, long j27, long j28, int i17, yz5.l callback) {
        kotlin.jvm.internal.o.g(bgStatefulOwner, "bgStatefulOwner");
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f299901e = z17;
        this.f299902f = bgStatefulOwner;
        this.f299903g = j17;
        this.f299904h = callback;
        this.f299897a = new ji.q(j18, i17, 0L);
        this.f299898b = new ji.q(j19, i17, 0L);
        this.f299899c = new ji.q(j28, i17, 0L);
        this.f299900d = new ji.q(j27, i17, java.util.concurrent.TimeUnit.MINUTES.toMillis(5L));
    }

    public java.lang.String toString() {
        return "ProcessBgMemoryMonitorConfig(enable=" + this.f299901e + ", bgStatefulOwner=" + this.f299902f + ", checkInterval=" + this.f299903g + ", reportCallback=" + this.f299904h.getClass().getName() + ", javaThresholdByte=" + this.f299897a + ", nativeThresholdByte=" + this.f299898b + ", debugPssThresholdK=" + this.f299899c + ", amsPssThresholdK=" + this.f299900d + ')';
    }
}
