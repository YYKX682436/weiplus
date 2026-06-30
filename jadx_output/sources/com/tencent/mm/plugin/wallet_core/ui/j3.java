package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes9.dex */
public class j3 implements java.util.Comparator {
    public j3(com.tencent.mm.plugin.wallet_core.ui.WalletCardSelectUI walletCardSelectUI) {
    }

    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.wallet_core.model.ElementQuery) obj).I - ((com.tencent.mm.plugin.wallet_core.model.ElementQuery) obj2).I;
    }
}
