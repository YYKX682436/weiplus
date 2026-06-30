package com.tencent.mm.plugin.normsg;

/* loaded from: classes13.dex */
public class h implements java.lang.Runnable {
    public h(com.tencent.mm.plugin.normsg.u uVar) {
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            java.lang.String a17 = fo3.l.a(7);
            int max = java.lang.Math.max(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_sensor_max_sampling_count_for_pay, 200), 0);
            jo3.b bVar = new jo3.b(a17, max);
            if (max > 0) {
                ot5.i iVar = io3.c.f293500d;
                java.lang.Object obj = iVar.f348878a;
                if (obj == null) {
                    synchronized (iVar) {
                        obj = iVar.f348878a;
                        if (obj == null) {
                            obj = iVar.a();
                            iVar.f348878a = obj;
                        }
                    }
                }
                io3.c cVar = (io3.c) obj;
                cVar.c(1, 7, bVar, 0L);
                cVar.c(3, 0, a17, bVar.f300893b);
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.NormsgSourceImpl", th6, "run csd error", new java.lang.Object[0]);
        }
    }
}
