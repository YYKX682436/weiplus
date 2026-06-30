package h55;

/* loaded from: classes8.dex */
public final class o extends com.tencent.mm.sdk.event.n {
    public o() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.OnStartPageLifecycleMonitorEvent event = (com.tencent.mm.autogen.events.OnStartPageLifecycleMonitorEvent) iEvent;
        kotlin.jvm.internal.o.g(event, "event");
        i55.n nVar = i55.n.f288865a;
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = vp1.b.f438883a;
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList2 = vp1.b.f438883a;
        if (!copyOnWriteArrayList2.contains(nVar)) {
            copyOnWriteArrayList2.add(nVar);
        }
        vp1.i iVar = vp1.i.f438889a;
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList3 = vp1.i.f438897i;
        if (!copyOnWriteArrayList3.contains(nVar)) {
            copyOnWriteArrayList3.add(nVar);
        }
        e55.m.f249681a.m();
        return false;
    }
}
