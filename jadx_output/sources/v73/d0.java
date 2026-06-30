package v73;

/* loaded from: classes9.dex */
public class d0 implements android.widget.TextView.OnEditorActionListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.honey_pay.ui.HoneyPayGiveCardUI f433682d;

    public d0(com.tencent.mm.plugin.honey_pay.ui.HoneyPayGiveCardUI honeyPayGiveCardUI) {
        this.f433682d = honeyPayGiveCardUI;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public boolean onEditorAction(android.widget.TextView textView, int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 6 && i17 != 5) {
            return false;
        }
        com.tencent.mm.plugin.honey_pay.ui.HoneyPayGiveCardUI honeyPayGiveCardUI = this.f433682d;
        honeyPayGiveCardUI.f142331x = honeyPayGiveCardUI.f142325r.getText().toString();
        honeyPayGiveCardUI.hideVKB();
        honeyPayGiveCardUI.Y6();
        return false;
    }
}
