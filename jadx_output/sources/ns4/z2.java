package ns4;

/* loaded from: classes4.dex */
public final class z2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinRechargeView f339690d;

    public z2(com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinRechargeView weCoinRechargeView) {
        this.f339690d = weCoinRechargeView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinRechargeView$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinRechargeView.f179184w;
        com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinRechargeView weCoinRechargeView = this.f339690d;
        weCoinRechargeView.getClass();
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) weCoinRechargeView, 1, true);
        k0Var.q(weCoinRechargeView.getString(com.tencent.mm.R.string.f493683l95), 17);
        k0Var.f211872n = new ns4.c3(weCoinRechargeView);
        k0Var.f211879q = new ns4.d3(weCoinRechargeView);
        k0Var.e(false);
        k0Var.f211881s = new ns4.g3(weCoinRechargeView, weCoinRechargeView);
        k0Var.v();
        yj0.a.h(this, "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinRechargeView$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
