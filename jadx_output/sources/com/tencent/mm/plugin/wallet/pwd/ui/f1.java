package com.tencent.mm.plugin.wallet.pwd.ui;

/* loaded from: classes9.dex */
public class f1 implements com.tencent.mm.wallet_core.ui.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.pwd.ui.WalletLockCheckPwdUI f178998a;

    public f1(com.tencent.mm.plugin.wallet.pwd.ui.WalletLockCheckPwdUI walletLockCheckPwdUI) {
        this.f178998a = walletLockCheckPwdUI;
    }

    @Override // com.tencent.mm.wallet_core.ui.m
    public void onVisibleStateChange(boolean z17) {
        this.f178998a.f178905d.post(new com.tencent.mm.plugin.wallet.pwd.ui.e1(this, z17));
    }
}
