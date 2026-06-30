package wt1;

/* loaded from: classes8.dex */
public class g0 implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public float f449280d = -85.0f;

    /* renamed from: e, reason: collision with root package name */
    public float f449281e = -1000.0f;

    /* renamed from: f, reason: collision with root package name */
    public long f449282f = 0;

    public void a(java.lang.String str, java.lang.String str2, int i17) {
        if ((java.lang.System.currentTimeMillis() / 1000) - this.f449282f > 1800) {
            this.f449280d = -85.0f;
            this.f449281e = -1000.0f;
            com.tencent.mars.xlog.Log.i("MicroMsg.CardReportLBSManager", "checkDataValid time is out");
        }
        if (this.f449280d == -85.0f) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CardReportLBSManager", "checkDataValid lbsLatitude ==  LocationGeo.INVALID_LAT");
        }
        if (this.f449281e == -1000.0f) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CardReportLBSManager", "checkDataValid lbsLongitude ==  LocationGeo.INVALID_LNG");
        }
        gm0.j1.n().f273288b.a(com.tencent.mm.plugin.appbrand.ad.jsapi.e.CTRL_INDEX, this);
        gm0.j1.n().f273288b.g(new xt1.c0(this.f449280d, this.f449281e, str, str2, i17));
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.CardReportLBSManager", "rplbs onGYNetEnd, errType = %d, errCode = %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        gm0.j1.n().f273288b.q(com.tencent.mm.plugin.appbrand.ad.jsapi.e.CTRL_INDEX, this);
    }
}
