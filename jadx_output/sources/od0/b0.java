package od0;

/* loaded from: classes13.dex */
public class b0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f344530d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ od0.v f344531e;

    public b0(od0.v vVar, android.content.Intent intent) {
        this.f344531e = vVar;
        this.f344530d = intent;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.network.AccInfo accInfo;
        try {
            com.tencent.mm.network.g1 c17 = com.tencent.mm.network.x2.c();
            if (c17 == null || (accInfo = c17.f71993n) == null || !accInfo.isLogin() || c01.e2.a0()) {
                return;
            }
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            if (od0.o0.c(8, 86400000L, ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_new_install_app_max_report_count, 10))) {
                byte[] yb6 = fo3.s.INSTANCE.yb(this.f344530d);
                r45.k57 k57Var = new r45.k57();
                r45.cu5 cu5Var = new r45.cu5();
                cu5Var.d(yb6);
                k57Var.f378405r = cu5Var;
                this.f344531e.Ai(540999696, k57Var.toByteArray(), false);
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SecInfoReporterImpl", "report error: " + th6);
        }
    }
}
