package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes9.dex */
public class l3 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f180400d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.List f180401e = new java.util.ArrayList();

    public l3(com.tencent.mm.plugin.wallet_core.ui.WalletCardSelectUI walletCardSelectUI, android.content.Context context) {
        this.f180400d = context;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f180401e.size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return (com.tencent.mm.plugin.wallet_core.model.ElementQuery) this.f180401e.get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        android.view.View inflate = android.view.View.inflate(this.f180400d, com.tencent.mm.R.layout.d5e, null);
        android.widget.CheckedTextView checkedTextView = (android.widget.CheckedTextView) inflate.findViewById(com.tencent.mm.R.id.bt_);
        com.tencent.mm.plugin.wallet_core.model.ElementQuery elementQuery = (com.tencent.mm.plugin.wallet_core.model.ElementQuery) this.f180401e.get(i17);
        java.lang.String str = elementQuery.f179648e;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(elementQuery.f179665y)) {
            checkedTextView.setEnabled(true);
        } else {
            str = str + "[" + elementQuery.f179665y + "]";
            checkedTextView.setEnabled(false);
        }
        checkedTextView.setText(str);
        return inflate;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean isEnabled(int i17) {
        return com.tencent.mm.sdk.platformtools.t8.K0(((com.tencent.mm.plugin.wallet_core.model.ElementQuery) this.f180401e.get(i17)).f179665y);
    }
}
