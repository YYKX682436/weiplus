package yc4;

/* loaded from: classes4.dex */
public final class w extends com.tencent.mm.sdk.event.n {
    public w() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4 = "callback";
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.report.Report16242SessionChangeListener");
        com.tencent.mm.autogen.events.SnsSessionChangeEvent event = (com.tencent.mm.autogen.events.SnsSessionChangeEvent) iEvent;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.report.Report16242SessionChangeListener");
        kotlin.jvm.internal.o.g(event, "event");
        am.vw vwVar = event.f54839g;
        if (vwVar != null) {
            java.lang.String str5 = vwVar.f8225b;
            java.lang.String str6 = vwVar.f8224a;
            kotlin.jvm.internal.o.d(str6);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isNewTimeLineActivity", "com.tencent.mm.plugin.sns.ui.improve.report.Report16242SessionChangeListener");
            boolean b17 = kotlin.jvm.internal.o.b("com.tencent.mm.plugin.sns.ui.improve.ImproveSnsTimelineUI", str6);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isNewTimeLineActivity", "com.tencent.mm.plugin.sns.ui.improve.report.Report16242SessionChangeListener");
            if (b17) {
                yc4.b0 b0Var = yc4.b0.f460839a;
                kotlin.jvm.internal.o.d(str5);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("markEnterTimeline", "com.tencent.mm.plugin.sns.ui.improve.report.SnsReportUtil");
                if (str5.length() == 0) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("markEnterTimeline", "com.tencent.mm.plugin.sns.ui.improve.report.SnsReportUtil");
                    str = "callback";
                } else {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("markEnterTimeline old:");
                    yc4.v vVar = yc4.b0.f460840b;
                    sb6.append(vVar != null ? vVar.a() : null);
                    sb6.append(" new:");
                    sb6.append(str5);
                    com.tencent.mars.xlog.Log.i("MicroMsg.SnsReportUtil", sb6.toString());
                    yc4.v vVar2 = yc4.b0.f460840b;
                    if (kotlin.jvm.internal.o.b(vVar2 != null ? vVar2.a() : null, str5)) {
                        str = "callback";
                        str2 = "markEnterTimeline";
                        str3 = "com.tencent.mm.plugin.sns.ui.improve.report.SnsReportUtil";
                    } else {
                        yc4.b0.f460843e.clear();
                        long q17 = com.tencent.mm.sdk.platformtools.o4.J("mmkv_report_16242", gm0.j1.b().h(), 1).q("MicroMsg.SnsReportUtil", 0L);
                        if (q17 <= 0) {
                            q17 = com.tencent.mm.plugin.sns.model.l4.Fj().h2(0L, 1, true);
                        }
                        str2 = "markEnterTimeline";
                        str = "callback";
                        str3 = "com.tencent.mm.plugin.sns.ui.improve.report.SnsReportUtil";
                        yc4.b0.f460840b = new yc4.v(str5, q17, 0, null, null, null, null, 124, null);
                    }
                    yc4.b0.f460842d = yc4.b0.f460840b;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str2, str3);
                }
            } else {
                str = "callback";
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isSnsWsFoldDetailUI", "com.tencent.mm.plugin.sns.ui.improve.report.Report16242SessionChangeListener");
                boolean z17 = kotlin.jvm.internal.o.b("com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDetailUIV3", str6) || kotlin.jvm.internal.o.b("com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI", str6);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isSnsWsFoldDetailUI", "com.tencent.mm.plugin.sns.ui.improve.report.Report16242SessionChangeListener");
                if (z17) {
                    yc4.b0 b0Var2 = yc4.b0.f460839a;
                    kotlin.jvm.internal.o.d(str5);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("markEnterWsDetail", "com.tencent.mm.plugin.sns.ui.improve.report.SnsReportUtil");
                    if (str5.length() == 0) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("markEnterWsDetail", "com.tencent.mm.plugin.sns.ui.improve.report.SnsReportUtil");
                    } else {
                        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("markEnterWsDetail old:");
                        yc4.v vVar3 = yc4.b0.f460841c;
                        sb7.append(vVar3 != null ? vVar3.a() : null);
                        sb7.append(" new:");
                        sb7.append(str5);
                        com.tencent.mars.xlog.Log.i("MicroMsg.SnsReportUtil", sb7.toString());
                        yc4.v vVar4 = yc4.b0.f460841c;
                        if (!kotlin.jvm.internal.o.b(vVar4 != null ? vVar4.a() : null, str5)) {
                            yc4.b0.f460841c = new yc4.v(str5, com.tencent.mm.plugin.sns.model.l4.Fj().h2(0L, 1, true), 0, null, null, null, null, 124, null);
                        }
                        yc4.b0.f460842d = yc4.b0.f460841c;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("markEnterWsDetail", "com.tencent.mm.plugin.sns.ui.improve.report.SnsReportUtil");
                    }
                }
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.Report16242SessionChangeListener", "report16242SessionChangeListener callback, sessionId = " + str5 + ", sessionPageName = " + str6);
            str4 = str;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str4, "com.tencent.mm.plugin.sns.ui.improve.report.Report16242SessionChangeListener");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str4, "com.tencent.mm.plugin.sns.ui.improve.report.Report16242SessionChangeListener");
        return false;
    }
}
