package com.tencent.mm.plugin.wallet.balance.ui;

/* loaded from: classes9.dex */
public class j implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.k f177905d;

    public j(com.tencent.mm.plugin.wallet.balance.ui.k kVar) {
        this.f177905d = kVar;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        com.tencent.mm.plugin.wallet.balance.ui.k kVar = this.f177905d;
        at4.e[] eVarArr = kVar.f177908d.f13842j.f13815a;
        if (eVarArr == null || itemId >= eVarArr.length) {
            return;
        }
        at4.e eVar = eVarArr[itemId];
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletBalanceFetchUI", "jump type: %s, url: %s", java.lang.Integer.valueOf(eVar.f13827c), eVar.f13828d);
        int i18 = eVar.f13827c;
        if (i18 == 1) {
            com.tencent.mm.wallet_core.ui.r1.V(kVar.f177909e.getContext(), eVar.f13828d, true);
        } else {
            if (i18 != 2) {
                return;
            }
            com.tencent.mm.wallet_core.ui.r1.b0(eVar.f13829e, eVar.f13830f, 0, 1000);
        }
    }
}
