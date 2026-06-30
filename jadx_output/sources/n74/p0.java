package n74;

/* loaded from: classes.dex */
public final class p0 implements vg3.r4 {
    @Override // vg3.r4
    public void h0(java.lang.String str, java.util.Map values, com.tencent.mm.modelbase.p0 addMsgInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onNewXmlReceived", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdTimelinePushMsgReceiver");
        kotlin.jvm.internal.o.g(values, "values");
        kotlin.jvm.internal.o.g(addMsgInfo, "addMsgInfo");
        try {
            if ("TimelineAdPushMsg".equals(str)) {
                n74.n0.f335399a.a(str, values, addMsgInfo);
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AdPushMsgHandler", "onReceiveMsg exp=" + th6);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onNewXmlReceived", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdTimelinePushMsgReceiver");
    }
}
