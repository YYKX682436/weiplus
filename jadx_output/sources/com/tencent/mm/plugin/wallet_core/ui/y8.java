package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes9.dex */
public class y8 implements com.tencent.mm.wallet_core.ui.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.WalletSetPasswordUI f180815a;

    public y8(com.tencent.mm.plugin.wallet_core.ui.WalletSetPasswordUI walletSetPasswordUI) {
        this.f180815a = walletSetPasswordUI;
    }

    @Override // com.tencent.mm.wallet_core.ui.m
    public void onVisibleStateChange(boolean z17) {
        this.f180815a.f180099g.post(new com.tencent.mm.plugin.wallet_core.ui.x8(this, z17));
    }
}
