package com.tencent.mm.plugin.luckymoney.model;

/* loaded from: classes9.dex */
public class g2 implements gm5.a {
    public g2(com.tencent.mm.plugin.luckymoney.model.w2 w2Var) {
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyEnvelopeLogic", "[triggerDoGetDefaultRedPacketSkinCgi] resp, errType:%s，cgiBack.errCode：%s", java.lang.Integer.valueOf(fVar.f70615a), java.lang.Integer.valueOf(fVar.f70616b));
        com.tencent.mm.protobuf.f fVar2 = fVar.f70618d;
        if (fVar2 == null) {
            return null;
        }
        if (fVar.f70615a == 0 && fVar.f70616b == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyEnvelopeLogic", "[triggerDoGetDefaultRedPacketSkinCgi] resp，use_new_logic: %s、force_use_local_cache: %s", java.lang.Boolean.valueOf(((com.tencent.mm.plugin.luckymoney.model.k0) fVar2).f145368h), java.lang.Boolean.valueOf(((com.tencent.mm.plugin.luckymoney.model.k0) fVar.f70618d).f145369i));
            com.tencent.mm.plugin.luckymoney.ui.jd.f147056d.a((com.tencent.mm.plugin.luckymoney.model.k0) fVar.f70618d);
        }
        return java.lang.Boolean.TRUE;
    }
}
