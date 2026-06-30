package com.tencent.mm.plugin.scanner.model;

/* loaded from: classes15.dex */
public class l0 extends com.tencent.mm.sdk.event.n {
    public l0() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.ProductOperationEvent productOperationEvent = (com.tencent.mm.autogen.events.ProductOperationEvent) iEvent;
        am.to toVar = productOperationEvent.f54626g;
        if (toVar.f8025a == 0) {
            e04.n3 b17 = com.tencent.mm.plugin.scanner.model.k0.b(toVar.f8027c, 0);
            am.to toVar2 = productOperationEvent.f54626g;
            am.uo uoVar = productOperationEvent.f54627h;
            if (b17 == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.ProductOperationListener", "error, xml[%s] can not parse", toVar2.f8027c);
                uoVar.f8118a = false;
            } else {
                uoVar.f8119b = com.tencent.mm.plugin.scanner.model.k0.c(toVar2.f8026b, b17);
                uoVar.f8120c = com.tencent.mm.plugin.scanner.m1.Ai().Di(b17.field_thumburl, "@S");
                uoVar.f8118a = true;
            }
        }
        return false;
    }
}
