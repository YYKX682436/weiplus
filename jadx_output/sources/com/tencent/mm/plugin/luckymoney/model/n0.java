package com.tencent.mm.plugin.luckymoney.model;

/* loaded from: classes9.dex */
public class n0 extends com.tencent.mm.wallet_core.model.e {

    /* renamed from: f, reason: collision with root package name */
    public static com.tencent.mm.plugin.luckymoney.model.n0 f145454f;

    public static com.tencent.mm.plugin.luckymoney.model.n0 g() {
        if (f145454f == null) {
            f145454f = new com.tencent.mm.plugin.luckymoney.model.n0();
        }
        return f145454f;
    }

    @Override // com.tencent.mm.wallet_core.model.e
    public void b(com.tencent.mm.modelbase.f fVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.GetShowSourceAsyncLoader", "errType: %s, errCode: %s", java.lang.Integer.valueOf(fVar.f70616b), java.lang.Integer.valueOf(fVar.f70615a));
        if (fVar.f70615a == 0 && fVar.f70616b == 0) {
            com.tencent.mm.protobuf.f fVar2 = fVar.f70618d;
            if (((r45.co3) fVar2).f371703d == 0) {
                try {
                    gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_LUCKY_MONEY_ENVELOPE_SNAPSHOT_STRING_SYNC, new java.lang.String(((r45.co3) fVar2).toByteArray(), s46.a.f403001a));
                } catch (java.io.IOException e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.GetShowSourceAsyncLoader", e17, "", new java.lang.Object[0]);
                }
            }
        }
    }

    @Override // com.tencent.mm.wallet_core.model.e
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public r45.co3 a() {
        java.lang.String str = (java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_LUCKY_MONEY_ENVELOPE_SNAPSHOT_STRING_SYNC, "");
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return null;
        }
        try {
            return (r45.co3) new r45.co3().parseFrom(str.getBytes(s46.a.f403001a));
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.GetShowSourceAsyncLoader", e17, "", new java.lang.Object[0]);
            return null;
        }
    }
}
