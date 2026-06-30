package od0;

/* loaded from: classes13.dex */
public class y implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fo3.r f344596d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f344597e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f344598f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ od0.v f344599g;

    public y(od0.v vVar, fo3.r rVar, java.lang.String str, int i17) {
        this.f344599g = vVar;
        this.f344596d = rVar;
        this.f344597e = str;
        this.f344598f = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        byte[] Xi;
        int i17 = this.f344598f;
        fo3.r rVar = this.f344596d;
        try {
            int i18 = rVar.f264945b;
            if ((i18 == 1 || i18 == 2) && (Xi = fo3.s.INSTANCE.Xi(this.f344597e, true)) != null && Xi.length != 0) {
                if (rVar.f264945b == 1) {
                    int i19 = 10;
                    int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_normsg_common_evil_click_report_count_daily, 10);
                    if (Ni >= 0) {
                        i19 = Ni;
                    }
                    if (!od0.o0.c(11, 86400000L, i19)) {
                        return;
                    }
                }
                r45.k57 k57Var = new r45.k57();
                r45.cu5 cu5Var = new r45.cu5();
                cu5Var.d(Xi);
                k57Var.f378395e = cu5Var;
                r45.cu5 cu5Var2 = new r45.cu5();
                cu5Var2.d(com.tencent.mm.normsg.WCProbe$Info.e(1008));
                k57Var.f378396f = cu5Var2;
                this.f344599g.Ai(i17, k57Var.toByteArray(), false);
                com.tencent.mars.xlog.Log.i("MicroMsg.SecInfoReporterImpl", "[+] report eci suc, context=" + i17);
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SecInfoReporterImpl", "[+] report eci error, msg:" + th6);
        }
    }
}
