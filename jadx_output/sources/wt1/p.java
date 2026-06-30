package wt1;

/* loaded from: classes13.dex */
public class p implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.MMActivity f449319d;

    /* renamed from: e, reason: collision with root package name */
    public tt1.j f449320e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f449321f;

    /* renamed from: r, reason: collision with root package name */
    public r45.gn f449330r;

    /* renamed from: s, reason: collision with root package name */
    public wt1.t f449331s;

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f449322g = false;

    /* renamed from: h, reason: collision with root package name */
    public volatile boolean f449323h = false;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.Object f449324i = new java.lang.Object();

    /* renamed from: m, reason: collision with root package name */
    public boolean f449325m = false;

    /* renamed from: n, reason: collision with root package name */
    public boolean f449326n = false;

    /* renamed from: o, reason: collision with root package name */
    public volatile float f449327o = -85.0f;

    /* renamed from: p, reason: collision with root package name */
    public volatile float f449328p = -1000.0f;

    /* renamed from: q, reason: collision with root package name */
    public boolean f449329q = false;

    /* renamed from: t, reason: collision with root package name */
    public int f449332t = 60;

    /* renamed from: u, reason: collision with root package name */
    public long f449333u = 0;

    /* renamed from: v, reason: collision with root package name */
    public long f449334v = 0;

    /* renamed from: w, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.b4 f449335w = new com.tencent.mm.sdk.platformtools.b4(new wt1.q(this), false);

    public final void a(java.lang.String str, byte[] bArr, float f17, float f18, int i17, boolean z17, boolean z18) {
        gm0.j1.n().f273288b.g(new xt1.p0(str, bArr, f17, f18, i17, z17, z18));
    }

    public void b(com.tencent.mm.ui.MMActivity mMActivity, java.lang.String str, tt1.j jVar, float f17, float f18) {
        this.f449322g = true;
        this.f449319d = mMActivity;
        this.f449321f = str;
        this.f449320e = jVar;
        this.f449327o = f17;
        this.f449328p = f18;
        this.f449325m = jVar.s0().f388557p1;
        this.f449326n = jVar.i0().F;
        this.f449330r = jVar.s0().f388567x1;
        this.f449332t = jVar.s0().f388567x1 == null ? 60 : jVar.s0().f388567x1.f375368e;
        this.f449329q = (jVar.s0().f388567x1 == null || com.tencent.mm.sdk.platformtools.t8.K0(jVar.s0().f388567x1.f375367d)) ? false : true;
        com.tencent.mars.xlog.Log.i("MicroMsg.CardLbsOrBluetooth", "init cardId:%s, needLocation:%b, isLocationAuth:%b needBluetooth:%b reportTime:%d", str, java.lang.Boolean.valueOf(this.f449325m), java.lang.Boolean.valueOf(this.f449326n), java.lang.Boolean.valueOf(this.f449329q), java.lang.Integer.valueOf(this.f449332t));
        if (this.f449325m && !this.f449326n) {
            java.lang.String str2 = com.tencent.mm.sdk.platformtools.t8.K0(this.f449320e.s0().f388570y1) ? this.f449320e.s0().f388553n : this.f449320e.s0().f388570y1;
            com.tencent.mm.ui.MMActivity mMActivity2 = this.f449319d;
            db5.e1.u(mMActivity2, mMActivity2.getString(com.tencent.mm.R.string.aun, str2), this.f449319d.getString(com.tencent.mm.R.string.f490573yv), new wt1.r(this), new wt1.s(this));
        }
        if (this.f449329q) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CardLbsOrBluetooth", "initBluetoothHelper blueToothInfo.name:%s", this.f449330r.f375367d);
            wt1.t tVar = new wt1.t(this, null);
            this.f449331s = tVar;
            com.tencent.mars.xlog.Log.i("MicroMsg.CardLbsOrBluetooth", "init bluetoothStateListener");
            tVar.f449348e = new wt1.v(tVar);
            com.tencent.mm.sdk.platformtools.x2.f193071a.registerReceiver(tVar.f449348e, new android.content.IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED"));
        }
        d();
        c();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0059 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c() {
        /*
            Method dump skipped, instructions count: 365
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wt1.p.c():void");
    }

    public void d() {
        if (this.f449325m || this.f449329q) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CardLbsOrBluetooth", "start");
            if (!this.f449322g) {
                com.tencent.mars.xlog.Log.e("MicroMsg.CardLbsOrBluetooth", "isInit:%b", java.lang.Boolean.valueOf(this.f449322g));
                return;
            }
            if (this.f449325m) {
                com.tencent.mars.xlog.Log.i("MicroMsg.CardLbsOrBluetooth", "isGPSEnable:%b isNetworkEnable:%b", java.lang.Boolean.valueOf(com.tencent.mm.sdk.platformtools.n2.a()), java.lang.Boolean.valueOf(com.tencent.mm.sdk.platformtools.n2.b()));
            }
            wt1.t tVar = this.f449331s;
            if (tVar != null && this.f449329q) {
                tVar.b();
            }
            e();
            gm0.j1.n().f273288b.a(2574, this);
        }
    }

    public void e() {
        f();
        int i17 = this.f449332t;
        if (i17 <= 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CardLbsOrBluetooth", "not to start ReportTimer!");
            return;
        }
        long j17 = i17 * 1000;
        this.f449335w.c(j17, j17);
        com.tencent.mars.xlog.Log.i("MicroMsg.CardLbsOrBluetooth", "start ReportTimer!");
    }

    public void f() {
        com.tencent.mars.xlog.Log.i("MicroMsg.CardLbsOrBluetooth", "stop ReportTimer!");
        if (this.f449335w.e()) {
            return;
        }
        this.f449335w.d();
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.CardLbsOrBluetooth", "report success, onSceneEnd errType:%d, errCode:%d, errMsg:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        this.f449323h = false;
    }
}
