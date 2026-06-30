package e05;

/* loaded from: classes9.dex */
public class o extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wxcredit.ui.WalletWXCreditChangeAmountUI f246186d;

    public o(com.tencent.mm.plugin.wxcredit.ui.WalletWXCreditChangeAmountUI walletWXCreditChangeAmountUI) {
        this.f246186d = walletWXCreditChangeAmountUI;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        java.util.List list = this.f246186d.f188525e;
        if (list != null) {
            return ((java.util.ArrayList) list).size();
        }
        return 0;
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return (d05.l) ((java.util.ArrayList) this.f246186d.f188525e).get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.tencent.mm.plugin.wxcredit.ui.WalletWXCreditChangeAmountUI walletWXCreditChangeAmountUI = this.f246186d;
        android.widget.CheckedTextView checkedTextView = (android.widget.CheckedTextView) android.view.View.inflate(walletWXCreditChangeAmountUI, com.tencent.mm.R.layout.f489625d70, null);
        d05.l lVar = (d05.l) ((java.util.ArrayList) walletWXCreditChangeAmountUI.f188525e).get(i17);
        checkedTextView.setText(lVar.f225613e);
        checkedTextView.setChecked(lVar.f225609a != 0);
        return checkedTextView;
    }
}
