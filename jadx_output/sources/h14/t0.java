package h14;

/* loaded from: classes.dex */
public class t0 implements vg3.r4 {
    @Override // vg3.r4
    public void h0(java.lang.String str, java.util.Map map, com.tencent.mm.modelbase.p0 p0Var) {
        if (map != null) {
            java.lang.String str2 = (java.lang.String) map.get(".sysmsg.UseSm4GcmConfig.switch");
            com.tencent.mars.xlog.Log.i("UseSm4GcmConfig", "sm4gcm values:%s", str2);
            int P = com.tencent.mm.sdk.platformtools.t8.P(str2, 0);
            com.tencent.mm.sdk.platformtools.o4.L().putBoolean("SM4GCM_SWITCH", P == 1);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1934L, P == 1 ? 6L : 7L, 1L, false);
        }
    }
}
