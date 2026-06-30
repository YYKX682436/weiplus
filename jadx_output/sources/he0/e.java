package he0;

/* loaded from: classes4.dex */
public class e extends com.tencent.mm.sdk.event.n {
    public e() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.feature.sns.listener.ChattingUIStatusListener");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.feature.sns.listener.ChattingUIStatusListener");
        com.tencent.mm.plugin.sns.model.h6 oj6 = com.tencent.mm.plugin.sns.model.l4.oj();
        boolean z17 = ((com.tencent.mm.autogen.events.ChattingUIStatusEvent) iEvent).f54046g.f7124a;
        oj6.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setIsInChatting", "com.tencent.mm.plugin.sns.model.SnsPreTimelineService");
        oj6.f164239b = z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setIsInChatting", "com.tencent.mm.plugin.sns.model.SnsPreTimelineService");
        com.tencent.mm.plugin.sns.model.h6 oj7 = com.tencent.mm.plugin.sns.model.l4.oj();
        oj7.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isInChatting", "com.tencent.mm.plugin.sns.model.SnsPreTimelineService");
        boolean z18 = oj7.f164239b;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isInChatting", "com.tencent.mm.plugin.sns.model.SnsPreTimelineService");
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUIStatusListener", "set isInChatting:%b", java.lang.Boolean.valueOf(z18));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.ChattingUIStatusListener");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.ChattingUIStatusListener");
        return false;
    }
}
