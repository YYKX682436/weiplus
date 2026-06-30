package com.tencent.mm.plugin.mall.ui;

/* loaded from: classes8.dex */
public class r0 implements db5.c1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.z67 f148473a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f148474b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mall.ui.s0 f148475c;

    public r0(com.tencent.mm.plugin.mall.ui.s0 s0Var, r45.z67 z67Var, boolean z17) {
        this.f148475c = s0Var;
        this.f148473a = z67Var;
        this.f148474b = z17;
    }

    @Override // db5.c1
    public void e(int i17) {
        r45.z67 z67Var = this.f148473a;
        int size = z67Var.f391755d.size();
        com.tencent.mm.plugin.mall.ui.s0 s0Var = this.f148475c;
        if (i17 < size) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", x51.j1.b(((r45.a77) z67Var.f391755d.get(i17)).f369810e));
            intent.putExtra(com.tencent.mm.ui.w2.f211205r, true);
            com.tencent.mm.wallet_core.ui.r1.T(s0Var.f148481d.getContext(), intent);
            return;
        }
        if (this.f148474b) {
            com.tencent.mm.plugin.mall.ui.MallIndexOSUIv2 mallIndexOSUIv2 = s0Var.f148481d;
            mallIndexOSUIv2.getClass();
            j45.l.m(mallIndexOSUIv2, "wallet_core", ".ui.WalletSwitchWalletCurrencyUI", 1);
        }
    }
}
