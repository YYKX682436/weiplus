package qw3;

/* loaded from: classes9.dex */
public class u1 implements fb5.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitSortView f367213a;

    public u1(com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitSortView bankRemitSortView) {
        this.f367213a = bankRemitSortView;
    }

    @Override // fb5.l
    public android.view.View a(fb5.n nVar, android.view.View view, android.view.ViewGroup viewGroup, int i17, int i18, boolean z17, boolean z18) {
        com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitSortView bankRemitSortView = this.f367213a;
        android.content.Context context = bankRemitSortView.getContext();
        if (view == null) {
            view = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.f488191k1, (android.view.ViewGroup) null);
            qw3.v1 v1Var = new qw3.v1(bankRemitSortView, null);
            v1Var.f367217b = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.bdd);
            v1Var.f367218c = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.az6);
            v1Var.f367216a = (com.tencent.mm.pluginsdk.ui.applet.CdnImageView) view.findViewById(com.tencent.mm.R.id.f483474az5);
            view.setTag(v1Var);
        }
        qw3.v1 v1Var2 = (qw3.v1) view.getTag();
        r45.qd qdVar = (r45.qd) nVar.f260898b;
        if (qdVar != null) {
            if (bankRemitSortView.f197872p && z17) {
                if (nVar.f260897a.equals("☆")) {
                    v1Var2.f367217b.setText(com.tencent.mm.R.string.aes);
                } else {
                    v1Var2.f367217b.setText(nVar.f260897a);
                }
                v1Var2.f367217b.setVisibility(0);
            } else {
                v1Var2.f367217b.setVisibility(8);
            }
            v1Var2.f367216a.setUseSdcardCache(true);
            com.tencent.mm.pluginsdk.ui.applet.CdnImageView cdnImageView = v1Var2.f367216a;
            java.lang.String str = qdVar.f383840f;
            cdnImageView.c(str, -1, 0, 0, dt4.b.a(str));
            v1Var2.f367218c.setText(qdVar.f383839e);
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.BankcardSortView", "elem is null: %s", java.lang.Integer.valueOf(i17));
        }
        return view;
    }
}
