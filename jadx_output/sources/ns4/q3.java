package ns4;

/* loaded from: classes8.dex */
public final class q3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinRechargeView f339625d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.i50 f339626e;

    public q3(com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinRechargeView weCoinRechargeView, r45.i50 i50Var) {
        this.f339625d = weCoinRechargeView;
        this.f339626e = i50Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinRechargeView$updateTopBannerView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinRechargeView weCoinRechargeView = this.f339625d;
        ms4.o0 o0Var = weCoinRechargeView.f179185d;
        if (o0Var == null) {
            kotlin.jvm.internal.o.o("mViewModel");
            throw null;
        }
        o0Var.O6(3);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", this.f339626e.f376739e);
        com.tencent.mm.wallet_core.ui.r1.T(weCoinRechargeView, intent);
        yj0.a.h(this, "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinRechargeView$updateTopBannerView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
