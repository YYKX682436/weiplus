package qw3;

/* loaded from: classes9.dex */
public class t1 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitSelectPayeeUI f367209d;

    public t1(com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitSelectPayeeUI bankRemitSelectPayeeUI, qw3.m1 m1Var) {
        this.f367209d = bankRemitSelectPayeeUI;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitSelectPayeeUI bankRemitSelectPayeeUI = this.f367209d;
        int size = ((java.util.ArrayList) bankRemitSelectPayeeUI.f156542h).size();
        if (bankRemitSelectPayeeUI.f156545n > -1) {
            size++;
        }
        return bankRemitSelectPayeeUI.f156546o > -1 ? size + 1 : size;
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        int i18;
        com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitSelectPayeeUI bankRemitSelectPayeeUI = this.f367209d;
        int i19 = bankRemitSelectPayeeUI.f156545n;
        if (i17 == i19 || i17 == (i18 = bankRemitSelectPayeeUI.f156546o)) {
            return null;
        }
        if (i17 < i18) {
            return ((java.util.ArrayList) bankRemitSelectPayeeUI.f156542h).get(i17 - 1);
        }
        if ((i18 > -1) && i17 > i18) {
            return i19 > -1 ? ((java.util.ArrayList) bankRemitSelectPayeeUI.f156542h).get(i17 - 2) : ((java.util.ArrayList) bankRemitSelectPayeeUI.f156542h).get(i17 - 1);
        }
        if (i19 > -1) {
            return ((java.util.ArrayList) bankRemitSelectPayeeUI.f156542h).get(i17 - 1);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.BankRemitSelectPayeeUI", "maybe wrong pos: [%s,%s,%s]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(bankRemitSelectPayeeUI.f156545n), java.lang.Integer.valueOf(bankRemitSelectPayeeUI.f156546o));
        return null;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i17) {
        com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitSelectPayeeUI bankRemitSelectPayeeUI = this.f367209d;
        return (i17 == bankRemitSelectPayeeUI.f156545n || i17 == bankRemitSelectPayeeUI.f156546o) ? 0 : 1;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        int itemViewType = getItemViewType(i17);
        com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitSelectPayeeUI bankRemitSelectPayeeUI = this.f367209d;
        if (view == null) {
            if (itemViewType == 0) {
                view = android.view.LayoutInflater.from(bankRemitSelectPayeeUI.getContext()).inflate(com.tencent.mm.R.layout.f488188jy, viewGroup, false);
            } else {
                view = android.view.LayoutInflater.from(bankRemitSelectPayeeUI.getContext()).inflate(com.tencent.mm.R.layout.f488189jz, viewGroup, false);
                qw3.s1 s1Var = new qw3.s1(bankRemitSelectPayeeUI, null);
                s1Var.f367203a = (com.tencent.mm.pluginsdk.ui.applet.CdnImageView) view.findViewById(com.tencent.mm.R.id.az9);
                s1Var.f367204b = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.azb);
                s1Var.f367205c = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.az_);
                view.setTag(s1Var);
            }
        }
        if (itemViewType == 0) {
            android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.az8);
            if (bankRemitSelectPayeeUI.f156545n == i17) {
                textView.setText(com.tencent.mm.R.string.aey);
            } else {
                if (bankRemitSelectPayeeUI.f156546o == i17) {
                    textView.setText(com.tencent.mm.R.string.aew);
                } else {
                    textView.setText("");
                    com.tencent.mars.xlog.Log.w("MicroMsg.BankRemitSelectPayeeUI", "wrong header pos: %s", java.lang.Integer.valueOf(i17));
                }
            }
        } else if (itemViewType != 1) {
            com.tencent.mars.xlog.Log.w("MicroMsg.BankRemitSelectPayeeUI", "unknown type: %d", java.lang.Integer.valueOf(itemViewType));
        } else {
            qw3.s1 s1Var2 = (qw3.s1) view.getTag();
            com.tencent.mm.plugin.remittance.bankcard.model.TransferRecordParcel transferRecordParcel = (com.tencent.mm.plugin.remittance.bankcard.model.TransferRecordParcel) getItem(i17);
            if (transferRecordParcel != null) {
                s1Var2.f367203a.b(transferRecordParcel.f156472f, 0, 0, com.tencent.mm.R.color.a9e);
                boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(transferRecordParcel.f156476m);
                com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitSelectPayeeUI bankRemitSelectPayeeUI2 = s1Var2.f367206d;
                java.lang.String str = transferRecordParcel.f156475i;
                if (K0) {
                    s1Var2.f367204b.setText(str);
                } else {
                    le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                    androidx.appcompat.app.AppCompatActivity context = bankRemitSelectPayeeUI2.getContext();
                    java.lang.String string = bankRemitSelectPayeeUI2.getContext().getString(com.tencent.mm.R.string.aev, str, transferRecordParcel.f156476m);
                    ((ke0.e) xVar).getClass();
                    s1Var2.f367204b.setText(com.tencent.mm.pluginsdk.ui.span.c0.i(context, string));
                }
                s1Var2.f367205c.setText(bankRemitSelectPayeeUI2.getString(com.tencent.mm.R.string.aev, transferRecordParcel.f156473g, transferRecordParcel.f156471e));
            } else {
                s1Var2.f367203a.setImageResource(com.tencent.mm.R.color.a9e);
                s1Var2.f367204b.setText("");
                s1Var2.f367205c.setText("");
                com.tencent.mars.xlog.Log.w("MicroMsg.BankRemitSelectPayeeUI", "empty record");
            }
        }
        return view;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return 2;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean isEnabled(int i17) {
        com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitSelectPayeeUI bankRemitSelectPayeeUI = this.f367209d;
        return (i17 == bankRemitSelectPayeeUI.f156545n || i17 == bankRemitSelectPayeeUI.f156546o) ? false : true;
    }
}
