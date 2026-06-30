package gt4;

/* loaded from: classes5.dex */
public class y1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.view.WalletSuccPageAwardWidget f275577d;

    public y1(com.tencent.mm.plugin.wallet_core.ui.view.WalletSuccPageAwardWidget walletSuccPageAwardWidget) {
        this.f275577d = walletSuccPageAwardWidget;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.wallet_core.ui.view.WalletSuccPageAwardWidget walletSuccPageAwardWidget = this.f275577d;
        if (walletSuccPageAwardWidget.f180740o.getHeight() != walletSuccPageAwardWidget.getHeight()) {
            android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) walletSuccPageAwardWidget.f180740o.getLayoutParams();
            layoutParams.width = walletSuccPageAwardWidget.f180736h.getWidth();
            layoutParams.height = walletSuccPageAwardWidget.f180736h.getHeight() - i65.a.b(walletSuccPageAwardWidget.getContext(), 2);
            layoutParams.topMargin = i65.a.b(walletSuccPageAwardWidget.getContext(), 1);
            layoutParams.bottomMargin = i65.a.b(walletSuccPageAwardWidget.getContext(), 1);
            walletSuccPageAwardWidget.f180740o.setLayoutParams(layoutParams);
        }
    }
}
