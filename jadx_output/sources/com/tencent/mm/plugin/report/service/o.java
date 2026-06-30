package com.tencent.mm.plugin.report.service;

/* loaded from: classes12.dex */
public class o implements wu5.j {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.report.service.q f158292d;

    public o(com.tencent.mm.plugin.report.service.q qVar) {
        this.f158292d = qVar;
    }

    @Override // wu5.f
    public boolean a() {
        return false;
    }

    @Override // wu5.h, wu5.g
    public java.lang.String getKey() {
        return "IdKeyAggregator";
    }

    @Override // java.lang.Runnable
    public void run() {
        for (com.tencent.mm.plugin.report.service.p pVar : this.f158292d.f158303d) {
            if (pVar != null) {
                java.util.concurrent.atomic.AtomicLong atomicLong = pVar.f158298c;
                final long andSet = atomicLong != null ? atomicLong.getAndSet(0L) : 0L;
                if (andSet > 0) {
                    com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                    final long j17 = pVar.f158296a;
                    final long j18 = pVar.f158297b;
                    g0Var.getClass();
                    if (com.tencent.mm.sdk.platformtools.x2.n()) {
                        g0Var.L(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.report.service.g0$$r
                            @Override // java.lang.Runnable
                            public final void run() {
                                com.tencent.mm.plugin.report.service.x.b(j17, j18, andSet, false);
                            }
                        });
                    } else if (com.tencent.mm.sdk.platformtools.x2.p() && g0Var.u() && g0Var.f158177g) {
                        g0Var.L(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.report.service.g0$$s
                            @Override // java.lang.Runnable
                            public final void run() {
                                com.tencent.mm.plugin.report.service.x.c(j17, j18, andSet, false);
                            }
                        });
                    } else {
                        g0Var.M(j17, j18, andSet, false);
                    }
                }
            }
        }
    }
}
