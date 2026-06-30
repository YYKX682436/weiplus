package q83;

/* loaded from: classes8.dex */
public class b extends q83.a {

    /* renamed from: b, reason: collision with root package name */
    public long f360749b;

    /* renamed from: c, reason: collision with root package name */
    public long f360750c;

    /* renamed from: d, reason: collision with root package name */
    public long f360751d = 0;

    /* renamed from: e, reason: collision with root package name */
    public long f360752e = 0;

    /* renamed from: f, reason: collision with root package name */
    public long f360753f = 0;

    @Override // q83.a
    public void a() {
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(12930, java.lang.Long.valueOf(this.f360749b), java.lang.Long.valueOf(this.f360750c), java.lang.Long.valueOf(this.f360751d), java.lang.Long.valueOf(this.f360752e), java.lang.Long.valueOf(this.f360753f));
    }

    @Override // q83.a
    public void c() {
        this.f360749b = 0L;
        this.f360750c = 0L;
        this.f360751d = 0L;
        this.f360752e = 0L;
        this.f360753f = 0L;
    }

    @Override // q83.a
    public void d() {
        super.d();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        this.f360749b = java.lang.System.currentTimeMillis();
    }
}
