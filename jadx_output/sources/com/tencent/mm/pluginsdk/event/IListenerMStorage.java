package com.tencent.mm.pluginsdk.event;

/* loaded from: classes8.dex */
public abstract class IListenerMStorage extends com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.MStorageNotifyEvent> {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f188695d;

    public IListenerMStorage() {
        super(com.tencent.mm.app.a0.f53288d);
        this.f188695d = new java.util.ArrayList(3);
        this.__eventId = -400127373;
    }

    public static void d(java.lang.String str, com.tencent.mm.pluginsdk.event.IListenerMStorage iListenerMStorage) {
        if (!iListenerMStorage.f188695d.contains(str)) {
            iListenerMStorage.f188695d.add(str);
        }
        iListenerMStorage.alive();
        com.tencent.mm.autogen.events.SwitcherEvent switcherEvent = new com.tencent.mm.autogen.events.SwitcherEvent();
        am.fy fyVar = switcherEvent.f54874g;
        fyVar.f6712a = 1;
        fyVar.f6713b = str;
        switcherEvent.e();
    }

    public static void e(java.lang.String str, com.tencent.mm.pluginsdk.event.IListenerMStorage iListenerMStorage) {
        com.tencent.mm.autogen.events.SwitcherEvent switcherEvent = new com.tencent.mm.autogen.events.SwitcherEvent();
        am.fy fyVar = switcherEvent.f54874g;
        fyVar.f6712a = 2;
        fyVar.f6713b = str;
        switcherEvent.e();
        iListenerMStorage.dead();
        java.util.ArrayList arrayList = iListenerMStorage.f188695d;
        if (arrayList.contains(str)) {
            arrayList.remove(str);
        }
    }

    public abstract void c(com.tencent.mm.sdk.event.IEvent iEvent);

    @Override // com.tencent.mm.sdk.event.IListener
    public boolean callback(com.tencent.mm.autogen.events.MStorageNotifyEvent mStorageNotifyEvent) {
        com.tencent.mm.sdk.event.IEvent iEvent;
        com.tencent.mm.autogen.events.MStorageNotifyEvent mStorageNotifyEvent2 = mStorageNotifyEvent;
        if (!(mStorageNotifyEvent2 instanceof com.tencent.mm.autogen.events.MStorageNotifyEvent) || (iEvent = mStorageNotifyEvent2.f54489g.f7351a) == null || !this.f188695d.contains(iEvent.getClass().getName())) {
            return false;
        }
        c(mStorageNotifyEvent2.f54489g.f7351a);
        return false;
    }
}
