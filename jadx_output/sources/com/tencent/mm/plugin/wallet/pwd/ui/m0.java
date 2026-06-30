package com.tencent.mm.plugin.wallet.pwd.ui;

/* loaded from: classes9.dex */
public class m0 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f179033d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.List f179034e = new java.util.ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.pwd.ui.WalletForgotPwdUI f179035f;

    public m0(com.tencent.mm.plugin.wallet.pwd.ui.WalletForgotPwdUI walletForgotPwdUI, android.content.Context context) {
        this.f179035f = walletForgotPwdUI;
        this.f179033d = context;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f179034e.size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        if (i17 < 0 || i17 > this.f179034e.size() - 1) {
            return null;
        }
        return (com.tencent.mm.plugin.wallet_core.model.Bankcard) this.f179034e.get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard = null;
        android.content.Context context = this.f179033d;
        com.tencent.mm.wallet_core.ui.formview.WalletFormView walletFormView = view == null ? (com.tencent.mm.wallet_core.ui.formview.WalletFormView) android.view.View.inflate(context, com.tencent.mm.R.layout.d5c, null) : (com.tencent.mm.wallet_core.ui.formview.WalletFormView) view;
        if (i17 >= 0 && i17 <= this.f179034e.size() - 1) {
            bankcard = (com.tencent.mm.plugin.wallet_core.model.Bankcard) this.f179034e.get(i17);
        }
        if (bankcard != null) {
            java.lang.String str = bankcard.field_desc;
            if (bankcard.field_bankcardState == 1) {
                str = str + context.getString(com.tencent.mm.R.string.f493532km4);
            }
            walletFormView.setText(str);
        }
        walletFormView.setOnClickListener(new com.tencent.mm.plugin.wallet.pwd.ui.l0(this, bankcard));
        return walletFormView;
    }
}
