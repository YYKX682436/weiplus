package v73;

/* loaded from: classes9.dex */
public class f0 implements com.tencent.mm.wallet_core.ui.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.honey_pay.ui.HoneyPayGiveCardUI f433688a;

    public f0(com.tencent.mm.plugin.honey_pay.ui.HoneyPayGiveCardUI honeyPayGiveCardUI) {
        this.f433688a = honeyPayGiveCardUI;
    }

    @Override // com.tencent.mm.wallet_core.ui.m
    public void onVisibleStateChange(boolean z17) {
        com.tencent.mm.plugin.honey_pay.ui.HoneyPayGiveCardUI honeyPayGiveCardUI = this.f433688a;
        if (z17) {
            honeyPayGiveCardUI.scrollToFormEditPosAfterShowTenPay(honeyPayGiveCardUI.f142316f, honeyPayGiveCardUI.f142321n, 10);
            return;
        }
        honeyPayGiveCardUI.f142316f.scrollTo(0, 0);
        honeyPayGiveCardUI.f142317g.e();
        if (com.tencent.mm.sdk.platformtools.t8.K0(honeyPayGiveCardUI.f142317g.getText())) {
            honeyPayGiveCardUI.f142317g.setVisibility(8);
            honeyPayGiveCardUI.f142322o.setVisibility(0);
            honeyPayGiveCardUI.W6(false);
            honeyPayGiveCardUI.X6(false);
        }
    }
}
