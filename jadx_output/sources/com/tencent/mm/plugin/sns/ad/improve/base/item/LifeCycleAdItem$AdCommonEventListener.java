package com.tencent.mm.plugin.sns.ad.improve.base.item;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"com/tencent/mm/plugin/sns/ad/improve/base/item/LifeCycleAdItem$AdCommonEventListener", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/SnsAdCommonEvent;", "Lcom/tencent/mm/plugin/sns/ad/improve/base/item/b;", "baseItem", "Landroidx/lifecycle/y;", "lifecycleOwner", "<init>", "(Lcom/tencent/mm/plugin/sns/ad/improve/base/item/b;Landroidx/lifecycle/y;)V", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class LifeCycleAdItem$AdCommonEventListener extends com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.SnsAdCommonEvent> {
    public LifeCycleAdItem$AdCommonEventListener(com.tencent.mm.plugin.sns.ad.improve.base.item.b baseItem, androidx.lifecycle.y yVar) {
        kotlin.jvm.internal.o.g(baseItem, "baseItem");
        throw null;
    }

    @Override // com.tencent.mm.sdk.event.IListener
    public boolean callback(com.tencent.mm.autogen.events.SnsAdCommonEvent snsAdCommonEvent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ad.improve.base.item.LifeCycleAdItem$AdCommonEventListener");
        com.tencent.mm.autogen.events.SnsAdCommonEvent event = snsAdCommonEvent;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ad.improve.base.item.LifeCycleAdItem$AdCommonEventListener");
        kotlin.jvm.internal.o.g(event, "event");
        throw null;
    }
}
