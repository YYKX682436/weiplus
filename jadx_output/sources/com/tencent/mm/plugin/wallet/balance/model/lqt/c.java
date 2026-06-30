package com.tencent.mm.plugin.wallet.balance.model.lqt;

/* loaded from: classes8.dex */
public class c extends com.tencent.mm.modelbase.i {
    public c(r45.dm6 dm6Var) {
        r45.vp4 vp4Var = new r45.vp4();
        vp4Var.f388423f = dm6Var;
        vp4Var.f388421d = (int) java.lang.System.currentTimeMillis();
        vp4Var.f388424g = com.tencent.mm.plugin.wallet.balance.model.lqt.c3.f177624a;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = vp4Var;
        lVar.f70665b = new r45.wp4();
        lVar.f70667d = 1640;
        lVar.f70666c = "/cgi-bin/mmpay-bin/lqtlqautoin/modifytrantime";
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        p(lVar.a());
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = dm6Var != null ? java.lang.Integer.valueOf(dm6Var.f372578d) : "null";
        com.tencent.mars.xlog.Log.i("MicroMsg.CgiLqtAutoChargeModifyTime", "modify time: %s", objArr);
    }
}
