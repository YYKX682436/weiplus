package g71;

/* loaded from: classes5.dex */
public class s extends com.tencent.mm.sdk.event.n {
    public s() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        am.zz zzVar = ((com.tencent.mm.autogen.events.UpdateLocalVerifySwitchEvent) iEvent).f54920g;
        e71.j.b(zzVar.f8617a, zzVar.f8618b);
        return false;
    }
}
