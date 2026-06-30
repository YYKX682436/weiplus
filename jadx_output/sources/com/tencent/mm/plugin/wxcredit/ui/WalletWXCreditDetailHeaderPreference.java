package com.tencent.mm.plugin.wxcredit.ui;

/* loaded from: classes.dex */
public class WalletWXCreditDetailHeaderPreference extends com.tencent.mm.ui.base.preference.Preference {
    public final android.view.LayoutInflater L;
    public android.widget.TextView M;
    public android.widget.TextView N;

    public WalletWXCreditDetailHeaderPreference(android.content.Context context) {
        this(context, null);
    }

    @Override // com.tencent.mm.ui.base.preference.Preference
    public void t(android.view.View view) {
        super.t(view);
        this.N = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.pfl);
        this.M = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.pfs);
    }

    @Override // com.tencent.mm.ui.base.preference.Preference
    public android.view.View u(android.view.ViewGroup viewGroup) {
        android.view.View u17 = super.u(viewGroup);
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) u17.findViewById(com.tencent.mm.R.id.cgi);
        viewGroup2.removeAllViews();
        this.L.inflate(com.tencent.mm.R.layout.d8s, viewGroup2);
        return u17;
    }

    public WalletWXCreditDetailHeaderPreference(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public WalletWXCreditDetailHeaderPreference(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.L = (android.view.LayoutInflater) context.getSystemService("layout_inflater");
        this.G = com.tencent.mm.R.layout.byv;
    }
}
