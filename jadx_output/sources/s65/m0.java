package s65;

/* loaded from: classes11.dex */
public class m0 {

    /* renamed from: h, reason: collision with root package name */
    public static long f403493h = 125829120;

    /* renamed from: f, reason: collision with root package name */
    public final s65.x0 f403499f;

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.b4 f403494a = new com.tencent.mm.sdk.platformtools.b4(new s65.j0(this), true);

    /* renamed from: b, reason: collision with root package name */
    public long f403495b = 0;

    /* renamed from: c, reason: collision with root package name */
    public long f403496c = 0;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f403497d = null;

    /* renamed from: e, reason: collision with root package name */
    public boolean f403498e = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f403500g = false;

    public m0(s65.x0 x0Var) {
        this.f403499f = x0Var;
    }

    public final void a(boolean z17) {
        if (z17 || this.f403495b + this.f403496c >= 524288) {
            long j17 = this.f403495b + this.f403496c;
            long j18 = 0;
            s65.x0 x0Var = this.f403499f;
            if (j17 > 0) {
                android.content.Intent intent = new android.content.Intent();
                intent.setAction("com.tencent.mm.sandbox.updater.intent.ACTION_UPDATE");
                intent.putExtra("intent_extra_flow_stat_upstream", this.f403495b);
                intent.putExtra("intent_extra_flow_stat_downstream", this.f403496c);
                android.content.Context context = x0Var.A;
                if (context != null) {
                    this.f403500g = com.tencent.mars.comm.NetStatusUtil.isWifi(context);
                }
                intent.putExtra("intent_extra_flow_stat_is_wifi", this.f403500g);
                intent.setPackage(com.tencent.mm.sdk.platformtools.x2.f193072b);
                android.content.Context context2 = x0Var.A;
                if (context2 != null) {
                    context2.sendBroadcast(intent, com.tencent.mm.sdk.platformtools.v9.a());
                }
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(this.f403497d)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.TrafficStatistic", "traffic is null!");
            } else {
                java.lang.String str = this.f403497d;
                long j19 = this.f403495b;
                long j27 = this.f403496c;
                com.tencent.mm.sdk.platformtools.o4 o4Var = (com.tencent.mm.sdk.platformtools.o4) com.tencent.mm.sdk.platformtools.MultiProcessSharedPreferences.b(com.tencent.mm.sdk.platformtools.x2.f193071a, "update_flowstat_prefs", 4);
                long j28 = o4Var.getLong(str, 0L);
                com.tencent.mars.xlog.Log.i("MicroMsg.UpdateUtil", "putPackFlowStat pack %s, flowUp %s, flowDown %s", str, java.lang.Long.valueOf(j19), java.lang.Long.valueOf(j27));
                com.tencent.mars.xlog.Log.i("MicroMsg.UpdateUtil", "putPackFlowStat pack %s, flow %s", str, java.lang.Long.valueOf(j28));
                long j29 = j28 + j19 + j27;
                o4Var.putLong(str, j29);
                this.f403495b = 0L;
                this.f403496c = 0L;
                j18 = j29;
            }
            if (j18 < f403493h || x0Var.f403544r != 2) {
                return;
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.TrafficStatistic", "checkIfTrafficAlert reach traffic alert line!");
            x0Var.k();
        }
    }

    public void b() {
        a(true);
        this.f403494a.d();
        this.f403498e = false;
    }
}
