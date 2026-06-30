package ns4;

/* loaded from: classes8.dex */
public final class c1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinEncashView f339480d;

    public c1(com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinEncashView weCoinEncashView) {
        this.f339480d = weCoinEncashView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinEncashView weCoinEncashView = this.f339480d;
        android.widget.TextView textView = weCoinEncashView.f179149d;
        if (textView == null) {
            kotlin.jvm.internal.o.o("mEncashTitleTV");
            throw null;
        }
        textView.getLocationInWindow(iArr);
        android.widget.ScrollView scrollView = weCoinEncashView.f179153h;
        if (scrollView == null) {
            kotlin.jvm.internal.o.o("rootView");
            throw null;
        }
        scrollView.getLocationInWindow(iArr2);
        android.widget.ScrollView scrollView2 = weCoinEncashView.f179153h;
        if (scrollView2 != null) {
            scrollView2.scrollBy(0, iArr[1] - iArr2[1]);
        } else {
            kotlin.jvm.internal.o.o("rootView");
            throw null;
        }
    }
}
