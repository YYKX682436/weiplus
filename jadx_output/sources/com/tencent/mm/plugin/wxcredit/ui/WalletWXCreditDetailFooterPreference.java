package com.tencent.mm.plugin.wxcredit.ui;

/* loaded from: classes.dex */
public class WalletWXCreditDetailFooterPreference extends com.tencent.mm.ui.base.preference.Preference implements android.view.View.OnClickListener {
    public final android.view.LayoutInflater L;
    public android.widget.TextView M;
    public android.widget.TextView N;
    public android.view.View.OnClickListener P;

    public WalletWXCreditDetailFooterPreference(android.content.Context context) {
        this(context, null);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wxcredit/ui/WalletWXCreditDetailFooterPreference", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.view.View.OnClickListener onClickListener = this.P;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/wxcredit/ui/WalletWXCreditDetailFooterPreference", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // com.tencent.mm.ui.base.preference.Preference
    public void t(android.view.View view) {
        super.t(view);
        this.M = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.pfm);
        this.N = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.pfk);
        this.M.setOnClickListener(this);
        this.N.setOnClickListener(this);
    }

    @Override // com.tencent.mm.ui.base.preference.Preference
    public android.view.View u(android.view.ViewGroup viewGroup) {
        android.view.View u17 = super.u(viewGroup);
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) u17.findViewById(com.tencent.mm.R.id.cgi);
        viewGroup2.removeAllViews();
        this.L.inflate(com.tencent.mm.R.layout.d8r, viewGroup2);
        return u17;
    }

    public WalletWXCreditDetailFooterPreference(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public WalletWXCreditDetailFooterPreference(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.L = (android.view.LayoutInflater) context.getSystemService("layout_inflater");
        this.G = com.tencent.mm.R.layout.byv;
    }
}
