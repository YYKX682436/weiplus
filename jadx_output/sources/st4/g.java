package st4;

/* loaded from: classes9.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public boolean f412615a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f412616b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f412617c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_payu.bind.ui.WalletPayUCardElementUI f412618d;

    public g(com.tencent.mm.plugin.wallet_payu.bind.ui.WalletPayUCardElementUI walletPayUCardElementUI) {
        this.f412618d = walletPayUCardElementUI;
    }

    public void a() {
        boolean z17;
        com.tencent.mm.plugin.wallet_payu.bind.ui.WalletPayUCardElementUI walletPayUCardElementUI = this.f412618d;
        this.f412615a = walletPayUCardElementUI.f181233d.n();
        this.f412616b = walletPayUCardElementUI.f181234e.n();
        boolean n17 = walletPayUCardElementUI.f181235f.n();
        this.f412617c = n17;
        if (!walletPayUCardElementUI.f181241o || n17) {
            walletPayUCardElementUI.f181237h.setVisibility(4);
        } else {
            walletPayUCardElementUI.f181237h.setVisibility(0);
            walletPayUCardElementUI.f181237h.setText(com.tencent.mm.R.string.khq);
        }
        if (walletPayUCardElementUI.f181240n) {
            if (!this.f412615a) {
                walletPayUCardElementUI.f181236g.setVisibility(0);
                walletPayUCardElementUI.f181236g.setTextColor(walletPayUCardElementUI.getResources().getColor(com.tencent.mm.R.color.a2y));
                walletPayUCardElementUI.f181236g.setText(com.tencent.mm.R.string.kh9);
            } else {
                if (!walletPayUCardElementUI.f181242p.containsKey(walletPayUCardElementUI.f181233d.getText()) || walletPayUCardElementUI.f181243q.contains(walletPayUCardElementUI.f181233d.getText())) {
                    walletPayUCardElementUI.doSceneProgress(new rt4.b(walletPayUCardElementUI.f181233d.getText()), false);
                    walletPayUCardElementUI.f181243q.add(walletPayUCardElementUI.f181233d.getText());
                    walletPayUCardElementUI.f181236g.setVisibility(0);
                    walletPayUCardElementUI.f181236g.setTextColor(walletPayUCardElementUI.getResources().getColor(com.tencent.mm.R.color.f479232tk));
                    walletPayUCardElementUI.f181236g.setText(walletPayUCardElementUI.getString(com.tencent.mm.R.string.kgp));
                    z17 = true;
                    if (this.f412615a || !this.f412616b || !this.f412617c || z17) {
                        walletPayUCardElementUI.f181238i.setEnabled(false);
                    } else {
                        walletPayUCardElementUI.f181238i.setEnabled(true);
                        return;
                    }
                }
                com.tencent.mm.plugin.wallet_payu.bind.model.NetScenePayUElementQuery$PayUBankcardElement netScenePayUElementQuery$PayUBankcardElement = (com.tencent.mm.plugin.wallet_payu.bind.model.NetScenePayUElementQuery$PayUBankcardElement) walletPayUCardElementUI.f181242p.get(walletPayUCardElementUI.f181233d.getText());
                walletPayUCardElementUI.f181236g.setVisibility(0);
                if (com.tencent.mm.sdk.platformtools.t8.K0(netScenePayUElementQuery$PayUBankcardElement.f181228d)) {
                    walletPayUCardElementUI.f181236g.setTextColor(walletPayUCardElementUI.getResources().getColor(com.tencent.mm.R.color.a2y));
                    walletPayUCardElementUI.f181236g.setText(netScenePayUElementQuery$PayUBankcardElement.f181230f);
                    this.f412615a = false;
                } else {
                    walletPayUCardElementUI.f181236g.setTextColor(walletPayUCardElementUI.getResources().getColor(com.tencent.mm.R.color.f479232tk));
                    walletPayUCardElementUI.f181236g.setText(netScenePayUElementQuery$PayUBankcardElement.f181230f);
                }
            }
        }
        z17 = false;
        if (this.f412615a) {
        }
        walletPayUCardElementUI.f181238i.setEnabled(false);
    }
}
