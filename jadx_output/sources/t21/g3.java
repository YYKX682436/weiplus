package t21;

/* loaded from: classes12.dex */
public class g3 implements com.tencent.mm.modelbase.i1 {
    public int b(int i17, dn.h hVar, long j17, t21.v2 v2Var, java.lang.String str, java.lang.String str2, int i18, java.lang.String str3, long j18) {
        t21.v2 g17;
        if (i17 != 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.VideoMsgExtension", "getThumbByCdn failed. startRet:%d msgSvrId:%d user:%s thumbUrl:%s thumbPath:%s", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(j17), v2Var.h(), str2, str);
            return i17;
        }
        if (hVar == null) {
            return 0;
        }
        int i19 = hVar.field_retCode;
        if (i19 != 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.VideoMsgExtension", "getThumbByCdn failed. sceneResult.field_retCode:%d msgSvrId:%d user:%s thumbUrl:%s thumbPath:%s", java.lang.Integer.valueOf(i19), java.lang.Long.valueOf(j17), v2Var.h(), str2, str);
        } else {
            com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(str);
            java.lang.String str4 = a17.f213279f;
            if (str4 != null) {
                java.lang.String l17 = com.tencent.mm.vfs.e8.l(str4, false, false);
                if (!str4.equals(l17)) {
                    a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
                }
            }
            com.tencent.mm.vfs.z7 a18 = com.tencent.mm.vfs.z7.a(str3);
            java.lang.String str5 = a18.f213279f;
            if (str5 != null) {
                java.lang.String l18 = com.tencent.mm.vfs.e8.l(str5, false, false);
                if (!str5.equals(l18)) {
                    a18 = new com.tencent.mm.vfs.z7(a18.f213277d, a18.f213278e, l18, a18.f213280g, a18.f213281h);
                }
            }
            com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a18, null);
            com.tencent.mm.vfs.z2 m18 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
            if (m17.a() && m18.a()) {
                try {
                    m18.f213266a.t(m18.f213267b, m17.f213266a, m17.f213267b);
                } catch (java.io.IOException unused) {
                }
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.VideoMsgExtension", "getThumbByCdn succ. msgSvrId:%d user:%s thumbUrl:%s thumbPath:%s", java.lang.Long.valueOf(j17), v2Var.h(), str2, str);
            if (v2Var.f415026x == 3) {
                com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                g0Var.idkeyStat(198L, 6L, i18, false);
                g0Var.idkeyStat(198L, 7L, 1L, false);
                g0Var.idkeyStat(198L, com.tencent.mm.storage.z3.R4(v2Var.h()) ? 9L : 8L, 1L, false);
            } else {
                com.tencent.mm.plugin.report.service.g0 g0Var2 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                g0Var2.idkeyStat(198L, 11L, i18, false);
                g0Var2.idkeyStat(198L, 12L, 1L, false);
                g0Var2.idkeyStat(198L, com.tencent.mm.storage.z3.R4(v2Var.h()) ? 14L : 13L, 1L, false);
            }
        }
        t21.w2 Ui = t21.o2.Ui();
        java.lang.String d17 = v2Var.d();
        wf0.t1 t1Var = wf0.t1.NORMAL;
        Ui.getClass();
        if (!com.tencent.mm.sdk.platformtools.t8.K0(d17) && (g17 = Ui.g(d17)) != null) {
            wf0.r1 r1Var = new wf0.r1(g17.d(), wf0.s1.UPDATE, t1Var, g17.f415026x, g17.f415027y);
            l75.v0 v0Var = Ui.f415058b;
            v0Var.d(r1Var);
            v0Var.c();
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:153:0x0884  */
    @Override // com.tencent.mm.modelbase.t0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.tencent.mm.modelbase.q0 b1(com.tencent.mm.modelbase.p0 r50) {
        /*
            Method dump skipped, instructions count: 2423
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t21.g3.b1(com.tencent.mm.modelbase.p0):com.tencent.mm.modelbase.q0");
    }

    @Override // com.tencent.mm.modelbase.t0
    public long k(java.lang.String str, r45.j4 j4Var, java.lang.String str2) {
        return !((kc5.x) ((wg3.j) i95.n0.c(wg3.j.class))).Di() ? c01.w9.m(str, j4Var.f377565o) : ((kc5.x) ((wg3.j) i95.n0.c(wg3.j.class))).Bi(str, j4Var, str2);
    }

    @Override // com.tencent.mm.modelbase.t0
    public void x5(com.tencent.mm.modelbase.r0 r0Var) {
        com.tencent.mm.storage.f9 f9Var = r0Var.f70757a;
        if (f9Var == null) {
            return;
        }
        t21.d3.f(f9Var.z0(), f9Var);
    }
}
