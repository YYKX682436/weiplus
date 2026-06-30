package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes9.dex */
public class g3 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.WalletCardSelectUI f180284d;

    public g3(com.tencent.mm.plugin.wallet_core.ui.WalletCardSelectUI walletCardSelectUI) {
        this.f180284d = walletCardSelectUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        int i17;
        int i18;
        android.content.Intent intent = new android.content.Intent();
        com.tencent.mm.plugin.wallet_core.ui.WalletCardSelectUI walletCardSelectUI = this.f180284d;
        com.tencent.mm.plugin.wallet_core.model.ElementQuery elementQuery = (!walletCardSelectUI.f179964f.isChecked() || (i18 = walletCardSelectUI.f179969n) < 0) ? (!walletCardSelectUI.f179965g.isChecked() || (i17 = walletCardSelectUI.f179970o) < 0) ? null : (com.tencent.mm.plugin.wallet_core.model.ElementQuery) ((java.util.LinkedList) walletCardSelectUI.f179963e).get(i17) : (com.tencent.mm.plugin.wallet_core.model.ElementQuery) ((java.util.LinkedList) walletCardSelectUI.f179962d).get(i18);
        if (elementQuery != null) {
            intent.putExtra("elemt_query", elementQuery);
            walletCardSelectUI.setResult(-1, intent);
        } else {
            walletCardSelectUI.setResult(0);
        }
        walletCardSelectUI.finish();
        return true;
    }
}
