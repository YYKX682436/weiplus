package com.tencent.mm.plugin.mall.ui;

/* loaded from: classes8.dex */
public class j0 implements db5.c1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.z67 f148413a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f148414b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mall.ui.k0 f148415c;

    public j0(com.tencent.mm.plugin.mall.ui.k0 k0Var, r45.z67 z67Var, boolean z17) {
        this.f148415c = k0Var;
        this.f148413a = z67Var;
        this.f148414b = z17;
    }

    @Override // db5.c1
    public void e(int i17) {
        r45.z67 z67Var = this.f148413a;
        int size = z67Var.f391755d.size();
        com.tencent.mm.plugin.mall.ui.k0 k0Var = this.f148415c;
        if (i17 < size) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", x51.j1.b(((r45.a77) z67Var.f391755d.get(i17)).f369810e));
            intent.putExtra(com.tencent.mm.ui.w2.f211205r, true);
            com.tencent.mm.wallet_core.ui.r1.T(k0Var.f148425d.getContext(), intent);
            return;
        }
        if (this.f148414b) {
            com.tencent.mm.plugin.mall.ui.MallIndexOSUI mallIndexOSUI = k0Var.f148425d;
            mallIndexOSUI.getClass();
            j45.l.m(mallIndexOSUI, "wallet_core", ".ui.WalletSwitchWalletCurrencyUI", 1);
        }
    }
}
