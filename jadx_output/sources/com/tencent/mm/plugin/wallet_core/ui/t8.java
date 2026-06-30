package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes9.dex */
public class t8 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.WalletSelectBankcardUI f180629d;

    public t8(com.tencent.mm.plugin.wallet_core.ui.WalletSelectBankcardUI walletSelectBankcardUI, com.tencent.mm.plugin.wallet_core.ui.o8 o8Var) {
        this.f180629d = walletSelectBankcardUI;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        com.tencent.mm.plugin.wallet_core.ui.WalletSelectBankcardUI walletSelectBankcardUI = this.f180629d;
        if (walletSelectBankcardUI.f180093i) {
            java.util.List list = walletSelectBankcardUI.f180095n;
            if (list == null) {
                return 1;
            }
            return 1 + list.size();
        }
        java.util.List list2 = walletSelectBankcardUI.f180095n;
        if (list2 == null) {
            return 0;
        }
        return list2.size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        com.tencent.mm.plugin.wallet_core.ui.WalletSelectBankcardUI walletSelectBankcardUI = this.f180629d;
        java.util.List list = walletSelectBankcardUI.f180095n;
        if (list == null || list.size() <= i17) {
            return null;
        }
        return walletSelectBankcardUI.f180095n.get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.tencent.mm.plugin.wallet_core.ui.s8 s8Var;
        com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard = (com.tencent.mm.plugin.wallet_core.model.Bankcard) getItem(i17);
        if (view == null) {
            view = android.view.LayoutInflater.from(this.f180629d).inflate(com.tencent.mm.R.layout.d8_, viewGroup, false);
            s8Var = new com.tencent.mm.plugin.wallet_core.ui.s8(this);
            s8Var.f180618a = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.ae_);
            view.setTag(s8Var);
        } else {
            s8Var = (com.tencent.mm.plugin.wallet_core.ui.s8) view.getTag();
        }
        if (bankcard != null) {
            s8Var.f180618a.setText(bankcard.field_desc);
        } else {
            s8Var.f180618a.setText(com.tencent.mm.R.string.kz6);
        }
        return view;
    }
}
