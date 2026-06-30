package ns4;

/* loaded from: classes8.dex */
public final class x0 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinEncashView f339675d;

    public x0(com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinEncashView weCoinEncashView) {
        this.f339675d = weCoinEncashView;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        java.lang.Boolean bool = (java.lang.Boolean) obj;
        java.lang.ref.WeakReference weakReference = com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinEncashView.f179148v;
        com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinEncashView weCoinEncashView = this.f339675d;
        weCoinEncashView.getClass();
        if (bool != null) {
            if (bool.booleanValue()) {
                weCoinEncashView.showLoading(true);
            } else {
                weCoinEncashView.hideLoading();
            }
        }
    }
}
