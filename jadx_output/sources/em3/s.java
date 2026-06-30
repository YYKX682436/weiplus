package em3;

/* loaded from: classes.dex */
public final class s extends com.tencent.mm.sdk.event.n {
    public s() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.MusicPlayerEvent event = (com.tencent.mm.autogen.events.MusicPlayerEvent) iEvent;
        kotlin.jvm.internal.o.g(event, "event");
        int i17 = event.f54512g.f7036b;
        dm3.v.f241743f = i17 != 2 ? i17 != 3 ? 0 : 1 : 2;
        return false;
    }
}
