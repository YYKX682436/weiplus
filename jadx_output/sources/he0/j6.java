package he0;

/* loaded from: classes4.dex */
public class j6 extends com.tencent.mm.sdk.event.n {
    public j6() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.feature.sns.listener.StatusNotifyFunctionListener");
        com.tencent.mm.autogen.events.StatusNotifyFunctionEvent statusNotifyFunctionEvent = (com.tencent.mm.autogen.events.StatusNotifyFunctionEvent) iEvent;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.feature.sns.listener.StatusNotifyFunctionListener");
        if (gm0.j1.a()) {
            int i17 = statusNotifyFunctionEvent.f54869g.f8612a;
            if (i17 != 9 && i17 == 7) {
                new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper()).post(new he0.i6(this, statusNotifyFunctionEvent));
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.StatusNotifyFunctionListener");
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.StatusNotifyFunctionListener", "StatusNotifyFunctionEvent arrived before account was ready, ignore it.");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.StatusNotifyFunctionListener");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.StatusNotifyFunctionListener");
        return false;
    }
}
