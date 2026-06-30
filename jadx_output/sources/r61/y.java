package r61;

/* loaded from: classes11.dex */
public class y extends com.tencent.mm.sdk.event.n {
    public y() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.FMessageMobileFilterEvent fMessageMobileFilterEvent = (com.tencent.mm.autogen.events.FMessageMobileFilterEvent) iEvent;
        if (fMessageMobileFilterEvent instanceof com.tencent.mm.autogen.events.FMessageMobileFilterEvent) {
            fMessageMobileFilterEvent.f54228h.f7136a = true;
            am.j9 j9Var = fMessageMobileFilterEvent.f54227g;
            boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(r61.q0.f(j9Var.f7016a));
            am.k9 k9Var = fMessageMobileFilterEvent.f54228h;
            if (!K0) {
                k9Var.f7136a = false;
            } else if (com.tencent.mm.sdk.platformtools.t8.K0(r61.q0.f(j9Var.f7017b))) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FMessageMobileFilterListenerImpl", "mobile fmessage not found by phonemd5 or fullphonemd5");
            } else {
                k9Var.f7136a = false;
            }
        }
        return false;
    }
}
