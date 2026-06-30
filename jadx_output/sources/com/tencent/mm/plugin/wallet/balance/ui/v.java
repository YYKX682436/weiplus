package com.tencent.mm.plugin.wallet.balance.ui;

/* loaded from: classes9.dex */
public class v extends com.tencent.mm.plugin.wallet_core.ui.b4 {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.model.Bankcard f178517g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.w f178518h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(com.tencent.mm.plugin.wallet.balance.ui.w wVar, android.content.Context context, com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard) {
        super(context);
        this.f178518h = wVar;
        this.f178517g = bankcard;
    }

    @Override // com.tencent.mm.plugin.wallet_core.ui.b4, android.text.style.ClickableSpan
    public void onClick(android.view.View view) {
        android.content.Intent intent = new android.content.Intent();
        java.lang.String str = this.f178517g.field_forbid_url;
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletBalanceFetchUI", "go to url %s", str);
        intent.putExtra("rawUrl", str);
        intent.putExtra("geta8key_username", c01.z1.r());
        intent.putExtra("pay_channel", 1);
        com.tencent.mm.wallet_core.ui.r1.T(this.f178518h.f178523f.getContext(), intent);
    }
}
