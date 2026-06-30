package com.tencent.mm.plugin.luckymoney.model;

/* loaded from: classes2.dex */
public class h extends com.tencent.mm.wallet_core.model.h1 {
    public h(java.lang.String str, int i17) {
        r45.bo3 bo3Var = new r45.bo3();
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = bo3Var;
        lVar.f70665b = new r45.co3();
        boolean z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_hongbao_envelope_transfer_new_cgi, 1) == 1;
        if (z17) {
            lVar.f70667d = 3857;
            lVar.f70666c = "/cgi-bin/micromsg-bin/getshowsourcenew";
            lVar.f70678o = 1;
        } else {
            lVar.f70667d = 2620;
            lVar.f70666c = "/cgi-bin/mmpay-bin/ftfhb/getshowsource";
            lVar.f70678o = 2;
        }
        bo3Var.f370916d = str;
        bo3Var.f370917e = i17;
        com.tencent.mars.xlog.Log.i("MicroMsg.CgiGetShowSource", "request，isNew: %s，type：%s, lastPageData：%s", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(i17), str);
        p(lVar.a());
    }
}
