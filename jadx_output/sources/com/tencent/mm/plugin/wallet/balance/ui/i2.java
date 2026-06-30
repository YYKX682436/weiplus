package com.tencent.mm.plugin.wallet.balance.ui;

/* loaded from: classes5.dex */
public class i2 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.WalletSelectBankcardModeUI f177904d;

    public i2(com.tencent.mm.plugin.wallet.balance.ui.WalletSelectBankcardModeUI walletSelectBankcardModeUI) {
        this.f177904d = walletSelectBankcardModeUI;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f177904d.f177857h.size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return (com.tencent.mm.plugin.wallet.balance.ui.h2) this.f177904d.f177857h.get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.tencent.mm.plugin.wallet.balance.ui.WalletSelectBankcardModeUI walletSelectBankcardModeUI = this.f177904d;
        android.view.View inflate = android.view.View.inflate(walletSelectBankcardModeUI, com.tencent.mm.R.layout.d89, null);
        com.tencent.mm.plugin.wallet.balance.ui.h2 h2Var = (com.tencent.mm.plugin.wallet.balance.ui.h2) walletSelectBankcardModeUI.f177857h.get(i17);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.aev);
        android.widget.TextView textView2 = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.aeu);
        android.widget.ImageView imageView = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.mki);
        textView.setText(h2Var.f177899a);
        if (android.text.TextUtils.isEmpty(h2Var.f177900b)) {
            textView2.setVisibility(8);
        } else {
            textView2.setVisibility(0);
            textView2.setText(h2Var.f177900b);
        }
        if (walletSelectBankcardModeUI.f177858i == i17) {
            imageView.setImageResource(com.tencent.mm.R.raw.radio_on);
        } else {
            imageView.setImageResource(com.tencent.mm.R.raw.radio_off);
        }
        return inflate;
    }
}
