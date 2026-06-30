package od0;

/* loaded from: classes13.dex */
public class a0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f344526d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f344527e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ od0.v f344528f;

    public a0(od0.v vVar, int i17, java.lang.String str) {
        this.f344528f = vVar;
        this.f344526d = i17;
        this.f344527e = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            if (gm0.j1.a()) {
                int i17 = this.f344526d;
                if (i17 < 0) {
                    i17 = ((android.view.WindowManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("window")).getDefaultDisplay().getDisplayId();
                }
                if (i17 < 0) {
                    return;
                }
                r45.e40 e40Var = new r45.e40();
                e40Var.f373001d = this.f344527e;
                e40Var.f373002e = i17;
                if (((android.hardware.display.DisplayManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("display")).getDisplays().length <= 1 || i17 == 0) {
                    return;
                }
                java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                int i18 = 20;
                int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_show_in_other_display_report_count, 20);
                if (Ni >= 0) {
                    i18 = Ni;
                }
                if (od0.o0.c(12, 86400000L, i18)) {
                    this.f344528f.a8(540999722, 1008, 0, 0, e40Var.toByteArray(), false);
                }
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SecInfoReporterImpl", "[-] report riod error:" + e17);
        }
    }
}
