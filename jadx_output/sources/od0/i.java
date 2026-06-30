package od0;

/* loaded from: classes11.dex */
public class i implements java.lang.Runnable {
    @Override // java.lang.Runnable
    public void run() {
        try {
            int length = ((android.hardware.display.DisplayManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("display")).getDisplays().length;
            r45.lw4 h17 = ko3.l0.INSTANCE.h();
            if (length <= 1 || h17 == null) {
                return;
            }
            if (android.text.TextUtils.isEmpty(h17.f379888g) && android.text.TextUtils.isEmpty(h17.f379886e)) {
                return;
            }
            w04.l lVar = w04.l.INSTANCE;
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            int i17 = 10;
            int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_android_foreground_multi_display_report_count, 10);
            if (Ni >= 0) {
                i17 = Ni;
            }
            if (lVar.Cd(14, 86400000L, i17)) {
                od0.r.Ai(540999749, null);
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.PSIR", th6, "[arsitcifmd] unexpected exception was thrown.", new java.lang.Object[0]);
        }
    }
}
