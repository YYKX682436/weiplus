package com.tencent.mm.plugin.wallet.bind.ui;

/* loaded from: classes9.dex */
public class j implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.bind.ui.WalletBankcardDetailUI f178633d;

    public j(com.tencent.mm.plugin.wallet.bind.ui.WalletBankcardDetailUI walletBankcardDetailUI) {
        this.f178633d = walletBankcardDetailUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        java.util.ArrayList h17 = vr4.f1.wi().Ai().h();
        com.tencent.mm.plugin.wallet.bind.ui.WalletBankcardDetailUI walletBankcardDetailUI = this.f178633d;
        if (h17 != null && h17.size() > 1) {
            at4.x1 Ai = vr4.f1.wi().Ai();
            java.lang.String str = walletBankcardDetailUI.f178541d.field_bindSerial;
            Ai.getClass();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        db5.e1.h(this.f178633d, null, (java.lang.String[]) arrayList.toArray(new java.lang.String[arrayList.size()]), walletBankcardDetailUI.getString(com.tencent.mm.R.string.f493536kn2), false, new com.tencent.mm.plugin.wallet.bind.ui.i(this));
        return true;
    }
}
