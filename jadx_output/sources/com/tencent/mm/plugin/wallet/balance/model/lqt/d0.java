package com.tencent.mm.plugin.wallet.balance.model.lqt;

/* loaded from: classes9.dex */
public class d0 extends com.tencent.mm.wallet_core.model.e {
    @Override // com.tencent.mm.wallet_core.model.e
    public r45.js5 a() {
        if (((com.tencent.mm.plugin.wallet.balance.model.lqt.v) this.f213885c).f177726q == 2) {
            return null;
        }
        java.lang.String str = (java.lang.String) ((com.tencent.mm.plugin.wxpay.g) ((j05.f) i95.n0.c(j05.f.class))).wi().i(com.tencent.mm.storage.u3.USERINFO_LQT_PLAN_ADD_CACHE_STRING_SYNC, "");
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return null;
        }
        try {
            return (r45.hb5) new r45.hb5().parseFrom(str.getBytes(s46.a.f403001a));
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.CgiPlanIndexAsyncLoader", e17, "", new java.lang.Object[0]);
            return null;
        }
    }

    @Override // com.tencent.mm.wallet_core.model.e
    public void b(com.tencent.mm.modelbase.f fVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.CgiPlanIndexAsyncLoader", "errType: %s, errCode: %s", java.lang.Integer.valueOf(fVar.f70616b), java.lang.Integer.valueOf(fVar.f70615a));
        if (((com.tencent.mm.plugin.wallet.balance.model.lqt.v) this.f213885c).f177726q != 2 && fVar.f70615a == 0 && fVar.f70616b == 0) {
            com.tencent.mm.protobuf.f fVar2 = fVar.f70618d;
            if (((r45.hb5) fVar2).f376007d == 0) {
                try {
                    ((com.tencent.mm.plugin.wxpay.g) ((j05.f) i95.n0.c(j05.f.class))).wi().j(com.tencent.mm.storage.u3.USERINFO_LQT_PLAN_ADD_CACHE_STRING_SYNC, new java.lang.String(((r45.hb5) fVar2).toByteArray(), s46.a.f403001a));
                } catch (java.io.IOException e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.CgiPlanIndexAsyncLoader", e17, "", new java.lang.Object[0]);
                }
            }
        }
    }
}
