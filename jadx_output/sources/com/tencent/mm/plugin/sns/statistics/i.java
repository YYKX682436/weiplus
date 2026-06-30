package com.tencent.mm.plugin.sns.statistics;

/* loaded from: classes4.dex */
public final class i extends com.tencent.mm.sdk.event.n {
    public i() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.statistics.SnsAggressiveCleanEventListener");
        com.tencent.mm.autogen.events.AggressiveCleanCacheEvent event = (com.tencent.mm.autogen.events.AggressiveCleanCacheEvent) iEvent;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.statistics.SnsAggressiveCleanEventListener");
        kotlin.jvm.internal.o.g(event, "event");
        com.tencent.mars.xlog.Log.i("MicroMsg.BackgroundVideoAggressiveCleanEventListener", "aggressiveCleanEventListener: has trigger aggressive clean");
        com.tencent.mm.plugin.sns.statistics.a aVar = com.tencent.mm.plugin.sns.statistics.a.f164826a;
        boolean g17 = aVar.g();
        jm0.i iVar = jm0.k.f300269h;
        if (g17 || aVar.h()) {
            wp4.x xVar = (wp4.x) ((n55.f) i95.n0.c(n55.f.class));
            xVar.getClass();
            if (((zp4.c) iVar.a(zp4.c.class)).Q4() != null) {
                com.tencent.mars.xlog.Log.i(xVar.f448453d, "exist old db need to create new db");
                ((zp4.c) iVar.a(zp4.c.class)).onCleared();
                zp4.e.f474954a.b();
            }
        }
        ((uy0.h) i95.n0.c(uy0.h.class)).getClass();
        if (ez0.o.f257835a.c()) {
            yy0.g8 g8Var = (yy0.g8) ((pp0.o0) i95.n0.c(pp0.o0.class));
            g8Var.getClass();
            if (((iz0.b) iVar.a(iz0.b.class)).Q4() != null) {
                com.tencent.mars.xlog.Log.i(g8Var.f468112d, "exist old db need to create new db");
                ((iz0.b) iVar.a(iz0.b.class)).onCleared();
                iz0.d.f296044a.b();
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.statistics.SnsAggressiveCleanEventListener");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.statistics.SnsAggressiveCleanEventListener");
        return true;
    }
}
