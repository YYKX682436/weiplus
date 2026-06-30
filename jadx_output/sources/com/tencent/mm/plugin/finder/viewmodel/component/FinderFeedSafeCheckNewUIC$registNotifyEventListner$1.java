package com.tencent.mm.plugin.finder.viewmodel.component;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/tencent/mm/plugin/finder/viewmodel/component/FinderFeedSafeCheckNewUIC$registNotifyEventListner$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/BypCommonBizFinderCheckPreFetchNotifyEvent;", "plugin-finder-base_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderFeedSafeCheckNewUIC$registNotifyEventListner$1 extends com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.BypCommonBizFinderCheckPreFetchNotifyEvent> {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.ye f133566d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderFeedSafeCheckNewUIC$registNotifyEventListner$1(com.tencent.mm.plugin.finder.viewmodel.component.ye yeVar, com.tencent.mm.app.a0 a0Var) {
        super(a0Var);
        this.f133566d = yeVar;
        this.__eventId = -1620974377;
    }

    @Override // com.tencent.mm.sdk.event.IListener
    public boolean callback(com.tencent.mm.autogen.events.BypCommonBizFinderCheckPreFetchNotifyEvent bypCommonBizFinderCheckPreFetchNotifyEvent) {
        com.tencent.mm.autogen.events.BypCommonBizFinderCheckPreFetchNotifyEvent event = bypCommonBizFinderCheckPreFetchNotifyEvent;
        kotlin.jvm.internal.o.g(event, "event");
        com.tencent.mars.xlog.Log.i("FinderFeedSafeCheckUIC", "on BypCommonBizFinderCheckPreFetchNotifyEvent");
        this.f133566d.T6(true);
        return true;
    }
}
