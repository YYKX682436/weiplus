package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes9.dex */
public class q8 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.model.Bankcard f180590d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.r8 f180591e;

    public q8(com.tencent.mm.plugin.wallet_core.ui.r8 r8Var, com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard) {
        this.f180591e = r8Var;
        this.f180590d = bankcard;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.wallet_core.ui.r8 r8Var = this.f180591e;
        r8Var.f180603d.getInput().putBoolean("key_balance_change_phone_need_confirm_phone", true);
        com.tencent.mm.plugin.wallet_core.ui.WalletSelectBankcardUI.U6(r8Var.f180603d, this.f180590d);
    }
}
