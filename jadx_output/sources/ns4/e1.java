package ns4;

/* loaded from: classes8.dex */
public final class e1 implements com.tencent.mm.wallet_core.ui.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinEncashView f339509a;

    public e1(com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinEncashView weCoinEncashView) {
        this.f339509a = weCoinEncashView;
    }

    @Override // com.tencent.mm.wallet_core.ui.m
    public final void onVisibleStateChange(boolean z17) {
        com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinEncashView weCoinEncashView = this.f339509a;
        if (z17) {
            android.widget.ScrollView scrollView = weCoinEncashView.f179153h;
            if (scrollView != null) {
                scrollView.postDelayed(new ns4.c1(weCoinEncashView), 100L);
                return;
            } else {
                kotlin.jvm.internal.o.o("rootView");
                throw null;
            }
        }
        android.widget.ScrollView scrollView2 = weCoinEncashView.f179153h;
        if (scrollView2 != null) {
            scrollView2.scrollTo(0, 0);
        } else {
            kotlin.jvm.internal.o.o("rootView");
            throw null;
        }
    }
}
