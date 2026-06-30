package com.tencent.mm.plugin.wallet.balance.model.lqt;

/* loaded from: classes9.dex */
public class w extends com.tencent.mm.wallet_core.model.h1 {
    public w(int i17, r45.kd kdVar, int i18, int i19, java.lang.String str) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.pb5();
        lVar.f70665b = new r45.qb5();
        lVar.f70667d = 1324;
        lVar.f70666c = "/cgi-bin/mmpay-bin/preredeemfund";
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        r45.pb5 pb5Var = (r45.pb5) a17.f70710a.f70684a;
        pb5Var.f382924d = i17;
        if (kdVar != null) {
            pb5Var.f382925e = 1;
            pb5Var.f382926f = kdVar;
        } else {
            pb5Var.f382925e = 0;
            pb5Var.f382926f = null;
        }
        pb5Var.f382927g = i18;
        pb5Var.f382928h = i19;
        pb5Var.f382929i = str;
        pb5Var.f382930m = com.tencent.mm.plugin.wallet.balance.model.lqt.c3.f177624a;
        p(a17);
    }
}
