package e05;

/* loaded from: classes8.dex */
public class z implements android.widget.CompoundButton.OnCheckedChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wxcredit.ui.WalletWXCreditOpenUI f246197a;

    public z(com.tencent.mm.plugin.wxcredit.ui.WalletWXCreditOpenUI walletWXCreditOpenUI) {
        this.f246197a = walletWXCreditOpenUI;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z17) {
        this.f246197a.f188554d.setEnabled(z17);
    }
}
