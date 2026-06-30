package od0;

/* loaded from: classes8.dex */
public class c0 implements com.tencent.mm.modelbase.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f344532d;

    public c0(od0.v vVar, int i17) {
        this.f344532d = i17;
    }

    @Override // com.tencent.mm.modelbase.e3
    public int callback(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar, com.tencent.mm.modelbase.m1 m1Var) {
        int i19 = this.f344532d;
        if (i17 == 0 && i18 == 0) {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(i19);
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.i("MicroMsg.SecInfoReporterImpl", "cgireport succ, ctx: %d, stack: %s", valueOf, com.tencent.mm.sdk.platformtools.z3.b(true));
            jx3.f.INSTANCE.idkeyStat(416L, 1L, 1L, false);
            return 0;
        }
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i19);
        java.lang.Integer valueOf3 = java.lang.Integer.valueOf(i17);
        java.lang.Integer valueOf4 = java.lang.Integer.valueOf(i18);
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.w("MicroMsg.SecInfoReporterImpl", "cgireport failed, ctx: %d, err: %d:%d %s, stack: %s", valueOf2, valueOf3, valueOf4, str, com.tencent.mm.sdk.platformtools.z3.b(true));
        jx3.f.INSTANCE.idkeyStat(416L, 2L, 1L, false);
        return 0;
    }
}
