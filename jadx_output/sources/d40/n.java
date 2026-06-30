package d40;

@j95.b
/* loaded from: classes5.dex */
public final class n extends i95.w implements e40.v {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f226365d = jz5.h.b(d40.m.f226364d);

    public long Ai() {
        return wi() ? Bi() : ip.c.k();
    }

    public final long Bi() {
        java.lang.Object m521constructorimpl;
        ((bf5.o) ((e40.u) i95.n0.c(e40.u.class))).getClass();
        ez.v0 v0Var = ez.v0.f257777a;
        if (!com.tencent.mm.sdk.platformtools.x2.n()) {
            return ((com.tencent.mm.ipcinvoker.type.IPCLong) com.tencent.mm.ipcinvoker.extension.l.b(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.ipcinvoker.type.IPCVoid(), ez.s0.class)).f68405d;
        }
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(java.lang.Long.valueOf(ip.c.j()));
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        if (kotlin.Result.m527isFailureimpl(m521constructorimpl)) {
            m521constructorimpl = 10737418240L;
        }
        return ((java.lang.Number) m521constructorimpl).longValue();
    }

    public boolean wi() {
        if (!(j62.e.g().c(new com.tencent.mm.repairer.config.file.RepairerConfigPreviewFileSizeLimitExpand()) == 1) || !((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Ri(1)) {
            return false;
        }
        int i17 = com.tencent.mm.sdk.platformtools.z.f193112h;
        if ((i17 == 788529167 || i17 == 788529166) || z65.c.a()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FileHelperFeatureService", "checkDeviceScoreForLargeFileSend inner user");
        } else {
            try {
                java.lang.String f17 = j62.e.g().f(new com.tencent.mm.repairer.config.file.RepairerConfigLargeFileSendDeviceScore());
                if (f17 == null || f17.length() == 0) {
                    return false;
                }
                kotlin.jvm.internal.o.d(f17);
                java.util.List f07 = r26.n0.f0(f17, new java.lang.String[]{":"}, false, 0, 6, null);
                if (f07.size() != 2) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.FileHelperFeatureService", "invalid device score config: ".concat(f17));
                    return false;
                }
                java.lang.Integer h17 = r26.h0.h((java.lang.String) f07.get(0));
                int intValue = h17 != null ? h17.intValue() : 0;
                java.lang.Integer h18 = r26.h0.h((java.lang.String) f07.get(1));
                int intValue2 = h18 != null ? h18.intValue() : 0;
                if (intValue <= 0 || intValue2 <= 0) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.FileHelperFeatureService", "cpuThreshold: " + intValue + ", gpuThreshold: " + intValue2);
                    return false;
                }
                rh0.x xVar = (rh0.x) i95.n0.c(rh0.x.class);
                if (xVar == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.FileHelperFeatureService", "IWeVisEffectConfigService is null");
                    return false;
                }
                p05.v2 v2Var = (p05.v2) xVar;
                com.tencent.mm.sdk.platformtools.o4 Bi = v2Var.Bi();
                p05.p3 p3Var = p05.p3.f350639a;
                float l17 = Bi.l("cpu_score");
                float l18 = v2Var.Bi().l("gpu_score");
                com.tencent.mars.xlog.Log.i("MicroMsg.FileHelperFeatureService", "checkDeviceScoreForLargeFileSend cpuScore: " + l17 + " , cpuThreshold: " + intValue + " , gpuScore: " + l18 + " , gpuThreshold: " + intValue2);
                if (l17 < intValue || l18 < intValue2) {
                    return false;
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.FileHelperFeatureService", "getExptString failed", e17);
                return false;
            }
        }
        return true;
    }
}
