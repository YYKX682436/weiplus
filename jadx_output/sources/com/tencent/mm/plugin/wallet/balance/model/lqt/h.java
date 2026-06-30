package com.tencent.mm.plugin.wallet.balance.model.lqt;

/* loaded from: classes4.dex */
public class h extends com.tencent.mm.wallet_core.model.h1 {
    public h(int i17, int i18, java.lang.String str) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.gi4();
        lVar.f70665b = new r45.hi4();
        lVar.f70667d = 2507;
        lVar.f70666c = "/cgi-bin/mmpay-bin/manageplan";
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        r45.gi4 gi4Var = (r45.gi4) a17.f70710a.f70684a;
        gi4Var.f375285d = i17;
        gi4Var.f375286e = i18;
        gi4Var.f375287f = str;
        p(a17);
        com.tencent.mars.xlog.Log.i("MicroMsg.CgiLqtManagePlan", "type: %s, planId: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
    }
}
