package qw3;

/* loaded from: classes9.dex */
public class a0 implements android.widget.TextView.OnEditorActionListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitBankcardInputUI f367138d;

    public a0(com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitBankcardInputUI bankRemitBankcardInputUI) {
        this.f367138d = bankRemitBankcardInputUI;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public boolean onEditorAction(android.widget.TextView textView, int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 5) {
            return false;
        }
        com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitBankcardInputUI bankRemitBankcardInputUI = this.f367138d;
        bankRemitBankcardInputUI.hideVKB();
        if (bankRemitBankcardInputUI.f156477J) {
            return false;
        }
        com.tencent.mm.sdk.platformtools.u3.i(new qw3.z(this), 200L);
        return false;
    }
}
