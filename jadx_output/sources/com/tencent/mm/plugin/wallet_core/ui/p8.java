package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes9.dex */
public class p8 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.model.Bankcard f180575d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.r8 f180576e;

    public p8(com.tencent.mm.plugin.wallet_core.ui.r8 r8Var, com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard) {
        this.f180576e = r8Var;
        this.f180575d = bankcard;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.wallet_core.ui.r8 r8Var = this.f180576e;
        r8Var.f180603d.getInput().putBoolean("key_balance_change_phone_need_confirm_phone", false);
        com.tencent.mm.plugin.wallet_core.ui.WalletSelectBankcardUI.U6(r8Var.f180603d, this.f180575d);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11977, 0, 0, 0, 0, 1, 0);
    }
}
