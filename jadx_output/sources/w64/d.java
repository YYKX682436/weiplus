package w64;

/* loaded from: classes4.dex */
public class d implements w64.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w64.n f443292a;

    public d(w64.n nVar) {
        this.f443292a = nVar;
    }

    @Override // w64.k
    public void a(com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo adClickActionInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onUIStateChange", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
        w64.n nVar = this.f443292a;
        w64.k kVar = nVar.f443317j;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
        if (kVar != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
            w64.k kVar2 = nVar.f443317j;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
            kVar2.a(adClickActionInfo);
        }
        if (adClickActionInfo != null && adClickActionInfo.f162571b == 2) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("publishEvent", "com.tencent.mm.plugin.sns.ad.improve.helper.AdCommonEventUtil");
            com.tencent.mm.autogen.events.SnsAdCommonEvent snsAdCommonEvent = new com.tencent.mm.autogen.events.SnsAdCommonEvent();
            snsAdCommonEvent.f54788g.f8325b = 3;
            snsAdCommonEvent.e();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("publishEvent", "com.tencent.mm.plugin.sns.ad.improve.helper.AdCommonEventUtil");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onUIStateChange", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler$1");
    }
}
