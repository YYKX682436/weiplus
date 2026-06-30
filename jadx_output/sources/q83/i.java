package q83;

/* loaded from: classes15.dex */
public class i extends q83.a {

    /* renamed from: b, reason: collision with root package name */
    public long f360778b;

    /* renamed from: c, reason: collision with root package name */
    public long f360779c;

    /* renamed from: d, reason: collision with root package name */
    public long f360780d = 0;

    /* renamed from: e, reason: collision with root package name */
    public long f360781e = 0;

    /* renamed from: f, reason: collision with root package name */
    public long f360782f = 0;

    @Override // q83.a
    public void a() {
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(12934, java.lang.Long.valueOf(this.f360778b), java.lang.Long.valueOf(this.f360779c), java.lang.Long.valueOf(this.f360780d), java.lang.Long.valueOf(this.f360781e), java.lang.Long.valueOf(this.f360782f));
    }

    @Override // q83.a
    public void c() {
        this.f360778b = 0L;
        this.f360779c = 0L;
        this.f360780d = 0L;
        this.f360781e = 0L;
        this.f360782f = 0L;
    }

    @Override // q83.a
    public void d() {
        super.d();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        this.f360778b = java.lang.System.currentTimeMillis();
    }
}
