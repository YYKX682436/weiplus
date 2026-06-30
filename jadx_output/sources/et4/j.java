package et4;

/* loaded from: classes9.dex */
public class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierDetailItemLayout f256634d;

    public j(com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierDetailItemLayout wcPayCashierDetailItemLayout) {
        this.f256634d = wcPayCashierDetailItemLayout;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierDetailItemLayout wcPayCashierDetailItemLayout = this.f256634d;
        int width = wcPayCashierDetailItemLayout.f180191d.getWidth();
        if (wcPayCashierDetailItemLayout.f180192e.getVisibility() != 8) {
            width += com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierDetailItemLayout.f180189i;
        }
        if (wcPayCashierDetailItemLayout.f180194g.getVisibility() != 8) {
            width += com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierDetailItemLayout.f180190m;
        }
        wcPayCashierDetailItemLayout.f180193f.setMaxWidth(com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierDetailItemLayout.f180188h - width);
    }
}
