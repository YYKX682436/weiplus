package com.tencent.mm.plugin.luckymoney.model;

/* loaded from: classes2.dex */
public class b extends com.tencent.mm.wallet_core.model.h1 {
    public b(java.lang.String str) {
        r45.f80 f80Var = new r45.f80();
        f80Var.f374084d = str;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = f80Var;
        lVar.f70665b = new r45.g80();
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_hongbao_envelope_transfer_new_cgi, 1) == 1) {
            lVar.f70667d = com.tencent.wxmm.v2helper.EMethodSetCarplayOff;
            lVar.f70666c = "/cgi-bin/micromsg-bin/confirmshowsourcenew";
            lVar.f70678o = 1;
        } else {
            lVar.f70667d = 2968;
            lVar.f70666c = "/cgi-bin/mmpay-bin/ftfhb/confirmshowsource";
            lVar.f70678o = 2;
        }
        p(lVar.a());
    }
}
