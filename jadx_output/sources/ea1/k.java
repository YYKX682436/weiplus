package ea1;

/* loaded from: classes12.dex */
public class k extends u13.g {

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f250530q;

    /* renamed from: r, reason: collision with root package name */
    public p13.y f250531r;

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.appusage.AppBrandRecentTaskInfo f250532s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.CharSequence f250533t;

    /* renamed from: u, reason: collision with root package name */
    public int f250534u;

    /* renamed from: v, reason: collision with root package name */
    public int f250535v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f250536w;

    /* renamed from: x, reason: collision with root package name */
    public int f250537x;

    /* renamed from: y, reason: collision with root package name */
    public final ea1.j f250538y;

    /* renamed from: z, reason: collision with root package name */
    public final ea1.i f250539z;

    public k(int i17) {
        super(9, i17);
        this.f250538y = new ea1.j(this);
        this.f250539z = new ea1.i(this);
    }

    @Override // u13.g
    public void a(android.content.Context context, u13.e eVar, java.lang.Object... objArr) {
        com.tencent.mm.plugin.appbrand.appusage.AppBrandRecentTaskInfo wi6 = ((et.i2) ((ft.l4) i95.n0.c(ft.l4.class))).wi(this.f250531r.f351187e);
        this.f250532s = wi6;
        if (wi6 == null) {
            return;
        }
        int i17 = this.f250531r.f351185c;
        boolean z17 = true;
        boolean z18 = false;
        if (i17 != 2) {
            if (i17 != 3) {
                z17 = false;
            } else {
                z18 = true;
            }
        }
        this.f250533t = o13.q.e(p13.i.d(wi6.f76356x, this.f423762e, z17, z18)).f351105a;
        com.tencent.mm.plugin.appbrand.appusage.AppBrandRecentTaskInfo appBrandRecentTaskInfo = this.f250532s;
        this.f423771n = appBrandRecentTaskInfo.f76355w;
        this.f250534u = appBrandRecentTaskInfo.D;
        this.f250535v = appBrandRecentTaskInfo.E;
        this.f250536w = appBrandRecentTaskInfo.G;
        this.f250537x = appBrandRecentTaskInfo.F;
    }

    @Override // u13.g
    public java.lang.String c() {
        return this.f250532s.f76355w;
    }

    @Override // u13.g
    public java.lang.String f() {
        return this.f250532s.f76356x;
    }

    @Override // u13.g
    public int j() {
        return this.f250531r.f351200r;
    }

    @Override // u13.g
    public u13.f k() {
        return this.f250538y;
    }

    @Override // u13.g
    public java.lang.String l() {
        return this.f250530q;
    }
}
