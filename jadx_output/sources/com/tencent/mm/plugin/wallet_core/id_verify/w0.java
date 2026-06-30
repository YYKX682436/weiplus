package com.tencent.mm.plugin.wallet_core.id_verify;

/* loaded from: classes9.dex */
public class w0 implements com.tencent.mm.wallet_core.g {
    public w0(com.tencent.mm.plugin.wallet_core.id_verify.WalletRealNameProcessProxyUI walletRealNameProcessProxyUI) {
    }

    @Override // com.tencent.mm.wallet_core.g
    public android.content.Intent onProcessEnd(int i17, android.os.Bundle bundle) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletRealNameProcessProxyUI", "realname end: %s", java.lang.Integer.valueOf(i17));
        return new android.content.Intent();
    }
}
