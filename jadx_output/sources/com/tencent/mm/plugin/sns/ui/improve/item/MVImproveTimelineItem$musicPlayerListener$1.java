package com.tencent.mm.plugin.sns.ui.improve.item;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/tencent/mm/plugin/sns/ui/improve/item/MVImproveTimelineItem$musicPlayerListener$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/MusicPlayerEvent;", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class MVImproveTimelineItem$musicPlayerListener$1 extends com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.MusicPlayerEvent> {
    public MVImproveTimelineItem$musicPlayerListener$1(tc4.n2 n2Var, androidx.lifecycle.y yVar) {
        super(yVar);
        this.__eventId = -1155728636;
    }

    @Override // com.tencent.mm.sdk.event.IListener
    public boolean callback(com.tencent.mm.autogen.events.MusicPlayerEvent musicPlayerEvent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.item.MVImproveTimelineItem$musicPlayerListener$1");
        com.tencent.mm.autogen.events.MusicPlayerEvent event = musicPlayerEvent;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.item.MVImproveTimelineItem$musicPlayerListener$1");
        kotlin.jvm.internal.o.g(event, "event");
        int i17 = event.f54512g.f7036b;
        if (i17 == 0 || i17 == 1 || i17 == 2 || i17 == 3 || i17 == 4 || i17 == 7) {
            int i18 = tc4.n2.f417414x1;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$updatePlayIcon", "com.tencent.mm.plugin.sns.ui.improve.item.MVImproveTimelineItem");
            throw null;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.item.MVImproveTimelineItem$musicPlayerListener$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.item.MVImproveTimelineItem$musicPlayerListener$1");
        return false;
    }
}
