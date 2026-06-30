package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public final class bd {
    public bd(kotlin.jvm.internal.i iVar) {
    }

    public final boolean a(com.tencent.mm.plugin.luckymoney.model.k0 resp) {
        kotlin.jvm.internal.o.g(resp, "resp");
        if (!resp.f145368h) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NewPrepareUIDefualtRedPacketSkinUIC", "[handleResponseAndDoCheckNeedInterrupt] use old logic");
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_LUCKY_MONEY_ENVELOP_PREPARE_INFO_STRING_SYNC, "");
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_LUCKY_MONEY_ENVELOP_PREPARE_INFO_USE_NEW_LOGIC_BOOLEAN_SYNC, java.lang.Boolean.FALSE);
            return true;
        }
        com.tencent.mm.plugin.luckymoney.model.l lVar = com.tencent.mm.plugin.luckymoney.model.m.f145434e;
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_LUCKY_MONEY_ENVELOP_PREPARE_INFO_USE_NEW_LOGIC_BOOLEAN_SYNC, java.lang.Boolean.TRUE);
        if (resp.f145369i) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NewPrepareUIDefualtRedPacketSkinUIC", "[handleResponseAndDoCheckNeedInterrupt] use local cache");
            return true;
        }
        lVar.f(resp);
        return false;
    }
}
