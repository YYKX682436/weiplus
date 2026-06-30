package re4;

/* loaded from: classes9.dex */
public class m implements java.lang.Runnable {
    @Override // java.lang.Runnable
    public void run() {
        java.lang.String b17 = c01.z1.b();
        if (com.tencent.mm.sdk.platformtools.t8.K0(re4.g0.f394535a) || re4.g0.f394535a.equals(b17)) {
            return;
        }
        gm0.j1.i();
        boolean booleanValue = ((java.lang.Boolean) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_FINGER_PRINT_IS_OPEN_BOOLEAN_SYNC, java.lang.Boolean.FALSE)).booleanValue();
        java.lang.String d17 = re4.g0.d(1);
        java.lang.String e17 = re4.g0.e(1);
        boolean i17 = wt5.a.i(d17);
        boolean i18 = wt5.a.i(e17);
        if (booleanValue && !i17 && i18) {
            boolean i19 = wt5.a.i(re4.g0.a());
            com.tencent.mars.xlog.Log.i("MicroMsg.FingerpirntReporter", "report key valid before pay: %s", java.lang.Boolean.valueOf(i19));
            if (i19) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1104, 50);
            } else {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1104, 49);
            }
        }
    }
}
