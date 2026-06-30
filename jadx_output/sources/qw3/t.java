package qw3;

/* loaded from: classes3.dex */
public class t implements android.widget.Filter.FilterListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitBankcardInputUI f367207d;

    public t(com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitBankcardInputUI bankRemitBankcardInputUI) {
        this.f367207d = bankRemitBankcardInputUI;
    }

    @Override // android.widget.Filter.FilterListener
    public void onFilterComplete(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.BankRemitBankcardInputUI", "filter complete: %d", java.lang.Integer.valueOf(i17));
        com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitBankcardInputUI bankRemitBankcardInputUI = this.f367207d;
        android.widget.ListView listView = bankRemitBankcardInputUI.f156486p;
        if (listView != null) {
            if (i17 <= 0) {
                if (i17 > 0 || listView.getVisibility() != 0) {
                    return;
                }
                bankRemitBankcardInputUI.f156486p.setVisibility(8);
                return;
            }
            if (i17 == 1) {
                android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) listView.getLayoutParams();
                layoutParams.height = i65.a.b(bankRemitBankcardInputUI.getContext(), 68);
                bankRemitBankcardInputUI.f156486p.setLayoutParams(layoutParams);
            } else {
                android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) listView.getLayoutParams();
                layoutParams2.height = i65.a.b(bankRemitBankcardInputUI.getContext(), 136);
                bankRemitBankcardInputUI.f156486p.setLayoutParams(layoutParams2);
            }
            bankRemitBankcardInputUI.f156486p.setVisibility(0);
        }
    }
}
