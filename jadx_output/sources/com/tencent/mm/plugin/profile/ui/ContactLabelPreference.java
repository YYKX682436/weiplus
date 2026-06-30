package com.tencent.mm.plugin.profile.ui;

/* loaded from: classes3.dex */
public class ContactLabelPreference extends com.tencent.mm.ui.base.preference.Preference {
    public com.tencent.mm.ui.base.MMSingelLinePanel L;
    public android.widget.TextView M;
    public final java.util.ArrayList N;

    public ContactLabelPreference(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    @Override // com.tencent.mm.ui.base.preference.Preference
    public void t(android.view.View view) {
        java.util.ArrayList arrayList;
        this.M = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.obc);
        com.tencent.mm.ui.base.MMSingelLinePanel mMSingelLinePanel = (com.tencent.mm.ui.base.MMSingelLinePanel) view.findViewById(com.tencent.mm.R.id.cee);
        this.L = mMSingelLinePanel;
        mMSingelLinePanel.setSingleLine(true);
        com.tencent.mm.ui.base.MMSingelLinePanel mMSingelLinePanel2 = this.L;
        mMSingelLinePanel2.f197581m = false;
        mMSingelLinePanel2.k(false);
        android.widget.TextView textView = this.M;
        if (textView != null) {
            textView.setText((java.lang.CharSequence) null);
        }
        if (this.L != null && (arrayList = this.N) != null && arrayList.size() > 0) {
            this.L.r(arrayList, arrayList);
        }
        super.t(view);
    }

    @Override // com.tencent.mm.ui.base.preference.Preference
    public android.view.View u(android.view.ViewGroup viewGroup) {
        android.view.View u17 = super.u(viewGroup);
        android.view.LayoutInflater layoutInflater = (android.view.LayoutInflater) this.f197770d.getSystemService("layout_inflater");
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) u17.findViewById(com.tencent.mm.R.id.cgi);
        viewGroup2.removeAllViews();
        layoutInflater.inflate(com.tencent.mm.R.layout.bzm, viewGroup2);
        return u17;
    }

    public ContactLabelPreference(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.N = new java.util.ArrayList();
        this.G = com.tencent.mm.R.layout.byv;
    }
}
