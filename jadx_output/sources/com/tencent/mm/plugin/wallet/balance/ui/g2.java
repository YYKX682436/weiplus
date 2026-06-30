package com.tencent.mm.plugin.wallet.balance.ui;

/* loaded from: classes5.dex */
public class g2 implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.WalletSelectBankcardModeUI f177894d;

    public g2(com.tencent.mm.plugin.wallet.balance.ui.WalletSelectBankcardModeUI walletSelectBankcardModeUI) {
        this.f177894d = walletSelectBankcardModeUI;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet/balance/ui/WalletSelectBankcardModeUI$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        com.tencent.mm.plugin.wallet.balance.ui.WalletSelectBankcardModeUI walletSelectBankcardModeUI = this.f177894d;
        walletSelectBankcardModeUI.f177858i = i17;
        walletSelectBankcardModeUI.f177854e.notifyDataSetChanged();
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_select_index", i17);
        walletSelectBankcardModeUI.setResult(-1, intent);
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletSelectBankcardModeUI", "onItemClick pos is " + i17);
        walletSelectBankcardModeUI.finish();
        yj0.a.h(this, "com/tencent/mm/plugin/wallet/balance/ui/WalletSelectBankcardModeUI$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
