package com.tencent.mm.plugin.report.service;

/* loaded from: classes8.dex */
public class i0 extends hm0.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.report.service.j0 f158281d;

    public i0(com.tencent.mm.plugin.report.service.j0 j0Var) {
        this.f158281d = j0Var;
    }

    @Override // hm0.t
    public void b() {
        final com.tencent.mm.plugin.report.service.g0 g0Var = this.f158281d.f158284d;
        com.tencent.mm.plugin.report.service.g0 g0Var2 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var.getClass();
        final com.tencent.mm.plugin.report.service.k0 k0Var = new com.tencent.mm.plugin.report.service.k0(g0Var);
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.PostSyncTaskEvent>(a0Var) { // from class: com.tencent.mm.plugin.report.service.ReportManager$3
            {
                this.__eventId = -790196534;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.PostSyncTaskEvent postSyncTaskEvent) {
                java.lang.Object m17;
                if (com.tencent.mm.plugin.report.service.g0.this.f158183p <= 0 && (m17 = gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_CLOG_SAMPLING_REFRESH_TIME_LONG, null)) != null && (m17 instanceof java.lang.Long)) {
                    com.tencent.mm.plugin.report.service.g0.this.f158183p = ((java.lang.Long) m17).longValue();
                }
                if (!com.tencent.mm.plugin.report.service.g0.this.f158184q && java.lang.System.currentTimeMillis() - com.tencent.mm.plugin.report.service.g0.this.f158183p <= 86400000) {
                    return true;
                }
                gm0.j1.e().k(k0Var, 100L);
                return true;
            }
        }.alive();
        gm0.j1.d().a(701, new com.tencent.mm.plugin.report.service.l0(g0Var, k0Var));
    }
}
