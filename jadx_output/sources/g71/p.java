package g71;

/* loaded from: classes5.dex */
public class p extends com.tencent.mm.sdk.event.n {
    public p() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        ((com.tencent.mm.autogen.events.GetSafeDeviceTypeEvent) iEvent).f54409g.f7148a = android.os.Build.MANUFACTURER + "-" + wo.w0.m();
        return false;
    }
}
