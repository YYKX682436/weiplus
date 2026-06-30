package z62;

/* loaded from: classes4.dex */
public class b0 extends com.tencent.mm.sdk.event.n {
    public b0() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        ((ku5.t0) ku5.t0.f312615d).B(new z62.a0(this, (com.tencent.mm.autogen.events.SnsBehaviorNotifyFinderEvent) iEvent));
        return false;
    }
}
