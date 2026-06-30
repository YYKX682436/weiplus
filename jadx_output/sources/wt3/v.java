package wt3;

/* loaded from: classes5.dex */
public final class v {

    /* renamed from: i, reason: collision with root package name */
    public static wt3.v f449505i;

    /* renamed from: b, reason: collision with root package name */
    public int f449508b;

    /* renamed from: c, reason: collision with root package name */
    public long f449509c;

    /* renamed from: d, reason: collision with root package name */
    public long f449510d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f449511e;

    /* renamed from: h, reason: collision with root package name */
    public static final wt3.u f449504h = new wt3.u(null);

    /* renamed from: j, reason: collision with root package name */
    public static com.tencent.mm.autogen.mmdata.rpt.VideoBGMSearchStruct f449506j = new com.tencent.mm.autogen.mmdata.rpt.VideoBGMSearchStruct();

    /* renamed from: a, reason: collision with root package name */
    public int f449507a = 3;

    /* renamed from: f, reason: collision with root package name */
    public boolean f449512f = true;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.ArrayList f449513g = new java.util.ArrayList();

    public final void a() {
        if (this.f449510d == 0) {
            return;
        }
        r45.lh4 lh4Var = new r45.lh4();
        lh4Var.f379480d = this.f449508b;
        if (this.f449511e) {
            lh4Var.f379481e = this.f449507a == 4 ? 11 : 5;
        } else {
            lh4Var.f379481e = this.f449507a == 4 ? 13 : 7;
        }
        lh4Var.f379483g = (int) com.tencent.mm.sdk.platformtools.t8.i1();
        c();
        java.util.ArrayList arrayList = this.f449513g;
        arrayList.add(lh4Var);
        com.tencent.mars.xlog.Log.i("MicroMsg.AudioReporter", "record cancel " + wt3.w.a(lh4Var));
        gm0.j1.n().f273288b.g(new xt3.a(this.f449510d, arrayList));
        f449505i = null;
    }

    public final void b() {
        this.f449511e = false;
        r45.lh4 lh4Var = new r45.lh4();
        lh4Var.f379480d = this.f449508b;
        lh4Var.f379481e = 8;
        lh4Var.f379483g = (int) com.tencent.mm.sdk.platformtools.t8.i1();
        this.f449513g.add(lh4Var);
        com.tencent.mars.xlog.Log.i("MicroMsg.AudioReporter", "record no bgm " + wt3.w.a(lh4Var));
    }

    public final void c() {
        if (this.f449512f) {
            return;
        }
        r45.lh4 lh4Var = new r45.lh4();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        lh4Var.f379480d = this.f449508b;
        lh4Var.f379481e = this.f449507a == 3 ? 1 : 9;
        long j17 = this.f449509c;
        lh4Var.f379482f = (int) (currentTimeMillis - j17);
        lh4Var.f379483g = (int) (j17 / 1000);
        this.f449513g.add(lh4Var);
        this.f449512f = true;
        com.tencent.mars.xlog.Log.i("MicroMsg.AudioReporter", "record pause " + wt3.w.a(lh4Var));
    }

    public final void d(int i17, int i18) {
        this.f449508b = i17;
        this.f449509c = java.lang.System.currentTimeMillis();
        this.f449511e = true;
        this.f449512f = false;
        this.f449507a = i18;
    }

    public final void e() {
        if (this.f449510d == 0) {
            return;
        }
        r45.lh4 lh4Var = new r45.lh4();
        lh4Var.f379480d = this.f449508b;
        if (this.f449511e) {
            lh4Var.f379481e = this.f449507a == 4 ? 10 : 2;
        } else {
            lh4Var.f379481e = this.f449507a == 4 ? 12 : 6;
        }
        lh4Var.f379483g = (int) com.tencent.mm.sdk.platformtools.t8.i1();
        c();
        java.util.ArrayList arrayList = this.f449513g;
        arrayList.add(lh4Var);
        com.tencent.mars.xlog.Log.i("MicroMsg.AudioReporter", "record send " + wt3.w.a(lh4Var));
        if (this.f449510d != 0) {
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            int i17 = com.tencent.mars.comm.NetStatusUtil.isWifi(context) ? 1 : com.tencent.mars.comm.NetStatusUtil.is4G(context) ? 6 : com.tencent.mars.comm.NetStatusUtil.is3G(context) ? 5 : com.tencent.mars.comm.NetStatusUtil.is2G(context) ? 4 : com.tencent.mars.comm.NetStatusUtil.isWap(context) ? 3 : 2;
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            java.lang.Object[] objArr = new java.lang.Object[11];
            objArr[0] = java.lang.Integer.valueOf(i17);
            objArr[1] = 1;
            objArr[2] = "";
            objArr[3] = 0L;
            objArr[4] = 0L;
            objArr[5] = "";
            objArr[6] = java.lang.Long.valueOf(this.f449510d);
            objArr[7] = java.lang.Integer.valueOf(this.f449511e ? 2 : 1);
            objArr[8] = java.lang.Integer.valueOf(this.f449508b);
            objArr[9] = "";
            objArr[10] = "";
            g0Var.d(16208, objArr);
        }
        gm0.j1.n().f273288b.g(new xt3.a(this.f449510d, arrayList));
        f449505i = null;
    }
}
