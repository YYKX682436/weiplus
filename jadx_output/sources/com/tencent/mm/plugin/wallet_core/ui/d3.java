package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes9.dex */
public class d3 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.WalletCardImportUI f180234d;

    public d3(com.tencent.mm.plugin.wallet_core.ui.WalletCardImportUI walletCardImportUI) {
        this.f180234d = walletCardImportUI;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        com.tencent.mm.plugin.wallet_core.ui.WalletCardImportUI walletCardImportUI = this.f180234d;
        if (walletCardImportUI.f179960z.a() != null) {
            return walletCardImportUI.f179960z.a().size();
        }
        return 0;
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return (java.lang.Integer) this.f180234d.f179960z.a().get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        android.widget.CheckedTextView checkedTextView = (android.widget.CheckedTextView) android.view.View.inflate(this.f180234d, com.tencent.mm.R.layout.f489625d70, null);
        at4.b1 b1Var = ((pg0.a3) i95.n0.c(pg0.a3.class)).f353953d;
        com.tencent.mm.plugin.wallet_core.ui.WalletCardImportUI walletCardImportUI = this.f180234d;
        checkedTextView.setText(b1Var.b(walletCardImportUI, ((java.lang.Integer) walletCardImportUI.f179960z.a().get(i17)).intValue()));
        com.tencent.mm.plugin.wallet_core.ui.WalletCardImportUI walletCardImportUI2 = this.f180234d;
        if (walletCardImportUI2.f179940J == ((java.lang.Integer) walletCardImportUI2.f179960z.a().get(i17)).intValue()) {
            checkedTextView.setChecked(true);
        } else {
            checkedTextView.setChecked(false);
        }
        checkedTextView.setBackgroundResource(com.tencent.mm.R.drawable.f481306q2);
        return checkedTextView;
    }
}
