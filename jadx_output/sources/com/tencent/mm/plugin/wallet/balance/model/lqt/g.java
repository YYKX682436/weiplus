package com.tencent.mm.plugin.wallet.balance.model.lqt;

/* loaded from: classes2.dex */
public class g extends com.tencent.mm.modelbase.i {
    public g(long j17, int i17) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.he3();
        lVar.f70665b = new r45.ie3();
        lVar.f70667d = 5075;
        lVar.f70666c = "/cgi-bin/mmpay-bin/getdistributepreview";
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        r45.he3 he3Var = (r45.he3) a17.f70710a.f70684a;
        he3Var.f376090d = j17;
        he3Var.f376091e = i17;
        he3Var.f376092f = com.tencent.mm.plugin.wallet.balance.model.lqt.c3.f177624a;
        p(a17);
        com.tencent.mars.xlog.Log.i("MicroMsg.CgiLqtGetDistributePreview", "init amount: %s, scene: %s", java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i17));
    }
}
