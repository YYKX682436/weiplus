package v73;

/* loaded from: classes9.dex */
public class e0 implements android.view.View.OnFocusChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.honey_pay.ui.HoneyPayGiveCardUI f433685d;

    public e0(com.tencent.mm.plugin.honey_pay.ui.HoneyPayGiveCardUI honeyPayGiveCardUI) {
        this.f433685d = honeyPayGiveCardUI;
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(android.view.View view, boolean z17) {
        if (z17) {
            return;
        }
        com.tencent.mm.plugin.honey_pay.ui.HoneyPayGiveCardUI honeyPayGiveCardUI = this.f433685d;
        honeyPayGiveCardUI.f142331x = honeyPayGiveCardUI.f142325r.getText().toString();
        honeyPayGiveCardUI.Y6();
    }
}
