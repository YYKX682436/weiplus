package vr4;

/* loaded from: classes9.dex */
public final class x0 extends com.tencent.mm.sdk.event.n {
    public x0() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.ReceiveCommonPayAppMsgEvent event = (com.tencent.mm.autogen.events.ReceiveCommonPayAppMsgEvent) iEvent;
        kotlin.jvm.internal.o.g(event, "event");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("ReceiveCommonPayAppMsgEvent: ");
        am.tp tpVar = event.f54652g;
        sb6.append(tpVar.f8029b);
        sb6.append(", ");
        sb6.append(tpVar.f8028a);
        com.tencent.mars.xlog.Log.i("MicroMsg.ReceiveCommonPayAppMsgEventListener", sb6.toString());
        if (!com.tencent.mm.sdk.platformtools.t8.K0(tpVar.f8029b) && tpVar.f8028a >= 0) {
            try {
                jz5.g gVar = rb3.g.f393858a;
                com.tencent.wcdb.core.Table table = (com.tencent.wcdb.core.Table) ((jz5.n) rb3.g.f393860c).getValue();
                up5.a0 a0Var = new up5.a0();
                a0Var.f429888a = tpVar.f8029b;
                a0Var.f429889b = java.lang.Long.valueOf(tpVar.f8028a);
                a0Var.f429890c = tpVar.f8030c;
                table.insertOrReplaceObject(a0Var);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ReceiveCommonPayAppMsgEventListener", e17, "", new java.lang.Object[0]);
            }
        }
        return false;
    }
}
