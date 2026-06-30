package q83;

/* loaded from: classes15.dex */
public class g extends q83.a {

    /* renamed from: b, reason: collision with root package name */
    public long f360773b;

    /* renamed from: c, reason: collision with root package name */
    public long f360774c;

    /* renamed from: d, reason: collision with root package name */
    public long f360775d = 0;

    /* renamed from: e, reason: collision with root package name */
    public long f360776e = 0;

    /* renamed from: f, reason: collision with root package name */
    public long f360777f = 0;

    @Override // q83.a
    public void a() {
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(12931, java.lang.Long.valueOf(this.f360773b), java.lang.Long.valueOf(this.f360774c), 0L, java.lang.Long.valueOf(this.f360775d), java.lang.Long.valueOf(this.f360776e), java.lang.Long.valueOf(this.f360777f));
    }

    @Override // q83.a
    public void c() {
        this.f360773b = 0L;
        this.f360774c = 0L;
        this.f360775d = 0L;
        this.f360776e = 0L;
        this.f360777f = 0L;
    }

    @Override // q83.a
    public void d() {
        super.d();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        this.f360773b = java.lang.System.currentTimeMillis();
    }
}
