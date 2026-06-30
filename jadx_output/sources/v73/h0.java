package v73;

/* loaded from: classes9.dex */
public class h0 implements com.tencent.mm.plugin.wallet_core.ui.c7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.honey_pay.ui.HoneyPayGiveCardUI f433695a;

    public h0(com.tencent.mm.plugin.honey_pay.ui.HoneyPayGiveCardUI honeyPayGiveCardUI) {
        this.f433695a = honeyPayGiveCardUI;
    }

    @Override // com.tencent.mm.plugin.wallet_core.ui.c7
    public void a(android.view.View view) {
        com.tencent.mm.plugin.honey_pay.ui.HoneyPayGiveCardUI honeyPayGiveCardUI = this.f433695a;
        honeyPayGiveCardUI.hideTenpayKB();
        honeyPayGiveCardUI.f142323p.setVisibility(8);
        honeyPayGiveCardUI.f142325r.setVisibility(0);
        honeyPayGiveCardUI.f142325r.requestFocus();
        honeyPayGiveCardUI.showVKB();
    }
}
