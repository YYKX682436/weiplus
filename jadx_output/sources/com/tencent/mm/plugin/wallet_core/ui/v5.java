package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes2.dex */
public class v5 implements gm5.a {
    public v5(com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoNewUI walletOrderInfoNewUI) {
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletOrderInfoNewUI", "errType: %s, errCode: %s", java.lang.Integer.valueOf(fVar.f70615a), java.lang.Integer.valueOf(fVar.f70616b));
        if (fVar.f70615a != 0 || fVar.f70616b != 0) {
            return null;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletOrderInfoNewUI", "retCode: %s, retMsg: %s", java.lang.Integer.valueOf(((r45.i43) fVar.f70618d).f376719d), ((r45.i43) fVar.f70618d).f376720e);
        return null;
    }
}
