package com.tencent.mm.plugin.mall.ui;

/* loaded from: classes2.dex */
public class q2 implements gm5.a {
    public q2(com.tencent.mm.plugin.mall.ui.MallWalletSectionCellView mallWalletSectionCellView) {
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.MallWalletSectionCellView", "lqtOnClickRedDotReq end, errType: %s, errCode: %s", java.lang.Integer.valueOf(fVar.f70615a), java.lang.Integer.valueOf(fVar.f70616b));
        if (fVar.f70615a != 0 || fVar.f70616b != 0) {
            return null;
        }
        com.tencent.mm.plugin.wallet.balance.model.lqt.c3.c(((r45.py4) fVar.f70618d).f383480f);
        return null;
    }
}
