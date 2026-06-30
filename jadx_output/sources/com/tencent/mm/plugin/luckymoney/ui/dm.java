package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class dm implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f146849d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeUI f146850e;

    public dm(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeUI luckyMoneyPickEnvelopeUI, java.lang.String str) {
        this.f146850e = luckyMoneyPickEnvelopeUI;
        this.f146849d = str;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyPickEnvelopeUI", "[dealOpenExchangeUrl] click exchange tv");
        android.net.Uri.Builder buildUpon = android.net.Uri.parse(this.f146849d).buildUpon();
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeUI luckyMoneyPickEnvelopeUI = this.f146850e;
        buildUpon.appendQueryParameter(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID, luckyMoneyPickEnvelopeUI.f146515J);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", buildUpon.build().toString());
        intent.putExtra("showShare", false);
        intent.putExtra("KRightBtn", true);
        com.tencent.mm.wallet_core.ui.r1.U(luckyMoneyPickEnvelopeUI.getContext(), intent, 1);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(18892, 22, java.lang.Integer.valueOf(luckyMoneyPickEnvelopeUI.f146535w + 1), java.lang.Integer.valueOf(luckyMoneyPickEnvelopeUI.f146534v + 1), luckyMoneyPickEnvelopeUI.K, luckyMoneyPickEnvelopeUI.b7(), luckyMoneyPickEnvelopeUI.f146515J, java.lang.Integer.valueOf(luckyMoneyPickEnvelopeUI.f146524n.getItemCount() - 1), java.lang.Integer.valueOf(luckyMoneyPickEnvelopeUI.a7()), java.lang.Integer.valueOf(luckyMoneyPickEnvelopeUI.k7()), luckyMoneyPickEnvelopeUI.j7());
        return false;
    }
}
