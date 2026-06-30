package ns4;

/* loaded from: classes8.dex */
public final class t2 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinRechargeView f339657d;

    public t2(com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinRechargeView weCoinRechargeView) {
        this.f339657d = weCoinRechargeView;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        java.lang.String str = (java.lang.String) obj;
        int i17 = com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinRechargeView.f179184w;
        com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinRechargeView weCoinRechargeView = this.f339657d;
        weCoinRechargeView.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.WeCoinRechargeView", "updateFaqView: [url] " + str);
        if (str != null) {
            android.widget.LinearLayout linearLayout = weCoinRechargeView.f179189h;
            if (linearLayout != null) {
                linearLayout.setOnClickListener(new ns4.j3(weCoinRechargeView, str));
            } else {
                kotlin.jvm.internal.o.o("mFaqLinearLayout");
                throw null;
            }
        }
    }
}
