package kn4;

/* loaded from: classes12.dex */
public abstract class q {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.Map f309743a = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f309744b = com.tencent.mm.sdk.platformtools.x2.j();

    /* renamed from: c, reason: collision with root package name */
    public static final long f309745c;

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.Map f309746d;

    static {
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.MINUTES;
        f309745c = timeUnit.toMillis(5L);
        f309746d = new java.util.concurrent.ConcurrentHashMap();
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            com.tencent.mm.sdk.platformtools.o4.L().B("FileTransportStats_accumulateSize", 0L);
        }
        ((ku5.t0) ku5.t0.f312615d).d(new kn4.q$$a(), timeUnit.toMillis(3L), timeUnit.toMillis(3L));
    }
}
