package v73;

/* loaded from: classes9.dex */
public class b0 extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.honey_pay.ui.HoneyPayGiveCardUI f433673d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(com.tencent.mm.plugin.honey_pay.ui.HoneyPayGiveCardUI honeyPayGiveCardUI) {
        super(false);
        this.f433673d = honeyPayGiveCardUI;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        com.tencent.mm.plugin.honey_pay.ui.HoneyPayGiveCardUI honeyPayGiveCardUI = this.f433673d;
        honeyPayGiveCardUI.f142322o.setVisibility(8);
        honeyPayGiveCardUI.f142317g.setVisibility(0);
        honeyPayGiveCardUI.f142317g.q(honeyPayGiveCardUI);
    }
}
