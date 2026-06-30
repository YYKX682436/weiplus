package com.tencent.mm.plugin.textstatus.third;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/tencent/mm/plugin/textstatus/third/LiveSingleton$liveStatusListener$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/FeedUpdateEvent;", "plugin-textstatus_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class LiveSingleton$liveStatusListener$1 extends com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FeedUpdateEvent> {
    public LiveSingleton$liveStatusListener$1(sj4.u0 u0Var, com.tencent.mm.app.a0 a0Var) {
        super(a0Var);
        this.__eventId = 439877283;
    }

    @Override // com.tencent.mm.sdk.event.IListener
    public boolean callback(com.tencent.mm.autogen.events.FeedUpdateEvent feedUpdateEvent) {
        com.tencent.mm.autogen.events.FeedUpdateEvent event = feedUpdateEvent;
        kotlin.jvm.internal.o.g(event, "event");
        pm0.v.X(new sj4.t0(null, event));
        return true;
    }
}
