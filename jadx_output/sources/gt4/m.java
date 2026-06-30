package gt4;

/* loaded from: classes9.dex */
public class m implements fb5.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.view.BankCardSelectSortView f275468a;

    public m(com.tencent.mm.plugin.wallet_core.ui.view.BankCardSelectSortView bankCardSelectSortView) {
        this.f275468a = bankCardSelectSortView;
    }

    @Override // fb5.l
    public android.view.View a(fb5.n nVar, android.view.View view, android.view.ViewGroup viewGroup, int i17, int i18, boolean z17, boolean z18) {
        com.tencent.mm.plugin.wallet_core.ui.view.BankCardSelectSortView bankCardSelectSortView = this.f275468a;
        android.content.Context context = bankCardSelectSortView.getContext();
        if (view == null) {
            view = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.f488191k1, (android.view.ViewGroup) null);
            view.setImportantForAccessibility(2);
            gt4.o oVar = new gt4.o(null);
            oVar.f275479b = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.bdd);
            oVar.f275480c = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.az6);
            oVar.f275478a = (com.tencent.mm.pluginsdk.ui.applet.CdnImageView) view.findViewById(com.tencent.mm.R.id.f483474az5);
            view.setTag(oVar);
        }
        gt4.o oVar2 = (gt4.o) view.getTag();
        if (bankCardSelectSortView.f197872p && z17) {
            oVar2.f275479b.setText(nVar.f260897a);
            oVar2.f275479b.setContentDescription(bankCardSelectSortView.getContext().getString(com.tencent.mm.R.string.kgj, nVar.f260897a));
            oVar2.f275479b.setVisibility(0);
        } else {
            oVar2.f275479b.setVisibility(8);
        }
        gt4.n nVar2 = (gt4.n) nVar.f260898b;
        oVar2.f275480c.setText(nVar2.f275473c);
        if (com.tencent.mm.sdk.platformtools.t8.K0(nVar2.f275471a)) {
            oVar2.f275478a.setImageBitmap(null);
        } else {
            oVar2.f275478a.setUseSdcardCache(true);
            oVar2.f275478a.c(nVar2.f275471a, -1, 0, 0, nVar2.f275472b);
        }
        return view;
    }
}
