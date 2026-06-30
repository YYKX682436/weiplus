package on4;

/* loaded from: classes5.dex */
public class l extends com.tencent.mm.sdk.event.n {
    public l() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.TranslateMessageQueryStatusEvent translateMessageQueryStatusEvent = (com.tencent.mm.autogen.events.TranslateMessageQueryStatusEvent) iEvent;
        am.jz jzVar = translateMessageQueryStatusEvent.f54904h;
        ln4.g gVar = (ln4.g) i95.n0.c(ln4.g.class);
        gVar.requireAccountInitialized();
        jzVar.f7107a = gVar.f319908d.f357201e.containsKey(translateMessageQueryStatusEvent.f54903g.f6985a);
        return true;
    }
}
