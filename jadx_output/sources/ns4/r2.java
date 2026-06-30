package ns4;

/* loaded from: classes8.dex */
public final class r2 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinRechargeView f339634d;

    public r2(com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinRechargeView weCoinRechargeView) {
        this.f339634d = weCoinRechargeView;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        java.lang.Long l17 = (java.lang.Long) obj;
        int i17 = com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinRechargeView.f179184w;
        com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinRechargeView weCoinRechargeView = this.f339634d;
        weCoinRechargeView.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.WeCoinRechargeView", "updateTotalBalance: [blance] " + l17);
        android.widget.TextView textView = weCoinRechargeView.f179187f;
        if (textView == null) {
            kotlin.jvm.internal.o.o("mNoBalanceTipsTv");
            throw null;
        }
        textView.setVisibility(0);
        android.widget.LinearLayout linearLayout = weCoinRechargeView.f179186e;
        if (linearLayout == null) {
            kotlin.jvm.internal.o.o("mTotalBalanceLl");
            throw null;
        }
        linearLayout.setVisibility(8);
        long longValue = l17 != null ? l17.longValue() : 0L;
        if (longValue > 0) {
            android.widget.TextView textView2 = weCoinRechargeView.f179195q;
            if (textView2 == null) {
                kotlin.jvm.internal.o.o("mWeCoinBalanceView");
                throw null;
            }
            textView2.setText("" + longValue);
            android.widget.TextView textView3 = weCoinRechargeView.f179187f;
            if (textView3 == null) {
                kotlin.jvm.internal.o.o("mNoBalanceTipsTv");
                throw null;
            }
            textView3.setVisibility(8);
            android.widget.LinearLayout linearLayout2 = weCoinRechargeView.f179186e;
            if (linearLayout2 != null) {
                linearLayout2.setVisibility(0);
            } else {
                kotlin.jvm.internal.o.o("mTotalBalanceLl");
                throw null;
            }
        }
    }
}
