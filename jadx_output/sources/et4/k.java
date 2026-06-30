package et4;

/* loaded from: classes9.dex */
public class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierDetailItemLayout f256639d;

    public k(com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierDetailItemLayout wcPayCashierDetailItemLayout) {
        this.f256639d = wcPayCashierDetailItemLayout;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierDetailItemLayout wcPayCashierDetailItemLayout = this.f256639d;
        android.text.Layout layout = wcPayCashierDetailItemLayout.f180193f.getLayout();
        if (layout == null || layout.getLineCount() <= 1) {
            return;
        }
        wcPayCashierDetailItemLayout.f180193f.setMaxWidth((int) layout.getLineWidth(0));
    }
}
