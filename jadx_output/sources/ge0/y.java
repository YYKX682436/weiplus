package ge0;

/* loaded from: classes4.dex */
public class y extends com.tencent.mm.app.z2 {
    @Override // com.tencent.mm.app.a3
    public void onAppBackground(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAppBackground", "com.tencent.mm.feature.sns.extension.SnsAppForegroundListener");
        if (gm0.j1.a() && gm0.j1.b().f273254q) {
            gm0.j1.b();
            if (!gm0.m.r()) {
                com.tencent.mm.autogen.events.RemoveSnsTaskEvent removeSnsTaskEvent = new com.tencent.mm.autogen.events.RemoveSnsTaskEvent();
                removeSnsTaskEvent.f54678g.f8031a = 0;
                removeSnsTaskEvent.e();
                new com.tencent.mm.autogen.events.TrigerAdReportEvent().e();
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAppBackground", "com.tencent.mm.feature.sns.extension.SnsAppForegroundListener");
    }

    @Override // com.tencent.mm.app.a3
    public void onAppForeground(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAppForeground", "com.tencent.mm.feature.sns.extension.SnsAppForegroundListener");
        if (gm0.j1.a() && gm0.j1.b().f273254q) {
            gm0.j1.b();
            if (!gm0.m.r()) {
                com.tencent.mm.autogen.events.RemoveSnsTaskEvent removeSnsTaskEvent = new com.tencent.mm.autogen.events.RemoveSnsTaskEvent();
                removeSnsTaskEvent.f54678g.f8031a = 1;
                removeSnsTaskEvent.e();
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAppForeground", "com.tencent.mm.feature.sns.extension.SnsAppForegroundListener");
    }
}
