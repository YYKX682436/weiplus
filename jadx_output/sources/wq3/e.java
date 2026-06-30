package wq3;

/* loaded from: classes15.dex */
public class e extends com.tencent.mm.sdk.event.n {
    public e() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.ProductOperationEvent productOperationEvent = (com.tencent.mm.autogen.events.ProductOperationEvent) iEvent;
        if (productOperationEvent.f54626g.f8025a == 1) {
            wq3.j Ai = vq3.e.wi().Ai();
            am.to toVar = productOperationEvent.f54626g;
            am.uo uoVar = productOperationEvent.f54627h;
            if (Ai == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.MallProductListener", "error, xml[%s] can not parse", toVar.f8027c);
                uoVar.f8118a = false;
            } else {
                wq3.t c17 = wq3.t.c(null, toVar.f8027c);
                Ai.u(c17, null);
                uoVar.f8119b = Ai.p();
                uoVar.f8120c = com.tencent.mm.sdk.platformtools.t8.K0(c17.a()) ? null : com.tencent.mm.plugin.product.ui.o.m(c17.a());
                uoVar.f8118a = true;
            }
        }
        return false;
    }
}
