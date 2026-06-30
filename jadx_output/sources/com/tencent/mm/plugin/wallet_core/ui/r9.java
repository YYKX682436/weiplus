package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes8.dex */
public class r9 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f180604d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.WalletVerifyCodeUI f180605e;

    public r9(com.tencent.mm.plugin.wallet_core.ui.WalletVerifyCodeUI walletVerifyCodeUI, java.lang.String str) {
        this.f180605e = walletVerifyCodeUI;
        this.f180604d = str;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.wallet_core.ui.r1.V(this.f180605e.getContext(), this.f180604d, false);
        return true;
    }
}
