package gc0;

/* loaded from: classes5.dex */
public final class g0 implements vg3.o4, vg3.s4 {
    @Override // vg3.o4
    public void M(com.tencent.mm.storage.z3 z3Var, com.tencent.mm.storage.z3 z3Var2, r45.tn4 tn4Var, byte[] bArr, boolean z17) {
    }

    @Override // vg3.o4
    public void b0(com.tencent.mm.storage.z3 z3Var, com.tencent.mm.storage.z3 z3Var2, r45.tn4 tn4Var, byte[] bArr, boolean z17) {
    }

    @Override // vg3.o3
    public void f(com.tencent.mm.storage.z3 z3Var) {
    }

    @Override // vg3.o3
    public void i(java.lang.String str, java.lang.String str2) {
        com.tencent.mars.xlog.Log.i("MicroMsg.RecommendRemarkContactAssemblerImpl", "beforeAddContact() called with: newContact = " + str + " profileExposeMaxTime:" + j62.e.g().c(new com.tencent.mm.repairer.config.remark.RepairerConfigRecommendRemarkProfileExposeLimit()) + " limitDetectMsgCount:" + j62.e.g().c(new com.tencent.mm.repairer.config.remark.RepairerConfigRecommendRemarkCount()) + " msgDetectTimeLimit:" + (j62.e.g().c(new com.tencent.mm.repairer.config.remark.RepairerConfigRecommendRemarkChattingTimeLimit()) * 60 * 1000));
    }

    @Override // vg3.o4
    public void m1(com.tencent.mm.storage.z3 z3Var, r45.xb0 xb0Var) {
        java.lang.String d17 = z3Var != null ? z3Var.d1() : null;
        com.tencent.mars.xlog.Log.i("MicroMsg.RecommendRemarkContactAssemblerImpl", "del contact, talker: " + d17);
        if (d17 != null) {
            gc0.f0 f0Var = gc0.f0.f270167a;
            com.tencent.mars.xlog.Log.i("MicroMsg.RecommendRemarkCache", "clearTalkerRemarkData talker: ".concat(d17));
            f0Var.d(d17);
            f0Var.c().remove(d17);
            gc0.y0 y0Var = gc0.y0.f270365a;
            gc0.y0.f270366b.clear();
            f0Var.d(d17);
        }
    }

    @Override // vg3.o3
    public void q(com.tencent.mm.storage.z3 z3Var) {
    }

    @Override // vg3.o3
    public void t(com.tencent.mm.storage.z3 z3Var) {
    }
}
