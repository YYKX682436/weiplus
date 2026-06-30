package em3;

/* loaded from: classes.dex */
public final class q extends com.tencent.mm.sdk.event.n {
    public q() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.MusicPlayerEvent event = (com.tencent.mm.autogen.events.MusicPlayerEvent) iEvent;
        kotlin.jvm.internal.o.g(event, "event");
        if (event.f54512g.f7036b != 2) {
            return false;
        }
        fm3.y.f264162b.clear();
        fm3.y.f264163c.clear();
        return false;
    }
}
