package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes.dex */
public class r6 implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoOldUI f180601d;

    public r6(com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoOldUI walletOrderInfoOldUI) {
        this.f180601d = walletOrderInfoOldUI;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View view) {
        com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoOldUI walletOrderInfoOldUI = this.f180601d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet_core/ui/WalletOrderInfoOldUI$9", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        if (view.getId() == com.tencent.mm.R.id.pdg || view.getId() == com.tencent.mm.R.id.pe9) {
            try {
                java.lang.String str = (java.lang.String) view.getTag();
                dp.a.makeText(walletOrderInfoOldUI, com.tencent.mm.R.string.f493572ks2, 0).show();
                com.tencent.mm.sdk.platformtools.b0.d(walletOrderInfoOldUI.getContext(), str, str, null);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WalletOrderInfoOldUI", e17, "", new java.lang.Object[0]);
            }
        }
        yj0.a.i(true, this, "com/tencent/mm/plugin/wallet_core/ui/WalletOrderInfoOldUI$9", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
