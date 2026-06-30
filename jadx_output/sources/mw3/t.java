package mw3;

/* loaded from: classes9.dex */
public class t extends com.tencent.mm.sdk.event.n {
    public t() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.ReceiveTransferAppMsgEvent receiveTransferAppMsgEvent = (com.tencent.mm.autogen.events.ReceiveTransferAppMsgEvent) iEvent;
        kw3.p Ai = kw3.p.Ai();
        Ai.getClass();
        java.lang.Long valueOf = java.lang.Long.valueOf(receiveTransferAppMsgEvent.f54656g.f8395b);
        am.xp xpVar = receiveTransferAppMsgEvent.f54656g;
        com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreRemittance", "do insert transfer record: %s, %s", valueOf, xpVar.f8394a);
        ot0.q qVar = xpVar.f8397d;
        if (qVar != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreRemittance", "do insert transfer paysubtype: %s", java.lang.Integer.valueOf(qVar.I0));
            int i17 = xpVar.f8397d.I0;
            if (i17 == 5 || i17 == 25) {
                rw3.a aVar = new rw3.a();
                aVar.field_msgId = xpVar.f8395b;
                aVar.field_transferId = xpVar.f8394a;
                kw3.p.Ai().Bi().insert(aVar);
            }
            com.tencent.mm.storage.f9 Li = pt0.f0.Li(xpVar.f8396c, xpVar.f8395b);
            rw3.c y07 = Ai.Ni().y0(xpVar.f8394a);
            if (y07 != null) {
                y07.field_receiveStatus = xpVar.f8397d.I0;
                Ai.Ni().replace(y07);
                if (!Li.Q0().equals(c01.z1.r())) {
                    Ai.Vi(Li.Q0(), Li, null);
                }
            } else if (!Li.Q0().equals(c01.z1.r())) {
                rw3.c cVar = new rw3.c();
                cVar.field_locaMsgId = xpVar.f8395b;
                ot0.q qVar2 = xpVar.f8397d;
                cVar.field_transferId = qVar2.L0;
                cVar.field_receiveStatus = qVar2.I0;
                cVar.field_isSend = false;
                cVar.field_talker = Li.Q0();
                cVar.field_invalidtime = xpVar.f8397d.M0;
                cVar.field_receiveTime = Li.getCreateTime();
                ot0.q v17 = ot0.q.v(Li.j());
                if (v17 != null) {
                    cVar.field_receiverName = ((ot0.n) v17.y(ot0.n.class)).f348594c;
                }
                Ai.Ni().replace(cVar);
                Ai.Vi(Li.Q0(), Li, null);
            }
        }
        return false;
    }
}
