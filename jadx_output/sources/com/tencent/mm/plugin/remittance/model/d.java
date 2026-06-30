package com.tencent.mm.plugin.remittance.model;

/* loaded from: classes4.dex */
public class d extends com.tencent.mm.wallet_core.model.h1 {
    public d(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        r45.ux uxVar = new r45.ux();
        uxVar.f387710d = str;
        uxVar.f387711e = str2;
        uxVar.f387712f = str3;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = uxVar;
        lVar.f70665b = new r45.vx();
        lVar.f70667d = 4969;
        lVar.f70666c = "/cgi-bin/mmpay-bin/recalltransfer";
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        p(lVar.a());
        com.tencent.mars.xlog.Log.i("MicroMsg.CgiTransferRecall", "recall: %s, %s, %s", str, str2, str3);
    }
}
