package com.tencent.mm.plugin.wallet.balance.model.lqt;

/* loaded from: classes8.dex */
public class a extends com.tencent.mm.wallet_core.model.h1 {
    public a(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, long j17, int i17, int i18) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.v4();
        lVar.f70665b = new r45.w4();
        lVar.f70667d = 2780;
        lVar.f70666c = "/cgi-bin/mmpay-bin/addplan";
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        r45.v4 v4Var = (r45.v4) a17.f70710a.f70684a;
        v4Var.f387864i = str;
        v4Var.f387860e = str2;
        v4Var.f387861f = str3;
        v4Var.f387862g = str4;
        v4Var.f387859d = j17;
        v4Var.f387863h = i17;
        v4Var.f387865m = i18;
        p(a17);
        com.tencent.mars.xlog.Log.i("MicroMsg.CgiLqtAddPlan", "card_tail: %s, amount: %s, day: %s, planId: %s", str3, java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
    }
}
