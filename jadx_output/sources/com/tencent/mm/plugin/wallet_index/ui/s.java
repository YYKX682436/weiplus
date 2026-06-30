package com.tencent.mm.plugin.wallet_index.ui;

/* loaded from: classes9.dex */
public class s implements com.tencent.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_index.ui.t f181206d;

    public s(com.tencent.mm.plugin.wallet_index.ui.t tVar) {
        this.f181206d = tVar;
    }

    @Override // com.tencent.mm.ui.xc
    public void mmOnActivityResult(int i17, int i18, android.content.Intent intent) {
        com.tencent.mm.plugin.wallet_index.ui.t tVar = this.f181206d;
        com.tencent.mm.plugin.wallet_index.ui.WalletBrandUI walletBrandUI = tVar.f181208b;
        if (i17 == walletBrandUI.f181087i) {
            walletBrandUI.setResult(i18, intent);
            tVar.f181208b.finish();
        }
    }
}
