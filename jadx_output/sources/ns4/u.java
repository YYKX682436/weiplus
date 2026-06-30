package ns4;

/* loaded from: classes8.dex */
public final class u implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinBalanceDetailView f339659d;

    public u(com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinBalanceDetailView weCoinBalanceDetailView) {
        this.f339659d = weCoinBalanceDetailView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinBalanceDetailView$updateData$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinBalanceDetailView.f179139o;
        com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinBalanceDetailView weCoinBalanceDetailView = this.f339659d;
        weCoinBalanceDetailView.T6(22);
        weCoinBalanceDetailView.finish();
        yj0.a.h(this, "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinBalanceDetailView$updateData$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
