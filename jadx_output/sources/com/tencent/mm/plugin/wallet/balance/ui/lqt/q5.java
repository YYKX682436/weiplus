package com.tencent.mm.plugin.wallet.balance.ui.lqt;

/* loaded from: classes9.dex */
public class q5 extends com.tencent.mm.plugin.wallet_core.ui.b4 {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.model.Bankcard f178339g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.lqt.s5 f178340h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q5(com.tencent.mm.plugin.wallet.balance.ui.lqt.s5 s5Var, android.content.Context context, com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard) {
        super(context);
        this.f178340h = s5Var;
        this.f178339g = bankcard;
    }

    @Override // com.tencent.mm.plugin.wallet_core.ui.b4, android.text.style.ClickableSpan
    public void onClick(android.view.View view) {
        java.lang.String str = this.f178339g.field_forbid_url;
        android.content.Intent intent = new android.content.Intent();
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletLqtSaveFetchUI", "go to url %s", str);
        intent.putExtra("rawUrl", str);
        intent.putExtra("geta8key_username", c01.z1.r());
        intent.putExtra("pay_channel", 1);
        com.tencent.mm.wallet_core.ui.r1.T(this.f178340h.f178368e.getContext(), intent);
    }
}
