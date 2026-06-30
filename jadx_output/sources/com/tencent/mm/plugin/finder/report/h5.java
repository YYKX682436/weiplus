package com.tencent.mm.plugin.finder.report;

/* loaded from: classes10.dex */
public final class h5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f125067d;

    public h5(java.util.ArrayList arrayList) {
        this.f125067d = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.report.i5 i5Var;
        java.util.ArrayList arrayList = this.f125067d;
        java.util.Iterator it = arrayList.iterator();
        long j17 = 0;
        while (true) {
            boolean hasNext = it.hasNext();
            i5Var = com.tencent.mm.plugin.finder.report.i5.f125077a;
            if (!hasNext) {
                break;
            }
            java.lang.String str = (java.lang.String) it.next();
            ((d60.c0) ((e60.k1) i95.n0.c(e60.k1.class))).getClass();
            long j18 = j33.s.f297456a.c(str).f162382a;
            j17 += j18;
            if (j18 < 5000) {
                com.tencent.mm.plugin.finder.report.i5.a(i5Var, 234L, 0L, 2, null);
            } else if (j18 < com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT) {
                com.tencent.mm.plugin.finder.report.i5.a(i5Var, 235L, 0L, 2, null);
            } else if (j18 < 15000) {
                com.tencent.mm.plugin.finder.report.i5.a(i5Var, 236L, 0L, 2, null);
            } else if (j18 < 20000) {
                com.tencent.mm.plugin.finder.report.i5.a(i5Var, 237L, 0L, 2, null);
            } else if (j18 < 30000) {
                com.tencent.mm.plugin.finder.report.i5.a(i5Var, 238L, 0L, 2, null);
            } else if (j18 < 40000) {
                com.tencent.mm.plugin.finder.report.i5.a(i5Var, 239L, 0L, 2, null);
            } else if (j18 < 50000) {
                com.tencent.mm.plugin.finder.report.i5.a(i5Var, 240L, 0L, 2, null);
            } else if (j18 < 60000) {
                com.tencent.mm.plugin.finder.report.i5.a(i5Var, 241L, 0L, 2, null);
            }
        }
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var.idkeyStat(1371L, 231L, j17, false);
        if (j17 < 5000) {
            com.tencent.mm.plugin.finder.report.i5.a(i5Var, 242L, 0L, 2, null);
        } else if (j17 < com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT) {
            com.tencent.mm.plugin.finder.report.i5.a(i5Var, 243L, 0L, 2, null);
        } else if (j17 < 15000) {
            com.tencent.mm.plugin.finder.report.i5.a(i5Var, 244L, 0L, 2, null);
        } else if (j17 < 20000) {
            com.tencent.mm.plugin.finder.report.i5.a(i5Var, 245L, 0L, 2, null);
        } else if (j17 < 30000) {
            com.tencent.mm.plugin.finder.report.i5.a(i5Var, 246L, 0L, 2, null);
        } else if (j17 < 40000) {
            com.tencent.mm.plugin.finder.report.i5.a(i5Var, 247L, 0L, 2, null);
        } else if (j17 < 50000) {
            com.tencent.mm.plugin.finder.report.i5.a(i5Var, 248L, 0L, 2, null);
        } else if (j17 < 60000) {
            com.tencent.mm.plugin.finder.report.i5.a(i5Var, 249L, 0L, 2, null);
        }
        long size = arrayList.size();
        g0Var.idkeyStat(1371L, 250L, size, false);
        if (size <= 3) {
            com.tencent.mm.plugin.finder.report.i5.a(i5Var, 251L, 0L, 2, null);
            return;
        }
        if (size <= 6) {
            com.tencent.mm.plugin.finder.report.i5.a(i5Var, 252L, 0L, 2, null);
            return;
        }
        if (size <= 10) {
            com.tencent.mm.plugin.finder.report.i5.a(i5Var, 253L, 0L, 2, null);
        } else if (size <= 15) {
            com.tencent.mm.plugin.finder.report.i5.a(i5Var, 254L, 0L, 2, null);
        } else if (size <= 20) {
            com.tencent.mm.plugin.finder.report.i5.a(i5Var, 255L, 0L, 2, null);
        }
    }
}
