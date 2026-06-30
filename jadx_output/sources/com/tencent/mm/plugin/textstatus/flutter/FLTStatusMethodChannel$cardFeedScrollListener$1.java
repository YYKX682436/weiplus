package com.tencent.mm.plugin.textstatus.flutter;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/tencent/mm/plugin/textstatus/flutter/FLTStatusMethodChannel$cardFeedScrollListener$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/StatusCardFeedItemScrollEvent;", "plugin-textstatus_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class FLTStatusMethodChannel$cardFeedScrollListener$1 extends com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.StatusCardFeedItemScrollEvent> {
    public FLTStatusMethodChannel$cardFeedScrollListener$1(yi4.a aVar, com.tencent.mm.app.a0 a0Var) {
        super(a0Var);
        this.__eventId = 484873098;
    }

    @Override // com.tencent.mm.sdk.event.IListener
    public boolean callback(com.tencent.mm.autogen.events.StatusCardFeedItemScrollEvent statusCardFeedItemScrollEvent) {
        com.tencent.mm.autogen.events.StatusCardFeedItemScrollEvent event = statusCardFeedItemScrollEvent;
        kotlin.jvm.internal.o.g(event, "event");
        am.ux uxVar = event.f54864g;
        com.tencent.mars.xlog.Log.i("MicroMsg.FLTStatusMethodChannel", "StatusCardFeedItemScrollEvent " + uxVar.f8142b + " username:" + uxVar.f8141a);
        throw null;
    }
}
