package com.tencent.mm.plugin.wallet.balance.ui;

/* loaded from: classes9.dex */
public class m implements com.tencent.mm.plugin.wallet_core.ui.c7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.model.Bankcard f178476a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchUI f178477b;

    public m(com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchUI walletBalanceFetchUI, com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard) {
        this.f178477b = walletBalanceFetchUI;
        this.f178476a = bankcard;
    }

    @Override // com.tencent.mm.plugin.wallet_core.ui.c7
    public void a(android.view.View view) {
        com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard = this.f178476a;
        if (com.tencent.mm.sdk.platformtools.t8.K0(bankcard.field_prompt_info_jump_url)) {
            return;
        }
        com.tencent.mm.wallet_core.ui.r1.V(this.f178477b.getContext(), bankcard.field_prompt_info_jump_url, true);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(20216, 4, bankcard.field_prompt_info_jump_url);
    }
}
