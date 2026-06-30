package com.tencent.mm.plugin.finder.report;

/* loaded from: classes2.dex */
public final class b4 {
    public b4(kotlin.jvm.internal.i iVar) {
    }

    public final void a(r45.qt2 qt2Var, java.util.List extStats) {
        kotlin.jvm.internal.o.g(extStats, "extStats");
        com.tencent.mars.xlog.Log.i("Finder.FinderSingleFeedFlowReporter", "sendExtStatsReport " + extStats.size());
        if (!bq.t.f23523s.a()) {
            gm0.j1.d().g(new db2.g5(qt2Var, 18054, extStats, (java.lang.String) null));
            return;
        }
        i95.m c17 = i95.n0.c(cq.k.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        cq.j1.f((cq.k) c17, qt2Var, 18054, extStats, null);
    }

    public final void b(r45.qt2 qt2Var, r45.jn0 extStats) {
        kotlin.jvm.internal.o.g(extStats, "extStats");
        com.tencent.mars.xlog.Log.i("Finder.FinderSingleFeedFlowReporter", "sendExtStatsReport ".concat(pm0.v.u(extStats.getLong(0))));
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("sendExtStatsReport jumpInfoList=[");
        java.util.LinkedList list = extStats.getList(9);
        kotlin.jvm.internal.o.f(list, "getJumpinfo_report_list(...)");
        sb6.append(kz5.n0.g0(list, null, null, null, 0, null, com.tencent.mm.plugin.finder.report.a4.f124947d, 31, null));
        sb6.append(']');
        com.tencent.mars.xlog.Log.i("Finder.FinderSingleFeedFlowReporter", sb6.toString());
        if (!bq.t.f23523s.a()) {
            gm0.j1.d().g(new db2.g5(qt2Var, 18054, extStats, (java.lang.String) null));
            return;
        }
        i95.m c17 = i95.n0.c(cq.k.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        cq.j1.f((cq.k) c17, qt2Var, 18054, kz5.c0.d(extStats), null);
    }
}
