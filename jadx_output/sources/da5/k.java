package da5;

/* loaded from: classes11.dex */
public final class k extends com.tencent.mm.sdk.event.n {
    public k() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.ActivateEvent event = (com.tencent.mm.autogen.events.ActivateEvent) iEvent;
        kotlin.jvm.internal.o.g(event, "event");
        if (!event.f53964g.f6412a) {
            return false;
        }
        if (!gm0.j1.a()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.UDRAffCheckerListener", "callback fail. account not ready.");
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.UDRAffCheckerListener", "call udr listener");
        ((ku5.t0) ku5.t0.f312615d).l(new da5.i(this), 2000L, "UDRUpdate");
        ((ku5.t0) ku5.t0.f312615d).h(new da5.j(this), "UDRClean");
        return false;
    }
}
