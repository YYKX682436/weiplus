package st3;

/* loaded from: classes10.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public static final st3.n f412555a = new st3.n();

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.String f412556b = "";

    static {
        ((ku5.t0) ku5.t0.f312615d).g(st3.m.f412554d);
    }

    public final boolean a(boolean z17, int i17) {
        if (!((rx.a) ((sx.a0) i95.n0.c(sx.a0.class))).bj()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.HevcEncodeChecker", "captureEnableHevc: hevc not support");
            return false;
        }
        bm5.h0 h0Var = bm5.h0.RepairerConfig_Media_CaptureHevc_Int;
        wo.g1 g1Var = wo.v1.f447829i;
        boolean b17 = b(z17, h0Var, g1Var.D, g1Var.E, e42.d0.clicfg_capture_enable_hevc_hard, e42.d0.clicfg_capture_enable_hevc_hard_gpu_rating_limit, e42.d0.clicfg_capture_enable_hevc_soft, e42.d0.clicfg_capture_enable_hevc_soft_gpu_rating_limit, i17);
        com.tencent.mars.xlog.Log.i("MicroMsg.HevcEncodeChecker", "captureEnableHevc result:" + b17 + ", isSoft:" + z17);
        return b17;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0093, code lost:
    
        if (r4 >= r1) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002c, code lost:
    
        if (r24 == 1) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002e, code lost:
    
        r3 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(boolean r22, bm5.h0 r23, int r24, int r25, e42.d0 r26, e42.d0 r27, e42.d0 r28, e42.d0 r29, int r30) {
        /*
            Method dump skipped, instructions count: 353
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: st3.n.b(boolean, bm5.h0, int, int, e42.d0, e42.d0, e42.d0, e42.d0, int):boolean");
    }

    public final boolean c(boolean z17) {
        boolean z18;
        boolean z19 = false;
        if (!((rx.a) ((sx.a0) i95.n0.c(sx.a0.class))).bj() || !com.tencent.mm.sdk.platformtools.z.f193115k) {
            com.tencent.mars.xlog.Log.i("MicroMsg.HevcEncodeChecker", "remuxEnableHevc: hevc not support");
            return false;
        }
        int g17 = bm5.o1.f22719a.g(bm5.h0.RepairerConfig_Media_RemuxHevc_Int, 0);
        int f17 = rs0.n.f399306d.f();
        if (z17) {
            boolean z27 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_sns_live_photo_remux_hevc_config, 0) == 2;
            if (z27) {
                int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_remux_enable_hevc_soft_gpu_rating_limit, -1);
                com.tencent.mars.xlog.Log.i("MicroMsg.HevcEncodeChecker", "checkHevcEnableImpl software encode gpu rating limit:" + Ni + ", gpuRating:" + f17);
                if (Ni > 0 && f17 >= Ni) {
                    z19 = true;
                }
                z27 = z19;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.HevcEncodeChecker", "checkHevcEnableImpl software encode enable:" + z27 + ", gpuRating:" + f17);
            z18 = g17 != 1 ? z27 : true;
            com.tencent.mars.xlog.Log.i("MicroMsg.HevcEncodeChecker", "checkHevcEnableImpl software encode enable:" + z18 + ", repairerConfig:" + g17);
        } else {
            boolean z28 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_sns_live_photo_remux_hevc_config, 0) == 1;
            if (z28) {
                int Ni2 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_remux_enable_hevc_hard_gpu_rating_limit, -1);
                com.tencent.mars.xlog.Log.i("MicroMsg.HevcEncodeChecker", "checkHevcEnableImpl hardware encode gpu rating limit:" + Ni2 + ", gpuRating:" + f17);
                if (Ni2 > 0 && f17 >= Ni2) {
                    z19 = true;
                }
                z28 = z19;
            }
            z18 = g17 != 2 ? z28 : true;
            com.tencent.mars.xlog.Log.i("MicroMsg.HevcEncodeChecker", "checkHevcEnableImpl hardware encode enable:" + z18 + ", repairerConfig:" + g17);
        }
        return z18;
    }

    public final boolean d(boolean z17, int i17) {
        if (!((rx.a) ((sx.a0) i95.n0.c(sx.a0.class))).bj()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.HevcEncodeChecker", "remuxEnableHevc: hevc not support");
            return false;
        }
        bm5.h0 h0Var = bm5.h0.RepairerConfig_Media_RemuxHevc_Int;
        wo.g1 g1Var = wo.v1.f447829i;
        boolean b17 = b(z17, h0Var, g1Var.F, g1Var.G, e42.d0.clicfg_remux_enable_hevc_hard, e42.d0.clicfg_remux_enable_hevc_hard_gpu_rating_limit, e42.d0.clicfg_remux_enable_hevc_soft, e42.d0.clicfg_remux_enable_hevc_soft_gpu_rating_limit, i17);
        com.tencent.mars.xlog.Log.i("MicroMsg.HevcEncodeChecker", "remuxEnableHevc result:" + b17 + ", isSoft:" + z17);
        return b17;
    }
}
