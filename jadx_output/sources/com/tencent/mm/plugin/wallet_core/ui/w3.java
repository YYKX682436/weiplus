package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes9.dex */
public class w3 implements com.tencent.mm.wallet_core.ui.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.WalletCheckPwdUI f180761a;

    public w3(com.tencent.mm.plugin.wallet_core.ui.WalletCheckPwdUI walletCheckPwdUI) {
        this.f180761a = walletCheckPwdUI;
    }

    @Override // com.tencent.mm.wallet_core.ui.m
    public void onVisibleStateChange(boolean z17) {
        this.f180761a.f179985m.post(new com.tencent.mm.plugin.wallet_core.ui.v3(this, z17));
    }
}
