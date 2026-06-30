package od0;

/* loaded from: classes8.dex */
public class d0 implements com.tencent.mm.modelbase.e3 {
    public d0(od0.v vVar) {
    }

    @Override // com.tencent.mm.modelbase.e3
    public int callback(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar, com.tencent.mm.modelbase.m1 m1Var) {
        if (i17 == 0 && i18 == 0) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.i("MicroMsg.SecInfoReporterImpl", "cgireport succ, stack: %s", com.tencent.mm.sdk.platformtools.z3.b(true));
            jx3.f.INSTANCE.idkeyStat(416L, 4L, 1L, false);
            return 0;
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i18);
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.w("MicroMsg.SecInfoReporterImpl", "cgireport failed, err: %d:%d %s, stack: %s", valueOf, valueOf2, str, com.tencent.mm.sdk.platformtools.z3.b(true));
        jx3.f.INSTANCE.idkeyStat(416L, 5L, 1L, false);
        return 0;
    }
}
