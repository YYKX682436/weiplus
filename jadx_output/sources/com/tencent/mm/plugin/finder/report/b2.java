package com.tencent.mm.plugin.finder.report;

/* loaded from: classes10.dex */
public final class b2 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.report.b2 f124965a = new com.tencent.mm.plugin.finder.report.b2();

    public final void a(com.tencent.mm.plugin.finder.report.y1 op6) {
        int i17;
        kotlin.jvm.internal.o.g(op6, "op");
        com.tencent.mm.autogen.mmdata.rpt.FinderMultiTaskEnterStruct finderMultiTaskEnterStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderMultiTaskEnterStruct();
        int i18 = op6.f125465d;
        finderMultiTaskEnterStruct.f57442d = i18;
        finderMultiTaskEnterStruct.f57443e = finderMultiTaskEnterStruct.b("opDesc", op6.f125466e, true);
        finderMultiTaskEnterStruct.k();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("report23850: type = ");
        sb6.append(i18);
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        sb6.append("");
        com.tencent.mars.xlog.Log.i("FinderMultiTaskReporter", sb6.toString());
        if (op6 == com.tencent.mm.plugin.finder.report.y1.f125459s) {
            long t17 = gm0.j1.u().c().t(com.tencent.mm.storage.u3.USERINFO_FINDER_BACKGROUND_TIMESTAMP_LONG_SYNC, 0L);
            if (t17 != 0) {
                long c17 = c01.id.c() - t17;
                i95.m c18 = i95.n0.c(zy2.c9.class);
                com.tencent.mm.plugin.finder.service.l3 l3Var = c18 instanceof com.tencent.mm.plugin.finder.service.l3 ? (com.tencent.mm.plugin.finder.service.l3) c18 : null;
                if (l3Var != null) {
                    java.util.Set enterFinderActivity = l3Var.f126133s;
                    kotlin.jvm.internal.o.f(enterFinderActivity, "enterFinderActivity");
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    for (java.lang.Object obj : enterFinderActivity) {
                        androidx.appcompat.app.AppCompatActivity appCompatActivity = (androidx.appcompat.app.AppCompatActivity) obj;
                        kotlin.jvm.internal.o.d(appCompatActivity);
                        if (l3Var.Di(appCompatActivity)) {
                            arrayList.add(obj);
                        }
                    }
                    i17 = arrayList.size();
                } else {
                    i17 = 0;
                }
                com.tencent.mm.autogen.mmdata.rpt.FinderGlobalLoadingRptStruct finderGlobalLoadingRptStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderGlobalLoadingRptStruct();
                finderGlobalLoadingRptStruct.f56921d = 10L;
                finderGlobalLoadingRptStruct.f56922e = 10L;
                finderGlobalLoadingRptStruct.f56925h = finderGlobalLoadingRptStruct.b("majorData", java.lang.String.valueOf(c17), true);
                cl0.g gVar = new cl0.g();
                gVar.p("exitToReenterMultiTaskTime", c17);
                gVar.o("enterFinderTaskUISize", i17);
                java.lang.String gVar2 = gVar.toString();
                kotlin.jvm.internal.o.f(gVar2, "toString(...)");
                finderGlobalLoadingRptStruct.f56923f = finderGlobalLoadingRptStruct.b(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, r26.i0.t(gVar2, ",", ";", false), true);
                finderGlobalLoadingRptStruct.k();
                com.tencent.mars.xlog.Log.i("FinderMultiTaskReporter", "report21680 reportEnterMultiTask:" + finderGlobalLoadingRptStruct.n());
            }
        }
        switch (op6.ordinal()) {
            case 0:
                com.tencent.mm.plugin.report.service.g0.INSTANCE.B(1767L, 3L);
                return;
            case 1:
                com.tencent.mm.plugin.report.service.g0.INSTANCE.B(1767L, 0L);
                return;
            case 2:
                com.tencent.mm.plugin.report.service.g0.INSTANCE.B(1767L, 2L);
                return;
            case 3:
                com.tencent.mm.plugin.report.service.g0.INSTANCE.B(1767L, 1L);
                return;
            case 4:
                com.tencent.mm.plugin.report.service.g0.INSTANCE.B(1767L, 4L);
                return;
            case 5:
                com.tencent.mm.plugin.report.service.g0.INSTANCE.B(1767L, 5L);
                return;
            case 6:
                com.tencent.mm.plugin.report.service.g0.INSTANCE.B(1767L, 6L);
                return;
            case 7:
                com.tencent.mm.plugin.report.service.g0.INSTANCE.B(1767L, 7L);
                return;
            case 8:
                com.tencent.mm.plugin.report.service.g0.INSTANCE.B(1767L, 8L);
                return;
            case 9:
                com.tencent.mm.plugin.report.service.g0.INSTANCE.B(1767L, 101L);
                return;
            case 10:
                com.tencent.mm.plugin.report.service.g0.INSTANCE.B(1767L, 102L);
                return;
            case 11:
                com.tencent.mm.plugin.report.service.g0.INSTANCE.B(1767L, 103L);
                return;
            case 12:
                com.tencent.mm.plugin.report.service.g0.INSTANCE.B(1767L, 104L);
                return;
            case 13:
                com.tencent.mm.plugin.report.service.g0.INSTANCE.B(1767L, 105L);
                return;
            case 14:
                com.tencent.mm.plugin.report.service.g0.INSTANCE.B(1767L, 106L);
                return;
            default:
                return;
        }
    }
}
