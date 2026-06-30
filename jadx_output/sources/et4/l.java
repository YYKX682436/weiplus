package et4;

/* loaded from: classes9.dex */
public class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierDialog f256641d;

    public l(com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierDialog wcPayCashierDialog) {
        this.f256641d = wcPayCashierDialog;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierDialog wcPayCashierDialog = this.f256641d;
        wcPayCashierDialog.f180211q.sendAccessibilityEvent(128);
        android.widget.ImageView imageView = wcPayCashierDialog.f180201e;
        if (imageView != null) {
            imageView.setContentDescription(wcPayCashierDialog.getContext().getString(com.tencent.mm.R.string.b9a));
        }
    }
}
