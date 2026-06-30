package e05;

/* loaded from: classes9.dex */
public class e extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wxcredit.ui.WalletWXCreditChangeAmountUI f246176d;

    public e(com.tencent.mm.plugin.wxcredit.ui.WalletWXCreditChangeAmountUI walletWXCreditChangeAmountUI) {
        this.f246176d = walletWXCreditChangeAmountUI;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return 2;
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return (d05.l) ((java.util.ArrayList) this.f246176d.f188525e).get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.tencent.mm.plugin.wxcredit.ui.WalletWXCreditChangeAmountUI walletWXCreditChangeAmountUI = this.f246176d;
        android.widget.CheckedTextView checkedTextView = (android.widget.CheckedTextView) android.view.View.inflate(walletWXCreditChangeAmountUI, com.tencent.mm.R.layout.f489625d70, null);
        if (i17 == 0) {
            checkedTextView.setText(com.tencent.mm.R.string.f490608zu);
        } else {
            checkedTextView.setText(com.tencent.mm.R.string.f490503wx);
        }
        if (walletWXCreditChangeAmountUI.f188530m) {
            d05.l lVar = walletWXCreditChangeAmountUI.f188526f;
            if (lVar.f225616h == null || !"Y".equals(lVar.f225611c)) {
                checkedTextView.setChecked(i17 != 0);
            } else {
                checkedTextView.setChecked(i17 == 0);
            }
        } else {
            d05.l lVar2 = walletWXCreditChangeAmountUI.f188527g;
            if (lVar2.f225616h == null || !"Y".equals(lVar2.f225611c)) {
                checkedTextView.setChecked(i17 != 0);
            } else {
                checkedTextView.setChecked(i17 == 0);
            }
        }
        return checkedTextView;
    }
}
