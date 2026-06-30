package ns4;

/* loaded from: classes8.dex */
public final class s2 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinRechargeView f339652d;

    public s2(com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinRechargeView weCoinRechargeView) {
        this.f339652d = weCoinRechargeView;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        java.lang.String str = (java.lang.String) obj;
        int i17 = com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinRechargeView.f179184w;
        com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinRechargeView weCoinRechargeView = this.f339652d;
        weCoinRechargeView.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.WeCoinRechargeView", "updateRightOptionMenu: [url] " + str);
        weCoinRechargeView.removeAllOptionMenu();
        if (str != null) {
            java.lang.String string = weCoinRechargeView.getString(com.tencent.mm.R.string.f493678l90);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            weCoinRechargeView.addTextOptionMenu(0, string, new ns4.m3(weCoinRechargeView, new ns4.n3(weCoinRechargeView, str)), null, com.tencent.mm.ui.fb.TRANSPARENT_BG_BLACK_TEXT);
        }
    }
}
