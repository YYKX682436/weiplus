package com.tencent.mm.pluginsdk.event;

/* loaded from: classes11.dex */
public abstract class IListenerNetScene extends com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.NetSceneResponseEvent> {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f188696d;

    public IListenerNetScene(int i17) {
        super(com.tencent.mm.app.a0.f53288d, i17);
        this.f188696d = new java.util.ArrayList(3);
        this.__eventId = 949432826;
    }

    public abstract void c(int i17, int i18, java.lang.String str, com.tencent.mm.sdk.event.IEvent iEvent);

    @Override // com.tencent.mm.sdk.event.IListener
    public boolean callback(com.tencent.mm.autogen.events.NetSceneResponseEvent netSceneResponseEvent) {
        com.tencent.mm.sdk.event.IEvent iEvent;
        com.tencent.mm.autogen.events.NetSceneResponseEvent netSceneResponseEvent2 = netSceneResponseEvent;
        if (!(netSceneResponseEvent2 instanceof com.tencent.mm.autogen.events.NetSceneResponseEvent) || (iEvent = netSceneResponseEvent2.f54525g.f8295d) == null || !this.f188696d.contains(iEvent.getClass().getName())) {
            return false;
        }
        am.wk wkVar = netSceneResponseEvent2.f54525g;
        c(wkVar.f8292a, wkVar.f8293b, wkVar.f8294c, wkVar.f8295d);
        return false;
    }
}
