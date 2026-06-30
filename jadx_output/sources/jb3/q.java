package jb3;

/* loaded from: classes9.dex */
public class q extends com.tencent.mm.sdk.event.n {
    public q() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.WalletReceiveLuckyMoneyAppMsgEvent walletReceiveLuckyMoneyAppMsgEvent = (com.tencent.mm.autogen.events.WalletReceiveLuckyMoneyAppMsgEvent) iEvent;
        hb3.o Ni = hb3.o.Ni();
        Ni.getClass();
        if (!com.tencent.mm.sdk.platformtools.t8.K0(walletReceiveLuckyMoneyAppMsgEvent.f54975g.f6304a)) {
            am.c20 c20Var = walletReceiveLuckyMoneyAppMsgEvent.f54975g;
            ot0.q v17 = ot0.q.v(c20Var.f6304a);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(v17.f348704r1)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreLuckyMoney", "receiver：get new xml from server: %s", v17.f348704r1);
                java.lang.String str = v17.f348704r1;
                java.lang.String str2 = "";
                if (str == null) {
                    str = "";
                }
                try {
                    str2 = android.net.Uri.parse(str).getQueryParameter("sendid");
                } catch (java.lang.Exception unused) {
                }
                ot0.c cVar = (ot0.c) v17.y(ot0.c.class);
                at4.k1 z07 = ((pg0.a3) i95.n0.c(pg0.a3.class)).Vi().z0(v17.f348704r1);
                if (z07 == null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreLuckyMoney", "receiver：luckyMoneyItem == null, create Item");
                    z07 = new at4.k1();
                }
                if (com.tencent.mm.sdk.platformtools.t8.K0(z07.field_mNativeUrl)) {
                    z07.field_mNativeUrl = v17.f348704r1;
                    z07.field_receiveStatus = 0;
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(cVar.f348421n)) {
                        z07.field_hbType = 3;
                        z07.field_exclusiveUsername = cVar.f348421n;
                    }
                    z07.field_invalidtime = v17.M0;
                    z07.field_sender = c20Var.f6305b;
                    z07.field_sendId = str2;
                    z07.field_msgSvrId = c20Var.f6306c;
                }
                ((pg0.a3) i95.n0.c(pg0.a3.class)).Vi().replace(z07);
                if (z07.field_hbType == 3 && c01.z1.r().equals(z07.field_exclusiveUsername)) {
                    Ni.cj(c20Var.f6305b, true);
                }
                dc3.e eVar = new dc3.e();
                eVar.field_send_id = str2;
                if (!Ni.Ri().get(eVar, new java.lang.String[0])) {
                    eVar.field_open_count = 0;
                    Ni.Ri().insert(eVar);
                }
            }
        }
        return false;
    }
}
