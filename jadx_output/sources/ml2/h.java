package ml2;

/* loaded from: classes12.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f327501a;

    /* renamed from: b, reason: collision with root package name */
    public long f327502b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f327503c;

    /* renamed from: f, reason: collision with root package name */
    public long f327506f;

    /* renamed from: h, reason: collision with root package name */
    public long f327508h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f327509i;

    /* renamed from: j, reason: collision with root package name */
    public rh.c1 f327510j;

    /* renamed from: l, reason: collision with root package name */
    public boolean f327512l;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.b4 f327504d = new com.tencent.mm.sdk.platformtools.b4("Finder.DeviceStatusReporter", (com.tencent.mm.sdk.platformtools.a4) new ml2.g(this), true);

    /* renamed from: e, reason: collision with root package name */
    public final int f327505e = 30000;

    /* renamed from: g, reason: collision with root package name */
    public final int f327507g = 30000;

    /* renamed from: k, reason: collision with root package name */
    public final ml2.f f327511k = new ml2.f();

    public final void a() {
        this.f327504d.d();
        synchronized (this) {
            rh.c1 c1Var = this.f327510j;
            if (c1Var != null) {
                this.f327509i = false;
                if (c1Var.E()) {
                    c1Var.a();
                }
                c1Var.b();
                this.f327510j = null;
            }
        }
        this.f327512l = false;
        ml2.f fVar = this.f327511k;
        fVar.f327394a = 0;
        fVar.f327395b = 0L;
        this.f327506f = 0L;
        this.f327508h = 0L;
        com.tencent.mars.xlog.Log.i("Finder.DeviceStatusReporter", "stopReportDeviceStatus");
    }
}
