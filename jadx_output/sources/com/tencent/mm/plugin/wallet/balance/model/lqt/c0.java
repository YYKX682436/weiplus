package com.tencent.mm.plugin.wallet.balance.model.lqt;

/* loaded from: classes8.dex */
public class c0 extends com.tencent.mm.wallet_core.model.e {
    @Override // com.tencent.mm.wallet_core.model.e
    public r45.js5 a() {
        java.lang.String str = (java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_LQT_PLAN_INDEX_CACHE_STRING_SYNC, "");
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return null;
        }
        try {
            return (r45.m85) new r45.m85().parseFrom(str.getBytes(s46.a.f403001a));
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.CgiPlanIndexAsyncLoader", e17, "", new java.lang.Object[0]);
            return null;
        }
    }

    @Override // com.tencent.mm.wallet_core.model.e
    public void b(com.tencent.mm.modelbase.f fVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.CgiPlanIndexAsyncLoader", "errType: %s, errCode: %s", java.lang.Integer.valueOf(fVar.f70616b), java.lang.Integer.valueOf(fVar.f70615a));
        if (fVar.f70615a == 0 && fVar.f70616b == 0) {
            com.tencent.mm.protobuf.f fVar2 = fVar.f70618d;
            if (((r45.m85) fVar2).f380238d == 0) {
                try {
                    gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_LQT_PLAN_INDEX_CACHE_STRING_SYNC, new java.lang.String(((r45.m85) fVar2).toByteArray(), s46.a.f403001a));
                } catch (java.io.IOException e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.CgiPlanIndexAsyncLoader", e17, "", new java.lang.Object[0]);
                }
            }
        }
    }
}
