package pd0;

/* loaded from: classes8.dex */
public class j1 extends com.tencent.mm.sdk.event.n {
    public j1() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        if (((com.tencent.mm.autogen.events.ActivateEvent) iEvent).f53964g.f6412a) {
            return false;
        }
        ((ku5.t0) ku5.t0.f312615d).h(new od0.p(), "SIRWorker");
        return false;
    }
}
