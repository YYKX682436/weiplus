package t21;

/* loaded from: classes12.dex */
public class p0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f414858d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f414859e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ t21.r0 f414860f;

    public p0(t21.r0 r0Var, boolean z17, int i17) {
        this.f414860f = r0Var;
        this.f414858d = z17;
        this.f414859e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean N;
        t21.r0 r0Var = this.f414860f;
        java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d(r0Var.f414909m.g(), "msg", null);
        if (d17 != null) {
            t21.o2.Ui().B(((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).rj(null, bm5.f0.f22571s, r0Var.f414905f, false), (java.lang.String) d17.get(".msg.videomsg.$cdnvideourl"), (java.lang.String) d17.get(".msg.videomsg.$aeskey"));
        }
        int i17 = this.f414859e;
        boolean z17 = this.f414858d;
        if (z17) {
            N = t21.d3.N(r0Var.f414905f, i17);
            if (r0Var.f414908i) {
                t21.d3.H(r0Var.f414905f);
                com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneDownloadVideo", "sceneEndproc, isHadHevcLocalFile");
            }
        } else if (r0Var.f414908i) {
            t21.d3.G(r0Var.f414905f);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(354L, 138L, 1L, false);
            N = false;
        } else {
            N = t21.d3.N(r0Var.f414905f, i17);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneDownloadVideo", "%s ashutest::cdntra !FIN! file:%s svrid:%d human:%s user:%s updatedbsucc:%b  MediaCheckDuplicationStorage MD5:%s SIZE:%d renameFlag %b needRename %b", r0Var.J(), r0Var.f414905f, java.lang.Long.valueOf(r0Var.f414909m.f415004c), r0Var.f414909m.e(), r0Var.f414909m.h(), java.lang.Boolean.valueOf(N), r0Var.f414917u, java.lang.Integer.valueOf(r0Var.f414918v), java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(r0Var.f414916t));
        if (!com.tencent.mm.sdk.platformtools.t8.K0(r0Var.f414917u) && r0Var.f414918v > 0) {
            ((com.tencent.mm.storage.w8) ((g90.o0) ((h90.b0) i95.n0.c(h90.b0.class))).wi()).i(r0Var.f414917u, r0Var.f414918v, ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).rj(null, bm5.f0.f22571s, r0Var.f414905f, false));
        }
        if (r0Var.f414909m.f415026x == 3) {
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            g0Var.idkeyStat(198L, 38L, r2.f415008f, false);
            g0Var.idkeyStat(198L, 40L, r0Var.f414909m.f415015m, false);
            g0Var.idkeyStat(198L, 41L, 1L, false);
            g0Var.idkeyStat(198L, com.tencent.mm.storage.z3.R4(r0Var.f414909m.h()) ? 43L : 42L, 1L, false);
        } else {
            com.tencent.mm.plugin.report.service.g0 g0Var2 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            g0Var2.idkeyStat(198L, 31L, r2.f415008f, false);
            g0Var2.idkeyStat(198L, 33L, r0Var.f414909m.f415015m, false);
            g0Var2.idkeyStat(198L, 34L, 1L, false);
            g0Var2.idkeyStat(198L, com.tencent.mm.storage.z3.R4(r0Var.f414909m.h()) ? 36L : 35L, 1L, false);
        }
        r0Var.f414903d.onSceneEnd(0, 0, "", r0Var);
    }
}
