package com.tencent.mm.plugin.wallet.balance.model.lqt;

/* loaded from: classes8.dex */
public class i extends com.tencent.mm.wallet_core.model.h1 {
    public i(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, long j17, int i18, java.lang.String str4) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.tp4();
        lVar.f70665b = new r45.up4();
        lVar.f70667d = 2614;
        lVar.f70666c = "/cgi-bin/mmpay-bin/modifyplan";
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        r45.tp4 tp4Var = (r45.tp4) a17.f70710a.f70684a;
        tp4Var.f386648d = i17;
        tp4Var.f386649e = str;
        tp4Var.f386650f = str2;
        tp4Var.f386651g = str3;
        tp4Var.f386652h = j17;
        tp4Var.f386653i = i18;
        tp4Var.f386654m = str4;
        p(a17);
        com.tencent.mars.xlog.Log.i("MicroMsg.CgiLqtModifyPlan", "plan_id: %s, card_tail: %s, amount: %s, day: %s", java.lang.Integer.valueOf(i17), str2, java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i18));
    }
}
