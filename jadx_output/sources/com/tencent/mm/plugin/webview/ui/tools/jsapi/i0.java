package com.tencent.mm.plugin.webview.ui.tools.jsapi;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/jsapi/i0;", "Lcom/tencent/mm/ipcinvoker/k0;", "Landroid/os/Bundle;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "<init>", "()V", "plugin-webview_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class i0 implements com.tencent.mm.ipcinvoker.k0 {
    @Override // com.tencent.mm.ipcinvoker.k0
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.protobuf.g gVar;
        int i17;
        com.tencent.mm.plugin.luckymoney.model.w2 w2Var = (com.tencent.mm.plugin.luckymoney.model.w2) ((gb3.j) i95.n0.c(gb3.j.class));
        w2Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyEnvelopeLogic", "[triggerDoGetDefaultRedPacketSkinCgi]");
        com.tencent.mm.plugin.luckymoney.model.k0 c17 = com.tencent.mm.plugin.luckymoney.model.m.f145434e.c();
        if (c17 != null) {
            com.tencent.mm.plugin.luckymoney.model.p0 p0Var = c17.f145364d;
            if (p0Var != null && (i17 = p0Var.f145536s) > 0 && i17 > com.tencent.mm.plugin.luckymoney.model.m5.h() / 1000) {
                com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyEnvelopeLogic", "[triggerDoGetDefaultRedPacketSkinCgi] has local cache");
                try {
                    gVar = com.tencent.mm.protobuf.g.b(c17.toByteArray());
                } catch (java.io.IOException e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.LuckyMoneyEnvelopeLogic", "[triggerDoGetDefaultRedPacketSkinCgi] get cache failed :%s", e17.getMessage());
                }
                new com.tencent.mm.plugin.luckymoney.model.e(gVar, 1).l().h(new com.tencent.mm.plugin.luckymoney.model.g2(w2Var));
                return com.tencent.mm.ipcinvoker.type.IPCVoid.f68407d;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyEnvelopeLogic", "[triggerDoGetDefaultRedPacketSkinCgi] local cache expired");
        }
        gVar = null;
        new com.tencent.mm.plugin.luckymoney.model.e(gVar, 1).l().h(new com.tencent.mm.plugin.luckymoney.model.g2(w2Var));
        return com.tencent.mm.ipcinvoker.type.IPCVoid.f68407d;
    }
}
