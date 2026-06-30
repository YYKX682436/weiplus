package nx;

/* loaded from: classes11.dex */
public class a extends com.tencent.mm.sdk.event.n {
    public a() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        r01.q3.nj().p1(((com.tencent.mm.autogen.events.BizPlaceTopChangeEvent) iEvent).f54004g.f8048a);
        return true;
    }
}
