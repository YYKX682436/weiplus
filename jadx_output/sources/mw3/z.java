package mw3;

/* loaded from: classes9.dex */
public class z extends com.tencent.mm.sdk.event.n {
    public z() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.WalletQueryRemittanceStatusEvent walletQueryRemittanceStatusEvent = (com.tencent.mm.autogen.events.WalletQueryRemittanceStatusEvent) iEvent;
        rw3.c z07 = kw3.p.Ai().Ni().z0(walletQueryRemittanceStatusEvent.f54971g.f8421a);
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletQueryRemittanceStatusEventListener", "find record：%s", walletQueryRemittanceStatusEvent.f54971g.f8421a);
        am.z10 z10Var = walletQueryRemittanceStatusEvent.f54972h;
        if (z07 != null) {
            z10Var.f8505a = z07.field_receiveStatus;
            z10Var.f8506b = z07.field_isSend;
            z10Var.f8507c = z07.field_hasClicked;
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletQueryRemittanceStatusEventListener", "fail：can not find record");
            z10Var.f8505a = -2;
            z10Var.f8506b = false;
            z10Var.f8507c = false;
        }
        return false;
    }
}
