package g71;

/* loaded from: classes5.dex */
public class m extends com.tencent.mm.sdk.event.n {
    public m() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.GetSafeDeviceNameEvent getSafeDeviceNameEvent = (com.tencent.mm.autogen.events.GetSafeDeviceNameEvent) iEvent;
        getSafeDeviceNameEvent.f54408h.f7032a = e71.j.a(getSafeDeviceNameEvent.f54407g.f6951a);
        return false;
    }
}
