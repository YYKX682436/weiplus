package com.tencent.mm.plugin.finder.view;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/finder/view/FinderExposeChangedEventListener;", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/FinderExposeInfoChangeEvent;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public abstract class FinderExposeChangedEventListener extends com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FinderExposeInfoChangeEvent> {
    public FinderExposeChangedEventListener() {
        super(com.tencent.mm.app.a0.f53288d);
        this.__eventId = 1962199586;
    }

    public abstract com.tencent.mm.plugin.finder.storage.FinderItem c(long j17);

    @Override // com.tencent.mm.sdk.event.IListener
    public boolean callback(com.tencent.mm.autogen.events.FinderExposeInfoChangeEvent finderExposeInfoChangeEvent) {
        com.tencent.mm.autogen.events.FinderExposeInfoChangeEvent event = finderExposeInfoChangeEvent;
        kotlin.jvm.internal.o.g(event, "event");
        pm0.v.X(new com.tencent.mm.plugin.finder.view.t8(event, this));
        return false;
    }

    /* renamed from: d */
    public abstract java.lang.String getF122661d();

    public abstract void e(long j17, r45.yl2 yl2Var);
}
