package com.tencent.mm.plugin.wallet_ecard.ui;

/* loaded from: classes2.dex */
public class n implements com.tencent.mm.plugin.wallet_core.ui.c7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.jo6 f181053a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_ecard.ui.WalletECardLogoutUI f181054b;

    public n(com.tencent.mm.plugin.wallet_ecard.ui.WalletECardLogoutUI walletECardLogoutUI, r45.jo6 jo6Var) {
        this.f181054b = walletECardLogoutUI;
        this.f181053a = jo6Var;
    }

    @Override // com.tencent.mm.plugin.wallet_core.ui.c7
    public void a(android.view.View view) {
        com.tencent.mm.wallet_core.ui.r1.V(this.f181054b.getContext(), this.f181053a.f377995e, false);
    }
}
