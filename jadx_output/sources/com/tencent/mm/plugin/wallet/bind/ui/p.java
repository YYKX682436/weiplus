package com.tencent.mm.plugin.wallet.bind.ui;

/* loaded from: classes3.dex */
public class p implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.bind.ui.q f178639d;

    public p(com.tencent.mm.plugin.wallet.bind.ui.q qVar) {
        this.f178639d = qVar;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletBankcardManageUI", "operType：%s", java.lang.Integer.valueOf(itemId));
        if (itemId != 0) {
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra(com.tencent.mm.ui.w2.f211205r, true);
        intent.putExtra("rawUrl", "https://payapp.weixin.qq.com/kfweb/helpcenter/dispatch?scene_code=CommIssueBankCard");
        com.tencent.mm.wallet_core.ui.r1.T(this.f178639d.f178640d.getContext(), intent);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14422, 3);
    }
}
