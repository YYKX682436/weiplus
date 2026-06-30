package wi;

/* loaded from: classes12.dex */
public final class c {

    /* renamed from: g, reason: collision with root package name */
    public static final long f446122g;

    /* renamed from: h, reason: collision with root package name */
    public static final long f446123h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f446124i = 0;

    /* renamed from: a, reason: collision with root package name */
    public final jr5.a f446125a;

    /* renamed from: b, reason: collision with root package name */
    public final wi.b f446126b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f446127c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f446128d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f446129e;

    /* renamed from: f, reason: collision with root package name */
    public final int f446130f;

    static {
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.MINUTES;
        f446122g = timeUnit.toMillis(1L);
        f446123h = timeUnit.toMillis(20L);
    }

    public c(jr5.a aVar, wi.b bVar, boolean z17, java.lang.String str, java.lang.String str2, boolean z18, int i17, wi.a aVar2) {
        this.f446125a = aVar;
        this.f446126b = bVar;
        this.f446127c = str;
        this.f446128d = str2;
        this.f446129e = z18;
        this.f446130f = i17;
    }

    public long a() {
        java.lang.String b17 = ((com.tencent.mm.matrix.o0) this.f446125a).b("clicfg_matrix_resource_detect_interval_millis", "");
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(b17);
        long j17 = f446122g;
        return K0 ? j17 : com.tencent.mm.sdk.platformtools.t8.V(b17, j17);
    }
}
