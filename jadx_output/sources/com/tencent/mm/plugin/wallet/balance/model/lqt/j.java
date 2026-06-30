package com.tencent.mm.plugin.wallet.balance.model.lqt;

/* loaded from: classes4.dex */
public class j extends com.tencent.mm.wallet_core.model.h1 {
    public j(int i17, int i18) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.my4();
        lVar.f70665b = new r45.ny4();
        lVar.f70667d = 2585;
        lVar.f70666c = "/cgi-bin/mmpay-bin/onclickpurchase";
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        r45.my4 my4Var = (r45.my4) a17.f70710a.f70684a;
        my4Var.f380924d = i17;
        my4Var.f380925e = i18;
        my4Var.f380929i = com.tencent.mm.plugin.wallet.balance.model.lqt.c3.f177624a;
        p(a17);
    }

    public j(int i17, int i18, long j17) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.my4();
        lVar.f70665b = new r45.ny4();
        lVar.f70667d = 2585;
        lVar.f70666c = "/cgi-bin/mmpay-bin/onclickpurchase";
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        r45.my4 my4Var = (r45.my4) a17.f70710a.f70684a;
        my4Var.f380924d = i17;
        my4Var.f380925e = i18;
        my4Var.f380929i = com.tencent.mm.plugin.wallet.balance.model.lqt.c3.f177624a;
        if (j17 > 0) {
            my4Var.f380928h = j17;
        }
        p(a17);
    }
}
