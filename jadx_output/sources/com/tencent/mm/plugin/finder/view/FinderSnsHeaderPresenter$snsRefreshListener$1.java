package com.tencent.mm.plugin.finder.view;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/tencent/mm/plugin/finder/view/FinderSnsHeaderPresenter$snsRefreshListener$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/SnsTimelineRefreshEvent;", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class FinderSnsHeaderPresenter$snsRefreshListener$1 extends com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.SnsTimelineRefreshEvent> {
    public FinderSnsHeaderPresenter$snsRefreshListener$1(com.tencent.mm.plugin.finder.view.lk lkVar, com.tencent.mm.app.a0 a0Var) {
        super(a0Var);
        this.__eventId = 899412168;
    }

    @Override // com.tencent.mm.sdk.event.IListener
    public boolean callback(com.tencent.mm.autogen.events.SnsTimelineRefreshEvent snsTimelineRefreshEvent) {
        com.tencent.mm.autogen.events.SnsTimelineRefreshEvent event = snsTimelineRefreshEvent;
        kotlin.jvm.internal.o.g(event, "event");
        if (event.f54844g.f6193a != 1) {
            return false;
        }
        throw null;
    }
}
