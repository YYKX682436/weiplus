package com.tencent.mm.plugin.wallet.pay.ui;

/* loaded from: classes9.dex */
public class f implements java.util.Comparator {
    public f(com.tencent.mm.plugin.wallet.pay.ui.WalletChangeBankcardUI walletChangeBankcardUI) {
    }

    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard = (com.tencent.mm.plugin.wallet_core.model.Bankcard) obj;
        com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard2 = (com.tencent.mm.plugin.wallet_core.model.Bankcard) obj2;
        if (bankcard.v0()) {
            return -1;
        }
        if (bankcard.D0()) {
            if (!bankcard2.v0()) {
                return -1;
            }
        } else {
            if (com.tencent.mm.sdk.platformtools.t8.S(bankcard.field_forbidWord) < com.tencent.mm.sdk.platformtools.t8.S(bankcard2.field_forbidWord)) {
                return -1;
            }
            if (com.tencent.mm.sdk.platformtools.t8.S(bankcard.field_forbidWord) <= com.tencent.mm.sdk.platformtools.t8.S(bankcard2.field_forbidWord)) {
                return 0;
            }
        }
        return 1;
    }
}
