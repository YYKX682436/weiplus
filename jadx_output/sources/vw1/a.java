package vw1;

/* loaded from: classes9.dex */
public class a extends com.tencent.mm.sdk.event.n {
    public a() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        tw1.f.Di().f422451d = ((com.tencent.mm.autogen.events.AppActiveEvent) iEvent).f53977g.f7684a;
        return false;
    }
}
