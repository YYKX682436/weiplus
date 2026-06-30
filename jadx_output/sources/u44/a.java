package u44;

/* loaded from: classes4.dex */
public abstract class a {
    public static final void a(int i17, long j17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("publishEvent", "com.tencent.mm.plugin.sns.ad.improve.helper.AdCommonEventUtil");
        com.tencent.mm.autogen.events.SnsAdCommonEvent snsAdCommonEvent = new com.tencent.mm.autogen.events.SnsAdCommonEvent();
        am.wu wuVar = snsAdCommonEvent.f54788g;
        wuVar.f8325b = i17;
        wuVar.getClass();
        wuVar.f8324a = j17;
        wuVar.getClass();
        wuVar.getClass();
        wuVar.getClass();
        snsAdCommonEvent.e();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("publishEvent", "com.tencent.mm.plugin.sns.ad.improve.helper.AdCommonEventUtil");
    }
}
