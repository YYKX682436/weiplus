package com.tencent.mm.plugin.wallet.balance.model.lqt;

/* loaded from: classes2.dex */
public class v extends com.tencent.mm.wallet_core.model.h1 {

    /* renamed from: q, reason: collision with root package name */
    public final int f177726q;

    public v(int i17, int i18) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.gb5();
        lVar.f70665b = new r45.hb5();
        lVar.f70667d = 1770;
        lVar.f70666c = "/cgi-bin/mmpay-bin/preaddplan";
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        r45.gb5 gb5Var = (r45.gb5) a17.f70710a.f70684a;
        gb5Var.f375072d = i17;
        gb5Var.f375073e = i18;
        p(a17);
        this.f177726q = i17;
        com.tencent.mars.xlog.Log.i("MicroMsg.CgiLqtPreAddPlan", "scene: %s, planId: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
    }
}
