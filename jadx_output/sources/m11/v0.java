package m11;

/* loaded from: classes12.dex */
public class v0 implements com.tencent.mm.modelcdntran.q0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m11.t0 f322805a;

    public v0(m11.t0 t0Var) {
        this.f322805a = t0Var;
    }

    @Override // com.tencent.mm.modelcdntran.q0
    public void a(com.tencent.mm.modelcdntran.n1 n1Var) {
        m11.t0 t0Var = this.f322805a;
        com.tencent.mars.xlog.Log.i(t0Var.f322777d, "CdnPLCJavaHelperListener %s %s %s", java.lang.Long.valueOf(t0Var.f322787q), n1Var.f71103a, java.lang.Integer.valueOf(n1Var.f71105c));
        int ordinal = n1Var.f71103a.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                if (n1Var.f71109g) {
                    m11.b0 C1 = m11.b1.Di().C1(java.lang.Long.valueOf(t0Var.f322783m));
                    if (C1.f322640h == 1) {
                        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                        g0Var.idkeyStat(198L, 26L, C1.f322636d, false);
                        g0Var.idkeyStat(198L, 27L, 1L, false);
                        com.tencent.mm.storage.f9 f9Var = t0Var.f322789s;
                        g0Var.idkeyStat(198L, com.tencent.mm.storage.z3.R4(f9Var != null ? f9Var.Q0() : "") ? 29L : 28L, 1L, false);
                    } else {
                        com.tencent.mm.plugin.report.service.g0 g0Var2 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                        g0Var2.idkeyStat(198L, 21L, C1.f322636d, false);
                        g0Var2.idkeyStat(198L, 22L, 1L, false);
                        com.tencent.mm.storage.f9 f9Var2 = t0Var.f322789s;
                        g0Var2.idkeyStat(198L, com.tencent.mm.storage.z3.R4(f9Var2 != null ? f9Var2.Q0() : "") ? 24L : 23L, 1L, false);
                    }
                    com.tencent.mars.xlog.Log.i(t0Var.f322777d, "CdnPLCJavaHelperListener copy link img success %s %s %s %s", java.lang.Long.valueOf(t0Var.f322783m), t0Var.f322795y, java.lang.Integer.valueOf(C1.f322635c), java.lang.Integer.valueOf(t0Var.f322796z));
                    t0Var.f322796z = (int) com.tencent.mm.vfs.w6.k(t0Var.f322795y);
                    m11.t0 t0Var2 = this.f322805a;
                    int i17 = t0Var2.f322796z;
                    t0Var2.I(C1, i17, i17, 0, null);
                    return;
                }
                m11.b0 C12 = m11.b1.Di().C1(java.lang.Long.valueOf(t0Var.f322783m));
                if (n1Var.f71108f != null) {
                    if (C12.f322640h == 1) {
                        com.tencent.mm.plugin.report.service.g0 g0Var3 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                        g0Var3.idkeyStat(198L, 26L, C12.f322636d, false);
                        g0Var3.idkeyStat(198L, 27L, 1L, false);
                        com.tencent.mm.storage.f9 f9Var3 = t0Var.f322789s;
                        g0Var3.idkeyStat(198L, com.tencent.mm.storage.z3.R4(f9Var3 != null ? f9Var3.Q0() : "") ? 29L : 28L, 1L, false);
                    } else {
                        com.tencent.mm.plugin.report.service.g0 g0Var4 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                        g0Var4.idkeyStat(198L, 21L, C12.f322636d, false);
                        g0Var4.idkeyStat(198L, 22L, 1L, false);
                        com.tencent.mm.storage.f9 f9Var4 = t0Var.f322789s;
                        g0Var4.idkeyStat(198L, com.tencent.mm.storage.z3.R4(f9Var4 != null ? f9Var4.Q0() : "") ? 24L : 23L, 1L, false);
                    }
                    if (n1Var.f71108f.field_convert2baseline) {
                        com.tencent.mars.xlog.Log.i(t0Var.f322777d, "cdntra need convert2baseline. file:%s", t0Var.f322795y);
                        com.tencent.mars.xlog.Log.i(t0Var.f322777d, "convert result:%b", java.lang.Boolean.valueOf(com.tencent.mm.sdk.platformtools.MMNativeJpeg.Convert2Baseline(t0Var.f322795y, 60)));
                    }
                }
                com.tencent.mars.xlog.Log.i(t0Var.f322777d, "CdnPLCJavaHelperListener download img success %s %s %s %s", java.lang.Long.valueOf(t0Var.f322783m), t0Var.f322795y, java.lang.Integer.valueOf(C12.f322635c), java.lang.Integer.valueOf(t0Var.f322796z));
                t0Var.f322796z = (int) com.tencent.mm.vfs.w6.k(t0Var.f322795y);
                m11.t0 t0Var3 = this.f322805a;
                int i18 = t0Var3.f322796z;
                t0Var3.I(C12, i18, i18, 0, null);
                return;
            }
            if (ordinal == 2) {
                dn.g gVar = n1Var.f71107e;
                if (gVar != null) {
                    long j17 = gVar.field_finishedLength;
                    long j18 = gVar.field_toltalLength;
                    if (j17 == j18) {
                        com.tencent.mars.xlog.Log.i(t0Var.f322777d, "cdntra ignore progress 100%% %s", java.lang.Integer.valueOf(t0Var.f322796z));
                        return;
                    }
                    if (!t0Var.A) {
                        t0Var.A = gVar.field_mtlnotify;
                    }
                    if (j18 > 0) {
                        t0Var.f322796z = java.lang.Long.valueOf(j18).intValue();
                        com.tencent.mars.xlog.Log.w(t0Var.f322777d, "CdnPLCJavaHelperListener progress modify totallen:%d", java.lang.Integer.valueOf(t0Var.f322796z));
                    }
                    m11.b0 C13 = m11.b1.Di().C1(java.lang.Long.valueOf(t0Var.f322783m));
                    com.tencent.mars.xlog.Log.i(t0Var.f322777d, "CdnPLCJavaHelperListener progress %s/%s imgOffset:%s", java.lang.Long.valueOf(n1Var.f71107e.field_finishedLength), java.lang.Long.valueOf(n1Var.f71107e.field_toltalLength), java.lang.Integer.valueOf(C13.f322635c));
                    m11.t0 t0Var4 = this.f322805a;
                    int i19 = t0Var4.f322796z;
                    int i27 = C13.f322635c;
                    t0Var4.I(C13, i19, i27, (int) (n1Var.f71107e.field_finishedLength - i27), null);
                    return;
                }
                return;
            }
            if (ordinal == 6 || ordinal == 7) {
                m11.o0.b(t0Var.f322781h);
                m11.o0.a(t0Var.f322781h);
                t0Var.f322779f.onSceneEnd(3, -1, "", t0Var);
                return;
            } else if (ordinal != 10) {
                return;
            }
        }
        m11.o0.b(t0Var.f322781h);
        m11.o0.a(t0Var.f322781h);
        t0Var.f322779f.onSceneEnd(3, n1Var.f71105c, "", t0Var);
    }
}
