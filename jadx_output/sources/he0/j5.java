package he0;

/* loaded from: classes4.dex */
public class j5 extends com.tencent.mm.sdk.event.n {
    public j5() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.feature.sns.listener.ResendSnsByUpdateXmlListener");
        com.tencent.mm.autogen.events.ResendSnsByUpdateXmlEvent resendSnsByUpdateXmlEvent = (com.tencent.mm.autogen.events.ResendSnsByUpdateXmlEvent) iEvent;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.feature.sns.listener.ResendSnsByUpdateXmlListener");
        if (gm0.j1.a()) {
            am.ur urVar = resendSnsByUpdateXmlEvent.f54705g;
            java.util.ArrayList arrayList = urVar.f8128a;
            java.lang.String str = urVar.f8129b;
            com.tencent.mars.xlog.Log.i("MicroMsg.ResendSnsByUpdateXmlListener", "ResendSnsByUpdateXmlEvent, try resend sns");
            com.tencent.mm.sdk.platformtools.u3.h(new he0.i5(this, arrayList, str));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.ResendSnsByUpdateXmlListener");
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.ResendSnsByUpdateXmlListener", "ResendSnsByUpdateXmlEvent arrived before account was ready, ignore it.");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.ResendSnsByUpdateXmlListener");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.ResendSnsByUpdateXmlListener");
        return false;
    }
}
