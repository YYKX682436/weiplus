package ns4;

/* loaded from: classes8.dex */
public final class l3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinRechargeView f339587d;

    public l3(com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinRechargeView weCoinRechargeView) {
        this.f339587d = weCoinRechargeView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        boolean z17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinRechargeView$updateRechargeButtonState$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        long j17 = os4.h.f348279a;
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (android.os.SystemClock.elapsedRealtime() - j17 < 600) {
            z17 = true;
        } else {
            os4.h.f348279a = android.os.SystemClock.elapsedRealtime();
            z17 = false;
        }
        if (!z17) {
            com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinRechargeView weCoinRechargeView = this.f339587d;
            ms4.o0 o0Var = weCoinRechargeView.f179185d;
            if (o0Var == null) {
                kotlin.jvm.internal.o.o("mViewModel");
                throw null;
            }
            o0Var.O6(4);
            com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinRechargeView.T6(weCoinRechargeView);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinRechargeView$updateRechargeButtonState$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
