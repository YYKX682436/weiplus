package com.tencent.mm.plugin.mmsight.segment;

/* loaded from: classes10.dex */
public abstract class h1 {
    public static void a(int i17) {
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var.idkeyStat(440L, 169L, 1L, false);
        if (i17 == 1) {
            g0Var.idkeyStat(440L, 170L, 1L, false);
        } else if (i17 == 2) {
            g0Var.idkeyStat(440L, 171L, 1L, false);
        } else if (i17 == 3) {
            g0Var.idkeyStat(440L, 172L, 1L, false);
        }
    }

    public static void b(int i17, long j17) {
        if (i17 == 1) {
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            g0Var.idkeyStat(440L, 150L, 1L, false);
            g0Var.idkeyStat(440L, 151L, j17, false);
        } else if (i17 == 2) {
            com.tencent.mm.plugin.report.service.g0 g0Var2 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            g0Var2.idkeyStat(440L, 155L, 1L, false);
            g0Var2.idkeyStat(440L, 156L, j17, false);
        } else if (i17 == 3) {
            com.tencent.mm.plugin.report.service.g0 g0Var3 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            g0Var3.idkeyStat(440L, 159L, 1L, false);
            g0Var3.idkeyStat(440L, 160L, j17, false);
        }
    }
}
